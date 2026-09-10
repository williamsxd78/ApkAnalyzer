package org.bouncycastle.pqc.crypto.ntruprime;

import com.airbnb.paris.R2;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes10.dex */
public class SNTRUPrimeParameters implements CipherParameters {
    private final String name;
    private final int p;
    private final int privateKeyBytes;
    private final int publicKeyBytes;
    private final int q;
    private final int roundedPolynomialBytes;
    private final int rqPolynomialBytes;
    private final int sharedKeyBytes;
    private final int w;
    public static final SNTRUPrimeParameters sntrup653 = new SNTRUPrimeParameters("sntrup653", R2.id.action_bar, 4621, R2.attr.tooltipFrameBackground, R2.style.Base_Widget_AppCompat_TextView, R2.style.Base_TextAppearance_AppCompat_Medium_Inverse, R2.style.Base_Widget_AppCompat_TextView, R2.styleable.Paris_TextView_android_drawableTop, 16);
    public static final SNTRUPrimeParameters sntrup761 = new SNTRUPrimeParameters("sntrup761", R2.id.up, 4591, R2.attr.toolbarStyle, R2.style.Widget_AppCompat_Light_Spinner_DropDown_ActionBar, 1007, R2.style.Widget_AppCompat_Light_Spinner_DropDown_ActionBar, 1763, 16);
    public static final SNTRUPrimeParameters sntrup857 = new SNTRUPrimeParameters("sntrup857", R2.style.Base_TextAppearance_AppCompat_Display4, 5167, R2.color.abc_search_url_text_normal, R2.styleable.AppCompatTheme_buttonBarNeutralButtonStyle, R2.style.Widget_AppCompat_Light_DropDownItem_Spinner, R2.styleable.AppCompatTheme_buttonBarNeutralButtonStyle, 1999, 16);
    public static final SNTRUPrimeParameters sntrup953 = new SNTRUPrimeParameters("sntrup953", R2.style.Base_Widget_AppCompat_ButtonBar_AlertDialog, 6343, R2.dimen.abc_action_bar_default_height_material, R2.styleable.Paris_ImageView_android_scaleType, R2.styleable.AppCompatTheme_android_windowIsFloating, R2.styleable.Paris_ImageView_android_scaleType, 2254, 24);
    public static final SNTRUPrimeParameters sntrup1013 = new SNTRUPrimeParameters("sntrup1013", 1013, 7177, R2.dimen.abc_search_view_preferred_height, R2.styleable.SwitchCompat_switchTextAppearance, R2.styleable.FontFamily_fontProviderCerts, R2.styleable.SwitchCompat_switchTextAppearance, 2417, 24);
    public static final SNTRUPrimeParameters sntrup1277 = new SNTRUPrimeParameters("sntrup1277", R2.styleable.AppCompatTextView_lastBaselineToBottomHeight, 7879, R2.dimen.notification_large_icon_height, 2067, 1815, 2067, 3059, 32);

    private SNTRUPrimeParameters(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.name = str;
        this.p = i;
        this.q = i2;
        this.w = i3;
        this.rqPolynomialBytes = i4;
        this.roundedPolynomialBytes = i5;
        this.publicKeyBytes = i6;
        this.privateKeyBytes = i7;
        this.sharedKeyBytes = i8;
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

    public int getRqPolynomialBytes() {
        return this.rqPolynomialBytes;
    }

    public int getSessionKeySize() {
        return this.sharedKeyBytes * 8;
    }

    public int getW() {
        return this.w;
    }
}
