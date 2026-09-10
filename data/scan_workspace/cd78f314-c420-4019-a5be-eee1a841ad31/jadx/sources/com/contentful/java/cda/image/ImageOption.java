package com.contentful.java.cda.image;

import androidx.webkit.ProxyConfig;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Locale;
import jslYAf.TifYXe;

/* loaded from: classes13.dex */
public class ImageOption {
    private final String argument;
    private final String operation;

    /* loaded from: classes13.dex */
    public enum Focus {
        top,
        left,
        right,
        bottom,
        top_left,
        top_right,
        bottom_left,
        bottom_right,
        face,
        faces
    }

    /* loaded from: classes13.dex */
    public enum Format {
        jpg,
        png,
        png8("png&fl=png8"),
        webp;

        final String override;

        Format() {
            this.override = null;
        }

        Format(String str) {
            this.override = str;
        }

        public String toUrlParameter() {
            String str = this.override;
            return str == null ? super.name() : str;
        }
    }

    /* loaded from: classes13.dex */
    public enum Resize {
        pad,
        crop,
        fill,
        thumb,
        scale
    }

    private ImageOption(String str, String str2) {
        this.operation = str;
        this.argument = str2;
    }

    public static ImageOption backgroundColorOf(int i) {
        if (i < 0 || i > 16777215) {
            throw new IllegalArgumentException("Color must be in rgb hex range of 0x0 to 0xFFFFFF.");
        }
        return new ImageOption("bg", "rgb:" + String.format(Locale.getDefault(), "%06X", Integer.valueOf(i)));
    }

    public static ImageOption backgroundColorOf(int i, int i2, int i3) {
        if (i > 255 || i < 0) {
            throw new IllegalArgumentException("Red component out of range: " + i);
        }
        if (i2 > 255 || i2 < 0) {
            throw new IllegalArgumentException("Green component out of range: " + i2);
        }
        if (i3 > 255 || i3 < 0) {
            throw new IllegalArgumentException("Blue component out of range: " + i3);
        }
        return new ImageOption("bg", "rgb:" + String.format(Locale.getDefault(), "%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static ImageOption blackBackgroundColor() {
        return backgroundColorOf(0);
    }

    private String concatenationOperator(String str) {
        return str.contains("?") ? "&" : "?";
    }

    public static ImageOption fitOf(Resize resize) {
        return new ImageOption("fit", resize.name());
    }

    public static ImageOption focusOn(Focus focus) {
        return new ImageOption("f", focus.name());
    }

    public static ImageOption formatOf(Format format) {
        return new ImageOption(TifYXe.MASKED_COLLECTION, format.toUrlParameter());
    }

    public static ImageOption heightOf(int i) {
        if (i > 0) {
            return new ImageOption("h", Integer.toString(i));
        }
        throw new IllegalArgumentException("Height has to be positive.");
    }

    public static ImageOption http() {
        return new ImageOption(ProxyConfig.MATCH_HTTP, "") { // from class: com.contentful.java.cda.image.ImageOption.1
            @Override // com.contentful.java.cda.image.ImageOption
            public String apply(String str) {
                if (!str.startsWith("//")) {
                    return str;
                }
                return "http:" + str;
            }
        };
    }

    public static ImageOption https() {
        return new ImageOption("https", "") { // from class: com.contentful.java.cda.image.ImageOption.2
            @Override // com.contentful.java.cda.image.ImageOption
            public String apply(String str) {
                if (!str.startsWith("//")) {
                    return str;
                }
                return "https:" + str;
            }
        };
    }

    public static ImageOption jpegQualityOf(int i) {
        if (i < 1 || i > 100) {
            throw new IllegalArgumentException("Quality has to be in the range from 1 to 100.");
        }
        return new ImageOption(OperatorName.SAVE, Integer.toString(i));
    }

    public static ImageOption roundedCornerRadiusOf(float f) {
        if (f >= 0.0f) {
            return new ImageOption(PDPageLabelRange.STYLE_ROMAN_LOWER, Float.toString(f));
        }
        throw new IllegalArgumentException("Radius is negative.");
    }

    public static ImageOption widthOf(int i) {
        if (i > 0) {
            return new ImageOption(OperatorName.SET_LINE_WIDTH, Integer.toString(i));
        }
        throw new IllegalArgumentException("Width has to be positive.");
    }

    public String apply(String str) {
        return String.format(Locale.getDefault(), "%s%s%s=%s", str, concatenationOperator(str), this.operation, this.argument);
    }

    public String getOperation() {
        return this.operation;
    }
}
