package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0604o;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;

public class NativeDrawVideoTsView extends NativeVideoTsView implements View.OnClickListener {

    /* renamed from: q */
    private boolean f2468q;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1861b() {
        if (!this.f2486e || !C0604o.m2910b(this.f2493l)) {
            this.f2485d = false;
        }
        this.f2493l = "draw_ad";
        C0558m.m2673h().mo1712o(String.valueOf(C0996u.m4657f(this.f2482a)));
        super.mo1861b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo1862c() {
        if (this.f2468q) {
            super.mo1862c();
        }
    }

    public void setCanInterruptVideoPlay(boolean z) {
        this.f2468q = z;
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        if (this.f2490i == null || this.f2490i.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i);
        } else {
            m3297e();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.f2490i == null || this.f2490i.getVisibility() != 0) {
            super.onWindowFocusChanged(z);
        } else {
            m3297e();
        }
    }

    /* renamed from: d */
    private void m3296d() {
        C1002v.m4716a((View) this.f2488g, 0);
        C1002v.m4716a((View) this.f2489h, 0);
        C1002v.m4716a((View) this.f2491j, 8);
    }

    /* renamed from: e */
    private void m3297e() {
        mo2204g();
        if (this.f2488g != null) {
            if (this.f2488g.getVisibility() != 0) {
                C0835d.m4093a().mo2659a(this.f2482a.mo1330J().mo62921h(), this.f2489h);
            } else {
                return;
            }
        }
        m3296d();
    }

    public void onClick(View view) {
        if (this.f2490i != null && this.f2490i.getVisibility() == 0) {
            C1002v.m4750e((View) this.f2488g);
        }
        mo1862c();
    }
}
