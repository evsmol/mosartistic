package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C10281b;
import com.bytedance.sdk.component.adexpress.p298b.C10285c;
import com.bytedance.sdk.component.adexpress.p298b.C10286d;
import com.bytedance.sdk.component.adexpress.p298b.C10298m;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0597j;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0604o;
import com.bytedance.sdk.openadsdk.core.nativeexpress.FullRewardExpressBackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.utils.C1002v;

public class FullRewardExpressView extends NativeExpressView {

    /* renamed from: c */
    public static float f1184c = 100.0f;

    /* renamed from: a */
    C0597j f1185a;

    /* renamed from: b */
    FullRewardExpressBackupView f1186b;

    public FullRewardExpressView(Context context, C0477n nVar, AdSlot adSlot, String str, boolean z) {
        super(context, nVar, adSlot, str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo967g() {
        this.f2157m = true;
        this.f2155k = new FrameLayout(this.f2150f);
        addView(this.f2155k, new FrameLayout.LayoutParams(-1, -1));
        super.mo967g();
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
        m1513h();
    }

    /* renamed from: h */
    private void m1513h() {
        setBackupListener(new C10285c() {
            /* renamed from: a */
            public boolean mo971a(ViewGroup viewGroup, int i) {
                try {
                    ((NativeExpressView) viewGroup).mo1898m();
                    FullRewardExpressView.this.f1186b = new FullRewardExpressBackupView(viewGroup.getContext());
                    FullRewardExpressView.this.f1186b.mo1871a(FullRewardExpressView.this.f2153i, (NativeExpressView) viewGroup);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    /* renamed from: a */
    public void mo966a(C10286d<? extends View> dVar, C10298m mVar) {
        if (dVar instanceof C0604o) {
            C0604o oVar = (C0604o) dVar;
            if (oVar.mo2005p() != null) {
                oVar.mo2005p().mo2346a((C0597j) this);
            }
        }
        if (mVar != null && mVar.mo63212a()) {
            m1510a(mVar);
        }
        super.mo966a(dVar, mVar);
    }

    public void setExpressVideoListenerProxy(C0597j jVar) {
        this.f1185a = jVar;
    }

    /* renamed from: a */
    private void m1510a(final C10298m mVar) {
        if (mVar != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m1512b(mVar);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        FullRewardExpressView.this.m1512b(mVar);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1512b(C10298m mVar) {
        if (mVar != null) {
            double d = mVar.mo63221d();
            double e = mVar.mo63224e();
            double f = mVar.mo63226f();
            double g = mVar.mo63228g();
            int b = (int) C1002v.m4731b(this.f2150f, (float) d);
            int b2 = (int) C1002v.m4731b(this.f2150f, (float) e);
            int b3 = (int) C1002v.m4731b(this.f2150f, (float) f);
            int b4 = (int) C1002v.m4731b(this.f2150f, (float) g);
            C10638l.m31235b("ExpressView", "videoWidth:" + f);
            C10638l.m31235b("ExpressView", "videoHeight:" + g);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f2155k.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(b3, b4);
            }
            layoutParams.width = b3;
            layoutParams.height = b4;
            layoutParams.topMargin = b2;
            layoutParams.leftMargin = b;
            this.f2155k.setLayoutParams(layoutParams);
            this.f2155k.removeAllViews();
        }
    }

    /* renamed from: a */
    public void mo130a(boolean z) {
        C10638l.m31235b("FullRewardExpressView", "onMuteVideo,mute:" + z);
        C0597j jVar = this.f1185a;
        if (jVar != null) {
            jVar.mo130a(z);
        }
        setSoundMute(z);
    }

    /* renamed from: a */
    public void mo128a() {
        C10638l.m31235b("FullRewardExpressView", "onSkipVideo");
        C0597j jVar = this.f1185a;
        if (jVar != null) {
            jVar.mo128a();
        }
    }

    /* renamed from: b */
    public void mo131b() {
        C0597j jVar = this.f1185a;
        if (jVar != null) {
            jVar.mo131b();
        }
    }

    /* renamed from: a */
    public void mo129a(int i) {
        C10638l.m31235b("FullRewardExpressView", "onChangeVideoState,stateType:" + i);
        C0597j jVar = this.f1185a;
        if (jVar != null) {
            jVar.mo129a(i);
        }
    }

    /* renamed from: c */
    public long mo133c() {
        C10638l.m31235b("FullRewardExpressView", "onGetCurrentPlayTime");
        C0597j jVar = this.f1185a;
        if (jVar != null) {
            return jVar.mo133c();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo134d() {
        C10638l.m31235b("FullRewardExpressView", "onGetVideoState");
        C0597j jVar = this.f1185a;
        if (jVar != null) {
            return jVar.mo134d();
        }
        return 0;
    }

    /* renamed from: e */
    public void mo135e() {
        C0597j jVar = this.f1185a;
        if (jVar != null) {
            jVar.mo135e();
        }
    }

    /* renamed from: a */
    public void mo965a(View view, int i, C10281b bVar) {
        if (i == -1 || bVar == null || i != 3) {
            super.mo965a(view, i, bVar);
        } else {
            mo135e();
        }
    }

    public FrameLayout getVideoFrameLayout() {
        if (mo1899n()) {
            return this.f1186b.getVideoContainer();
        }
        return this.f2155k;
    }

    public View getBackupContainerBackgroundView() {
        if (mo1899n()) {
            return this.f1186b.getBackupContainerBackgroundView();
        }
        return null;
    }

    /* renamed from: b */
    public void mo132b(int i) {
        C0597j jVar = this.f1185a;
        if (jVar != null) {
            jVar.mo132b(i);
        }
    }
}
