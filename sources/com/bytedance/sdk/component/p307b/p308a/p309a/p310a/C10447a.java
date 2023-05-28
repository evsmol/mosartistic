package com.bytedance.sdk.component.p307b.p308a.p309a.p310a;

import android.text.TextUtils;
import com.bytedance.sdk.component.p307b.p308a.C10457b;
import com.bytedance.sdk.component.p307b.p308a.C10467c;
import com.bytedance.sdk.component.p307b.p308a.C10468d;
import com.bytedance.sdk.component.p307b.p308a.C10473g;
import com.bytedance.sdk.component.p307b.p308a.C10479k;
import com.bytedance.sdk.component.p307b.p308a.C10483m;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.a */
/* compiled from: NetCall */
public class C10447a implements C10457b {

    /* renamed from: c */
    private static AtomicBoolean f26046c = new AtomicBoolean(false);

    /* renamed from: a */
    C10479k f26047a;

    /* renamed from: b */
    C10468d f26048b;

    C10447a(C10479k kVar, C10468d dVar) {
        this.f26047a = kVar;
        this.f26048b = dVar;
    }

    /* renamed from: a */
    public C10483m mo63859a() throws IOException {
        this.f26048b.mo63873c().remove(this);
        this.f26048b.mo63874d().add(this);
        if (this.f26048b.mo63873c().size() + this.f26048b.mo63874d().size() > this.f26048b.mo63870a() || f26046c.get()) {
            this.f26048b.mo63874d().remove(this);
            return null;
        } else if (this.f26047a.f26134a == null || this.f26047a.f26134a.f26114a == null || this.f26047a.f26134a.f26114a.size() <= 0) {
            return mo63860a(this.f26047a);
        } else {
            ArrayList arrayList = new ArrayList(this.f26047a.f26134a.f26114a);
            arrayList.add(new C10473g() {
                /* renamed from: a */
                public C10483m mo63864a(C10473g.C10474a aVar) throws IOException {
                    return C10447a.this.mo63860a(aVar.mo63866a());
                }
            });
            return ((C10473g) arrayList.get(0)).mo63864a(new C10450b(arrayList, this.f26047a));
        }
    }

    /* renamed from: a */
    public C10483m mo63860a(C10479k kVar) throws IOException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(kVar.mo63975b().mo63948a().toString()).openConnection();
            if (kVar.mo63977d() != null && kVar.mo63977d().size() > 0) {
                for (Map.Entry next : kVar.mo63977d().entrySet()) {
                    for (String addRequestProperty : (List) next.getValue()) {
                        httpURLConnection.addRequestProperty((String) next.getKey(), addRequestProperty);
                    }
                }
            }
            if (kVar.mo63979f() == null) {
                httpURLConnection.setRequestMethod("GET");
            } else {
                if (!m30444c() && kVar.mo63979f().f26142a != null && !TextUtils.isEmpty(kVar.mo63979f().f26142a.mo63965a())) {
                    httpURLConnection.addRequestProperty("Content-Type", kVar.mo63979f().f26142a.mo63965a());
                }
                httpURLConnection.setRequestMethod(kVar.mo63976c());
                if ("POST".equalsIgnoreCase(kVar.mo63976c())) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(kVar.mo63979f().f26143b.getBytes());
                    outputStream.flush();
                    outputStream.close();
                }
            }
            if (kVar.f26134a != null) {
                if (kVar.f26134a.f26116c != null) {
                    httpURLConnection.setConnectTimeout((int) kVar.f26134a.f26116c.toMillis(kVar.f26134a.f26115b));
                }
                if (kVar.f26134a.f26116c != null) {
                    httpURLConnection.setReadTimeout((int) kVar.f26134a.f26118e.toMillis(kVar.f26134a.f26117d));
                }
            }
            httpURLConnection.connect();
            if (f26046c.get()) {
                httpURLConnection.disconnect();
                this.f26048b.mo63874d().remove(this);
                return null;
            }
            C10455f fVar = new C10455f(httpURLConnection, kVar);
            this.f26048b.mo63874d().remove(this);
            return fVar;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.f26048b.mo63874d().remove(this);
            throw th;
        }
    }

    /* renamed from: c */
    private boolean m30444c() {
        if (this.f26047a.mo63977d() == null) {
            return false;
        }
        return this.f26047a.mo63977d().containsKey("Content-Type");
    }

    /* renamed from: a */
    public void mo63861a(final C10467c cVar) {
        this.f26048b.mo63872b().submit(new Runnable() {
            public void run() {
                try {
                    C10483m a = C10447a.this.mo63859a();
                    if (a == null) {
                        cVar.mo62658a((C10457b) C10447a.this, new IOException("response is null"));
                    } else {
                        cVar.mo62657a((C10457b) C10447a.this, a);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    cVar.mo62658a((C10457b) C10447a.this, e);
                }
            }
        });
    }

    /* renamed from: b */
    public C10457b clone() {
        return new C10447a(this.f26047a, this.f26048b);
    }
}
