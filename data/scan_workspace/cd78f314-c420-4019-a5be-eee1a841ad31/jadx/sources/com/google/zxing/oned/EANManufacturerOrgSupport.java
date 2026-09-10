package com.google.zxing.oned;

import com.airbnb.paris.R2;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.tom_roush.fontbox.afm.AFMParser;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import com.yuno.presentation.core.apm.ApmBaseFormComponentKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class EANManufacturerOrgSupport {
    private final List<int[]> ranges = new ArrayList();
    private final List<String> countryIdentifiers = new ArrayList();

    private void add(int[] iArr, String str) {
        this.ranges.add(iArr);
        this.countryIdentifiers.add(str);
    }

    private synchronized void initIfNeeded() {
        if (this.ranges.isEmpty()) {
            add(new int[]{0, 19}, "US/CA");
            add(new int[]{30, 39}, "US");
            add(new int[]{60, 139}, "US/CA");
            add(new int[]{300, R2.color.primary_text_disabled_material_light}, "FR");
            add(new int[]{R2.color.ripple_material_dark}, "BG");
            add(new int[]{R2.color.secondary_text_default_material_light}, "SI");
            add(new int[]{R2.color.secondary_text_disabled_material_light}, "HR");
            add(new int[]{R2.color.switch_thumb_disabled_material_light}, "BA");
            add(new int[]{400, R2.dimen.abc_edit_text_inset_top_material}, "DE");
            add(new int[]{R2.dimen.abc_seekbar_track_background_height_material, R2.dimen.abc_text_size_display_2_material}, "JP");
            add(new int[]{R2.dimen.abc_text_size_display_3_material, R2.dimen.abc_text_size_subtitle_material_toolbar}, "RU");
            add(new int[]{R2.dimen.abc_text_size_title_material_toolbar}, "TW");
            add(new int[]{R2.dimen.compat_button_padding_horizontal_material}, "EE");
            add(new int[]{R2.dimen.compat_button_padding_vertical_material}, "LV");
            add(new int[]{R2.dimen.compat_control_corner_material}, "AZ");
            add(new int[]{R2.dimen.compat_notification_large_icon_max_height}, "LT");
            add(new int[]{R2.dimen.compat_notification_large_icon_max_width}, "UZ");
            add(new int[]{R2.dimen.disabled_alpha_material_dark}, "LK");
            add(new int[]{480}, "PH");
            add(new int[]{R2.dimen.highlight_alpha_material_colored}, "BY");
            add(new int[]{R2.dimen.highlight_alpha_material_dark}, "UA");
            add(new int[]{R2.dimen.hint_alpha_material_dark}, "MD");
            add(new int[]{R2.dimen.hint_alpha_material_light}, "AM");
            add(new int[]{R2.dimen.hint_pressed_alpha_material_dark}, "GE");
            add(new int[]{R2.dimen.hint_pressed_alpha_material_light}, "KZ");
            add(new int[]{R2.dimen.notification_action_text_size}, "HK");
            add(new int[]{R2.dimen.notification_big_circle_margin, R2.dimen.notification_small_icon_size_as_large}, "JP");
            add(new int[]{500, 509}, "GB");
            add(new int[]{R2.drawable.abc_btn_radio_material}, "GR");
            add(new int[]{R2.drawable.abc_cab_background_top_mtrl_alpha}, ExpandedProductParsedResult.POUND);
            add(new int[]{R2.drawable.abc_control_background_material}, "CY");
            add(new int[]{R2.drawable.abc_edit_text_material}, "MK");
            add(new int[]{R2.drawable.abc_ic_commit_search_api_mtrl_alpha}, "MT");
            add(new int[]{R2.drawable.abc_ic_menu_overflow_material}, "IE");
            add(new int[]{R2.drawable.abc_ic_menu_paste_mtrl_am_alpha, R2.drawable.abc_ic_star_half_black_48dp}, "BE/LU");
            add(new int[]{R2.drawable.abc_list_selector_background_transition_holo_light}, "PT");
            add(new int[]{R2.drawable.abc_ratingbar_small_material}, "IS");
            add(new int[]{R2.drawable.abc_scrubber_control_off_mtrl_alpha, R2.drawable.abc_spinner_textfield_background_material}, "DK");
            add(new int[]{R2.drawable.abc_text_select_handle_right_mtrl_light}, "PL");
            add(new int[]{R2.drawable.abc_textfield_search_default_mtrl_alpha}, "RO");
            add(new int[]{R2.drawable.btn_checkbox_unchecked_mtrl}, "HU");
            add(new int[]{600, 601}, "ZA");
            add(new int[]{603}, "GH");
            add(new int[]{608}, "BH");
            add(new int[]{609}, "MU");
            add(new int[]{611}, "MA");
            add(new int[]{R2.drawable.notification_template_icon_bg}, "DZ");
            add(new int[]{R2.drawable.notify_panel_notification_icon_bg}, "KE");
            add(new int[]{R2.drawable.tooltip_frame_dark}, "CI");
            add(new int[]{R2.drawable.tooltip_frame_light}, "TN");
            add(new int[]{R2.id.accessibility_custom_action_0}, "SY");
            add(new int[]{R2.id.accessibility_custom_action_1}, "EG");
            add(new int[]{R2.id.accessibility_custom_action_11}, "LY");
            add(new int[]{R2.id.accessibility_custom_action_12}, "JO");
            add(new int[]{R2.id.accessibility_custom_action_13}, "IR");
            add(new int[]{R2.id.accessibility_custom_action_14}, "KW");
            add(new int[]{R2.id.accessibility_custom_action_15}, "SA");
            add(new int[]{R2.id.accessibility_custom_action_16}, "AE");
            add(new int[]{R2.id.accessibility_custom_action_26, R2.id.accessibility_custom_action_6}, "FI");
            add(new int[]{R2.id.forever, R2.id.image}, "CN");
            add(new int[]{700, R2.id.off}, "NO");
            add(new int[]{R2.id.search_plate}, "IL");
            add(new int[]{R2.id.search_src_text, R2.id.submenuarrow}, "SE");
            add(new int[]{R2.id.submit_area}, "GT");
            add(new int[]{R2.id.tabMode}, "SV");
            add(new int[]{R2.id.tag_accessibility_actions}, "HN");
            add(new int[]{R2.id.tag_accessibility_clickable_spans}, "NI");
            add(new int[]{R2.id.tag_accessibility_heading}, "CR");
            add(new int[]{R2.id.tag_accessibility_pane_title}, "PA");
            add(new int[]{R2.id.tag_screen_reader_focusable}, "DO");
            add(new int[]{R2.id.text}, "MX");
            add(new int[]{R2.id.time, R2.id.title}, "CA");
            add(new int[]{R2.id.unchecked}, "VE");
            add(new int[]{R2.id.uniform, R2.layout.abc_action_bar_up_container}, AFMParser.CHARMETRICS_CH);
            add(new int[]{R2.layout.abc_action_menu_item_layout}, ApmBaseFormComponentKt.CO_COUNTRY_CODE);
            add(new int[]{R2.layout.abc_action_mode_close_item_material}, "UY");
            add(new int[]{R2.layout.abc_activity_chooser_view_list_item}, "PE");
            add(new int[]{R2.layout.abc_alert_dialog_material}, "BO");
            add(new int[]{R2.layout.abc_cascading_menu_item_layout}, "AR");
            add(new int[]{R2.layout.abc_dialog_title_material}, "CL");
            add(new int[]{R2.layout.abc_list_menu_item_layout}, "PY");
            add(new int[]{R2.layout.abc_list_menu_item_radio}, "PE");
            add(new int[]{R2.layout.abc_popup_menu_header_item_layout}, "EC");
            add(new int[]{R2.layout.abc_screen_simple, R2.layout.abc_screen_simple_overlay_action_mode}, ApmBaseFormComponentKt.BR_COUNTRY_CODE);
            add(new int[]{800, R2.style.Animation_AppCompat_Dialog}, "IT");
            add(new int[]{840, R2.style.Base_TextAppearance_AppCompat}, "ES");
            add(new int[]{850}, "CU");
            add(new int[]{R2.style.Base_TextAppearance_AppCompat_Headline}, "SK");
            add(new int[]{R2.style.Base_TextAppearance_AppCompat_Inverse}, "CZ");
            add(new int[]{R2.style.Base_TextAppearance_AppCompat_Large}, "YU");
            add(new int[]{R2.style.Base_TextAppearance_AppCompat_Medium_Inverse}, "MN");
            add(new int[]{R2.style.Base_TextAppearance_AppCompat_SearchResult}, AFMParser.KERN_PAIR_KP);
            add(new int[]{R2.style.Base_TextAppearance_AppCompat_SearchResult_Subtitle, R2.style.Base_TextAppearance_AppCompat_SearchResult_Title}, StandardStructureTypes.TR);
            add(new int[]{R2.style.Base_TextAppearance_AppCompat_Small, R2.style.Base_TextAppearance_AppCompat_Widget_ActionBar_Subtitle_Inverse}, "NL");
            add(new int[]{R2.style.Base_TextAppearance_AppCompat_Widget_ActionBar_Title}, "KR");
            add(new int[]{R2.style.Base_TextAppearance_AppCompat_Widget_Button_Borderless_Colored}, StandardStructureTypes.TH);
            add(new int[]{R2.style.Base_TextAppearance_AppCompat_Widget_DropDownItem}, "SG");
            add(new int[]{R2.style.Base_TextAppearance_AppCompat_Widget_PopupMenu_Large}, "IN");
            add(new int[]{R2.style.Base_TextAppearance_AppCompat_Widget_TextView_SpinnerItem}, "VN");
            add(new int[]{R2.style.Base_TextAppearance_Widget_AppCompat_Toolbar_Title}, "PK");
            add(new int[]{R2.style.Base_ThemeOverlay_AppCompat_Dark}, OperatorName.BEGIN_INLINE_IMAGE_DATA);
            add(new int[]{900, R2.style.Base_V21_Theme_AppCompat}, "AT");
            add(new int[]{R2.style.Base_V28_Theme_AppCompat, R2.style.Base_V7_Widget_AppCompat_Toolbar}, "AU");
            add(new int[]{R2.style.Base_Widget_AppCompat_ActionBar, R2.style.Base_Widget_AppCompat_ActivityChooserView}, "AZ");
            add(new int[]{R2.style.Base_Widget_AppCompat_Button_Borderless_Colored}, "MY");
            add(new int[]{R2.style.Base_Widget_AppCompat_Button_Small}, "MO");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String lookupCountryIdentifier(String str) {
        int[] iArr;
        int i;
        initIfNeeded();
        int parseInt = Integer.parseInt(str.substring(0, 3));
        int size = this.ranges.size();
        for (int i2 = 0; i2 < size && parseInt >= (i = (iArr = this.ranges.get(i2))[0]); i2++) {
            if (iArr.length != 1) {
                i = iArr[1];
            }
            if (parseInt <= i) {
                return this.countryIdentifiers.get(i2);
            }
        }
        return null;
    }
}
