package com.tom_roush.fontbox.type1;

import android.util.Log;
import com.tom_roush.fontbox.type1.Token;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
class Type1Lexer {
    private final ByteBuffer buffer;
    private int openParens = 0;
    private Token aheadToken = readToken(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    public Type1Lexer(byte[] bArr) throws IOException {
        this.buffer = ByteBuffer.wrap(bArr);
    }

    private char getChar() throws IOException {
        try {
            return (char) this.buffer.get();
        } catch (BufferUnderflowException unused) {
            throw new IOException("Premature end of buffer reached");
        }
    }

    private Token readCharString(int i) throws IOException {
        try {
            this.buffer.get();
            byte[] bArr = new byte[i];
            this.buffer.get(bArr);
            return new Token(bArr, Token.CHARSTRING);
        } catch (BufferUnderflowException unused) {
            throw new IOException("Premature end of buffer reached");
        }
    }

    private String readComment() throws IOException {
        char c;
        StringBuilder sb = new StringBuilder();
        while (this.buffer.hasRemaining() && (c = getChar()) != '\r' && c != '\n') {
            sb.append(c);
        }
        return sb.toString();
    }

    private String readRegular() throws IOException {
        StringBuilder sb = new StringBuilder();
        while (this.buffer.hasRemaining()) {
            this.buffer.mark();
            char c = getChar();
            if (Character.isWhitespace(c) || c == '(' || c == ')' || c == '<' || c == '>' || c == '[' || c == ']' || c == '{' || c == '}' || c == '/' || c == '%') {
                this.buffer.reset();
                break;
            }
            sb.append(c);
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    private Token readString() throws IOException {
        StringBuilder sb = new StringBuilder();
        while (this.buffer.hasRemaining()) {
            char c = getChar();
            if (c == '\n' || c == '\r') {
                sb.append("\n");
            } else if (c == '\\') {
                char c2 = getChar();
                if (c2 == '(') {
                    sb.append('(');
                } else if (c2 == ')') {
                    sb.append(')');
                } else if (c2 == '\\') {
                    sb.append(AbstractJsonLexerKt.STRING_ESC);
                } else if (c2 == 'b') {
                    sb.append('\b');
                } else if (c2 == 'f') {
                    sb.append('\f');
                } else if (c2 == 'n' || c2 == 'r') {
                    sb.append("\n");
                } else if (c2 == 't') {
                    sb.append('\t');
                }
                if (Character.isDigit(c2)) {
                    try {
                        sb.append((char) Integer.parseInt(String.valueOf(new char[]{c2, getChar(), getChar()}), 8));
                    } catch (NumberFormatException e) {
                        throw new IOException(e);
                    }
                } else {
                    continue;
                }
            } else if (c == '(') {
                this.openParens++;
                sb.append('(');
            } else if (c != ')') {
                sb.append(c);
            } else {
                if (this.openParens == 0) {
                    return new Token(sb.toString(), Token.STRING);
                }
                sb.append(')');
                this.openParens--;
            }
        }
        return null;
    }

    private Token readToken(Token token) throws IOException {
        boolean z;
        do {
            z = false;
            while (this.buffer.hasRemaining()) {
                char c = getChar();
                if (c == '%') {
                    readComment();
                } else {
                    if (c == '(') {
                        return readString();
                    }
                    if (c == ')') {
                        throw new IOException("unexpected closing parenthesis");
                    }
                    if (c == '[') {
                        return new Token(c, Token.START_ARRAY);
                    }
                    if (c == '{') {
                        return new Token(c, Token.START_PROC);
                    }
                    if (c == ']') {
                        return new Token(c, Token.END_ARRAY);
                    }
                    if (c == '}') {
                        return new Token(c, Token.END_PROC);
                    }
                    if (c == '/') {
                        String readRegular = readRegular();
                        if (readRegular != null) {
                            return new Token(readRegular, Token.LITERAL);
                        }
                        throw new DamagedFontException("Could not read token at position " + this.buffer.position());
                    }
                    if (c == '<') {
                        if (getChar() == c) {
                            return new Token("<<", Token.START_DICT);
                        }
                        ByteBuffer byteBuffer = this.buffer;
                        byteBuffer.position(byteBuffer.position() - 1);
                        return new Token(c, Token.NAME);
                    }
                    if (c == '>') {
                        if (getChar() == c) {
                            return new Token(">>", Token.END_DICT);
                        }
                        ByteBuffer byteBuffer2 = this.buffer;
                        byteBuffer2.position(byteBuffer2.position() - 1);
                        return new Token(c, Token.NAME);
                    }
                    if (!Character.isWhitespace(c)) {
                        if (c != 0) {
                            ByteBuffer byteBuffer3 = this.buffer;
                            byteBuffer3.position(byteBuffer3.position() - 1);
                            Token tryReadNumber = tryReadNumber();
                            if (tryReadNumber != null) {
                                return tryReadNumber;
                            }
                            String readRegular2 = readRegular();
                            if (readRegular2 == null) {
                                throw new DamagedFontException("Could not read token at position " + this.buffer.position());
                            }
                            if (!readRegular2.equals("RD") && !readRegular2.equals("-|")) {
                                return new Token(readRegular2, Token.NAME);
                            }
                            if (token == null || token.getKind() != Token.INTEGER) {
                                throw new IOException("expected INTEGER before -| or RD");
                            }
                            return readCharString(token.intValue());
                        }
                        Log.w("PdfBox-Android", "NULL byte in font, skipped");
                    }
                    z = true;
                }
            }
        } while (z);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0094 A[LOOP:1: B:17:0x008e->B:19:0x0094, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.tom_roush.fontbox.type1.Token tryReadNumber() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.fontbox.type1.Type1Lexer.tryReadNumber():com.tom_roush.fontbox.type1.Token");
    }

    public Token nextToken() throws IOException {
        Token token = this.aheadToken;
        this.aheadToken = readToken(token);
        return token;
    }

    public boolean peekKind(Token.Kind kind) {
        Token token = this.aheadToken;
        return token != null && token.getKind() == kind;
    }

    public Token peekToken() {
        return this.aheadToken;
    }
}
