package com.applovin.exoplayer2.p220k;

import android.content.Context;
import android.net.Uri;
import com.applovin.exoplayer2.p220k.C7670i;
import com.applovin.exoplayer2.p220k.C7684q;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.sdk.AppLovinEventTypes;
import com.appnext.base.p264b.C8849c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.exoplayer2.k.o */
public final class C7681o implements C7670i {

    /* renamed from: a */
    private final Context f18114a;

    /* renamed from: b */
    private final List<C7654aa> f18115b = new ArrayList();

    /* renamed from: c */
    private final C7670i f18116c;

    /* renamed from: d */
    private C7670i f18117d;

    /* renamed from: e */
    private C7670i f18118e;

    /* renamed from: f */
    private C7670i f18119f;

    /* renamed from: g */
    private C7670i f18120g;

    /* renamed from: h */
    private C7670i f18121h;

    /* renamed from: i */
    private C7670i f18122i;

    /* renamed from: j */
    private C7670i f18123j;

    /* renamed from: k */
    private C7670i f18124k;

    /* renamed from: com.applovin.exoplayer2.k.o$a */
    public static final class C7682a implements C7670i.C7671a {

        /* renamed from: a */
        private final Context f18125a;

        /* renamed from: b */
        private final C7670i.C7671a f18126b;

        /* renamed from: c */
        private C7654aa f18127c;

        public C7682a(Context context) {
            this(context, new C7684q.C7686a());
        }

        public C7682a(Context context, C7670i.C7671a aVar) {
            this.f18125a = context.getApplicationContext();
            this.f18126b = aVar;
        }

        /* renamed from: b */
        public C7681o mo54901a() {
            C7681o oVar = new C7681o(this.f18125a, this.f18126b.mo54901a());
            C7654aa aaVar = this.f18127c;
            if (aaVar != null) {
                oVar.mo54524a(aaVar);
            }
            return oVar;
        }
    }

    public C7681o(Context context, C7670i iVar) {
        this.f18114a = context.getApplicationContext();
        this.f18116c = (C7670i) C7717a.m22120b(iVar);
    }

    /* renamed from: a */
    private void m21995a(C7670i iVar) {
        for (int i = 0; i < this.f18115b.size(); i++) {
            iVar.mo54524a(this.f18115b.get(i));
        }
    }

    /* renamed from: a */
    private void m21996a(C7670i iVar, C7654aa aaVar) {
        if (iVar != null) {
            iVar.mo54524a(aaVar);
        }
    }

    /* renamed from: d */
    private C7670i m21997d() {
        if (this.f18121h == null) {
            C7655ab abVar = new C7655ab();
            this.f18121h = abVar;
            m21995a((C7670i) abVar);
        }
        return this.f18121h;
    }

    /* renamed from: e */
    private C7670i m21998e() {
        if (this.f18117d == null) {
            C7688s sVar = new C7688s();
            this.f18117d = sVar;
            m21995a((C7670i) sVar);
        }
        return this.f18117d;
    }

    /* renamed from: f */
    private C7670i m21999f() {
        if (this.f18118e == null) {
            C7658c cVar = new C7658c(this.f18114a);
            this.f18118e = cVar;
            m21995a((C7670i) cVar);
        }
        return this.f18118e;
    }

    /* renamed from: g */
    private C7670i m22000g() {
        if (this.f18119f == null) {
            C7665f fVar = new C7665f(this.f18114a);
            this.f18119f = fVar;
            m21995a((C7670i) fVar);
        }
        return this.f18119f;
    }

    /* renamed from: h */
    private C7670i m22001h() {
        if (this.f18120g == null) {
            try {
                C7670i iVar = (C7670i) Class.forName("com.applovin.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f18120g = iVar;
                m21995a(iVar);
            } catch (ClassNotFoundException unused) {
                C7755q.m22361c("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.f18120g == null) {
                this.f18120g = this.f18116c;
            }
        }
        return this.f18120g;
    }

    /* renamed from: i */
    private C7670i m22002i() {
        if (this.f18122i == null) {
            C7669h hVar = new C7669h();
            this.f18122i = hVar;
            m21995a((C7670i) hVar);
        }
        return this.f18122i;
    }

    /* renamed from: j */
    private C7670i m22003j() {
        if (this.f18123j == null) {
            C7710x xVar = new C7710x(this.f18114a);
            this.f18123j = xVar;
            m21995a((C7670i) xVar);
        }
        return this.f18123j;
    }

    /* renamed from: a */
    public int mo53898a(byte[] bArr, int i, int i2) throws IOException {
        return ((C7670i) C7717a.m22120b(this.f18124k)).mo53898a(bArr, i, i2);
    }

    /* renamed from: a */
    public long mo54522a(C7674l lVar) throws IOException {
        C7670i iVar;
        C7717a.m22121b(this.f18124k == null);
        String scheme = lVar.f18057a.getScheme();
        if (C7728ai.m22214a(lVar.f18057a)) {
            String path = lVar.f18057a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                iVar = m21998e();
                this.f18124k = iVar;
                return this.f18124k.mo54522a(lVar);
            }
        } else if (!"asset".equals(scheme)) {
            iVar = AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme) ? m22000g() : "rtmp".equals(scheme) ? m22001h() : "udp".equals(scheme) ? m21997d() : C8849c.DATA.equals(scheme) ? m22002i() : ("rawresource".equals(scheme) || "android.resource".equals(scheme)) ? m22003j() : this.f18116c;
            this.f18124k = iVar;
            return this.f18124k.mo54522a(lVar);
        }
        iVar = m21999f();
        this.f18124k = iVar;
        return this.f18124k.mo54522a(lVar);
    }

    /* renamed from: a */
    public Uri mo54523a() {
        C7670i iVar = this.f18124k;
        if (iVar == null) {
            return null;
        }
        return iVar.mo54523a();
    }

    /* renamed from: a */
    public void mo54524a(C7654aa aaVar) {
        C7717a.m22120b(aaVar);
        this.f18116c.mo54524a(aaVar);
        this.f18115b.add(aaVar);
        m21996a(this.f18117d, aaVar);
        m21996a(this.f18118e, aaVar);
        m21996a(this.f18119f, aaVar);
        m21996a(this.f18120g, aaVar);
        m21996a(this.f18121h, aaVar);
        m21996a(this.f18122i, aaVar);
        m21996a(this.f18123j, aaVar);
    }

    /* renamed from: b */
    public Map<String, List<String>> mo54525b() {
        C7670i iVar = this.f18124k;
        return iVar == null ? Collections.emptyMap() : iVar.mo54525b();
    }

    /* renamed from: c */
    public void mo54526c() throws IOException {
        C7670i iVar = this.f18124k;
        if (iVar != null) {
            try {
                iVar.mo54526c();
            } finally {
                this.f18124k = null;
            }
        }
    }
}
