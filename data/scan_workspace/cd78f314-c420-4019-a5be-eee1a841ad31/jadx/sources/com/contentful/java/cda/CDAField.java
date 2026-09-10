package com.contentful.java.cda;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public class CDAField implements Serializable {
    private static final long serialVersionUID = -2852530837647669035L;
    boolean disabled;
    protected String id;
    Map<String, Object> items;
    String linkType;
    boolean localized;
    String name;
    boolean required;
    protected String type;
    List<Map<String, Object>> validations;

    public String id() {
        return this.id;
    }

    public boolean isDisabled() {
        return this.disabled;
    }

    public boolean isLocalized() {
        return this.localized;
    }

    public boolean isRequired() {
        return this.required;
    }

    public Map<String, Object> items() {
        return this.items;
    }

    public String linkType() {
        return this.linkType;
    }

    public String name() {
        return this.name;
    }

    public String type() {
        return this.type;
    }

    public List<Map<String, Object>> validations() {
        return this.validations;
    }
}
