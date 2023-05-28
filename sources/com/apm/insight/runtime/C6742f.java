package com.apm.insight.runtime;

import com.apm.insight.C6617h;
import com.apm.insight.entity.Header;

/* renamed from: com.apm.insight.runtime.f */
public class C6742f {

    /* renamed from: b */
    private static final C6742f f14488b = new C6742f() {

        /* renamed from: a */
        Header f14490a = null;

        /* renamed from: b */
        public Object mo52301b(String str) {
            if (this.f14490a == null) {
                this.f14490a = Header.m16142b(C6617h.m16313g());
            }
            return this.f14490a.mo52042f().opt(str);
        }
    };

    /* renamed from: a */
    private C6742f f14489a;

    C6742f() {
        this(f14488b);
    }

    C6742f(C6742f fVar) {
        this.f14489a = null;
        this.f14489a = fVar;
    }

    /* renamed from: a */
    public Object mo52247a(String str) {
        C6742f fVar = this.f14489a;
        if (fVar != null) {
            return fVar.mo52247a(str);
        }
        return null;
    }

    /* renamed from: b */
    public Object mo52301b(String str) {
        C6742f fVar = this.f14489a;
        if (fVar != null) {
            return fVar.mo52301b(str);
        }
        return null;
    }
}
