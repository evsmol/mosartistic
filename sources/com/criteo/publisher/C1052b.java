package com.criteo.publisher;

import com.criteo.publisher.logging.C1193e;
import com.criteo.publisher.model.BannerAdUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.b */
/* compiled from: BannerLogMessage.kt */
public final class C1052b {
    static {
        new C1052b();
    }

    private C1052b() {
    }

    /* renamed from: a */
    public static final C1193e m4925a(BannerAdUnit bannerAdUnit) {
        return new C1193e(0, "BannerView initialized for " + bannerAdUnit, (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static final C1193e m4927c(CriteoBannerView criteoBannerView) {
        Intrinsics.checkParameterIsNotNull(criteoBannerView, "bannerView");
        return new C1193e(0, "BannerView(" + criteoBannerView.bannerAdUnit + ") is loading", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C1193e m4924a(CriteoBannerView criteoBannerView, Bid bid) {
        Intrinsics.checkParameterIsNotNull(criteoBannerView, "bannerView");
        StringBuilder sb = new StringBuilder();
        sb.append("BannerView(");
        sb.append(criteoBannerView.bannerAdUnit);
        sb.append(") is loading with bid ");
        sb.append(bid != null ? C1057c.m4931a(bid) : null);
        return new C1193e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static final C1193e m4926b(CriteoBannerView criteoBannerView) {
        StringBuilder sb = new StringBuilder();
        sb.append("BannerView(");
        sb.append(criteoBannerView != null ? criteoBannerView.bannerAdUnit : null);
        sb.append(") is loaded");
        return new C1193e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C1193e m4923a(CriteoBannerView criteoBannerView) {
        StringBuilder sb = new StringBuilder();
        sb.append("BannerView(");
        sb.append(criteoBannerView != null ? criteoBannerView.bannerAdUnit : null);
        sb.append(") failed to load");
        return new C1193e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }
}
