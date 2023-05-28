package com.bytedance.sdk.component.p313d.p315b;

import com.bytedance.sdk.component.p313d.C10557f;
import com.bytedance.sdk.component.p313d.C10558g;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.d.b.d */
/* compiled from: HttpResponse */
public class C10496d<T> implements C10557f {

    /* renamed from: a */
    Map<String, String> f26152a;

    /* renamed from: b */
    private int f26153b;

    /* renamed from: c */
    private T f26154c;

    /* renamed from: d */
    private String f26155d;

    /* renamed from: e */
    private C10558g f26156e;

    public C10496d(int i, T t, String str) {
        this.f26153b = i;
        this.f26154c = t;
        this.f26155d = str;
    }

    public C10496d(int i, T t, String str, Map<String, String> map) {
        this(i, t, str);
        this.f26152a = map;
    }

    /* renamed from: a */
    public C10558g mo64006a() {
        return this.f26156e;
    }

    /* renamed from: a */
    public void mo64007a(C10558g gVar) {
        this.f26156e = gVar;
    }

    /* renamed from: b */
    public int mo64008b() {
        return this.f26153b;
    }

    /* renamed from: c */
    public T mo64009c() {
        return this.f26154c;
    }

    /* renamed from: d */
    public String mo64010d() {
        return this.f26155d;
    }

    /* renamed from: e */
    public Map<String, String> mo64011e() {
        return this.f26152a;
    }
}
