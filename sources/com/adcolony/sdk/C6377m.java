package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.m */
class C6377m implements C6327j0 {

    /* renamed from: com.adcolony.sdk.m$a */
    class C6378a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f13676a;

        /* renamed from: b */
        final /* synthetic */ String f13677b;

        C6378a(C6377m mVar, String str, String str2) {
            this.f13676a = str;
            this.f13677b = str2;
        }

        public void run() {
            try {
                AdColonyCustomMessageListener adColonyCustomMessageListener = C6185a.m14887b().mo50802m().get(this.f13676a);
                if (adColonyCustomMessageListener != null) {
                    adColonyCustomMessageListener.onAdColonyCustomMessage(new AdColonyCustomMessage(this.f13676a, this.f13677b));
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    C6377m() {
        C6185a.m14886a("CustomMessage.controller_send", (C6327j0) this);
    }

    /* renamed from: a */
    public void mo50430a(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        C6509z0.m15953b((Runnable) new C6378a(this, C6235c0.m15087h(a, "type"), C6235c0.m15087h(a, "message")));
    }
}
