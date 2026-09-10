package com.inmobile.auth.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/inmobile/auth/api/AuthenticatorSiteConfig;", "", "registrationURL", "", "authenticationURL", "relyingPartyDomain", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthenticationURL", "()Ljava/lang/String;", "getRegistrationURL", "getRelyingPartyDomain", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class AuthenticatorSiteConfig {

    /* renamed from: У04230423УУУУ, reason: contains not printable characters */
    public static int f91704230423 = 2;

    /* renamed from: УУ04230423УУУ, reason: contains not printable characters */
    public static int f91804230423 = 0;

    /* renamed from: УУ0423УУУУ, reason: contains not printable characters */
    public static int f9190423 = 1;

    /* renamed from: УУУ0423УУУ, reason: contains not printable characters */
    public static int f9200423 = 8;

    /* renamed from: Ю042EЮ042EЮ042E042E, reason: contains not printable characters */
    private final String f921042E042E042E042E;

    /* renamed from: ЮЮ042E042EЮ042E042E, reason: contains not printable characters */
    private final String f922042E042E042E042E;

    /* renamed from: ЮЮЮ042EЮ042E042E, reason: contains not printable characters */
    private final String f923042E042E042E;

    public AuthenticatorSiteConfig(String registrationURL, String authenticationURL, String relyingPartyDomain) {
        Intrinsics.checkNotNullParameter(registrationURL, "registrationURL");
        Intrinsics.checkNotNullParameter(authenticationURL, "authenticationURL");
        Intrinsics.checkNotNullParameter(relyingPartyDomain, "relyingPartyDomain");
        this.f923042E042E042E = registrationURL;
        this.f921042E042E042E042E = authenticationURL;
        this.f922042E042E042E042E = relyingPartyDomain;
    }

    /* renamed from: У042304230423УУУ, reason: contains not printable characters */
    public static int m11719042304230423() {
        return 2;
    }

    /* renamed from: У0423У0423УУУ, reason: contains not printable characters */
    public static int m1172004230423() {
        return 1;
    }

    /* renamed from: У0423УУУУУ, reason: contains not printable characters */
    public static int m117210423() {
        return 0;
    }

    /* renamed from: єє04540454045404540454, reason: contains not printable characters */
    public static int m1172204540454045404540454() {
        return 81;
    }

    /* renamed from: getAuthenticationURL, reason: from getter */
    public final String getF921042E042E042E042E() {
        return this.f921042E042E042E042E;
    }

    public final String getRegistrationURL() {
        String str = this.f923042E042E042E;
        if (((f9200423 + m1172004230423()) * f9200423) % f91704230423 != m117210423()) {
            f9200423 = 45;
            f9190423 = 14;
        }
        if (((m1172204540454045404540454() + f9190423) * m1172204540454045404540454()) % f91704230423 != m117210423()) {
            f9190423 = 1;
        }
        return str;
    }

    public final String getRelyingPartyDomain() {
        String str = this.f922042E042E042E042E;
        int i = f9200423;
        if ((i * (f9190423 + i)) % f91704230423 != 0) {
            f9200423 = m1172204540454045404540454();
            f91804230423 = m1172204540454045404540454();
        }
        int i2 = f9200423;
        if (((f9190423 + i2) * i2) % m11719042304230423() != f91804230423) {
            f9200423 = 75;
            f91804230423 = 41;
        }
        return str;
    }
}
