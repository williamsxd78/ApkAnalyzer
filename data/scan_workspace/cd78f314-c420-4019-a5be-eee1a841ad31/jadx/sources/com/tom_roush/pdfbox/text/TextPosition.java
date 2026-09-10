package com.tom_roush.pdfbox.text;

import android.util.Log;
import com.airbnb.paris.R2;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.util.Matrix;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class TextPosition {
    private static final Map<Integer, String> DIACRITICS = createDiacritics();
    private final int[] charCodes;
    private float direction = -1.0f;
    private final float endX;
    private final float endY;
    private final PDFont font;
    private final float fontSize;
    private final int fontSizePt;
    private final float maxHeight;
    private final float pageHeight;
    private final float pageWidth;
    private final int rotation;
    private final Matrix textMatrix;
    private String unicode;
    private final float widthOfSpace;
    private float[] widths;
    private final float x;
    private final float y;

    public TextPosition(int i, float f, float f2, Matrix matrix, float f3, float f4, float f5, float f6, float f7, String str, int[] iArr, PDFont pDFont, float f8, int i2) {
        this.textMatrix = matrix;
        this.endX = f3;
        this.endY = f4;
        this.rotation = i;
        this.maxHeight = f5;
        this.pageHeight = f2;
        this.pageWidth = f;
        this.widths = new float[]{f6};
        this.widthOfSpace = f7;
        this.unicode = str;
        this.charCodes = iArr;
        this.font = pDFont;
        this.fontSize = f8;
        this.fontSizePt = i2;
        this.x = getXRot(i);
        if (i == 0 || i == 180) {
            this.y = f2 - getYLowerLeftRot(i);
        } else {
            this.y = f - getYLowerLeftRot(i);
        }
    }

    private String combineDiacritic(String str) {
        int codePointAt = str.codePointAt(0);
        Map<Integer, String> map = DIACRITICS;
        return map.containsKey(Integer.valueOf(codePointAt)) ? map.get(Integer.valueOf(codePointAt)) : Normalizer.normalize(str, Normalizer.Form.NFKC).trim();
    }

    private static Map<Integer, String> createDiacritics() {
        HashMap hashMap = new HashMap(31);
        hashMap.put(96, "̀");
        hashMap.put(Integer.valueOf(R2.id.radio), "̀");
        hashMap.put(39, "́");
        hashMap.put(Integer.valueOf(R2.id.italic), "́");
        hashMap.put(Integer.valueOf(R2.id.progress_horizontal), "́");
        hashMap.put(94, "̂");
        hashMap.put(Integer.valueOf(R2.id.on), "̂");
        hashMap.put(126, "̃");
        hashMap.put(Integer.valueOf(R2.id.progress_circular), "̄");
        hashMap.put(176, "̊");
        hashMap.put(Integer.valueOf(R2.id.line1), "̋");
        hashMap.put(Integer.valueOf(R2.id.parentPanel), "̌");
        hashMap.put(Integer.valueOf(R2.id.paris_tag_view_style), "̍");
        hashMap.put(34, "̎");
        hashMap.put(Integer.valueOf(R2.id.line3), "̒");
        hashMap.put(700, "̓");
        hashMap.put(Integer.valueOf(R2.style.Widget_AppCompat_Light_Spinner_DropDown_ActionBar), "̓");
        hashMap.put(Integer.valueOf(R2.styleable.AppCompatTheme_radioButtonStyle), "̓");
        hashMap.put(701, "̔");
        hashMap.put(Integer.valueOf(R2.style.Widget_AppCompat_Light_SearchView), "̔");
        hashMap.put(Integer.valueOf(R2.styleable.AppCompatTheme_popupWindowStyle), "̔");
        hashMap.put(Integer.valueOf(R2.id.search_button), "̝");
        hashMap.put(Integer.valueOf(R2.id.search_close_btn), "̞");
        hashMap.put(Integer.valueOf(R2.id.search_edit_frame), "̟");
        hashMap.put(Integer.valueOf(R2.id.search_go_btn), "̠");
        hashMap.put(Integer.valueOf(R2.id.forever), "̡");
        hashMap.put(Integer.valueOf(R2.id.right_icon), "̩");
        hashMap.put(Integer.valueOf(R2.id.image), "̫");
        hashMap.put(Integer.valueOf(R2.id.right_side), "̱");
        hashMap.put(95, "̲");
        hashMap.put(8270, "͙");
        return hashMap;
    }

    private float getWidthRot(float f) {
        return (f == 90.0f || f == 270.0f) ? Math.abs(this.endY - this.textMatrix.getTranslateY()) : Math.abs(this.endX - this.textMatrix.getTranslateX());
    }

    private float getXRot(float f) {
        float f2;
        float translateY;
        if (f == 0.0f) {
            return this.textMatrix.getTranslateX();
        }
        if (f == 90.0f) {
            return this.textMatrix.getTranslateY();
        }
        if (f == 180.0f) {
            f2 = this.pageWidth;
            translateY = this.textMatrix.getTranslateX();
        } else {
            if (f != 270.0f) {
                return 0.0f;
            }
            f2 = this.pageHeight;
            translateY = this.textMatrix.getTranslateY();
        }
        return f2 - translateY;
    }

    private float getYLowerLeftRot(float f) {
        float f2;
        float translateY;
        if (f == 0.0f) {
            return this.textMatrix.getTranslateY();
        }
        if (f == 90.0f) {
            f2 = this.pageWidth;
            translateY = this.textMatrix.getTranslateX();
        } else {
            if (f != 180.0f) {
                if (f == 270.0f) {
                    return this.textMatrix.getTranslateX();
                }
                return 0.0f;
            }
            f2 = this.pageHeight;
            translateY = this.textMatrix.getTranslateY();
        }
        return f2 - translateY;
    }

    private void insertDiacritic(int i, TextPosition textPosition) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.unicode, 0, i);
        float[] fArr = this.widths;
        float[] fArr2 = new float[fArr.length + 1];
        System.arraycopy(fArr, 0, fArr2, 0, i);
        sb.append(this.unicode.charAt(i));
        fArr2[i] = this.widths[i];
        sb.append(combineDiacritic(textPosition.getUnicode()));
        int i2 = i + 1;
        fArr2[i2] = 0.0f;
        sb.append(this.unicode.substring(i2));
        System.arraycopy(this.widths, i2, fArr2, i + 2, (r1.length - i) - 1);
        this.unicode = sb.toString();
        this.widths = fArr2;
    }

    public boolean contains(TextPosition textPosition) {
        double xDirAdj = getXDirAdj();
        double widthDirAdj = getWidthDirAdj();
        double d = xDirAdj + widthDirAdj;
        double xDirAdj2 = textPosition.getXDirAdj();
        double widthDirAdj2 = textPosition.getWidthDirAdj() + xDirAdj2;
        if (widthDirAdj2 <= xDirAdj || xDirAdj2 >= d) {
            return false;
        }
        double yDirAdj = getYDirAdj();
        double yDirAdj2 = textPosition.getYDirAdj();
        if (textPosition.getHeightDir() + yDirAdj2 < yDirAdj || yDirAdj2 > yDirAdj + getHeightDir()) {
            return false;
        }
        return (xDirAdj2 <= xDirAdj || widthDirAdj2 <= d) ? xDirAdj2 >= xDirAdj || widthDirAdj2 >= d || (widthDirAdj2 - xDirAdj) / widthDirAdj > 0.15d : (d - xDirAdj2) / widthDirAdj > 0.15d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextPosition)) {
            return false;
        }
        TextPosition textPosition = (TextPosition) obj;
        if (Float.compare(textPosition.endX, this.endX) != 0 || Float.compare(textPosition.endY, this.endY) != 0 || Float.compare(textPosition.maxHeight, this.maxHeight) != 0 || this.rotation != textPosition.rotation || Float.compare(textPosition.x, this.x) != 0 || Float.compare(textPosition.y, this.y) != 0 || Float.compare(textPosition.pageHeight, this.pageHeight) != 0 || Float.compare(textPosition.pageWidth, this.pageWidth) != 0 || Float.compare(textPosition.widthOfSpace, this.widthOfSpace) != 0 || Float.compare(textPosition.fontSize, this.fontSize) != 0 || this.fontSizePt != textPosition.fontSizePt) {
            return false;
        }
        Matrix matrix = this.textMatrix;
        if (matrix == null ? textPosition.textMatrix != null : !matrix.equals(textPosition.textMatrix)) {
            return false;
        }
        if (!Arrays.equals(this.charCodes, textPosition.charCodes)) {
            return false;
        }
        PDFont pDFont = this.font;
        return pDFont != null ? pDFont.equals(textPosition.font) : textPosition.font == null;
    }

    public int[] getCharacterCodes() {
        return this.charCodes;
    }

    public float getDir() {
        if (this.direction < 0.0f) {
            float scaleY = this.textMatrix.getScaleY();
            float shearY = this.textMatrix.getShearY();
            float shearX = this.textMatrix.getShearX();
            float scaleX = this.textMatrix.getScaleX();
            if (scaleY > 0.0f && Math.abs(shearY) < scaleX && Math.abs(shearX) < scaleY && scaleX > 0.0f) {
                this.direction = 0.0f;
            } else if (scaleY < 0.0f && Math.abs(shearY) < Math.abs(scaleX) && Math.abs(shearX) < Math.abs(scaleY) && scaleX < 0.0f) {
                this.direction = 180.0f;
            } else if (Math.abs(scaleY) < Math.abs(shearX) && shearY > 0.0f && shearX < 0.0f && Math.abs(scaleX) < shearY) {
                this.direction = 90.0f;
            } else if (Math.abs(scaleY) >= shearX || shearY >= 0.0f || shearX <= 0.0f || Math.abs(scaleX) >= Math.abs(shearY)) {
                this.direction = 0.0f;
            } else {
                this.direction = 270.0f;
            }
        }
        return this.direction;
    }

    public float getEndX() {
        return this.endX;
    }

    public float getEndY() {
        return this.endY;
    }

    public PDFont getFont() {
        return this.font;
    }

    public float getFontSize() {
        return this.fontSize;
    }

    public float getFontSizeInPt() {
        return this.fontSizePt;
    }

    public float getHeight() {
        return this.maxHeight;
    }

    public float getHeightDir() {
        return this.maxHeight;
    }

    public float[] getIndividualWidths() {
        return this.widths;
    }

    public float getPageHeight() {
        return this.pageHeight;
    }

    public float getPageWidth() {
        return this.pageWidth;
    }

    public int getRotation() {
        return this.rotation;
    }

    public Matrix getTextMatrix() {
        return this.textMatrix;
    }

    public String getUnicode() {
        return this.unicode;
    }

    public float getWidth() {
        return getWidthRot(this.rotation);
    }

    public float getWidthDirAdj() {
        return getWidthRot(getDir());
    }

    public float getWidthOfSpace() {
        return this.widthOfSpace;
    }

    public float getX() {
        return this.x;
    }

    public float getXDirAdj() {
        return getXRot(getDir());
    }

    public float getXScale() {
        return this.textMatrix.getScalingFactorX();
    }

    public float getY() {
        return this.y;
    }

    public float getYDirAdj() {
        float f;
        float yLowerLeftRot;
        float dir = getDir();
        if (dir == 0.0f || dir == 180.0f) {
            f = this.pageHeight;
            yLowerLeftRot = getYLowerLeftRot(dir);
        } else {
            f = this.pageWidth;
            yLowerLeftRot = getYLowerLeftRot(dir);
        }
        return f - yLowerLeftRot;
    }

    public float getYScale() {
        return this.textMatrix.getScalingFactorY();
    }

    public int hashCode() {
        Matrix matrix = this.textMatrix;
        int hashCode = (((((((((((((((((((((matrix != null ? matrix.hashCode() : 0) * 31) + Float.floatToIntBits(this.endX)) * 31) + Float.floatToIntBits(this.endY)) * 31) + Float.floatToIntBits(this.maxHeight)) * 31) + this.rotation) * 31) + Float.floatToIntBits(this.x)) * 31) + Float.floatToIntBits(this.y)) * 31) + Float.floatToIntBits(this.pageHeight)) * 31) + Float.floatToIntBits(this.pageWidth)) * 31) + Float.floatToIntBits(this.widthOfSpace)) * 31) + Arrays.hashCode(this.charCodes)) * 31;
        PDFont pDFont = this.font;
        return ((((hashCode + (pDFont != null ? pDFont.hashCode() : 0)) * 31) + Float.floatToIntBits(this.fontSize)) * 31) + this.fontSizePt;
    }

    public boolean isDiacritic() {
        String unicode = getUnicode();
        if (unicode.length() != 1 || "ー".equals(unicode)) {
            return false;
        }
        int type = Character.getType(unicode.charAt(0));
        return type == 6 || type == 27 || type == 4;
    }

    public void mergeDiacritic(TextPosition textPosition) {
        if (textPosition.getUnicode().length() > 1) {
            return;
        }
        float xDirAdj = textPosition.getXDirAdj();
        float f = textPosition.widths[0] + xDirAdj;
        float xDirAdj2 = getXDirAdj();
        int length = this.unicode.length();
        float f2 = xDirAdj2;
        boolean z = false;
        for (int i = 0; i < length && !z; i++) {
            float[] fArr = this.widths;
            if (i >= fArr.length) {
                Log.i("PdfBox-Android", "diacritic " + textPosition.getUnicode() + " on ligature " + this.unicode + " is not supported yet and is ignored (PDFBOX-2831)");
                return;
            }
            float f3 = fArr[i];
            float f4 = f2 + f3;
            if (xDirAdj >= f2 || f > f4) {
                if (xDirAdj < f2) {
                    insertDiacritic(i, textPosition);
                } else if (f <= f4) {
                    insertDiacritic(i, textPosition);
                } else if (i == length - 1) {
                    insertDiacritic(i, textPosition);
                } else {
                    f2 += this.widths[i];
                }
            } else if (i == 0) {
                insertDiacritic(i, textPosition);
            } else {
                int i2 = i - 1;
                if ((f - f2) / f3 >= (f2 - xDirAdj) / fArr[i2]) {
                    insertDiacritic(i, textPosition);
                } else {
                    insertDiacritic(i2, textPosition);
                }
            }
            z = true;
            f2 += this.widths[i];
        }
    }

    public String toString() {
        return getUnicode();
    }
}
