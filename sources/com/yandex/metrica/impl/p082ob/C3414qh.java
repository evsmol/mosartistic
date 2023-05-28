package com.yandex.metrica.impl.p082ob;

import android.net.Uri;
import android.util.Base64;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.qh */
class C3414qh extends C1867Ah {

    /* renamed from: f */
    private final String f8855f;

    /* renamed from: com.yandex.metrica.impl.ob.qh$a */
    class C3415a extends HashMap<String, String> {

        /* renamed from: a */
        final /* synthetic */ byte[] f8856a;

        C3415a(C3414qh qhVar, byte[] bArr) {
            this.f8856a = bArr;
            put("Content-Type", "text/plain; charset=utf-8");
            put("Access-Control-Allow-Origin", "*");
            put("Access-Control-Allow-Methods", "GET");
            put("Content-Length", String.valueOf(bArr.length));
        }
    }

    C3414qh(Socket socket, Uri uri, C2063Gh gh, C2900di diVar, String str, C2097Hh hh) {
        super(socket, uri, gh, diVar, hh);
        this.f8855f = str;
    }

    /* renamed from: a */
    public void mo15465a() {
        try {
            byte[] encode = Base64.encode(new C3712ym().mo18438a(this.f8855f.getBytes()), 0);
            mo15466a("HTTP/1.1 200 OK", (Map<String, String>) new C3415a(this, encode), encode);
        } catch (Throwable unused) {
        }
    }
}
