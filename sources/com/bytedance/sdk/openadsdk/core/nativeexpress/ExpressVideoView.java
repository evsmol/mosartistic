package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.View;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10190b;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.p000b.C0146j;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C1002v;

public class ExpressVideoView extends NativeVideoTsView implements View.OnClickListener {

    /* renamed from: q */
    private boolean f2105q = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1860a(boolean z) {
    }

    public ExpressVideoView(Context context, C0477n nVar, String str, C0146j jVar) {
        super(context, nVar, false, str, false, false, jVar);
        if ("draw_ad".equals(str)) {
            this.f2105q = true;
        }
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1861b() {
        if (!this.f2486e || !C0604o.m2910b(this.f2493l)) {
            this.f2485d = false;
        }
        super.mo1861b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo1862c() {
        if (this.f2105q) {
            super.mo1862c();
        }
    }

    public void setCanInterruptVideoPlay(boolean z) {
        this.f2105q = z;
    }

    public void setShouldCheckNetChange(boolean z) {
        if (this.f2483b != null) {
            this.f2483b.mo2167e(z);
        }
    }

    /* renamed from: d */
    public void mo1863d() {
        if (this.f2491j != null) {
            C1002v.m4716a((View) this.f2491j, 8);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        if (this.f2490i == null || this.f2490i.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i);
        } else {
            m2700o();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.f2490i == null || this.f2490i.getVisibility() != 0) {
            super.onWindowFocusChanged(z);
        } else {
            m2700o();
        }
    }

    /* renamed from: n */
    private void m2699n() {
        C1002v.m4716a((View) this.f2488g, 0);
        C1002v.m4716a((View) this.f2489h, 0);
        C1002v.m4716a((View) this.f2491j, 8);
    }

    /* renamed from: o */
    private void m2700o() {
        mo2204g();
        if (this.f2488g != null) {
            if (this.f2488g.getVisibility() != 0) {
                C0835d.m4093a().mo2659a(this.f2482a.mo1330J().mo62921h(), this.f2489h);
            } else {
                return;
            }
        }
        m2699n();
    }

    public void onClick(View view) {
        if (this.f2490i != null && this.f2490i.getVisibility() == 0) {
            C1002v.m4750e((View) this.f2488g);
        }
        mo1862c();
    }

    public void setShowAdInteractionView(boolean z) {
        C10190b o;
        if (this.f2483b != null && (o = this.f2483b.mo2115o()) != null) {
            o.mo2309a(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1864e() {
        mo2204g();
        C1002v.m4716a((View) this.f2488g, 0);
    }
}
