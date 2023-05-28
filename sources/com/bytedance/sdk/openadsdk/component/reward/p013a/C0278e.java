package com.bytedance.sdk.openadsdk.component.reward.p013a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.p271vk.openvk.component.video.api.C10181a;
import com.bykv.p271vk.openvk.component.video.api.p287b.C10185a;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.reward.C0310c;
import com.bytedance.sdk.openadsdk.component.reward.C0311d;
import com.bytedance.sdk.openadsdk.component.reward.C0335h;
import com.bytedance.sdk.openadsdk.component.reward.C0336i;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0464l;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.video.p034c.C0651a;
import com.bytedance.sdk.openadsdk.core.video.p034c.C0666b;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p000b.C0146j;
import com.bytedance.sdk.openadsdk.p000b.p002b.p003a.C0113a;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0130o;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.io.File;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.e */
/* compiled from: RewardFullVideoPlayerManager */
public class C0278e {

    /* renamed from: a */
    long f910a;

    /* renamed from: b */
    protected boolean f911b = false;

    /* renamed from: c */
    boolean f912c = false;

    /* renamed from: d */
    String f913d;

    /* renamed from: e */
    boolean f914e;

    /* renamed from: f */
    protected boolean f915f = false;

    /* renamed from: g */
    C10192c f916g;

    /* renamed from: h */
    long f917h;

    /* renamed from: i */
    private Activity f918i;

    /* renamed from: j */
    private C0477n f919j;

    /* renamed from: k */
    private FrameLayout f920k;

    /* renamed from: l */
    private String f921l;

    /* renamed from: m */
    private boolean f922m = false;

    /* renamed from: n */
    private C0146j f923n;

    /* renamed from: a */
    public C0146j mo729a() {
        return this.f923n;
    }

    public C0278e(Activity activity) {
        this.f918i = activity;
    }

    /* renamed from: a */
    public void mo732a(FrameLayout frameLayout, C0477n nVar, String str, boolean z, C0146j jVar) {
        if (!this.f922m) {
            this.f922m = true;
            this.f919j = nVar;
            this.f920k = frameLayout;
            this.f921l = str;
            this.f914e = z;
            this.f923n = jVar;
            if (z) {
                this.f916g = new C0335h(this.f918i, frameLayout, nVar, jVar);
            } else {
                this.f916g = new C0310c(this.f918i, frameLayout, nVar, jVar);
            }
        }
    }

    /* renamed from: b */
    public boolean mo744b() {
        C10192c cVar = this.f916g;
        return (cVar == null || cVar.mo2114n() == null || !this.f916g.mo2114n().mo62869l()) ? false : true;
    }

    /* renamed from: c */
    public C10185a mo745c() {
        C10192c cVar = this.f916g;
        if (cVar != null) {
            return cVar.mo2115o();
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo747d() {
        C10192c cVar = this.f916g;
        return (cVar == null || cVar.mo2114n() == null || !this.f916g.mo2114n().mo62870m()) ? false : true;
    }

    /* renamed from: e */
    public boolean mo748e() {
        C10192c cVar = this.f916g;
        return cVar != null && cVar.mo2172r();
    }

    /* renamed from: a */
    public void mo731a(long j) {
        this.f917h = j;
    }

    /* renamed from: f */
    public long mo749f() {
        return this.f917h;
    }

    /* renamed from: g */
    public boolean mo750g() {
        return this.f911b;
    }

    /* renamed from: h */
    public long mo751h() {
        return this.f910a;
    }

    /* renamed from: b */
    public void mo742b(long j) {
        this.f910a = j;
    }

    /* renamed from: a */
    public void mo738a(boolean z) {
        this.f911b = z;
    }

    /* renamed from: i */
    public void mo752i() {
        try {
            if (mo744b()) {
                this.f916g.mo2155b();
            }
        } catch (Throwable th) {
            C10638l.m31234b("RewardFullVideoPlayerManager onPause throw Exception :" + th.getMessage());
        }
    }

    /* renamed from: a */
    public void mo730a(int i, int i2) {
        if (this.f916g != null) {
            C0130o.C0131a aVar = new C0130o.C0131a();
            aVar.mo376b(mo753j());
            aVar.mo379c(mo764u());
            aVar.mo372a(mo762s());
            aVar.mo378c(i);
            aVar.mo381d(i2);
            C0113a.m486d(this.f916g.mo2115o(), aVar);
        }
    }

    /* renamed from: j */
    public long mo753j() {
        C10192c cVar = this.f916g;
        if (cVar != null) {
            return cVar.mo2110h();
        }
        return 0;
    }

    /* renamed from: F */
    private void m1116F() {
        C10192c cVar = this.f916g;
        if (cVar != null && cVar.mo2114n() != null) {
            this.f910a = this.f916g.mo2109g();
            if (this.f916g.mo2114n().mo62866i() || !this.f916g.mo2114n().mo62865h()) {
                this.f916g.mo2155b();
                this.f916g.mo2165e();
                this.f911b = true;
            }
        }
    }

    /* renamed from: k */
    public void mo754k() {
        C10192c cVar = this.f916g;
        if (cVar != null) {
            cVar.mo2165e();
            this.f916g = null;
        }
    }

    /* renamed from: l */
    public void mo755l() {
        C10192c cVar = this.f916g;
        if (cVar != null) {
            cVar.mo2104c();
            this.f916g.mo2168f();
        }
    }

    /* renamed from: m */
    public void mo756m() {
        C10192c cVar = this.f916g;
        if (cVar != null) {
            cVar.mo2168f();
        }
    }

    /* renamed from: n */
    public void mo757n() {
        C10192c cVar = this.f916g;
        if (cVar != null) {
            cVar.mo2161d();
        }
    }

    /* renamed from: o */
    public void mo758o() {
        C10192c cVar = this.f916g;
        if (cVar != null) {
            cVar.mo2155b();
        }
    }

    /* renamed from: a */
    public void mo737a(Map<String, Object> map) {
        C10192c cVar = this.f916g;
        if (cVar != null) {
            cVar.mo2152a(map);
        }
    }

    /* renamed from: a */
    public void mo733a(C10192c.C10193a aVar) {
        C10192c cVar = this.f916g;
        if (cVar != null) {
            cVar.mo2148a(aVar);
        }
    }

    /* renamed from: b */
    public void mo743b(boolean z) {
        C10192c cVar = this.f916g;
        if (cVar != null) {
            cVar.mo2103b(z);
        }
    }

    /* renamed from: p */
    public long mo759p() {
        C10192c cVar = this.f916g;
        if (cVar != null) {
            return cVar.mo2112j();
        }
        return 0;
    }

    /* renamed from: q */
    public int mo760q() {
        C10192c cVar = this.f916g;
        if (cVar != null) {
            return cVar.mo2171l();
        }
        return 0;
    }

    /* renamed from: r */
    public int mo761r() {
        C10192c cVar = this.f916g;
        if (cVar != null) {
            return cVar.mo2111i();
        }
        return 0;
    }

    /* renamed from: s */
    public long mo762s() {
        C10192c cVar = this.f916g;
        if (cVar != null) {
            return cVar.mo2109g();
        }
        return this.f910a;
    }

    /* renamed from: t */
    public void mo763t() {
        C10192c cVar = this.f916g;
        if (cVar != null && cVar.mo2114n() != null) {
            this.f916g.mo2114n().mo62860c();
        }
    }

    /* renamed from: u */
    public long mo764u() {
        C10192c cVar = this.f916g;
        if (cVar != null) {
            return cVar.mo2112j() + this.f916g.mo2110h();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo736a(String str, Map<String, Object> map) {
        C10192c cVar = this.f916g;
        if (cVar != null) {
            Map<String, Object> a = C0996u.m4620a(this.f919j, cVar.mo2110h(), this.f916g.mo2114n());
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    a.put(next.getKey(), next.getValue());
                }
            }
            C0136e.m597a((Context) this.f918i, this.f919j, this.f921l, str, mo764u(), mo760q(), a, this.f923n);
            C10638l.m31235b("TTBaseVideoActivity", "event tag:" + this.f921l + ", TotalPlayDuration=" + mo764u() + ",mBasevideoController.getPct()=" + mo760q());
        }
    }

    /* renamed from: v */
    public long mo765v() {
        C10192c cVar = this.f916g;
        if (cVar != null) {
            return cVar.mo2112j();
        }
        return 0;
    }

    /* renamed from: w */
    public boolean mo766w() {
        C10192c cVar = this.f916g;
        if (cVar != null) {
            if (cVar.mo2114n() != null) {
                C10181a n = this.f916g.mo2114n();
                if (n.mo62870m() || n.mo62871n()) {
                    ((C0651a) this.f916g).mo2136I();
                    return true;
                }
            } else if (mo750g()) {
                mo738a(false);
                ((C0651a) this.f916g).mo2136I();
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public boolean mo767x() {
        return this.f916g != null;
    }

    /* renamed from: y */
    public boolean mo768y() {
        C10192c cVar = this.f916g;
        return cVar != null && cVar.mo2114n() == null;
    }

    /* renamed from: a */
    public boolean mo741a(long j, boolean z) {
        C10638l.m31235b("TTBaseVideoActivity", "playVideo start");
        if (this.f916g == null || this.f919j.mo1330J() == null) {
            C10638l.m31235b("TTBaseVideoActivity", "playVideo controller is Empty");
            return false;
        }
        File file = new File(CacheDirFactory.getICacheDir(this.f919j.mo1373aD()).mo62649b(), this.f919j.mo1330J().mo62927l());
        if (file.exists() && file.length() > 0) {
            this.f912c = true;
        }
        C10188c a = C0477n.m2007a(CacheDirFactory.getICacheDir(this.f919j.mo1373aD()).mo62649b(), this.f919j);
        a.mo62945b(this.f919j.mo1345Y());
        a.mo62937a(this.f920k.getWidth());
        a.mo62944b(this.f920k.getHeight());
        a.mo62948c(this.f919j.mo1382ac());
        a.mo62938a(j);
        a.mo62942a(z);
        return this.f916g.mo2154a(a);
    }

    /* renamed from: a */
    public void mo735a(String str) {
        this.f913d = str;
    }

    /* renamed from: z */
    public String mo769z() {
        return this.f913d;
    }

    /* renamed from: c */
    public void mo746c(boolean z) {
        mo754k();
        if (!TextUtils.isEmpty(this.f913d)) {
            return;
        }
        if (z) {
            C0336i.m1401a(C0558m.m2663a()).mo895a();
        } else {
            C0311d.m1344a(C0558m.m2663a()).mo865b();
        }
    }

    /* renamed from: A */
    public void mo724A() {
        try {
            if (mo744b()) {
                this.f915f = true;
                mo758o();
            }
        } catch (Throwable th) {
            C10638l.m31242e("TTBaseVideoActivity", "onPause throw Exception :" + th.getMessage());
        }
    }

    /* renamed from: a */
    public void mo739a(boolean z, C0666b bVar) {
        try {
            this.f915f = false;
            if (mo750g()) {
                m1116F();
                mo734a(bVar);
            } else if (mo747d()) {
                mo757n();
            }
        } catch (Throwable th) {
            C10638l.m31242e("TTBaseVideoActivity", "onContinue throw Exception :" + th.getMessage());
        }
    }

    /* renamed from: a */
    public void mo740a(boolean z, C0666b bVar, boolean z2) {
        if (z2 && !z && !this.f915f) {
            if (mo747d()) {
                mo757n();
                Log.i("TTBaseVideoActivity", "resumeOrRestartVideo: continue play");
                return;
            }
            m1116F();
            mo734a(bVar);
            Log.i("TTBaseVideoActivity", "resumeOrRestartVideo: recreate video player & exec play");
        }
    }

    /* renamed from: B */
    public boolean mo725B() {
        C10192c cVar = this.f916g;
        if (cVar == null || cVar.mo2114n() == null) {
            return false;
        }
        return this.f916g.mo2114n().mo62862e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo734a(C0666b bVar) {
        if (mo766w() && bVar != null) {
            bVar.mo156a(mo751h(), true);
        }
    }

    /* renamed from: C */
    public double mo726C() {
        if (C0464l.m1969c(this.f919j) && this.f919j.mo1347a() != null) {
            return (double) this.f919j.mo1347a().mo1315b();
        }
        C0477n nVar = this.f919j;
        if (nVar == null || nVar.mo1330J() == null) {
            return 0.0d;
        }
        return this.f919j.mo1330J().mo62916f();
    }

    /* renamed from: D */
    public void mo727D() {
        C10192c cVar = this.f916g;
        if (cVar instanceof C0651a) {
            ((C0651a) cVar).mo2135H();
        }
    }

    /* renamed from: E */
    public View mo728E() {
        C10192c cVar = this.f916g;
        if (cVar instanceof C0651a) {
            return (View) ((C0651a) cVar).mo2137J();
        }
        return null;
    }
}
