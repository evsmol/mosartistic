package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;

/* renamed from: com.appodeal.ads.p4 */
public final class C9399p4 extends C9192g<C9325n4, C9277m4, Object> {

    /* renamed from: a */
    public RewardedVideoCallbacks f23822a;

    /* renamed from: a */
    public final void mo59944a(C9420r rVar, C9258l lVar, Object obj) {
        C9325n4 n4Var = (C9325n4) rVar;
        C9277m4 m4Var = (C9277m4) lVar;
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_CLICKED, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f23822a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoClicked();
        }
    }

    /* renamed from: b */
    public final void mo59945b(C9420r rVar, C9258l lVar) {
        C9325n4 n4Var = (C9325n4) rVar;
        C9277m4 m4Var = (C9277m4) lVar;
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_EXPIRED, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f23822a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoExpired();
        }
    }

    /* renamed from: c */
    public final void mo59947c(C9420r rVar, C9258l lVar) {
        C9325n4 n4Var = (C9325n4) rVar;
        C9277m4 m4Var = (C9277m4) lVar;
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_FINISHED, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f23822a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoFinished(C9384o4.m27745c(), C9384o4.m27746d());
        }
    }

    /* renamed from: d */
    public final void mo59949d(C9420r rVar, C9258l lVar) {
        C9325n4 n4Var = (C9325n4) rVar;
        C9277m4 m4Var = (C9277m4) lVar;
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_LOAD_FAILED, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f23822a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoFailedToLoad();
        }
    }

    /* renamed from: e */
    public final void mo59950e(C9420r rVar, C9258l lVar) {
        C9325n4 n4Var = (C9325n4) rVar;
        C9277m4 m4Var = (C9277m4) lVar;
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_LOADED, String.format("isPrecache: %s", new Object[]{Boolean.valueOf(m4Var.isPrecache())}), Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f23822a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoLoaded(m4Var.isPrecache());
        }
    }

    /* renamed from: a */
    public final void mo59943a(C9420r rVar, C9258l lVar) {
        C9325n4 n4Var = (C9325n4) rVar;
        C9277m4 m4Var = (C9277m4) lVar;
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_CLOSED, String.format("finished: %s", new Object[]{Boolean.valueOf(n4Var.mo60628s())}), Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f23822a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoClosed(n4Var.mo60628s());
        }
    }

    /* renamed from: b */
    public final void mo59946b(C9420r rVar, C9258l lVar, Object obj) {
        C9325n4 n4Var = (C9325n4) rVar;
        C9277m4 m4Var = (C9277m4) lVar;
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_SHOW_FAILED, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f23822a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoShowFailed();
        }
    }

    /* renamed from: c */
    public final void mo59948c(C9420r rVar, C9258l lVar, Object obj) {
        C9325n4 n4Var = (C9325n4) rVar;
        C9277m4 m4Var = (C9277m4) lVar;
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_SHOWN, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f23822a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoShown();
        }
    }
}
