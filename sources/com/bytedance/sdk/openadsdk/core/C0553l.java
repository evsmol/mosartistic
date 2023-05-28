package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.p307b.p308a.C10469e;
import com.bytedance.sdk.component.p323e.p326c.C10584a;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.p016b.C0405a;
import com.bytedance.sdk.openadsdk.core.p016b.C0406b;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p000b.C0145i;
import com.bytedance.sdk.openadsdk.p000b.C0146j;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import com.com.bytedance.overseas.sdk.p056a.C1009d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.l */
/* compiled from: InteractionManager */
public class C0553l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0477n f2061a;

    /* renamed from: b */
    private C1008c f2062b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f2063c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TTNativeAd f2064d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<View> f2065e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f2066f = C0145i.i1657027613257dc("el`f``bXim");

    /* renamed from: g */
    private TTNativeAd.AdInteractionListener f2067g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f2068h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Double f2069i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C0146j f2070j = new C0146j();

    public C0553l(Context context, TTNativeAd tTNativeAd, C0477n nVar, String str) {
        this.f2064d = tTNativeAd;
        this.f2061a = nVar;
        this.f2063c = context;
        this.f2066f = str;
        if (nVar.mo1332L() == 4) {
            this.f2062b = C1009d.m4776a(this.f2063c, this.f2061a, this.f2066f);
        }
    }

    /* renamed from: a */
    private EmptyView m2645a(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof EmptyView) {
                return (EmptyView) childAt;
            }
        }
        return null;
    }

    /* renamed from: c */
    static /* synthetic */ long m2647c(C0553l lVar) {
        long j = lVar.f2068h;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        if (c2 > 4) {
                            break;
                        } else {
                            continue;
                        }
                }
                while (true) {
                    switch (c2) {
                        case '[':
                        case ']':
                            break;
                        case '\\':
                            break;
                        default:
                            c2 = '[';
                    }
                }
                c = '^';
                c2 = 'K';
            }
        }
        return j;
    }

    /* renamed from: a */
    public C0146j mo1832a() {
        return this.f2070j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        switch(r4) {
            case 55: goto L_0x0024;
            case 56: goto L_0x000c;
            case 57: goto L_0x0024;
            default: goto L_0x001a;
        };
     */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1833a(android.view.View r3, int r4) {
        /*
            r2 = this;
            com.bytedance.sdk.openadsdk.TTNativeAd$AdInteractionListener r4 = r2.f2067g
            r0 = 95
            if (r4 == 0) goto L_0x000c
            com.bytedance.sdk.openadsdk.TTNativeAd r1 = r2.f2064d
            r4.onAdCreativeClick(r3, r1)
            goto L_0x001f
        L_0x000c:
            r3 = 94
            r4 = 125(0x7d, float:1.75E-43)
        L_0x0010:
            switch(r3) {
                case 94: goto L_0x001b;
                case 95: goto L_0x0014;
                case 96: goto L_0x0017;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x000c
        L_0x0014:
            switch(r4) {
                case 94: goto L_0x001f;
                case 95: goto L_0x000c;
                case 96: goto L_0x001f;
                default: goto L_0x0017;
            }
        L_0x0017:
            switch(r4) {
                case 55: goto L_0x0024;
                case 56: goto L_0x000c;
                case 57: goto L_0x0024;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0024
        L_0x001b:
            r3 = 39
            if (r4 != r3) goto L_0x0024
        L_0x001f:
            r3 = 95
            r4 = 95
            goto L_0x0010
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0553l.mo1833a(android.view.View, int):void");
    }

    /* renamed from: a */
    public void mo1834a(final ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, final TTNativeAd.AdInteractionListener adInteractionListener) {
        this.f2067g = adInteractionListener;
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C0553l.this.f2070j.mo421a(System.currentTimeMillis(), C0746x.m3801a(viewGroup));
            }
        });
        this.f2065e = list;
        C0136e.m606a(this.f2061a);
        EmptyView a = m2645a(viewGroup);
        if (a == null) {
            a = new EmptyView(this.f2063c, viewGroup);
            viewGroup.addView(a);
        }
        a.mo1050a();
        a.setRefClickViews(list2);
        if (list != null) {
            for (View next : this.f2065e) {
                if (next != null) {
                    next.setTag(C10647t.m31283e(C0558m.m2663a(), C10584a.a1657027613243dc("tu]j`ZotWcoibQyrfffp")), true);
                }
            }
            list3.addAll(list);
        }
        a.setRefCreativeViews(list3);
        HashMap hashMap = new HashMap();
        hashMap.put(C10584a.a1657027613243dc("cmk`oZudmgin"), 1);
        Context context = this.f2063c;
        C0477n nVar = this.f2061a;
        String str = this.f2066f;
        C0406b bVar = new C0406b(context, nVar, str, C0996u.m4610a(str));
        bVar.mo1100a((View) viewGroup);
        bVar.mo1112b(view);
        bVar.mo1106a(this.f2062b);
        bVar.mo1102a(this.f2064d);
        bVar.mo1108a((Map<String, Object>) hashMap);
        bVar.mo1104a((C0406b.C0407a) new C0406b.C0407a() {
            /* renamed from: a */
            public void mo28a(View view, int i) {
                TTNativeAd.AdInteractionListener adInteractionListener = adInteractionListener;
                if (adInteractionListener != null) {
                    adInteractionListener.onAdClicked(view, C0553l.this.f2064d);
                }
            }
        });
        Context context2 = this.f2063c;
        C0477n nVar2 = this.f2061a;
        String str2 = this.f2066f;
        C0405a aVar = new C0405a(context2, nVar2, str2, C0996u.m4610a(str2));
        aVar.mo1100a((View) viewGroup);
        aVar.mo1112b(view);
        aVar.mo1106a(this.f2062b);
        aVar.mo1102a(this.f2064d);
        aVar.mo1108a((Map<String, Object>) hashMap);
        aVar.mo1104a((C0406b.C0407a) new C0406b.C0407a() {
            /* renamed from: a */
            public void mo28a(View view, int i) {
                TTNativeAd.AdInteractionListener adInteractionListener = adInteractionListener;
                if (adInteractionListener != null) {
                    adInteractionListener.onAdCreativeClick(view, C0553l.this.f2064d);
                }
            }
        });
        a.mo1051a(list2, bVar);
        a.mo1051a(list3, aVar);
        a.setCallback(new EmptyView.C0378a() {
            /* renamed from: a */
            public void mo1062a() {
                C0553l.this.f2070j.mo421a(System.currentTimeMillis(), C0746x.m3801a(viewGroup));
            }

            @JProtect
            /* renamed from: a */
            public void mo1063a(View view) {
                C0553l.this.f2070j.mo421a(System.currentTimeMillis(), C0746x.m3801a(viewGroup));
                long unused = C0553l.this.f2068h = System.currentTimeMillis();
                HashMap hashMap = new HashMap();
                if (C0553l.this.f2065e != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (View view2 : C0553l.this.f2065e) {
                        if (view2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(C10469e.e1657027613270dc("whfwl"), view2.getWidth());
                                jSONObject.put(C10469e.e1657027613270dc("hdkdlq"), view2.getHeight());
                                jSONObject.put(C10469e.e1657027613270dc("amrke"), (double) view2.getAlpha());
                            } catch (Throwable unused2) {
                            }
                            jSONArray.put(jSONObject);
                        }
                    }
                    hashMap.put(C10469e.e1657027613270dc("ilcdaZpnm~"), jSONArray.toString());
                }
                if (viewGroup != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put(C10469e.e1657027613270dc("whfwl"), viewGroup.getWidth());
                        jSONObject2.put(C10469e.e1657027613270dc("hdkdlq"), viewGroup.getHeight());
                        jSONObject2.put(C10469e.e1657027613270dc("amrke"), (double) viewGroup.getAlpha());
                    } catch (Throwable unused3) {
                    }
                    hashMap.put(C10469e.e1657027613270dc("rnmw[sob"), jSONObject2.toString());
                }
                C0136e.m602a(C0553l.this.f2063c, C0553l.this.f2061a, C0553l.this.f2066f, (Map<String, Object>) hashMap, C0553l.this.f2069i);
                TTNativeAd.AdInteractionListener adInteractionListener = adInteractionListener;
                if (adInteractionListener != null) {
                    adInteractionListener.onAdShow(C0553l.this.f2064d);
                }
                if (C0553l.this.f2061a.mo1388ai()) {
                    C0996u.m4622a(C0553l.this.f2061a, view);
                }
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                */
            /* JADX WARNING: Removed duplicated region for block: B:10:0x007c A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0078 A[LOOP:0: B:6:0x0078->B:8:0x0078, LOOP_END, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:9:0x0076 A[SYNTHETIC] */
            /* renamed from: a */
            public void mo1064a(boolean r7) {
                /*
                    r6 = this;
                    if (r7 != 0) goto L_0x005a
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.C0553l.this
                    long r0 = com.bytedance.sdk.openadsdk.core.C0553l.m2647c(r7)
                    r2 = 0
                    int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r7 <= 0) goto L_0x005a
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    long r0 = java.lang.System.currentTimeMillis()
                    com.bytedance.sdk.openadsdk.core.l r4 = com.bytedance.sdk.openadsdk.core.C0553l.this
                    long r4 = com.bytedance.sdk.openadsdk.core.C0553l.m2647c(r4)
                    long r0 = r0 - r4
                    r7.append(r0)
                    java.lang.String r0 = ""
                    r7.append(r0)
                    java.lang.String r7 = r7.toString()
                    com.bytedance.sdk.openadsdk.core.l r0 = com.bytedance.sdk.openadsdk.core.C0553l.this
                    com.bytedance.sdk.openadsdk.b.j r0 = r0.f2070j
                    long r4 = java.lang.System.currentTimeMillis()
                    android.view.ViewGroup r1 = r9
                    float r1 = com.bytedance.sdk.openadsdk.core.C0746x.m3801a(r1)
                    r0.mo421a(r4, r1)
                    com.bytedance.sdk.openadsdk.core.l r0 = com.bytedance.sdk.openadsdk.core.C0553l.this
                    com.bytedance.sdk.openadsdk.core.e.n r0 = r0.f2061a
                    com.bytedance.sdk.openadsdk.core.l r1 = com.bytedance.sdk.openadsdk.core.C0553l.this
                    java.lang.String r1 = r1.f2066f
                    com.bytedance.sdk.openadsdk.core.l r4 = com.bytedance.sdk.openadsdk.core.C0553l.this
                    com.bytedance.sdk.openadsdk.b.j r4 = r4.f2070j
                    com.bytedance.sdk.openadsdk.p000b.C0136e.m616a((java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r0, (java.lang.String) r1, (com.bytedance.sdk.openadsdk.p000b.C0146j) r4)
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.C0553l.this
                    long unused = r7.f2068h = r2
                    r7 = 64
                    goto L_0x0078
                L_0x005a:
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.C0553l.this
                    com.bytedance.sdk.openadsdk.b.j r7 = r7.f2070j
                    long r0 = java.lang.System.currentTimeMillis()
                    android.view.ViewGroup r2 = r9
                    float r2 = com.bytedance.sdk.openadsdk.core.C0746x.m3801a(r2)
                    r7.mo421a(r0, r2)
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.C0553l.this
                    long r0 = java.lang.System.currentTimeMillis()
                    long unused = r7.f2068h = r0
                L_0x0076:
                    r7 = 66
                L_0x0078:
                    switch(r7) {
                        case 64: goto L_0x007c;
                        case 65: goto L_0x0076;
                        case 66: goto L_0x007c;
                        default: goto L_0x007b;
                    }
                L_0x007b:
                    goto L_0x0078
                L_0x007c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0553l.C05574.mo1064a(boolean):void");
            }

            /* renamed from: b */
            public void mo1065b() {
                if (C0553l.m2647c(C0553l.this) > 0) {
                    C0136e.m616a((System.currentTimeMillis() - C0553l.m2647c(C0553l.this)) + "", C0553l.this.f2061a, C0553l.this.f2066f, C0553l.this.f2070j);
                    long unused = C0553l.this.f2068h = 0;
                }
            }
        });
        a.setNeedCheckingShow(true);
    }

    /* renamed from: a */
    public void mo1835a(Double d) {
        this.f2069i = d;
    }
}
