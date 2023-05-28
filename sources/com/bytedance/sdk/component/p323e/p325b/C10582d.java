package com.bytedance.sdk.component.p323e.p325b;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.p307b.p308a.C10457b;
import com.bytedance.sdk.component.p307b.p308a.C10467c;
import com.bytedance.sdk.component.p307b.p308a.C10469e;
import com.bytedance.sdk.component.p307b.p308a.C10475h;
import com.bytedance.sdk.component.p307b.p308a.C10476i;
import com.bytedance.sdk.component.p307b.p308a.C10479k;
import com.bytedance.sdk.component.p307b.p308a.C10482l;
import com.bytedance.sdk.component.p307b.p308a.C10483m;
import com.bytedance.sdk.component.p323e.C10576b;
import com.bytedance.sdk.component.p323e.p324a.C10575a;
import com.bytedance.sdk.component.p323e.p327d.C10602d;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.e.b.d */
/* compiled from: PostExecutor */
public class C10582d extends C10581c {

    /* renamed from: a */
    C10482l f26385a = null;

    public C10582d(C10476i iVar) {
        super(iVar);
    }

    /* renamed from: c */
    public void mo64186c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = JsonUtils.EMPTY_JSON;
        }
        this.f26385a = C10482l.m30615a(C10475h.m30581a("application/json; charset=utf-8"), str);
    }

    /* renamed from: a */
    public void mo64185a(JSONObject jSONObject) {
        this.f26385a = C10482l.m30615a(C10475h.m30581a("application/json; charset=utf-8"), jSONObject != null ? jSONObject.toString() : JsonUtils.EMPTY_JSON);
    }

    /* renamed from: a */
    public void mo64184a(final C10575a aVar) {
        try {
            C10479k.C10480a aVar2 = new C10479k.C10480a();
            if (TextUtils.isEmpty(this.f26384f)) {
                aVar.mo445a((C10581c) this, new IOException("Url is Empty"));
                return;
            }
            aVar2.mo63986a(this.f26384f);
            if (this.f26385a != null) {
                mo64175a(aVar2);
                aVar2.mo63985a((Object) mo64177b());
                this.f26381c.mo63868a(aVar2.mo63984a(this.f26385a).mo63989b()).mo63861a(new C10467c() {
                    /* renamed from: a */
                    public void mo62658a(C10457b bVar, IOException iOException) {
                        C10575a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo445a((C10581c) C10582d.this, iOException);
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
                                aVar.mo444a((C10581c) C10582d.this, new C10576b(mVar.mo63891d(), mVar.mo63889c(), mVar.mo63892e(), hashMap, mVar.mo63893f().mo63898b(), mVar.mo63888b(), mVar.mo63885a()));
                            }
                        }
                    }
                });
            } else if (aVar != null) {
                aVar.mo445a((C10581c) this, new IOException("RequestBody is null, content type is not support!!"));
            }
        } catch (Throwable th) {
            th.printStackTrace();
            aVar.mo445a((C10581c) this, new IOException(th.getMessage()));
        }
    }

    /* renamed from: a */
    public C10576b mo64183a() {
        try {
            C10479k.C10480a aVar = new C10479k.C10480a();
            if (TextUtils.isEmpty(this.f26384f)) {
                C10602d.m31128b("PostExecutor", "execute: Url is Empty");
                return null;
            }
            aVar.mo63986a(this.f26384f);
            if (this.f26385a == null) {
                C10602d.m31128b("PostExecutor", "RequestBody is null, content type is not support!!");
                return null;
            }
            mo64175a(aVar);
            aVar.mo63985a((Object) mo64177b());
            C10483m a = this.f26381c.mo63868a(aVar.mo63984a(this.f26385a).mo63989b()).mo63859a();
            if (a != null) {
                HashMap hashMap = new HashMap();
                C10469e g = a.mo63894g();
                if (g != null) {
                    for (int i = 0; i < g.mo63945a(); i++) {
                        hashMap.put(g.mo63946a(i), g.mo63947b(i));
                    }
                    return new C10576b(a.mo63891d(), a.mo63889c(), a.mo63892e(), hashMap, a.mo63893f().mo63898b(), a.mo63888b(), a.mo63885a());
                }
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
