package com.bytedance.sdk.openadsdk.core.p016b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0747y;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0573a;
import com.bytedance.sdk.openadsdk.core.p016b.C0408c;
import com.bytedance.sdk.openadsdk.core.p021e.C0455g;
import com.bytedance.sdk.openadsdk.core.p021e.C0460j;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.p000b.C0112b;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import com.com.bytedance.overseas.sdk.p056a.C1009d;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.b.b */
/* compiled from: ClickListener */
public class C0406b extends C0408c {

    /* renamed from: F */
    private WeakReference<Activity> f1329F;

    /* renamed from: G */
    private boolean f1330G;

    /* renamed from: a */
    private String f1331a;

    /* renamed from: b */
    protected Context f1332b;

    /* renamed from: c */
    public C0460j f1333c;

    /* renamed from: d */
    protected final C0477n f1334d;

    /* renamed from: e */
    protected final String f1335e;

    /* renamed from: f */
    protected final int f1336f;

    /* renamed from: g */
    protected WeakReference<View> f1337g;

    /* renamed from: h */
    protected WeakReference<View> f1338h;

    /* renamed from: i */
    protected C0455g f1339i;

    /* renamed from: j */
    protected C0407a f1340j;

    /* renamed from: k */
    protected TTNativeAd f1341k;

    /* renamed from: l */
    protected C10192c f1342l;

    /* renamed from: m */
    protected boolean f1343m;

    /* renamed from: n */
    protected C1008c f1344n;

    /* renamed from: o */
    protected Map<String, Object> f1345o;

    /* renamed from: p */
    protected TTNativeExpressAd f1346p;

    /* renamed from: q */
    protected C0573a f1347q;

    /* renamed from: r */
    protected int f1348r;

    /* renamed from: com.bytedance.sdk.openadsdk.core.b.b$a */
    /* compiled from: ClickListener */
    public interface C0407a {
        /* renamed from: a */
        void mo28a(View view, int i);
    }

    /* renamed from: a */
    public void mo1106a(C1008c cVar) {
        this.f1344n = cVar;
    }

    /* renamed from: a */
    public void mo1105a(C0573a aVar) {
        this.f1347q = aVar;
    }

    /* renamed from: a */
    public void mo1102a(TTNativeAd tTNativeAd) {
        this.f1341k = tTNativeAd;
    }

    /* renamed from: a */
    public void mo1103a(TTNativeExpressAd tTNativeExpressAd) {
        this.f1346p = tTNativeExpressAd;
    }

    /* renamed from: d */
    public void mo1116d(boolean z) {
        this.f1343m = z;
    }

    /* renamed from: a */
    public void mo1101a(C10192c cVar) {
        this.f1342l = cVar;
    }

    public C0406b(Context context, C0477n nVar, String str, int i) {
        this.f1343m = false;
        this.f1348r = 0;
        this.f1330G = false;
        this.f1332b = context;
        this.f1334d = nVar;
        this.f1335e = str;
        this.f1336f = i;
    }

    public C0406b(Context context, C0477n nVar, String str, int i, boolean z) {
        this(context, nVar, str, i);
        this.f1330G = z;
    }

    /* renamed from: a */
    public void mo1104a(C0407a aVar) {
        this.f1340j = aVar;
    }

    /* renamed from: a */
    public void mo1099a(Activity activity) {
        if (activity != null) {
            this.f1329F = new WeakReference<>(activity);
        }
    }

    /* renamed from: a */
    public void mo1100a(View view) {
        if (view != null) {
            this.f1337g = new WeakReference<>(view);
        }
    }

    /* renamed from: b */
    public void mo1112b(View view) {
        if (view != null) {
            this.f1338h = new WeakReference<>(view);
        }
    }

    /* renamed from: d */
    public View mo1114d() {
        WeakReference<Activity> weakReference = this.f1329F;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return ((Activity) this.f1329F.get()).findViewById(16908290);
    }

    /* renamed from: e */
    public View mo1117e() {
        WeakReference<Activity> weakReference = this.f1329F;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return ((Activity) this.f1329F.get()).findViewById(C10647t.m31283e(C0558m.m2663a(), "tt_top_dislike"));
    }

    /* renamed from: a */
    public void mo1108a(Map<String, Object> map) {
        this.f1345o = map;
    }

    /* renamed from: a */
    public void mo1098a(int i) {
        this.f1355A = i;
    }

    /* renamed from: b */
    public void mo1111b(int i) {
        this.f1368z = i;
    }

    /* renamed from: c */
    public void mo1113c(int i) {
        this.f1367y = i;
    }

    /* renamed from: d */
    public void mo1115d(int i) {
        this.f1348r = i;
    }

    /* renamed from: a */
    public void mo106a(View view, float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, boolean z) {
        JSONObject jSONObject;
        int i;
        View view2;
        View view3;
        C0477n nVar;
        View view4 = view;
        boolean z2 = z;
        if (this.f1332b == null) {
            this.f1332b = C0558m.m2663a();
        }
        if ((this.f1330G || !mo1109a(view, 1, f, f2, f3, f4, sparseArray, z)) && this.f1332b != null) {
            C0460j jVar = this.f1333c;
            if (jVar != null) {
                i = jVar.f1562l;
                jSONObject = this.f1333c.f1563m;
            } else {
                jSONObject = null;
                i = -1;
            }
            long j = this.f1365w;
            long j2 = this.f1366x;
            WeakReference<View> weakReference = this.f1337g;
            if (weakReference == null) {
                view2 = null;
            } else {
                view2 = (View) weakReference.get();
            }
            WeakReference<View> weakReference2 = this.f1338h;
            if (weakReference2 == null) {
                view3 = null;
            } else {
                view3 = (View) weakReference2.get();
            }
            C0455g a = mo1097a(f, f2, f3, f4, sparseArray, j, j2, view2, view3, mo1118f(), C1002v.m4748e(this.f1332b), C1002v.m4753g(this.f1332b), C1002v.m4751f(this.f1332b), i, jSONObject);
            this.f1339i = a;
            if (this.f1330G) {
                C0136e.m604a(this.f1332b, Constants.CLICK, this.f1334d, a, this.f1335e, true, this.f1345o, z ? 1 : 2);
                return;
            }
            boolean z3 = z;
            C0407a aVar = this.f1340j;
            View view5 = view;
            if (aVar != null) {
                aVar.mo28a(view5, -1);
            }
            if (mo1110a(view5, z3)) {
                boolean a2 = C0480p.m2190a(this.f1334d);
                String a3 = a2 ? this.f1335e : C0996u.m4615a(this.f1336f);
                if (view5 != null) {
                    try {
                        if (((Boolean) view5.getTag(C10647t.m31283e(C0558m.m2663a(), "tt_id_is_video_picture"))).booleanValue()) {
                            C0747y.m3810a(true);
                        }
                    } catch (Exception unused) {
                    }
                }
                boolean a4 = C0747y.m3811a(this.f1332b, this.f1334d, this.f1336f, this.f1341k, this.f1346p, a3, this.f1344n, a2);
                C0747y.m3810a(false);
                if (a4 || (nVar = this.f1334d) == null || nVar.mo1381ab() == null || this.f1334d.mo1381ab().mo1261c() != 2) {
                    C0477n nVar2 = this.f1334d;
                    if (nVar2 != null && !a4 && TextUtils.isEmpty(nVar2.mo1335O()) && C0112b.m465a(this.f1335e)) {
                        C1009d.m4776a(this.f1332b, this.f1334d, this.f1335e).mo2930d();
                    }
                    C0136e.m604a(this.f1332b, Constants.CLICK, this.f1334d, this.f1339i, this.f1335e, a4, this.f1345o, z3 ? 1 : 2);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo1110a(View view, boolean z) {
        return m1676a(view, this.f1334d, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m1676a(android.view.View r4, com.bytedance.sdk.openadsdk.core.p021e.C0477n r5, boolean r6) {
        /*
            r0 = 1
            if (r4 == 0) goto L_0x004f
            if (r5 != 0) goto L_0x0006
            goto L_0x004f
        L_0x0006:
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()
            java.lang.String r2 = "tt_id_click_tag"
            int r1 = com.bytedance.sdk.component.utils.C10647t.m31283e(r1, r2)
            java.lang.Object r1 = r4.getTag(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            android.content.Context r3 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()
            int r2 = com.bytedance.sdk.component.utils.C10647t.m31283e(r3, r2)
            java.lang.Object r2 = r4.getTag(r2)
            if (r2 == 0) goto L_0x0036
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0036
            java.lang.String r4 = "click"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0035
            return r6
        L_0x0035:
            return r0
        L_0x0036:
            boolean r4 = m1677c((android.view.View) r4)
            r1 = 0
            if (r4 == 0) goto L_0x0046
            int r4 = r5.mo1438i()
            if (r4 != r0) goto L_0x004f
            if (r6 != 0) goto L_0x004f
            return r1
        L_0x0046:
            int r4 = r5.mo1434h()
            if (r4 != r0) goto L_0x004f
            if (r6 != 0) goto L_0x004f
            return r1
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p016b.C0406b.m1676a(android.view.View, com.bytedance.sdk.openadsdk.core.e.n, boolean):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0455g mo1097a(float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, long j, long j2, View view, View view2, String str, float f5, int i, float f6, int i2, JSONObject jSONObject) {
        float f7 = f;
        float f8 = f2;
        float f9 = f3;
        float f10 = f4;
        long j3 = j;
        long j4 = j2;
        SparseArray<C0408c.C0409a> sparseArray2 = sparseArray;
        return new C0455g.C0457a().mo1254f(f).mo1252e(f2).mo1249d(f3).mo1246c(f4).mo1244b(j).mo1236a(j2).mo1245b(C1002v.m4730a(view)).mo1240a(C1002v.m4730a(view2)).mo1248c(C1002v.m4743c(view)).mo1251d(C1002v.m4743c(view2)).mo1250d(this.f1367y).mo1253e(this.f1368z).mo1255f(this.f1355A).mo1237a(sparseArray).mo1243b(C0503h.m2281d().mo1591b() ? 1 : 2).mo1238a(str).mo1234a(f5).mo1247c(i).mo1242b(f6).mo1235a(i2).mo1239a(jSONObject).mo1241a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1109a(View view, int i, float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, boolean z) {
        if (this.f1347q == null) {
            return false;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        WeakReference<View> weakReference = this.f1338h;
        if (weakReference != null) {
            iArr = C1002v.m4730a((View) weakReference.get());
            iArr2 = C1002v.m4743c((View) this.f1338h.get());
        }
        this.f1347q.mo1859a(view, i, new C0460j.C0462a().mo1277d(f).mo1275c(f2).mo1272b(f3).mo1264a(f4).mo1274b(this.f1365w).mo1266a(this.f1366x).mo1276c(iArr[0]).mo1278d(iArr[1]).mo1279e(iArr2[0]).mo1280f(iArr2[1]).mo1267a(sparseArray).mo1270a(z).mo1271a());
        return true;
    }

    /* renamed from: c */
    public static boolean m1677c(View view) {
        return C10647t.m31283e(view.getContext(), "tt_reward_ad_download") == view.getId() || C10647t.m31283e(view.getContext(), "tt_reward_ad_download_backup") == view.getId() || C10647t.m31283e(view.getContext(), "tt_bu_download") == view.getId() || C10647t.m31283e(view.getContext(), "btn_native_creative") == view.getId() || C10647t.m31283e(view.getContext(), "tt_full_ad_download") == view.getId() || C10647t.m31283e(view.getContext(), "tt_playable_play") == view.getId();
    }

    /* renamed from: f */
    public String mo1118f() {
        return this.f1331a;
    }

    /* renamed from: a */
    public void mo1107a(String str) {
        this.f1331a = str;
    }
}
