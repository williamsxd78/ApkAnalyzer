package com.inmobile.auth.webauthn;

import com.inmobile.auth.api.BytesAsBase64Serializer;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/inmobile/auth/webauthn/AuthenticatorResponse;", "", "clientDataJSON", "", "getClientDataJSON$annotations", "()V", "getClientDataJSON", "()[B", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface AuthenticatorResponse {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {

        /* renamed from: л043B043B043B043B043Bл, reason: contains not printable characters */
        public static int f992043B043B043B043B043B = 35;

        /* renamed from: л043Bлллл043B, reason: contains not printable characters */
        public static int f993043B043B = 1;

        /* renamed from: лллллл043B, reason: contains not printable characters */
        public static int f994043B;

        @Serializable(with = BytesAsBase64Serializer.class)
        public static /* synthetic */ void getClientDataJSON$annotations() {
        }

        /* renamed from: лл043Bллл043B, reason: contains not printable characters */
        public static int m11756043B043B() {
            return 2;
        }
    }

    byte[] getClientDataJSON();
}
