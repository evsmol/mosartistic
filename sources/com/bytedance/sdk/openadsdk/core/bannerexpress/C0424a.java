package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.component.adexpress.p298b.C10285c;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.utils.C10652x;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0746x;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0586d;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0590e;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0591f;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0601m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.dislike.C0759b;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.utils.C0984l;
import com.bytedance.sdk.openadsdk.utils.C0992q;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import com.com.bytedance.overseas.sdk.p056a.C1009d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.bytedance.sdk.openadsdk.core.bannerexpress.a */
/* compiled from: TTBannerExpressAdImpl */
public class C0424a extends C0601m implements C10652x.C10653a {

    /* renamed from: a */
    protected BannerExpressView f1421a;

    /* renamed from: b */
    protected final Context f1422b;

    /* renamed from: c */
    protected C0477n f1423c;

    /* renamed from: d */
    protected AdSlot f1424d;

    /* renamed from: e */
    protected TTNativeExpressAd.ExpressAdInteractionListener f1425e;

    /* renamed from: f */
    TTDislikeDialogAbstract f1426f;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C0759b f1427h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C1008c f1428i;

    /* renamed from: j */
    private C10652x f1429j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f1430k;

    /* renamed from: l */
    private int f1431l = 0;

    /* renamed from: m */
    private TTAdDislike.DislikeInteractionCallback f1432m;

    /* renamed from: n */
    private Context f1433n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Queue<Long> f1434o = new LinkedList();

    /* renamed from: p */
    private boolean f1435p;

    /* renamed from: q */
    private boolean f1436q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Double f1437r = null;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f1438s = "banner_ad";
    /* access modifiers changed from: private */

    /* renamed from: t */
    public NativeExpressView f1439t;

    /* renamed from: com.bytedance.sdk.openadsdk.core.bannerexpress.a$a */
    /* compiled from: TTBannerExpressAdImpl */
    public interface C0431a {
        /* renamed from: a */
        void mo1168a();
    }

    public C0424a(Context context, C0477n nVar, AdSlot adSlot) {
        this.f1422b = context;
        this.f1423c = nVar;
        this.f1424d = adSlot;
        mo1151a(context, nVar, adSlot);
    }

    /* renamed from: a */
    public void mo1151a(Context context, C0477n nVar, AdSlot adSlot) {
        BannerExpressView bannerExpressView = new BannerExpressView(context, nVar, adSlot);
        this.f1421a = bannerExpressView;
        mo1152a(bannerExpressView.getCurView(), this.f1423c);
    }

    public View getExpressAdView() {
        return this.f1421a;
    }

    public int getImageMode() {
        C0477n nVar = this.f1423c;
        if (nVar == null) {
            return -1;
        }
        return nVar.mo1383ad();
    }

    public List<FilterWord> getFilterWords() {
        C0477n nVar = this.f1423c;
        if (nVar == null) {
            return null;
        }
        return nVar.mo1384ae();
    }

    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        this.f1425e = expressAdInteractionListener;
        this.f1421a.setExpressInteractionListener(expressAdInteractionListener);
    }

    public void setExpressInteractionListener(TTNativeExpressAd.AdInteractionListener adInteractionListener) {
        this.f1425e = adInteractionListener;
        this.f1421a.setExpressInteractionListener(adInteractionListener);
    }

    public int getInteractionType() {
        C0477n nVar = this.f1423c;
        if (nVar == null) {
            return -1;
        }
        return nVar.mo1332L();
    }

    public void render() {
        this.f1421a.mo1136b();
    }

    public void destroy() {
        BannerExpressView bannerExpressView = this.f1421a;
        if (bannerExpressView != null) {
            bannerExpressView.mo1137c();
        }
        m1755c();
    }

    public void setDislikeCallback(Activity activity, TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        if (dislikeInteractionCallback != null && activity != null) {
            this.f1432m = dislikeInteractionCallback;
            m1746a(activity, dislikeInteractionCallback);
        }
    }

    public void setDislikeDialog(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        if (tTDislikeDialogAbstract == null) {
            C10638l.m31234b("dialog is null, please check");
            return;
        }
        this.f1426f = tTDislikeDialogAbstract;
        tTDislikeDialogAbstract.setMaterialMeta(this.f1423c);
        BannerExpressView bannerExpressView = this.f1421a;
        if (bannerExpressView != null && bannerExpressView.getCurView() != null) {
            this.f1421a.getCurView().setOuterDislike(tTDislikeDialogAbstract);
        }
    }

    /* renamed from: a */
    private void m1746a(Activity activity, TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        if (this.f1427h == null) {
            this.f1427h = new C0759b(activity, this.f1423c);
        }
        this.f1433n = activity;
        this.f1427h.setDislikeInteractionCallback(dislikeInteractionCallback);
        BannerExpressView bannerExpressView = this.f1421a;
        if (bannerExpressView != null && bannerExpressView.getCurView() != null) {
            this.f1421a.getCurView().setDislike(this.f1427h);
        }
    }

    /* renamed from: a */
    private C1008c m1745a(C0477n nVar) {
        if (nVar.mo1332L() == 4) {
            return C1009d.m4776a(this.f1422b, nVar, this.f1438s);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1753b(C0477n nVar) {
        if (this.f1421a.getNextView() != null && this.f1421a.mo1140f()) {
            m1754b(this.f1421a.getNextView(), nVar);
            mo1152a(this.f1421a.getNextView(), nVar);
        }
    }

    /* renamed from: b */
    private void m1754b(NativeExpressView nativeExpressView, C0477n nVar) {
        if (nativeExpressView != null && nVar != null) {
            if (this.f1432m != null) {
                this.f1427h.mo2519a(nVar);
                if (nativeExpressView != null) {
                    nativeExpressView.setDislike(this.f1427h);
                }
            }
            TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f1426f;
            if (tTDislikeDialogAbstract != null) {
                tTDislikeDialogAbstract.setMaterialMeta(nVar);
                if (nativeExpressView != null) {
                    nativeExpressView.setOuterDislike(this.f1426f);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1152a(final NativeExpressView nativeExpressView, C0477n nVar) {
        if (nativeExpressView != null && nVar != null) {
            this.f1423c = nVar;
            this.f1428i = m1745a(nVar);
            this.f1439t = nativeExpressView;
            final String a = C0984l.m4553a();
            final C0431a a2 = mo1150a();
            nativeExpressView.setClosedListenerKey(a);
            nativeExpressView.setBannerClickClosedListener(a2);
            nativeExpressView.setBackupListener(new C10285c() {
                /* renamed from: a */
                public boolean mo971a(ViewGroup viewGroup, int i) {
                    try {
                        nativeExpressView.mo1898m();
                        BannerExpressBackupView bannerExpressBackupView = new BannerExpressBackupView(nativeExpressView.getContext());
                        bannerExpressBackupView.setClosedListenerKey(a);
                        bannerExpressBackupView.mo1124a(C0424a.this.f1423c, nativeExpressView, C0424a.this.f1428i);
                        bannerExpressBackupView.setDislikeInner(C0424a.this.f1427h);
                        bannerExpressBackupView.setDislikeOuter(C0424a.this.f1426f);
                        return true;
                    } catch (Exception unused) {
                        return false;
                    }
                }
            });
            C0136e.m606a(nVar);
            EmptyView a3 = m1742a((ViewGroup) nativeExpressView);
            if (a3 == null) {
                a3 = new EmptyView(this.f1422b, nativeExpressView);
                nativeExpressView.addView(a3);
            }
            final C0477n nVar2 = nVar;
            final EmptyView emptyView = a3;
            final NativeExpressView nativeExpressView2 = nativeExpressView;
            a3.setCallback(new EmptyView.C0378a() {
                /* renamed from: a */
                public void mo1064a(boolean z) {
                    if (z) {
                        C0424a.this.m1751b();
                        C10638l.m31235b("TTBannerExpressAd", "Get focus, start timing");
                    } else {
                        C0424a.this.m1755c();
                        C10638l.m31235b("TTBannerExpressAd", "Lose focus, stop timing");
                    }
                    C10615e.m31163b().execute(new C0432b(z, nVar2, C0424a.this));
                }

                /* renamed from: a */
                public void mo1062a() {
                    C0424a.this.m1751b();
                }

                /* renamed from: b */
                public void mo1065b() {
                    if (C0424a.this.f1421a != null) {
                        EmptyView emptyView = emptyView;
                        C0424a aVar = C0424a.this;
                        if (emptyView == aVar.m1742a((ViewGroup) aVar.f1421a.getCurView())) {
                            C0424a.this.m1755c();
                        }
                    }
                    C0424a.this.m1757c(nVar2);
                }

                /* renamed from: a */
                public void mo1063a(View view) {
                    C0503h.m2281d().mo1584a(a, a2);
                    C10638l.m31235b("TTBannerExpressAd", "ExpressView SHOW");
                    if (C0424a.this.f1434o != null) {
                        C0424a.this.f1434o.offer(Long.valueOf(System.currentTimeMillis()));
                    }
                    HashMap hashMap = new HashMap();
                    NativeExpressView nativeExpressView = nativeExpressView2;
                    if (nativeExpressView != null) {
                        hashMap.put("dynamic_show_type", Integer.valueOf(nativeExpressView.getDynamicShowType()));
                    }
                    if (view != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(IabUtils.KEY_WIDTH, view.getWidth());
                            jSONObject.put(IabUtils.KEY_HEIGHT, view.getHeight());
                            jSONObject.put("alpha", (double) view.getAlpha());
                        } catch (Throwable unused) {
                        }
                        hashMap.put("root_view", jSONObject.toString());
                    }
                    C0136e.m602a(C0424a.this.f1422b, nVar2, C0424a.this.f1438s, (Map<String, Object>) hashMap, C0424a.this.f1437r);
                    if (C0424a.this.f1425e != null) {
                        C0424a.this.f1425e.onAdShow(view, nVar2.mo1332L());
                    }
                    if (nVar2.mo1388ai()) {
                        C0996u.m4622a(nVar2, view);
                    }
                    C0424a.this.m1751b();
                    if (!(C0424a.this.f2249g.getAndSet(true) || C0424a.this.f1421a == null || C0424a.this.f1421a.getCurView() == null || C0424a.this.f1421a.getCurView().getWebView() == null)) {
                        C1002v.m4713a(C0424a.this.f1422b, C0424a.this.f1423c, C0424a.this.f1438s, C0424a.this.f1421a.getCurView().getWebView().getWebView());
                    }
                    if (C0424a.this.f1421a != null && C0424a.this.f1421a.getCurView() != null) {
                        C0424a.this.f1421a.getCurView().mo1896k();
                        C0424a.this.f1421a.getCurView().mo1894i();
                    }
                }
            });
            C0591f fVar = new C0591f(this.f1422b, nVar, this.f1438s, 2);
            fVar.mo1100a((View) nativeExpressView);
            fVar.mo1103a((TTNativeExpressAd) this);
            fVar.mo1106a(this.f1428i);
            nativeExpressView.setClickListener(fVar);
            C0590e eVar = new C0590e(this.f1422b, nVar, this.f1438s, 2);
            eVar.mo1100a((View) nativeExpressView);
            eVar.mo1103a((TTNativeExpressAd) this);
            eVar.mo1106a(this.f1428i);
            nativeExpressView.setClickCreativeListener(eVar);
            a3.setNeedCheckingShow(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1751b() {
        C10652x xVar = this.f1429j;
        if (xVar != null) {
            xVar.removeCallbacksAndMessages((Object) null);
            this.f1429j.sendEmptyMessageDelayed(112202, 1000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m1755c() {
        C10652x xVar = this.f1429j;
        if (xVar != null) {
            xVar.removeCallbacksAndMessages((Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m1757c(C0477n nVar) {
        Queue<Long> queue = this.f1434o;
        if (queue != null && queue.size() > 0 && nVar != null) {
            try {
                long longValue = this.f1434o.poll().longValue();
                if (longValue > 0 && this.f1439t != null) {
                    C0136e.m616a((System.currentTimeMillis() - longValue) + "", nVar, this.f1438s, this.f1439t.getAdShowTime());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.bannerexpress.a$b */
    /* compiled from: TTBannerExpressAdImpl */
    private static class C0432b implements Runnable {

        /* renamed from: a */
        boolean f1453a;

        /* renamed from: b */
        C0477n f1454b;

        /* renamed from: c */
        WeakReference<C0424a> f1455c;

        C0432b(boolean z, C0477n nVar, C0424a aVar) {
            this.f1453a = z;
            this.f1454b = nVar;
            this.f1455c = new WeakReference<>(aVar);
        }

        public void run() {
            WeakReference<C0424a> weakReference = this.f1455c;
            if (weakReference != null && weakReference.get() != null) {
                ((C0424a) this.f1455c.get()).m1749a(this.f1453a, this.f1454b);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1749a(boolean z, C0477n nVar) {
        Long poll;
        if (z) {
            try {
                this.f1434o.offer(Long.valueOf(System.currentTimeMillis()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (this.f1434o.size() > 0 && this.f1439t != null && (poll = this.f1434o.poll()) != null) {
            long longValue = poll.longValue();
            C0136e.m616a((System.currentTimeMillis() - longValue) + "", nVar, this.f1438s, this.f1439t.getAdShowTime());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public EmptyView m1742a(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        int i = 0;
        while (i < viewGroup.getChildCount()) {
            try {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof EmptyView) {
                    return (EmptyView) childAt;
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Map<String, Object> getMediaExtraInfo() {
        C0477n nVar = this.f1423c;
        if (nVar != null) {
            return nVar.mo1389aj();
        }
        return null;
    }

    public String getAdCreativeToken() {
        return this.f1423c.mo1453n();
    }

    public void setSlideIntervalTime(int i) {
        if (i > 0) {
            this.f1438s = "slide_banner_ad";
            mo1152a(this.f1421a.getCurView(), this.f1423c);
            this.f1421a.setDuration(1000);
            if (i < 30000) {
                i = Constants.FAILED_REQUEST_PRECACHE_MS;
            } else if (i > 120000) {
                i = Constants.LOADING_TIMEOUT_MS;
            }
            this.f1430k = i;
            this.f1429j = new C10652x(Looper.getMainLooper(), this);
            this.f1424d.setIsRotateBanner(1);
            this.f1424d.setRotateTime(this.f1430k);
            this.f1424d.setRotateOrder(1);
        }
    }

    /* renamed from: d */
    private void m1758d() {
        C0586d.m2824a(this.f1422b).mo1957a(this.f1424d, 1, (TTAdNative.NativeExpressAdListener) null, new C0586d.C0589a() {
            /* renamed from: a */
            public void mo1167a(List<C0477n> list) {
                if (list == null || list.isEmpty()) {
                    C0424a.this.m1751b();
                    return;
                }
                C0477n nVar = list.get(0);
                C0424a.this.f1421a.mo1133a(nVar, C0424a.this.f1424d);
                C0424a.this.m1753b(nVar);
                C0424a.this.f1421a.mo1138d();
            }

            /* renamed from: a */
            public void mo1166a() {
                C0424a.this.m1751b();
            }
        }, 5000);
    }

    /* renamed from: a */
    public void mo5a(Message message) {
        if (message.what == 112202) {
            if (C0746x.m3803a(this.f1421a, 50, 1)) {
                this.f1431l += 1000;
            }
            if (this.f1431l >= this.f1430k) {
                m1758d();
                AdSlot adSlot = this.f1424d;
                adSlot.setRotateOrder(adSlot.getRotateOrder() + 1);
                this.f1431l = 0;
                m1755c();
                return;
            }
            m1751b();
        }
    }

    public void win(Double d) {
        if (!this.f1435p) {
            C0992q.m4596a(this.f1423c, d);
            this.f1435p = true;
        }
    }

    public void loss(Double d, String str, String str2) {
        if (!this.f1436q) {
            C0992q.m4597a(this.f1423c, d, str, str2);
            this.f1436q = true;
        }
    }

    public void setPrice(Double d) {
        this.f1437r = d;
    }

    /* renamed from: a */
    public C0431a mo1150a() {
        return new C0431a() {
            /* renamed from: a */
            public void mo1168a() {
                View view;
                int width = C0424a.this.f1439t.getWidth();
                int height = C0424a.this.f1439t.getHeight();
                if (((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d)) {
                    view = LayoutInflater.from(C0424a.this.f1422b).inflate(C10647t.m31284f(C0424a.this.f1422b, "tt_banner_ad_closed_300_250"), (ViewGroup) null, false);
                } else {
                    view = LayoutInflater.from(C0424a.this.f1422b).inflate(C10647t.m31284f(C0424a.this.f1422b, "tt_banner_ad_closed_320_50"), (ViewGroup) null, false);
                }
                C0424a aVar = C0424a.this;
                EmptyView a = aVar.m1742a((ViewGroup) aVar.f1439t);
                C0424a.this.f1439t.removeAllViews();
                C0424a.this.f1439t.addView(view, new ViewGroup.LayoutParams(width, height));
                view.findViewById(C10647t.m31283e(C0424a.this.f1422b, "tt_ad_closed_page_logo")).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        TTWebsiteActivity.m414a(C0424a.this.f1422b, C0424a.this.f1423c, C0424a.this.f1438s);
                    }
                });
                TextView textView = (TextView) view.findViewById(C10647t.m31283e(C0424a.this.f1422b, "tt_ad_closed_text"));
                textView.setText(C10647t.m31276a(C0424a.this.f1422b, "tt_ad_is_closed"));
                textView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        TTWebsiteActivity.m414a(C0424a.this.f1422b, C0424a.this.f1423c, C0424a.this.f1438s);
                    }
                });
                C0424a.this.f1439t.setClickCreativeListener((C0590e) null);
                C0424a.this.f1439t.setClickListener((C0591f) null);
                if (C0558m.m2673h().mo1710n() == 1) {
                    C0424a.this.m1755c();
                } else if (C0424a.this.f1430k != 0) {
                    C0424a.this.f1439t.addView(a);
                }
            }
        };
    }
}
