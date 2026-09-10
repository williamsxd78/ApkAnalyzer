package androidx.datastore.preferences.protobuf;

@CheckReturnValue
/* loaded from: classes12.dex */
interface MessageInfoFactory {
    boolean isSupported(Class<?> cls);

    MessageInfo messageInfoFor(Class<?> cls);
}
