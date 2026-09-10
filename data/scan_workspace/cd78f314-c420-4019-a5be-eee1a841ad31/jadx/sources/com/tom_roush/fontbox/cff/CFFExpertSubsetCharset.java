package com.tom_roush.fontbox.cff;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.airbnb.paris.R2;

/* loaded from: classes3.dex */
public final class CFFExpertSubsetCharset extends CFFCharset {
    private static final Object[][] CFF_EXPERT_SUBSET_CHARSET_TABLE;
    private static final int CHAR_CODE = 0;
    private static final int CHAR_NAME = 1;
    private static final CFFExpertSubsetCharset INSTANCE;

    static {
        Object[][] objArr = {new Object[]{0, ".notdef"}, new Object[]{1, "space"}, new Object[]{231, "dollaroldstyle"}, new Object[]{232, "dollarsuperior"}, new Object[]{235, "parenleftsuperior"}, new Object[]{236, "parenrightsuperior"}, new Object[]{237, "twodotenleader"}, new Object[]{238, "onedotenleader"}, new Object[]{13, "comma"}, new Object[]{14, "hyphen"}, new Object[]{15, TypedValues.CycleType.S_WAVE_PERIOD}, new Object[]{99, "fraction"}, new Object[]{239, "zerooldstyle"}, new Object[]{240, "oneoldstyle"}, new Object[]{241, "twooldstyle"}, new Object[]{242, "threeoldstyle"}, new Object[]{243, "fouroldstyle"}, new Object[]{244, "fiveoldstyle"}, new Object[]{245, "sixoldstyle"}, new Object[]{246, "sevenoldstyle"}, new Object[]{247, "eightoldstyle"}, new Object[]{Integer.valueOf(R2.attr.suggestionRowLayout), "nineoldstyle"}, new Object[]{27, "colon"}, new Object[]{28, "semicolon"}, new Object[]{Integer.valueOf(R2.attr.switchMinWidth), "commasuperior"}, new Object[]{250, "threequartersemdash"}, new Object[]{Integer.valueOf(R2.attr.switchStyle), "periodsuperior"}, new Object[]{Integer.valueOf(R2.attr.textAllCaps), "asuperior"}, new Object[]{Integer.valueOf(R2.attr.textAppearanceLargePopupMenu), "bsuperior"}, new Object[]{255, "centsuperior"}, new Object[]{256, "dsuperior"}, new Object[]{257, "esuperior"}, new Object[]{258, "isuperior"}, new Object[]{Integer.valueOf(R2.attr.textAppearanceSearchResultSubtitle), "lsuperior"}, new Object[]{Integer.valueOf(R2.attr.textAppearanceSearchResultTitle), "msuperior"}, new Object[]{Integer.valueOf(R2.attr.textAppearanceSmallPopupMenu), "nsuperior"}, new Object[]{Integer.valueOf(R2.attr.textColorAlertDialogListItem), "osuperior"}, new Object[]{Integer.valueOf(R2.attr.textColorSearchUrl), "rsuperior"}, new Object[]{Integer.valueOf(R2.attr.textLocale), "ssuperior"}, new Object[]{Integer.valueOf(R2.attr.theme), "tsuperior"}, new Object[]{Integer.valueOf(R2.attr.thickness), "ff"}, new Object[]{109, "fi"}, new Object[]{110, "fl"}, new Object[]{Integer.valueOf(R2.attr.thumbTextPadding), "ffi"}, new Object[]{Integer.valueOf(R2.attr.thumbTint), "ffl"}, new Object[]{Integer.valueOf(R2.attr.thumbTintMode), "parenleftinferior"}, new Object[]{Integer.valueOf(R2.attr.tickMark), "parenrightinferior"}, new Object[]{Integer.valueOf(R2.attr.tickMarkTintMode), "hyphensuperior"}, new Object[]{300, "colonmonetary"}, new Object[]{301, "onefitted"}, new Object[]{302, "rupiah"}, new Object[]{305, "centoldstyle"}, new Object[]{314, "figuredash"}, new Object[]{315, "hypheninferior"}, new Object[]{158, "onequarter"}, new Object[]{155, "onehalf"}, new Object[]{163, "threequarters"}, new Object[]{320, "oneeighth"}, new Object[]{Integer.valueOf(R2.color.abc_search_url_text), "threeeighths"}, new Object[]{Integer.valueOf(R2.color.abc_search_url_text_normal), "fiveeighths"}, new Object[]{Integer.valueOf(R2.color.abc_search_url_text_pressed), "seveneighths"}, new Object[]{Integer.valueOf(R2.color.abc_search_url_text_selected), "onethird"}, new Object[]{Integer.valueOf(R2.color.abc_secondary_text_material_dark), "twothirds"}, new Object[]{Integer.valueOf(R2.color.abc_secondary_text_material_light), "zerosuperior"}, new Object[]{150, "onesuperior"}, new Object[]{164, "twosuperior"}, new Object[]{169, "threesuperior"}, new Object[]{Integer.valueOf(R2.color.abc_tint_btn_checkable), "foursuperior"}, new Object[]{Integer.valueOf(R2.color.abc_tint_default), "fivesuperior"}, new Object[]{Integer.valueOf(R2.color.abc_tint_edittext), "sixsuperior"}, new Object[]{Integer.valueOf(R2.color.abc_tint_seek_thumb), "sevensuperior"}, new Object[]{Integer.valueOf(R2.color.abc_tint_spinner), "eightsuperior"}, new Object[]{Integer.valueOf(R2.color.abc_tint_switch_track), "ninesuperior"}, new Object[]{Integer.valueOf(R2.color.accent_material_dark), "zeroinferior"}, new Object[]{Integer.valueOf(R2.color.accent_material_light), "oneinferior"}, new Object[]{Integer.valueOf(R2.color.background_floating_material_dark), "twoinferior"}, new Object[]{Integer.valueOf(R2.color.background_floating_material_light), "threeinferior"}, new Object[]{Integer.valueOf(R2.color.background_material_dark), "fourinferior"}, new Object[]{Integer.valueOf(R2.color.background_material_light), "fiveinferior"}, new Object[]{Integer.valueOf(R2.color.bright_foreground_disabled_material_dark), "sixinferior"}, new Object[]{Integer.valueOf(R2.color.bright_foreground_disabled_material_light), "seveninferior"}, new Object[]{Integer.valueOf(R2.color.bright_foreground_inverse_material_dark), "eightinferior"}, new Object[]{Integer.valueOf(R2.color.bright_foreground_inverse_material_light), "nineinferior"}, new Object[]{Integer.valueOf(R2.color.bright_foreground_material_dark), "centinferior"}, new Object[]{Integer.valueOf(R2.color.bright_foreground_material_light), "dollarinferior"}, new Object[]{Integer.valueOf(R2.color.button_material_dark), "periodinferior"}, new Object[]{Integer.valueOf(R2.color.button_material_light), "commainferior"}};
        CFF_EXPERT_SUBSET_CHARSET_TABLE = objArr;
        INSTANCE = new CFFExpertSubsetCharset();
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object[] objArr2 = objArr[i];
            INSTANCE.addSID(i2, ((Integer) objArr2[0]).intValue(), objArr2[1].toString());
            i++;
            i2++;
        }
    }

    private CFFExpertSubsetCharset() {
        super(false);
    }

    public static CFFExpertSubsetCharset getInstance() {
        return INSTANCE;
    }
}
