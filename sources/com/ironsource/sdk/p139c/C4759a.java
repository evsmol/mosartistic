package com.ironsource.sdk.p139c;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.c.a */
public final class C4759a extends FrameLayout implements C4768e {

    /* renamed from: a */
    public C4762c f12090a;

    /* renamed from: b */
    private boolean f12091b = false;

    public C4759a(C4762c cVar, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(cVar.f12100d.f12025a, cVar.f12100d.f12026b));
        this.f12090a = cVar;
        addView(cVar.f12098b);
    }

    /* renamed from: a */
    public void mo34257a() {
        JSONObject jSONObject;
        try {
            jSONObject = this.f12090a.f12099c.mo34241a().getJSONObject("configs").getJSONObject("visibilityParams");
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.f12090a.f12097a).put("isBNAutoRemove", false).put("isBannerDisplay", this.f12091b);
        this.f12090a.f12099c.mo34247a("destroyBanner", jSONObject);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo34258a(final java.lang.String r4, final java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.sdk.c.c r0 = r3.f12090a     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0034
            com.ironsource.sdk.c.c r0 = r3.f12090a     // Catch:{ all -> 0x0036 }
            com.ironsource.sdk.b.b r0 = r0.f12099c     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0034
            com.ironsource.sdk.c.c r0 = r3.f12090a     // Catch:{ all -> 0x0036 }
            android.webkit.WebView r0 = r0.f12098b     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0012
            goto L_0x0034
        L_0x0012:
            com.ironsource.sdk.c.c r0 = r3.f12090a     // Catch:{ all -> 0x0036 }
            com.ironsource.sdk.b.b r0 = r0.f12099c     // Catch:{ all -> 0x0036 }
            com.ironsource.sdk.b.a r1 = r0.f12068a     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0028
            com.ironsource.sdk.b.d r1 = r0.f12069b     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x001f
            goto L_0x0028
        L_0x001f:
            org.json.JSONObject r1 = r0.mo34241a()     // Catch:{ all -> 0x0036 }
            java.lang.String r2 = "containerWasRemoved"
            r0.mo34247a((java.lang.String) r2, (org.json.JSONObject) r1)     // Catch:{ all -> 0x0036 }
        L_0x0028:
            com.ironsource.environment.e.a r0 = com.ironsource.environment.p124e.C4399a.f10491a     // Catch:{ all -> 0x0036 }
            com.ironsource.sdk.c.a$1 r1 = new com.ironsource.sdk.c.a$1     // Catch:{ all -> 0x0036 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0036 }
            r0.mo33205a(r1)     // Catch:{ all -> 0x0036 }
            monitor-exit(r3)
            return
        L_0x0034:
            monitor-exit(r3)
            return
        L_0x0036:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.p139c.C4759a.mo34258a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo34259a(String str, String str2, String str3) {
        C4762c cVar = this.f12090a;
        if (cVar != null) {
            cVar.mo34259a(str, str2, str3);
        }
    }

    /* renamed from: a */
    public final void mo34260a(JSONObject jSONObject, String str, String str2) {
        this.f12090a.mo34260a(jSONObject, str, str2);
    }

    /* renamed from: b */
    public final WebView mo34261b() {
        return this.f12090a.f12098b;
    }

    /* renamed from: b */
    public final void mo34262b(JSONObject jSONObject, String str, String str2) {
        this.f12090a.mo34262b(jSONObject, str, str2);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Logger.m14507i("IronSourceAdContainer", "onAttachedToWindow:");
        this.f12091b = true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0052, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        r1 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r1 = new org.json.JSONObject();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDetachedFromWindow() {
        /*
            r5 = this;
            super.onDetachedFromWindow()
            java.lang.String r0 = "IronSourceAdContainer"
            java.lang.String r1 = "onDetachedFromWindow:"
            com.ironsource.sdk.utils.Logger.m14507i(r0, r1)
            com.ironsource.sdk.c.c r1 = r5.f12090a
            if (r1 == 0) goto L_0x005b
            com.ironsource.sdk.b.b r1 = r1.f12099c
            if (r1 != 0) goto L_0x0013
            goto L_0x005b
        L_0x0013:
            r1 = 0
            r5.f12091b = r1
            com.ironsource.sdk.c.c r1 = r5.f12090a     // Catch:{ Exception -> 0x002b }
            com.ironsource.sdk.b.b r1 = r1.f12099c     // Catch:{ Exception -> 0x002b }
            org.json.JSONObject r1 = r1.mo34241a()     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = "configs"
            org.json.JSONObject r1 = r1.getJSONObject(r2)     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = "visibilityParams"
            org.json.JSONObject r1 = r1.getJSONObject(r2)     // Catch:{ Exception -> 0x002b }
            goto L_0x0030
        L_0x002b:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0052 }
            r1.<init>()     // Catch:{ Exception -> 0x0052 }
        L_0x0030:
            java.lang.String r2 = "adViewId"
            com.ironsource.sdk.c.c r3 = r5.f12090a     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = r3.f12097a     // Catch:{ Exception -> 0x0052 }
            org.json.JSONObject r2 = r1.put(r2, r3)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = "isBNAutoRemove"
            r4 = 1
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = "isBannerDisplay"
            boolean r4 = r5.f12091b     // Catch:{ Exception -> 0x0052 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0052 }
            com.ironsource.sdk.c.c r2 = r5.f12090a     // Catch:{ Exception -> 0x0052 }
            com.ironsource.sdk.b.b r2 = r2.f12099c     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = "destroyBanner"
            r2.mo34247a((java.lang.String) r3, (org.json.JSONObject) r1)     // Catch:{ Exception -> 0x0052 }
            return
        L_0x0052:
            r1 = move-exception
            java.lang.String r1 = r1.toString()
        L_0x0057:
            com.ironsource.sdk.utils.Logger.m14507i(r0, r1)
            return
        L_0x005b:
            java.lang.String r1 = "in onDetachedFromWindow mAdPresenter or mAdPresenter.getLogic() are null"
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.p139c.C4759a.onDetachedFromWindow():void");
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        Logger.m14507i("IronSourceAdContainer", "onVisibilityChanged: " + i);
        C4762c cVar = this.f12090a;
        if (cVar != null) {
            try {
                cVar.f12099c.mo34244a("isVisible", i, isShown());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        Logger.m14507i("IronSourceAdContainer", "onWindowVisibilityChanged: " + i);
        C4762c cVar = this.f12090a;
        if (cVar != null) {
            try {
                cVar.f12099c.mo34244a("isWindowVisible", i, isShown());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
