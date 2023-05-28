package com.yandex.metrica.network;

import com.yandex.metrica.network.impl.C3754e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Response {

    /* renamed from: a */
    private final boolean f9639a;

    /* renamed from: b */
    private final int f9640b;

    /* renamed from: c */
    private final byte[] f9641c;

    /* renamed from: d */
    private final byte[] f9642d;

    /* renamed from: e */
    private final Map f9643e;

    /* renamed from: f */
    private final Throwable f9644f;

    public Response(Throwable th) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th);
    }

    public Response(boolean z, int i, byte[] bArr, byte[] bArr2, Map map, Throwable th) {
        this.f9639a = z;
        this.f9640b = i;
        this.f9641c = bArr;
        this.f9642d = bArr2;
        this.f9643e = map == null ? Collections.emptyMap() : C3754e.m11154a(map);
        this.f9644f = th;
    }

    public int getCode() {
        return this.f9640b;
    }

    public byte[] getErrorData() {
        return this.f9642d;
    }

    public Throwable getException() {
        return this.f9644f;
    }

    public Map getHeaders() {
        return this.f9643e;
    }

    public byte[] getResponseData() {
        return this.f9641c;
    }

    public boolean isCompleted() {
        return this.f9639a;
    }

    public String toString() {
        return "Response{completed=" + this.f9639a + ", code=" + this.f9640b + ", responseDataLength=" + this.f9641c.length + ", errorDataLength=" + this.f9642d.length + ", headers=" + this.f9643e + ", exception=" + this.f9644f + '}';
    }
}
