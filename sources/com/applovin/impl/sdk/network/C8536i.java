package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.network.C8516c;
import com.applovin.impl.sdk.p254c.C8380b;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.i */
public class C8536i<T> extends C8516c {

    /* renamed from: a */
    private String f21555a;

    /* renamed from: b */
    private boolean f21556b;

    /* renamed from: com.applovin.impl.sdk.network.i$a */
    public static class C8537a<T> extends C8516c.C8517a<T> {
        /* access modifiers changed from: private */

        /* renamed from: o */
        public String f21557o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public boolean f21558p;

        public C8537a(C8490n nVar) {
            super(nVar);
            this.f21473h = ((Integer) nVar.mo57342a(C8380b.f20819cP)).intValue();
            this.f21474i = ((Integer) nVar.mo57342a(C8380b.f20818cO)).intValue();
            this.f21475j = ((Integer) nVar.mo57342a(C8380b.f20824cU)).intValue();
        }

        /* renamed from: b */
        public C8537a mo57527a(T t) {
            this.f21472g = t;
            return this;
        }

        /* renamed from: b */
        public C8537a mo57530a(JSONObject jSONObject) {
            this.f21471f = jSONObject;
            return this;
        }

        /* renamed from: b */
        public C8536i<T> mo57532a() {
            return new C8536i<>(this);
        }

        /* renamed from: c */
        public C8537a mo57529a(Map<String, String> map) {
            this.f21469d = map;
            return this;
        }

        /* renamed from: d */
        public C8537a mo57526a(int i) {
            this.f21473h = i;
            return this;
        }

        /* renamed from: d */
        public C8537a mo57528a(String str) {
            this.f21467b = str;
            return this;
        }

        /* renamed from: d */
        public C8537a mo57535b(Map<String, String> map) {
            this.f21470e = map;
            return this;
        }

        /* renamed from: e */
        public C8537a mo57533b(int i) {
            this.f21474i = i;
            return this;
        }

        /* renamed from: e */
        public C8537a mo57538c(String str) {
            this.f21468c = str;
            return this;
        }

        /* renamed from: e */
        public C8537a mo57539c(boolean z) {
            this.f21478m = z;
            return this;
        }

        /* renamed from: f */
        public C8537a mo57537c(int i) {
            this.f21475j = i;
            return this;
        }

        /* renamed from: f */
        public C8537a mo57534b(String str) {
            this.f21466a = str;
            return this;
        }

        /* renamed from: f */
        public C8537a mo57540d(boolean z) {
            this.f21479n = z;
            return this;
        }

        /* renamed from: g */
        public C8537a mo57622g(String str) {
            this.f21557o = str;
            return this;
        }

        /* renamed from: g */
        public C8537a mo57623g(boolean z) {
            this.f21558p = z;
            return this;
        }
    }

    protected C8536i(C8537a aVar) {
        super(aVar);
        this.f21555a = aVar.f21557o;
        this.f21556b = aVar.f21558p;
    }

    /* renamed from: b */
    public static C8537a m25907b(C8490n nVar) {
        return new C8537a(nVar);
    }

    /* renamed from: p */
    public boolean mo57606p() {
        return this.f21555a != null;
    }

    /* renamed from: q */
    public String mo57607q() {
        return this.f21555a;
    }

    /* renamed from: r */
    public boolean mo57608r() {
        return this.f21556b;
    }
}
