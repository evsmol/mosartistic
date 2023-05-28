package com.iab.omid.library.appodeal.adsession;

import android.view.View;
import com.iab.omid.library.appodeal.p107d.C4280e;
import com.iab.omid.library.appodeal.publisher.AdSessionStatePublisher;

public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C4280e.m12078a();
        C4280e.m12081a((Object) adSessionConfiguration, "AdSessionConfiguration is null");
        C4280e.m12081a((Object) adSessionContext, "AdSessionContext is null");
        return new C4259a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str);

    public abstract void error(ErrorType errorType, String str);

    public abstract void finish();

    public abstract String getAdSessionId();

    public abstract AdSessionStatePublisher getAdSessionStatePublisher();

    public abstract void registerAdView(View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(View view);

    public abstract void start();
}
