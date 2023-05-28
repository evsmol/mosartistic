package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.sdk.p140d.C4908b;

@Deprecated
public class SSAFactory {
    public static C4928f getPublisherInstance(Activity activity) {
        return C4908b.m14292a((Context) activity);
    }

    public static C4928f getPublisherTestInstance(Activity activity, int i) {
        return C4908b.m14293a((Context) activity, i);
    }
}
