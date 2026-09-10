package com.contentful.java.cda.rich;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* loaded from: classes13.dex */
public class CDARichMark {
    protected final String type;

    /* loaded from: classes13.dex */
    public static class CDARichMarkBold extends CDARichMark {
        public CDARichMarkBold() {
            super(TtmlNode.BOLD);
        }
    }

    /* loaded from: classes13.dex */
    public static class CDARichMarkCode extends CDARichMark {
        public CDARichMarkCode() {
            super("code");
        }
    }

    /* loaded from: classes13.dex */
    public static class CDARichMarkCustom extends CDARichMark {
        public CDARichMarkCustom(String str) {
            super(str);
        }
    }

    /* loaded from: classes13.dex */
    public static class CDARichMarkItalic extends CDARichMark {
        public CDARichMarkItalic() {
            super(TtmlNode.ITALIC);
        }
    }

    /* loaded from: classes13.dex */
    public static class CDARichMarkSubscript extends CDARichMark {
        public CDARichMarkSubscript() {
            super("subscript");
        }
    }

    /* loaded from: classes13.dex */
    public static class CDARichMarkSuperscript extends CDARichMark {
        public CDARichMarkSuperscript() {
            super("superscript");
        }
    }

    /* loaded from: classes13.dex */
    public static class CDARichMarkUnderline extends CDARichMark {
        public CDARichMarkUnderline() {
            super(TtmlNode.UNDERLINE);
        }
    }

    public CDARichMark(String str) {
        this.type = str;
    }

    public String getType() {
        return this.type;
    }
}
