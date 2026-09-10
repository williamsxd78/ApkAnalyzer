package com.contentful.java.cda;

/* loaded from: classes13.dex */
public class CDASpace extends CDAResource {
    private static final long serialVersionUID = 8920494351623297673L;
    String name;

    public String name() {
        return this.name;
    }

    @Override // com.contentful.java.cda.CDAResource
    public String toString() {
        return "CDASpace{id='" + id() + "', name='" + this.name + "'}";
    }
}
