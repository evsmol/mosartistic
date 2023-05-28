package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.C10705b;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;

/* renamed from: com.yandex.metrica.impl.ob.Eg */
public class C1992Eg {

    /* renamed from: a */
    private String f5324a;

    /* renamed from: b */
    private C2575U f5325b;

    /* renamed from: c */
    private C2854c2 f5326c;

    /* renamed from: d */
    private final String f5327d = m7102y();

    /* renamed from: e */
    private String f5328e = C3015h2.m9657a();

    /* renamed from: f */
    private String f5329f;

    /* renamed from: g */
    private String f5330g;

    /* renamed from: h */
    private C1861Ab f5331h;

    /* renamed from: i */
    private C3729zb f5332i;

    /* renamed from: j */
    private String f5333j;

    /* renamed from: k */
    private String f5334k;

    /* renamed from: l */
    private C3356pi f5335l;

    /* renamed from: com.yandex.metrica.impl.ob.Eg$a */
    public static abstract class C1993a<I, O> implements C1959Dg<I, O> {

        /* renamed from: a */
        public final String f5336a;

        /* renamed from: b */
        public final String f5337b;

        /* renamed from: c */
        public final String f5338c;

        public C1993a(String str, String str2, String str3) {
            this.f5336a = str;
            this.f5337b = str2;
            this.f5338c = str3;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Eg$b */
    protected static abstract class C1994b<T extends C1992Eg, A extends C1993a> implements C1996d<T, C1995c<A>> {

        /* renamed from: a */
        final Context f5339a;

        /* renamed from: b */
        final String f5340b;

        protected C1994b(Context context, String str) {
            this.f5339a = context;
            this.f5340b = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo15617a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.Eg$c */
    public static class C1995c<A> {

        /* renamed from: a */
        public final C3356pi f5341a;

        /* renamed from: b */
        public final A f5342b;

        public C1995c(C3356pi piVar, A a) {
            this.f5341a = piVar;
            this.f5342b = a;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Eg$d */
    public interface C1996d<T extends C1992Eg, D> {
        /* renamed from: a */
        T mo15618a(D d);
    }

    /* renamed from: y */
    private static String m7102y() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty("public")) {
            sb.append("public");
        }
        if (!TextUtils.isEmpty("binary")) {
            sb.append("_binary");
        }
        if (!TextUtils.isEmpty("")) {
            sb.append("_");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15691a(C2575U u) {
        this.f5325b = u;
    }

    /* renamed from: b */
    public String mo15696b() {
        String str = this.f5330g;
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public String mo15698c() {
        return this.f5328e;
    }

    /* renamed from: d */
    public synchronized String mo15700d() {
        String a;
        C1861Ab ab = this.f5331h;
        a = ab == null ? null : ab.mo15453a();
        if (a == null) {
            a = "";
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo15703e(String str) {
        this.f5324a = str;
    }

    /* renamed from: f */
    public String mo15704f() {
        String str = this.f5329f;
        return str == null ? "" : str;
    }

    /* renamed from: g */
    public synchronized String mo15705g() {
        String i;
        i = this.f5335l.mo17977i();
        if (i == null) {
            i = "";
        }
        return i;
    }

    /* renamed from: h */
    public String mo15706h() {
        return this.f5325b.f6835e;
    }

    /* renamed from: i */
    public String mo15707i() {
        String str = this.f5333j;
        return str == null ? C10705b.PHONE.mo64728a() : str;
    }

    /* renamed from: j */
    public String mo15708j() {
        return this.f5327d;
    }

    /* renamed from: k */
    public String mo15709k() {
        String str = this.f5334k;
        return str == null ? "" : str;
    }

    /* renamed from: l */
    public String mo15710l() {
        String str = this.f5325b.f6831a;
        return str == null ? "" : str;
    }

    /* renamed from: m */
    public String mo15711m() {
        return this.f5325b.f6832b;
    }

    /* renamed from: n */
    public int mo15712n() {
        return this.f5325b.f6834d;
    }

    /* renamed from: o */
    public String mo15713o() {
        return this.f5325b.f6833c;
    }

    /* renamed from: p */
    public String mo15714p() {
        return this.f5324a;
    }

    /* renamed from: q */
    public RetryPolicyConfig mo15715q() {
        return this.f5335l.mo17956J();
    }

    /* renamed from: r */
    public float mo15716r() {
        return this.f5326c.mo17358d();
    }

    /* renamed from: s */
    public int mo15717s() {
        return this.f5326c.mo17356b();
    }

    /* renamed from: t */
    public int mo15718t() {
        return this.f5326c.mo17357c();
    }

    public String toString() {
        return "BaseRequestConfig{mPackageName='" + this.f5324a + '\'' + ", mConstantDeviceInfo=" + this.f5325b + ", screenInfo=" + this.f5326c + ", mSdkVersionName='" + "5.3.0" + '\'' + ", mSdkBuildNumber='" + "45003240" + '\'' + ", mSdkBuildType='" + this.f5327d + '\'' + ", mAppPlatform='" + "android" + '\'' + ", mProtocolVersion='" + "2" + '\'' + ", mAppFramework='" + this.f5328e + '\'' + ", mCommitHash='" + "a72bf6f57701ed3c2b8ed570054febbff4e58c12" + '\'' + ", mAppVersion='" + this.f5329f + '\'' + ", mAppBuildNumber='" + this.f5330g + '\'' + ", appSetId=" + this.f5331h + ", mAdvertisingIdsHolder=" + this.f5332i + ", mDeviceType='" + this.f5333j + '\'' + ", mLocale='" + this.f5334k + '\'' + ", mStartupState=" + this.f5335l + '}';
    }

    /* renamed from: u */
    public int mo15719u() {
        return this.f5326c.mo17359e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C3356pi mo15720v() {
        return this.f5335l;
    }

    /* renamed from: w */
    public synchronized String mo15721w() {
        String V;
        V = this.f5335l.mo17968V();
        if (V == null) {
            V = "";
        }
        return V;
    }

    /* renamed from: x */
    public synchronized boolean mo15722x() {
        return C3289ni.m10179a(this.f5335l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15692a(C2854c2 c2Var) {
        this.f5326c = c2Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15697b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f5329f = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo15699c(String str) {
        this.f5333j = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo15701d(String str) {
        this.f5334k = str;
    }

    /* renamed from: e */
    public synchronized String mo15702e() {
        String a;
        C1861Ab ab = this.f5331h;
        a = ab == null ? null : ab.mo15454b().mo64727a();
        if (a == null) {
            a = "";
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15693a(C3356pi piVar) {
        this.f5335l = piVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15695a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f5330g = str;
        }
    }

    /* renamed from: a */
    public synchronized void mo15690a(C1861Ab ab) {
        this.f5331h = ab;
    }

    /* renamed from: a */
    public C3729zb mo15689a() {
        return this.f5332i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15694a(C3729zb zbVar) {
        this.f5332i = zbVar;
    }
}
