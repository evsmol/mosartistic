package com.yandex.metrica.impl.p082ob;

import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ud */
public class C2600Ud implements C3462s0<C2601a, C2923ee> {

    /* renamed from: a */
    public final C2923ee f6881a;

    /* renamed from: b */
    public final List<C2601a> f6882b;

    /* renamed from: com.yandex.metrica.impl.ob.Ud$a */
    public static class C2601a {

        /* renamed from: a */
        public final String f6883a;

        /* renamed from: b */
        public final JSONObject f6884b;

        /* renamed from: c */
        public final C3522u0 f6885c;

        public C2601a(String str, JSONObject jSONObject, C3522u0 u0Var) {
            this.f6883a = str;
            this.f6884b = jSONObject;
            this.f6885c = u0Var;
        }

        public String toString() {
            return "Candidate{trackingId='" + this.f6883a + '\'' + ", additionalParams=" + this.f6884b + ", source=" + this.f6885c + '}';
        }
    }

    public C2600Ud(C2923ee eeVar, List<C2601a> list) {
        this.f6881a = eeVar;
        this.f6882b = list;
    }

    /* renamed from: a */
    public List<C2601a> mo16767a() {
        return this.f6882b;
    }

    /* renamed from: b */
    public Object mo16768b() {
        return this.f6881a;
    }

    public String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f6881a + ", candidates=" + this.f6882b + '}';
    }
}
