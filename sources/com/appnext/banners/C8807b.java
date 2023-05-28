package com.appnext.banners;

import android.content.Context;
import android.util.Pair;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C8874Ad;
import com.appnext.core.C8890a;
import com.appnext.core.C8898d;
import com.appnext.core.C8917f;
import com.appnext.core.C8922g;
import com.appnext.core.C8936p;
import com.appnext.core.p267a.C8894b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.appnext.banners.b */
final class C8807b extends C8898d {

    /* renamed from: de */
    private static C8807b f22306de;

    /* renamed from: aM */
    private final int f22307aM = 50;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> void mo58361a(String str, C8874Ad ad, T t) {
    }

    /* renamed from: R */
    public static synchronized C8807b m26543R() {
        C8807b bVar;
        synchronized (C8807b.class) {
            if (f22306de == null) {
                f22306de = new C8807b();
            }
            bVar = f22306de;
        }
        return bVar;
    }

    private C8807b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo58357a(Context context, C8874Ad ad, String str, ArrayList<Pair<String, String>> arrayList) {
        StringBuilder sb = new StringBuilder("&auid=");
        sb.append(ad != null ? ad.getAUID() : "1000");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo58649a(Context context, C8874Ad ad, String str, C8898d.C8905a aVar, BannerAdRequest bannerAdRequest) {
        ((BannerAd) ad).setAdRequest(new BannerAdRequest(bannerAdRequest));
        super.mo58982a(context, ad, str, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58358a(Context context, C8874Ad ad, C8890a aVar) throws Exception {
        AppnextAd a = mo58646a(context, ad, ((BannerAdRequest) ((BannerAd) ad).getAdRequest()).getCreativeType());
        if (a != null) {
            C8917f.m26913Y(a.getImageURL());
            if (ad instanceof MediumRectangleAd) {
                C8917f.m26913Y(a.getWideImageURL());
                return;
            }
            return;
        }
        throw new Exception(AppnextError.NO_ADS);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo58354a(Context context, C8922g gVar) {
        BannerAdData bannerAdData = new BannerAdData((AppnextAd) gVar);
        int a = m26544a(context, bannerAdData);
        if (a != 0) {
            return a;
        }
        if (!bannerAdData.getCampaignGoal().equals(C8894b.f22528hX) || !C8917f.m26946c(context, bannerAdData.getAdPackage())) {
            return (!bannerAdData.getCampaignGoal().equals(C8894b.f22529hY) || C8917f.m26946c(context, bannerAdData.getAdPackage())) ? 0 : 1;
        }
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58359a(C8874Ad ad, String str, String str2) {
        new StringBuilder("error ").append(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C8936p mo58366c(C8874Ad ad) {
        return C8809d.m26560S();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo58362a(Context context, C8874Ad ad, ArrayList<?> arrayList) {
        return mo58647a(context, ad, arrayList, ((BannerAdRequest) ((BannerAd) ad).getAdRequest()).getCreativeType()) != null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (hasVideo(r0) == false) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0008 A[LOOP:0: B:4:0x0008->B:40:0x0008, LOOP_END, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0085 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.appnext.core.AppnextAd mo58648a(android.content.Context r8, com.appnext.core.C8874Ad r9, java.util.ArrayList<?> r10, java.lang.String r11, java.util.ArrayList<java.lang.String> r12) {
        /*
            r7 = this;
            r8 = 0
            if (r10 != 0) goto L_0x0004
            return r8
        L_0x0004:
            java.util.Iterator r10 = r10.iterator()
        L_0x0008:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r10.next()
            com.appnext.core.AppnextAd r0 = (com.appnext.core.AppnextAd) r0
            boolean r1 = r9 instanceof com.appnext.banners.MediumRectangleAd
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x006a
            r1 = -1
            int r4 = r11.hashCode()
            r5 = -892481938(0xffffffffcacdce6e, float:-6743863.0)
            r6 = 2
            if (r4 == r5) goto L_0x0044
            r5 = 96673(0x179a1, float:1.35468E-40)
            if (r4 == r5) goto L_0x003a
            r5 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r4 == r5) goto L_0x0030
            goto L_0x004d
        L_0x0030:
            java.lang.String r4 = "video"
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x004d
            r1 = 2
            goto L_0x004d
        L_0x003a:
            java.lang.String r4 = "all"
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x004d
            r1 = 0
            goto L_0x004d
        L_0x0044:
            java.lang.String r4 = "static"
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x004d
            r1 = 1
        L_0x004d:
            if (r1 == 0) goto L_0x005e
            if (r1 == r3) goto L_0x0059
            if (r1 == r6) goto L_0x0054
            goto L_0x006b
        L_0x0054:
            boolean r2 = hasVideo(r0)
            goto L_0x006b
        L_0x0059:
            boolean r2 = m26546c((com.appnext.core.AppnextAd) r0)
            goto L_0x006b
        L_0x005e:
            boolean r1 = m26546c((com.appnext.core.AppnextAd) r0)
            if (r1 != 0) goto L_0x006a
            boolean r1 = hasVideo(r0)
            if (r1 == 0) goto L_0x006b
        L_0x006a:
            r2 = 1
        L_0x006b:
            if (r2 == 0) goto L_0x0008
            java.lang.String r1 = r0.getBannerID()
            java.lang.String r2 = r9.getPlacementID()
            boolean r1 = m26851a((java.lang.String) r1, (java.lang.String) r2)
            if (r1 != 0) goto L_0x0008
            java.lang.String r1 = r0.getBannerID()
            boolean r1 = r12.contains(r1)
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0086:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.C8807b.mo58648a(android.content.Context, com.appnext.core.Ad, java.util.ArrayList, java.lang.String, java.util.ArrayList):com.appnext.core.AppnextAd");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo58647a(Context context, C8874Ad ad, ArrayList<?> arrayList, String str) {
        return mo58648a(context, ad, arrayList, str, (ArrayList<String>) new ArrayList());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo58646a(Context context, C8874Ad ad, String str) {
        ArrayList<?> ads;
        if (mo58993k(ad) == null || (ads = mo58993k(ad).getAds()) == null) {
            return null;
        }
        return mo58647a(context, ad, ads, str);
    }

    /* renamed from: a */
    private static boolean m26545a(C8874Ad ad, AppnextAd appnextAd, String str) {
        if (ad instanceof MediumRectangleAd) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -892481938) {
                if (hashCode != 96673) {
                    if (hashCode == 112202875 && str.equals("video")) {
                        c = 2;
                    }
                } else if (str.equals(BannerAdRequest.TYPE_ALL)) {
                    c = 0;
                }
            } else if (str.equals("static")) {
                c = 1;
            }
            if (c != 0) {
                if (c == 1) {
                    return m26546c(appnextAd);
                }
                if (c != 2) {
                    return false;
                }
                return hasVideo(appnextAd);
            } else if (m26546c(appnextAd) || hasVideo(appnextAd)) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final ArrayList<AppnextAd> mo58650f(C8874Ad ad) {
        return mo58993k(ad).getAds();
    }

    /* renamed from: a */
    private static int m26544a(Context context, BannerAdData bannerAdData) {
        if (!bannerAdData.getCptList().equals("") && !bannerAdData.getCptList().equals("[]")) {
            try {
                JSONArray jSONArray = new JSONArray(bannerAdData.getCptList());
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

    static boolean hasVideo(AppnextAd appnextAd) {
        return !appnextAd.getVideoUrl().equals("") || !appnextAd.getVideoUrlHigh().equals("") || !appnextAd.getVideoUrl30Sec().equals("") || !appnextAd.getVideoUrlHigh30Sec().equals("");
    }

    /* renamed from: c */
    static boolean m26546c(AppnextAd appnextAd) {
        return !appnextAd.getWideImageURL().equals("");
    }
}
