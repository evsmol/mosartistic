package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.bannerexpress.C0424a;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C0898a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0903a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0907e;
import com.bytedance.sdk.openadsdk.multipro.aidl.p052b.C0917b;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import java.util.ArrayList;
import java.util.List;

public class TTDislikeListView extends ListView {

    /* renamed from: a */
    protected IListenerManager f2902a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C0477n f2903b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AdapterView.OnItemClickListener f2904c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f2905d;

    /* renamed from: e */
    private AdapterView.OnItemClickListener f2906e = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (TTDislikeListView.this.getAdapter() == null || TTDislikeListView.this.getAdapter().getItem(i) == null || !(TTDislikeListView.this.getAdapter().getItem(i) instanceof FilterWord)) {
                throw new IllegalArgumentException("Adapter data is abnormal, it must be FilterWord");
            }
            FilterWord filterWord = (FilterWord) TTDislikeListView.this.getAdapter().getItem(i);
            if (!filterWord.hasSecondOptions()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(filterWord);
                if (TTDislikeListView.this.f2903b != null) {
                    C0136e.m614a(TTDislikeListView.this.f2903b, (List<FilterWord>) arrayList);
                }
                if (!TextUtils.isEmpty(TTDislikeListView.this.f2905d)) {
                    if (C0934b.m4334c()) {
                        TTDislikeListView.this.m3848a("onItemClickClosed");
                    } else {
                        C0424a.C0431a e = C0503h.m2281d().mo1599e(TTDislikeListView.this.f2905d);
                        if (e != null) {
                            e.mo1168a();
                            C0503h.m2281d().mo1605f(TTDislikeListView.this.f2905d);
                        }
                    }
                }
            }
            try {
                if (TTDislikeListView.this.f2904c != null) {
                    TTDislikeListView.this.f2904c.onItemClick(adapterView, view, i, j);
                }
            } catch (Throwable unused) {
            }
        }
    };

    public TTDislikeListView(Context context) {
        super(context);
        m3844a();
    }

    public TTDislikeListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3844a();
    }

    public TTDislikeListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3844a();
    }

    public void setMaterialMeta(C0477n nVar) {
        this.f2903b = nVar;
    }

    /* renamed from: a */
    private void m3844a() {
        super.setOnItemClickListener(this.f2906e);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f2904c = onItemClickListener;
    }

    public void setClosedListenerKey(String str) {
        this.f2905d = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3848a(final String str) {
        C10615e.m31168c(new C10618g("Reward_executeMultiProcessCallback") {
            public void run() {
                try {
                    if (!TextUtils.isEmpty(TTDislikeListView.this.f2905d)) {
                        TTDislikeListView.this.mo2510a(6).executeDisLikeClosedCallback(TTDislikeListView.this.f2905d, str);
                    }
                } catch (Throwable th) {
                    C10638l.m31239c("TTDislikeListView", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IListenerManager mo2510a(int i) {
        if (this.f2902a == null) {
            this.f2902a = C0903a.asInterface(C0898a.m4299a(C0558m.m2663a()).mo2767a(i));
        }
        return this.f2902a;
    }

    /* renamed from: a */
    public static void m3846a(final int i, final String str, final C0424a.C0431a aVar) {
        if (C0934b.m4334c()) {
            C10615e.m31168c(new C10618g("DislikeClosed_registerMultiProcessListener") {
                public void run() {
                    C0898a a = C0898a.m4299a(C0558m.m2663a());
                    if (i == 6 && aVar != null) {
                        try {
                            C10638l.m31235b("TTDislikeListView", "start registerDislikeClickCloseListener ! ");
                            C0917b bVar = new C0917b(str, aVar);
                            IListenerManager asInterface = C0907e.asInterface(a.mo2767a(6));
                            if (asInterface != null) {
                                asInterface.registerDisLikeClosedListener(str, bVar);
                                C10638l.m31235b("TTDislikeListView", "end registerDislikeClickCloseListener ! ");
                            }
                        } catch (RemoteException e) {
                            e.printStackTrace();
                            C10638l.m31235b("TTDislikeListView", "multiProcess registerDislikeClickCloseListener error");
                        }
                    }
                }
            }, 5);
        }
    }

    /* renamed from: a */
    public static void m3845a(final int i, final String str) {
        if (C0934b.m4334c()) {
            C10615e.m31168c(new C10618g("DislikeClosed_unregisterMultiProcessListener") {
                public void run() {
                    C0898a a = C0898a.m4299a(C0558m.m2663a());
                    if (i == 6) {
                        try {
                            C10638l.m31235b("TTDislikeListView", "start unregisterDislikeClickCloseListener ! ");
                            IListenerManager asInterface = C0907e.asInterface(a.mo2767a(6));
                            if (asInterface != null) {
                                asInterface.unregisterDisLikeClosedListener(str);
                                C10638l.m31235b("TTDislikeListView", "end unregisterDislikeClickCloseListener ! ");
                            }
                        } catch (RemoteException unused) {
                            C10638l.m31235b("TTDislikeListView", "multiProcess unregisterMultiProcessListener error");
                        }
                    }
                }
            }, 5);
        }
    }
}
