package com.appnext.core;

import android.accounts.AccountManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.util.Pair;
import com.appodeal.ads.adapters.admob.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appnext.core.d */
public abstract class C8898d {

    /* renamed from: fP */
    private static final int f22536fP = 50;

    /* renamed from: fQ */
    protected final int f22537fQ = 0;

    /* renamed from: fR */
    protected final int f22538fR = 1;

    /* renamed from: fS */
    protected final int f22539fS = 2;

    /* renamed from: fT */
    protected final int f22540fT = 3;
    /* access modifiers changed from: private */

    /* renamed from: fU */
    public final HashMap<C8896b, C8890a> f22541fU = new HashMap<>();

    /* renamed from: com.appnext.core.d$a */
    public interface C8905a {
        /* renamed from: a */
        <T> void mo58343a(T t);

        void error(String str);
    }

    /* renamed from: aV */
    protected static int m26852aV() {
        return 8000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo58354a(Context context, C8922g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo58357a(Context context, C8874Ad ad, String str, ArrayList<Pair<String, String>> arrayList);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo58358a(Context context, C8874Ad ad, C8890a aVar) throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo58359a(C8874Ad ad, String str, String str2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract <T> void mo58361a(String str, C8874Ad ad, T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo58362a(Context context, C8874Ad ad, ArrayList<?> arrayList);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C8936p mo58366c(C8874Ad ad);

    /* renamed from: a */
    public final void mo58982a(Context context, C8874Ad ad, String str, C8905a aVar) {
        mo58983a(context, ad, str, aVar, true);
    }

    /* renamed from: a */
    public final void mo58983a(Context context, C8874Ad ad, String str, C8905a aVar, boolean z) {
        final C8874Ad ad2 = ad;
        final Context context2 = context;
        final C8905a aVar2 = aVar;
        final String str2 = str;
        final boolean z2 = z;
        new Thread(new Runnable() {
            public final void run() {
                try {
                    if (C8898d.this.mo58363a(ad2) || (C8898d.this.mo58990h(ad2) && C8898d.this.mo58991i(ad2))) {
                        C8898d.this.mo58358a(context2, ad2, C8898d.this.mo58993k(ad2));
                    }
                } catch (Throwable unused) {
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        try {
                            if (C8898d.this.mo58363a(ad2) || (C8898d.this.mo58990h(ad2) && C8898d.this.mo58991i(ad2))) {
                                ArrayList<?> ads = C8898d.this.mo58993k(ad2).getAds();
                                if (ads.size() == 0) {
                                    aVar2.error(AppnextError.NO_ADS);
                                    return;
                                } else if (!C8898d.this.mo58362a(context2, ad2, ads)) {
                                    C8898d.this.mo58995l(str2);
                                } else if (aVar2 != null) {
                                    aVar2.mo58343a(ads);
                                    return;
                                } else {
                                    return;
                                }
                            }
                        } catch (Throwable unused) {
                            if (aVar2 != null) {
                                aVar2.error(AppnextError.NO_ADS);
                            }
                        }
                        try {
                            if (!C8917f.m26937bd().equals("")) {
                                C8898d.this.m26855b(context2, ad2, str2, aVar2, z2);
                                return;
                            }
                            C8917f.m26951m(context2);
                            C8898d.this.m26855b(context2, ad2, str2, aVar2, z2);
                        } catch (Throwable unused2) {
                            if (aVar2 != null) {
                                aVar2.error(AppnextError.NO_ADS);
                            }
                        }
                    }
                });
            }
        }).start();
    }

    /* renamed from: b */
    private String m26854b(Context context, C8874Ad ad, String str, ArrayList<Pair<String, String>> arrayList) {
        StringBuilder sb = new StringBuilder("https://global.appnext.com/offerWallApi.aspx?ext=t&pimp=1&igroup=sdk&m=1&osid=100&s2s=1&type=json&id=");
        sb.append(str);
        sb.append("&cnt=50");
        sb.append("&tid=");
        sb.append(ad != null ? ad.getTID() : "301");
        sb.append("&vid=");
        sb.append(ad != null ? ad.getVID() : "2.5.1.472");
        sb.append("&cat=");
        String str2 = "";
        sb.append(ad != null ? ad.getCategories() : str2);
        sb.append("&pbk=");
        sb.append(ad != null ? ad.getPostback() : str2);
        sb.append("&did=");
        sb.append(C8917f.m26931b(context, Boolean.parseBoolean(mo58366c(ad).get("didPrivacy"))));
        sb.append("&devn=");
        sb.append(C8917f.m26938be());
        sb.append("&dosv=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("&dct=");
        sb.append(C8917f.m26914Z(C8917f.m26953o(context)));
        sb.append("&lang=");
        sb.append(Locale.getDefault().getLanguage());
        sb.append("&dcc=");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager.getSimState() == 5) {
            String simOperator = telephonyManager.getSimOperator();
            str2 = simOperator.substring(0, 3) + "_" + simOperator.substring(3);
        }
        sb.append(str2);
        sb.append("&dds=0");
        sb.append("&packageId=");
        sb.append(context.getPackageName());
        sb.append("&g=");
        sb.append(m26857j(context));
        sb.append("&rnd=");
        sb.append(new Random().nextInt());
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m26855b(Context context, C8874Ad ad, String str, C8905a aVar, boolean z) {
        final C8874Ad ad2 = ad;
        final Context context2 = context;
        final C8905a aVar2 = aVar;
        final String str2 = str;
        final boolean z2 = z;
        new Thread() {
            /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
                java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
                	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
                	at java.base/java.util.Objects.checkIndex(Objects.java:372)
                	at java.base/java.util.ArrayList.get(ArrayList.java:458)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
                	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
                	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
                */
            public final void run() {
                /*
                    r7 = this;
                    super.run()
                    com.appnext.core.Ad r0 = r2     // Catch:{ all -> 0x000e }
                    android.content.Context r1 = r3     // Catch:{ all -> 0x000e }
                    java.lang.String r1 = com.appnext.core.C8917f.m26957r(r1)     // Catch:{ all -> 0x000e }
                    r0.setSessionId(r1)     // Catch:{ all -> 0x000e }
                L_0x000e:
                    com.appnext.core.d r0 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x0179 }
                    java.util.HashMap r0 = r0.f22541fU     // Catch:{ all -> 0x0179 }
                    monitor-enter(r0)     // Catch:{ all -> 0x0179 }
                    com.appnext.core.d r1 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x0176 }
                    com.appnext.core.Ad r2 = r2     // Catch:{ all -> 0x0176 }
                    com.appnext.core.a r1 = r1.mo58993k(r2)     // Catch:{ all -> 0x0176 }
                    r2 = 1
                    if (r1 == 0) goto L_0x0041
                    com.appnext.core.d r1 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x0176 }
                    com.appnext.core.Ad r3 = r2     // Catch:{ all -> 0x0176 }
                    com.appnext.core.a r1 = r1.mo58993k(r3)     // Catch:{ all -> 0x0176 }
                    int r1 = r1.getState()     // Catch:{ all -> 0x0176 }
                    if (r1 != r2) goto L_0x0041
                    com.appnext.core.d$a r1 = r4     // Catch:{ all -> 0x0176 }
                    if (r1 == 0) goto L_0x003f
                    com.appnext.core.d r1 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x0176 }
                    com.appnext.core.Ad r2 = r2     // Catch:{ all -> 0x0176 }
                    com.appnext.core.a r1 = r1.mo58993k(r2)     // Catch:{ all -> 0x0176 }
                    com.appnext.core.d$a r2 = r4     // Catch:{ all -> 0x0176 }
                    r1.mo58953a((com.appnext.core.C8898d.C8905a) r2)     // Catch:{ all -> 0x0176 }
                L_0x003f:
                    monitor-exit(r0)     // Catch:{ all -> 0x0176 }
                    return
                L_0x0041:
                    com.appnext.core.a r1 = new com.appnext.core.a     // Catch:{ all -> 0x0176 }
                    r1.<init>()     // Catch:{ all -> 0x0176 }
                    com.appnext.core.d$a r3 = r4     // Catch:{ all -> 0x0176 }
                    r1.mo58953a((com.appnext.core.C8898d.C8905a) r3)     // Catch:{ all -> 0x0176 }
                    java.lang.String r3 = r5     // Catch:{ all -> 0x0176 }
                    r1.setPlacementID(r3)     // Catch:{ all -> 0x0176 }
                    r1.setState(r2)     // Catch:{ all -> 0x0176 }
                    com.appnext.core.d r2 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x0176 }
                    java.util.HashMap r2 = r2.f22541fU     // Catch:{ all -> 0x0176 }
                    com.appnext.core.b r3 = new com.appnext.core.b     // Catch:{ all -> 0x0176 }
                    com.appnext.core.Ad r4 = r2     // Catch:{ all -> 0x0176 }
                    r3.<init>(r4)     // Catch:{ all -> 0x0176 }
                    r2.remove(r3)     // Catch:{ all -> 0x0176 }
                    com.appnext.core.d r2 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x0176 }
                    com.appnext.core.Ad r3 = r2     // Catch:{ all -> 0x0176 }
                    r2.mo58984a((com.appnext.core.C8874Ad) r3, (com.appnext.core.C8890a) r1)     // Catch:{ all -> 0x0176 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0176 }
                    r0 = 0
                    java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    r1.<init>()     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    r2.<init>()     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    com.appnext.core.d r3 = com.appnext.core.C8898d.this     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    android.content.Context r4 = r3     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    com.appnext.core.Ad r5 = r2     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    java.lang.String r6 = r5     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    java.lang.String r3 = com.appnext.core.C8898d.m26848a((com.appnext.core.C8898d) r3, (android.content.Context) r4, (com.appnext.core.C8874Ad) r5, (java.lang.String) r6, (java.util.ArrayList) r1)     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    r2.append(r3)     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    com.appnext.core.d r3 = com.appnext.core.C8898d.this     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    android.content.Context r4 = r3     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    com.appnext.core.Ad r5 = r2     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    java.lang.String r6 = r5     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    java.lang.String r3 = r3.mo58357a((android.content.Context) r4, (com.appnext.core.C8874Ad) r5, (java.lang.String) r6, (java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>>) r1)     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    r2.append(r3)     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    java.lang.String r2 = r2.toString()     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    java.lang.String r4 = "AdsManager request url: "
                    r3.<init>(r4)     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    r3.append(r2)     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    r3 = 8000(0x1f40, float:1.121E-41)
                    java.lang.String r1 = com.appnext.core.C8917f.m26918a((java.lang.String) r2, (java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>>) r1, (int) r3)     // Catch:{ SocketTimeoutException -> 0x0167, UnknownHostException -> 0x0158, all -> 0x0149 }
                    java.lang.String r2 = "{}"
                    boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x0179 }
                    if (r2 != 0) goto L_0x013f
                    boolean r2 = com.appnext.core.C8898d.m26845P(r1)     // Catch:{ all -> 0x0179 }
                    if (r2 == 0) goto L_0x00b8
                    goto L_0x013f
                L_0x00b8:
                    com.appnext.core.d r2 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x0130 }
                    android.content.Context r3 = r3     // Catch:{ all -> 0x0130 }
                    com.appnext.core.Ad r4 = r2     // Catch:{ all -> 0x0130 }
                    r5 = 50
                    java.util.ArrayList r1 = r2.mo58981a((android.content.Context) r3, (com.appnext.core.C8874Ad) r4, (java.lang.String) r1, (int) r5)     // Catch:{ all -> 0x0130 }
                    int r2 = r1.size()     // Catch:{ all -> 0x0179 }
                    if (r2 != 0) goto L_0x00d4
                    com.appnext.core.d r0 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x0179 }
                    java.lang.String r1 = "No Ads"
                    com.appnext.core.Ad r2 = r2     // Catch:{ all -> 0x0179 }
                    r0.mo58988b((java.lang.String) r1, (com.appnext.core.C8874Ad) r2)     // Catch:{ all -> 0x0179 }
                    return
                L_0x00d4:
                    com.appnext.core.d r2 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x0179 }
                    com.appnext.core.Ad r3 = r2     // Catch:{ all -> 0x0179 }
                    com.appnext.core.a r2 = r2.mo58993k(r3)     // Catch:{ all -> 0x0179 }
                    r2.mo58958d(r1)     // Catch:{ all -> 0x0179 }
                    boolean r2 = r6     // Catch:{ all -> 0x0179 }
                    r3 = 2
                    if (r2 == 0) goto L_0x0113
                    com.appnext.core.d r2 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x0179 }
                    android.content.Context r4 = r3     // Catch:{ all -> 0x0179 }
                    com.appnext.core.Ad r5 = r2     // Catch:{ all -> 0x0179 }
                    boolean r1 = r2.mo58362a((android.content.Context) r4, (com.appnext.core.C8874Ad) r5, (java.util.ArrayList<?>) r1)     // Catch:{ all -> 0x0179 }
                    if (r1 != 0) goto L_0x00f7
                    com.appnext.core.d r1 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x0179 }
                    java.lang.String r2 = r5     // Catch:{ all -> 0x0179 }
                    r1.mo58995l((java.lang.String) r2)     // Catch:{ all -> 0x0179 }
                L_0x00f7:
                    r1 = 3
                    if (r0 >= r1) goto L_0x0113
                    com.appnext.core.d r1 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x010c }
                    android.content.Context r2 = r3     // Catch:{ all -> 0x010c }
                    com.appnext.core.Ad r4 = r2     // Catch:{ all -> 0x010c }
                    com.appnext.core.d r5 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x010c }
                    com.appnext.core.Ad r6 = r2     // Catch:{ all -> 0x010c }
                    com.appnext.core.a r5 = r5.mo58993k(r6)     // Catch:{ all -> 0x010c }
                    r1.mo58358a((android.content.Context) r2, (com.appnext.core.C8874Ad) r4, (com.appnext.core.C8890a) r5)     // Catch:{ all -> 0x010c }
                    goto L_0x0113
                L_0x010c:
                    r1 = move-exception
                    if (r0 == r3) goto L_0x0112
                    int r0 = r0 + 1
                    goto L_0x00f7
                L_0x0112:
                    throw r1     // Catch:{ all -> 0x0179 }
                L_0x0113:
                    com.appnext.core.d r0 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x0179 }
                    com.appnext.core.Ad r1 = r2     // Catch:{ all -> 0x0179 }
                    com.appnext.core.a r0 = r0.mo58993k(r1)     // Catch:{ all -> 0x0179 }
                    r0.setState(r3)     // Catch:{ all -> 0x0179 }
                    android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x0179 }
                    android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0179 }
                    r0.<init>(r1)     // Catch:{ all -> 0x0179 }
                    com.appnext.core.d$2$1 r1 = new com.appnext.core.d$2$1     // Catch:{ all -> 0x0179 }
                    r1.<init>()     // Catch:{ all -> 0x0179 }
                    r0.post(r1)     // Catch:{ all -> 0x0179 }
                    return
                L_0x0130:
                    r0 = move-exception
                    com.appnext.core.d r1 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x0179 }
                    java.lang.String r2 = "Internal error"
                    java.lang.String r0 = com.appnext.core.C8917f.m26933b((java.lang.Throwable) r0)     // Catch:{ all -> 0x0179 }
                    com.appnext.core.Ad r3 = r2     // Catch:{ all -> 0x0179 }
                    r1.mo58985a((java.lang.String) r2, (java.lang.String) r0, (com.appnext.core.C8874Ad) r3)     // Catch:{ all -> 0x0179 }
                    return
                L_0x013f:
                    com.appnext.core.d r0 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x0179 }
                    java.lang.String r2 = "No Ads"
                    com.appnext.core.Ad r3 = r2     // Catch:{ all -> 0x0179 }
                    r0.mo58985a((java.lang.String) r2, (java.lang.String) r1, (com.appnext.core.C8874Ad) r3)     // Catch:{ all -> 0x0179 }
                    return
                L_0x0149:
                    r0 = move-exception
                    com.appnext.core.d r1 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x0179 }
                    java.lang.String r2 = "Internal error"
                    java.lang.String r0 = com.appnext.core.C8917f.m26933b((java.lang.Throwable) r0)     // Catch:{ all -> 0x0179 }
                    com.appnext.core.Ad r3 = r2     // Catch:{ all -> 0x0179 }
                    r1.mo58985a((java.lang.String) r2, (java.lang.String) r0, (com.appnext.core.C8874Ad) r3)     // Catch:{ all -> 0x0179 }
                    return
                L_0x0158:
                    r1 = move-exception
                    com.appnext.core.d r2 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x0179 }
                    java.lang.String r3 = "Connection Error"
                    java.lang.String r1 = com.appnext.core.C8917f.m26933b((java.lang.Throwable) r1)     // Catch:{ all -> 0x0179 }
                    com.appnext.core.Ad r4 = r2     // Catch:{ all -> 0x0179 }
                    r2.mo58986a((java.lang.String) r3, (java.lang.String) r1, (com.appnext.core.C8874Ad) r4, (int) r0)     // Catch:{ all -> 0x0179 }
                    return
                L_0x0167:
                    r1 = move-exception
                    com.appnext.core.d r2 = com.appnext.core.C8898d.this     // Catch:{ all -> 0x0179 }
                    java.lang.String r3 = "Timeout"
                    java.lang.String r1 = com.appnext.core.C8917f.m26933b((java.lang.Throwable) r1)     // Catch:{ all -> 0x0179 }
                    com.appnext.core.Ad r4 = r2     // Catch:{ all -> 0x0179 }
                    r2.mo58986a((java.lang.String) r3, (java.lang.String) r1, (com.appnext.core.C8874Ad) r4, (int) r0)     // Catch:{ all -> 0x0179 }
                    return
                L_0x0176:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0176 }
                    throw r1     // Catch:{ all -> 0x0179 }
                L_0x0179:
                    r0 = move-exception
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "finished custom after load with error "
                    r1.<init>(r2)
                    java.lang.String r2 = com.appnext.core.C8917f.m26933b((java.lang.Throwable) r0)
                    r1.append(r2)
                    com.appnext.core.d r1 = com.appnext.core.C8898d.this
                    java.lang.String r0 = r0.getMessage()
                    com.appnext.core.Ad r2 = r2
                    r1.mo58988b((java.lang.String) r0, (com.appnext.core.C8874Ad) r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C8898d.C89012.run():void");
            }
        }.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo58363a(C8874Ad ad) {
        try {
            return mo58990h(ad) && mo58991i(ad);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo58990h(C8874Ad ad) {
        return (this.f22541fU == null || mo58993k(ad) == null || mo58993k(ad).getState() != 2 || mo58993k(ad).getAds() == null) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo58991i(C8874Ad ad) {
        return mo58992j(ad) == 0 ? this.f22541fU != null && mo58993k(ad) != null && mo58993k(ad).getAds().size() == 0 && mo58993k(ad).mo58956aU().longValue() + 60000 > System.currentTimeMillis() : (this.f22541fU == null || mo58993k(ad) == null || mo58993k(ad).mo58956aU().longValue() + mo58992j(ad) <= System.currentTimeMillis()) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final long mo58992j(C8874Ad ad) {
        try {
            return mo58366c(ad).get("_cachingRequest") == null ? m26846a(ad, "ads_caching_time_minutes") * 60000 : m26846a(ad, "_cachingRequest") * 1000;
        } catch (Throwable unused) {
            return m26846a(ad, "ads_caching_time_minutes") * 60000;
        }
    }

    /* renamed from: a */
    private long m26846a(C8874Ad ad, String str) {
        return Long.valueOf(mo58366c(ad).get(str)).longValue();
    }

    /* renamed from: c */
    public final void mo58989c(Context context, C8874Ad ad, String str) {
        this.f22541fU.remove(new C8896b(ad));
        m26855b(context, ad, str, (C8905a) null, true);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007f, code lost:
        if (r7.getRevenueType().equals("cpc") != false) goto L_0x0081;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<? extends com.appnext.core.C8922g> mo58981a(final android.content.Context r11, com.appnext.core.C8874Ad r12, java.lang.String r13, int r14) throws org.json.JSONException {
        /*
            r10 = this;
            com.appnext.core.a r14 = r10.mo58993k(r12)
            r14.mo58950N(r13)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r13)
            java.lang.String r13 = "apps"
            org.json.JSONArray r13 = r1.getJSONArray(r13)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0021:
            int r6 = r13.length()
            if (r1 >= r6) goto L_0x00b6
            org.json.JSONObject r6 = r13.getJSONObject(r1)
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00b2 }
            com.appnext.core.g r6 = parseAd(r6)     // Catch:{ all -> 0x00b2 }
            com.appnext.core.AppnextAd r6 = (com.appnext.core.AppnextAd) r6     // Catch:{ all -> 0x00b2 }
            int r7 = r14.size()     // Catch:{ all -> 0x00b2 }
            r6.setAdID(r7)     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = r12.getPlacementID()     // Catch:{ all -> 0x00b2 }
            r6.setPlacementID(r7)     // Catch:{ all -> 0x00b2 }
            int r7 = r10.mo58354a((android.content.Context) r11, (com.appnext.core.C8922g) r6)     // Catch:{ all -> 0x00b2 }
            if (r7 != 0) goto L_0x008b
            com.appnext.core.AppnextAd r7 = m26853b((java.util.ArrayList<com.appnext.core.AppnextAd>) r14, (com.appnext.core.AppnextAd) r6)     // Catch:{ all -> 0x00b2 }
            if (r7 == 0) goto L_0x0085
            r14.remove(r7)     // Catch:{ all -> 0x00b2 }
            java.lang.String r8 = r7.getRevenueType()     // Catch:{ all -> 0x00b2 }
            java.lang.String r9 = r6.getRevenueType()     // Catch:{ all -> 0x00b2 }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x00b2 }
            if (r8 == 0) goto L_0x0075
            java.lang.String r8 = r7.getRevenueRate()     // Catch:{ all -> 0x00b2 }
            float r8 = java.lang.Float.parseFloat(r8)     // Catch:{ all -> 0x00b2 }
            java.lang.String r9 = r6.getRevenueRate()     // Catch:{ all -> 0x00b2 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ all -> 0x00b2 }
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 < 0) goto L_0x0082
            goto L_0x0081
        L_0x0075:
            java.lang.String r8 = r7.getRevenueType()     // Catch:{ all -> 0x00b2 }
            java.lang.String r9 = "cpc"
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x00b2 }
            if (r8 == 0) goto L_0x0082
        L_0x0081:
            r6 = r7
        L_0x0082:
            int r5 = r5 + 1
            goto L_0x0087
        L_0x0085:
            int r2 = r2 + 1
        L_0x0087:
            r14.add(r6)     // Catch:{ all -> 0x00b2 }
            goto L_0x00a9
        L_0x008b:
            java.lang.String r6 = r6.getBannerID()     // Catch:{ all -> 0x00b2 }
            r0.append(r6)     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = ","
            r0.append(r6)     // Catch:{ all -> 0x00b2 }
            r6 = 1
            if (r7 == r6) goto L_0x00a7
            r6 = 2
            if (r7 == r6) goto L_0x00a4
            r6 = 3
            if (r7 == r6) goto L_0x00a1
            goto L_0x00a9
        L_0x00a1:
            int r5 = r5 + 1
            goto L_0x00a9
        L_0x00a4:
            int r4 = r4 + 1
            goto L_0x00a9
        L_0x00a7:
            int r3 = r3 + 1
        L_0x00a9:
            int r6 = r14.size()     // Catch:{ all -> 0x00b2 }
            r7 = 50
            if (r6 != r7) goto L_0x00b2
            goto L_0x00b6
        L_0x00b2:
            int r1 = r1 + 1
            goto L_0x0021
        L_0x00b6:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Filtering values {count = "
            r12.<init>(r13)
            r12.append(r2)
            java.lang.String r13 = ", new filtered = "
            r12.append(r13)
            r12.append(r3)
            java.lang.String r13 = ", existing  filtered = "
            r12.append(r13)
            r12.append(r4)
            java.lang.String r13 = ",  other = "
            r12.append(r13)
            r12.append(r5)
            java.lang.Thread r12 = new java.lang.Thread
            com.appnext.core.d$3 r13 = new com.appnext.core.d$3
            r13.<init>(r0, r11)
            r12.<init>(r13)
            r12.start()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C8898d.mo58981a(android.content.Context, com.appnext.core.Ad, java.lang.String, int):java.util.ArrayList");
    }

    /* renamed from: a */
    private static AppnextAd m26847a(AppnextAd appnextAd, AppnextAd appnextAd2) {
        return appnextAd.getRevenueType().equals(appnextAd2.getRevenueType()) ? Float.parseFloat(appnextAd.getRevenueRate()) < Float.parseFloat(appnextAd2.getRevenueRate()) ? appnextAd2 : appnextAd : appnextAd.getRevenueType().equals("cpc") ? appnextAd : appnextAd2;
    }

    /* renamed from: b */
    private static AppnextAd m26853b(ArrayList<AppnextAd> arrayList, AppnextAd appnextAd) {
        Iterator<AppnextAd> it = arrayList.iterator();
        while (it.hasNext()) {
            AppnextAd next = it.next();
            if (next.getAdPackage().equals(appnextAd.getAdPackage())) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: P */
    protected static boolean m26845P(String str) {
        try {
            return new JSONObject(str).has("rnd");
        } catch (Throwable unused) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo58520a(ArrayList<AppnextAd> arrayList) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<AppnextAd> it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(new JSONObject(it.next().getAdJSON()));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apps", jSONArray);
            return jSONObject.toString().replace(" ", "\\u2028").replace(" ", "\\u2029");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo58988b(String str, C8874Ad ad) {
        mo58985a(str, "", ad);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58985a(String str, String str2, C8874Ad ad) {
        mo58986a(str, str2, ad, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58986a(String str, String str2, C8874Ad ad, int i) {
        final C8874Ad ad2 = ad;
        final int i2 = i;
        final String str3 = str;
        final String str4 = str2;
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                C8890a k = C8898d.this.mo58993k(ad2);
                if (k != null) {
                    if (k.getAds() == null) {
                        k.mo58958d(new ArrayList());
                    } else {
                        k.mo58958d(k.getAds());
                    }
                    k.setState(i2);
                    k.mo58951O(str3);
                    C8898d dVar = C8898d.this;
                    C8874Ad ad = ad2;
                    dVar.mo58359a(ad, str3 + " " + str4, k.getPlacementID());
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C8890a mo58993k(C8874Ad ad) {
        return this.f22541fU.get(new C8896b(ad));
    }

    /* access modifiers changed from: protected */
    /* renamed from: aW */
    public final HashMap<C8896b, C8890a> mo58987aW() {
        return this.f22541fU;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58984a(C8874Ad ad, C8890a aVar) {
        this.f22541fU.put(new C8896b(ad), aVar);
    }

    /* renamed from: d */
    public static String m26856d(AppnextAd appnextAd) {
        return appnextAd.getAdJSON();
    }

    /* renamed from: l */
    public final String mo58994l(C8874Ad ad) {
        return mo58993k(ad).mo58949A();
    }

    public static C8922g parseAd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            AppnextAd appnextAd = (AppnextAd) C8931l.m26972a((Class<?>) AppnextAd.class, jSONObject);
            if (appnextAd != null) {
                appnextAd.setAdJSON(jSONObject.toString());
                if (jSONObject.has("sid")) {
                    appnextAd.setSession(jSONObject.getString("sid"));
                }
                if (appnextAd.getStoreRating().equals("")) {
                    appnextAd.setStoreRating(BuildConfig.ADAPTER_VERSION);
                }
            }
            return appnextAd;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    protected static boolean m26851a(String str, String str2) {
        return C8925j.m26963bj().mo59033o(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo58995l(String str) {
        C8925j.m26963bj().mo59029ab(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo58360a(String str, C8874Ad ad) {
        C8925j.m26963bj().mo59032n(str, ad.getPlacementID());
    }

    /* renamed from: j */
    protected static int m26857j(Context context) {
        try {
            if (C8917f.m26927a(context, "android.permission.READ_CONTACTS") && C8917f.m26927a(context, "android.permission.GET_ACCOUNTS")) {
                return AccountManager.get(context).getAccountsByType("com.google").length > 0 ? 0 : 1;
            }
        } catch (Throwable unused) {
        }
        return 2;
    }

    /* renamed from: a */
    static /* synthetic */ String m26848a(C8898d dVar, Context context, C8874Ad ad, String str, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder("https://global.appnext.com/offerWallApi.aspx?ext=t&pimp=1&igroup=sdk&m=1&osid=100&s2s=1&type=json&id=");
        sb.append(str);
        sb.append("&cnt=50");
        sb.append("&tid=");
        sb.append(ad != null ? ad.getTID() : "301");
        sb.append("&vid=");
        sb.append(ad != null ? ad.getVID() : "2.5.1.472");
        sb.append("&cat=");
        String str2 = "";
        sb.append(ad != null ? ad.getCategories() : str2);
        sb.append("&pbk=");
        sb.append(ad != null ? ad.getPostback() : str2);
        sb.append("&did=");
        sb.append(C8917f.m26931b(context, Boolean.parseBoolean(dVar.mo58366c(ad).get("didPrivacy"))));
        sb.append("&devn=");
        sb.append(C8917f.m26938be());
        sb.append("&dosv=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("&dct=");
        sb.append(C8917f.m26914Z(C8917f.m26953o(context)));
        sb.append("&lang=");
        sb.append(Locale.getDefault().getLanguage());
        sb.append("&dcc=");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager.getSimState() == 5) {
            String simOperator = telephonyManager.getSimOperator();
            str2 = simOperator.substring(0, 3) + "_" + simOperator.substring(3);
        }
        sb.append(str2);
        sb.append("&dds=0");
        sb.append("&packageId=");
        sb.append(context.getPackageName());
        sb.append("&g=");
        sb.append(m26857j(context));
        sb.append("&rnd=");
        sb.append(new Random().nextInt());
        return sb.toString();
    }
}
