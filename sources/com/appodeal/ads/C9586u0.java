package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;

/* renamed from: com.appodeal.ads.u0 */
public final class C9586u0 extends C9192g<C9683w0, C9674v0, Object> {

    /* renamed from: a */
    public BannerCallbacks f24319a;

    /* renamed from: a */
    public final void mo59944a(C9420r rVar, C9258l lVar, Object obj) {
        C9683w0 w0Var = (C9683w0) rVar;
        C9674v0 v0Var = (C9674v0) lVar;
        Log.log("Banner", LogConstants.EVENT_NOTIFY_CLICKED, Log.LogLevel.verbose);
        BannerCallbacks bannerCallbacks = this.f24319a;
        if (bannerCallbacks != null) {
            bannerCallbacks.onBannerClicked();
        }
    }

    /* renamed from: b */
    public final void mo59945b(C9420r rVar, C9258l lVar) {
        C9683w0 w0Var = (C9683w0) rVar;
        C9674v0 v0Var = (C9674v0) lVar;
        Log.log("Banner", LogConstants.EVENT_NOTIFY_EXPIRED, Log.LogLevel.verbose);
        BannerCallbacks bannerCallbacks = this.f24319a;
        if (bannerCallbacks != null) {
            bannerCallbacks.onBannerExpired();
        }
    }

    /* renamed from: c */
    public final void mo59948c(C9420r rVar, C9258l lVar, Object obj) {
        C9683w0 w0Var = (C9683w0) rVar;
        C9674v0 v0Var = (C9674v0) lVar;
        Log.log("Banner", LogConstants.EVENT_NOTIFY_SHOWN, Log.LogLevel.verbose);
        BannerCallbacks bannerCallbacks = this.f24319a;
        if (bannerCallbacks != null) {
            bannerCallbacks.onBannerShown();
        }
    }

    /* renamed from: d */
    public final void mo59949d(C9420r rVar, C9258l lVar) {
        C9683w0 w0Var = (C9683w0) rVar;
        C9674v0 v0Var = (C9674v0) lVar;
        Log.log("Banner", LogConstants.EVENT_NOTIFY_LOAD_FAILED, Log.LogLevel.verbose);
        BannerCallbacks bannerCallbacks = this.f24319a;
        if (bannerCallbacks != null) {
            bannerCallbacks.onBannerFailedToLoad();
        }
    }

    /* renamed from: e */
    public final void mo59950e(C9420r rVar, C9258l lVar) {
        C9683w0 w0Var = (C9683w0) rVar;
        C9674v0 v0Var = (C9674v0) lVar;
        Log.log("Banner", LogConstants.EVENT_NOTIFY_LOADED, String.format("height: %sdp, isPrecache: %s", new Object[]{Integer.valueOf(v0Var.mo61208m()), Boolean.valueOf(v0Var.isPrecache())}), Log.LogLevel.verbose);
        BannerCallbacks bannerCallbacks = this.f24319a;
        if (bannerCallbacks != null) {
            bannerCallbacks.onBannerLoaded(v0Var.mo61208m(), v0Var.isPrecache());
        }
    }

    /* renamed from: b */
    public final void mo59946b(C9420r rVar, C9258l lVar, Object obj) {
        C9683w0 w0Var = (C9683w0) rVar;
        C9674v0 v0Var = (C9674v0) lVar;
        Log.log("Banner", LogConstants.EVENT_NOTIFY_SHOW_FAILED, Log.LogLevel.verbose);
        BannerCallbacks bannerCallbacks = this.f24319a;
        if (bannerCallbacks != null) {
            bannerCallbacks.onBannerShowFailed();
        }
    }
}
