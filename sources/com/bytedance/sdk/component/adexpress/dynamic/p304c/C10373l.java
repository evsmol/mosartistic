package com.bytedance.sdk.component.adexpress.dynamic.p304c;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.dynamic.p304c.C10354a;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10647t;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.l */
/* compiled from: LayoutUnitSizeUtils */
public class C10373l {

    /* renamed from: a */
    private static final Set<String> f25734a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"dislike", "close", "close-fill", "webview-close"})));

    /* renamed from: b */
    private static String f25735b;

    /* renamed from: a */
    public static C10354a.C10357c m30203a(String str, String str2, String str3, boolean z, boolean z2, int i) {
        float f;
        int i2;
        int i3;
        C10354a.C10357c cVar = new C10354a.C10357c();
        if (str.startsWith("<svg") || f25734a.contains(str2)) {
            try {
                if ("close".equals(str2)) {
                    float optDouble = (float) new JSONObject(str3).optDouble("fontSize");
                    cVar.f25701a = optDouble;
                    cVar.f25702b = optDouble;
                    return cVar;
                }
            } catch (Exception unused) {
            }
            cVar.f25701a = 10.0f;
            cVar.f25702b = 10.0f;
            return cVar;
        } else if (!"logo".equals(str2)) {
            if ("development-name".equals(str2)) {
                str = "开发者：" + str;
            }
            if ("app-version".equals(str2)) {
                str = "版本号：V" + str;
            }
            if ("score-count".equals(str2)) {
                try {
                    i3 = Integer.parseInt(str);
                } catch (NumberFormatException unused2) {
                    i3 = 0;
                }
                return m30202a("(" + String.format(C10647t.m31276a(C10303c.m29743a(), "tt_comment_num"), new Object[]{Integer.valueOf(i3)}) + ")", str3);
            } else if ("score-count-type-2".equals(str2)) {
                try {
                    i2 = Integer.parseInt(str);
                } catch (NumberFormatException unused3) {
                    i2 = 0;
                }
                return m30202a("(" + String.format(new DecimalFormat("###,###,###").format((long) i2), new Object[]{Integer.valueOf(i2)}) + ")", str3);
            } else if ("feedback-dislike".equals(str2)) {
                return m30202a(C10647t.m31276a(C10303c.m29743a(), "tt_reward_feedback"), str3);
            } else {
                if ("skip-with-time-countdown".equals(str2) || TextUtils.equals("skip-with-countdowns-video-countdown", str2)) {
                    return m30202a("00S", str3);
                }
                if (TextUtils.equals("skip-with-countdowns-skip-btn", str2)) {
                    return m30202a(" | " + C10647t.m31276a(C10303c.m29743a(), "tt_reward_screen_skip_tx"), str3);
                } else if (TextUtils.equals("skip-with-countdowns-skip-countdown", str2)) {
                    return m30202a(" | " + String.format(C10647t.m31276a(C10303c.m29743a(), "tt_reward_full_skip_count_down"), new Object[]{"00"}), str3);
                } else if ("skip-with-time-skip-btn".equals(str2)) {
                    return m30202a(" |  " + C10647t.m31276a(C10303c.m29743a(), "tt_reward_screen_skip_tx"), str3);
                } else if ("skip".equals(str2)) {
                    return m30202a(C10647t.m31276a(C10303c.m29743a(), "tt_reward_screen_skip_tx"), str3);
                } else {
                    if ("timedown".equals(str2)) {
                        return m30202a("0.0", str3);
                    }
                    if ("text_star".equals(str2)) {
                        return m30202a("0.00", str3);
                    }
                    if (TextUtils.equals("privacy-detail", str2)) {
                        return m30202a("权限列表 | 隐私政策", str3);
                    }
                    if ("arrowButton".equals(str2)) {
                        return m30202a("立即下载", str3);
                    }
                    if ("title".equals(str2)) {
                        try {
                            return m30204a(str.replace(10, ' '), str3, true);
                        } catch (Exception unused4) {
                        }
                    }
                    if ("fillButton".equals(str2) || "text".equals(str2) || "button".equals(str2) || "downloadWithIcon".equals(str2) || "downloadButton".equals(str2) || "laceButton".equals(str2) || "cardButton".equals(str2) || "colourMixtureButton".equals(str2) || "arrowButton".equals(str2) || "source".equals(str2) || TextUtils.equals("app-version", str2) || TextUtils.equals("development-name", str2)) {
                        return m30202a(str, str3);
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str3);
                        int length = str.length();
                        float optDouble2 = (float) jSONObject.optDouble("fontSize");
                        float optDouble3 = (float) jSONObject.optDouble("letterSpacing");
                        float optDouble4 = (float) jSONObject.optDouble("lineHeight");
                        float optDouble5 = (float) jSONObject.optDouble("maxWidth");
                        float f2 = (((float) length) * (optDouble2 + optDouble3)) - optDouble3;
                        C10638l.m31242e("DynamicBaseWidget", "getDomSizeFromNative letterSpacing==" + optDouble3 + ",lineHeight==" + optDouble4 + ",maxWidth ==" + optDouble5 + ",totalStrLength" + f2);
                        if ("muted".equals(str2)) {
                            cVar.f25701a = optDouble2;
                            cVar.f25702b = optDouble2;
                            return cVar;
                        } else if ("star".equals(str2)) {
                            cVar.f25701a = 5.0f * optDouble2;
                            cVar.f25702b = optDouble2;
                            return cVar;
                        } else if ("icon".equals(str2)) {
                            cVar.f25701a = optDouble2;
                            cVar.f25702b = optDouble2;
                            return cVar;
                        } else {
                            if (z) {
                                int i4 = ((int) (f2 / optDouble5)) + 1;
                                if (!z2 || i4 < i) {
                                    i = i4;
                                }
                                f = (float) (((double) (optDouble4 * optDouble2 * ((float) i))) * 1.2d);
                            } else {
                                float f3 = (float) (((double) (optDouble4 * optDouble2)) * 1.2d);
                                if (f2 <= optDouble5) {
                                    optDouble5 = f2;
                                }
                                f = f3;
                            }
                            cVar.f25701a = optDouble5;
                            cVar.f25702b = f;
                            return cVar;
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else if (C10303c.m29744b() || ((TextUtils.isEmpty(str) || !str.contains("adx:")) && !m30211b())) {
            cVar.f25701a = "union".equals(str) ? 10.0f : 20.0f;
            cVar.f25702b = 10.0f;
            if (C10303c.m29744b()) {
                if ((str2 + str).contains("logoad")) {
                    return m30202a("AD", str3);
                }
            }
            return cVar;
        } else if (m30211b()) {
            return m30201a(cVar, str, str3, f25735b);
        } else {
            return m30201a(cVar, str, str3, "");
        }
    }

    /* renamed from: a */
    public static String m30206a(String str) {
        String[] split;
        if (!TextUtils.isEmpty(str) && (split = str.split("adx:")) != null && split.length >= 2) {
            return split[1];
        }
        return "";
    }

    /* renamed from: a */
    private static C10354a.C10357c m30201a(C10354a.C10357c cVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            cVar.f25701a = 0.0f;
            cVar.f25702b = 0.0f;
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = m30206a(str);
            }
            if (!TextUtils.isEmpty(str3)) {
                return m30202a(str3, str2);
            }
            cVar.f25701a = 0.0f;
            cVar.f25702b = 0.0f;
        }
        return cVar;
    }

    /* renamed from: b */
    public static String m30209b(String str, String str2, String str3, boolean z, boolean z2, int i) {
        JSONObject jSONObject = new JSONObject();
        C10354a.C10357c a = m30203a(str, str2, str3, z, z2, i);
        try {
            jSONObject.put(IabUtils.KEY_WIDTH, (double) a.f25701a);
            jSONObject.put(IabUtils.KEY_HEIGHT, (double) a.f25702b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static C10354a.C10357c m30202a(String str, String str2) {
        return m30204a(str, str2, false);
    }

    /* renamed from: a */
    public static C10354a.C10357c m30204a(String str, String str2, boolean z) {
        C10354a.C10357c cVar = new C10354a.C10357c();
        try {
            int[] a = m30208a(str, (int) Double.parseDouble(new JSONObject(str2).optString("fontSize")), z);
            cVar.f25701a = (float) a[0];
            cVar.f25702b = (float) a[1];
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cVar;
    }

    /* renamed from: a */
    public static int[] m30208a(String str, int i, boolean z) {
        int[] a = m30207a(str, (float) i, z);
        return new int[]{C10305b.m29751b(C10303c.m29743a(), (float) a[0]), C10305b.m29751b(C10303c.m29743a(), (float) a[1])};
    }

    /* renamed from: a */
    public static int[] m30207a(String str, float f, boolean z) {
        TextView textView = new TextView(C10303c.m29743a());
        textView.setTextSize(f);
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        if (z) {
            textView.setSingleLine();
        }
        textView.measure(-2, -2);
        return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
    }

    /* renamed from: b */
    public static void m30210b(String str) {
        f25735b = str;
    }

    /* renamed from: a */
    public static String m30205a() {
        return f25735b;
    }

    /* renamed from: b */
    public static boolean m30211b() {
        return !TextUtils.isEmpty(f25735b);
    }
}
