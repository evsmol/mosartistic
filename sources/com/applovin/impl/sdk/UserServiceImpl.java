package com.applovin.impl.sdk;

import android.app.Activity;
import com.applovin.sdk.AppLovinUserService;

public class UserServiceImpl implements AppLovinUserService {

    /* renamed from: a */
    private final C8490n f20470a;

    UserServiceImpl(C8490n nVar) {
        this.f20470a = nVar;
    }

    public void preloadConsentDialog() {
        this.f20470a.mo57341Z().mo57311c();
    }

    public void showConsentDialog(Activity activity, AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        this.f20470a.mo57341Z().mo57310a(activity, onConsentDialogDismissListener);
    }

    public String toString() {
        return "UserService{}";
    }
}
