package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;

public class MaxNetworkResponseInfoImpl implements MaxNetworkResponseInfo {

    /* renamed from: a */
    private final MaxNetworkResponseInfo.AdLoadState f19544a;

    /* renamed from: b */
    private final MaxMediatedNetworkInfo f19545b;

    /* renamed from: c */
    private final Bundle f19546c;

    /* renamed from: d */
    private final long f19547d;

    /* renamed from: e */
    private final MaxError f19548e;

    /* renamed from: com.applovin.impl.mediation.MaxNetworkResponseInfoImpl$1 */
    static /* synthetic */ class C80571 {

        /* renamed from: a */
        static final /* synthetic */ int[] f19549a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState[] r0 = com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19549a = r0
                com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r1 = com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19549a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r1 = com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState.AD_LOADED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.C80571.<clinit>():void");
        }
    }

    public MaxNetworkResponseInfoImpl(MaxNetworkResponseInfo.AdLoadState adLoadState, Bundle bundle, MaxMediatedNetworkInfo maxMediatedNetworkInfo, long j, MaxError maxError) {
        this.f19544a = adLoadState;
        this.f19545b = maxMediatedNetworkInfo;
        this.f19546c = bundle;
        this.f19547d = j;
        this.f19548e = maxError;
    }

    public MaxNetworkResponseInfo.AdLoadState getAdLoadState() {
        return this.f19544a;
    }

    public Bundle getCredentials() {
        return this.f19546c;
    }

    public MaxError getError() {
        return this.f19548e;
    }

    public long getLatencyMillis() {
        return this.f19547d;
    }

    public MaxMediatedNetworkInfo getMediatedNetwork() {
        return this.f19545b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003a, code lost:
        if (r1 != 2) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "MaxResponseInfo{adLoadState="
            r1.append(r2)
            com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r2 = r4.f19544a
            r1.append(r2)
            java.lang.String r2 = ", mediatedNetwork="
            r1.append(r2)
            com.applovin.mediation.MaxMediatedNetworkInfo r2 = r4.f19545b
            r1.append(r2)
            java.lang.String r2 = ", credentials="
            r1.append(r2)
            android.os.Bundle r2 = r4.f19546c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            int[] r1 = com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.C80571.f19549a
            com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r2 = r4.f19544a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x003d
            r2 = 2
            if (r1 == r2) goto L_0x0053
            goto L_0x0069
        L_0x003d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ", error="
            r1.append(r2)
            com.applovin.mediation.MaxError r2 = r4.f19548e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L_0x0053:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ", latencyMillis="
            r1.append(r2)
            long r2 = r4.f19547d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L_0x0069:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.toString():java.lang.String");
    }
}
