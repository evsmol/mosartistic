package com.yandex.metrica.impl.p082ob;

import android.net.Uri;
import com.appnext.base.p260a.p263c.C8843d;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Dh */
public class C1960Dh extends C1867Ah {
    C1960Dh(Socket socket, Uri uri, C2063Gh gh, C2900di diVar, C2097Hh hh) {
        super(socket, uri, gh, diVar, hh);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15465a() {
        Set<String> queryParameterNames = this.f5048d.getQueryParameterNames();
        HashMap hashMap = new HashMap();
        for (String next : queryParameterNames) {
            hashMap.put(next, this.f5048d.getQueryParameter(next));
        }
        hashMap.remove(C8843d.COLUMN_TYPE);
        mo15466a("HTTP/1.1 200 OK", (Map<String, String>) new HashMap(), new byte[0]);
        ((C2198Jh) this.f5046b).mo16036a(hashMap, this.f5045a.getLocalPort(), this.f5049e);
    }
}
