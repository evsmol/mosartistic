package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.ironsource.environment.C4411j;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.p124e.C4401c;
import com.ironsource.mediationsdk.C4455H;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.C4721i;
import com.ironsource.mediationsdk.utils.C4726l;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.p119d.C4371b;
import com.ironsource.sdk.p143f.C4929a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ironsource.mediationsdk.M */
final class C4476M implements C4411j {

    /* renamed from: u */
    private static C4476M f10777u;

    /* renamed from: A */
    private NetworkStateReceiver f10778A;

    /* renamed from: B */
    private C4481a f10779B = C4481a.NOT_INIT;

    /* renamed from: C */
    private C4483c f10780C = new C4483c() {
        /* JADX WARNING: Removed duplicated region for block: B:101:0x02e1 A[Catch:{ Exception -> 0x0390 }] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x003f A[Catch:{ Exception -> 0x0390 }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[Catch:{ Exception -> 0x0390 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[Catch:{ Exception -> 0x0390 }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf A[Catch:{ Exception -> 0x0390 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00d4 A[Catch:{ Exception -> 0x0390 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0115 A[Catch:{ Exception -> 0x0390 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                com.ironsource.mediationsdk.H r0 = com.ironsource.mediationsdk.C4455H.m12683a()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.ah r1 = com.ironsource.mediationsdk.C4602ah.m13449a()     // Catch:{ Exception -> 0x0390 }
                java.lang.Thread r2 = new java.lang.Thread     // Catch:{ Exception -> 0x0016 }
                com.ironsource.mediationsdk.ah$1 r3 = new com.ironsource.mediationsdk.ah$1     // Catch:{ Exception -> 0x0016 }
                r3.<init>()     // Catch:{ Exception -> 0x0016 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0016 }
                r2.start()     // Catch:{ Exception -> 0x0016 }
                goto L_0x001a
            L_0x0016:
                r1 = move-exception
                r1.printStackTrace()     // Catch:{ Exception -> 0x0390 }
            L_0x001a:
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r1 = r1.f10792l     // Catch:{ Exception -> 0x0390 }
                com.ironsource.d.a r2 = new com.ironsource.d.a     // Catch:{ Exception -> 0x0390 }
                r2.<init>()     // Catch:{ Exception -> 0x0390 }
                r3 = 0
                r4 = 0
                java.lang.String r5 = "userId"
                r6 = 1
                if (r1 == 0) goto L_0x0047
                if (r1 == 0) goto L_0x003c
                int r7 = r1.length()     // Catch:{ Exception -> 0x0390 }
                if (r7 <= 0) goto L_0x003c
                int r7 = r1.length()     // Catch:{ Exception -> 0x0390 }
                r8 = 64
                if (r7 > r8) goto L_0x003c
                r7 = 1
                goto L_0x003d
            L_0x003c:
                r7 = 0
            L_0x003d:
                if (r7 != 0) goto L_0x004e
                com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r5, r1, r3)     // Catch:{ Exception -> 0x0390 }
            L_0x0043:
                r2.mo33152a((com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ Exception -> 0x0390 }
                goto L_0x004e
            L_0x0047:
                java.lang.String r7 = "it's missing"
                com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r5, r1, r7)     // Catch:{ Exception -> 0x0390 }
                goto L_0x0043
            L_0x004e:
                boolean r1 = r2.mo33153a()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x005b
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "userGenerated"
                r1.f10795o = r2     // Catch:{ Exception -> 0x0390 }
                goto L_0x00a8
            L_0x005b:
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = com.ironsource.mediationsdk.C4455H.m12685a((android.content.Context) r2)     // Catch:{ Exception -> 0x0390 }
                r1.f10792l = r2     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r1 = r1.f10792l     // Catch:{ Exception -> 0x0390 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0390 }
                if (r1 != 0) goto L_0x007c
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "GAID"
            L_0x0079:
                r1.f10795o = r2     // Catch:{ Exception -> 0x0390 }
                goto L_0x00a1
            L_0x007c:
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = com.ironsource.environment.C4407h.m12587x(r2)     // Catch:{ Exception -> 0x0390 }
                r1.f10792l = r2     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r1 = r1.f10792l     // Catch:{ Exception -> 0x0390 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0390 }
                if (r1 != 0) goto L_0x009b
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "UUID"
                goto L_0x0079
            L_0x009b:
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = ""
                r1.f10792l = r2     // Catch:{ Exception -> 0x0390 }
            L_0x00a1:
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r1 = r1.f10792l     // Catch:{ Exception -> 0x0390 }
                r0.mo33350a((java.lang.String) r1, (boolean) r4)     // Catch:{ Exception -> 0x0390 }
            L_0x00a8:
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C4675e.m13718a()     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "userIdType"
                com.ironsource.mediationsdk.M r4 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r4 = r4.f10795o     // Catch:{ Exception -> 0x0390 }
                r1.mo34128a(r2, r4)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r1 = r1.f10792l     // Catch:{ Exception -> 0x0390 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0390 }
                if (r1 != 0) goto L_0x00ca
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C4675e.m13718a()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r2 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = r2.f10792l     // Catch:{ Exception -> 0x0390 }
                r1.mo34128a(r5, r2)     // Catch:{ Exception -> 0x0390 }
            L_0x00ca:
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r1 = r1.f10793m     // Catch:{ Exception -> 0x0390 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0390 }
                if (r1 != 0) goto L_0x00e1
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C4675e.m13718a()     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "appKey"
                com.ironsource.mediationsdk.M r4 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r4 = r4.f10793m     // Catch:{ Exception -> 0x0390 }
                r1.mo34128a(r2, r4)     // Catch:{ Exception -> 0x0390 }
            L_0x00e1:
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.d.b r1 = r1.f10799s     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r2 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = r2.f10792l     // Catch:{ Exception -> 0x0390 }
                r1.mo33168e(r2)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.util.Date r2 = new java.util.Date     // Catch:{ Exception -> 0x0390 }
                r2.<init>()     // Catch:{ Exception -> 0x0390 }
                long r4 = r2.getTime()     // Catch:{ Exception -> 0x0390 }
                r1.f10798r = r4     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r4 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r4 = r4.f10792l     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.H$a r5 = r11.f10822c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r2 = r0.mo33340a((android.content.Context) r2, (java.lang.String) r4, (com.ironsource.mediationsdk.C4455H.C4457a) r5)     // Catch:{ Exception -> 0x0390 }
                r1.f10794n = r2     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r1 = r1.f10794n     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x02e1
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                android.os.Handler r1 = r1.f10789i     // Catch:{ Exception -> 0x0390 }
                r1.removeCallbacks(r11)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r1 = r1.f10794n     // Catch:{ Exception -> 0x0390 }
                boolean r1 = r1.mo34198b()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x02b6
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M$a r2 = com.ironsource.mediationsdk.C4476M.C4481a.INITIATED     // Catch:{ Exception -> 0x0390 }
                r1.mo33488a((com.ironsource.mediationsdk.C4476M.C4481a) r2)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r2 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r2 = r2.f10794n     // Catch:{ Exception -> 0x0390 }
                r1.mo33490a((com.ironsource.mediationsdk.utils.C4726l) r2)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                boolean r2 = r0.mo33377m()     // Catch:{ Exception -> 0x0390 }
                r1.mo33492b(r2)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.g r1 = com.ironsource.environment.C4406g.f10503a     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r1 = r1.f10794n     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.g r1 = r1.f11953c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.sdk.f.a r1 = r1.f11614e     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.b r1 = r1.mo34654f()     // Catch:{ Exception -> 0x0390 }
                boolean r1 = r1.f11772c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.C4406g.m12529a(r1)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r4 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r4 = r4.f10794n     // Catch:{ Exception -> 0x0390 }
                r1.mo33486a(r2, r4)     // Catch:{ Exception -> 0x0390 }
                java.util.Date r1 = new java.util.Date     // Catch:{ Exception -> 0x0390 }
                r1.<init>()     // Catch:{ Exception -> 0x0390 }
                long r1 = r1.getTime()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r4 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                long r4 = r4.f10798r     // Catch:{ Exception -> 0x0390 }
                long r1 = r1 - r4
                boolean r4 = r0.mo33377m()     // Catch:{ Exception -> 0x0390 }
                org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4)     // Catch:{ Exception -> 0x0390 }
                java.lang.String r5 = "duration"
                r4.put(r5, r1)     // Catch:{ Exception -> 0x0186 }
                java.lang.String r1 = "sessionDepth"
                int r0 = r0.f10662t     // Catch:{ Exception -> 0x0186 }
                r4.put(r1, r0)     // Catch:{ Exception -> 0x0186 }
                goto L_0x018a
            L_0x0186:
                r0 = move-exception
                r0.printStackTrace()     // Catch:{ Exception -> 0x0390 }
            L_0x018a:
                com.ironsource.mediationsdk.a.c r0 = new com.ironsource.mediationsdk.a.c     // Catch:{ Exception -> 0x0390 }
                r1 = 514(0x202, float:7.2E-43)
                r0.<init>(r1, r4)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.a.h r1 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ Exception -> 0x0390 }
                r1.mo33649b((com.ironsource.mediationsdk.p126a.C4532c) r0)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.af r1 = new com.ironsource.mediationsdk.af     // Catch:{ Exception -> 0x0390 }
                r1.<init>()     // Catch:{ Exception -> 0x0390 }
                r0.f10781a = r1     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.af r0 = r0.f10781a     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.af$a r1 = new com.ironsource.mediationsdk.af$a     // Catch:{ Exception -> 0x0390 }
                r1.<init>()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.lifecycle.a r2 = new com.ironsource.lifecycle.a     // Catch:{ Exception -> 0x0390 }
                com.ironsource.lifecycle.g r1 = (com.ironsource.lifecycle.C4431g) r1     // Catch:{ Exception -> 0x0390 }
                r2.<init>(r1)     // Catch:{ Exception -> 0x0390 }
                r0.f11352a = r2     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r0 = r0.f10794n     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.g r0 = r0.f11953c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.sdk.f.a r0 = r0.f11614e     // Catch:{ Exception -> 0x0390 }
                boolean r0 = r0.mo34652d()     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x01d6
                com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x01d6
                com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.integration.IntegrationHelper.validateIntegration(r0)     // Catch:{ Exception -> 0x0390 }
            L_0x01d6:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r0 = r0.f10794n     // Catch:{ Exception -> 0x0390 }
                org.json.JSONObject r1 = r0.f11954d     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0230
                com.ironsource.mediationsdk.model.g r1 = r0.f11953c     // Catch:{ Exception -> 0x0390 }
                if (r1 != 0) goto L_0x01e3
                goto L_0x0230
            L_0x01e3:
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0390 }
                r3.<init>()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.g r1 = r0.f11953c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.o r1 = r1.f11610a     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0201
                com.ironsource.mediationsdk.model.m r1 = r0.f11876a     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0201
                com.ironsource.mediationsdk.model.m r1 = r0.f11876a     // Catch:{ Exception -> 0x0390 }
                java.util.ArrayList<java.lang.String> r1 = r1.f11648a     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.size()     // Catch:{ Exception -> 0x0390 }
                if (r1 <= 0) goto L_0x0201
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ Exception -> 0x0390 }
                r3.add(r1)     // Catch:{ Exception -> 0x0390 }
            L_0x0201:
                com.ironsource.mediationsdk.model.g r1 = r0.f11953c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.h r1 = r1.f11611b     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x021a
                com.ironsource.mediationsdk.model.m r1 = r0.f11876a     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x021a
                com.ironsource.mediationsdk.model.m r1 = r0.f11876a     // Catch:{ Exception -> 0x0390 }
                java.util.ArrayList<java.lang.String> r1 = r1.f11651d     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.size()     // Catch:{ Exception -> 0x0390 }
                if (r1 <= 0) goto L_0x021a
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ Exception -> 0x0390 }
                r3.add(r1)     // Catch:{ Exception -> 0x0390 }
            L_0x021a:
                com.ironsource.mediationsdk.model.g r1 = r0.f11953c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.i r1 = r1.f11612c     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0225
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ Exception -> 0x0390 }
                r3.add(r1)     // Catch:{ Exception -> 0x0390 }
            L_0x0225:
                com.ironsource.mediationsdk.model.g r0 = r0.f11953c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.e r0 = r0.f11613d     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x0230
                com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ Exception -> 0x0390 }
                r3.add(r0)     // Catch:{ Exception -> 0x0390 }
            L_0x0230:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f10791k     // Catch:{ Exception -> 0x0390 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0390 }
            L_0x0238:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0252
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C4721i) r1     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r2 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                boolean r2 = r2.f10787g     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r4 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r4 = r4.f10794n     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.g r4 = r4.f11953c     // Catch:{ Exception -> 0x0390 }
                r1.mo33309a(r3, r2, r4)     // Catch:{ Exception -> 0x0390 }
                goto L_0x0238
            L_0x0252:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.sdk.SegmentListener r0 = r0.f10796p     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x0277
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r0 = r0.f10794n     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.g r0 = r0.f11953c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.sdk.f.a r0 = r0.f11614e     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.p r0 = r0.mo34650b()     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x0277
                java.lang.String r1 = r0.f11669a     // Catch:{ Exception -> 0x0390 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0390 }
                if (r1 != 0) goto L_0x0277
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.sdk.SegmentListener r1 = r1.f10796p     // Catch:{ Exception -> 0x0390 }
                java.lang.String r0 = r0.f11669a     // Catch:{ Exception -> 0x0390 }
                r1.onSegmentReceived(r0)     // Catch:{ Exception -> 0x0390 }
            L_0x0277:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r0 = r0.f10794n     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.g r0 = r0.f11953c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.sdk.f.a r0 = r0.f11614e     // Catch:{ Exception -> 0x0390 }
                com.ironsource.sdk.controller.u r0 = r0.mo34653e()     // Catch:{ Exception -> 0x0390 }
                boolean r1 = r0.mo34421b()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0394
                java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSessionId()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.e r2 = com.ironsource.environment.C4394e.m12498a()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.ContextProvider r1 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.content.Context r3 = r1.getApplicationContext()     // Catch:{ Exception -> 0x0390 }
                java.util.HashSet r4 = r0.mo34415a()     // Catch:{ Exception -> 0x0390 }
                java.lang.String r5 = r0.mo34422c()     // Catch:{ Exception -> 0x0390 }
                java.lang.String r6 = r0.mo34425d()     // Catch:{ Exception -> 0x0390 }
                boolean r7 = r0.mo34426e()     // Catch:{ Exception -> 0x0390 }
                int r9 = r0.mo34427f()     // Catch:{ Exception -> 0x0390 }
                boolean r10 = r0.mo34428g()     // Catch:{ Exception -> 0x0390 }
                r2.mo33202a(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0390 }
                goto L_0x0394
            L_0x02b6:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                boolean r0 = r0.f10788h     // Catch:{ Exception -> 0x0390 }
                if (r0 != 0) goto L_0x038f
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M$a r1 = com.ironsource.mediationsdk.C4476M.C4481a.INIT_FAILED     // Catch:{ Exception -> 0x0390 }
                r0.mo33488a((com.ironsource.mediationsdk.C4476M.C4481a) r1)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                r0.f10788h = r6     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f10791k     // Catch:{ Exception -> 0x0390 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0390 }
            L_0x02cf:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0394
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C4721i) r1     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "serverResponseIsNotValid"
                r1.mo33307a(r2)     // Catch:{ Exception -> 0x0390 }
                goto L_0x02cf
            L_0x02e1:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                int r0 = r0.f10783c     // Catch:{ Exception -> 0x0390 }
                r1 = 3
                if (r0 != r1) goto L_0x0304
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                r0.f10797q = r6     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f10791k     // Catch:{ Exception -> 0x0390 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0390 }
            L_0x02f4:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0304
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C4721i) r1     // Catch:{ Exception -> 0x0390 }
                r1.mo33318f()     // Catch:{ Exception -> 0x0390 }
                goto L_0x02f4
            L_0x0304:
                boolean r0 = r11.f10820a     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x0338
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                int r0 = r0.f10783c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.f10784d     // Catch:{ Exception -> 0x0390 }
                if (r0 >= r1) goto L_0x0338
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                r0.f10787g = r6     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                android.os.Handler r0 = r0.f10789i     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.f10782b     // Catch:{ Exception -> 0x0390 }
                int r1 = r1 * 1000
                long r1 = (long) r1     // Catch:{ Exception -> 0x0390 }
                r0.postDelayed(r11, r1)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                int r0 = r0.f10783c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.f10785e     // Catch:{ Exception -> 0x0390 }
                if (r0 >= r1) goto L_0x0338
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.f10782b     // Catch:{ Exception -> 0x0390 }
                int r1 = r1 * 2
                r0.f10782b = r1     // Catch:{ Exception -> 0x0390 }
            L_0x0338:
                boolean r0 = r11.f10820a     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x0346
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                int r0 = r0.f10783c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.f10786f     // Catch:{ Exception -> 0x0390 }
                if (r0 != r1) goto L_0x0388
            L_0x0346:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                boolean r0 = r0.f10788h     // Catch:{ Exception -> 0x0390 }
                if (r0 != 0) goto L_0x0388
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                r0.f10788h = r6     // Catch:{ Exception -> 0x0390 }
                java.lang.String r0 = r11.f10821b     // Catch:{ Exception -> 0x0390 }
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x035c
                java.lang.String r0 = "noServerResponse"
                r11.f10821b = r0     // Catch:{ Exception -> 0x0390 }
            L_0x035c:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f10791k     // Catch:{ Exception -> 0x0390 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0390 }
            L_0x0364:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0376
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C4721i) r1     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = r11.f10821b     // Catch:{ Exception -> 0x0390 }
                r1.mo33307a(r2)     // Catch:{ Exception -> 0x0390 }
                goto L_0x0364
            L_0x0376:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M$a r1 = com.ironsource.mediationsdk.C4476M.C4481a.INIT_FAILED     // Catch:{ Exception -> 0x0390 }
                r0.mo33488a((com.ironsource.mediationsdk.C4476M.C4481a) r1)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "Mediation availability false reason: No server response"
                r0.log(r1, r2, r6)     // Catch:{ Exception -> 0x0390 }
            L_0x0388:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.this     // Catch:{ Exception -> 0x0390 }
                int r1 = r0.f10783c     // Catch:{ Exception -> 0x0390 }
                int r1 = r1 + r6
                r0.f10783c = r1     // Catch:{ Exception -> 0x0390 }
            L_0x038f:
                return
            L_0x0390:
                r0 = move-exception
                r0.printStackTrace()
            L_0x0394:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4476M.C44771.run():void");
        }
    };

    /* renamed from: a */
    C4599af f10781a;

    /* renamed from: b */
    int f10782b;

    /* renamed from: c */
    int f10783c;

    /* renamed from: d */
    int f10784d;

    /* renamed from: e */
    int f10785e;

    /* renamed from: f */
    int f10786f;

    /* renamed from: g */
    boolean f10787g;

    /* renamed from: h */
    boolean f10788h = false;

    /* renamed from: i */
    Handler f10789i;

    /* renamed from: j */
    CountDownTimer f10790j;

    /* renamed from: k */
    List<C4721i> f10791k = new ArrayList();

    /* renamed from: l */
    String f10792l;

    /* renamed from: m */
    String f10793m;

    /* renamed from: n */
    C4726l f10794n;

    /* renamed from: o */
    String f10795o;

    /* renamed from: p */
    SegmentListener f10796p;

    /* renamed from: q */
    boolean f10797q;

    /* renamed from: r */
    long f10798r;

    /* renamed from: s */
    C4371b f10799s;

    /* renamed from: t */
    private int f10800t = C4482b.f10819e;

    /* renamed from: v */
    private final String f10801v = Constants.APP_KEY;

    /* renamed from: w */
    private final String f10802w = getClass().getSimpleName();

    /* renamed from: x */
    private HandlerThread f10803x = null;

    /* renamed from: y */
    private boolean f10804y = false;

    /* renamed from: z */
    private AtomicBoolean f10805z;

    /* renamed from: com.ironsource.mediationsdk.M$3 */
    static /* synthetic */ class C44803 {

        /* renamed from: a */
        static final /* synthetic */ int[] f10809a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ironsource.mediationsdk.M$a[] r0 = com.ironsource.mediationsdk.C4476M.C4481a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10809a = r0
                com.ironsource.mediationsdk.M$a r1 = com.ironsource.mediationsdk.C4476M.C4481a.INIT_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10809a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.M$a r1 = com.ironsource.mediationsdk.C4476M.C4481a.NOT_INIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10809a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ironsource.mediationsdk.M$a r1 = com.ironsource.mediationsdk.C4476M.C4481a.INITIATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4476M.C44803.<clinit>():void");
        }
    }

    /* renamed from: com.ironsource.mediationsdk.M$a */
    enum C4481a {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    /* renamed from: com.ironsource.mediationsdk.M$b */
    public static class C4482b {

        /* renamed from: a */
        public static int f10815a = 0;

        /* renamed from: b */
        public static int f10816b = 1;

        /* renamed from: c */
        public static int f10817c = 2;

        /* renamed from: d */
        public static int f10818d = 3;

        /* renamed from: e */
        public static int f10819e = 4;
    }

    /* renamed from: com.ironsource.mediationsdk.M$c */
    abstract class C4483c implements Runnable {

        /* renamed from: a */
        boolean f10820a = true;

        /* renamed from: b */
        String f10821b;

        /* renamed from: c */
        protected C4455H.C4457a f10822c = new C4455H.C4457a() {
            /* renamed from: a */
            public final void mo33381a(String str) {
                C4483c.this.f10820a = false;
                C4483c.this.f10821b = str;
            }
        };

        C4483c() {
        }
    }

    private C4476M() {
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        this.f10803x = handlerThread;
        handlerThread.start();
        this.f10789i = new Handler(this.f10803x.getLooper());
        this.f10782b = 1;
        this.f10783c = 0;
        this.f10784d = 62;
        this.f10785e = 12;
        this.f10786f = 5;
        this.f10805z = new AtomicBoolean(true);
        this.f10787g = false;
        this.f10797q = false;
        this.f10799s = new C4371b();
    }

    /* renamed from: a */
    public static synchronized C4476M m12866a() {
        C4476M m;
        synchronized (C4476M.class) {
            if (f10777u == null) {
                f10777u = new C4476M();
            }
            m = f10777u;
        }
        return m;
    }

    /* renamed from: a */
    public final void mo33486a(Context context, C4726l lVar) {
        this.f10799s.mo33168e(lVar.mo34196a().f10579b);
        this.f10799s.mo33160a(lVar.mo34196a().f10578a);
        C4929a aVar = lVar.f11953c.f11614e;
        this.f10799s.mo33169f(aVar.mo34657i().f11597a);
        this.f10799s.mo33164b(aVar.mo34651c().f11994c);
        this.f10799s.mo33159a(Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
    }

    /* renamed from: a */
    public final synchronized void mo33487a(Context context, String str, String str2) {
        try {
            if (this.f10805z == null || !this.f10805z.compareAndSet(true, false)) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                logger.log(ironSourceTag, this.f10802w + ": Multiple calls to init are not allowed", 2);
                return;
            }
            mo33488a(C4481a.INIT_IN_PROGRESS);
            this.f10792l = str2;
            this.f10793m = str;
            if (IronSourceUtils.isNetworkConnected(context)) {
                this.f10789i.post(this.f10780C);
            } else {
                this.f10804y = true;
                if (this.f10778A == null) {
                    this.f10778A = new NetworkStateReceiver(context, this);
                }
                context.registerReceiver(this.f10778A, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                C4401c.f10496a.mo33211c(new Runnable() {
                    public final void run() {
                        C4476M.this.f10790j = new CountDownTimer(60000, 15000) {
                            public final void onFinish() {
                                if (!C4476M.this.f10788h) {
                                    C4476M.this.f10788h = true;
                                    for (C4721i a : C4476M.this.f10791k) {
                                        a.mo33307a(IronSourceConstants.FALSE_AVAILABILITY_REASON_NO_INTERNET);
                                    }
                                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
                                }
                            }

                            public final void onTick(long j) {
                                if (j <= 45000) {
                                    C4476M.this.f10797q = true;
                                    for (C4721i f : C4476M.this.f10791k) {
                                        f.mo33318f();
                                    }
                                }
                            }
                        }.start();
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo33488a(C4481a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("old status: " + this.f10779B + ", new status: " + aVar + ")");
        this.f10779B = aVar;
    }

    /* renamed from: a */
    public final void mo33489a(C4721i iVar) {
        if (iVar != null) {
            this.f10791k.add(iVar);
        }
    }

    /* renamed from: a */
    public final synchronized void mo33490a(C4726l lVar) {
        int i;
        int i2 = lVar != null ? lVar.f11955e : C4726l.C4727a.f11977a;
        C4481a aVar = this.f10779B;
        if (i2 == C4726l.C4727a.f11978b) {
            i = C4482b.f10817c;
        } else {
            int i3 = C44803.f10809a[aVar.ordinal()];
            i = i3 != 1 ? i3 != 2 ? i3 != 3 ? C4482b.f10815a : C4482b.f10816b : C4482b.f10819e : C4482b.f10818d;
        }
        this.f10800t = i;
        this.f10799s.mo33156a(i);
    }

    /* renamed from: a */
    public final void mo33217a(boolean z) {
        if (this.f10804y && z) {
            CountDownTimer countDownTimer = this.f10790j;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f10804y = false;
            this.f10787g = true;
            this.f10789i.post(this.f10780C);
        }
    }

    /* renamed from: b */
    public final synchronized C4481a mo33491b() {
        return this.f10779B;
    }

    /* renamed from: b */
    public final void mo33492b(boolean z) {
        Map<String, String> map;
        if (z && TextUtils.isEmpty(C4455H.m12683a().f10657o) && (map = this.f10794n.f11953c.f11614e.mo34655g().f11598a) != null && !map.isEmpty()) {
            for (String next : map.keySet()) {
                if (IronSourceUtils.doesClassExist(next)) {
                    String str = map.get(next);
                    if (!TextUtils.isEmpty(str)) {
                        next = str;
                    }
                    C4455H.m12683a().mo33360d(next);
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo33493c() {
        return this.f10797q;
    }
}
