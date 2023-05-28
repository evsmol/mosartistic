package com.applovin.impl.sdk.p256e;

import android.text.TextUtils;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8511b;
import com.applovin.impl.sdk.network.C8516c;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.e.u */
public abstract class C8449u<T> extends C8401a implements C8511b.C8515c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8516c<T> f21222a;

    /* renamed from: e */
    private final C8511b.C8515c<T> f21223e;

    /* renamed from: f */
    protected C8511b.C8513a f21224f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C8432o.C8434a f21225g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C8380b<String> f21226h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C8380b<String> f21227i;

    public C8449u(C8516c<T> cVar, C8490n nVar) {
        this(cVar, nVar, false);
    }

    public C8449u(C8516c<T> cVar, final C8490n nVar, boolean z) {
        super("TaskRepeatRequest", nVar, z);
        this.f21225g = C8432o.C8434a.BACKGROUND;
        this.f21226h = null;
        this.f21227i = null;
        if (cVar != null) {
            this.f21222a = cVar;
            this.f21224f = new C8511b.C8513a();
            this.f21223e = new C8511b.C8515c<T>() {
                /* renamed from: a */
                public void mo56275a(int i, String str, T t) {
                    C8380b bVar;
                    C8449u uVar;
                    boolean z = false;
                    boolean z2 = i < 200 || i >= 500;
                    boolean z3 = i == 429;
                    if ((i != -1009) && (z2 || z3 || C8449u.this.f21222a.mo57522m())) {
                        String f = C8449u.this.f21222a.mo57514f();
                        if (C8449u.this.f21222a.mo57516h() > 0) {
                            C8626v vVar = C8449u.this.f21120d;
                            if (C8626v.m26252a()) {
                                C8626v vVar2 = C8449u.this.f21120d;
                                String str2 = C8449u.this.f21119c;
                                vVar2.mo57821d(str2, "Unable to send request due to server failure (code " + i + "). " + C8449u.this.f21222a.mo57516h() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds((long) C8449u.this.f21222a.mo57520k()) + " seconds...");
                            }
                            int h = C8449u.this.f21222a.mo57516h() - 1;
                            C8449u.this.f21222a.mo57506a(h);
                            if (h == 0) {
                                C8449u uVar2 = C8449u.this;
                                uVar2.m25452c(uVar2.f21226h);
                                if (StringUtils.isValidString(f) && f.length() >= 4) {
                                    C8626v vVar3 = C8449u.this.f21120d;
                                    if (C8626v.m26252a()) {
                                        C8626v vVar4 = C8449u.this.f21120d;
                                        String str3 = C8449u.this.f21119c;
                                        vVar4.mo57820c(str3, "Switching to backup endpoint " + f);
                                    }
                                    C8449u.this.f21222a.mo57507a(f);
                                    z = true;
                                }
                            }
                            long millis = (!((Boolean) nVar.mo57342a(C8380b.f20892dk)).booleanValue() || !z) ? C8449u.this.f21222a.mo57521l() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, (double) C8449u.this.f21222a.mo57518i())) : (long) C8449u.this.f21222a.mo57520k() : 0;
                            C8432o V = nVar.mo57337V();
                            C8449u uVar3 = C8449u.this;
                            V.mo57229a((C8401a) uVar3, uVar3.f21225g, millis);
                            return;
                        }
                        if (f == null || !f.equals(C8449u.this.f21222a.mo57505a())) {
                            uVar = C8449u.this;
                            bVar = uVar.f21226h;
                        } else {
                            uVar = C8449u.this;
                            bVar = uVar.f21227i;
                        }
                        uVar.m25452c(bVar);
                    }
                    C8449u.this.mo56275a(i, str, t);
                }

                /* renamed from: a */
                public void mo56277a(T t, int i) {
                    C8449u.this.f21222a.mo57506a(0);
                    C8449u.this.mo56277a(t, i);
                }
            };
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public <ST> void m25452c(C8380b<ST> bVar) {
        if (bVar != null) {
            mo57167d().mo57331O().mo57091a((C8380b<?>) bVar, (Object) bVar.mo57086b());
        }
    }

    /* renamed from: a */
    public abstract void mo56275a(int i, String str, T t);

    /* renamed from: a */
    public void mo57253a(C8380b<String> bVar) {
        this.f21226h = bVar;
    }

    /* renamed from: a */
    public void mo57254a(C8432o.C8434a aVar) {
        this.f21225g = aVar;
    }

    /* renamed from: a */
    public abstract void mo56277a(T t, int i);

    /* renamed from: b */
    public void mo57255b(C8380b<String> bVar) {
        this.f21227i = bVar;
    }

    public void run() {
        int i;
        C8511b U = mo57167d().mo57336U();
        if (!mo57167d().mo57386c() && !mo57167d().mo57387d()) {
            C8626v.m26258i("AppLovinSdk", "AppLovin SDK is disabled");
            i = -22;
        } else if (!StringUtils.isValidString(this.f21222a.mo57505a()) || this.f21222a.mo57505a().length() < 4) {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57822e(this.f21119c, "Task has an invalid or null request endpoint.");
            }
            i = AppLovinErrorCodes.INVALID_URL;
        } else {
            if (TextUtils.isEmpty(this.f21222a.mo57508b())) {
                this.f21222a.mo57509b(this.f21222a.mo57512e() != null ? "POST" : "GET");
            }
            U.mo57501a(this.f21222a, this.f21224f, this.f21223e);
            return;
        }
        mo56275a(i, (String) null, (Object) null);
    }
}
