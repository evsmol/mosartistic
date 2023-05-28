package com.adcolony.sdk;

public class AdColonyCustomMessage {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f13184a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f13185b;

    /* renamed from: com.adcolony.sdk.AdColonyCustomMessage$a */
    class C6177a implements Runnable {
        C6177a() {
        }

        public void run() {
            AdColony.m14789b();
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15070a(b, "type", AdColonyCustomMessage.this.f13184a);
            C6235c0.m15070a(b, "message", AdColonyCustomMessage.this.f13185b);
            new C6312h0("CustomMessage.native_send", 1, b).mo50736c();
        }
    }

    public AdColonyCustomMessage(String str, String str2) {
        if (C6509z0.m15964e(str) || C6509z0.m15964e(str2)) {
            this.f13184a = str;
            this.f13185b = str2;
        }
    }

    public String getMessage() {
        return this.f13185b;
    }

    public String getType() {
        return this.f13184a;
    }

    public void send() {
        AdColony.m14786a((Runnable) new C6177a());
    }

    public AdColonyCustomMessage set(String str, String str2) {
        this.f13184a = str;
        this.f13185b = str2;
        return this;
    }
}
