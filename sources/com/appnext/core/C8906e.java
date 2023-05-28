package com.appnext.core;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.appnext.core.e */
public class C8906e {

    /* renamed from: gA */
    private static C8906e f22559gA = null;

    /* renamed from: go */
    private static final long f22560go = 8000;

    /* renamed from: gp */
    private static final long f22561gp = 15000;

    /* renamed from: gq */
    private static final String f22562gq = "com.android.vending";

    /* renamed from: gr */
    private static final String f22563gr = "market://";

    /* renamed from: gs */
    private static final String f22564gs = "https://play.google.com/store";
    /* access modifiers changed from: private */
    public Context context;
    /* access modifiers changed from: private */

    /* renamed from: gt */
    public WebView f22565gt;
    /* access modifiers changed from: private */

    /* renamed from: gu */
    public WebView f22566gu;
    /* access modifiers changed from: private */

    /* renamed from: gv */
    public C8915a f22567gv = new C8915a() {
        public final void onMarket(String str) {
            C8906e.this.f22571gz = 0;
            if (C8906e.this.f22570gy.size() != 0) {
                C8916b bVar = (C8916b) C8906e.this.f22570gy.get(0);
                if (bVar.f22592gL != null) {
                    bVar.f22592gL.onMarket(str);
                }
                try {
                    String str2 = "https://admin.appnext.com/tools/navtac.html?bid=" + ((C8916b) C8906e.this.f22570gy.get(0)).f22593gM + "&guid=" + C8917f.m26950m("admin.appnext.com", "applink") + "&url=" + URLEncoder.encode(str, "UTF-8");
                    if (C8906e.this.f22566gu == null) {
                        WebView unused = C8906e.this.f22566gu = new WebView(C8906e.this.context);
                        C8906e.this.f22566gu.getSettings().setJavaScriptEnabled(true);
                        C8906e.this.f22566gu.getSettings().setDomStorageEnabled(true);
                        if (Build.VERSION.SDK_INT >= 21) {
                            C8906e.this.f22566gu.getSettings().setMixedContentMode(0);
                        }
                        C8906e.this.f22566gu.setWebViewClient(new WebViewClient() {
                            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                                if (str == null || str.contains("about:blank")) {
                                    return false;
                                }
                                webView.loadUrl(str);
                                return true;
                            }
                        });
                    }
                    C8906e.this.f22566gu.loadUrl("about:blank");
                    C8906e.this.f22566gu.loadUrl(str2);
                    new StringBuilder("store url: ").append(str2);
                    C8906e.this.m26897bc();
                    C8906e.this.m26896bb();
                } catch (UnsupportedEncodingException unused2) {
                    C8906e.this.m26896bb();
                }
            }
        }

        public final void error(String str) {
            C8906e.this.f22571gz = 0;
            if (C8906e.this.f22570gy.size() != 0) {
                C8916b bVar = (C8916b) C8906e.this.f22570gy.get(0);
                if (bVar.f22592gL != null) {
                    bVar.f22592gL.error(str);
                }
                C8906e.this.m26896bb();
            }
        }
    };

    /* renamed from: gw */
    private Runnable f22568gw = new Runnable() {
        public final void run() {
            if (!(C8906e.this.f22567gv == null || C8906e.this.f22565gt == null)) {
                C8906e.this.f22567gv.error(C8906e.this.f22565gt.getUrl());
                C8906e.this.f22565gt.stopLoading();
            }
            C8906e.this.m26896bb();
        }
    };

    /* renamed from: gx */
    private List f22569gx;
    /* access modifiers changed from: private */

    /* renamed from: gy */
    public final ArrayList<C8916b> f22570gy = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: gz */
    public int f22571gz = 0;
    private Handler handler = new Handler(Looper.getMainLooper());

    /* renamed from: com.appnext.core.e$a */
    public interface C8915a {
        void error(String str);

        void onMarket(String str);
    }

    /* renamed from: com.appnext.core.e$b */
    private class C8916b {

        /* renamed from: aQ */
        String f22588aQ;

        /* renamed from: gJ */
        String f22590gJ;

        /* renamed from: gK */
        String f22591gK;

        /* renamed from: gL */
        C8915a f22592gL;

        /* renamed from: gM */
        String f22593gM;

        /* renamed from: gN */
        long f22594gN;

        C8916b(String str, String str2, String str3, String str4, C8915a aVar, long j) {
            this.f22590gJ = str;
            this.f22591gK = str2;
            this.f22588aQ = str3;
            this.f22592gL = aVar;
            this.f22593gM = str4;
            this.f22594gN = j;
        }

        public final void onMarket(String str) {
            C8915a aVar = this.f22592gL;
            if (aVar != null) {
                aVar.onMarket(str);
            }
        }

        public final void error(String str) {
            C8915a aVar = this.f22592gL;
            if (aVar != null) {
                aVar.error(str);
            }
        }
    }

    /* renamed from: k */
    public static C8906e m26903k(Context context2) {
        if (f22559gA == null) {
            synchronized (C8906e.class) {
                if (f22559gA == null) {
                    f22559gA = new C8906e(context2);
                }
            }
        }
        return f22559gA;
    }

    private C8906e(Context context2) {
        this.context = context2.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo59002a(String str, String str2, String str3, String str4, C8915a aVar) {
        mo59003a(str, str2, str3, str4, aVar, (long) f22560go);
    }

    /* renamed from: a */
    public final void mo59003a(String str, String str2, String str3, String str4, C8915a aVar, long j) {
        String str5 = str3;
        if (this.context != null) {
            if (str5 != null) {
                Iterator<C8916b> it = this.f22570gy.iterator();
                while (it.hasNext()) {
                    if (it.next().f22588aQ.equals(str5)) {
                        return;
                    }
                }
                if (str5.endsWith("&ox=0")) {
                    this.f22570gy.add(new C8916b(str, str2, str3, str4, aVar, j));
                    new StringBuilder("--ck-- in ").append(str5);
                } else {
                    this.f22571gz = 0;
                    if (this.f22570gy.size() > 0 && !this.f22570gy.get(0).f22588aQ.endsWith("&ox=0")) {
                        new StringBuilder("--ck-- out ").append(this.f22570gy.get(0).f22588aQ);
                        this.f22570gy.get(0).f22592gL = null;
                        this.f22570gy.remove(0);
                        new StringBuilder("--ck-- size ").append(this.f22570gy.size());
                    }
                    this.f22570gy.add(0, new C8916b(str, str2, str3, str4, aVar, j));
                    new StringBuilder("--ck-- in ").append(str5);
                }
            }
            if (this.f22570gy.size() <= 0 || this.f22571gz == 1) {
                StringBuilder sb = new StringBuilder("vta waiting -  ");
                sb.append(str4);
                sb.append(" - ");
                sb.append(str5);
                return;
            }
            this.f22571gz = 1;
            StringBuilder sb2 = new StringBuilder("vta load -  ");
            sb2.append(this.f22570gy.get(0).f22593gM);
            sb2.append(" - ");
            sb2.append(this.f22570gy.get(0).f22588aQ);
            m26891a(this.f22570gy.get(0));
        }
    }

    private void setState(int i) {
        this.f22571gz = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: bc */
    public void m26897bc() {
        Handler handler2 = this.handler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: R */
    private boolean m26884R(String str) {
        try {
            this.context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: S */
    private void m26885S(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        for (ResolveInfo next : this.context.getPackageManager().queryIntentActivities(intent, 0)) {
            if (next.activityInfo.applicationInfo.packageName.equals("com.android.vending")) {
                ActivityInfo activityInfo = next.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.addFlags(268435456);
                intent.addFlags(2097152);
                intent.addFlags(67108864);
                intent.setComponent(componentName);
                this.context.startActivity(intent);
                return;
            }
        }
    }

    /* renamed from: T */
    private void m26886T(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        this.context.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r7.startsWith(f22564gs) != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084 A[Catch:{ all -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openMarket(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "com.android.vending"
            java.lang.String r1 = "market://"
            boolean r1 = r7.startsWith(r1)     // Catch:{ all -> 0x008a }
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            java.lang.String r3 = "android.intent.action.VIEW"
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = "https://play.google.com/store"
            boolean r1 = r7.startsWith(r1)     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x006f
        L_0x0016:
            boolean r1 = r6.m26884R(r0)     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x006f
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x008a }
            android.net.Uri r4 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x008a }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x008a }
            android.content.Context r3 = r6.context     // Catch:{ all -> 0x008a }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ all -> 0x008a }
            r4 = 0
            java.util.List r3 = r3.queryIntentActivities(r1, r4)     // Catch:{ all -> 0x008a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x008a }
        L_0x0034:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0080
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x008a }
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4     // Catch:{ all -> 0x008a }
            android.content.pm.ActivityInfo r5 = r4.activityInfo     // Catch:{ all -> 0x008a }
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo     // Catch:{ all -> 0x008a }
            java.lang.String r5 = r5.packageName     // Catch:{ all -> 0x008a }
            boolean r5 = r5.equals(r0)     // Catch:{ all -> 0x008a }
            if (r5 == 0) goto L_0x0034
            android.content.pm.ActivityInfo r0 = r4.activityInfo     // Catch:{ all -> 0x008a }
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch:{ all -> 0x008a }
            android.content.pm.ApplicationInfo r4 = r0.applicationInfo     // Catch:{ all -> 0x008a }
            java.lang.String r4 = r4.packageName     // Catch:{ all -> 0x008a }
            java.lang.String r0 = r0.name     // Catch:{ all -> 0x008a }
            r3.<init>(r4, r0)     // Catch:{ all -> 0x008a }
            r1.addFlags(r2)     // Catch:{ all -> 0x008a }
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1.addFlags(r0)     // Catch:{ all -> 0x008a }
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1.addFlags(r0)     // Catch:{ all -> 0x008a }
            r1.setComponent(r3)     // Catch:{ all -> 0x008a }
            android.content.Context r0 = r6.context     // Catch:{ all -> 0x008a }
            r0.startActivity(r1)     // Catch:{ all -> 0x008a }
            goto L_0x0080
        L_0x006f:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x008a }
            android.net.Uri r1 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x008a }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x008a }
            r0.setFlags(r2)     // Catch:{ all -> 0x008a }
            android.content.Context r1 = r6.context     // Catch:{ all -> 0x008a }
            r1.startActivity(r0)     // Catch:{ all -> 0x008a }
        L_0x0080:
            com.appnext.core.e$a r0 = r6.f22567gv     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0089
            com.appnext.core.e$a r0 = r6.f22567gv     // Catch:{ all -> 0x008a }
            r0.onMarket(r7)     // Catch:{ all -> 0x008a }
        L_0x0089:
            return
        L_0x008a:
            com.appnext.core.e$a r0 = r6.f22567gv
            if (r0 == 0) goto L_0x0092
            r0.error(r7)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C8906e.openMarket(java.lang.String):void");
    }

    /* renamed from: a */
    private void m26891a(final C8916b bVar) {
        try {
            new StringBuilder("ClickMarketUrl - ").append(bVar.f22591gK);
            if (!TextUtils.isEmpty(bVar.f22591gK)) {
                openMarket(bVar.f22591gK);
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            C8917f.m26919a(bVar.f22590gJ, (HashMap<String, String>) null);
                        } catch (Throwable unused) {
                        }
                    }
                }).start();
                return;
            }
            m26897bc();
            if (this.f22565gt == null) {
                WebView webView = new WebView(this.context);
                this.f22565gt = webView;
                webView.getSettings().setJavaScriptEnabled(true);
                this.f22565gt.getSettings().setDomStorageEnabled(true);
                if (Build.VERSION.SDK_INT >= 21) {
                    this.f22565gt.getSettings().setMixedContentMode(0);
                }
                this.f22565gt.setWebViewClient(new WebViewClient() {
                    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e7 A[Catch:{ all -> 0x0108 }] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r7, java.lang.String r8) {
                        /*
                            r6 = this;
                            java.lang.String r0 = "browser_fallback_url"
                            java.lang.String r1 = "market_referrer"
                            r2 = 0
                            if (r8 != 0) goto L_0x0008
                            return r2
                        L_0x0008:
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            java.lang.String r4 = "redirect url: "
                            r3.<init>(r4)
                            r3.append(r8)
                            java.lang.String r3 = "https://play.google.com/store/apps/"
                            boolean r4 = r8.startsWith(r3)
                            if (r4 == 0) goto L_0x0020
                            java.lang.String r4 = "market://"
                            java.lang.String r8 = r8.replace(r3, r4)
                        L_0x0020:
                            java.lang.String r3 = "about:blank"
                            boolean r3 = r8.contains(r3)
                            if (r3 == 0) goto L_0x0029
                            return r2
                        L_0x0029:
                            java.lang.String r3 = "http://"
                            boolean r3 = r8.startsWith(r3)
                            r4 = 1
                            if (r3 != 0) goto L_0x014b
                            java.lang.String r3 = "https://"
                            boolean r3 = r8.startsWith(r3)
                            if (r3 != 0) goto L_0x014b
                            java.lang.String r3 = "intent://"
                            boolean r3 = r8.startsWith(r3)
                            if (r3 == 0) goto L_0x0109
                            android.content.Intent r7 = android.content.Intent.parseUri(r8, r4)     // Catch:{ all -> 0x0108 }
                            com.appnext.core.e r3 = com.appnext.core.C8906e.this     // Catch:{ all -> 0x0108 }
                            android.content.Context r3 = r3.context     // Catch:{ all -> 0x0108 }
                            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ all -> 0x0108 }
                            r5 = 65536(0x10000, float:9.18355E-41)
                            android.content.pm.ResolveInfo r3 = r3.resolveActivity(r7, r5)     // Catch:{ all -> 0x0108 }
                            if (r3 == 0) goto L_0x0077
                            com.appnext.core.e r8 = com.appnext.core.C8906e.this     // Catch:{ all -> 0x0108 }
                            r8.m26897bc()     // Catch:{ all -> 0x0108 }
                            com.appnext.core.e r8 = com.appnext.core.C8906e.this     // Catch:{ all -> 0x0108 }
                            com.appnext.core.e$a r8 = r8.f22567gv     // Catch:{ all -> 0x0108 }
                            if (r8 == 0) goto L_0x0076
                            com.appnext.core.e r8 = com.appnext.core.C8906e.this     // Catch:{ all -> 0x0108 }
                            com.appnext.core.e$a r8 = r8.f22567gv     // Catch:{ all -> 0x0108 }
                            android.net.Uri r7 = r7.getData()     // Catch:{ all -> 0x0108 }
                            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0108 }
                            r8.onMarket(r7)     // Catch:{ all -> 0x0108 }
                        L_0x0076:
                            return r4
                        L_0x0077:
                            android.os.Bundle r3 = r7.getExtras()     // Catch:{ all -> 0x0108 }
                            java.lang.String r5 = ""
                            if (r3 == 0) goto L_0x00a0
                            android.os.Bundle r3 = r7.getExtras()     // Catch:{ all -> 0x0108 }
                            boolean r3 = r3.containsKey(r0)     // Catch:{ all -> 0x0108 }
                            if (r3 == 0) goto L_0x00a0
                            android.os.Bundle r3 = r7.getExtras()     // Catch:{ all -> 0x0108 }
                            java.lang.String r3 = r3.getString(r0)     // Catch:{ all -> 0x0108 }
                            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x0108 }
                            if (r3 != 0) goto L_0x00a0
                            android.os.Bundle r7 = r7.getExtras()     // Catch:{ all -> 0x0108 }
                            java.lang.String r7 = r7.getString(r0)     // Catch:{ all -> 0x0108 }
                            goto L_0x00da
                        L_0x00a0:
                            android.os.Bundle r0 = r7.getExtras()     // Catch:{ all -> 0x0108 }
                            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x0108 }
                            if (r0 == 0) goto L_0x00f1
                            android.os.Bundle r0 = r7.getExtras()     // Catch:{ all -> 0x0108 }
                            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x0108 }
                            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x0108 }
                            if (r0 != 0) goto L_0x00f1
                            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0108 }
                            java.lang.String r0 = "market://details?id="
                            r8.<init>(r0)     // Catch:{ all -> 0x0108 }
                            java.lang.String r0 = r7.getPackage()     // Catch:{ all -> 0x0108 }
                            r8.append(r0)     // Catch:{ all -> 0x0108 }
                            java.lang.String r0 = "&referrer="
                            r8.append(r0)     // Catch:{ all -> 0x0108 }
                            android.os.Bundle r7 = r7.getExtras()     // Catch:{ all -> 0x0108 }
                            java.lang.String r7 = r7.getString(r1)     // Catch:{ all -> 0x0108 }
                            r8.append(r7)     // Catch:{ all -> 0x0108 }
                            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x0108 }
                        L_0x00da:
                            com.appnext.core.e r8 = com.appnext.core.C8906e.this     // Catch:{ all -> 0x0108 }
                            r8.m26897bc()     // Catch:{ all -> 0x0108 }
                            com.appnext.core.e r8 = com.appnext.core.C8906e.this     // Catch:{ all -> 0x0108 }
                            com.appnext.core.e$a r8 = r8.f22567gv     // Catch:{ all -> 0x0108 }
                            if (r8 == 0) goto L_0x00f0
                            com.appnext.core.e r8 = com.appnext.core.C8906e.this     // Catch:{ all -> 0x0108 }
                            com.appnext.core.e$a r8 = r8.f22567gv     // Catch:{ all -> 0x0108 }
                            r8.onMarket(r7)     // Catch:{ all -> 0x0108 }
                        L_0x00f0:
                            return r4
                        L_0x00f1:
                            com.appnext.core.e r7 = com.appnext.core.C8906e.this     // Catch:{ all -> 0x0108 }
                            r7.m26897bc()     // Catch:{ all -> 0x0108 }
                            com.appnext.core.e r7 = com.appnext.core.C8906e.this     // Catch:{ all -> 0x0108 }
                            com.appnext.core.e$a r7 = r7.f22567gv     // Catch:{ all -> 0x0108 }
                            if (r7 == 0) goto L_0x0107
                            com.appnext.core.e r7 = com.appnext.core.C8906e.this     // Catch:{ all -> 0x0108 }
                            com.appnext.core.e$a r7 = r7.f22567gv     // Catch:{ all -> 0x0108 }
                            r7.error(r8)     // Catch:{ all -> 0x0108 }
                        L_0x0107:
                            return r4
                        L_0x0108:
                            return r2
                        L_0x0109:
                            android.content.Intent r0 = new android.content.Intent
                            java.lang.String r1 = "android.intent.action.VIEW"
                            r0.<init>(r1)
                            android.net.Uri r1 = android.net.Uri.parse(r8)
                            r0.setData(r1)
                            com.appnext.core.e r1 = com.appnext.core.C8906e.this     // Catch:{ all -> 0x014a }
                            android.content.Context r1 = r1.context     // Catch:{ all -> 0x014a }
                            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x014a }
                            java.util.List r0 = r1.queryIntentActivities(r0, r2)     // Catch:{ all -> 0x014a }
                            int r0 = r0.size()     // Catch:{ all -> 0x014a }
                            if (r0 <= 0) goto L_0x0147
                            com.appnext.core.e r7 = com.appnext.core.C8906e.this     // Catch:{ all -> 0x014a }
                            r7.m26897bc()     // Catch:{ all -> 0x014a }
                            com.appnext.core.e r7 = com.appnext.core.C8906e.this     // Catch:{ all -> 0x014a }
                            r7.openMarket(r8)     // Catch:{ all -> 0x014a }
                            com.appnext.core.e r7 = com.appnext.core.C8906e.this     // Catch:{ all -> 0x014a }
                            com.appnext.core.e$a r7 = r7.f22567gv     // Catch:{ all -> 0x014a }
                            if (r7 == 0) goto L_0x0146
                            com.appnext.core.e r7 = com.appnext.core.C8906e.this     // Catch:{ all -> 0x014a }
                            com.appnext.core.e$a r7 = r7.f22567gv     // Catch:{ all -> 0x014a }
                            r7.onMarket(r8)     // Catch:{ all -> 0x014a }
                        L_0x0146:
                            return r4
                        L_0x0147:
                            r7.loadUrl(r8)     // Catch:{ all -> 0x014a }
                        L_0x014a:
                            return r2
                        L_0x014b:
                            com.appnext.core.e r0 = com.appnext.core.C8906e.this
                            android.content.Intent r1 = com.appnext.core.C8906e.m26887U(r8)
                            r2 = 0
                            android.content.Intent r1 = r1.setComponent(r2)
                            android.content.Intent r0 = r0.mo59005b((android.content.Intent) r1)
                            if (r0 == 0) goto L_0x017c
                            com.appnext.core.e r7 = com.appnext.core.C8906e.this
                            r7.m26897bc()
                            com.appnext.core.e r7 = com.appnext.core.C8906e.this
                            com.appnext.core.e$a r7 = r7.f22567gv
                            if (r7 == 0) goto L_0x0172
                            com.appnext.core.e r7 = com.appnext.core.C8906e.this
                            com.appnext.core.e$a r7 = r7.f22567gv
                            r7.onMarket(r8)
                        L_0x0172:
                            com.appnext.core.e r7 = com.appnext.core.C8906e.this
                            android.content.Context r7 = r7.context
                            r7.startActivity(r0)
                            return r4
                        L_0x017c:
                            r7.loadUrl(r8)
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C8906e.C89114.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
                    }
                });
            }
            this.f22565gt.stopLoading();
            this.f22565gt.loadUrl("about:blank");
            this.f22569gx = m26890a(this.context, m26887U(bVar.f22588aQ).setComponent((ComponentName) null));
            this.f22565gt.loadUrl(bVar.f22588aQ);
            new StringBuilder("appurl: ").append(bVar.f22588aQ);
            this.handler.postDelayed(this.f22568gw, bVar.f22588aQ.endsWith("&ox=0") ? f22561gp : bVar.f22594gN);
        } catch (Throwable unused) {
            C8915a aVar = this.f22567gv;
            if (aVar != null) {
                aVar.error(bVar.f22588aQ);
            }
            m26896bb();
        }
    }

    /* renamed from: e */
    public final void mo59006e(final AppnextAd appnextAd) {
        new Thread(new Runnable() {
            public final void run() {
                try {
                    C8917f.m26919a(appnextAd.getImpressionURL(), (HashMap<String, String>) null);
                } catch (Throwable unused) {
                }
            }
        }).start();
    }

    /* renamed from: f */
    public final void mo59007f(final AppnextAd appnextAd) {
        new Thread(new Runnable() {
            public final void run() {
                try {
                    C8917f.m26919a(appnextAd.getImpressionURL() + "&device=" + C8917f.m26938be() + "&ox=0", (HashMap<String, String>) null);
                } catch (Throwable unused) {
                }
            }
        }).start();
    }

    /* renamed from: a */
    public final void mo59004a(String str, String str2, String str3, String str4, String str5, String str6) {
        final String str7 = str;
        final String str8 = str2;
        final String str9 = str3;
        final String str10 = str4;
        final String str11 = str5;
        final String str12 = str6;
        new Thread(new Runnable() {
            public final void run() {
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("guid", str7);
                    hashMap.put("bannerId", str8);
                    hashMap.put("placementId", str9);
                    hashMap.put("vid", str10);
                    hashMap.put("url", str11);
                    C8917f.m26919a("https://admin.appnext.com/AdminService.asmx/" + str12, (HashMap<String, String>) hashMap);
                } catch (Throwable unused) {
                }
            }
        }).start();
    }

    /* renamed from: a */
    private static List m26890a(Context context2, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context2.getPackageManager().queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo next : queryIntentActivities) {
            arrayList.add(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final Intent mo59005b(Intent intent) {
        List<ComponentName> a = m26890a(this.context, intent);
        new HashSet();
        for (ComponentName componentName : a) {
            if (!this.f22569gx.contains(componentName)) {
                Intent intent2 = new Intent();
                intent2.setComponent(componentName);
                return intent2;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public static Intent m26887U(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return intent;
    }

    /* access modifiers changed from: private */
    /* renamed from: bb */
    public void m26896bb() {
        this.f22571gz = 0;
        if (this.f22570gy.size() != 0) {
            new StringBuilder("--ck-- out ").append(this.f22570gy.get(0).f22588aQ);
            this.f22570gy.get(0).f22592gL = null;
            this.f22570gy.remove(0);
            new StringBuilder("--ck-- size ").append(this.f22570gy.size());
            mo59002a((String) null, (String) null, (String) null, (String) null, (C8915a) null);
        }
    }
}
