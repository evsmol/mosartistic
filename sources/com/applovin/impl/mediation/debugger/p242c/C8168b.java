package com.applovin.impl.mediation.debugger.p242c;

import android.text.TextUtils;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8516c;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8449u;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.applovin.impl.mediation.debugger.c.b */
public class C8168b extends C8401a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8170a f19970a;

    /* renamed from: com.applovin.impl.mediation.debugger.c.b$a */
    public interface C8170a {
        /* renamed from: a */
        void mo56301a(String str);

        /* renamed from: b */
        void mo56302b();
    }

    public C8168b(C8490n nVar, C8170a aVar) {
        super("TaskFetchDeveloperUri", nVar);
        this.f19970a = aVar;
    }

    public void run() {
        String valueOf = String.valueOf(this.f21118b.mo57340Y().mo57633h().get("package_name"));
        C8516c.C8517a b = C8516c.m25763a(this.f21118b).mo57534b("GET");
        this.f21118b.mo57337V().mo57227a((C8401a) new C8449u<String>(b.mo57528a("https://play.google.com/store/apps/details?id=" + valueOf).mo57527a("").mo57539c(false).mo57532a(), this.f21118b) {
            /* renamed from: a */
            public void mo56275a(int i, String str, String str2) {
                this.f21118b.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D = this.f21118b.mo57320D();
                    D.mo57822e("TaskFetchDeveloperUri", "Unable to fetch developer url due to: " + str + ", and received error code: " + i);
                }
                C8168b.this.f19970a.mo56302b();
            }

            /* renamed from: a */
            public void mo56277a(String str, int i) {
                if (TextUtils.isEmpty(str)) {
                    C8168b.this.f19970a.mo56302b();
                    return;
                }
                Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").+?(?=\">)").matcher(str);
                if (matcher.find()) {
                    C8168b.this.f19970a.mo56301a(matcher.group());
                    return;
                }
                C8168b.this.f19970a.mo56302b();
            }
        });
    }
}
