package com.applovin.impl.sdk.p256e;

import android.content.Context;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;

/* renamed from: com.applovin.impl.sdk.e.a */
public abstract class C8401a implements Runnable {

    /* renamed from: a */
    private final Context f21117a;
    /* access modifiers changed from: protected */

    /* renamed from: b */
    public final C8490n f21118b;
    /* access modifiers changed from: protected */

    /* renamed from: c */
    public final String f21119c;
    /* access modifiers changed from: protected */

    /* renamed from: d */
    public final C8626v f21120d;

    /* renamed from: e */
    private final boolean f21121e;

    public C8401a(String str, C8490n nVar) {
        this(str, nVar, false);
    }

    public C8401a(String str, C8490n nVar, boolean z) {
        this.f21119c = str;
        this.f21118b = nVar;
        this.f21120d = nVar.mo57320D();
        this.f21117a = nVar.mo57332P();
        this.f21121e = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C8490n mo57167d() {
        return this.f21118b;
    }

    /* renamed from: e */
    public String mo57168e() {
        return this.f21119c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Context mo57169f() {
        return this.f21117a;
    }

    /* renamed from: g */
    public boolean mo57170g() {
        return this.f21121e;
    }
}
