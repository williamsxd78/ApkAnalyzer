package com.contentful.java.cda.rich;

import java.util.LinkedList;
import java.util.List;

/* loaded from: classes13.dex */
public class CDARichBlock extends CDARichNode {
    final List<CDARichNode> content = new LinkedList();

    public List<CDARichNode> getContent() {
        return this.content;
    }
}
