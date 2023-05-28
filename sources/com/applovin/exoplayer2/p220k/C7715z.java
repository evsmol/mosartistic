package com.applovin.exoplayer2.p220k;

import android.net.Uri;
import com.applovin.exoplayer2.p221l.C7717a;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.exoplayer2.k.z */
public final class C7715z implements C7670i {

    /* renamed from: a */
    private final C7670i f18214a;

    /* renamed from: b */
    private long f18215b;

    /* renamed from: c */
    private Uri f18216c = Uri.EMPTY;

    /* renamed from: d */
    private Map<String, List<String>> f18217d = Collections.emptyMap();

    public C7715z(C7670i iVar) {
        this.f18214a = (C7670i) C7717a.m22120b(iVar);
    }

    /* renamed from: a */
    public int mo53898a(byte[] bArr, int i, int i2) throws IOException {
        int a = this.f18214a.mo53898a(bArr, i, i2);
        if (a != -1) {
            this.f18215b += (long) a;
        }
        return a;
    }

    /* renamed from: a */
    public long mo54522a(C7674l lVar) throws IOException {
        this.f18216c = lVar.f18057a;
        this.f18217d = Collections.emptyMap();
        long a = this.f18214a.mo54522a(lVar);
        this.f18216c = (Uri) C7717a.m22120b(mo54523a());
        this.f18217d = mo54525b();
        return a;
    }

    /* renamed from: a */
    public Uri mo54523a() {
        return this.f18214a.mo54523a();
    }

    /* renamed from: a */
    public void mo54524a(C7654aa aaVar) {
        C7717a.m22120b(aaVar);
        this.f18214a.mo54524a(aaVar);
    }

    /* renamed from: b */
    public Map<String, List<String>> mo54525b() {
        return this.f18214a.mo54525b();
    }

    /* renamed from: c */
    public void mo54526c() throws IOException {
        this.f18214a.mo54526c();
    }

    /* renamed from: d */
    public long mo54950d() {
        return this.f18215b;
    }

    /* renamed from: e */
    public Uri mo54951e() {
        return this.f18216c;
    }

    /* renamed from: f */
    public Map<String, List<String>> mo54952f() {
        return this.f18217d;
    }
}
