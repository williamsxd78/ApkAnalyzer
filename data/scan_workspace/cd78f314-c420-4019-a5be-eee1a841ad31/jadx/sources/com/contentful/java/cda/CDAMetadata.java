package com.contentful.java.cda;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes13.dex */
public class CDAMetadata implements Serializable {
    private static final long serialVersionUID = -2852530837647649035L;
    List<CDATag> tags;

    public List<CDATag> getTags() {
        return this.tags;
    }

    public void setTags(List<CDATag> list) {
        this.tags = list;
    }

    public String toString() {
        return "CDAMetadata{}";
    }
}
