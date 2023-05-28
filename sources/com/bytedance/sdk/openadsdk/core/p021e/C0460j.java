package com.bytedance.sdk.openadsdk.core.p021e;

import android.util.SparseArray;
import com.bytedance.sdk.component.adexpress.C10281b;
import com.bytedance.sdk.openadsdk.core.p016b.C0408c;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.j */
/* compiled from: DynamicClickInfo */
public class C0460j implements C10281b {

    /* renamed from: a */
    public final float f1551a;

    /* renamed from: b */
    public final float f1552b;

    /* renamed from: c */
    public final float f1553c;

    /* renamed from: d */
    public final float f1554d;

    /* renamed from: e */
    public final long f1555e;

    /* renamed from: f */
    public final long f1556f;

    /* renamed from: g */
    public final int f1557g;

    /* renamed from: h */
    public final int f1558h;

    /* renamed from: i */
    public final int f1559i;

    /* renamed from: j */
    public final int f1560j;

    /* renamed from: k */
    public final String f1561k;

    /* renamed from: l */
    public int f1562l;

    /* renamed from: m */
    public JSONObject f1563m;

    /* renamed from: n */
    public SparseArray<C0408c.C0409a> f1564n;

    /* renamed from: o */
    public final boolean f1565o;

    /* renamed from: p */
    public int f1566p;

    private C0460j(C0462a aVar) {
        this.f1551a = aVar.f1573g;
        this.f1552b = aVar.f1572f;
        this.f1553c = aVar.f1571e;
        this.f1554d = aVar.f1570d;
        this.f1555e = aVar.f1569c;
        this.f1556f = aVar.f1568b;
        this.f1557g = aVar.f1574h;
        this.f1558h = aVar.f1575i;
        this.f1559i = aVar.f1576j;
        this.f1560j = aVar.f1577k;
        this.f1561k = aVar.f1578l;
        this.f1564n = aVar.f1567a;
        this.f1565o = aVar.f1582p;
        this.f1562l = aVar.f1579m;
        this.f1563m = aVar.f1580n;
        this.f1566p = aVar.f1581o;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.e.j$a */
    /* compiled from: DynamicClickInfo */
    public static class C0462a {

        /* renamed from: a */
        protected SparseArray<C0408c.C0409a> f1567a = new SparseArray<>();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public long f1568b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public long f1569c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public float f1570d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public float f1571e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public float f1572f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public float f1573g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f1574h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f1575i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f1576j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f1577k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public String f1578l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public int f1579m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public JSONObject f1580n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public int f1581o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public boolean f1582p;

        /* renamed from: a */
        public C0462a mo1265a(int i) {
            this.f1581o = i;
            return this;
        }

        /* renamed from: b */
        public C0462a mo1273b(int i) {
            this.f1579m = i;
            return this;
        }

        /* renamed from: a */
        public C0462a mo1269a(JSONObject jSONObject) {
            this.f1580n = jSONObject;
            return this;
        }

        /* renamed from: a */
        public C0462a mo1270a(boolean z) {
            this.f1582p = z;
            return this;
        }

        /* renamed from: a */
        public C0462a mo1266a(long j) {
            this.f1568b = j;
            return this;
        }

        /* renamed from: b */
        public C0462a mo1274b(long j) {
            this.f1569c = j;
            return this;
        }

        /* renamed from: a */
        public C0462a mo1264a(float f) {
            this.f1570d = f;
            return this;
        }

        /* renamed from: b */
        public C0462a mo1272b(float f) {
            this.f1571e = f;
            return this;
        }

        /* renamed from: c */
        public C0462a mo1275c(float f) {
            this.f1572f = f;
            return this;
        }

        /* renamed from: d */
        public C0462a mo1277d(float f) {
            this.f1573g = f;
            return this;
        }

        /* renamed from: c */
        public C0462a mo1276c(int i) {
            this.f1574h = i;
            return this;
        }

        /* renamed from: d */
        public C0462a mo1278d(int i) {
            this.f1575i = i;
            return this;
        }

        /* renamed from: e */
        public C0462a mo1279e(int i) {
            this.f1576j = i;
            return this;
        }

        /* renamed from: f */
        public C0462a mo1280f(int i) {
            this.f1577k = i;
            return this;
        }

        /* renamed from: a */
        public C0462a mo1268a(String str) {
            this.f1578l = str;
            return this;
        }

        /* renamed from: a */
        public C0462a mo1267a(SparseArray<C0408c.C0409a> sparseArray) {
            this.f1567a = sparseArray;
            return this;
        }

        /* renamed from: a */
        public C0460j mo1271a() {
            return new C0460j(this);
        }
    }
}
