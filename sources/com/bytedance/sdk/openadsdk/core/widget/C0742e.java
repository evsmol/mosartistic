package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10187b;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10190b;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C0675a;
import com.bytedance.sdk.openadsdk.utils.C1002v;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.e */
/* compiled from: VideoTrafficTipLayout */
public class C0742e {

    /* renamed from: a */
    private View f2868a;

    /* renamed from: b */
    private TextView f2869b;

    /* renamed from: c */
    private Context f2870c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C0675a f2871d;

    /* renamed from: e */
    private C0745b f2872e;

    /* renamed from: f */
    private boolean f2873f = false;

    /* renamed from: g */
    private C10187b f2874g;

    /* renamed from: h */
    private ViewStub f2875h;

    /* renamed from: i */
    private View f2876i;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.e$a */
    /* compiled from: VideoTrafficTipLayout */
    public enum C0744a {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.e$b */
    /* compiled from: VideoTrafficTipLayout */
    public interface C0745b {
        /* renamed from: j */
        boolean mo2285j();

        /* renamed from: l */
        void mo2287l();
    }

    /* renamed from: a */
    public void mo2500a(Context context, View view) {
        if (context != null && (view instanceof ViewGroup)) {
            this.f2876i = view;
            this.f2870c = C0558m.m2663a().getApplicationContext();
            this.f2875h = (ViewStub) LayoutInflater.from(context).inflate(C10647t.m31284f(context, "tt_video_traffic_tip"), (ViewGroup) view, true).findViewById(C10647t.m31283e(context, "tt_video_traffic_tip_layout_viewStub"));
        }
    }

    /* renamed from: a */
    private void m3786a(Context context, View view, boolean z) {
        ViewStub viewStub;
        if (context != null && view != null && (viewStub = this.f2875h) != null && viewStub.getParent() != null && this.f2868a == null) {
            this.f2875h.inflate();
            this.f2868a = view.findViewById(C10647t.m31283e(context, "tt_video_traffic_tip_layout"));
            this.f2869b = (TextView) view.findViewById(C10647t.m31283e(context, "tt_video_traffic_tip_tv"));
            View findViewById = view.findViewById(C10647t.m31283e(context, "tt_video_traffic_continue_play_btn"));
            if (z) {
                findViewById.setClickable(true);
                findViewById.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        C0742e.this.m3792c();
                        if (C0742e.this.f2871d != null) {
                            C0742e.this.f2871d.mo2151a(C0744a.START_VIDEO, (String) null);
                        }
                    }
                });
                return;
            }
            findViewById.setOnClickListener((View.OnClickListener) null);
            findViewById.setClickable(false);
        }
    }

    /* renamed from: a */
    public void mo2501a(C0675a aVar, C0745b bVar) {
        this.f2872e = bVar;
        this.f2871d = aVar;
    }

    /* renamed from: b */
    private void m3791b() {
        this.f2874g = null;
    }

    /* renamed from: a */
    public boolean mo2504a(int i, C10187b bVar, boolean z) {
        Context context = this.f2870c;
        if (context == null || bVar == null) {
            return true;
        }
        m3786a(context, this.f2876i, z);
        this.f2874g = bVar;
        if (i == 1 || i == 2) {
            return m3789a(i);
        }
        return true;
    }

    /* renamed from: a */
    private boolean m3789a(int i) {
        C0745b bVar;
        if (mo2503a() || this.f2873f) {
            return true;
        }
        if (!(this.f2871d == null || (bVar = this.f2872e) == null)) {
            if (bVar.mo2285j()) {
                this.f2871d.mo2166e((C10190b) null, (View) null);
            }
            this.f2871d.mo2151a(C0744a.PAUSE_VIDEO, (String) null);
        }
        m3787a(this.f2874g, true);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m3792c() {
        if (this.f2870c != null) {
            m3793d();
        }
    }

    /* renamed from: a */
    public void mo2502a(boolean z) {
        if (z) {
            m3791b();
        }
        m3793d();
    }

    /* renamed from: a */
    public boolean mo2503a() {
        View view = this.f2868a;
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: d */
    private void m3793d() {
        View view = this.f2868a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m3787a(C10187b bVar, boolean z) {
        View view;
        String str;
        View view2;
        if (bVar != null && (view = this.f2868a) != null && this.f2870c != null && view.getVisibility() != 0) {
            C0745b bVar2 = this.f2872e;
            if (bVar2 != null) {
                bVar2.mo2287l();
            }
            double ceil = Math.ceil((((double) bVar.mo62913e()) * 1.0d) / 1048576.0d);
            if (z) {
                str = String.format(C10647t.m31276a(this.f2870c, "tt_video_without_wifi_tips"), new Object[]{Float.valueOf(Double.valueOf(ceil).floatValue())});
            } else {
                str = C10647t.m31276a(this.f2870c, "tt_video_without_wifi_tips") + C10647t.m31276a(this.f2870c, "tt_video_bytesize");
            }
            C1002v.m4716a(this.f2868a, 0);
            C1002v.m4725a(this.f2869b, (CharSequence) str);
            Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
            if (C1002v.m4747d(this.f2868a) && (view2 = this.f2868a) != null) {
                view2.bringToFront();
                Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
            }
        }
    }
}
