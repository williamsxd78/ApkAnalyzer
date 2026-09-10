package org.brotli.dec;

import com.airbnb.paris.R2;

/* loaded from: classes10.dex */
final class Prefix {
    static final int[] BLOCK_LENGTH_OFFSET = {1, 5, 9, 13, 17, 25, 33, 41, 49, 65, 81, 97, 113, 145, 177, 209, 241, 305, R2.color.notification_action_color_filter, R2.dimen.notification_right_side_padding_top, R2.id.textSpacerNoTitle, R2.styleable.AppCompatTextView_autoSizeTextType, 2289, 4337, 8433, 16625};
    static final int[] BLOCK_LENGTH_N_BITS = {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 24};
    static final int[] INSERT_LENGTH_OFFSET = {0, 1, 2, 3, 4, 5, 6, 8, 10, 14, 18, 26, 34, 50, 66, 98, 130, 194, R2.color.abc_search_url_text_normal, R2.drawable.abc_spinner_mtrl_am_alpha, R2.style.Theme_AppCompat, 2114, 6210, 22594};
    static final int[] INSERT_LENGTH_N_BITS = {0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 12, 14, 24};
    static final int[] COPY_LENGTH_OFFSET = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 18, 22, 30, 38, 54, 70, 102, 134, 198, R2.color.abc_secondary_text_material_light, R2.drawable.abc_tab_indicator_material, R2.style.Theme_AppCompat_DayNight_Dialog, 2118};
    static final int[] COPY_LENGTH_N_BITS = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 24};
    static final int[] INSERT_RANGE_LUT = {0, 0, 8, 8, 0, 16, 8, 16, 16};
    static final int[] COPY_RANGE_LUT = {0, 8, 0, 8, 16, 0, 16, 8, 16};

    Prefix() {
    }
}
