package com.iab.omid.library.amazon.adsession;

import android.view.View;
import com.iab.omid.library.amazon.p101d.C4173e;
import com.iab.omid.library.amazon.publisher.AdSessionStatePublisher;

public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C4173e.m11599a();
        C4173e.m11602a((Object) adSessionConfiguration, "AdSessionConfiguration is null");
        C4173e.m11602a((Object) adSessionContext, "AdSessionContext is null");
        return new C4152a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str);

    public abstract void error(ErrorType errorType, String str);

    public abstract void finish();

    public abstract String getAdSessionId();

    public abstract AdSessionStatePublisher getAdSessionStatePublisher();

    public abstract void registerAdView(View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(View view);

    public abstract void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener);

    public abstract void start();
}
