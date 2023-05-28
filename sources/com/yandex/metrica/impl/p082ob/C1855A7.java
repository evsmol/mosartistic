package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p081ac.CrashpadHelper;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.A7 */
public class C1855A7 implements C3119k7 {

    /* renamed from: a */
    private final Context f5027a;

    /* renamed from: b */
    private final C1850A3 f5028b;

    /* renamed from: c */
    private C3687y7 f5029c;

    /* renamed from: d */
    private final C3240mm<Bundle> f5030d;

    /* renamed from: e */
    private final C1980E7 f5031e;

    /* renamed from: f */
    private final C2112I7 f5032f;

    /* renamed from: g */
    private final C3293nm<Void, String> f5033g;

    /* renamed from: com.yandex.metrica.impl.ob.A7$a */
    class C1856a implements C3240mm<Bundle> {
        C1856a() {
        }

        /* renamed from: b */
        public void mo15447b(Object obj) {
            CrashpadHelper.setUpNativeUncaughtExceptionHandler((Bundle) obj);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.A7$b */
    class C1857b implements C3293nm<Void, String> {
        C1857b() {
        }

        /* renamed from: a */
        public Object mo15448a(Object obj) {
            Void voidR = (Void) obj;
            return CrashpadHelper.getLibraryVersion();
        }
    }

    public C1855A7(Context context, C1850A3 a3) {
        this(context, a3, new C1877B0(), new C1856a());
    }

    /* renamed from: a */
    public String mo15441a() {
        return "appmetrica_native_crashes";
    }

    /* renamed from: a */
    public void mo15443a(String str, String str2, String str3) {
        C1916C7 b = this.f5029c.mo18417b();
        if (b == null) {
            return;
        }
        if (!TextUtils.isEmpty(b.f5161a) || b.f5164d != null) {
            this.f5032f.mo15887a(str3);
            String str4 = null;
            this.f5032f.mo15888b(this.f5033g.mo15448a(null));
            C3240mm<Bundle> mmVar = this.f5030d;
            String a = this.f5032f.mo15886a();
            Bundle bundle = new Bundle();
            C1980E7 e7 = this.f5031e;
            C1850A3 a3 = this.f5028b;
            e7.getClass();
            try {
                str4 = Base64.encodeToString(new JSONObject().put("arg_cd", new JSONObject().put("arg_ak", str).put("arg_pn", a3.mo15430f()).put("arg_pd", a3.mo15431g()).put("arg_ps", a3.mo15432h()).put("arg_rt", CounterConfiguration.C10685b.MAIN.mo64636a())).toString().getBytes(), 0);
            } catch (Throwable unused) {
            }
            bundle.putString("arg_cd", str4);
            bundle.putString("arg_rc", a);
            bundle.putString("arg_dd", str2);
            bundle.putString("arg_hp", b.f5161a);
            bundle.putBoolean("arg_i64", b.f5162b);
            bundle.putBoolean("arg_ul", b.f5163c);
            Context context = this.f5027a;
            bundle.putString("arg_sn", context.getPackageName() + "-crashpad_new_crash_socket");
            if (b.f5164d == null) {
                bundle.putBoolean("arg_ap", false);
            } else {
                bundle.putBoolean("arg_ap", true);
                Objects.requireNonNull(b.f5164d);
                bundle.putString("arg_mc", "com.yandex.metrica.impl.ac.HandlerRunner");
                bundle.putString("arg_akp", b.f5164d.f8559a);
                bundle.putString("arg_lp", b.f5164d.f8560b);
                bundle.putString("arg_dp", b.f5164d.f8561c);
            }
            mmVar.mo15447b(bundle);
        }
    }

    /* renamed from: b */
    public void mo15445b() {
        CrashpadHelper.cancelSetUpNativeUncaughtExceptionHandler();
    }

    /* renamed from: c */
    public String mo15446c() {
        return "appmetrica-native";
    }

    private C1855A7(Context context, C1850A3 a3, C1877B0 b0, C3240mm<Bundle> mmVar) {
        this(context, a3, new C3687y7(context, b0, C2410P.m8089g().mo16431d().mo15961b()), mmVar, new C1980E7(), new C2112I7(), new C1857b());
    }

    C1855A7(Context context, C1850A3 a3, C3687y7 y7Var, C3240mm<Bundle> mmVar, C1980E7 e7, C2112I7 i7, C3293nm<Void, String> nmVar) {
        this.f5027a = context;
        this.f5028b = a3;
        this.f5029c = y7Var;
        this.f5030d = mmVar;
        this.f5031e = e7;
        this.f5032f = i7;
        this.f5033g = nmVar;
    }

    /* renamed from: a */
    public void mo15444a(boolean z) {
        CrashpadHelper.logsEnabled(z);
    }

    /* renamed from: a */
    public void mo15442a(String str) {
        this.f5032f.mo15887a(str);
        CrashpadHelper.updateRuntimeConfig(this.f5032f.mo15886a());
    }
}
