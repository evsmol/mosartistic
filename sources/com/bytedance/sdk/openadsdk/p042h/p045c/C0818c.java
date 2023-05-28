package com.bytedance.sdk.openadsdk.p042h.p045c;

import android.text.TextUtils;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p025i.C0515e;
import com.bytedance.sdk.openadsdk.p000b.C0147k;
import com.bytedance.sdk.openadsdk.p042h.C0793a;
import com.bytedance.sdk.openadsdk.utils.C0984l;
import com.bytedance.sdk.openadsdk.utils.C0995t;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.h.c.c */
/* compiled from: LogUploaderImpl */
public class C0818c implements C0816a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0817b f3018a = C0817b.m4026a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<C0821a> f3019b = Collections.synchronizedList(new LinkedList());

    /* renamed from: c */
    private final ExecutorService f3020c = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    public void mo2621a() {
        this.f3020c.execute(new Runnable() {
            public void run() {
                List<C0821a> d = C0818c.this.f3018a.mo2627d();
                if (d != null) {
                    C0818c.this.f3019b.addAll(d);
                }
                C0818c.this.f3018a.mo2626c();
            }
        });
    }

    /* renamed from: a */
    public void mo2622a(C0793a aVar) {
        mo2623a(aVar, false);
    }

    /* renamed from: a */
    public void mo2623a(final C0793a aVar, final boolean z) {
        if (aVar != null && C0515e.m2397a()) {
            C0995t.m4609b(new C10618g("uploadLogEvent") {
                public void run() {
                    try {
                        C0821a aVar = new C0821a(C0984l.m4553a(), aVar.mo322a().mo2576a());
                        if (z) {
                            C0558m.m2670e().mo394a(aVar);
                        } else {
                            C0558m.m2669d().mo394a(aVar);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo2624b() {
        ExecutorService executorService = this.f3020c;
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.h.c.c$a */
    /* compiled from: LogUploaderImpl */
    public static class C0821a implements C0147k {

        /* renamed from: a */
        public final String f3025a;

        /* renamed from: b */
        public final JSONObject f3026b;

        /* renamed from: e */
        public boolean mo309e() {
            return false;
        }

        public C0821a(String str, JSONObject jSONObject) {
            this.f3025a = str;
            this.f3026b = jSONObject;
        }

        /* renamed from: a */
        public static C0821a m4037a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("localId", (String) null);
                JSONObject optJSONObject = jSONObject.optJSONObject("event");
                if (!TextUtils.isEmpty(optString) && optJSONObject != null) {
                    return new C0821a(optString, optJSONObject);
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        /* renamed from: a */
        public String mo2630a() {
            if (TextUtils.isEmpty(this.f3025a) || this.f3026b == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("localId", this.f3025a);
                jSONObject.put("event", this.f3026b);
            } catch (Throwable unused) {
            }
            return jSONObject.toString();
        }

        /* renamed from: d */
        public String mo308d() {
            return this.f3025a;
        }
    }

    /* renamed from: c */
    public static C0816a m4032c() {
        return C0825e.m4047c();
    }
}
