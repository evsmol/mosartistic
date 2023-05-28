package com.bytedance.sdk.component.adexpress.p300d;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.p293a.C10259z;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.component.adexpress.d.d */
/* compiled from: WebViewBridgeProxy */
public class C10312d {

    /* renamed from: a */
    private WeakReference<C10259z> f25505a;

    public C10312d(C10259z zVar) {
        this.f25505a = new WeakReference<>(zVar);
    }

    /* renamed from: a */
    public void mo63258a(C10259z zVar) {
        this.f25505a = new WeakReference<>(zVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<C10259z> weakReference = this.f25505a;
        if (weakReference != null && weakReference.get() != null) {
            ((C10259z) this.f25505a.get()).invokeMethod(str);
        }
    }
}
