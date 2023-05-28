package com.yandex.metrica.network;

import android.text.TextUtils;
import com.yandex.metrica.network.impl.C3754e;
import java.util.HashMap;
import java.util.Map;

public class Request {

    /* renamed from: a */
    private final String f9631a;

    /* renamed from: b */
    private final String f9632b;

    /* renamed from: c */
    private final byte[] f9633c;

    /* renamed from: d */
    private final Map f9634d;

    public class Builder {

        /* renamed from: a */
        private final String f9635a;

        /* renamed from: b */
        private String f9636b;

        /* renamed from: c */
        private byte[] f9637c = new byte[0];

        /* renamed from: d */
        private final Map f9638d = new HashMap();

        public Builder(String str) {
            this.f9635a = str;
        }

        public Builder addHeader(String str, String str2) {
            this.f9638d.put(str, str2);
            return this;
        }

        public Request build() {
            return new Request(this.f9635a, this.f9636b, this.f9637c, this.f9638d);
        }

        public Builder post(byte[] bArr) {
            this.f9637c = bArr;
            return withMethod("POST");
        }

        public Builder withMethod(String str) {
            this.f9636b = str;
            return this;
        }
    }

    private Request(String str, String str2, byte[] bArr, Map map) {
        this.f9631a = str;
        this.f9632b = TextUtils.isEmpty(str2) ? "GET" : str2;
        this.f9633c = bArr;
        this.f9634d = C3754e.m11154a(map);
    }

    public byte[] getBody() {
        return this.f9633c;
    }

    public Map getHeaders() {
        return this.f9634d;
    }

    public String getMethod() {
        return this.f9632b;
    }

    public String getUrl() {
        return this.f9631a;
    }

    public String toString() {
        return "Request{url=" + this.f9631a + ", method='" + this.f9632b + '\'' + ", bodyLength=" + this.f9633c.length + ", headers=" + this.f9634d + '}';
    }
}
