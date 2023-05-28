package com.bytedance.sdk.component.p293a;

import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.component.a.q */
/* compiled from: Js2JavaCall */
public class C10242q {

    /* renamed from: a */
    public final int f25283a;

    /* renamed from: b */
    public final String f25284b;

    /* renamed from: c */
    public final String f25285c;

    /* renamed from: d */
    public final String f25286d;

    /* renamed from: e */
    public final String f25287e;

    /* renamed from: f */
    public final String f25288f;

    /* renamed from: g */
    public final String f25289g;

    /* renamed from: h */
    public final String f25290h;

    /* renamed from: a */
    public static C10244a m29405a() {
        return new C10244a();
    }

    /* renamed from: a */
    public static C10242q m29406a(String str, int i) {
        return new C10242q(str, i);
    }

    private C10242q(String str, int i) {
        this.f25284b = null;
        this.f25285c = null;
        this.f25286d = null;
        this.f25287e = null;
        this.f25288f = str;
        this.f25289g = null;
        this.f25283a = i;
        this.f25290h = null;
    }

    private C10242q(C10244a aVar) {
        this.f25284b = aVar.f25291a;
        this.f25285c = aVar.f25292b;
        this.f25286d = aVar.f25293c;
        this.f25287e = aVar.f25294d;
        this.f25288f = aVar.f25295e;
        this.f25289g = aVar.f25296f;
        this.f25283a = 1;
        this.f25290h = aVar.f25297g;
    }

    /* renamed from: a */
    public static boolean m29407a(C10242q qVar) {
        if (qVar == null || qVar.f25283a != 1 || TextUtils.isEmpty(qVar.f25286d) || TextUtils.isEmpty(qVar.f25287e)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "methodName: " + this.f25286d + ", params: " + this.f25287e + ", callbackId: " + this.f25288f + ", type: " + this.f25285c + ", version: " + this.f25284b + ", ";
    }

    /* renamed from: com.bytedance.sdk.component.a.q$a */
    /* compiled from: Js2JavaCall */
    public static final class C10244a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f25291a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f25292b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f25293c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f25294d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f25295e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f25296f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f25297g;

        private C10244a() {
        }

        /* renamed from: a */
        public C10244a mo63063a(String str) {
            this.f25291a = str;
            return this;
        }

        /* renamed from: b */
        public C10244a mo63065b(String str) {
            this.f25292b = str;
            return this;
        }

        /* renamed from: c */
        public C10244a mo63066c(String str) {
            this.f25293c = str;
            return this;
        }

        /* renamed from: d */
        public C10244a mo63067d(String str) {
            this.f25294d = str;
            return this;
        }

        /* renamed from: e */
        public C10244a mo63068e(String str) {
            this.f25295e = str;
            return this;
        }

        /* renamed from: f */
        public C10244a mo63069f(String str) {
            this.f25296f = str;
            return this;
        }

        /* renamed from: g */
        public C10244a mo63070g(String str) {
            this.f25297g = str;
            return this;
        }

        /* renamed from: a */
        public C10242q mo63064a() {
            return new C10242q(this);
        }
    }
}
