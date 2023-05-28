package com.appnext.core.p267a;

import com.appnext.core.C8917f;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appnext.core.a.b */
public final class C8894b {

    /* renamed from: hV */
    private static final String f22526hV = "{\"EN\":{\"settings\":{\"active\":true,\"len\":12,\"font_size_px\":12,\"font_size_sp\":10},\"new\":{\"Install\":\"Install\",\"Download\":\"Download\",\"Shop\":\"Shop\",\"Sign up\":\"Sign up\",\"Watch\":\"Watch\",\"Join\":\"Join\",\"Start\":\"Start\",\"Subscribe\":\"Subscribe\",\"Add\":\"Add\",\"Search\":\"Search\",\"Share\":\"Share\",\"Get\":\"Get\",\"Book\":\"Book\",\"Play\":\"Play\"},\"existing\":{\"Install\":\"Install\",\"Use\":\"Use\",\"Play\":\"Play\",\"Reserve\":\"Reserve\",\"Buy\":\"Buy\",\"View\":\"View\",\"Log in\":\"Log in\",\"Listen\":\"Listen\",\"Read\":\"Read\",\"Watch\":\"Watch\",\"See more\":\"See more\",\"Find\":\"Find\",\"Book\":\"Book\",\"Chat\":\"Chat\",\"Park\":\"Park\",\"Open\":\"Open\",\"Exercise\":\"Exercise\",\"Optimize\":\"Optimize\"}},\"KO\":{\"settings\":{\"active\":true,\"len\":10,\"font_size_px\":12,\"font_size_sp\":10},\"new\":{\"Install\":\"설치\",\"Download\":\"다운로드\",\"Shop\":\"가게에서 물건을 사다\",\"Sign up\":\"회원가입\",\"Watch\":\"보다\",\"Join\":\"입회하다\",\"Start\":\"시작\",\"Subscribe\":\"구독\",\"Add\":\"추가\",\"Search\":\"검색\",\"Share\":\"공유\",\"Get\":\"얻다\",\"Book\":\"예약\",\"Play\":\"재생\"},\"existing\":{\"Install\":\"설치\",\"Use\":\"설치\",\"Play\":\"재생\",\"Reserve\":\"예약하기\",\"Buy\":\"구매하기\",\"View\":\"바라보다\",\"Log in\":\"로그인\",\"Listen\":\"듣기\",\"Read\":\"읽기\",\"Watch\":\"보기\",\"See more\":\"더 보기\",\"Find\":\"찾기\",\"Book\":\"예약\",\"Chat\":\"채팅\",\"Park\":\"읽기\",\"Open\":\"개장\",\"Exercise\":\"연습하다\",\"Optimize\":\"최적화하기\"}}}";

    /* renamed from: hW */
    public static final String f22527hW = "settings";

    /* renamed from: hX */
    public static final String f22528hX = "new";

    /* renamed from: hY */
    public static final String f22529hY = "existing";

    /* renamed from: ia */
    private static C8894b f22530ia;
    /* access modifiers changed from: private */

    /* renamed from: hZ */
    public String f22531hZ;

    private C8894b() {
        new Thread(new Runnable() {
            public final void run() {
                try {
                    String unused = C8894b.this.f22531hZ = C8917f.m26919a("https://cdn.appnext.com/tools/sdk/langs/2.4.4/langs.json", (HashMap<String, String>) null);
                } catch (Throwable unused2) {
                }
            }
        }).start();
    }

    /* renamed from: bp */
    public static synchronized C8894b m26842bp() {
        C8894b bVar;
        synchronized (C8894b.class) {
            if (f22530ia == null) {
                f22530ia = new C8894b();
            }
            bVar = f22530ia;
        }
        return bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:11|12) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:7|8) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = m26841a(r3.f22531hZ, "EN", r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = m26841a(f22526hV, "EN", r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r0 = m26841a(f22526hV, r4, r5, r6);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0021 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0026 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo58969b(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r0 = "EN"
            java.lang.String r1 = "{\"EN\":{\"settings\":{\"active\":true,\"len\":12,\"font_size_px\":12,\"font_size_sp\":10},\"new\":{\"Install\":\"Install\",\"Download\":\"Download\",\"Shop\":\"Shop\",\"Sign up\":\"Sign up\",\"Watch\":\"Watch\",\"Join\":\"Join\",\"Start\":\"Start\",\"Subscribe\":\"Subscribe\",\"Add\":\"Add\",\"Search\":\"Search\",\"Share\":\"Share\",\"Get\":\"Get\",\"Book\":\"Book\",\"Play\":\"Play\"},\"existing\":{\"Install\":\"Install\",\"Use\":\"Use\",\"Play\":\"Play\",\"Reserve\":\"Reserve\",\"Buy\":\"Buy\",\"View\":\"View\",\"Log in\":\"Log in\",\"Listen\":\"Listen\",\"Read\":\"Read\",\"Watch\":\"Watch\",\"See more\":\"See more\",\"Find\":\"Find\",\"Book\":\"Book\",\"Chat\":\"Chat\",\"Park\":\"Park\",\"Open\":\"Open\",\"Exercise\":\"Exercise\",\"Optimize\":\"Optimize\"}},\"KO\":{\"settings\":{\"active\":true,\"len\":10,\"font_size_px\":12,\"font_size_sp\":10},\"new\":{\"Install\":\"설치\",\"Download\":\"다운로드\",\"Shop\":\"가게에서 물건을 사다\",\"Sign up\":\"회원가입\",\"Watch\":\"보다\",\"Join\":\"입회하다\",\"Start\":\"시작\",\"Subscribe\":\"구독\",\"Add\":\"추가\",\"Search\":\"검색\",\"Share\":\"공유\",\"Get\":\"얻다\",\"Book\":\"예약\",\"Play\":\"재생\"},\"existing\":{\"Install\":\"설치\",\"Use\":\"설치\",\"Play\":\"재생\",\"Reserve\":\"예약하기\",\"Buy\":\"구매하기\",\"View\":\"바라보다\",\"Log in\":\"로그인\",\"Listen\":\"듣기\",\"Read\":\"읽기\",\"Watch\":\"보기\",\"See more\":\"더 보기\",\"Find\":\"찾기\",\"Book\":\"예약\",\"Chat\":\"채팅\",\"Park\":\"읽기\",\"Open\":\"개장\",\"Exercise\":\"연습하다\",\"Optimize\":\"최적화하기\"}}}"
            if (r4 == 0) goto L_0x000e
            java.lang.String r2 = ""
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x001a
        L_0x000e:
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getLanguage()
            java.lang.String r4 = r4.toUpperCase()
        L_0x001a:
            java.lang.String r2 = r3.f22531hZ     // Catch:{ all -> 0x0021 }
            java.lang.String r0 = m26841a(r2, r4, r5, r6)     // Catch:{ all -> 0x0021 }
            goto L_0x0033
        L_0x0021:
            java.lang.String r0 = m26841a(r1, r4, r5, r6)     // Catch:{ all -> 0x0026 }
            goto L_0x0033
        L_0x0026:
            java.lang.String r2 = r3.f22531hZ     // Catch:{ all -> 0x002d }
            java.lang.String r0 = m26841a(r2, r0, r5, r6)     // Catch:{ all -> 0x002d }
            goto L_0x0033
        L_0x002d:
            java.lang.String r0 = m26841a(r1, r0, r5, r6)     // Catch:{ all -> 0x0032 }
            goto L_0x0033
        L_0x0032:
            r0 = r6
        L_0x0033:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "translate language = ["
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "], type = ["
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = "], key = ["
            r1.append(r4)
            r1.append(r6)
            java.lang.String r4 = "], return = ["
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = "]"
            r1.append(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.p267a.C8894b.mo58969b(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static String m26841a(String str, String str2, String str3, String str4) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return jSONObject.getJSONObject(str2).getJSONObject(f22527hW).getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE) ? jSONObject.getJSONObject(str2).getJSONObject(str3).getString(str4) : str4;
    }

    /* renamed from: bq */
    public final String mo58970bq() {
        String str = this.f22531hZ;
        return str != null ? str : f22526hV;
    }
}
