package com.criteo.publisher.p070l0;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.p070l0.p071d.C1177c;
import com.criteo.publisher.p070l0.p071d.C1178d;
import com.criteo.publisher.p074n0.C1313q;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.criteo.publisher.l0.c */
/* compiled from: UserPrivacyUtil */
public class C1173c {

    /* renamed from: e */
    private static final Pattern f3712e = Pattern.compile("^1([YN\\-yn]){3}$");

    /* renamed from: f */
    private static final List<String> f3713f = Arrays.asList(new String[]{"1ynn", "1yny", "1---", "", "1yn-", "1-n-"});

    /* renamed from: g */
    private static final List<String> f3714g = Arrays.asList(new String[]{"explicit_no", "potential_whitelist", "dnt"});

    /* renamed from: a */
    private final C1195g f3715a;

    /* renamed from: b */
    private final C1313q f3716b;

    /* renamed from: c */
    private final SharedPreferences f3717c;

    /* renamed from: d */
    private final C1178d f3718d;

    public C1173c(Context context) {
        this(PreferenceManager.getDefaultSharedPreferences(context), new C1178d(context));
    }

    C1173c(SharedPreferences sharedPreferences, C1178d dVar) {
        this.f3715a = C1197h.m5407b(getClass());
        this.f3717c = sharedPreferences;
        this.f3716b = new C1313q(sharedPreferences);
        this.f3718d = dVar;
    }

    /* renamed from: b */
    public C1177c mo3281b() {
        return this.f3718d.mo3296a();
    }

    /* renamed from: a */
    public String mo3278a() {
        C1177c a = this.f3718d.mo3296a();
        if (a == null) {
            return null;
        }
        return a.mo3287a();
    }

    /* renamed from: c */
    public String mo3282c() {
        return this.f3716b.mo3662a("IABUSPrivacy_String", "");
    }

    /* renamed from: a */
    public void mo3280a(boolean z) {
        SharedPreferences.Editor edit = this.f3717c.edit();
        edit.putString("USPrivacy_Optout", String.valueOf(z));
        edit.apply();
        this.f3715a.mo3337a(C1172b.m5340a(z));
    }

    /* renamed from: e */
    public String mo3284e() {
        return this.f3716b.mo3662a("USPrivacy_Optout", "");
    }

    /* renamed from: g */
    public boolean mo3285g() {
        if (mo3282c().isEmpty()) {
            return m5341f();
        }
        return m5342h();
    }

    /* renamed from: f */
    private boolean m5341f() {
        return !Boolean.parseBoolean(mo3284e());
    }

    /* renamed from: h */
    private boolean m5342h() {
        String c = mo3282c();
        return !f3712e.matcher(c).matches() || f3713f.contains(c.toLowerCase(Locale.ROOT));
    }

    /* renamed from: i */
    public boolean mo3286i() {
        return !f3714g.contains(mo3283d().toLowerCase(Locale.ROOT));
    }

    /* renamed from: a */
    public void mo3279a(String str) {
        SharedPreferences.Editor edit = this.f3717c.edit();
        edit.putString("MoPubConsent_String", str);
        edit.apply();
        this.f3715a.mo3337a(C1172b.m5339a(str));
    }

    /* renamed from: d */
    public String mo3283d() {
        return this.f3716b.mo3662a("MoPubConsent_String", "");
    }
}
