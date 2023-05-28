package com.appnext.ads.interstitial;

import android.content.Context;
import android.util.Pair;
import com.appnext.core.AppnextAd;
import com.appnext.core.C8874Ad;
import com.appnext.core.C8890a;
import com.appnext.core.C8896b;
import com.appnext.core.C8898d;
import com.appnext.core.C8917f;
import com.appnext.core.C8922g;
import com.appnext.core.C8936p;
import com.appnext.core.p267a.C8894b;
import com.appnext.core.webview.AppnextWebView;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.appnext.ads.interstitial.a */
public final class C8752a extends C8898d {

    /* renamed from: aM */
    private static final int f22210aM = 30;

    /* renamed from: cl */
    private static C8752a f22211cl;

    /* renamed from: bT */
    private String f22212bT;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> void mo58361a(String str, C8874Ad ad, T t) {
    }

    /* renamed from: G */
    public static synchronized C8752a m26507G() {
        C8752a aVar;
        synchronized (C8752a.class) {
            if (f22211cl == null) {
                f22211cl = new C8752a();
            }
            aVar = f22211cl;
        }
        return aVar;
    }

    private C8752a() {
    }

    /* renamed from: a */
    public final void mo58521a(Context context, C8874Ad ad, String str, C8898d.C8905a aVar, String str2) {
        this.f22212bT = str2;
        super.mo58982a(context, ad, str, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo58357a(Context context, C8874Ad ad, String str, ArrayList<Pair<String, String>> arrayList) {
        Object obj;
        StringBuilder sb = new StringBuilder("&auid=");
        sb.append(ad != null ? ad.getAUID() : "600");
        sb.append("&vidmin=");
        String str2 = "";
        sb.append(ad == null ? str2 : Integer.valueOf(ad.getMinVideoLength()));
        sb.append("&vidmax=");
        if (ad == null) {
            obj = str2;
        } else {
            obj = Integer.valueOf(ad.getMaxVideoLength());
        }
        sb.append(obj);
        if (this.f22212bT.equals("static")) {
            str2 = "&creative=0";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58358a(Context context, C8874Ad ad, C8890a aVar) throws Exception {
        AppnextWebView.m27061u(context).mo59087a(((Interstitial) ad).getPageUrl(), (AppnextWebView.C8967c) null);
        if (aVar != null && aVar.getAds() != null && aVar.getAds().size() > 0) {
            C8917f.m26913Y(((AppnextAd) aVar.getAds().get(0)).getImageURL());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo58354a(Context context, C8922g gVar) {
        int i;
        AppnextAd appnextAd = (AppnextAd) gVar;
        InterstitialAd interstitialAd = new InterstitialAd(appnextAd);
        if (!interstitialAd.getCampaignGoal().equals(C8894b.f22528hX) || !C8917f.m26946c(context, interstitialAd.getAdPackage())) {
            i = (!interstitialAd.getCampaignGoal().equals(C8894b.f22529hY) || C8917f.m26946c(context, interstitialAd.getAdPackage())) ? 0 : 2;
        } else {
            i = 1;
        }
        int b = m26511b(context, appnextAd);
        if (i == 0 && b == 0) {
            return 0;
        }
        return i != 0 ? i : b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58359a(C8874Ad ad, String str, String str2) {
        new StringBuilder("error ").append(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo58362a(Context context, C8874Ad ad, ArrayList<?> arrayList) {
        return mo58519a(context, (ArrayList<AppnextAd>) arrayList, ((Interstitial) ad).getCreativeType(), ad) != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C8936p mo58366c(C8874Ad ad) {
        return C8754c.m26528K();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo58523d(C8874Ad ad) {
        return mo58990h(ad) && mo58993k(ad).getAds() != null && mo58993k(ad).getAds().size() > 0 && mo58993k(ad).mo58956aU().longValue() + 300000 > System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final ArrayList<AppnextAd> mo58522b(Context context, C8874Ad ad, String str) {
        ArrayList<?> ads;
        AppnextAd a;
        if (mo58993k(ad) == null || (ads = mo58993k(ad).getAds()) == null || (a = mo58519a(context, (ArrayList<AppnextAd>) ads, str, ad)) == null) {
            return null;
        }
        ads.remove(a);
        ads.add(0, a);
        return ads;
    }

    /* renamed from: a */
    private static ArrayList<AppnextAd> m26509a(ArrayList<AppnextAd> arrayList, AppnextAd appnextAd) {
        arrayList.remove(appnextAd);
        arrayList.add(0, appnextAd);
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo58520a(ArrayList<AppnextAd> arrayList) {
        return super.mo58520a(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58360a(String str, C8874Ad ad) {
        super.mo58360a(str, ad);
    }

    private static boolean hasVideo(AppnextAd appnextAd) {
        return !appnextAd.getVideoUrl().equals("") || !appnextAd.getVideoUrlHigh().equals("") || !appnextAd.getVideoUrl30Sec().equals("") || !appnextAd.getVideoUrlHigh30Sec().equals("");
    }

    /* renamed from: c */
    private static boolean m26512c(AppnextAd appnextAd) {
        return !appnextAd.getWideImageURL().equals("");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo58519a(Context context, ArrayList<AppnextAd> arrayList, String str, C8874Ad ad) {
        Iterator<AppnextAd> it = arrayList.iterator();
        while (it.hasNext()) {
            AppnextAd next = it.next();
            if (m26510a(next, str, ad)) {
                return next;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m26510a(com.appnext.core.AppnextAd r6, java.lang.String r7, com.appnext.core.C8874Ad r8) {
        /*
            r5 = this;
            int r0 = r7.hashCode()
            r1 = -892481938(0xffffffffcacdce6e, float:-6743863.0)
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x002b
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L_0x0021
            r1 = 835260319(0x31c90f9f, float:5.851646E-9)
            if (r0 == r1) goto L_0x0017
            goto L_0x0035
        L_0x0017:
            java.lang.String r0 = "managed"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 0
            goto L_0x0036
        L_0x0021:
            java.lang.String r0 = "video"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 1
            goto L_0x0036
        L_0x002b:
            java.lang.String r0 = "static"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 2
            goto L_0x0036
        L_0x0035:
            r7 = -1
        L_0x0036:
            if (r7 == 0) goto L_0x0067
            if (r7 == r4) goto L_0x0052
            if (r7 == r3) goto L_0x003d
            goto L_0x0082
        L_0x003d:
            boolean r7 = m26512c((com.appnext.core.AppnextAd) r6)
            if (r7 == 0) goto L_0x0082
            java.lang.String r6 = r6.getBannerID()
            java.lang.String r7 = r8.getPlacementID()
            boolean r6 = m26851a((java.lang.String) r6, (java.lang.String) r7)
            if (r6 != 0) goto L_0x0082
            return r4
        L_0x0052:
            boolean r7 = hasVideo(r6)
            if (r7 == 0) goto L_0x0082
            java.lang.String r6 = r6.getBannerID()
            java.lang.String r7 = r8.getPlacementID()
            boolean r6 = m26851a((java.lang.String) r6, (java.lang.String) r7)
            if (r6 != 0) goto L_0x0082
            return r4
        L_0x0067:
            boolean r7 = m26512c((com.appnext.core.AppnextAd) r6)
            if (r7 != 0) goto L_0x0073
            boolean r7 = hasVideo(r6)
            if (r7 == 0) goto L_0x0082
        L_0x0073:
            java.lang.String r6 = r6.getBannerID()
            java.lang.String r7 = r8.getPlacementID()
            boolean r6 = m26851a((java.lang.String) r6, (java.lang.String) r7)
            if (r6 != 0) goto L_0x0082
            return r4
        L_0x0082:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.interstitial.C8752a.m26510a(com.appnext.core.AppnextAd, java.lang.String, com.appnext.core.Ad):boolean");
    }

    /* renamed from: a */
    private static int m26508a(Context context, AppnextAd appnextAd) {
        InterstitialAd interstitialAd = new InterstitialAd(appnextAd);
        if (!interstitialAd.getCampaignGoal().equals(C8894b.f22528hX) || !C8917f.m26946c(context, interstitialAd.getAdPackage())) {
            return (!interstitialAd.getCampaignGoal().equals(C8894b.f22529hY) || C8917f.m26946c(context, interstitialAd.getAdPackage())) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    private static int m26511b(Context context, AppnextAd appnextAd) {
        InterstitialAd interstitialAd = new InterstitialAd(appnextAd);
        if (!interstitialAd.getCptList().equals("") && !interstitialAd.getCptList().equals("[]")) {
            try {
                JSONArray jSONArray = new JSONArray(interstitialAd.getCptList());
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (C8917f.m26946c(context, jSONArray.getString(i))) {
                        return 0;
                    }
                }
                return 3;
            } catch (JSONException unused) {
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo58524g(C8874Ad ad) {
        if (ad != null && mo58992j(ad) == 0) {
            mo58987aW().remove(new C8896b(ad));
        }
    }
}
