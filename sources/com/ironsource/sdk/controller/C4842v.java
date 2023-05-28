package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.environment.C4377a;
import com.ironsource.environment.p125f.C4405b;
import com.ironsource.sdk.service.C4979c;
import com.ironsource.sdk.service.C4980d;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.v */
public class C4842v {

    /* renamed from: a */
    static final String f12344a = C4842v.class.getSimpleName();

    /* renamed from: b */
    C4980d f12345b;

    /* renamed from: c */
    C4979c f12346c;

    /* renamed from: d */
    Context f12347d;

    /* renamed from: e */
    private final String f12348e = "oneToken";

    /* renamed from: f */
    private C4405b f12349f;

    /* renamed from: com.ironsource.sdk.controller.v$a */
    static class C4843a {

        /* renamed from: a */
        String f12350a;

        /* renamed from: b */
        JSONObject f12351b;

        /* renamed from: c */
        String f12352c;

        /* renamed from: d */
        String f12353d;

        private C4843a() {
        }

        /* synthetic */ C4843a(byte b) {
            this();
        }
    }

    public C4842v(Context context, C4980d dVar) {
        this.f12345b = dVar;
        this.f12347d = context;
        this.f12346c = new C4979c();
        this.f12349f = new C4405b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo34431a() {
        JSONObject a = this.f12349f.mo33214a();
        Iterator<String> keys = a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = a.get(next);
            if (obj instanceof String) {
                a.put(next, C4377a.C43781.m12452a((String) obj));
            }
        }
        return a;
    }
}
