package com.adcolony.sdk;

import com.adcolony.sdk.C6288e0;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.h0 */
class C6312h0 {

    /* renamed from: a */
    private String f13543a;

    /* renamed from: b */
    private C6294f1 f13544b;

    C6312h0(C6294f1 f1Var) {
        if (f1Var == null) {
            try {
                f1Var = new C6294f1();
            } catch (JSONException e) {
                new C6288e0.C6289a().mo50644a("JSON Error in ADCMessage constructor: ").mo50644a(e.toString()).mo50645a(C6288e0.f13498i);
                return;
            }
        }
        this.f13544b = f1Var;
        this.f13543a = f1Var.mo50694e("m_type");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6312h0 mo50733a(C6294f1 f1Var) {
        try {
            C6312h0 h0Var = new C6312h0("reply", this.f13544b.mo50684b("m_origin"), f1Var);
            h0Var.f13544b.mo50686b("m_id", this.f13544b.mo50684b("m_id"));
            return h0Var;
        } catch (JSONException e) {
            new C6288e0.C6289a().mo50644a("JSON error in ADCMessage's createReply(): ").mo50644a(e.toString()).mo50645a(C6288e0.f13498i);
            return new C6312h0("JSONException", 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo50735b(C6294f1 f1Var) {
        if (f1Var == null) {
            f1Var = new C6294f1();
        }
        this.f13544b = f1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo50736c() {
        C6185a.m14885a(this.f13543a, this.f13544b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo50734b() {
        return this.f13543a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6294f1 mo50732a() {
        return this.f13544b;
    }

    C6312h0(String str, int i) {
        try {
            this.f13543a = str;
            C6294f1 f1Var = new C6294f1();
            this.f13544b = f1Var;
            f1Var.mo50686b("m_target", i);
        } catch (JSONException e) {
            new C6288e0.C6289a().mo50644a("JSON Error in ADCMessage constructor: ").mo50644a(e.toString()).mo50645a(C6288e0.f13498i);
        }
    }

    C6312h0(String str, int i, C6294f1 f1Var) {
        try {
            this.f13543a = str;
            f1Var = f1Var == null ? new C6294f1() : f1Var;
            this.f13544b = f1Var;
            f1Var.mo50686b("m_target", i);
        } catch (JSONException e) {
            new C6288e0.C6289a().mo50644a("JSON Error in ADCMessage constructor: ").mo50644a(e.toString()).mo50645a(C6288e0.f13498i);
        }
    }
}
