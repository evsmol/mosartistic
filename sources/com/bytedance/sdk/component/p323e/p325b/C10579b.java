package com.bytedance.sdk.component.p323e.p325b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.p307b.p308a.C10444a;
import com.bytedance.sdk.component.p307b.p308a.C10457b;
import com.bytedance.sdk.component.p307b.p308a.C10467c;
import com.bytedance.sdk.component.p307b.p308a.C10469e;
import com.bytedance.sdk.component.p307b.p308a.C10470f;
import com.bytedance.sdk.component.p307b.p308a.C10476i;
import com.bytedance.sdk.component.p307b.p308a.C10479k;
import com.bytedance.sdk.component.p307b.p308a.C10483m;
import com.bytedance.sdk.component.p323e.C10576b;
import com.bytedance.sdk.component.p323e.p324a.C10575a;
import com.bytedance.sdk.component.p323e.p327d.C10602d;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.sdk.component.e.b.b */
/* compiled from: GetExecutor */
public class C10579b extends C10581c {

    /* renamed from: a */
    public static final C10444a f26374a = new C10444a.C10445a().mo63857a().mo63858b();

    /* renamed from: b */
    public static final C10444a f26375b = new C10444a.C10445a().mo63858b();

    /* renamed from: g */
    private C10444a f26376g = f26374a;

    /* renamed from: h */
    private Map<String, String> f26377h = new HashMap();

    public C10579b(C10476i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public void mo64174a(String str, String str2) {
        if (str == null) {
            C10602d.m31128b("GetExecutor", "name cannot be null !!!");
        } else {
            this.f26377h.put(str, str2);
        }
    }

    /* renamed from: a */
    public void mo64173a(final C10575a aVar) {
        try {
            C10479k.C10480a aVar2 = new C10479k.C10480a();
            C10470f.C10471a aVar3 = new C10470f.C10471a();
            Uri parse = Uri.parse(this.f26384f);
            aVar3.mo63958a(parse.getScheme());
            aVar3.mo63960b(parse.getHost());
            String encodedPath = parse.getEncodedPath();
            if (!TextUtils.isEmpty(encodedPath)) {
                if (encodedPath.startsWith("/")) {
                    encodedPath = encodedPath.substring(1);
                }
                aVar3.mo63962c(encodedPath);
            }
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames != null && queryParameterNames.size() > 0) {
                for (String next : queryParameterNames) {
                    this.f26377h.put(next, parse.getQueryParameter(next));
                }
            }
            for (Map.Entry next2 : this.f26377h.entrySet()) {
                aVar3.mo63959a(URLEncoder.encode((String) next2.getKey(), "UTF-8"), URLEncoder.encode((String) next2.getValue(), "UTF-8"));
            }
            mo64175a(aVar2);
            aVar2.mo63982a(this.f26376g);
            aVar2.mo63985a((Object) mo64177b());
            this.f26381c.mo63868a(aVar2.mo63983a(aVar3.mo63961b()).mo63981a().mo63989b()).mo63861a(new C10467c() {
                /* renamed from: a */
                public void mo62658a(C10457b bVar, IOException iOException) {
                    C10575a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo445a((C10581c) C10579b.this, iOException);
                    }
                }

                /* renamed from: a */
                public void mo62657a(C10457b bVar, C10483m mVar) throws IOException {
                    if (aVar != null) {
                        HashMap hashMap = new HashMap();
                        if (mVar != null) {
                            C10469e g = mVar.mo63894g();
                            if (g != null) {
                                for (int i = 0; i < g.mo63945a(); i++) {
                                    hashMap.put(g.mo63946a(i), g.mo63947b(i));
                                }
                            }
                            aVar.mo444a((C10581c) C10579b.this, new C10576b(mVar.mo63891d(), mVar.mo63889c(), mVar.mo63892e(), hashMap, mVar.mo63893f().mo63898b(), mVar.mo63888b(), mVar.mo63885a()));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
            if (aVar != null) {
                aVar.mo445a((C10581c) this, new IOException(th.getMessage()));
            }
        }
    }

    /* renamed from: a */
    public C10576b mo64172a() {
        try {
            C10479k.C10480a aVar = new C10479k.C10480a();
            C10470f.C10471a aVar2 = new C10470f.C10471a();
            Uri parse = Uri.parse(this.f26384f);
            aVar2.mo63958a(parse.getScheme());
            aVar2.mo63960b(parse.getHost());
            String encodedPath = parse.getEncodedPath();
            if (!TextUtils.isEmpty(encodedPath)) {
                if (encodedPath.startsWith("/")) {
                    encodedPath = encodedPath.substring(1);
                }
                aVar2.mo63962c(encodedPath);
            }
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames != null && queryParameterNames.size() > 0) {
                for (String next : queryParameterNames) {
                    this.f26377h.put(next, parse.getQueryParameter(next));
                }
            }
            for (Map.Entry next2 : this.f26377h.entrySet()) {
                aVar2.mo63959a(URLEncoder.encode((String) next2.getKey(), "UTF-8"), URLEncoder.encode((String) next2.getValue(), "UTF-8"));
            }
            mo64175a(aVar);
            aVar.mo63982a(this.f26376g);
            aVar.mo63985a((Object) mo64177b());
            C10483m a = this.f26381c.mo63868a(aVar.mo63983a(aVar2.mo63961b()).mo63981a().mo63989b()).mo63859a();
            if (a == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            C10469e g = a.mo63894g();
            if (g != null) {
                for (int i = 0; i < g.mo63945a(); i++) {
                    hashMap.put(g.mo63946a(i), g.mo63947b(i));
                }
            }
            return new C10576b(a.mo63891d(), a.mo63889c(), a.mo63892e(), hashMap, a.mo63893f().mo63898b(), a.mo63888b(), a.mo63885a());
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
