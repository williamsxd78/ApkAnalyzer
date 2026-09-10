package com.contentful.java.cda;

/* loaded from: classes13.dex */
public class SyncType {
    final String contentType;
    final Type type;

    /* loaded from: classes13.dex */
    public enum Type {
        Asset,
        Entry,
        Deletion,
        DeletedAsset,
        DeletedEntry
    }

    SyncType(Type type, String str) {
        this.type = type;
        this.contentType = str;
    }

    public static SyncType allAssets() {
        return new SyncType(Type.Asset, null);
    }

    public static SyncType allEntries() {
        return new SyncType(Type.Entry, null);
    }

    public static SyncType onlyDeletedAssets() {
        return new SyncType(Type.DeletedAsset, null);
    }

    public static SyncType onlyDeletedEntries() {
        return new SyncType(Type.DeletedEntry, null);
    }

    public static SyncType onlyDeletion() {
        return new SyncType(Type.Deletion, null);
    }

    public static SyncType onlyEntriesOfType(String str) {
        return new SyncType(Type.Entry, str);
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getName() {
        return this.type.name();
    }
}
