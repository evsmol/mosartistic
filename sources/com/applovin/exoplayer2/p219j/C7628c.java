package com.applovin.exoplayer2.p219j;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.applovin.exoplayer2.C6829as;
import com.applovin.exoplayer2.C6830at;
import com.applovin.exoplayer2.C6904ba;
import com.applovin.exoplayer2.C7397g;
import com.applovin.exoplayer2.C7819p;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.common.p183a.C6955ai;
import com.applovin.exoplayer2.common.p183a.C7024n;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.common.p184b.C7056c;
import com.applovin.exoplayer2.p206h.C7482ac;
import com.applovin.exoplayer2.p206h.C7483ad;
import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p219j.C7624a;
import com.applovin.exoplayer2.p219j.C7637d;
import com.applovin.exoplayer2.p219j.C7641f;
import com.applovin.exoplayer2.p219j.C7645i;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7731c;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.applovin.exoplayer2.j.c */
public class C7628c extends C7641f {

    /* renamed from: a */
    private static final int[] f17847a = new int[0];
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C6955ai<Integer> f17848b = C6955ai.m18543a($$Lambda$c$4xbF8OqnmTEoiz3euTy2hplaWE.INSTANCE);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C6955ai<Integer> f17849c = C6955ai.m18543a($$Lambda$c$Ti2fJ5tN6kmXzPDhz55fk55b2Qg.INSTANCE);

    /* renamed from: d */
    private final C7637d.C7639b f17850d;

    /* renamed from: e */
    private final AtomicReference<C7632c> f17851e;

    /* renamed from: com.applovin.exoplayer2.j.c$a */
    protected static final class C7630a implements Comparable<C7630a> {

        /* renamed from: a */
        public final boolean f17852a;

        /* renamed from: b */
        private final String f17853b;

        /* renamed from: c */
        private final C7632c f17854c;

        /* renamed from: d */
        private final boolean f17855d;

        /* renamed from: e */
        private final int f17856e;

        /* renamed from: f */
        private final int f17857f;

        /* renamed from: g */
        private final int f17858g;

        /* renamed from: h */
        private final int f17859h;

        /* renamed from: i */
        private final int f17860i;

        /* renamed from: j */
        private final boolean f17861j;

        /* renamed from: k */
        private final int f17862k;

        /* renamed from: l */
        private final int f17863l;

        /* renamed from: m */
        private final int f17864m;

        /* renamed from: n */
        private final int f17865n;

        public C7630a(C7864v vVar, C7632c cVar, int i) {
            int i2;
            int i3;
            int i4;
            this.f17854c = cVar;
            this.f17853b = C7628c.m21759a(vVar.f18912c);
            int i5 = 0;
            this.f17855d = C7628c.m21762a(i, false);
            int i6 = 0;
            while (true) {
                i2 = Integer.MAX_VALUE;
                if (i6 >= cVar.f17939C.size()) {
                    i6 = Integer.MAX_VALUE;
                    i3 = 0;
                    break;
                }
                i3 = C7628c.m21754a(vVar, (String) cVar.f17939C.get(i6), false);
                if (i3 > 0) {
                    break;
                }
                i6++;
            }
            this.f17857f = i6;
            this.f17856e = i3;
            this.f17858g = Integer.bitCount(vVar.f18914e & cVar.f17940D);
            boolean z = true;
            this.f17861j = (vVar.f18913d & 1) != 0;
            this.f17862k = vVar.f18934y;
            this.f17863l = vVar.f18935z;
            this.f17864m = vVar.f18917h;
            if ((vVar.f18917h != -1 && vVar.f18917h > cVar.f17942F) || (vVar.f18934y != -1 && vVar.f18934y > cVar.f17941E)) {
                z = false;
            }
            this.f17852a = z;
            String[] d = C7728ai.m22255d();
            int i7 = 0;
            while (true) {
                if (i7 >= d.length) {
                    i7 = Integer.MAX_VALUE;
                    i4 = 0;
                    break;
                }
                i4 = C7628c.m21754a(vVar, d[i7], false);
                if (i4 > 0) {
                    break;
                }
                i7++;
            }
            this.f17859h = i7;
            this.f17860i = i4;
            while (true) {
                if (i5 < cVar.f17943G.size()) {
                    if (vVar.f18921l != null && vVar.f18921l.equals(cVar.f17943G.get(i5))) {
                        i2 = i5;
                        break;
                    }
                    i5++;
                } else {
                    break;
                }
            }
            this.f17865n = i2;
        }

        /* renamed from: a */
        public int compareTo(C7630a aVar) {
            C6955ai a = (!this.f17852a || !this.f17855d) ? C7628c.f17848b.mo53225a() : C7628c.f17848b;
            C7024n a2 = C7024n.m18757a().mo53505b(this.f17855d, aVar.f17855d).mo53502a(Integer.valueOf(this.f17857f), Integer.valueOf(aVar.f17857f), C6955ai.m18544b().mo53225a()).mo53500a(this.f17856e, aVar.f17856e).mo53500a(this.f17858g, aVar.f17858g).mo53505b(this.f17852a, aVar.f17852a).mo53502a(Integer.valueOf(this.f17865n), Integer.valueOf(aVar.f17865n), C6955ai.m18544b().mo53225a()).mo53502a(Integer.valueOf(this.f17864m), Integer.valueOf(aVar.f17864m), this.f17854c.f17947K ? C7628c.f17848b.mo53225a() : C7628c.f17849c).mo53505b(this.f17861j, aVar.f17861j).mo53502a(Integer.valueOf(this.f17859h), Integer.valueOf(aVar.f17859h), C6955ai.m18544b().mo53225a()).mo53500a(this.f17860i, aVar.f17860i).mo53502a(Integer.valueOf(this.f17862k), Integer.valueOf(aVar.f17862k), a).mo53502a(Integer.valueOf(this.f17863l), Integer.valueOf(aVar.f17863l), a);
            Integer valueOf = Integer.valueOf(this.f17864m);
            Integer valueOf2 = Integer.valueOf(aVar.f17864m);
            if (!C7728ai.m22218a((Object) this.f17853b, (Object) aVar.f17853b)) {
                a = C7628c.f17849c;
            }
            return a2.mo53502a(valueOf, valueOf2, a).mo53504b();
        }
    }

    /* renamed from: com.applovin.exoplayer2.j.c$b */
    protected static final class C7631b implements Comparable<C7631b> {

        /* renamed from: a */
        private final boolean f17866a;

        /* renamed from: b */
        private final boolean f17867b;

        public C7631b(C7864v vVar, int i) {
            this.f17866a = (vVar.f18913d & 1) == 0 ? false : true;
            this.f17867b = C7628c.m21762a(i, false);
        }

        /* renamed from: a */
        public int compareTo(C7631b bVar) {
            return C7024n.m18757a().mo53505b(this.f17867b, bVar.f17867b).mo53505b(this.f17866a, bVar.f17866a).mo53504b();
        }
    }

    /* renamed from: com.applovin.exoplayer2.j.c$c */
    public static final class C7632c extends C7645i implements C7397g {

        /* renamed from: a */
        public static final C7632c f17868a;
        @Deprecated

        /* renamed from: b */
        public static final C7632c f17869b;

        /* renamed from: n */
        public static final C7397g.C7398a<C7632c> f17870n = $$Lambda$c$c$M4Smkgd59ZHfilEXWTqvoG6Lks.INSTANCE;

        /* renamed from: O */
        private final SparseArray<Map<C7483ad, C7634e>> f17871O;

        /* renamed from: P */
        private final SparseBooleanArray f17872P;

        /* renamed from: c */
        public final int f17873c;

        /* renamed from: d */
        public final boolean f17874d;

        /* renamed from: e */
        public final boolean f17875e;

        /* renamed from: f */
        public final boolean f17876f;

        /* renamed from: g */
        public final boolean f17877g;

        /* renamed from: h */
        public final boolean f17878h;

        /* renamed from: i */
        public final boolean f17879i;

        /* renamed from: j */
        public final boolean f17880j;

        /* renamed from: k */
        public final boolean f17881k;

        /* renamed from: l */
        public final boolean f17882l;

        /* renamed from: m */
        public final boolean f17883m;

        static {
            C7632c a = new C7633d().mo54843b();
            f17868a = a;
            f17869b = a;
        }

        private C7632c(C7633d dVar) {
            super(dVar);
            this.f17874d = dVar.f17884a;
            this.f17875e = dVar.f17885b;
            this.f17876f = dVar.f17886c;
            this.f17877g = dVar.f17887d;
            this.f17878h = dVar.f17888e;
            this.f17879i = dVar.f17889f;
            this.f17880j = dVar.f17890g;
            this.f17873c = dVar.f17891h;
            this.f17881k = dVar.f17892i;
            this.f17882l = dVar.f17893j;
            this.f17883m = dVar.f17894k;
            this.f17871O = dVar.f17895l;
            this.f17872P = dVar.f17896m;
        }

        /* renamed from: a */
        public static C7632c m21781a(Context context) {
            return new C7633d(context).mo54843b();
        }

        /* renamed from: a */
        private static boolean m21783a(SparseArray<Map<C7483ad, C7634e>> sparseArray, SparseArray<Map<C7483ad, C7634e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !m21785a(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        private static boolean m21784a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean m21785a(java.util.Map<com.applovin.exoplayer2.p206h.C7483ad, com.applovin.exoplayer2.p219j.C7628c.C7634e> r4, java.util.Map<com.applovin.exoplayer2.p206h.C7483ad, com.applovin.exoplayer2.p219j.C7628c.C7634e> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto L_0x000c
                return r2
            L_0x000c:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x0014:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                com.applovin.exoplayer2.h.ad r1 = (com.applovin.exoplayer2.p206h.C7483ad) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L_0x003a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = com.applovin.exoplayer2.p221l.C7728ai.m22218a((java.lang.Object) r0, (java.lang.Object) r1)
                if (r0 != 0) goto L_0x0014
            L_0x003a:
                return r2
            L_0x003b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p219j.C7628c.C7632c.m21785a(java.util.Map, java.util.Map):boolean");
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static String m21787d(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: a */
        public final boolean mo54827a(int i) {
            return this.f17872P.get(i);
        }

        /* renamed from: a */
        public final boolean mo54828a(int i, C7483ad adVar) {
            Map map = this.f17871O.get(i);
            return map != null && map.containsKey(adVar);
        }

        /* renamed from: b */
        public final C7634e mo54829b(int i, C7483ad adVar) {
            Map map = this.f17871O.get(i);
            if (map != null) {
                return (C7634e) map.get(adVar);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7632c cVar = (C7632c) obj;
            return super.equals(cVar) && this.f17874d == cVar.f17874d && this.f17875e == cVar.f17875e && this.f17876f == cVar.f17876f && this.f17877g == cVar.f17877g && this.f17878h == cVar.f17878h && this.f17879i == cVar.f17879i && this.f17880j == cVar.f17880j && this.f17873c == cVar.f17873c && this.f17881k == cVar.f17881k && this.f17882l == cVar.f17882l && this.f17883m == cVar.f17883m && m21784a(this.f17872P, cVar.f17872P) && m21783a(this.f17871O, cVar.f17871O);
        }

        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f17874d ? 1 : 0)) * 31) + (this.f17875e ? 1 : 0)) * 31) + (this.f17876f ? 1 : 0)) * 31) + (this.f17877g ? 1 : 0)) * 31) + (this.f17878h ? 1 : 0)) * 31) + (this.f17879i ? 1 : 0)) * 31) + (this.f17880j ? 1 : 0)) * 31) + this.f17873c) * 31) + (this.f17881k ? 1 : 0)) * 31) + (this.f17882l ? 1 : 0)) * 31) + (this.f17883m ? 1 : 0);
        }
    }

    /* renamed from: com.applovin.exoplayer2.j.c$d */
    public static final class C7633d extends C7645i.C7646a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f17884a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f17885b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f17886c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f17887d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f17888e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f17889f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f17890g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f17891h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f17892i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public boolean f17893j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f17894k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public final SparseArray<Map<C7483ad, C7634e>> f17895l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public final SparseBooleanArray f17896m;

        @Deprecated
        public C7633d() {
            this.f17895l = new SparseArray<>();
            this.f17896m = new SparseBooleanArray();
            m21795c();
        }

        public C7633d(Context context) {
            super(context);
            this.f17895l = new SparseArray<>();
            this.f17896m = new SparseBooleanArray();
            m21795c();
        }

        private C7633d(Bundle bundle) {
            super(bundle);
            C7632c cVar = C7632c.f17868a;
            mo54838a(bundle.getBoolean(C7632c.m21787d(1000), cVar.f17874d));
            mo54839b(bundle.getBoolean(C7632c.m21787d(1001), cVar.f17875e));
            mo54844c(bundle.getBoolean(C7632c.m21787d(1002), cVar.f17876f));
            mo54845d(bundle.getBoolean(C7632c.m21787d(1003), cVar.f17877g));
            mo54846e(bundle.getBoolean(C7632c.m21787d(1004), cVar.f17878h));
            mo54847f(bundle.getBoolean(C7632c.m21787d(1005), cVar.f17879i));
            mo54848g(bundle.getBoolean(C7632c.m21787d(1006), cVar.f17880j));
            mo54833a(bundle.getInt(C7632c.m21787d(IronSourceError.AUCTION_REQUEST_ERROR_MISSING_PARAMS), cVar.f17873c));
            mo54849h(bundle.getBoolean(C7632c.m21787d(IronSourceError.AUCTION_ERROR_DECOMPRESSION), cVar.f17881k));
            mo54850i(bundle.getBoolean(C7632c.m21787d(1009), cVar.f17882l));
            mo54851j(bundle.getBoolean(C7632c.m21787d(1010), cVar.f17883m));
            this.f17895l = new SparseArray<>();
            m21792a(bundle);
            this.f17896m = m21791a(bundle.getIntArray(C7632c.m21787d(1014)));
        }

        /* renamed from: a */
        private SparseBooleanArray m21791a(int[] iArr) {
            if (iArr == null) {
                return new SparseBooleanArray();
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
            for (int append : iArr) {
                sparseBooleanArray.append(append, true);
            }
            return sparseBooleanArray;
        }

        /* renamed from: a */
        private void m21792a(Bundle bundle) {
            int[] intArray = bundle.getIntArray(C7632c.m21787d(IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND));
            List<C7483ad> a = C7731c.m22275a(C7483ad.f17173c, (List<Bundle>) bundle.getParcelableArrayList(C7632c.m21787d(1012)), C7033s.m18803g());
            SparseArray<C7634e> a2 = C7731c.m22272a(C7634e.f17897e, (SparseArray<Bundle>) bundle.getSparseParcelableArray(C7632c.m21787d(1013)), new SparseArray());
            if (intArray != null && intArray.length == a.size()) {
                for (int i = 0; i < intArray.length; i++) {
                    mo54835a(intArray[i], a.get(i), a2.get(i));
                }
            }
        }

        /* renamed from: c */
        private void m21795c() {
            this.f17884a = true;
            this.f17885b = false;
            this.f17886c = true;
            this.f17887d = true;
            this.f17888e = false;
            this.f17889f = false;
            this.f17890g = false;
            this.f17891h = 0;
            this.f17892i = true;
            this.f17893j = false;
            this.f17894k = true;
        }

        /* renamed from: a */
        public C7632c mo54843b() {
            return new C7632c(this);
        }

        /* renamed from: a */
        public C7633d mo54833a(int i) {
            this.f17891h = i;
            return this;
        }

        /* renamed from: a */
        public C7633d mo54840b(int i, int i2, boolean z) {
            super.mo54840b(i, i2, z);
            return this;
        }

        /* renamed from: a */
        public final C7633d mo54835a(int i, C7483ad adVar, C7634e eVar) {
            Map map = this.f17895l.get(i);
            if (map == null) {
                map = new HashMap();
                this.f17895l.put(i, map);
            }
            if (map.containsKey(adVar) && C7728ai.m22218a(map.get(adVar), (Object) eVar)) {
                return this;
            }
            map.put(adVar, eVar);
            return this;
        }

        /* renamed from: a */
        public C7633d mo54841b(Context context) {
            super.mo54841b(context);
            return this;
        }

        /* renamed from: a */
        public C7633d mo54842b(Context context, boolean z) {
            super.mo54842b(context, z);
            return this;
        }

        /* renamed from: a */
        public C7633d mo54838a(boolean z) {
            this.f17884a = z;
            return this;
        }

        /* renamed from: b */
        public C7633d mo54839b(boolean z) {
            this.f17885b = z;
            return this;
        }

        /* renamed from: c */
        public C7633d mo54844c(boolean z) {
            this.f17886c = z;
            return this;
        }

        /* renamed from: d */
        public C7633d mo54845d(boolean z) {
            this.f17887d = z;
            return this;
        }

        /* renamed from: e */
        public C7633d mo54846e(boolean z) {
            this.f17888e = z;
            return this;
        }

        /* renamed from: f */
        public C7633d mo54847f(boolean z) {
            this.f17889f = z;
            return this;
        }

        /* renamed from: g */
        public C7633d mo54848g(boolean z) {
            this.f17890g = z;
            return this;
        }

        /* renamed from: h */
        public C7633d mo54849h(boolean z) {
            this.f17892i = z;
            return this;
        }

        /* renamed from: i */
        public C7633d mo54850i(boolean z) {
            this.f17893j = z;
            return this;
        }

        /* renamed from: j */
        public C7633d mo54851j(boolean z) {
            this.f17894k = z;
            return this;
        }
    }

    /* renamed from: com.applovin.exoplayer2.j.c$e */
    public static final class C7634e implements C7397g {

        /* renamed from: e */
        public static final C7397g.C7398a<C7634e> f17897e = $$Lambda$c$e$WLJC6HBk1Rzojf3dltgOntUrnkk.INSTANCE;

        /* renamed from: a */
        public final int f17898a;

        /* renamed from: b */
        public final int[] f17899b;

        /* renamed from: c */
        public final int f17900c;

        /* renamed from: d */
        public final int f17901d;

        public C7634e(int i, int[] iArr, int i2) {
            this.f17898a = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f17899b = copyOf;
            this.f17900c = iArr.length;
            this.f17901d = i2;
            Arrays.sort(copyOf);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ C7634e m21827a(Bundle bundle) {
            boolean z = false;
            int i = bundle.getInt(m21828a(0), -1);
            int[] intArray = bundle.getIntArray(m21828a(1));
            int i2 = bundle.getInt(m21828a(2), -1);
            if (i >= 0 && i2 >= 0) {
                z = true;
            }
            C7717a.m22118a(z);
            C7717a.m22120b(intArray);
            return new C7634e(i, intArray, i2);
        }

        /* renamed from: a */
        private static String m21828a(int i) {
            return Integer.toString(i, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7634e eVar = (C7634e) obj;
            return this.f17898a == eVar.f17898a && Arrays.equals(this.f17899b, eVar.f17899b) && this.f17901d == eVar.f17901d;
        }

        public int hashCode() {
            return (((this.f17898a * 31) + Arrays.hashCode(this.f17899b)) * 31) + this.f17901d;
        }
    }

    /* renamed from: com.applovin.exoplayer2.j.c$f */
    protected static final class C7635f implements Comparable<C7635f> {

        /* renamed from: a */
        public final boolean f17902a;

        /* renamed from: b */
        private final boolean f17903b;

        /* renamed from: c */
        private final boolean f17904c;

        /* renamed from: d */
        private final boolean f17905d;

        /* renamed from: e */
        private final int f17906e;

        /* renamed from: f */
        private final int f17907f;

        /* renamed from: g */
        private final int f17908g;

        /* renamed from: h */
        private final int f17909h;

        /* renamed from: i */
        private final boolean f17910i;

        public C7635f(C7864v vVar, C7632c cVar, int i, String str) {
            int i2;
            boolean z = false;
            this.f17903b = C7628c.m21762a(i, false);
            int i3 = vVar.f18913d & (~cVar.f17873c);
            this.f17904c = (i3 & 1) != 0;
            this.f17905d = (i3 & 2) != 0;
            int i4 = Integer.MAX_VALUE;
            C7033s a = cVar.f17944H.isEmpty() ? C7033s.m18793a("") : cVar.f17944H;
            int i5 = 0;
            while (true) {
                if (i5 >= a.size()) {
                    i2 = 0;
                    break;
                }
                i2 = C7628c.m21754a(vVar, (String) a.get(i5), cVar.f17946J);
                if (i2 > 0) {
                    i4 = i5;
                    break;
                }
                i5++;
            }
            this.f17906e = i4;
            this.f17907f = i2;
            this.f17908g = Integer.bitCount(vVar.f18914e & cVar.f17945I);
            this.f17910i = (vVar.f18914e & 1088) != 0;
            this.f17909h = C7628c.m21754a(vVar, str, C7628c.m21759a(str) == null);
            if (this.f17907f > 0 || ((cVar.f17944H.isEmpty() && this.f17908g > 0) || this.f17904c || (this.f17905d && this.f17909h > 0))) {
                z = true;
            }
            this.f17902a = z;
        }

        /* renamed from: a */
        public int compareTo(C7635f fVar) {
            C7024n a = C7024n.m18757a().mo53505b(this.f17903b, fVar.f17903b).mo53502a(Integer.valueOf(this.f17906e), Integer.valueOf(fVar.f17906e), C6955ai.m18544b().mo53225a()).mo53500a(this.f17907f, fVar.f17907f).mo53500a(this.f17908g, fVar.f17908g).mo53505b(this.f17904c, fVar.f17904c).mo53502a(Boolean.valueOf(this.f17905d), Boolean.valueOf(fVar.f17905d), this.f17907f == 0 ? C6955ai.m18544b() : C6955ai.m18544b().mo53225a()).mo53500a(this.f17909h, fVar.f17909h);
            if (this.f17908g == 0) {
                a = a.mo53503a(this.f17910i, fVar.f17910i);
            }
            return a.mo53504b();
        }
    }

    /* renamed from: com.applovin.exoplayer2.j.c$g */
    protected static final class C7636g implements Comparable<C7636g> {

        /* renamed from: a */
        public final boolean f17911a;

        /* renamed from: b */
        private final C7632c f17912b;

        /* renamed from: c */
        private final boolean f17913c;

        /* renamed from: d */
        private final boolean f17914d;

        /* renamed from: e */
        private final int f17915e;

        /* renamed from: f */
        private final int f17916f;

        /* renamed from: g */
        private final int f17917g;

        public C7636g(C7864v vVar, C7632c cVar, int i, boolean z) {
            this.f17912b = cVar;
            boolean z2 = true;
            int i2 = 0;
            this.f17911a = z && (vVar.f18926q == -1 || vVar.f18926q <= cVar.f17950q) && ((vVar.f18927r == -1 || vVar.f18927r <= cVar.f17951r) && ((vVar.f18928s == -1.0f || vVar.f18928s <= ((float) cVar.f17952s)) && (vVar.f18917h == -1 || vVar.f18917h <= cVar.f17953t)));
            if (!z || ((vVar.f18926q != -1 && vVar.f18926q < cVar.f17954u) || ((vVar.f18927r != -1 && vVar.f18927r < cVar.f17955v) || ((vVar.f18928s != -1.0f && vVar.f18928s < ((float) cVar.f17956w)) || (vVar.f18917h != -1 && vVar.f18917h < cVar.f17957x))))) {
                z2 = false;
            }
            this.f17913c = z2;
            this.f17914d = C7628c.m21762a(i, false);
            this.f17915e = vVar.f18917h;
            this.f17916f = vVar.mo55411b();
            int i3 = Integer.MAX_VALUE;
            while (true) {
                if (i2 < cVar.f17938B.size()) {
                    if (vVar.f18921l != null && vVar.f18921l.equals(cVar.f17938B.get(i2))) {
                        i3 = i2;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            this.f17917g = i3;
        }

        /* renamed from: a */
        public int compareTo(C7636g gVar) {
            C6955ai a = (!this.f17911a || !this.f17914d) ? C7628c.f17848b.mo53225a() : C7628c.f17848b;
            return C7024n.m18757a().mo53505b(this.f17914d, gVar.f17914d).mo53505b(this.f17911a, gVar.f17911a).mo53505b(this.f17913c, gVar.f17913c).mo53502a(Integer.valueOf(this.f17917g), Integer.valueOf(gVar.f17917g), C6955ai.m18544b().mo53225a()).mo53502a(Integer.valueOf(this.f17915e), Integer.valueOf(gVar.f17915e), this.f17912b.f17947K ? C7628c.f17848b.mo53225a() : C7628c.f17849c).mo53502a(Integer.valueOf(this.f17916f), Integer.valueOf(gVar.f17916f), a).mo53502a(Integer.valueOf(this.f17915e), Integer.valueOf(gVar.f17915e), a).mo53504b();
        }
    }

    @Deprecated
    public C7628c() {
        this(C7632c.f17868a, (C7637d.C7639b) new C7624a.C7626b());
    }

    public C7628c(Context context) {
        this(context, (C7637d.C7639b) new C7624a.C7626b());
    }

    public C7628c(Context context, C7637d.C7639b bVar) {
        this(C7632c.m21781a(context), bVar);
    }

    public C7628c(C7632c cVar, C7637d.C7639b bVar) {
        this.f17850d = bVar;
        this.f17851e = new AtomicReference<>(cVar);
    }

    /* renamed from: a */
    private static int m21753a(C7482ac acVar, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List<Integer> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int intValue = list.get(i11).intValue();
            if (m21764a(acVar.mo54479a(intValue), str, iArr[intValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                i10++;
            }
        }
        return i10;
    }

    /* renamed from: a */
    protected static int m21754a(C7864v vVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(vVar.f18912c)) {
            return 4;
        }
        String a = m21759a(str);
        String a2 = m21759a(vVar.f18912c);
        if (a2 == null || a == null) {
            return (!z || a2 != null) ? 0 : 1;
        }
        if (a2.startsWith(a) || a.startsWith(a2)) {
            return 3;
        }
        return C7728ai.m22242b(a2, "-")[0].equals(C7728ai.m22242b(a, "-")[0]) ? 2 : 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m21755a(Integer num, Integer num2) {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 != r3) goto L_0x0013;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Point m21756a(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L_0x0010
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            if (r4 <= r5) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            if (r1 == r3) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0013:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L_0x0023
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = com.applovin.exoplayer2.p221l.C7728ai.m22179a((int) r0, (int) r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0023:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.applovin.exoplayer2.p221l.C7728ai.m22179a((int) r3, (int) r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p219j.C7628c.m21756a(boolean, int, int, int, int):android.graphics.Point");
    }

    /* renamed from: a */
    private static C7637d.C7638a m21757a(C7483ad adVar, int[][] iArr, int i, C7632c cVar) {
        C7483ad adVar2 = adVar;
        C7632c cVar2 = cVar;
        int i2 = cVar2.f17876f ? 24 : 16;
        boolean z = cVar2.f17875e && (i & i2) != 0;
        int i3 = 0;
        while (i3 < adVar2.f17174b) {
            C7482ac a = adVar2.mo54483a(i3);
            int[] iArr2 = iArr[i3];
            int i4 = cVar2.f17950q;
            int i5 = cVar2.f17951r;
            int i6 = cVar2.f17952s;
            int i7 = cVar2.f17953t;
            int i8 = cVar2.f17954u;
            int i9 = cVar2.f17955v;
            int i10 = cVar2.f17956w;
            int i11 = cVar2.f17957x;
            int i12 = cVar2.f17958y;
            int i13 = cVar2.f17959z;
            boolean z2 = cVar2.f17937A;
            C7482ac acVar = a;
            int i14 = i3;
            int[] a2 = m21767a(a, iArr2, z, i2, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, z2);
            if (a2.length > 0) {
                return new C7637d.C7638a(acVar, a2);
            }
            i3 = i14 + 1;
            adVar2 = adVar;
            cVar2 = cVar;
        }
        return null;
    }

    /* renamed from: a */
    private static C7637d.C7638a m21758a(C7483ad adVar, int[][] iArr, C7632c cVar) {
        C7483ad adVar2 = adVar;
        C7632c cVar2 = cVar;
        int i = -1;
        C7482ac acVar = null;
        C7636g gVar = null;
        for (int i2 = 0; i2 < adVar2.f17174b; i2++) {
            C7482ac a = adVar2.mo54483a(i2);
            List<Integer> a2 = m21760a(a, cVar2.f17958y, cVar2.f17959z, cVar2.f17937A);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < a.f17169a; i3++) {
                C7864v a3 = a.mo54479a(i3);
                if ((a3.f18914e & 16384) == 0 && m21762a(iArr2[i3], cVar2.f17881k)) {
                    C7636g gVar2 = new C7636g(a3, cVar2, iArr2[i3], a2.contains(Integer.valueOf(i3)));
                    if ((gVar2.f17911a || cVar2.f17874d) && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        acVar = a;
                        i = i3;
                        gVar = gVar2;
                    }
                }
            }
        }
        if (acVar == null) {
            return null;
        }
        return new C7637d.C7638a(acVar, i);
    }

    /* renamed from: a */
    protected static String m21759a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    private static List<Integer> m21760a(C7482ac acVar, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList(acVar.f17169a);
        for (int i3 = 0; i3 < acVar.f17169a; i3++) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (!(i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE)) {
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < acVar.f17169a; i5++) {
                C7864v a = acVar.mo54479a(i5);
                if (a.f18926q > 0 && a.f18927r > 0) {
                    Point a2 = m21756a(z, i, i2, a.f18926q, a.f18927r);
                    int i6 = a.f18926q * a.f18927r;
                    if (a.f18926q >= ((int) (((float) a2.x) * 0.98f)) && a.f18927r >= ((int) (((float) a2.y) * 0.98f)) && i6 < i4) {
                        i4 = i6;
                    }
                }
            }
            if (i4 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int b = acVar.mo54479a(((Integer) arrayList.get(size)).intValue()).mo55411b();
                    if (b == -1 || b > i4) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m21761a(C7641f.C7642a aVar, int[][][] iArr, C6830at[] atVarArr, C7637d[] dVarArr) {
        boolean z;
        boolean z2 = false;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            if (i >= aVar.mo54860a()) {
                z = true;
                break;
            }
            int a = aVar.mo54861a(i);
            C7637d dVar = dVarArr[i];
            if ((a == 1 || a == 2) && dVar != null && m21765a(iArr[i], aVar.mo54862b(i), dVar)) {
                if (a == 1) {
                    if (i3 != -1) {
                        break;
                    }
                    i3 = i;
                } else if (i2 != -1) {
                    break;
                } else {
                    i2 = i;
                }
            }
            i++;
        }
        z = false;
        if (!(i3 == -1 || i2 == -1)) {
            z2 = true;
        }
        if (z && z2) {
            C6830at atVar = new C6830at(true);
            atVarArr[i3] = atVar;
            atVarArr[i2] = atVar;
        }
    }

    /* renamed from: a */
    protected static boolean m21762a(int i, boolean z) {
        int c = C6829as.CC.m17729c(i);
        return c == 4 || (z && c == 3);
    }

    /* renamed from: a */
    private static boolean m21763a(C7864v vVar, int i, C7864v vVar2, int i2, boolean z, boolean z2, boolean z3) {
        if (!m21762a(i, false) || vVar.f18917h == -1 || vVar.f18917h > i2) {
            return false;
        }
        if (!z3 && (vVar.f18934y == -1 || vVar.f18934y != vVar2.f18934y)) {
            return false;
        }
        if (z || (vVar.f18921l != null && TextUtils.equals(vVar.f18921l, vVar2.f18921l))) {
            return z2 || (vVar.f18935z != -1 && vVar.f18935z == vVar2.f18935z);
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m21764a(C7864v vVar, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if ((vVar.f18914e & 16384) != 0 || !m21762a(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !C7728ai.m22218a((Object) vVar.f18921l, (Object) str)) {
            return false;
        }
        if (vVar.f18926q != -1 && (i7 > vVar.f18926q || vVar.f18926q > i3)) {
            return false;
        }
        if (vVar.f18927r == -1 || (i8 <= vVar.f18927r && vVar.f18927r <= i4)) {
            return (vVar.f18928s == -1.0f || (((float) i9) <= vVar.f18928s && vVar.f18928s <= ((float) i5))) && vVar.f18917h != -1 && i10 <= vVar.f18917h && vVar.f18917h <= i6;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m21765a(int[][] iArr, C7483ad adVar, C7637d dVar) {
        if (dVar == null) {
            return false;
        }
        int a = adVar.mo54482a(dVar.mo54809d());
        for (int i = 0; i < dVar.mo54810e(); i++) {
            if (C6829as.CC.m17730d(iArr[a][dVar.mo54808b(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static int[] m21766a(C7482ac acVar, int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3) {
        C7482ac acVar2 = acVar;
        int i3 = i;
        C7864v a = acVar.mo54479a(i);
        int[] iArr2 = new int[acVar2.f17169a];
        int i4 = 0;
        for (int i5 = 0; i5 < acVar2.f17169a; i5++) {
            if (i5 == i3 || m21763a(acVar.mo54479a(i5), iArr[i5], a, i2, z, z2, z3)) {
                iArr2[i4] = i5;
                i4++;
            }
        }
        return Arrays.copyOf(iArr2, i4);
    }

    /* renamed from: a */
    private static int[] m21767a(C7482ac acVar, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z2) {
        String str;
        HashSet hashSet;
        int i12;
        int i13;
        C7482ac acVar2 = acVar;
        if (acVar2.f17169a < 2) {
            return f17847a;
        }
        List<Integer> a = m21760a(acVar2, i10, i11, z2);
        if (a.size() < 2) {
            return f17847a;
        }
        if (!z) {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i14 = 0;
            int i15 = 0;
            while (i15 < a.size()) {
                String str3 = acVar2.mo54479a(a.get(i15).intValue()).f18921l;
                if (hashSet2.add(str3)) {
                    String str4 = str3;
                    i13 = i14;
                    i12 = i15;
                    hashSet = hashSet2;
                    int a2 = m21753a(acVar, iArr, i, str3, i2, i3, i4, i5, i6, i7, i8, i9, a);
                    if (a2 > i13) {
                        i14 = a2;
                        str2 = str4;
                        i15 = i12 + 1;
                        hashSet2 = hashSet;
                    }
                } else {
                    i13 = i14;
                    i12 = i15;
                    hashSet = hashSet2;
                }
                i14 = i13;
                i15 = i12 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        } else {
            str = null;
        }
        m21770b(acVar, iArr, i, str, i2, i3, i4, i5, i6, i7, i8, i9, a);
        return a.size() < 2 ? f17847a : C7056c.m18929a((Collection<? extends Number>) a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ int m21768b(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    /* renamed from: b */
    private static void m21770b(C7482ac acVar, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List<Integer> list) {
        List<Integer> list2 = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list2.get(size).intValue();
            if (!m21764a(acVar.mo54479a(intValue), str, iArr[intValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                list2.remove(size);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Pair<C7637d.C7638a, C7635f> mo54816a(C7483ad adVar, int[][] iArr, C7632c cVar, String str) throws C7819p {
        C7483ad adVar2 = adVar;
        C7632c cVar2 = cVar;
        int i = -1;
        C7482ac acVar = null;
        C7635f fVar = null;
        for (int i2 = 0; i2 < adVar2.f17174b; i2++) {
            C7482ac a = adVar2.mo54483a(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < a.f17169a; i3++) {
                if (m21762a(iArr2[i3], cVar2.f17881k)) {
                    C7635f fVar2 = new C7635f(a.mo54479a(i3), cVar2, iArr2[i3], str);
                    if (fVar2.f17902a && (fVar == null || fVar2.compareTo(fVar) > 0)) {
                        acVar = a;
                        i = i3;
                        fVar = fVar2;
                    }
                } else {
                    String str2 = str;
                }
            }
            String str3 = str;
        }
        if (acVar == null) {
            return null;
        }
        return Pair.create(new C7637d.C7638a(acVar, i), (C7635f) C7717a.m22120b(fVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Pair<C6830at[], C7637d[]> mo54817a(C7641f.C7642a aVar, int[][][] iArr, int[] iArr2, C7509p.C7510a aVar2, C6904ba baVar) throws C7819p {
        C7632c cVar = this.f17851e.get();
        int a = aVar.mo54860a();
        C7637d.C7638a[] a2 = mo54821a(aVar, iArr, iArr2, cVar);
        int i = 0;
        while (true) {
            C7637d.C7638a aVar3 = null;
            if (i >= a) {
                break;
            }
            int a3 = aVar.mo54861a(i);
            if (cVar.mo54827a(i) || cVar.f17949M.contains(Integer.valueOf(a3))) {
                a2[i] = null;
            } else {
                C7483ad b = aVar.mo54862b(i);
                if (cVar.mo54828a(i, b)) {
                    C7634e b2 = cVar.mo54829b(i, b);
                    if (b2 != null) {
                        aVar3 = new C7637d.C7638a(b.mo54483a(b2.f17898a), b2.f17899b, b2.f17901d);
                    }
                    a2[i] = aVar3;
                }
            }
            i++;
        }
        C7637d[] a4 = this.f17850d.mo54805a(a2, mo54867d(), aVar2, baVar);
        C6830at[] atVarArr = new C6830at[a];
        for (int i2 = 0; i2 < a; i2++) {
            boolean z = true;
            if ((cVar.mo54827a(i2) || cVar.f17949M.contains(Integer.valueOf(aVar.mo54861a(i2)))) || (aVar.mo54861a(i2) != -2 && a4[i2] == null)) {
                z = false;
            }
            atVarArr[i2] = z ? C6830at.f14873a : null;
        }
        if (cVar.f17882l) {
            m21761a(aVar, iArr, atVarArr, a4);
        }
        return Pair.create(atVarArr, a4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7637d.C7638a mo54818a(int i, C7483ad adVar, int[][] iArr, C7632c cVar) throws C7819p {
        C7482ac acVar = null;
        C7631b bVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < adVar.f17174b; i3++) {
            C7482ac a = adVar.mo54483a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < a.f17169a; i4++) {
                if (m21762a(iArr2[i4], cVar.f17881k)) {
                    C7631b bVar2 = new C7631b(a.mo54479a(i4), iArr2[i4]);
                    if (bVar == null || bVar2.compareTo(bVar) > 0) {
                        acVar = a;
                        i2 = i4;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (acVar == null) {
            return null;
        }
        return new C7637d.C7638a(acVar, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7637d.C7638a mo54819a(C7483ad adVar, int[][] iArr, int i, C7632c cVar, boolean z) throws C7819p {
        C7637d.C7638a a = (cVar.f17948L || cVar.f17947K || !z) ? null : m21757a(adVar, iArr, i, cVar);
        return a == null ? m21758a(adVar, iArr, cVar) : a;
    }

    /* renamed from: a */
    public boolean mo54820a() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.applovin.exoplayer2.j.c$a} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.exoplayer2.p219j.C7637d.C7638a[] mo54821a(com.applovin.exoplayer2.p219j.C7641f.C7642a r22, int[][][] r23, int[] r24, com.applovin.exoplayer2.p219j.C7628c.C7632c r25) throws com.applovin.exoplayer2.C7819p {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            r8 = r25
            int r9 = r22.mo54860a()
            com.applovin.exoplayer2.j.d$a[] r10 = new com.applovin.exoplayer2.p219j.C7637d.C7638a[r9]
            r11 = 0
            r0 = 0
            r12 = 0
            r13 = 0
        L_0x0010:
            r14 = 2
            r15 = 1
            if (r12 >= r9) goto L_0x0044
            int r1 = r7.mo54861a(r12)
            if (r14 != r1) goto L_0x0041
            if (r0 != 0) goto L_0x0036
            com.applovin.exoplayer2.h.ad r1 = r7.mo54862b(r12)
            r2 = r23[r12]
            r3 = r24[r12]
            r5 = 1
            r0 = r21
            r4 = r25
            com.applovin.exoplayer2.j.d$a r0 = r0.mo54819a((com.applovin.exoplayer2.p206h.C7483ad) r1, (int[][]) r2, (int) r3, (com.applovin.exoplayer2.p219j.C7628c.C7632c) r4, (boolean) r5)
            r10[r12] = r0
            r0 = r10[r12]
            if (r0 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            com.applovin.exoplayer2.h.ad r1 = r7.mo54862b(r12)
            int r1 = r1.f17174b
            if (r1 <= 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r15 = 0
        L_0x0040:
            r13 = r13 | r15
        L_0x0041:
            int r12 = r12 + 1
            goto L_0x0010
        L_0x0044:
            r12 = -1
            r16 = 0
            r3 = r16
            r4 = r3
            r2 = -1
            r5 = 0
        L_0x004c:
            if (r5 >= r9) goto L_0x00b7
            int r0 = r7.mo54861a(r5)
            if (r15 != r0) goto L_0x00a8
            boolean r0 = r8.f17883m
            if (r0 != 0) goto L_0x005e
            if (r13 != 0) goto L_0x005b
            goto L_0x005e
        L_0x005b:
            r17 = 0
            goto L_0x0060
        L_0x005e:
            r17 = 1
        L_0x0060:
            com.applovin.exoplayer2.h.ad r1 = r7.mo54862b(r5)
            r18 = r23[r5]
            r19 = r24[r5]
            r0 = r21
            r14 = r2
            r2 = r18
            r15 = r3
            r3 = r19
            r20 = r4
            r4 = r25
            r19 = r5
            r5 = r17
            android.util.Pair r0 = r0.mo54822b(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00ae
            if (r15 == 0) goto L_0x008a
            java.lang.Object r1 = r0.second
            com.applovin.exoplayer2.j.c$a r1 = (com.applovin.exoplayer2.p219j.C7628c.C7630a) r1
            int r1 = r1.compareTo(r15)
            if (r1 <= 0) goto L_0x00ae
        L_0x008a:
            if (r14 == r12) goto L_0x008e
            r10[r14] = r16
        L_0x008e:
            java.lang.Object r1 = r0.first
            com.applovin.exoplayer2.j.d$a r1 = (com.applovin.exoplayer2.p219j.C7637d.C7638a) r1
            r10[r19] = r1
            com.applovin.exoplayer2.h.ac r2 = r1.f17918a
            int[] r1 = r1.f17919b
            r1 = r1[r11]
            com.applovin.exoplayer2.v r1 = r2.mo54479a((int) r1)
            java.lang.String r4 = r1.f18912c
            java.lang.Object r0 = r0.second
            r3 = r0
            com.applovin.exoplayer2.j.c$a r3 = (com.applovin.exoplayer2.p219j.C7628c.C7630a) r3
            r2 = r19
            goto L_0x00b2
        L_0x00a8:
            r14 = r2
            r15 = r3
            r20 = r4
            r19 = r5
        L_0x00ae:
            r2 = r14
            r3 = r15
            r4 = r20
        L_0x00b2:
            int r5 = r19 + 1
            r14 = 2
            r15 = 1
            goto L_0x004c
        L_0x00b7:
            r20 = r4
            r0 = r16
            r1 = -1
        L_0x00bc:
            if (r11 >= r9) goto L_0x010d
            int r2 = r7.mo54861a(r11)
            r3 = 1
            if (r2 == r3) goto L_0x0105
            r4 = 2
            if (r2 == r4) goto L_0x0102
            r5 = 3
            if (r2 == r5) goto L_0x00d8
            com.applovin.exoplayer2.h.ad r5 = r7.mo54862b(r11)
            r13 = r23[r11]
            com.applovin.exoplayer2.j.d$a r2 = r6.mo54818a((int) r2, (com.applovin.exoplayer2.p206h.C7483ad) r5, (int[][]) r13, (com.applovin.exoplayer2.p219j.C7628c.C7632c) r8)
            r10[r11] = r2
            goto L_0x0102
        L_0x00d8:
            com.applovin.exoplayer2.h.ad r2 = r7.mo54862b(r11)
            r5 = r23[r11]
            r13 = r20
            android.util.Pair r2 = r6.mo54816a((com.applovin.exoplayer2.p206h.C7483ad) r2, (int[][]) r5, (com.applovin.exoplayer2.p219j.C7628c.C7632c) r8, (java.lang.String) r13)
            if (r2 == 0) goto L_0x0108
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r5 = r2.second
            com.applovin.exoplayer2.j.c$f r5 = (com.applovin.exoplayer2.p219j.C7628c.C7635f) r5
            int r5 = r5.compareTo(r0)
            if (r5 <= 0) goto L_0x0108
        L_0x00f2:
            if (r1 == r12) goto L_0x00f6
            r10[r1] = r16
        L_0x00f6:
            java.lang.Object r0 = r2.first
            com.applovin.exoplayer2.j.d$a r0 = (com.applovin.exoplayer2.p219j.C7637d.C7638a) r0
            r10[r11] = r0
            java.lang.Object r0 = r2.second
            com.applovin.exoplayer2.j.c$f r0 = (com.applovin.exoplayer2.p219j.C7628c.C7635f) r0
            r1 = r11
            goto L_0x0108
        L_0x0102:
            r13 = r20
            goto L_0x0108
        L_0x0105:
            r13 = r20
            r4 = 2
        L_0x0108:
            int r11 = r11 + 1
            r20 = r13
            goto L_0x00bc
        L_0x010d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p219j.C7628c.mo54821a(com.applovin.exoplayer2.j.f$a, int[][][], int[], com.applovin.exoplayer2.j.c$c):com.applovin.exoplayer2.j.d$a[]");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Pair<C7637d.C7638a, C7630a> mo54822b(C7483ad adVar, int[][] iArr, int i, C7632c cVar, boolean z) throws C7819p {
        C7483ad adVar2 = adVar;
        C7632c cVar2 = cVar;
        C7637d.C7638a aVar = null;
        C7630a aVar2 = null;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < adVar2.f17174b; i4++) {
            C7482ac a = adVar2.mo54483a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < a.f17169a; i5++) {
                if (m21762a(iArr2[i5], cVar2.f17881k)) {
                    C7630a aVar3 = new C7630a(a.mo54479a(i5), cVar2, iArr2[i5]);
                    if ((aVar3.f17852a || cVar2.f17877g) && (aVar2 == null || aVar3.compareTo(aVar2) > 0)) {
                        i2 = i4;
                        i3 = i5;
                        aVar2 = aVar3;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        C7482ac a2 = adVar2.mo54483a(i2);
        if (!cVar2.f17948L && !cVar2.f17947K && z) {
            int[] a3 = m21766a(a2, iArr[i2], i3, cVar2.f17942F, cVar2.f17878h, cVar2.f17879i, cVar2.f17880j);
            if (a3.length > 1) {
                aVar = new C7637d.C7638a(a2, a3);
            }
        }
        if (aVar == null) {
            aVar = new C7637d.C7638a(a2, i3);
        }
        return Pair.create(aVar, (C7630a) C7717a.m22120b(aVar2));
    }
}
