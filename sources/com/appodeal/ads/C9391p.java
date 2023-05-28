package com.appodeal.ads;

import android.app.Activity;
import com.appodeal.ads.C9258l;
import com.appodeal.ads.C9401q;
import com.appodeal.ads.C9420r;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.libs.network.NetworkStatus;

/* renamed from: com.appodeal.ads.p */
public abstract class C9391p<AdRequestType extends C9420r<AdObjectType>, AdObjectType extends C9258l, RendererParams extends C9401q> {

    /* renamed from: com.appodeal.ads.p$a */
    public static class C9392a {

        /* renamed from: b */
        public static final C9392a f23811b = new C9392a(LogConstants.MSG_NOT_INITIALIZED);

        /* renamed from: c */
        public static final C9392a f23812c = new C9392a(LogConstants.EVENT_NETWORK_CONNECTION);

        /* renamed from: d */
        public static final C9392a f23813d = new C9392a(LogConstants.EVENT_PAUSE);

        /* renamed from: e */
        public static final C9392a f23814e = new C9392a(LogConstants.MSG_AD_TYPE_DISABLED);

        /* renamed from: f */
        public static final C9392a f23815f = new C9392a(LogConstants.MSG_AD_TYPE_DISABLED_BY_SEGMENT);

        /* renamed from: a */
        public final String f23816a;

        public C9392a(String str) {
            this.f23816a = str;
        }
    }

    /* renamed from: a */
    public void mo60586a(Activity activity, RendererParams rendererparams, C9577u<AdObjectType, AdRequestType, ?> uVar, C9392a aVar) {
        uVar.mo60837a(LogConstants.EVENT_SHOW_FAILED, aVar.f23816a);
    }

    /* renamed from: a */
    public abstract boolean mo60089a(Activity activity, RendererParams rendererparams, C9577u<AdObjectType, AdRequestType, ?> uVar);

    /* renamed from: b */
    public boolean mo60090b(Activity activity, RendererParams rendererparams, C9577u<AdObjectType, AdRequestType, ?> uVar) {
        C9392a aVar;
        if (!uVar.mo60853o()) {
            aVar = C9392a.f23811b;
        } else {
            uVar.mo60834a(rendererparams.f23823a);
            if (uVar.mo60851m()) {
                aVar = C9392a.f23814e;
            } else if (uVar.mo60852n()) {
                aVar = C9392a.f23815f;
            } else if (C9148b.f22956b.getTopActivityFlow().getValue() == null) {
                aVar = C9392a.f23813d;
            } else if (NetworkStatus.INSTANCE.isConnected()) {
                return mo60089a(activity, rendererparams, uVar);
            } else {
                aVar = C9392a.f23812c;
            }
        }
        mo60586a(activity, rendererparams, uVar, aVar);
        return false;
    }
}
