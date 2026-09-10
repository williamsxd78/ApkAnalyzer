package com.contentful.java.cda.rich;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class CDARichText extends CDARichNode {
    private final List<CDARichMark> marks;
    private final CharSequence text;

    public CDARichText(CharSequence charSequence, List<CDARichMark> list) {
        ArrayList arrayList = new ArrayList();
        this.marks = arrayList;
        charSequence = charSequence == null ? "" : charSequence;
        arrayList.addAll(list);
        this.text = charSequence;
    }

    public List<CDARichMark> getMarks() {
        return this.marks;
    }

    public CharSequence getText() {
        return this.text;
    }
}
