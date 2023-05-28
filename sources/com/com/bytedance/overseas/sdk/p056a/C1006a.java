package com.com.bytedance.overseas.sdk.p056a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p000b.C0156p;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.util.Map;

/* renamed from: com.com.bytedance.overseas.sdk.a.a */
/* compiled from: AndroidRGPDownLoader */
class C1006a extends C1007b {
    public C1006a(Context context, C0477n nVar, String str) {
        super(context, nVar, str);
    }

    /* renamed from: a */
    public boolean mo2925a() {
        Intent a;
        if ((this.f3358b != null && this.f3358b.mo1398as() == 0) || this.f3357a == null) {
            return false;
        }
        try {
            String c = this.f3357a.mo1220c();
            if (TextUtils.isEmpty(c) || (a = C0996u.m4613a(mo2929c(), c)) == null) {
                return false;
            }
            a.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(mo2929c() instanceof Activity)) {
                a.addFlags(268435456);
            }
            mo2929c().startActivity(a);
            C0136e.m627d(mo2929c(), this.f3358b, this.f3359c, "click_open", (Map<String, Object>) null);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo2926b() {
        if (this.f3358b.mo1381ab() == null) {
            return false;
        }
        try {
            String a = this.f3358b.mo1381ab().mo1256a();
            if (!TextUtils.isEmpty(a)) {
                Uri parse = Uri.parse(a);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                if (!(mo2929c() instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                C0136e.m627d(C0558m.m2663a(), this.f3358b, this.f3359c, "open_url_app", (Map<String, Object>) null);
                mo2929c().startActivity(intent);
                C0156p.m729a().mo450a(this.f3358b, this.f3359c);
                return true;
            }
        } catch (Throwable unused) {
        }
        if (this.f3360d && !this.f3361e.get()) {
            return false;
        }
        this.f3360d = true;
        C0136e.m627d(mo2929c(), this.f3358b, this.f3359c, "open_fallback_url", (Map<String, Object>) null);
        return false;
    }
}
