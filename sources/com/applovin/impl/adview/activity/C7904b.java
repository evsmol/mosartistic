package com.applovin.impl.adview.activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.activity.b */
public class C7904b {

    /* renamed from: a */
    private final Activity f19072a;

    /* renamed from: b */
    private final int f19073b;

    /* renamed from: c */
    private final int f19074c;

    /* renamed from: d */
    private final boolean f19075d;

    /* renamed from: e */
    private final boolean f19076e;

    public C7904b(Activity activity) {
        this.f19072a = activity;
        this.f19074c = Utils.getRotation(activity);
        boolean isTablet = AppLovinSdkUtils.isTablet(activity);
        this.f19075d = isTablet;
        this.f19073b = m23394a(this.f19074c, isTablet);
        this.f19076e = this.f19075d && 2 == m23395a((Context) activity);
    }

    /* renamed from: a */
    private int m23394a(int i, boolean z) {
        if (!z || !this.f19076e) {
            if (i == 0) {
                return 1;
            }
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 9;
            }
            return i == 3 ? 8 : -1;
        } else if (i == 0) {
            return 0;
        } else {
            if (i == 1) {
                return 9;
            }
            if (i == 2) {
                return 8;
            }
            return i == 3 ? 1 : -1;
        }
    }

    /* renamed from: a */
    private static int m23395a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    /* renamed from: a */
    private void m23396a(int i) {
        try {
            this.f19072a.setRequestedOrientation(i);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r5.f19074c != 1) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (r5.f19074c == 2) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005b, code lost:
        if (r5.f19074c == 1) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r6 != 3) goto L_0x0026;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m23397a(com.applovin.impl.sdk.p252ad.C8350e.C8353b r6) {
        /*
            r5 = this;
            com.applovin.impl.sdk.ad.e$b r0 = com.applovin.impl.sdk.p252ad.C8350e.C8353b.ACTIVITY_PORTRAIT
            r1 = 3
            r2 = 2
            r3 = 1
            if (r6 != r0) goto L_0x0032
            boolean r6 = r5.f19075d
            r0 = 9
            if (r6 == 0) goto L_0x0020
            boolean r6 = r5.f19076e
            if (r6 == 0) goto L_0x0020
            int r6 = r5.f19074c
            if (r6 == r3) goto L_0x0018
            if (r6 == r1) goto L_0x0018
            goto L_0x0026
        L_0x0018:
            int r6 = r5.f19074c
            if (r6 != r3) goto L_0x0026
        L_0x001c:
            r5.m23396a((int) r0)
            goto L_0x005e
        L_0x0020:
            int r6 = r5.f19074c
            if (r6 == 0) goto L_0x002a
            if (r6 == r2) goto L_0x002a
        L_0x0026:
            r5.m23396a((int) r3)
            goto L_0x005e
        L_0x002a:
            int r6 = r5.f19074c
            if (r6 != 0) goto L_0x002f
            goto L_0x0026
        L_0x002f:
            r3 = 9
            goto L_0x0026
        L_0x0032:
            com.applovin.impl.sdk.ad.e$b r0 = com.applovin.impl.sdk.p252ad.C8350e.C8353b.ACTIVITY_LANDSCAPE
            if (r6 != r0) goto L_0x005e
            boolean r6 = r5.f19075d
            r0 = 8
            r4 = 0
            if (r6 == 0) goto L_0x004f
            boolean r6 = r5.f19076e
            if (r6 == 0) goto L_0x004f
            int r6 = r5.f19074c
            if (r6 == 0) goto L_0x0048
            if (r6 == r2) goto L_0x0048
            goto L_0x0055
        L_0x0048:
            int r6 = r5.f19074c
            if (r6 != r2) goto L_0x004d
            goto L_0x001c
        L_0x004d:
            r0 = 0
            goto L_0x001c
        L_0x004f:
            int r6 = r5.f19074c
            if (r6 == r3) goto L_0x0059
            if (r6 == r1) goto L_0x0059
        L_0x0055:
            r5.m23396a((int) r4)
            goto L_0x005e
        L_0x0059:
            int r6 = r5.f19074c
            if (r6 != r3) goto L_0x001c
            goto L_0x004d
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.activity.C7904b.m23397a(com.applovin.impl.sdk.ad.e$b):void");
    }

    /* renamed from: a */
    public void mo55535a(C8350e eVar) {
        int i;
        if (!eVar.mo56948F() || (i = this.f19073b) == -1) {
            m23397a(eVar.mo57017p());
        } else {
            m23396a(i);
        }
    }
}
