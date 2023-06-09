package com.bytedance.sdk.openadsdk.core;

import com.applovin.sdk.AppLovinErrorCodes;
import com.bytedance.sdk.component.utils.C10647t;
import com.google.android.gms.ads.AdSize;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p152ms.p153bd.p154o.Pgl.C5643c;

/* renamed from: com.bytedance.sdk.openadsdk.core.g */
/* compiled from: ErrorCode */
public class C0492g {
    /* renamed from: b */
    public static String m2255b(int i) {
        switch (i) {
            case C5643c.COLLECT_MODE_FINANCE /*300*/:
                return "Missing title";
            case 301:
                return "Missing description";
            case IronSourceConstants.OFFERWALL_AVAILABLE /*302*/:
                return "Missing cta";
            case 303:
                return "Missing score";
            case 304:
                return "Missing comment";
            case IronSourceConstants.OFFERWALL_OPENED /*305*/:
                return "Missing icon";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static String m2254a(int i) {
        if (i == -100) {
            return C10647t.m31276a(C0558m.m2663a(), "tt_init_setting_config_not_complete");
        }
        if (i == 113) {
            return "dynamic1 parse error";
        }
        if (i == 123) {
            return "dynamic2 parse error";
        }
        if (i == 20001) {
            return C10647t.m31276a(C0558m.m2663a(), "tt_no_ad");
        }
        if (i == 50001) {
            return C10647t.m31276a(C0558m.m2663a(), "tt_sys_error");
        }
        if (i == 60007) {
            return C10647t.m31276a(C0558m.m2663a(), "tt_error_verify_reward");
        }
        if (i == -16) {
            return C10647t.m31276a(C0558m.m2663a(), "tt_error_ad_able_false_msg");
        }
        if (i == -15) {
            return C10647t.m31276a(C0558m.m2663a(), "tt_lack_android_manifest_configuration");
        }
        if (i == 117) {
            return "dynamic1 render time_out";
        }
        if (i == 118) {
            return "dynamic1 render error";
        }
        if (i == 127) {
            return "dynamic2 render time_out";
        }
        if (i == 128) {
            return "dynamic2 render error";
        }
        if (i == 201) {
            return C10647t.m31276a(C0558m.m2663a(), "tt_load_creative_icon_response_error");
        }
        if (i == 202) {
            return C10647t.m31276a(C0558m.m2663a(), "tt_load_creative_icon_error");
        }
        if (i == 10002) {
            return "load time out";
        }
        if (i == 10003) {
            return "resource error";
        }
        switch (i) {
            case -12:
                return C10647t.m31276a(C0558m.m2663a(), "tt_splash_not_have_cache_error");
            case -11:
                return C10647t.m31276a(C0558m.m2663a(), "tt_splash_cache_expired_error");
            case -10:
                return C10647t.m31276a(C0558m.m2663a(), "tt_splash_cache_parse_error");
            case -9:
                return C10647t.m31276a(C0558m.m2663a(), "tt_request_body_error");
            case AppLovinErrorCodes.INVALID_AD_TOKEN /*-8*/:
                return C10647t.m31276a(C0558m.m2663a(), "tt_frequent_call_erroe");
            case AppLovinErrorCodes.INVALID_ZONE /*-7*/:
                return C10647t.m31276a(C0558m.m2663a(), "tt_splash_ad_load_image_error");
            case AppLovinErrorCodes.UNABLE_TO_RENDER_AD /*-6*/:
                return C10647t.m31276a(C0558m.m2663a(), "tt_insert_ad_load_image_error");
            case -5:
                return C10647t.m31276a(C0558m.m2663a(), "tt_banner_ad_load_image_error");
            case -4:
                return C10647t.m31276a(C0558m.m2663a(), "tt_ad_data_error");
            case -3:
                return C10647t.m31276a(C0558m.m2663a(), "tt_no_ad_parse");
            case AdSize.AUTO_HEIGHT /*-2*/:
                return C10647t.m31276a(C0558m.m2663a(), "tt_net_error");
            case -1:
                return C10647t.m31276a(C0558m.m2663a(), "tt_parse_fail");
            default:
                switch (i) {
                    case 101:
                        return C10647t.m31276a(C0558m.m2663a(), "tt_render_render_parse_error");
                    case 102:
                        return C10647t.m31276a(C0558m.m2663a(), "tt_render_main_template_invalid");
                    case 103:
                        return C10647t.m31276a(C0558m.m2663a(), "tt_render_diff_template_invalid");
                    case 104:
                        return C10647t.m31276a(C0558m.m2663a(), "tt_render_fail_meta_invalid");
                    case 105:
                        return C10647t.m31276a(C0558m.m2663a(), "tt_render_fail_template_parse_error");
                    case 106:
                        return C10647t.m31276a(C0558m.m2663a(), "tt_render_fail_unknown");
                    case 107:
                        return C10647t.m31276a(C0558m.m2663a(), "tt_render_fail_timeout");
                    case 108:
                        return C10647t.m31276a(C0558m.m2663a(), "tt_reder_ad_load_timeout");
                    case 109:
                        return C10647t.m31276a(C0558m.m2663a(), "tt_template_load_fail");
                    default:
                        switch (i) {
                            case 40000:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_content_type");
                            case 40001:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_request_pb_error");
                            case 40002:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_app_empty");
                            case 40003:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_wap_empty");
                            case 40004:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_adslot_empty");
                            case 40005:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_adslot_size_empty");
                            case 40006:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_adslot_id_error");
                            case 40007:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_error_code_adcount_error");
                            case 40008:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_error_image_size");
                            case 40009:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_error_media_id");
                            case 40010:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_error_media_type");
                            case 40011:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_error_ad_type");
                            case 40012:
                            case 40017:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_error_access_method_pass");
                            case 40013:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_error_splash_ad_type");
                            case 40014:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_error_redirect");
                            case 40015:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_error_request_invalid");
                            case 40016:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_error_slot_id_app_id_differ");
                            case 40018:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_error_package_name");
                            case 40019:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_error_adtype_differ");
                            case 40020:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_error_new_register_limit");
                            case 40021:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_error_apk_sign_check_error");
                            case 40022:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_error_origin_ad_error");
                            case 40023:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_error_union_os_error");
                            case 40024:
                                return C10647t.m31276a(C0558m.m2663a(), "tt_error_union_sdk_too_old");
                            default:
                                switch (i) {
                                    case 60001:
                                        return C10647t.m31276a(C0558m.m2663a(), "tt_ror_code_show_event_error");
                                    case 60002:
                                        return C10647t.m31276a(C0558m.m2663a(), "tt_error_code_click_event_error");
                                    default:
                                        return C10647t.m31276a(C0558m.m2663a(), "tt_error_unknow");
                                }
                        }
                }
        }
    }
}
