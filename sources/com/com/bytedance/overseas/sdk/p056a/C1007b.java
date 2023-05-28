package com.com.bytedance.overseas.sdk.p056a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0747y;
import com.bytedance.sdk.openadsdk.core.p021e.C0451c;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p000b.C0156p;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.com.bytedance.overseas.sdk.a.b */
/* compiled from: GPDownLoader */
public class C1007b implements C1008c {

    /* renamed from: a */
    protected C0451c f3357a;

    /* renamed from: b */
    protected C0477n f3358b;

    /* renamed from: c */
    protected String f3359c;

    /* renamed from: d */
    protected boolean f3360d = false;

    /* renamed from: e */
    protected final AtomicBoolean f3361e = new AtomicBoolean(false);

    /* renamed from: f */
    private WeakReference<Context> f3362f;

    /* renamed from: g */
    private boolean f3363g = false;

    public C1007b(Context context, C0477n nVar, String str) {
        this.f3362f = new WeakReference<>(context);
        this.f3358b = nVar;
        this.f3357a = nVar.mo1380aa();
        this.f3359c = str;
        C10638l.m31238c("GPDownLoader", "====tag===" + str);
        if (C0558m.m2663a() == null) {
            C0558m.m2665a(context);
        }
    }

    /* renamed from: a */
    public void mo2927a(boolean z) {
        this.f3363g = z;
    }

    /* renamed from: a */
    public boolean mo2928a(Context context, String str) {
        return m4764b(context, str);
    }

    /* renamed from: b */
    public static boolean m4764b(Context context, String str) {
        Intent launchIntentForPackage;
        if (!(context == null || str == null || TextUtils.isEmpty(str))) {
            C10638l.m31238c("GPDownLoader", "gotoGooglePlay :market://details?id=" + str);
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri parse = Uri.parse("market://details?id=" + str);
            intent.setData(parse);
            for (ResolveInfo next : context.getPackageManager().queryIntentActivities(intent, 65536)) {
                if (next.activityInfo.packageName.equals("com.android.vending") && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.android.vending")) != null) {
                    launchIntentForPackage.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                    launchIntentForPackage.setData(parse);
                    if (!(context instanceof Activity)) {
                        launchIntentForPackage.setFlags(268435456);
                    }
                    context.startActivity(launchIntentForPackage);
                    return true;
                }
            }
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str));
                intent2.setFlags(268435456);
                context.startActivity(intent2);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Context mo2929c() {
        WeakReference<Context> weakReference = this.f3362f;
        return (weakReference == null || weakReference.get() == null) ? C0558m.m2663a() : (Context) this.f3362f.get();
    }

    /* renamed from: d */
    public void mo2930d() {
        if (mo2929c() != null) {
            if (mo2926b()) {
                this.f3361e.set(true);
            } else if (!mo2925a() && !mo2931e() && this.f3358b.mo1380aa() == null && this.f3358b.mo1335O() != null) {
                C0747y.m3813a(mo2929c(), this.f3358b.mo1335O(), this.f3358b, C0996u.m4610a(this.f3359c), this.f3359c, true);
            }
        }
    }

    /* renamed from: b */
    public boolean mo2926b() {
        if (this.f3358b.mo1381ab() == null) {
            return false;
        }
        String a = this.f3358b.mo1381ab().mo1256a();
        if (!TextUtils.isEmpty(a)) {
            Uri parse = Uri.parse(a);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            if (C0996u.m4628a(mo2929c(), intent)) {
                if (!(mo2929c() instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                try {
                    C0136e.m627d(C0558m.m2663a(), this.f3358b, this.f3359c, "open_url_app", (Map<String, Object>) null);
                    mo2929c().startActivity(intent);
                    C0156p.m729a().mo450a(this.f3358b, this.f3359c);
                    return true;
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        if (this.f3360d && !this.f3361e.get()) {
            return false;
        }
        this.f3360d = true;
        C0136e.m627d(mo2929c(), this.f3358b, this.f3359c, "open_fallback_url", (Map<String, Object>) null);
        return false;
    }

    /* renamed from: e */
    public boolean mo2931e() {
        this.f3361e.set(true);
        if (this.f3357a == null || !mo2928a(mo2929c(), this.f3357a.mo1220c())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo2925a() {
        Intent a;
        if (this.f3357a == null) {
            return false;
        }
        C0477n nVar = this.f3358b;
        if (nVar != null && nVar.mo1398as() == 0) {
            return false;
        }
        String c = this.f3357a.mo1220c();
        if (TextUtils.isEmpty(c) || !C0996u.m4636b(mo2929c(), c) || (a = C0996u.m4613a(mo2929c(), c)) == null) {
            return false;
        }
        a.putExtra("START_ONLY_FOR_ANDROID", true);
        try {
            mo2929c().startActivity(a);
            C0136e.m627d(mo2929c(), this.f3358b, this.f3359c, "click_open", (Map<String, Object>) null);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
