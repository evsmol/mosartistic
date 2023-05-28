package com.applovin.impl.sdk.array;

import com.applovin.array.apphub.aidl.IAppHubService;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8380b;

public class ArrayDataCollector {
    private static final String TAG = "ArrayService";
    private final C8626v logger;
    private final C8490n sdk;

    public ArrayDataCollector(C8490n nVar) {
        this.sdk = nVar;
        this.logger = nVar.mo57320D();
    }

    public long maybeCollectAppHubVersionCode(IAppHubService iAppHubService) {
        if (!((Boolean) this.sdk.mo57342a(C8380b.f20747aw)).booleanValue()) {
            return -1;
        }
        try {
            return iAppHubService.getAppHubVersionCode();
        } catch (Throwable th) {
            if (C8626v.m26252a()) {
                this.logger.mo57819b(TAG, "Failed to collect App Hub version code", th);
            }
            return -1;
        }
    }

    public boolean maybeCollectDirectDownloadEnabled(IAppHubService iAppHubService) {
        if (!((Boolean) this.sdk.mo57342a(C8380b.f20748ax)).booleanValue()) {
            return false;
        }
        try {
            return iAppHubService.getEnabledFeatures().getBoolean("DIRECT_DOWNLOAD");
        } catch (Throwable th) {
            if (C8626v.m26252a()) {
                this.logger.mo57819b(TAG, "Failed to collect App Hub version code", th);
            }
            return false;
        }
    }

    public String maybeCollectRandomUserToken(IAppHubService iAppHubService) {
        if (!((Boolean) this.sdk.mo57342a(C8380b.f20749ay)).booleanValue()) {
            return null;
        }
        try {
            return iAppHubService.getRandomUserToken();
        } catch (Throwable th) {
            if (C8626v.m26252a()) {
                this.logger.mo57819b(TAG, "Failed to collect random user token", th);
            }
            return null;
        }
    }
}
