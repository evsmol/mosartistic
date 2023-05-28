package com.bytedance.sdk.component.p323e;

import java.io.File;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.e.b */
/* compiled from: NetResponse */
public class C10576b {

    /* renamed from: a */
    final int f26360a;

    /* renamed from: b */
    final String f26361b;

    /* renamed from: c */
    final Map<String, String> f26362c;

    /* renamed from: d */
    final String f26363d;

    /* renamed from: e */
    final long f26364e;

    /* renamed from: f */
    final long f26365f;

    /* renamed from: g */
    private File f26366g = null;

    /* renamed from: h */
    private final boolean f26367h;

    /* renamed from: i */
    private byte[] f26368i = null;

    public C10576b(boolean z, int i, String str, Map<String, String> map, String str2, long j, long j2) {
        this.f26367h = z;
        this.f26360a = i;
        this.f26361b = str;
        this.f26362c = map;
        this.f26363d = str2;
        this.f26364e = j;
        this.f26365f = j2;
    }

    /* renamed from: a */
    public int mo64160a() {
        return this.f26360a;
    }

    /* renamed from: a */
    public void mo64161a(File file) {
        this.f26366g = file;
    }

    /* renamed from: b */
    public String mo64162b() {
        return this.f26361b;
    }

    /* renamed from: c */
    public Map<String, String> mo64163c() {
        return this.f26362c;
    }

    /* renamed from: d */
    public String mo64164d() {
        return this.f26363d;
    }

    /* renamed from: e */
    public File mo64165e() {
        return this.f26366g;
    }

    /* renamed from: f */
    public boolean mo64166f() {
        return this.f26367h;
    }

    /* renamed from: g */
    public long mo64167g() {
        return this.f26364e - this.f26365f;
    }
}
