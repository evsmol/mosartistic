package com.applovin.impl.mediation.debugger.p242c;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8516c;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8449u;

/* renamed from: com.applovin.impl.mediation.debugger.c.a */
public class C8165a extends C8401a {

    /* renamed from: a */
    private final String f19967a;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C8167a f19968e;

    /* renamed from: com.applovin.impl.mediation.debugger.c.a$a */
    public interface C8167a {
        /* renamed from: b */
        void mo56303b(String str);

        /* renamed from: c */
        void mo56304c();
    }

    public C8165a(C8490n nVar, String str, C8167a aVar) {
        super("TaskFetchAppAdsContent", nVar);
        this.f19967a = str;
        this.f19968e = aVar;
    }

    public void run() {
        this.f21118b.mo57337V().mo57227a((C8401a) new C8449u<String>(C8516c.m25763a(this.f21118b).mo57534b("GET").mo57528a(Uri.parse(this.f19967a).buildUpon().scheme("https").appendPath("app-ads.txt").build().toString()).mo57538c(Uri.parse(this.f19967a).buildUpon().scheme("http").appendPath("app-ads.txt").build().toString()).mo57527a("").mo57539c(false).mo57532a(), this.f21118b) {
            /* renamed from: a */
            public void mo56275a(int i, String str, String str2) {
                this.f21118b.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D = this.f21118b.mo57320D();
                    D.mo57822e("TaskFetchAppAdsContent", "Unable to fetch app-ads.txt due to: " + str + ", and received error code: " + i);
                }
                C8165a.this.f19968e.mo56304c();
            }

            /* renamed from: a */
            public void mo56277a(String str, int i) {
                if (TextUtils.isEmpty(str)) {
                    C8165a.this.f19968e.mo56304c();
                } else {
                    C8165a.this.f19968e.mo56303b(str);
                }
            }
        });
    }
}
