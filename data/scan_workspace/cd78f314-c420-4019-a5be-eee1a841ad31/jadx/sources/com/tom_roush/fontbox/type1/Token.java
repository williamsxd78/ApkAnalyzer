package com.tom_roush.fontbox.type1;

import com.vivaaerobus.app.analytics.presentation.AnalyticsConstants;

/* loaded from: classes3.dex */
class Token {
    private byte[] data;
    private final Kind kind;
    private String text;
    static final Kind STRING = Kind.STRING;
    static final Kind NAME = Kind.NAME;
    static final Kind LITERAL = Kind.LITERAL;
    static final Kind REAL = Kind.REAL;
    static final Kind INTEGER = Kind.INTEGER;
    static final Kind START_ARRAY = Kind.START_ARRAY;
    static final Kind END_ARRAY = Kind.END_ARRAY;
    static final Kind START_PROC = Kind.START_PROC;
    static final Kind END_PROC = Kind.END_PROC;
    static final Kind CHARSTRING = Kind.CHARSTRING;
    static final Kind START_DICT = Kind.START_DICT;
    static final Kind END_DICT = Kind.END_DICT;

    /* loaded from: classes3.dex */
    enum Kind {
        NONE,
        STRING,
        NAME,
        LITERAL,
        REAL,
        INTEGER,
        START_ARRAY,
        END_ARRAY,
        START_PROC,
        END_PROC,
        START_DICT,
        END_DICT,
        CHARSTRING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Token(char c, Kind kind) {
        this.text = Character.toString(c);
        this.kind = kind;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Token(String str, Kind kind) {
        this.text = str;
        this.kind = kind;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Token(byte[] bArr, Kind kind) {
        this.data = bArr;
        this.kind = kind;
    }

    public boolean booleanValue() {
        return this.text.equals(AnalyticsConstants.TRUE_VALUE);
    }

    public float floatValue() {
        return Float.parseFloat(this.text);
    }

    public byte[] getData() {
        return this.data;
    }

    public Kind getKind() {
        return this.kind;
    }

    public String getText() {
        return this.text;
    }

    public int intValue() {
        return (int) Float.parseFloat(this.text);
    }

    public String toString() {
        if (this.kind == CHARSTRING) {
            return "Token[kind=CHARSTRING, data=" + this.data.length + " bytes]";
        }
        return "Token[kind=" + this.kind + ", text=" + this.text + "]";
    }
}
