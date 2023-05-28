package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.utils.q */
/* compiled from: TTClientBiddingUtil */
public class C0992q {
    /* renamed from: a */
    public static void m4596a(C0477n nVar, Double d) {
        if (nVar != null && nVar.mo1389aj() != null) {
            Map<String, Object> aj = nVar.mo1389aj();
            try {
                Object obj = nVar.mo1389aj().get("sdk_bidding_type");
                if (obj == null) {
                    return;
                }
                if (Integer.parseInt(obj.toString()) == 2) {
                    String str = (String) aj.get("nurl");
                    if (!TextUtils.isEmpty(str)) {
                        if (d != null) {
                            str = str.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d));
                        }
                        C0558m.m2671f().mo1842a(str);
                    }
                }
            } catch (Throwable unused) {
                C10638l.m31234b("report Win error");
            }
        }
    }

    /* renamed from: a */
    public static void m4597a(C0477n nVar, Double d, String str, String str2) {
        if (nVar != null && nVar.mo1389aj() != null) {
            Map<String, Object> aj = nVar.mo1389aj();
            try {
                Object obj = nVar.mo1389aj().get("sdk_bidding_type");
                if (obj == null) {
                    return;
                }
                if (Integer.parseInt(obj.toString()) == 2) {
                    String str3 = (String) aj.get("lurl");
                    if (!TextUtils.isEmpty(str3)) {
                        if (d != null) {
                            str3 = str3.replace("${AUCTION_PRICE}", String.valueOf(d));
                        }
                        if (str != null) {
                            str3 = str3.replace("${AUCTION_LOSS}", str);
                        }
                        if (str2 != null) {
                            str3 = str3.replace("${AUCTION_WINNER}", str2);
                        }
                        C0558m.m2671f().mo1842a(str3);
                    }
                }
            } catch (Throwable unused) {
                C10638l.m31234b("report Loss error");
            }
        }
    }
}
