package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;

/* renamed from: com.appodeal.ads.i2 */
public final class C9219i2 extends C9192g<C9253k2, C9230j2, Object> {

    /* renamed from: a */
    public MrecCallbacks f23181a;

    /* renamed from: a */
    public final void mo59944a(C9420r rVar, C9258l lVar, Object obj) {
        C9253k2 k2Var = (C9253k2) rVar;
        C9230j2 j2Var = (C9230j2) lVar;
        Log.log(LogConstants.KEY_MREC, LogConstants.EVENT_NOTIFY_CLICKED, Log.LogLevel.verbose);
        MrecCallbacks mrecCallbacks = this.f23181a;
        if (mrecCallbacks != null) {
            mrecCallbacks.onMrecClicked();
        }
    }

    /* renamed from: b */
    public final void mo59945b(C9420r rVar, C9258l lVar) {
        C9253k2 k2Var = (C9253k2) rVar;
        C9230j2 j2Var = (C9230j2) lVar;
        Log.log(LogConstants.KEY_MREC, LogConstants.EVENT_NOTIFY_EXPIRED, Log.LogLevel.verbose);
        MrecCallbacks mrecCallbacks = this.f23181a;
        if (mrecCallbacks != null) {
            mrecCallbacks.onMrecExpired();
        }
    }

    /* renamed from: c */
    public final void mo59948c(C9420r rVar, C9258l lVar, Object obj) {
        C9253k2 k2Var = (C9253k2) rVar;
        C9230j2 j2Var = (C9230j2) lVar;
        Log.log(LogConstants.KEY_MREC, LogConstants.EVENT_NOTIFY_SHOWN, Log.LogLevel.verbose);
        MrecCallbacks mrecCallbacks = this.f23181a;
        if (mrecCallbacks != null) {
            mrecCallbacks.onMrecShown();
        }
    }

    /* renamed from: d */
    public final void mo59949d(C9420r rVar, C9258l lVar) {
        C9253k2 k2Var = (C9253k2) rVar;
        C9230j2 j2Var = (C9230j2) lVar;
        Log.log(LogConstants.KEY_MREC, LogConstants.EVENT_NOTIFY_LOAD_FAILED, Log.LogLevel.verbose);
        MrecCallbacks mrecCallbacks = this.f23181a;
        if (mrecCallbacks != null) {
            mrecCallbacks.onMrecFailedToLoad();
        }
    }

    /* renamed from: e */
    public final void mo59950e(C9420r rVar, C9258l lVar) {
        C9253k2 k2Var = (C9253k2) rVar;
        C9230j2 j2Var = (C9230j2) lVar;
        Log.log(LogConstants.KEY_MREC, LogConstants.EVENT_NOTIFY_LOADED, String.format("isPrecache: %s", new Object[]{Boolean.valueOf(j2Var.isPrecache())}), Log.LogLevel.verbose);
        MrecCallbacks mrecCallbacks = this.f23181a;
        if (mrecCallbacks != null) {
            mrecCallbacks.onMrecLoaded(j2Var.isPrecache());
        }
    }

    /* renamed from: b */
    public final void mo59946b(C9420r rVar, C9258l lVar, Object obj) {
        C9253k2 k2Var = (C9253k2) rVar;
        C9230j2 j2Var = (C9230j2) lVar;
        Log.log(LogConstants.KEY_MREC, LogConstants.EVENT_NOTIFY_SHOW_FAILED, Log.LogLevel.verbose);
        MrecCallbacks mrecCallbacks = this.f23181a;
        if (mrecCallbacks != null) {
            mrecCallbacks.onMrecShowFailed();
        }
    }
}
