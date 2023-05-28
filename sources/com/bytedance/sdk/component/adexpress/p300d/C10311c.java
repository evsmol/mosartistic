package com.bytedance.sdk.component.adexpress.p300d;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.component.adexpress.d.c */
/* compiled from: TTAndroidObjectProxy */
public class C10311c {

    /* renamed from: a */
    private WeakReference<C10310b> f25504a;

    public C10311c(C10310b bVar) {
        this.f25504a = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public void mo63244a(C10310b bVar) {
        this.f25504a = new WeakReference<>(bVar);
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<C10310b> weakReference = this.f25504a;
        return (weakReference == null || weakReference.get() == null) ? "" : ((C10310b) this.f25504a.get()).adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<C10310b> weakReference = this.f25504a;
        return (weakReference == null || weakReference.get() == null) ? "" : ((C10310b) this.f25504a.get()).appInfo();
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<C10310b> weakReference = this.f25504a;
        return (weakReference == null || weakReference.get() == null) ? "" : ((C10310b) this.f25504a.get()).getTemplateInfo();
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<C10310b> weakReference = this.f25504a;
        if (weakReference != null && weakReference.get() != null) {
            ((C10310b) this.f25504a.get()).renderDidFinish(str);
        }
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<C10310b> weakReference = this.f25504a;
        if (weakReference != null && weakReference.get() != null) {
            ((C10310b) this.f25504a.get()).mo2358a(str);
        }
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<C10310b> weakReference = this.f25504a;
        if (weakReference != null && weakReference.get() != null) {
            ((C10310b) this.f25504a.get()).muteVideo(str);
        }
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<C10310b> weakReference = this.f25504a;
        if (weakReference != null && weakReference.get() != null) {
            ((C10310b) this.f25504a.get()).dynamicTrack(str);
        }
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<C10310b> weakReference = this.f25504a;
        if (weakReference != null && weakReference.get() != null) {
            ((C10310b) this.f25504a.get()).changeVideoState(str);
        }
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<C10310b> weakReference = this.f25504a;
        if (weakReference != null && weakReference.get() != null) {
            ((C10310b) this.f25504a.get()).clickEvent(str);
        }
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<C10310b> weakReference = this.f25504a;
        if (weakReference != null && weakReference.get() != null) {
            ((C10310b) this.f25504a.get()).skipVideo();
        }
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<C10310b> weakReference = this.f25504a;
        return (weakReference == null || weakReference.get() == null) ? "" : ((C10310b) this.f25504a.get()).getCurrentVideoState();
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<C10310b> weakReference = this.f25504a;
        if (weakReference != null && weakReference.get() != null) {
            ((C10310b) this.f25504a.get()).initRenderFinish();
        }
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<C10310b> weakReference = this.f25504a;
        if (weakReference != null && weakReference.get() != null) {
            ((C10310b) this.f25504a.get()).mo2370b(str);
        }
    }
}
