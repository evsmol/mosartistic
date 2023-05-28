package com.appodeal.ads;

import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;

/* renamed from: com.appodeal.ads.i1 */
public final class C9218i1 {

    /* renamed from: a */
    public final String f23179a;

    /* renamed from: b */
    public final String f23180b;

    public C9218i1(String str, String str2) {
        this.f23179a = str;
        this.f23180b = str2;
    }

    /* renamed from: a */
    public final void mo59985a() {
        mo59986a((String) null);
    }

    /* renamed from: a */
    public final void mo59986a(String str) {
        String str2;
        String str3 = this.f23179a;
        if (TextUtils.isEmpty(str)) {
            str2 = this.f23180b;
        } else {
            str2 = String.format("%s. %s", new Object[]{this.f23180b, str});
        }
        Log.log(LogConstants.KEY_SDK_PUBLIC, str3, str2, Log.LogLevel.verbose);
    }

    /* renamed from: b */
    public final void mo59987b(String str) {
        Log.log(LogConstants.KEY_SDK_PUBLIC, this.f23179a, String.format("%s. Error during executing method - %s", new Object[]{this.f23180b, str}), Log.LogLevel.verbose);
    }
}
