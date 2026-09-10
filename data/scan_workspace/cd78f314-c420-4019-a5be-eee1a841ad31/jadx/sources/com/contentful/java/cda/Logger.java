package com.contentful.java.cda;

/* loaded from: classes13.dex */
public interface Logger {

    /* loaded from: classes13.dex */
    public enum Level {
        NONE,
        BASIC,
        FULL
    }

    void log(String str);
}
