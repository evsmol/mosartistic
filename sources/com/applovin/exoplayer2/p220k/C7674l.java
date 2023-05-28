package com.applovin.exoplayer2.p220k;

import android.net.Uri;
import com.applovin.exoplayer2.p221l.C7717a;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.exoplayer2.k.l */
public final class C7674l {

    /* renamed from: a */
    public final Uri f18057a;

    /* renamed from: b */
    public final long f18058b;

    /* renamed from: c */
    public final int f18059c;

    /* renamed from: d */
    public final byte[] f18060d;

    /* renamed from: e */
    public final Map<String, String> f18061e;
    @Deprecated

    /* renamed from: f */
    public final long f18062f;

    /* renamed from: g */
    public final long f18063g;

    /* renamed from: h */
    public final long f18064h;

    /* renamed from: i */
    public final String f18065i;

    /* renamed from: j */
    public final int f18066j;

    /* renamed from: k */
    public final Object f18067k;

    /* renamed from: com.applovin.exoplayer2.k.l$a */
    public static final class C7676a {

        /* renamed from: a */
        private Uri f18068a;

        /* renamed from: b */
        private long f18069b;

        /* renamed from: c */
        private int f18070c;

        /* renamed from: d */
        private byte[] f18071d;

        /* renamed from: e */
        private Map<String, String> f18072e;

        /* renamed from: f */
        private long f18073f;

        /* renamed from: g */
        private long f18074g;

        /* renamed from: h */
        private String f18075h;

        /* renamed from: i */
        private int f18076i;

        /* renamed from: j */
        private Object f18077j;

        public C7676a() {
            this.f18070c = 1;
            this.f18072e = Collections.emptyMap();
            this.f18074g = -1;
        }

        private C7676a(C7674l lVar) {
            this.f18068a = lVar.f18057a;
            this.f18069b = lVar.f18058b;
            this.f18070c = lVar.f18059c;
            this.f18071d = lVar.f18060d;
            this.f18072e = lVar.f18061e;
            this.f18073f = lVar.f18063g;
            this.f18074g = lVar.f18064h;
            this.f18075h = lVar.f18065i;
            this.f18076i = lVar.f18066j;
            this.f18077j = lVar.f18067k;
        }

        /* renamed from: a */
        public C7676a mo54910a(int i) {
            this.f18070c = i;
            return this;
        }

        /* renamed from: a */
        public C7676a mo54911a(long j) {
            this.f18073f = j;
            return this;
        }

        /* renamed from: a */
        public C7676a mo54912a(Uri uri) {
            this.f18068a = uri;
            return this;
        }

        /* renamed from: a */
        public C7676a mo54913a(String str) {
            this.f18068a = Uri.parse(str);
            return this;
        }

        /* renamed from: a */
        public C7676a mo54914a(Map<String, String> map) {
            this.f18072e = map;
            return this;
        }

        /* renamed from: a */
        public C7676a mo54915a(byte[] bArr) {
            this.f18071d = bArr;
            return this;
        }

        /* renamed from: a */
        public C7674l mo54916a() {
            C7717a.m22116a(this.f18068a, (Object) "The uri must be set.");
            return new C7674l(this.f18068a, this.f18069b, this.f18070c, this.f18071d, this.f18072e, this.f18073f, this.f18074g, this.f18075h, this.f18076i, this.f18077j);
        }

        /* renamed from: b */
        public C7676a mo54917b(int i) {
            this.f18076i = i;
            return this;
        }

        /* renamed from: b */
        public C7676a mo54918b(String str) {
            this.f18075h = str;
            return this;
        }
    }

    private C7674l(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        long j4 = j;
        byte[] bArr2 = bArr;
        long j5 = j2;
        long j6 = j3;
        long j7 = j4 + j5;
        boolean z = true;
        C7717a.m22118a(j7 >= 0);
        C7717a.m22118a(j5 >= 0);
        if (j6 <= 0 && j6 != -1) {
            z = false;
        }
        C7717a.m22118a(z);
        this.f18057a = uri;
        this.f18058b = j4;
        this.f18059c = i;
        this.f18060d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f18061e = Collections.unmodifiableMap(new HashMap(map));
        this.f18063g = j5;
        this.f18062f = j7;
        this.f18064h = j6;
        this.f18065i = str;
        this.f18066j = i2;
        this.f18067k = obj;
    }

    /* renamed from: a */
    public static String m21958a(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return VersionInfo.GIT_BRANCH;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final String mo54906a() {
        return m21958a(this.f18059c);
    }

    /* renamed from: b */
    public C7676a mo54907b() {
        return new C7676a();
    }

    /* renamed from: b */
    public boolean mo54908b(int i) {
        return (this.f18066j & i) == i;
    }

    public String toString() {
        return "DataSpec[" + mo54906a() + " " + this.f18057a + ", " + this.f18063g + ", " + this.f18064h + ", " + this.f18065i + ", " + this.f18066j + "]";
    }
}
