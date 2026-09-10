package com.vivaaerobus.app.shared.sso.domain;

import android.net.Uri;
import com.doters.ssosdk.models.LoginDataSAC;
import kotlin.Metadata;

/* compiled from: SSORepository.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0003H&J\u001a\u0010\t\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/vivaaerobus/app/shared/sso/domain/SSORepository;", "", "navToLogin", "", "navToLoginSAC", "email", "", "scheme", "navToSignUp", "navToSignUpSAC", "logOut", "parseToLoginData", "Lcom/doters/ssosdk/models/LoginDataSAC;", "uri", "Landroid/net/Uri;", "sso_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SSORepository {
    void logOut(String scheme);

    void navToLogin();

    void navToLoginSAC(String email, String scheme);

    void navToSignUp();

    void navToSignUpSAC(String email, String scheme);

    LoginDataSAC parseToLoginData(Uri uri);
}
