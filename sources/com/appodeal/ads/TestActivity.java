package com.appodeal.ads;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appodeal.ads.C9205h2;
import com.appodeal.ads.C9378o1;
import com.appodeal.ads.C9384o4;
import com.appodeal.ads.C9403q1;
import com.appodeal.ads.C9566t0;
import com.appodeal.ads.C9685w2;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.native_ad.views.NativeAdViewContentStream;
import com.appodeal.ads.utils.C9603a;
import com.appodeal.ads.utils.C9607b;
import java.util.ArrayList;

public class TestActivity extends Activity implements BannerCallbacks, InterstitialCallbacks, MrecCallbacks, NativeCallbacks, RewardedVideoCallbacks {

    /* renamed from: a */
    public int f22747a;

    /* renamed from: b */
    public boolean f22748b;

    /* renamed from: c */
    public ListView f22749c;

    /* renamed from: d */
    public RelativeLayout f22750d;

    /* renamed from: e */
    public boolean f22751e;

    /* renamed from: f */
    public NativeAdViewContentStream f22752f;

    /* renamed from: g */
    public NativeAd f22753g;

    /* renamed from: h */
    public C9420r f22754h = null;

    /* renamed from: i */
    public boolean f22755i;

    /* renamed from: j */
    public ProgressDialog f22756j;

    /* renamed from: k */
    public boolean f22757k;

    /* renamed from: com.appodeal.ads.TestActivity$a */
    public class C8992a implements AdapterView.OnItemClickListener {
        public C8992a() {
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C9464s sVar;
            C9403q1.C9406c cVar;
            ((C9607b) adapterView.getAdapter()).getClass();
            int i2 = C9270m.m27456b(6)[i];
            TestActivity testActivity = TestActivity.this;
            int a = C9603a.m28350a(i2);
            testActivity.f22747a = a;
            if (C9409q4.m27862d(a)) {
                TestActivity testActivity2 = TestActivity.this;
                int i3 = testActivity2.f22747a;
                C9409q4.m27849b(i3, true);
                C9409q4.m27814a(i3, false);
                if (i3 == 1) {
                    testActivity2.mo59342e();
                    cVar = C9403q1.m27787a().f23829d;
                    sVar = new C9378o1.C9381c();
                    sVar.f24026a = true;
                    sVar.f24028c = true;
                    sVar.f24027b = testActivity2.f22748b;
                } else if (i3 == 2) {
                    testActivity2.mo59342e();
                    cVar = C9403q1.m27787a().f23830e;
                    sVar = new C9685w2.C9686a();
                    sVar.f24026a = true;
                    sVar.f24028c = true;
                    sVar.f24027b = testActivity2.f22748b;
                } else if (i3 == 4) {
                    testActivity2.mo59342e();
                    C9566t0.C9570d dVar = new C9566t0.C9570d();
                    dVar.f24026a = true;
                    dVar.f24028c = true;
                    dVar.f24027b = testActivity2.f22748b;
                    C9566t0.m28247a().mo60839b((Context) testActivity2, dVar);
                    return;
                } else if (i3 == 128) {
                    testActivity2.mo59342e();
                    C9384o4.C9385a aVar = new C9384o4.C9385a();
                    aVar.f24026a = true;
                    aVar.f24028c = true;
                    aVar.f24027b = testActivity2.f22748b;
                    C9384o4.m27742a().mo60839b((Context) testActivity2, aVar);
                    return;
                } else if (i3 == 256) {
                    testActivity2.mo59342e();
                    C9205h2.C9209d dVar2 = new C9205h2.C9209d();
                    dVar2.f24026a = true;
                    dVar2.f24028c = true;
                    dVar2.f24027b = testActivity2.f22748b;
                    C9205h2.m27336a().mo60839b((Context) testActivity2, dVar2);
                    return;
                } else if (i3 == 512) {
                    testActivity2.mo59342e();
                    Native.m27080c().mo60337b(1);
                    Native.m27080c().mo60336a(true, testActivity2.f22748b, true);
                    return;
                } else {
                    return;
                }
                cVar.mo60590a((Context) testActivity2, sVar);
                return;
            }
            TestActivity testActivity3 = TestActivity.this;
            Toast.makeText(testActivity3, C9603a.m28351b(i2) + " isn't initialized", 0).show();
        }
    }

    /* renamed from: com.appodeal.ads.TestActivity$b */
    public class C8993b implements CompoundButton.OnCheckedChangeListener {
        public C8993b() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            TestActivity.this.f22748b = z;
        }
    }

    /* renamed from: com.appodeal.ads.TestActivity$c */
    public class C8994c implements AdapterView.OnItemClickListener {
        public C8994c() {
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            /*
                r0 = this;
                android.widget.Adapter r1 = r1.getAdapter()
                java.lang.Object r1 = r1.getItem(r3)
                com.appodeal.ads.utils.k r1 = (com.appodeal.ads.utils.C9630k) r1
                com.appodeal.ads.TestActivity r2 = com.appodeal.ads.TestActivity.this
                boolean r3 = r2.f22755i
                if (r3 == 0) goto L_0x0012
                goto L_0x00c5
            L_0x0012:
                r2.mo59342e()
                com.appodeal.ads.r r3 = r2.f22754h
                r3.mo60634y()
                r3 = 1
                r2.f22757k = r3
                int r2 = r2.f22747a
                r4 = 0
                if (r2 == r3) goto L_0x00aa
                r5 = 2
                if (r2 == r5) goto L_0x008e
                r5 = 4
                if (r2 == r5) goto L_0x0079
                r5 = 128(0x80, float:1.794E-43)
                if (r2 == r5) goto L_0x0064
                r5 = 256(0x100, float:3.59E-43)
                if (r2 == r5) goto L_0x004f
                r5 = 512(0x200, float:7.175E-43)
                if (r2 == r5) goto L_0x0036
                goto L_0x00c5
            L_0x0036:
                com.appodeal.ads.n2 r2 = com.appodeal.ads.Native.m27080c()
                r2.f23583c = r4
                com.appodeal.ads.Native$a r2 = com.appodeal.ads.Native.m27078a()
                AdRequestType r2 = r2.f24306x
                com.appodeal.ads.t2 r2 = (com.appodeal.ads.C9573t2) r2
                int r1 = r1.f24408g
                com.appodeal.ads.Native$a r5 = com.appodeal.ads.Native.m27078a()
                r5.mo60832a(r2, (int) r1, (boolean) r4, (boolean) r3)
                goto L_0x00c5
            L_0x004f:
                com.appodeal.ads.TestActivity.m27107a()
                com.appodeal.ads.h2$b r2 = com.appodeal.ads.C9205h2.m27336a()
                AdRequestType r2 = r2.f24306x
                com.appodeal.ads.k2 r2 = (com.appodeal.ads.C9253k2) r2
                int r1 = r1.f24408g
                com.appodeal.ads.h2$b r5 = com.appodeal.ads.C9205h2.m27336a()
                r5.mo60832a(r2, (int) r1, (boolean) r4, (boolean) r3)
                goto L_0x00c5
            L_0x0064:
                com.appodeal.ads.TestActivity.m27107a()
                com.appodeal.ads.o4$b r2 = com.appodeal.ads.C9384o4.m27742a()
                AdRequestType r2 = r2.f24306x
                com.appodeal.ads.n4 r2 = (com.appodeal.ads.C9325n4) r2
                int r1 = r1.f24408g
                com.appodeal.ads.o4$b r5 = com.appodeal.ads.C9384o4.m27742a()
                r5.mo60832a(r2, (int) r1, (boolean) r4, (boolean) r3)
                goto L_0x00c5
            L_0x0079:
                com.appodeal.ads.TestActivity.m27107a()
                com.appodeal.ads.t0$b r2 = com.appodeal.ads.C9566t0.m28247a()
                AdRequestType r2 = r2.f24306x
                com.appodeal.ads.w0 r2 = (com.appodeal.ads.C9683w0) r2
                int r1 = r1.f24408g
                com.appodeal.ads.t0$b r5 = com.appodeal.ads.C9566t0.m28247a()
                r5.mo60832a(r2, (int) r1, (boolean) r4, (boolean) r3)
                goto L_0x00c5
            L_0x008e:
                com.appodeal.ads.TestActivity.m27107a()
                com.appodeal.ads.q1 r2 = com.appodeal.ads.C9403q1.m27787a()
                r2.mo60588c()
                com.appodeal.ads.w2$b r2 = com.appodeal.ads.C9685w2.m28463a()
                AdRequestType r2 = r2.f24306x
                com.appodeal.ads.q5 r2 = (com.appodeal.ads.C9419q5) r2
                int r1 = r1.f24408g
                com.appodeal.ads.w2$b r5 = com.appodeal.ads.C9685w2.m28463a()
                r5.mo60832a(r2, (int) r1, (boolean) r4, (boolean) r3)
                goto L_0x00c5
            L_0x00aa:
                com.appodeal.ads.TestActivity.m27107a()
                com.appodeal.ads.q1 r2 = com.appodeal.ads.C9403q1.m27787a()
                r2.mo60588c()
                com.appodeal.ads.o1$a r2 = com.appodeal.ads.C9378o1.m27718a()
                AdRequestType r2 = r2.f24306x
                com.appodeal.ads.r1 r2 = (com.appodeal.ads.C9425r1) r2
                int r1 = r1.f24408g
                com.appodeal.ads.o1$a r5 = com.appodeal.ads.C9378o1.m27718a()
                r5.mo60832a(r2, (int) r1, (boolean) r4, (boolean) r3)
            L_0x00c5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.TestActivity.C8994c.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.appodeal.ads.TestActivity$d */
    public class C8995d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f22761a;

        /* renamed from: b */
        public final /* synthetic */ String f22762b;

        public C8995d(Context context, String str) {
            this.f22761a = context;
            this.f22762b = str;
        }

        public final void run() {
            Toast.makeText(this.f22761a, this.f22762b, 0).show();
        }
    }

    /* renamed from: a */
    public static void m27107a() {
        C9683w0 w0Var = (C9683w0) C9566t0.m28247a().mo60846f();
        C9253k2 k2Var = (C9253k2) C9205h2.m27336a().mo60846f();
        C9425r1 r1Var = (C9425r1) C9378o1.m27718a().mo60846f();
        C9419q5 q5Var = (C9419q5) C9685w2.m28463a().mo60846f();
        C9325n4 n4Var = (C9325n4) C9384o4.m27742a().mo60846f();
        if (w0Var != null) {
            w0Var.mo60611c();
            w0Var.mo60634y();
        }
        if (k2Var != null) {
            k2Var.mo60611c();
            k2Var.mo60634y();
        }
        if (r1Var != null) {
            r1Var.mo60611c();
            r1Var.mo60634y();
        }
        if (q5Var != null) {
            q5Var.mo60611c();
            q5Var.mo60634y();
        }
        if (n4Var != null) {
            n4Var.mo60611c();
            n4Var.mo60634y();
        }
    }

    /* renamed from: a */
    public static void m27108a(Context context, String str) {
        C9212h5.f23153a.post(new C8995d(context, str));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.appodeal.ads.BannerView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.appodeal.ads.MrecView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: com.appodeal.ads.BannerView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: com.appodeal.ads.BannerView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0210  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59339b() {
        /*
            r14 = this;
            boolean r0 = r14.f22755i
            if (r0 == 0) goto L_0x0007
            r14.mo59342e()
        L_0x0007:
            com.appodeal.ads.context.g r0 = com.appodeal.ads.context.C9158g.f22974b
            android.content.Context r1 = r14.getApplicationContext()
            r0.setApplicationContext(r1)
            r0.setActivity(r14)
            int r0 = r14.f22747a
            r1 = 1
            com.appodeal.ads.C9409q4.m27849b((int) r0, (boolean) r1)
            int r0 = r14.f22747a
            r2 = 0
            com.appodeal.ads.C9409q4.m27814a((int) r0, (boolean) r2)
            int r0 = r14.f22747a
            r3 = 512(0x200, float:7.175E-43)
            r4 = 256(0x100, float:3.59E-43)
            r5 = 4
            if (r0 == r1) goto L_0x004f
            r6 = 2
            if (r0 == r6) goto L_0x004a
            if (r0 == r5) goto L_0x0045
            r6 = 128(0x80, float:1.794E-43)
            if (r0 == r6) goto L_0x0040
            if (r0 == r4) goto L_0x003b
            if (r0 == r3) goto L_0x0036
            goto L_0x0059
        L_0x0036:
            com.appodeal.ads.Native$a r0 = com.appodeal.ads.Native.m27078a()
            goto L_0x0053
        L_0x003b:
            com.appodeal.ads.h2$b r0 = com.appodeal.ads.C9205h2.m27336a()
            goto L_0x0053
        L_0x0040:
            com.appodeal.ads.o4$b r0 = com.appodeal.ads.C9384o4.m27742a()
            goto L_0x0053
        L_0x0045:
            com.appodeal.ads.t0$b r0 = com.appodeal.ads.C9566t0.m28247a()
            goto L_0x0053
        L_0x004a:
            com.appodeal.ads.w2$b r0 = com.appodeal.ads.C9685w2.m28463a()
            goto L_0x0053
        L_0x004f:
            com.appodeal.ads.o1$a r0 = com.appodeal.ads.C9378o1.m27718a()
        L_0x0053:
            com.appodeal.ads.r r0 = r0.mo60846f()
            r14.f22754h = r0
        L_0x0059:
            com.appodeal.ads.r r0 = r14.f22754h
            if (r0 != 0) goto L_0x005f
            r14.f22747a = r2
        L_0x005f:
            android.widget.RelativeLayout r0 = new android.widget.RelativeLayout
            r0.<init>(r14)
            r6 = -1
            r0.setBackgroundColor(r6)
            r0.setClickable(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r14)
            float r7 = com.appodeal.ads.C9182f1.m27290l(r14)
            r8 = 1098907648(0x41800000, float:16.0)
            float r7 = r7 * r8
            int r7 = java.lang.Math.round(r7)
            r1.setPadding(r7, r2, r2, r2)
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams
            float r9 = com.appodeal.ads.C9182f1.m27290l(r14)
            r10 = 1111490560(0x42400000, float:48.0)
            float r9 = r9 * r10
            int r9 = java.lang.Math.round(r9)
            r7.<init>(r6, r9)
            r1.setTextSize(r8)
            r9 = 16
            r1.setGravity(r9)
            r1.setTextColor(r6)
            android.graphics.drawable.BitmapDrawable r11 = com.appodeal.ads.C9326n5.m27553d(r14)
            r1.setBackground(r11)
            int r11 = android.view.View.generateViewId()
            r1.setId(r11)
            r1.setLayoutParams(r7)
            r0.addView(r1)
            android.widget.ListView r7 = new android.widget.ListView
            r7.<init>(r14)
            r14.f22749c = r7
            r11 = 0
            r7.setDivider(r11)
            android.widget.ListView r7 = r14.f22749c
            r7.setDividerHeight(r2)
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams
            r7.<init>(r6, r6)
            int r12 = r1.getId()
            r13 = 3
            r7.addRule(r13, r12)
            android.widget.ListView r12 = r14.f22749c
            r12.setLayoutParams(r7)
            int r7 = r14.f22747a
            r12 = -2
            if (r7 != 0) goto L_0x0137
            java.lang.String r7 = "CHOOSE AD TYPE"
            r1.setText(r7)
            com.appodeal.ads.utils.b r7 = new com.appodeal.ads.utils.b
            r7.<init>(r14)
            android.widget.ListView r13 = r14.f22749c
            r13.setAdapter(r7)
            android.widget.ListView r7 = r14.f22749c
            com.appodeal.ads.TestActivity$a r13 = new com.appodeal.ads.TestActivity$a
            r13.<init>()
            r7.setOnItemClickListener(r13)
            android.widget.CheckBox r7 = new android.widget.CheckBox
            r7.<init>(r14)
            boolean r13 = r14.f22748b
            r7.setChecked(r13)
            java.lang.String r13 = "test"
            r7.setText(r13)
            r1.setTextColor(r6)
            r7.setTextSize(r8)
            r7.setGravity(r9)
            com.appodeal.ads.TestActivity$b r1 = new com.appodeal.ads.TestActivity$b
            r1.<init>()
            r7.setOnCheckedChangeListener(r1)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            float r9 = com.appodeal.ads.C9182f1.m27290l(r14)
            float r9 = r9 * r10
            int r9 = java.lang.Math.round(r9)
            r1.<init>(r12, r9)
            r9 = 11
            r1.addRule(r9)
            float r9 = com.appodeal.ads.C9182f1.m27290l(r14)
            float r9 = r9 * r8
            int r8 = java.lang.Math.round(r9)
            r1.setMargins(r2, r2, r8, r2)
            r7.setLayoutParams(r1)
            r0.addView(r7)
            goto L_0x0165
        L_0x0137:
            java.lang.String r7 = "CHOOSE AD ITEM"
            r1.setText(r7)
            com.appodeal.ads.r r1 = r14.f22754h
            java.util.ArrayList r1 = r1.f23886a
            java.util.ArrayList r1 = com.appodeal.ads.C9139c1.m27229a((java.util.List) r1, (boolean) r2)
            java.util.Collections.reverse(r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>(r1)
            r7.<init>(r8)
            com.appodeal.ads.utils.a0 r1 = new com.appodeal.ads.utils.a0
            r1.<init>(r14, r7)
            android.widget.ListView r7 = r14.f22749c
            r7.setAdapter(r1)
            android.widget.ListView r1 = r14.f22749c
            com.appodeal.ads.TestActivity$c r7 = new com.appodeal.ads.TestActivity$c
            r7.<init>()
            r1.setOnItemClickListener(r7)
        L_0x0165:
            android.widget.ListView r1 = r14.f22749c
            r0.addView(r1)
            android.widget.RelativeLayout r1 = new android.widget.RelativeLayout
            r1.<init>(r14)
            r14.f22750d = r1
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r1.<init>(r6, r6)
            android.widget.RelativeLayout r7 = r14.f22750d
            java.lang.String r8 = "#DD000000"
            int r8 = android.graphics.Color.parseColor(r8)
            r7.setBackgroundColor(r8)
            android.widget.RelativeLayout r7 = r14.f22750d
            r7.setLayoutParams(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r14)
            r1.setTextColor(r6)
            java.lang.String r7 = "Press back to hide"
            r1.setText(r7)
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams
            r7.<init>(r12, r12)
            r8 = 10
            r7.addRule(r8)
            r8 = 14
            r7.addRule(r8, r6)
            r9 = 50
            r7.setMargins(r9, r9, r9, r9)
            r1.setLayoutParams(r7)
            android.widget.RelativeLayout r7 = r14.f22750d
            r7.setOnTouchListener(r11)
            android.widget.RelativeLayout r7 = r14.f22750d
            r7.setFocusable(r2)
            android.widget.RelativeLayout r7 = r14.f22750d
            r7.setFocusableInTouchMode(r2)
            android.widget.RelativeLayout r2 = r14.f22750d
            r2.setOnClickListener(r11)
            android.widget.RelativeLayout r2 = r14.f22750d
            r2.addView(r1)
            int r1 = r14.f22747a
            r2 = 12
            if (r1 == r5) goto L_0x0210
            if (r1 == r4) goto L_0x01e5
            if (r1 == r3) goto L_0x01ce
            goto L_0x0224
        L_0x01ce:
            com.appodeal.ads.native_ad.views.NativeAdViewContentStream r1 = new com.appodeal.ads.native_ad.views.NativeAdViewContentStream
            r1.<init>(r14)
            r14.f22752f = r1
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r1.<init>(r6, r12)
            r1.addRule(r2)
            android.widget.RelativeLayout r2 = r14.f22750d
            com.appodeal.ads.native_ad.views.NativeAdViewContentStream r3 = r14.f22752f
            r2.addView(r3, r1)
            goto L_0x0224
        L_0x01e5:
            com.appodeal.ads.MrecView r1 = com.appodeal.ads.C9409q4.m27845b((android.content.Context) r14)
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            float r4 = com.appodeal.ads.C9182f1.m27290l(r14)
            r6 = 1133903872(0x43960000, float:300.0)
            float r4 = r4 * r6
            int r4 = java.lang.Math.round(r4)
            float r6 = com.appodeal.ads.C9182f1.m27290l(r14)
            r7 = 1132068864(0x437a0000, float:250.0)
            float r6 = r6 * r7
            int r6 = java.lang.Math.round(r6)
            r3.<init>(r4, r6)
            r3.addRule(r2)
            r3.addRule(r8)
            r1.setLayoutParams(r3)
            goto L_0x021f
        L_0x0210:
            com.appodeal.ads.BannerView r1 = com.appodeal.ads.C9409q4.m27809a((android.content.Context) r14)
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r3.<init>(r6, r12)
            r3.addRule(r2)
            r1.setLayoutParams(r3)
        L_0x021f:
            android.widget.RelativeLayout r2 = r14.f22750d
            r2.addView(r1)
        L_0x0224:
            android.widget.RelativeLayout r1 = r14.f22750d
            r1.setVisibility(r5)
            android.widget.RelativeLayout r1 = r14.f22750d
            r0.addView(r1)
            r14.setContentView(r0)
            com.appodeal.ads.C9409q4.m27821a((com.appodeal.ads.BannerCallbacks) r14)
            com.appodeal.ads.C9409q4.m27823a((com.appodeal.ads.MrecCallbacks) r14)
            com.appodeal.ads.C9409q4.m27822a((com.appodeal.ads.InterstitialCallbacks) r14)
            com.appodeal.ads.C9409q4.m27827a((com.appodeal.ads.RewardedVideoCallbacks) r14)
            com.appodeal.ads.C9409q4.m27826a((com.appodeal.ads.NativeCallbacks) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.TestActivity.mo59339b():void");
    }

    /* renamed from: c */
    public final void mo59340c() {
        C9409q4.m27850b((Activity) this, 64);
        C9409q4.m27850b((Activity) this, 256);
        if (this.f22753g != null) {
            NativeAdViewContentStream nativeAdViewContentStream = this.f22752f;
            if (nativeAdViewContentStream != null) {
                this.f22750d.removeView(nativeAdViewContentStream);
                this.f22752f.unregisterViewForInteraction();
                this.f22752f = null;
            }
            this.f22753g = null;
        }
        this.f22749c.setVisibility(0);
        this.f22750d.setVisibility(4);
        this.f22751e = false;
        this.f22757k = false;
    }

    /* renamed from: d */
    public final void mo59341d() {
        ProgressDialog progressDialog = this.f22756j;
        if (progressDialog != null) {
            progressDialog.hide();
            this.f22756j.dismiss();
            this.f22756j = null;
        }
        this.f22755i = false;
    }

    /* renamed from: e */
    public final void mo59342e() {
        mo59341d();
        this.f22755i = true;
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f22756j = progressDialog;
        progressDialog.setCancelable(false);
        this.f22756j.setMessage("Loading");
        this.f22756j.show();
    }

    public final void onBackPressed() {
        if (this.f22751e) {
            int i = this.f22747a;
            if (i == 4 || i == 256 || i == 512) {
                mo59340c();
            }
        } else if (this.f22747a != 0) {
            this.f22747a = 0;
            mo59339b();
        } else {
            C9409q4.f23842d = null;
            finish();
            overridePendingTransition(0, 0);
        }
    }

    public final void onBannerClicked() {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Banner clicked");
    }

    public final void onBannerExpired() {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Banner expired");
    }

    public final void onBannerFailedToLoad() {
        if (this.f22757k) {
            this.f22757k = false;
            mo59341d();
            m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Banner failed to load");
        }
    }

    public final void onBannerLoaded(int i, boolean z) {
        if (this.f22757k) {
            mo59341d();
            if (C9409q4.m27842a((Activity) this, 64, RewardedVideo.VIDEO_MODE_DEFAULT)) {
                int i2 = this.f22747a;
                if (i2 == 4 || i2 == 256 || i2 == 512) {
                    this.f22750d.setVisibility(0);
                    this.f22750d.bringToFront();
                    this.f22751e = true;
                    return;
                }
                return;
            }
            m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Banner failed to load");
        }
    }

    public final void onBannerShowFailed() {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Banner show failed");
    }

    public final void onBannerShown() {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Banner shown");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9425r1 r1Var = (C9425r1) C9378o1.m27718a().mo60846f();
        C9419q5 q5Var = (C9419q5) C9685w2.m28463a().mo60846f();
        if (q5Var != null) {
            q5Var.mo60611c();
            q5Var.mo60634y();
        }
        if (r1Var != null) {
            r1Var.mo60611c();
            r1Var.mo60634y();
        }
        C9409q4.f23842d = this;
        if (bundle != null) {
            this.f22747a = bundle.getInt("adType");
            this.f22748b = bundle.getBoolean("test");
            this.f22755i = bundle.getBoolean("spinnerShown");
        }
        mo59339b();
    }

    public final void onInterstitialClicked() {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Interstitial clicked");
    }

    public final void onInterstitialClosed() {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Interstitial closed");
        mo59340c();
    }

    public final void onInterstitialExpired() {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Interstitial expired");
    }

    public final void onInterstitialFailedToLoad() {
        if (this.f22757k) {
            this.f22757k = false;
            mo59341d();
            m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Interstitial failed to load");
        }
    }

    public final void onInterstitialLoaded(boolean z) {
        if (this.f22757k) {
            mo59341d();
            this.f22751e = true;
            C9409q4.m27842a((Activity) this, 3, RewardedVideo.VIDEO_MODE_DEFAULT);
        }
    }

    public final void onInterstitialShowFailed() {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Interstitial show failed");
    }

    public final void onInterstitialShown() {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Interstitial shown");
    }

    public final void onMrecClicked() {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Mrec clicked");
    }

    public final void onMrecExpired() {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Mrec expired");
    }

    public final void onMrecFailedToLoad() {
        if (this.f22757k) {
            this.f22757k = false;
            mo59341d();
            m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Mrec failed to load");
        }
    }

    public final void onMrecLoaded(boolean z) {
        if (this.f22757k) {
            mo59341d();
            if (C9409q4.m27842a((Activity) this, 256, RewardedVideo.VIDEO_MODE_DEFAULT)) {
                int i = this.f22747a;
                if (i == 4 || i == 256 || i == 512) {
                    this.f22750d.setVisibility(0);
                    this.f22750d.bringToFront();
                    this.f22751e = true;
                    return;
                }
                return;
            }
            m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Mrec failed to load");
        }
    }

    public final void onMrecShowFailed() {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Mrec show failed");
    }

    public final void onMrecShown() {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Mrec shown");
    }

    public final void onNativeClicked(NativeAd nativeAd) {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Native ad clicked");
    }

    public final void onNativeExpired() {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Native ad expired");
    }

    public final void onNativeFailedToLoad() {
        if (this.f22757k) {
            this.f22757k = false;
            mo59341d();
            m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Native ad failed to load");
        }
    }

    public final void onNativeLoaded() {
        if (this.f22757k) {
            mo59341d();
            ArrayList a = C9409q4.m27811a(1);
            if (a.size() > 0) {
                int i = this.f22747a;
                if (i == 4 || i == 256 || i == 512) {
                    this.f22750d.setVisibility(0);
                    this.f22750d.bringToFront();
                    this.f22751e = true;
                }
                this.f22753g = (NativeAd) a.get(0);
                this.f22752f = new NativeAdViewContentStream((Context) this, this.f22753g);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(12);
                this.f22750d.addView(this.f22752f, layoutParams);
                return;
            }
            m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Native ad failed to load");
        }
    }

    public final void onNativeShowFailed(NativeAd nativeAd) {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Native show failed");
    }

    public final void onNativeShown(NativeAd nativeAd) {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Native ad shown");
    }

    public final void onRewardedVideoClicked() {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Rewarded video clicked");
    }

    public final void onRewardedVideoClosed(boolean z) {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Rewarded video closed");
        mo59340c();
    }

    public final void onRewardedVideoExpired() {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Rewarded video expired");
    }

    public final void onRewardedVideoFailedToLoad() {
        if (this.f22757k) {
            this.f22757k = false;
            mo59341d();
            m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Rewarded video failed to load");
        }
    }

    public final void onRewardedVideoFinished(double d, String str) {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Rewarded video finished");
    }

    public final void onRewardedVideoLoaded(boolean z) {
        if (this.f22757k) {
            mo59341d();
            if (C9409q4.m27842a((Activity) this, 128, RewardedVideo.VIDEO_MODE_DEFAULT)) {
                this.f22751e = true;
            } else {
                m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Rewarded video failed to load");
            }
        }
    }

    public final void onRewardedVideoShowFailed() {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Rewarded video show failed");
    }

    public final void onRewardedVideoShown() {
        m27108a(C9148b.f22956b.f22957a.getApplicationContext(), "Rewarded video shown");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo59340c();
        bundle.putInt("adType", this.f22747a);
        bundle.putBoolean("test", this.f22748b);
        bundle.putBoolean("spinnerShown", this.f22755i);
    }
}
