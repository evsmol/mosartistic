package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.adcolony.sdk.C6288e0;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.adcolony.sdk.x0 */
class C6476x0 {

    /* renamed from: com.adcolony.sdk.x0$a */
    class C6477a implements C6327j0 {
        C6477a() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            boolean unused = C6476x0.this.m15855f(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$b */
    class C6478b implements C6327j0 {
        C6478b() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            boolean unused = C6476x0.this.m15847a(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$c */
    class C6479c implements C6327j0 {
        C6479c() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6476x0.this.mo51083c(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$d */
    class C6480d implements C6327j0 {
        C6480d() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            boolean unused = C6476x0.this.m15858n(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$e */
    class C6481e implements C6327j0 {
        C6481e() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            boolean unused = C6476x0.this.m15857j(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$f */
    class C6482f implements C6327j0 {
        C6482f() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            boolean unused = C6476x0.this.m15856i(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$g */
    class C6483g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f13928a;

        C6483g(C6476x0 x0Var, String str) {
            this.f13928a = str;
        }

        public void run() {
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15070a(b, "type", "open_hook");
            C6235c0.m15070a(b, "message", this.f13928a);
            new C6312h0("CustomMessage.controller_send", 0, b).mo50736c();
        }
    }

    /* renamed from: com.adcolony.sdk.x0$h */
    class C6484h implements C6327j0 {
        C6484h() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6476x0.this.mo51087h(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$i */
    class C6485i implements C6327j0 {
        C6485i() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6476x0.this.mo51090m(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$j */
    class C6486j implements C6327j0 {
        C6486j() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6476x0.this.mo51088k(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$k */
    class C6487k implements C6327j0 {
        C6487k() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6476x0.this.mo51091o(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$l */
    class C6488l implements C6327j0 {
        C6488l() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6476x0.this.mo51086g(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$m */
    class C6489m implements C6327j0 {
        C6489m() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6476x0.this.mo51085e(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$n */
    class C6490n implements C6327j0 {
        C6490n() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6476x0.this.mo51084d(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$o */
    class C6491o implements C6327j0 {
        C6491o() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6476x0.this.mo51081b(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.x0$p */
    class C6492p implements C6327j0 {
        C6492p() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6476x0.this.mo51089l(h0Var);
        }
    }

    C6476x0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m15855f(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        C6252d c = C6185a.m14887b().mo50787c();
        String h = C6235c0.m15087h(a, "ad_session_id");
        AdColonyInterstitial adColonyInterstitial = c.mo50621f().get(h);
        AdColonyAdView adColonyAdView = c.mo50618d().get(h);
        if ((adColonyInterstitial == null || adColonyInterstitial.getListener() == null || adColonyInterstitial.mo50350d() == null) && (adColonyAdView == null || adColonyAdView.getListener() == null)) {
            return false;
        }
        if (adColonyAdView == null) {
            new C6312h0("AdUnit.make_in_app_purchase", adColonyInterstitial.mo50350d().mo50551k()).mo50736c();
        }
        mo51080a(h);
        m15850b(h);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public boolean m15856i(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        String h = C6235c0.m15087h(C6235c0.m15085f(a, "clickOverride"), "url");
        String h2 = C6235c0.m15087h(a, "ad_session_id");
        C6252d c = C6185a.m14887b().mo50787c();
        AdColonyInterstitial adColonyInterstitial = c.mo50621f().get(h2);
        AdColonyAdView adColonyAdView = c.mo50618d().get(h2);
        if (adColonyInterstitial != null) {
            adColonyInterstitial.mo50345b(h);
            return true;
        } else if (adColonyAdView == null) {
            return false;
        } else {
            adColonyAdView.setClickOverride(h);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public boolean m15857j(C6312h0 h0Var) {
        int i;
        C6294f1 a = h0Var.mo50732a();
        String h = C6235c0.m15087h(a, "ad_session_id");
        int d = C6235c0.m15083d(a, "orientation");
        C6252d c = C6185a.m14887b().mo50787c();
        AdColonyAdView adColonyAdView = c.mo50618d().get(h);
        AdColonyInterstitial adColonyInterstitial = c.mo50621f().get(h);
        Context a2 = C6185a.m14880a();
        if (adColonyAdView != null) {
            adColonyAdView.setOrientation(d);
        } else if (adColonyInterstitial != null) {
            adColonyInterstitial.mo50336a(d);
        }
        if (adColonyInterstitial == null && adColonyAdView == null) {
            new C6288e0.C6289a().mo50644a("Invalid ad session id sent with set orientation properties message: ").mo50644a(h).mo50645a(C6288e0.f13498i);
            return false;
        } else if (!(a2 instanceof C6201b)) {
            return true;
        } else {
            C6201b bVar = (C6201b) a2;
            if (adColonyAdView == null) {
                i = adColonyInterstitial.mo50355f();
            } else {
                i = adColonyAdView.getOrientation();
            }
            bVar.mo50456a(i);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public boolean m15858n(C6312h0 h0Var) {
        AdColonyAdView adColonyAdView = C6185a.m14887b().mo50787c().mo50618d().get(C6235c0.m15087h(h0Var.mo50732a(), "ad_session_id"));
        if (adColonyAdView == null) {
            return false;
        }
        adColonyAdView.setNoCloseButton(C6235c0.m15076b(h0Var.mo50732a(), "use_custom_close"));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo51086g(C6312h0 h0Var) {
        C6294f1 b = C6235c0.m15073b();
        C6294f1 a = h0Var.mo50732a();
        String h = C6235c0.m15087h(a, "url");
        String h2 = C6235c0.m15087h(a, "ad_session_id");
        AdColonyAdView adColonyAdView = C6185a.m14887b().mo50787c().mo50618d().get(h2);
        if (adColonyAdView != null && !adColonyAdView.getTrustedDemandSource() && !adColonyAdView.mo50239c()) {
            return false;
        }
        if (h.startsWith("browser")) {
            h = h.replaceFirst("browser", "http");
        }
        if (h.startsWith("safari")) {
            h = h.replaceFirst("safari", "http");
        }
        m15852d(h);
        if (C6509z0.m15934a(new Intent("android.intent.action.VIEW", Uri.parse(h)))) {
            C6235c0.m15079b(b, "success", true);
            h0Var.mo50733a(b).mo50736c();
            mo51082c(h2);
            mo51080a(h2);
            m15850b(h2);
            return true;
        }
        C6509z0.m15939a("Failed to launch browser.", 0);
        C6235c0.m15079b(b, "success", false);
        h0Var.mo50733a(b).mo50736c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo51087h(C6312h0 h0Var) {
        C6294f1 b = C6235c0.m15073b();
        C6294f1 a = h0Var.mo50732a();
        String h = C6235c0.m15087h(a, "product_id");
        String h2 = C6235c0.m15087h(a, "ad_session_id");
        if (h.equals("")) {
            h = C6235c0.m15087h(a, "handle");
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(h));
        m15852d(h);
        if (C6509z0.m15934a(intent)) {
            C6235c0.m15079b(b, "success", true);
            h0Var.mo50733a(b).mo50736c();
            mo51082c(h2);
            mo51080a(h2);
            m15850b(h2);
            return true;
        }
        C6509z0.m15939a("Unable to open.", 0);
        C6235c0.m15079b(b, "success", false);
        h0Var.mo50733a(b).mo50736c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo51088k(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        C6294f1 b = C6235c0.m15073b();
        String h = C6235c0.m15087h(a, "ad_session_id");
        C6290e1 a2 = C6235c0.m15060a(a, "recipients");
        String str = "";
        for (int i = 0; i < a2.mo50650b(); i++) {
            if (i != 0) {
                str = str + ";";
            }
            str = str + C6235c0.m15075b(a2, i);
        }
        if (C6509z0.m15934a(new Intent("android.intent.action.VIEW", Uri.parse("smsto:" + str)).putExtra("sms_body", C6235c0.m15087h(a, "body")))) {
            C6235c0.m15079b(b, "success", true);
            h0Var.mo50733a(b).mo50736c();
            mo51082c(h);
            mo51080a(h);
            m15850b(h);
            return true;
        }
        C6509z0.m15939a("Failed to create sms.", 0);
        C6235c0.m15079b(b, "success", false);
        h0Var.mo50733a(b).mo50736c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo51089l(C6312h0 h0Var) {
        C6294f1 b = C6235c0.m15073b();
        C6294f1 a = h0Var.mo50732a();
        Intent type = new Intent("android.intent.action.SEND").setType("text/plain");
        Intent putExtra = type.putExtra("android.intent.extra.TEXT", C6235c0.m15087h(a, "text") + " " + C6235c0.m15087h(a, "url"));
        String h = C6235c0.m15087h(a, "ad_session_id");
        if (C6509z0.m15935a(putExtra, true)) {
            C6235c0.m15079b(b, "success", true);
            h0Var.mo50733a(b).mo50736c();
            mo51082c(h);
            mo51080a(h);
            m15850b(h);
            return true;
        }
        C6509z0.m15939a("Unable to create social post.", 0);
        C6235c0.m15079b(b, "success", false);
        h0Var.mo50733a(b).mo50736c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo51090m(C6312h0 h0Var) {
        C6294f1 b = C6235c0.m15073b();
        C6294f1 a = h0Var.mo50732a();
        Intent intent = new Intent("android.intent.action.DIAL");
        Intent data = intent.setData(Uri.parse("tel:" + C6235c0.m15087h(a, "phone_number")));
        String h = C6235c0.m15087h(a, "ad_session_id");
        if (C6509z0.m15934a(data)) {
            C6235c0.m15079b(b, "success", true);
            h0Var.mo50733a(b).mo50736c();
            mo51082c(h);
            mo51080a(h);
            m15850b(h);
            return true;
        }
        C6509z0.m15939a("Failed to dial number.", 0);
        C6235c0.m15079b(b, "success", false);
        h0Var.mo50733a(b).mo50736c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo51091o(C6312h0 h0Var) {
        Context a = C6185a.m14880a();
        if (a == null) {
            return false;
        }
        int a2 = C6235c0.m15057a(h0Var.mo50732a(), "length_ms", 500);
        C6294f1 b = C6235c0.m15073b();
        C6290e1 e = C6509z0.m15963e(a);
        boolean z = false;
        for (int i = 0; i < e.mo50650b(); i++) {
            if (C6235c0.m15075b(e, i).equals("android.permission.VIBRATE")) {
                z = true;
            }
        }
        if (!z) {
            new C6288e0.C6289a().mo50644a("No vibrate permission detected.").mo50645a(C6288e0.f13495f);
            C6235c0.m15079b(b, "success", false);
            h0Var.mo50733a(b).mo50736c();
            return false;
        } else if (Build.VERSION.SDK_INT < 11 || !C6509z0.m15933a(a, (long) a2)) {
            C6235c0.m15079b(b, "success", false);
            h0Var.mo50733a(b).mo50736c();
            return false;
        } else {
            C6235c0.m15079b(b, "success", true);
            h0Var.mo50733a(b).mo50736c();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51079a() {
        C6185a.m14886a("System.open_store", (C6327j0) new C6484h());
        C6185a.m14886a("System.telephone", (C6327j0) new C6485i());
        C6185a.m14886a("System.sms", (C6327j0) new C6486j());
        C6185a.m14886a("System.vibrate", (C6327j0) new C6487k());
        C6185a.m14886a("System.open_browser", (C6327j0) new C6488l());
        C6185a.m14886a("System.mail", (C6327j0) new C6489m());
        C6185a.m14886a("System.launch_app", (C6327j0) new C6490n());
        C6185a.m14886a("System.create_calendar_event", (C6327j0) new C6491o());
        C6185a.m14886a("System.social_post", (C6327j0) new C6492p());
        C6185a.m14886a("System.make_in_app_purchase", (C6327j0) new C6477a());
        C6185a.m14886a("System.close", (C6327j0) new C6478b());
        C6185a.m14886a("System.expand", (C6327j0) new C6479c());
        C6185a.m14886a("System.use_custom_close", (C6327j0) new C6480d());
        C6185a.m14886a("System.set_orientation_properties", (C6327j0) new C6481e());
        C6185a.m14886a("System.click_override", (C6327j0) new C6482f());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ed  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo51081b(com.adcolony.sdk.C6312h0 r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            com.adcolony.sdk.f1 r2 = com.adcolony.sdk.C6235c0.m15073b()
            com.adcolony.sdk.f1 r3 = r25.mo50732a()
            java.lang.String r4 = "ad_session_id"
            java.lang.String r4 = com.adcolony.sdk.C6235c0.m15087h(r3, r4)
            java.lang.String r5 = "params"
            com.adcolony.sdk.f1 r3 = com.adcolony.sdk.C6235c0.m15085f(r3, r5)
            java.lang.String r5 = "recurrence"
            com.adcolony.sdk.f1 r5 = com.adcolony.sdk.C6235c0.m15085f(r3, r5)
            com.adcolony.sdk.e1 r6 = com.adcolony.sdk.C6235c0.m15059a()
            com.adcolony.sdk.e1 r7 = com.adcolony.sdk.C6235c0.m15059a()
            com.adcolony.sdk.e1 r8 = com.adcolony.sdk.C6235c0.m15059a()
            java.lang.String r9 = "description"
            java.lang.String r10 = com.adcolony.sdk.C6235c0.m15087h(r3, r9)
            java.lang.String r11 = "location"
            com.adcolony.sdk.C6235c0.m15087h(r3, r11)
            java.lang.String r11 = "start"
            java.lang.String r11 = com.adcolony.sdk.C6235c0.m15087h(r3, r11)
            java.lang.String r12 = "end"
            java.lang.String r12 = com.adcolony.sdk.C6235c0.m15087h(r3, r12)
            java.lang.String r13 = "summary"
            java.lang.String r3 = com.adcolony.sdk.C6235c0.m15087h(r3, r13)
            java.lang.String r13 = ""
            if (r5 == 0) goto L_0x0078
            boolean r14 = r5.mo50689b()
            if (r14 != 0) goto L_0x0078
            java.lang.String r6 = "expires"
            java.lang.String r6 = com.adcolony.sdk.C6235c0.m15087h(r5, r6)
            java.lang.String r7 = "frequency"
            java.lang.String r7 = com.adcolony.sdk.C6235c0.m15087h(r5, r7)
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.String r7 = r7.toUpperCase(r8)
            java.lang.String r8 = "daysInWeek"
            com.adcolony.sdk.e1 r8 = com.adcolony.sdk.C6235c0.m15060a((com.adcolony.sdk.C6294f1) r5, (java.lang.String) r8)
            java.lang.String r14 = "daysInMonth"
            com.adcolony.sdk.e1 r14 = com.adcolony.sdk.C6235c0.m15060a((com.adcolony.sdk.C6294f1) r5, (java.lang.String) r14)
            java.lang.String r15 = "daysInYear"
            com.adcolony.sdk.e1 r15 = com.adcolony.sdk.C6235c0.m15060a((com.adcolony.sdk.C6294f1) r5, (java.lang.String) r15)
            goto L_0x007d
        L_0x0078:
            r14 = r7
            r15 = r8
            r7 = r13
            r8 = r6
            r6 = r7
        L_0x007d:
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x0084
            r3 = r10
        L_0x0084:
            java.util.Date r11 = com.adcolony.sdk.C6509z0.m15968g(r11)
            java.util.Date r12 = com.adcolony.sdk.C6509z0.m15968g(r12)
            java.util.Date r6 = com.adcolony.sdk.C6509z0.m15968g(r6)
            java.lang.String r13 = "success"
            if (r11 == 0) goto L_0x0206
            if (r12 != 0) goto L_0x0098
            goto L_0x0206
        L_0x0098:
            long r0 = r11.getTime()
            r16 = r13
            long r12 = r12.getTime()
            r17 = 0
            if (r6 == 0) goto L_0x00b5
            long r19 = r6.getTime()
            long r21 = r11.getTime()
            long r19 = r19 - r21
            r21 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 / r21
            goto L_0x00b7
        L_0x00b5:
            r19 = r17
        L_0x00b7:
            java.lang.String r6 = "DAILY"
            boolean r6 = r7.equals(r6)
            r21 = 1
            if (r6 == 0) goto L_0x00cd
            r17 = 86400(0x15180, double:4.26873E-319)
            long r19 = r19 / r17
        L_0x00c6:
            long r17 = r19 + r21
        L_0x00c8:
            r19 = r12
            r11 = r17
            goto L_0x00f7
        L_0x00cd:
            java.lang.String r6 = "WEEKLY"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00db
            r17 = 604800(0x93a80, double:2.98811E-318)
            long r19 = r19 / r17
            goto L_0x00c6
        L_0x00db:
            java.lang.String r6 = "MONTHLY"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00e9
            r17 = 2629800(0x2820a8, double:1.299294E-317)
            long r19 = r19 / r17
            goto L_0x00c6
        L_0x00e9:
            java.lang.String r6 = "YEARLY"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00c8
            r17 = 31557600(0x1e187e0, double:1.5591526E-316)
            long r19 = r19 / r17
            goto L_0x00c6
        L_0x00f7:
            java.lang.String r6 = "endTime"
            java.lang.String r13 = "beginTime"
            r17 = r4
            java.lang.String r4 = "title"
            r18 = r2
            java.lang.String r2 = "vnd.android.cursor.item/event"
            r21 = r6
            java.lang.String r6 = "android.intent.action.EDIT"
            if (r5 == 0) goto L_0x01aa
            boolean r5 = r5.mo50689b()
            if (r5 != 0) goto L_0x01aa
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r22 = r0
            java.lang.String r0 = "FREQ="
            r5.append(r0)
            r5.append(r7)
            java.lang.String r0 = ";COUNT="
            r5.append(r0)
            r5.append(r11)
            java.lang.String r0 = r5.toString()
            int r1 = r8.mo50650b()     // Catch:{ JSONException -> 0x0184 }
            if (r1 == 0) goto L_0x0148
            java.lang.String r1 = com.adcolony.sdk.C6509z0.m15930a((com.adcolony.sdk.C6290e1) r8)     // Catch:{ JSONException -> 0x0184 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0184 }
            r5.<init>()     // Catch:{ JSONException -> 0x0184 }
            r5.append(r0)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r7 = ";BYDAY="
            r5.append(r7)     // Catch:{ JSONException -> 0x0184 }
            r5.append(r1)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x0184 }
        L_0x0148:
            int r1 = r14.mo50650b()     // Catch:{ JSONException -> 0x0184 }
            if (r1 == 0) goto L_0x0166
            java.lang.String r1 = com.adcolony.sdk.C6509z0.m15949b((com.adcolony.sdk.C6290e1) r14)     // Catch:{ JSONException -> 0x0184 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0184 }
            r5.<init>()     // Catch:{ JSONException -> 0x0184 }
            r5.append(r0)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r7 = ";BYMONTHDAY="
            r5.append(r7)     // Catch:{ JSONException -> 0x0184 }
            r5.append(r1)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x0184 }
        L_0x0166:
            int r1 = r15.mo50650b()     // Catch:{ JSONException -> 0x0184 }
            if (r1 == 0) goto L_0x0184
            java.lang.String r1 = com.adcolony.sdk.C6509z0.m15949b((com.adcolony.sdk.C6290e1) r15)     // Catch:{ JSONException -> 0x0184 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0184 }
            r5.<init>()     // Catch:{ JSONException -> 0x0184 }
            r5.append(r0)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r7 = ";BYYEARDAY="
            r5.append(r7)     // Catch:{ JSONException -> 0x0184 }
            r5.append(r1)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x0184 }
        L_0x0184:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r6)
            android.content.Intent r1 = r1.setType(r2)
            android.content.Intent r1 = r1.putExtra(r4, r3)
            android.content.Intent r1 = r1.putExtra(r9, r10)
            r7 = r22
            android.content.Intent r1 = r1.putExtra(r13, r7)
            r11 = r19
            r5 = r21
            android.content.Intent r1 = r1.putExtra(r5, r11)
            java.lang.String r2 = "rrule"
            android.content.Intent r0 = r1.putExtra(r2, r0)
            goto L_0x01c8
        L_0x01aa:
            r7 = r0
            r11 = r19
            r5 = r21
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6)
            android.content.Intent r0 = r0.setType(r2)
            android.content.Intent r0 = r0.putExtra(r4, r3)
            android.content.Intent r0 = r0.putExtra(r9, r10)
            android.content.Intent r0 = r0.putExtra(r13, r7)
            android.content.Intent r0 = r0.putExtra(r5, r11)
        L_0x01c8:
            boolean r0 = com.adcolony.sdk.C6509z0.m15934a((android.content.Intent) r0)
            if (r0 == 0) goto L_0x01ed
            r0 = 1
            r2 = r16
            r1 = r18
            com.adcolony.sdk.C6235c0.m15079b((com.adcolony.sdk.C6294f1) r1, (java.lang.String) r2, (boolean) r0)
            r3 = r25
            com.adcolony.sdk.h0 r1 = r3.mo50733a(r1)
            r1.mo50736c()
            r4 = r24
            r1 = r17
            r4.mo51082c((java.lang.String) r1)
            r4.mo51080a((java.lang.String) r1)
            r4.m15850b((java.lang.String) r1)
            return r0
        L_0x01ed:
            r4 = r24
            r3 = r25
            r2 = r16
            r1 = r18
            r0 = 0
            java.lang.String r5 = "Unable to create Calendar Event."
            com.adcolony.sdk.C6509z0.m15939a((java.lang.String) r5, (int) r0)
            com.adcolony.sdk.C6235c0.m15079b((com.adcolony.sdk.C6294f1) r1, (java.lang.String) r2, (boolean) r0)
            com.adcolony.sdk.h0 r1 = r3.mo50733a(r1)
            r1.mo50736c()
            return r0
        L_0x0206:
            r4 = r24
            r3 = r1
            r1 = r2
            r2 = r13
            r0 = 0
            java.lang.String r5 = "Unable to create Calendar Event"
            com.adcolony.sdk.C6509z0.m15939a((java.lang.String) r5, (int) r0)
            com.adcolony.sdk.C6235c0.m15079b((com.adcolony.sdk.C6294f1) r1, (java.lang.String) r2, (boolean) r0)
            com.adcolony.sdk.h0 r1 = r3.mo50733a(r1)
            r1.mo50736c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C6476x0.mo51081b(com.adcolony.sdk.h0):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo51083c(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        Context a2 = C6185a.m14880a();
        if (a2 != null && C6185a.m14890d()) {
            String h = C6235c0.m15087h(a, "ad_session_id");
            C6328k b = C6185a.m14887b();
            AdColonyAdView adColonyAdView = b.mo50787c().mo50618d().get(h);
            if (adColonyAdView != null && ((adColonyAdView.getTrustedDemandSource() || adColonyAdView.mo50239c()) && b.mo50800k() != adColonyAdView)) {
                adColonyAdView.setExpandMessage(h0Var);
                adColonyAdView.setExpandedWidth(C6235c0.m15083d(a, IabUtils.KEY_WIDTH));
                adColonyAdView.setExpandedHeight(C6235c0.m15083d(a, IabUtils.KEY_HEIGHT));
                adColonyAdView.setOrientation(C6235c0.m15057a(a, "orientation", -1));
                adColonyAdView.setNoCloseButton(C6235c0.m15076b(a, "use_custom_close"));
                b.mo50777a(adColonyAdView);
                b.mo50782a(adColonyAdView.getContainer());
                Intent intent = new Intent(a2, AdColonyAdViewActivity.class);
                m15850b(h);
                mo51080a(h);
                C6509z0.m15934a(intent);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo51084d(C6312h0 h0Var) {
        C6294f1 b = C6235c0.m15073b();
        C6294f1 a = h0Var.mo50732a();
        String h = C6235c0.m15087h(a, "ad_session_id");
        if (C6235c0.m15076b(a, "deep_link")) {
            return mo51087h(h0Var);
        }
        Context a2 = C6185a.m14880a();
        if (a2 == null) {
            return false;
        }
        if (C6509z0.m15934a(a2.getPackageManager().getLaunchIntentForPackage(C6235c0.m15087h(a, "handle")))) {
            C6235c0.m15079b(b, "success", true);
            h0Var.mo50733a(b).mo50736c();
            mo51082c(h);
            mo51080a(h);
            m15850b(h);
            return true;
        }
        C6509z0.m15939a("Failed to launch external application.", 0);
        C6235c0.m15079b(b, "success", false);
        h0Var.mo50733a(b).mo50736c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo51085e(C6312h0 h0Var) {
        C6294f1 b = C6235c0.m15073b();
        C6294f1 a = h0Var.mo50732a();
        C6290e1 a2 = C6235c0.m15060a(a, "recipients");
        boolean b2 = C6235c0.m15076b(a, "html");
        String h = C6235c0.m15087h(a, "subject");
        String h2 = C6235c0.m15087h(a, "body");
        String h3 = C6235c0.m15087h(a, "ad_session_id");
        String[] strArr = new String[a2.mo50650b()];
        for (int i = 0; i < a2.mo50650b(); i++) {
            strArr[i] = C6235c0.m15075b(a2, i);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (!b2) {
            intent.setType("plain/text");
        }
        intent.putExtra("android.intent.extra.SUBJECT", h).putExtra("android.intent.extra.TEXT", h2).putExtra("android.intent.extra.EMAIL", strArr);
        if (C6509z0.m15934a(intent)) {
            C6235c0.m15079b(b, "success", true);
            h0Var.mo50733a(b).mo50736c();
            mo51082c(h3);
            mo51080a(h3);
            m15850b(h3);
            return true;
        }
        C6509z0.m15939a("Failed to send email.", 0);
        C6235c0.m15079b(b, "success", false);
        h0Var.mo50733a(b).mo50736c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo51082c(String str) {
        C6252d c = C6185a.m14887b().mo50787c();
        AdColonyInterstitial adColonyInterstitial = c.mo50621f().get(str);
        if (adColonyInterstitial == null || adColonyInterstitial.getListener() == null) {
            AdColonyAdView adColonyAdView = c.mo50618d().get(str);
            AdColonyAdViewListener listener = adColonyAdView != null ? adColonyAdView.getListener() : null;
            if (adColonyAdView != null && listener != null) {
                listener.onLeftApplication(adColonyAdView);
                return;
            }
            return;
        }
        adColonyInterstitial.getListener().onLeftApplication(adColonyInterstitial);
    }

    /* renamed from: d */
    private void m15852d(String str) {
        if (!C6509z0.m15937a((Runnable) new C6483g(this, str))) {
            new C6288e0.C6289a().mo50644a("Executing ADCSystem.sendOpenCustomMessage failed").mo50645a(C6288e0.f13498i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m15847a(C6312h0 h0Var) {
        String h = C6235c0.m15087h(h0Var.mo50732a(), "ad_session_id");
        Activity activity = C6185a.m14880a() instanceof Activity ? (Activity) C6185a.m14880a() : null;
        boolean z = activity instanceof AdColonyAdViewActivity;
        if (!(activity instanceof C6201b)) {
            return false;
        }
        if (z) {
            ((AdColonyAdViewActivity) activity).mo50266b();
            return true;
        }
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15070a(b, "id", h);
        new C6312h0("AdSession.on_request_close", ((C6201b) activity).f13317c, b).mo50736c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51080a(String str) {
        C6252d c = C6185a.m14887b().mo50787c();
        AdColonyInterstitial adColonyInterstitial = c.mo50621f().get(str);
        if (adColonyInterstitial == null || adColonyInterstitial.getListener() == null || !adColonyInterstitial.mo50360h()) {
            AdColonyAdView adColonyAdView = c.mo50618d().get(str);
            AdColonyAdViewListener listener = adColonyAdView != null ? adColonyAdView.getListener() : null;
            if (adColonyAdView != null && listener != null && adColonyAdView.mo50239c()) {
                listener.onClicked(adColonyAdView);
                return;
            }
            return;
        }
        adColonyInterstitial.getListener().onClicked(adColonyInterstitial);
    }

    /* renamed from: b */
    private boolean m15850b(String str) {
        if (C6185a.m14887b().mo50787c().mo50618d().get(str) == null) {
            return false;
        }
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15070a(b, "ad_session_id", str);
        new C6312h0("MRAID.on_event", 1, b).mo50736c();
        return true;
    }
}
