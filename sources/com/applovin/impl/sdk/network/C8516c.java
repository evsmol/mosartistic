package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.c */
public class C8516c<T> {

    /* renamed from: a */
    private String f21451a;

    /* renamed from: b */
    private String f21452b;

    /* renamed from: c */
    private Map<String, String> f21453c;

    /* renamed from: d */
    private Map<String, String> f21454d;

    /* renamed from: e */
    private final JSONObject f21455e;

    /* renamed from: f */
    private String f21456f;

    /* renamed from: g */
    private final T f21457g;

    /* renamed from: h */
    private final int f21458h;

    /* renamed from: i */
    private int f21459i;

    /* renamed from: j */
    private final int f21460j;

    /* renamed from: k */
    private final int f21461k;

    /* renamed from: l */
    private final boolean f21462l;

    /* renamed from: m */
    private final boolean f21463m;

    /* renamed from: n */
    private final boolean f21464n;

    /* renamed from: o */
    private final boolean f21465o;

    /* renamed from: com.applovin.impl.sdk.network.c$a */
    public static class C8517a<T> {

        /* renamed from: a */
        String f21466a;

        /* renamed from: b */
        String f21467b;

        /* renamed from: c */
        String f21468c;

        /* renamed from: d */
        Map<String, String> f21469d;

        /* renamed from: e */
        Map<String, String> f21470e;

        /* renamed from: f */
        JSONObject f21471f;

        /* renamed from: g */
        T f21472g;

        /* renamed from: h */
        int f21473h = 1;

        /* renamed from: i */
        int f21474i;

        /* renamed from: j */
        int f21475j;

        /* renamed from: k */
        boolean f21476k;

        /* renamed from: l */
        boolean f21477l;

        /* renamed from: m */
        boolean f21478m;

        /* renamed from: n */
        boolean f21479n;

        public C8517a(C8490n nVar) {
            this.f21474i = ((Integer) nVar.mo57342a(C8380b.f20825cV)).intValue();
            this.f21475j = ((Integer) nVar.mo57342a(C8380b.f20824cU)).intValue();
            this.f21477l = ((Boolean) nVar.mo57342a(C8380b.f20823cT)).booleanValue();
            this.f21478m = ((Boolean) nVar.mo57342a(C8380b.f20908eA)).booleanValue();
            this.f21479n = ((Boolean) nVar.mo57342a(C8380b.f20913eF)).booleanValue();
            this.f21469d = CollectionUtils.map();
        }

        /* renamed from: a */
        public C8517a<T> mo57526a(int i) {
            this.f21473h = i;
            return this;
        }

        /* renamed from: a */
        public C8517a<T> mo57527a(T t) {
            this.f21472g = t;
            return this;
        }

        /* renamed from: a */
        public C8517a<T> mo57528a(String str) {
            this.f21467b = str;
            return this;
        }

        /* renamed from: a */
        public C8517a<T> mo57529a(Map<String, String> map) {
            this.f21469d = map;
            return this;
        }

        /* renamed from: a */
        public C8517a<T> mo57530a(JSONObject jSONObject) {
            this.f21471f = jSONObject;
            return this;
        }

        /* renamed from: a */
        public C8517a<T> mo57531a(boolean z) {
            this.f21476k = z;
            return this;
        }

        /* renamed from: a */
        public C8516c<T> mo57532a() {
            return new C8516c<>(this);
        }

        /* renamed from: b */
        public C8517a<T> mo57533b(int i) {
            this.f21474i = i;
            return this;
        }

        /* renamed from: b */
        public C8517a<T> mo57534b(String str) {
            this.f21466a = str;
            return this;
        }

        /* renamed from: b */
        public C8517a<T> mo57535b(Map<String, String> map) {
            this.f21470e = map;
            return this;
        }

        /* renamed from: b */
        public C8517a<T> mo57536b(boolean z) {
            this.f21477l = z;
            return this;
        }

        /* renamed from: c */
        public C8517a<T> mo57537c(int i) {
            this.f21475j = i;
            return this;
        }

        /* renamed from: c */
        public C8517a<T> mo57538c(String str) {
            this.f21468c = str;
            return this;
        }

        /* renamed from: c */
        public C8517a<T> mo57539c(boolean z) {
            this.f21478m = z;
            return this;
        }

        /* renamed from: d */
        public C8517a<T> mo57540d(boolean z) {
            this.f21479n = z;
            return this;
        }
    }

    protected C8516c(C8517a<T> aVar) {
        this.f21451a = aVar.f21467b;
        this.f21452b = aVar.f21466a;
        this.f21453c = aVar.f21469d;
        this.f21454d = aVar.f21470e;
        this.f21455e = aVar.f21471f;
        this.f21456f = aVar.f21468c;
        this.f21457g = aVar.f21472g;
        this.f21458h = aVar.f21473h;
        this.f21459i = aVar.f21473h;
        this.f21460j = aVar.f21474i;
        this.f21461k = aVar.f21475j;
        this.f21462l = aVar.f21476k;
        this.f21463m = aVar.f21477l;
        this.f21464n = aVar.f21478m;
        this.f21465o = aVar.f21479n;
    }

    /* renamed from: a */
    public static <T> C8517a<T> m25763a(C8490n nVar) {
        return new C8517a<>(nVar);
    }

    /* renamed from: a */
    public String mo57505a() {
        return this.f21451a;
    }

    /* renamed from: a */
    public void mo57506a(int i) {
        this.f21459i = i;
    }

    /* renamed from: a */
    public void mo57507a(String str) {
        this.f21451a = str;
    }

    /* renamed from: b */
    public String mo57508b() {
        return this.f21452b;
    }

    /* renamed from: b */
    public void mo57509b(String str) {
        this.f21452b = str;
    }

    /* renamed from: c */
    public Map<String, String> mo57510c() {
        return this.f21453c;
    }

    /* renamed from: d */
    public Map<String, String> mo57511d() {
        return this.f21454d;
    }

    /* renamed from: e */
    public JSONObject mo57512e() {
        return this.f21455e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8516c)) {
            return false;
        }
        C8516c cVar = (C8516c) obj;
        String str = this.f21451a;
        if (str == null ? cVar.f21451a != null : !str.equals(cVar.f21451a)) {
            return false;
        }
        Map<String, String> map = this.f21453c;
        if (map == null ? cVar.f21453c != null : !map.equals(cVar.f21453c)) {
            return false;
        }
        Map<String, String> map2 = this.f21454d;
        if (map2 == null ? cVar.f21454d != null : !map2.equals(cVar.f21454d)) {
            return false;
        }
        String str2 = this.f21456f;
        if (str2 == null ? cVar.f21456f != null : !str2.equals(cVar.f21456f)) {
            return false;
        }
        String str3 = this.f21452b;
        if (str3 == null ? cVar.f21452b != null : !str3.equals(cVar.f21452b)) {
            return false;
        }
        JSONObject jSONObject = this.f21455e;
        if (jSONObject == null ? cVar.f21455e != null : !jSONObject.equals(cVar.f21455e)) {
            return false;
        }
        T t = this.f21457g;
        if (t == null ? cVar.f21457g == null : t.equals(cVar.f21457g)) {
            return this.f21458h == cVar.f21458h && this.f21459i == cVar.f21459i && this.f21460j == cVar.f21460j && this.f21461k == cVar.f21461k && this.f21462l == cVar.f21462l && this.f21463m == cVar.f21463m && this.f21464n == cVar.f21464n && this.f21465o == cVar.f21465o;
        }
        return false;
    }

    /* renamed from: f */
    public String mo57514f() {
        return this.f21456f;
    }

    /* renamed from: g */
    public T mo57515g() {
        return this.f21457g;
    }

    /* renamed from: h */
    public int mo57516h() {
        return this.f21459i;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f21451a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21456f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f21452b;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        T t = this.f21457g;
        if (t != null) {
            i = t.hashCode();
        }
        int i2 = ((((((((((((((((hashCode4 + i) * 31) + this.f21458h) * 31) + this.f21459i) * 31) + this.f21460j) * 31) + this.f21461k) * 31) + (this.f21462l ? 1 : 0)) * 31) + (this.f21463m ? 1 : 0)) * 31) + (this.f21464n ? 1 : 0)) * 31) + (this.f21465o ? 1 : 0);
        Map<String, String> map = this.f21453c;
        if (map != null) {
            i2 = (i2 * 31) + map.hashCode();
        }
        Map<String, String> map2 = this.f21454d;
        if (map2 != null) {
            i2 = (i2 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f21455e;
        if (jSONObject == null) {
            return i2;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return (i2 * 31) + new String(charArray).hashCode();
    }

    /* renamed from: i */
    public int mo57518i() {
        return this.f21458h - this.f21459i;
    }

    /* renamed from: j */
    public int mo57519j() {
        return this.f21460j;
    }

    /* renamed from: k */
    public int mo57520k() {
        return this.f21461k;
    }

    /* renamed from: l */
    public boolean mo57521l() {
        return this.f21462l;
    }

    /* renamed from: m */
    public boolean mo57522m() {
        return this.f21463m;
    }

    /* renamed from: n */
    public boolean mo57523n() {
        return this.f21464n;
    }

    /* renamed from: o */
    public boolean mo57524o() {
        return this.f21465o;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f21451a + ", backupEndpoint=" + this.f21456f + ", httpMethod=" + this.f21452b + ", httpHeaders=" + this.f21454d + ", body=" + this.f21455e + ", emptyResponse=" + this.f21457g + ", initialRetryAttempts=" + this.f21458h + ", retryAttemptsLeft=" + this.f21459i + ", timeoutMillis=" + this.f21460j + ", retryDelayMillis=" + this.f21461k + ", exponentialRetries=" + this.f21462l + ", retryOnAllErrors=" + this.f21463m + ", encodingEnabled=" + this.f21464n + ", gzipBodyEncoding=" + this.f21465o + '}';
    }
}
