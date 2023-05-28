package com.applovin.exoplayer2.p185d;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.applovin.exoplayer2.C7476h;
import com.applovin.exoplayer2.p185d.C7138c;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.facebook.ads.AdError;

/* renamed from: com.applovin.exoplayer2.d.j */
public final class C7161j {

    /* renamed from: com.applovin.exoplayer2.d.j$a */
    private static final class C7162a {
        /* renamed from: a */
        public static boolean m19160a(Throwable th) {
            return th instanceof NotProvisionedException;
        }

        /* renamed from: b */
        public static boolean m19161b(Throwable th) {
            return th instanceof DeniedByServerException;
        }
    }

    /* renamed from: com.applovin.exoplayer2.d.j$b */
    private static final class C7163b {
        /* renamed from: a */
        public static boolean m19162a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        /* renamed from: b */
        public static int m19163b(Throwable th) {
            return C7476h.m20799b(C7728ai.m22251d(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* renamed from: com.applovin.exoplayer2.d.j$c */
    private static final class C7164c {
        /* renamed from: a */
        public static boolean m19164a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    /* renamed from: a */
    public static int m19159a(Exception exc, int i) {
        if (C7728ai.f18249a >= 21 && C7163b.m19162a(exc)) {
            return C7163b.m19163b(exc);
        }
        if (C7728ai.f18249a >= 23 && C7164c.m19164a(exc)) {
            return 6006;
        }
        if (C7728ai.f18249a >= 18 && C7162a.m19160a(exc)) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        if (C7728ai.f18249a >= 18 && C7162a.m19161b(exc)) {
            return 6007;
        }
        if (exc instanceof C7179t) {
            return AdError.MEDIAVIEW_MISSING_ERROR_CODE;
        }
        if (exc instanceof C7138c.C7143d) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        if (exc instanceof C7176q) {
            return 6008;
        }
        if (i == 1) {
            return 6006;
        }
        if (i == 2) {
            return 6004;
        }
        if (i == 3) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        throw new IllegalArgumentException();
    }
}
