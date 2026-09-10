package org.bouncycastle.pqc.crypto.ntruprime;

import androidx.media3.common.PlaybackException;
import com.airbnb.paris.R2;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes10.dex */
public class NTRULPRimeParameters implements CipherParameters {
    private final int delta;
    private final String name;
    private final int p;
    private final int privateKeyBytes;
    private final int publicKeyBytes;
    private final int q;
    private final int roundedPolynomialBytes;
    private final int sharedKeyBytes;
    private final int tau0;
    private final int tau1;
    private final int tau2;
    private final int tau3;
    private final int w;
    public static final NTRULPRimeParameters ntrulpr653 = new NTRULPRimeParameters("ntrulpr653", R2.id.action_bar, 4621, R2.attr.switchTextAppearance, R2.attr.tooltipText, 2175, 113, 2031, R2.attr.track, R2.style.Base_TextAppearance_AppCompat_Medium_Inverse, R2.style.Base_ThemeOverlay_AppCompat, R2.style.Widget_AppCompat_Button_Borderless, 16);
    public static final NTRULPRimeParameters ntrulpr761 = new NTRULPRimeParameters("ntrulpr761", R2.id.up, 4591, 250, R2.attr.trackTintMode, 2156, 114, PlaybackException.ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED, R2.attr.tooltipForegroundColor, 1007, R2.style.TextAppearance_AppCompat_Light_SearchResult_Title, R2.styleable.AppCompatTheme_actionMenuTextAppearance, 16);
    public static final NTRULPRimeParameters ntrulpr857 = new NTRULPRimeParameters("ntrulpr857", R2.style.Base_TextAppearance_AppCompat_Display4, 5167, R2.attr.titleMargins, R2.color.abc_tint_edittext, 2433, 101, 2265, R2.color.abc_search_url_text_selected, R2.style.Widget_AppCompat_Light_DropDownItem_Spinner, R2.style.Widget_Compat_NotificationActionContainer, R2.styleable.LinearLayoutCompat_Layout_android_layout_weight, 16);
    public static final NTRULPRimeParameters ntrulpr953 = new NTRULPRimeParameters("ntrulpr953", R2.style.Base_Widget_AppCompat_ButtonBar_AlertDialog, 6343, R2.color.button_material_dark, 404, 2997, 82, 2798, 400, R2.styleable.AppCompatTheme_android_windowIsFloating, R2.styleable.AppCompatTheme_editTextStyle, R2.styleable.Toolbar_contentInsetEndWithActions, 24);
    public static final NTRULPRimeParameters ntrulpr1013 = new NTRULPRimeParameters("ntrulpr1013", 1013, 7177, R2.color.tooltip_background_dark, R2.dimen.abc_seekbar_track_background_height_material, 3367, 73, 3143, R2.dimen.abc_search_view_preferred_width, R2.styleable.FontFamily_fontProviderCerts, R2.styleable.LinearLayoutCompat_android_orientation, 1773, 24);
    public static final NTRULPRimeParameters ntrulpr1277 = new NTRULPRimeParameters("ntrulpr1277", R2.styleable.AppCompatTextView_lastBaselineToBottomHeight, 7879, R2.dimen.abc_dialog_min_width_minor, 502, 3724, 66, 3469, R2.dimen.notification_right_icon_size, 1815, 1847, 2231, 32);

    private NTRULPRimeParameters(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.name = str;
        this.p = i;
        this.q = i2;
        this.w = i3;
        this.delta = i4;
        this.tau0 = i5;
        this.tau1 = i6;
        this.tau2 = i7;
        this.tau3 = i8;
        this.roundedPolynomialBytes = i9;
        this.publicKeyBytes = i10;
        this.privateKeyBytes = i11;
        this.sharedKeyBytes = i12;
    }

    public int getDelta() {
        return this.delta;
    }

    public String getName() {
        return this.name;
    }

    public int getP() {
        return this.p;
    }

    public int getPrivateKeyBytes() {
        return this.privateKeyBytes;
    }

    public int getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public int getQ() {
        return this.q;
    }

    public int getRoundedPolynomialBytes() {
        return this.roundedPolynomialBytes;
    }

    public int getSessionKeySize() {
        return this.sharedKeyBytes * 8;
    }

    public int getTau0() {
        return this.tau0;
    }

    public int getTau1() {
        return this.tau1;
    }

    public int getTau2() {
        return this.tau2;
    }

    public int getTau3() {
        return this.tau3;
    }

    public int getW() {
        return this.w;
    }
}
