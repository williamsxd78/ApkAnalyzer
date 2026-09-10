package com.quantummetric.instrument;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class QMMaskingMap extends HashMap<String, Object> {

    /* loaded from: classes3.dex */
    public enum Type {
        Bodies,
        Headers,
        Text,
        ApiUrl,
        MaskEverythingMode,
        Images,
        Inputs,
        Activity,
        Fragment,
        ViewId,
        ViewClass
    }

    public QMMaskingMap(Type type) {
        put("type", type.name());
    }

    public QMMaskingMap addExactMatchList(String... strArr) {
        put("exact_match_list", new ArrayList(Arrays.asList(strArr)));
        return this;
    }

    public QMMaskingMap addRegexList(String... strArr) {
        put("regex_list", new ArrayList(Arrays.asList(strArr)));
        return this;
    }

    public List<String> getExactMatchList() {
        Object obj = get("exact_match_list");
        return obj instanceof List ? (List) obj : new ArrayList();
    }

    public List<String> getRegexList() {
        Object obj = get("regex_list");
        return obj instanceof List ? (List) obj : new ArrayList();
    }

    public Type getType() {
        return Type.valueOf((String) get("type"));
    }
}
