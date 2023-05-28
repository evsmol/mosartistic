package com.bytedance.sdk.openadsdk.core.p022f;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTImage;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.C0553l;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0463k;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.dislike.C0759b;
import com.bytedance.sdk.openadsdk.p042h.C0796b;
import com.bytedance.sdk.openadsdk.p042h.p043a.C0795b;
import com.bytedance.sdk.openadsdk.utils.C0992q;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.f.a */
/* compiled from: TTNativeAdImpl */
public class C0489a implements TTNativeAd {

    /* renamed from: a */
    private int f1768a;

    /* renamed from: b */
    private boolean f1769b;

    /* renamed from: c */
    private boolean f1770c;
    /* access modifiers changed from: protected */

    /* renamed from: g */
    public final C0553l f1771g;

    /* renamed from: h */
    protected final C0477n f1772h;

    /* renamed from: i */
    protected final Context f1773i;

    /* renamed from: j */
    protected TTAdDislike f1774j;

    /* renamed from: k */
    protected int f1775k;

    /* renamed from: l */
    protected String f1776l;

    /* renamed from: a */
    private String m2248a(int i) {
        return i != 1 ? i != 2 ? (i == 5 || i != 9) ? "embeded_ad" : "draw_ad" : "interaction" : "banner_ad";
    }

    public View getAdView() {
        return null;
    }

    public C0489a(Context context, C0477n nVar, int i) {
        if (nVar == null) {
            C10638l.m31234b("materialMeta can't been null");
        }
        this.f1772h = nVar;
        this.f1773i = context;
        this.f1775k = i;
        this.f1771g = new C0553l(context, this, nVar, m2248a(i));
    }

    public void registerViewForInteraction(ViewGroup viewGroup, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            C10638l.m31234b("container can't been null");
        } else if (view == null) {
            C10638l.m31234b("clickView can't been null");
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(view);
            registerViewForInteraction(viewGroup, arrayList, (List<View>) null, adInteractionListener);
        }
    }

    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            C10638l.m31234b("container can't been null");
        } else if (list == null) {
            C10638l.m31234b("clickView can't been null");
        } else if (list.size() <= 0) {
            C10638l.m31234b("clickViews size must been more than 1");
        } else {
            registerViewForInteraction(viewGroup, list, list2, (View) null, adInteractionListener);
        }
    }

    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            C10638l.m31234b("container can't been null");
        } else if (list == null) {
            C10638l.m31234b("clickView can't been null");
        } else if (list.size() <= 0) {
            C10638l.m31234b("clickViews size must been more than 1");
        } else {
            registerViewForInteraction(viewGroup, (List<View>) null, list, list2, view, adInteractionListener);
        }
    }

    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            C10638l.m31234b("container can't been null");
        } else if (list2 == null) {
            C10638l.m31234b("clickView can't been null");
        } else if (list2.size() <= 0) {
            C10638l.m31234b("clickViews size must been more than 1");
        } else {
            m2251a(list3 != null && list3.size() > 0);
            if (m2252a()) {
                list3 = m2249a(list2, list3);
            }
            this.f1771g.mo1834a(viewGroup, list, list2, list3, view, adInteractionListener);
        }
    }

    /* renamed from: a */
    private List<View> m2249a(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                linkedList.add(list.get(i));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                linkedList.add(list2.get(i2));
            }
        }
        return linkedList;
    }

    public TTImage getVideoCoverImage() {
        C0477n nVar = this.f1772h;
        if (nVar == null || nVar.mo1330J() == null) {
            return null;
        }
        return new TTImage(this.f1772h.mo1330J().mo62904b(), this.f1772h.mo1330J().mo62907c(), this.f1772h.mo1330J().mo62921h());
    }

    public Bitmap getAdLogo() {
        return BitmapFactory.decodeResource(this.f1773i.getResources(), C10647t.m31282d(C0558m.m2663a(), "tt_ad_logo_new"));
    }

    public String getTitle() {
        if (this.f1772h.mo1380aa() != null && !TextUtils.isEmpty(this.f1772h.mo1380aa().mo1217b())) {
            return this.f1772h.mo1380aa().mo1217b();
        }
        if (!TextUtils.isEmpty(getSource())) {
            return getSource();
        }
        return this.f1772h.mo1341U();
    }

    public String getDescription() {
        if (!TextUtils.isEmpty(this.f1772h.mo1341U())) {
            return this.f1772h.mo1341U();
        }
        return this.f1772h.mo1342V();
    }

    public String getButtonText() {
        return this.f1772h.mo1343W();
    }

    public int getAppScore() {
        if (this.f1772h.mo1380aa() != null) {
            return (int) this.f1772h.mo1380aa().mo1222d();
        }
        return 0;
    }

    public int getAppCommentNum() {
        if (this.f1772h.mo1380aa() != null) {
            return this.f1772h.mo1380aa().mo1223e();
        }
        return 0;
    }

    public int getAppSize() {
        if (this.f1772h.mo1380aa() != null) {
            return this.f1772h.mo1380aa().mo1224f();
        }
        return 0;
    }

    public String getSource() {
        return this.f1772h.mo1331K();
    }

    public TTImage getIcon() {
        if (this.f1772h.mo1333M() == null) {
            return null;
        }
        return C0463k.m1949a(this.f1772h.mo1333M());
    }

    public List<TTImage> getImageList() {
        ArrayList arrayList = new ArrayList();
        if (this.f1772h.mo1336P() != null && !this.f1772h.mo1336P().isEmpty()) {
            for (C0463k a : this.f1772h.mo1336P()) {
                arrayList.add(C0463k.m1949a(a));
            }
        }
        return arrayList;
    }

    public int getInteractionType() {
        C0477n nVar = this.f1772h;
        if (nVar == null) {
            return -1;
        }
        return nVar.mo1332L();
    }

    public int getImageMode() {
        C0477n nVar = this.f1772h;
        if (nVar == null) {
            return -1;
        }
        return nVar.mo1383ad();
    }

    public List<FilterWord> getFilterWords() {
        C0477n nVar = this.f1772h;
        if (nVar == null) {
            return null;
        }
        return nVar.mo1384ae();
    }

    public TTAdDislike getDislikeDialog(Activity activity) {
        if (this.f1774j == null) {
            m2250a(activity);
        }
        return this.f1774j;
    }

    public TTAdDislike getDislikeDialog(final TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.setMaterialMeta(this.f1772h);
            return new TTAdDislike() {
                public void setDislikeInteractionCallback(TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
                }

                public void showDislikeDialog() {
                    if ((tTDislikeDialogAbstract.getContext() instanceof Activity) && !((Activity) tTDislikeDialogAbstract.getContext()).isFinishing()) {
                        tTDislikeDialogAbstract.show();
                    }
                }
            };
        }
        throw new IllegalArgumentException("dialog is null, please check");
    }

    public View getAdLogoView() {
        if (this.f1773i == null) {
            C10638l.m31242e("TTNativeAdImpl", "getAdLogoView mContext == null");
            return null;
        }
        ImageView imageView = new ImageView(this.f1773i);
        imageView.setImageResource(C10647t.m31282d(this.f1773i, "tt_ad_logo_new"));
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C0489a.this.showPrivacyActivity();
            }
        });
        return imageView;
    }

    public Map<String, Object> getMediaExtraInfo() {
        C0477n nVar = this.f1772h;
        if (nVar != null) {
            return nVar.mo1389aj();
        }
        return null;
    }

    /* renamed from: a */
    private void m2250a(Activity activity) {
        Context context = this.f1773i;
        Context context2 = activity;
        if (context instanceof Activity) {
            context2 = activity;
            if (!((Activity) context).isFinishing()) {
                context2 = this.f1773i;
            }
        }
        this.f1774j = new C0759b(context2, this.f1772h);
    }

    /* renamed from: a */
    private void m2251a(boolean z) {
        C0795b c = C0795b.m3955b().mo2577a(this.f1775k).mo2582c(String.valueOf(C0996u.m4657f(this.f1772h)));
        if (z) {
            C0796b.m3985a().mo2613c(c);
        } else {
            C0796b.m3985a().mo2614d(c);
        }
    }

    /* renamed from: a */
    private boolean m2252a() {
        C0477n nVar = this.f1772h;
        if (nVar == null || nVar.mo1332L() == 5) {
            return false;
        }
        if (this.f1768a == 0) {
            this.f1768a = C0996u.m4657f(this.f1772h);
        }
        if (C0558m.m2673h().mo1683d(this.f1768a) == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo605a(String str) {
        this.f1776l = str;
    }

    public void showPrivacyActivity() {
        Context context = this.f1773i;
        if (context != null) {
            TTWebsiteActivity.m414a(context, this.f1772h, this.f1776l);
        }
    }

    public String getAdCreativeToken() {
        return this.f1772h.mo1453n();
    }

    public void win(Double d) {
        if (!this.f1769b) {
            C0992q.m4596a(this.f1772h, d);
            this.f1769b = true;
        }
    }

    public void loss(Double d, String str, String str2) {
        if (!this.f1770c) {
            C0992q.m4597a(this.f1772h, d, str, str2);
            this.f1770c = true;
        }
    }

    public void setPrice(Double d) {
        C0553l lVar = this.f1771g;
        if (lVar != null) {
            lVar.mo1835a(d);
        }
    }
}
