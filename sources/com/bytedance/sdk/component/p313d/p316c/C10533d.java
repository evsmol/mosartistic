package com.bytedance.sdk.component.p313d.p316c;

import com.bytedance.sdk.component.p313d.C10558g;
import com.bytedance.sdk.component.p313d.C10561j;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.d.c.d */
/* compiled from: ImageResponse */
public class C10533d<T> implements C10561j {

    /* renamed from: a */
    private String f26294a;

    /* renamed from: b */
    private String f26295b;

    /* renamed from: c */
    private T f26296c;

    /* renamed from: d */
    private int f26297d;

    /* renamed from: e */
    private int f26298e;

    /* renamed from: f */
    private Map<String, String> f26299f;

    /* renamed from: g */
    private boolean f26300g;

    /* renamed from: h */
    private boolean f26301h;

    /* renamed from: i */
    private C10558g f26302i;

    /* renamed from: j */
    private int f26303j;

    /* renamed from: a */
    public C10533d mo64113a(C10523c cVar, T t) {
        this.f26296c = t;
        this.f26294a = cVar.mo64083e();
        this.f26295b = cVar.mo64072a();
        this.f26297d = cVar.mo64079b();
        this.f26298e = cVar.mo64081c();
        this.f26301h = cVar.mo64090l();
        this.f26302i = cVar.mo64091m();
        this.f26303j = cVar.mo64092n();
        return this;
    }

    /* renamed from: a */
    public C10533d mo64114a(C10523c cVar, T t, Map<String, String> map, boolean z) {
        this.f26299f = map;
        this.f26300g = z;
        return mo64113a(cVar, t);
    }

    /* renamed from: a */
    public String mo64115a() {
        return this.f26295b;
    }

    /* renamed from: b */
    public T mo64116b() {
        return this.f26296c;
    }

    /* renamed from: c */
    public Map<String, String> mo64117c() {
        return this.f26299f;
    }

    /* renamed from: d */
    public boolean mo64118d() {
        return this.f26301h;
    }

    /* renamed from: e */
    public C10558g mo64119e() {
        return this.f26302i;
    }

    /* renamed from: f */
    public int mo64120f() {
        return this.f26303j;
    }
}
