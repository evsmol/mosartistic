package com.criteo.publisher.p074n0;

import com.criteo.publisher.C1133g;
import p150io.bidmachine.ads.networks.criteo.BuildConfig;

/* renamed from: com.criteo.publisher.n0.g */
/* compiled from: BuildConfigWrapper */
public class C1300g {
    /* renamed from: a */
    public int mo3629a() {
        return 15;
    }

    /* renamed from: b */
    public int mo3630b() {
        return 19;
    }

    /* renamed from: d */
    public int mo3632d() {
        return 24;
    }

    /* renamed from: e */
    public String mo3633e() {
        return "criteo_metrics";
    }

    /* renamed from: f */
    public String mo3634f() {
        return "criteo_metrics_queue";
    }

    /* renamed from: g */
    public int mo3635g() {
        return 5;
    }

    /* renamed from: h */
    public int mo3636h() {
        return 170;
    }

    /* renamed from: i */
    public int mo3637i() {
        return 5000;
    }

    /* renamed from: j */
    public String mo3638j() {
        return "https://gum.criteo.com";
    }

    /* renamed from: k */
    public int mo3639k() {
        return 61440;
    }

    /* renamed from: l */
    public int mo3640l() {
        return 49152;
    }

    /* renamed from: m */
    public int mo3641m() {
        return 256000;
    }

    /* renamed from: n */
    public int mo3642n() {
        return 60000;
    }

    /* renamed from: o */
    public int mo3643o() {
        return 200;
    }

    /* renamed from: p */
    public String mo3644p() {
        return "criteo_remote_logs_queue";
    }

    /* renamed from: q */
    public String mo3645q() {
        return BuildConfig.ADAPTER_SDK_VERSION_NAME;
    }

    /* renamed from: r */
    public boolean mo3646r() {
        return false;
    }

    /* renamed from: c */
    public String mo3631c() {
        if (C1133g.f3624a) {
            return System.getProperty("com.criteo.publisher.config.cdbUrl", "https://bidder.criteo.com");
        }
        return "https://bidder.criteo.com";
    }
}
