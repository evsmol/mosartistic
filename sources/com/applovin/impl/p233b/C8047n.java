package com.applovin.impl.p233b;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.C8571h;
import com.applovin.impl.sdk.utils.C8622s;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.b.n */
public class C8047n {

    /* renamed from: a */
    private List<C8050o> f19487a = Collections.emptyList();

    /* renamed from: b */
    private List<String> f19488b = Collections.emptyList();

    /* renamed from: c */
    private int f19489c;

    /* renamed from: d */
    private Uri f19490d;

    /* renamed from: e */
    private final Set<C8044k> f19491e = new HashSet();

    /* renamed from: f */
    private C8039g f19492f;

    /* renamed from: g */
    private final Map<String, Set<C8044k>> f19493g = CollectionUtils.map();

    /* renamed from: com.applovin.impl.b.n$a */
    public enum C8049a {
        UNSPECIFIED,
        LOW,
        MEDIUM,
        HIGH
    }

    private C8047n() {
    }

    private C8047n(C8037e eVar) {
        this.f19488b = eVar.mo55900g();
    }

    /* renamed from: a */
    private static int m23966a(String str, C8490n nVar) {
        try {
            List<String> explode = CollectionUtils.explode(str, ":");
            if (explode.size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds((long) StringUtils.parseInt(explode.get(0))) + TimeUnit.MINUTES.toSeconds((long) StringUtils.parseInt(explode.get(1))) + ((long) StringUtils.parseInt(explode.get(2))));
            }
        } catch (Throwable unused) {
            nVar.mo57320D();
            if (C8626v.m26252a()) {
                C8626v D = nVar.mo57320D();
                D.mo57822e("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
        r0 = r0.mo57796b("Icon");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.applovin.impl.p233b.C8047n m23967a(com.applovin.impl.sdk.utils.C8622s r4, com.applovin.impl.p233b.C8047n r5, com.applovin.impl.p233b.C8037e r6, com.applovin.impl.sdk.C8490n r7) {
        /*
            if (r4 == 0) goto L_0x00d9
            if (r6 == 0) goto L_0x00d1
            if (r7 == 0) goto L_0x00c9
            if (r5 == 0) goto L_0x0009
            goto L_0x000e
        L_0x0009:
            com.applovin.impl.b.n r5 = new com.applovin.impl.b.n     // Catch:{ all -> 0x00b2 }
            r5.<init>(r6)     // Catch:{ all -> 0x00b2 }
        L_0x000e:
            int r0 = r5.f19489c     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = "Duration"
            com.applovin.impl.sdk.utils.s r0 = r4.mo57796b(r0)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = r0.mo57799c()     // Catch:{ all -> 0x00b2 }
            int r0 = m23966a((java.lang.String) r0, (com.applovin.impl.sdk.C8490n) r7)     // Catch:{ all -> 0x00b2 }
            if (r0 <= 0) goto L_0x0026
            r5.f19489c = r0     // Catch:{ all -> 0x00b2 }
        L_0x0026:
            java.lang.String r0 = "MediaFiles"
            com.applovin.impl.sdk.utils.s r0 = r4.mo57796b(r0)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x0045
            java.util.List r0 = m23968a((com.applovin.impl.sdk.utils.C8622s) r0, (com.applovin.impl.sdk.C8490n) r7)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x0045
            int r1 = r0.size()     // Catch:{ all -> 0x00b2 }
            if (r1 <= 0) goto L_0x0045
            java.util.List<com.applovin.impl.b.o> r1 = r5.f19487a     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x0043
            java.util.List<com.applovin.impl.b.o> r1 = r5.f19487a     // Catch:{ all -> 0x00b2 }
            r0.addAll(r1)     // Catch:{ all -> 0x00b2 }
        L_0x0043:
            r5.f19487a = r0     // Catch:{ all -> 0x00b2 }
        L_0x0045:
            java.lang.String r0 = "VideoClicks"
            com.applovin.impl.sdk.utils.s r0 = r4.mo57796b(r0)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x0074
            android.net.Uri r1 = r5.f19490d     // Catch:{ all -> 0x00b2 }
            if (r1 != 0) goto L_0x0069
            java.lang.String r1 = "ClickThrough"
            com.applovin.impl.sdk.utils.s r1 = r0.mo57796b(r1)     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x0069
            java.lang.String r1 = r1.mo57799c()     // Catch:{ all -> 0x00b2 }
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x0069
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ all -> 0x00b2 }
            r5.f19490d = r1     // Catch:{ all -> 0x00b2 }
        L_0x0069:
            java.lang.String r1 = "ClickTracking"
            java.util.List r0 = r0.mo57795a(r1)     // Catch:{ all -> 0x00b2 }
            java.util.Set<com.applovin.impl.b.k> r1 = r5.f19491e     // Catch:{ all -> 0x00b2 }
            com.applovin.impl.p233b.C8046m.m23957a((java.util.List<com.applovin.impl.sdk.utils.C8622s>) r0, (java.util.Set<com.applovin.impl.p233b.C8044k>) r1, (com.applovin.impl.p233b.C8037e) r6, (com.applovin.impl.sdk.C8490n) r7)     // Catch:{ all -> 0x00b2 }
        L_0x0074:
            java.lang.String r0 = "Icons"
            com.applovin.impl.sdk.utils.s r0 = r4.mo57796b(r0)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00ac
            java.lang.String r1 = "Icon"
            com.applovin.impl.sdk.utils.s r0 = r0.mo57796b(r1)     // Catch:{ all -> 0x00b2 }
            com.applovin.impl.b.g r1 = com.applovin.impl.p233b.C8039g.m23924a(r0, r7)     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x00ac
            java.lang.String r2 = "IconClicks"
            com.applovin.impl.sdk.utils.s r2 = r0.mo57796b(r2)     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x009d
            java.lang.String r3 = "IconClickTracking"
            java.util.List r2 = r2.mo57795a(r3)     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x009d
            java.util.Set<com.applovin.impl.b.k> r3 = r1.f19461a     // Catch:{ all -> 0x00b2 }
            com.applovin.impl.p233b.C8046m.m23957a((java.util.List<com.applovin.impl.sdk.utils.C8622s>) r2, (java.util.Set<com.applovin.impl.p233b.C8044k>) r3, (com.applovin.impl.p233b.C8037e) r6, (com.applovin.impl.sdk.C8490n) r7)     // Catch:{ all -> 0x00b2 }
        L_0x009d:
            java.lang.String r2 = "IconViewTracking"
            java.util.List r0 = r0.mo57795a(r2)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00aa
            java.util.Set<com.applovin.impl.b.k> r2 = r1.f19462b     // Catch:{ all -> 0x00b2 }
            com.applovin.impl.p233b.C8046m.m23957a((java.util.List<com.applovin.impl.sdk.utils.C8622s>) r0, (java.util.Set<com.applovin.impl.p233b.C8044k>) r2, (com.applovin.impl.p233b.C8037e) r6, (com.applovin.impl.sdk.C8490n) r7)     // Catch:{ all -> 0x00b2 }
        L_0x00aa:
            r5.f19492f = r1     // Catch:{ all -> 0x00b2 }
        L_0x00ac:
            java.util.Map<java.lang.String, java.util.Set<com.applovin.impl.b.k>> r0 = r5.f19493g     // Catch:{ all -> 0x00b2 }
            com.applovin.impl.p233b.C8046m.m23956a((com.applovin.impl.sdk.utils.C8622s) r4, (java.util.Map<java.lang.String, java.util.Set<com.applovin.impl.p233b.C8044k>>) r0, (com.applovin.impl.p233b.C8037e) r6, (com.applovin.impl.sdk.C8490n) r7)     // Catch:{ all -> 0x00b2 }
            return r5
        L_0x00b2:
            r4 = move-exception
            r7.mo57320D()
            boolean r5 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r5 == 0) goto L_0x00c7
            com.applovin.impl.sdk.v r5 = r7.mo57320D()
            java.lang.String r6 = "VastVideoCreative"
            java.lang.String r7 = "Error occurred while initializing"
            r5.mo57819b(r6, r7, r4)
        L_0x00c7:
            r4 = 0
            return r4
        L_0x00c9:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "No sdk specified."
            r4.<init>(r5)
            throw r4
        L_0x00d1:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "No context specified."
            r4.<init>(r5)
            throw r4
        L_0x00d9:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "No node specified."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.p233b.C8047n.m23967a(com.applovin.impl.sdk.utils.s, com.applovin.impl.b.n, com.applovin.impl.b.e, com.applovin.impl.sdk.n):com.applovin.impl.b.n");
    }

    /* renamed from: a */
    private static List<C8050o> m23968a(C8622s sVar, C8490n nVar) {
        List<C8622s> a = sVar.mo57795a("MediaFile");
        ArrayList arrayList = new ArrayList(a.size());
        List<String> explode = CollectionUtils.explode((String) nVar.mo57342a(C8380b.f20953et));
        List<String> explode2 = CollectionUtils.explode((String) nVar.mo57342a(C8380b.f20952es));
        for (C8622s a2 : a) {
            C8050o a3 = C8050o.m23978a(a2, nVar);
            if (a3 != null) {
                try {
                    String c = a3.mo55947c();
                    if (!StringUtils.isValidString(c) || explode.contains(c)) {
                        if (((Boolean) nVar.mo57342a(C8380b.f20954eu)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(a3.mo55946b().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !explode2.contains(fileExtensionFromUrl)) {
                            }
                        }
                        nVar.mo57320D();
                        if (C8626v.m26252a()) {
                            C8626v D = nVar.mo57320D();
                            D.mo57821d("VastVideoCreative", "Video file not supported: " + a3);
                        }
                    }
                    arrayList.add(a3);
                } catch (Throwable th) {
                    nVar.mo57320D();
                    if (C8626v.m26252a()) {
                        C8626v D2 = nVar.mo57320D();
                        D2.mo57819b("VastVideoCreative", "Failed to validate video file: " + a3, th);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C8050o mo55932a(C8049a aVar) {
        List<C8050o> list = this.f19487a;
        if (list == null || list.size() == 0) {
            return null;
        }
        List arrayList = new ArrayList(3);
        for (String next : this.f19488b) {
            for (C8050o next2 : this.f19487a) {
                String c = next2.mo55947c();
                if (StringUtils.isValidString(c) && next.equalsIgnoreCase(c)) {
                    arrayList.add(next2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.f19487a;
        }
        if (C8571h.m26085c()) {
            Collections.sort(arrayList, new Comparator<C8050o>() {
                /* renamed from: a */
                public int compare(C8050o oVar, C8050o oVar2) {
                    return Integer.compare(oVar.mo55948d(), oVar2.mo55948d());
                }
            });
        }
        return (C8050o) arrayList.get(aVar == C8049a.LOW ? 0 : aVar == C8049a.MEDIUM ? arrayList.size() / 2 : arrayList.size() - 1);
    }

    /* renamed from: a */
    public List<C8050o> mo55933a() {
        return this.f19487a;
    }

    /* renamed from: b */
    public int mo55934b() {
        return this.f19489c;
    }

    /* renamed from: c */
    public Uri mo55935c() {
        return this.f19490d;
    }

    /* renamed from: d */
    public Set<C8044k> mo55936d() {
        return this.f19491e;
    }

    /* renamed from: e */
    public Map<String, Set<C8044k>> mo55937e() {
        return this.f19493g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8047n)) {
            return false;
        }
        C8047n nVar = (C8047n) obj;
        if (this.f19489c != nVar.f19489c) {
            return false;
        }
        List<C8050o> list = this.f19487a;
        if (list == null ? nVar.f19487a != null : !list.equals(nVar.f19487a)) {
            return false;
        }
        Uri uri = this.f19490d;
        if (uri == null ? nVar.f19490d != null : !uri.equals(nVar.f19490d)) {
            return false;
        }
        Set<C8044k> set = this.f19491e;
        if (set == null ? nVar.f19491e != null : !set.equals(nVar.f19491e)) {
            return false;
        }
        Map<String, Set<C8044k>> map = this.f19493g;
        Map<String, Set<C8044k>> map2 = nVar.f19493g;
        return map != null ? map.equals(map2) : map2 == null;
    }

    /* renamed from: f */
    public C8039g mo55939f() {
        return this.f19492f;
    }

    public int hashCode() {
        List<C8050o> list = this.f19487a;
        int i = 0;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f19489c) * 31;
        Uri uri = this.f19490d;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set<C8044k> set = this.f19491e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<C8044k>> map = this.f19493g;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f19487a + ", durationSeconds=" + this.f19489c + ", destinationUri=" + this.f19490d + ", clickTrackers=" + this.f19491e + ", eventTrackers=" + this.f19493g + ", industryIcon=" + this.f19492f + '}';
    }
}
