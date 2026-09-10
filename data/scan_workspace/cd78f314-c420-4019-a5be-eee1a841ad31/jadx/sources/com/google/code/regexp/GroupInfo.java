package com.google.code.regexp;

import java.io.Serializable;

/* loaded from: classes14.dex */
public class GroupInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private int groupIndex;
    private int pos;

    public GroupInfo(int i, int i2) {
        this.groupIndex = i;
        this.pos = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof GroupInfo)) {
            return false;
        }
        GroupInfo groupInfo = (GroupInfo) obj;
        return this.pos == groupInfo.pos && this.groupIndex == groupInfo.groupIndex;
    }

    public int groupIndex() {
        return this.groupIndex;
    }

    public int hashCode() {
        return this.groupIndex ^ this.pos;
    }

    public int pos() {
        return this.pos;
    }
}
