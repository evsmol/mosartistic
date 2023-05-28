package com.applovin.exoplayer2.p185d;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.exoplayer2.C7476h;
import com.applovin.exoplayer2.common.p183a.C7039u;
import com.applovin.exoplayer2.p185d.C7167m;
import com.applovin.exoplayer2.p220k.C7673k;
import com.applovin.exoplayer2.p220k.C7674l;
import com.applovin.exoplayer2.p220k.C7691t;
import com.applovin.exoplayer2.p220k.C7715z;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.applovin.exoplayer2.d.p */
public final class C7175p implements C7177r {

    /* renamed from: a */
    private final C7691t.C7693b f15754a;

    /* renamed from: b */
    private final String f15755b;

    /* renamed from: c */
    private final boolean f15756c;

    /* renamed from: d */
    private final Map<String, String> f15757d;

    public C7175p(String str, boolean z, C7691t.C7693b bVar) {
        C7717a.m22118a(!z || !TextUtils.isEmpty(str));
        this.f15754a = bVar;
        this.f15755b = str;
        this.f15756c = z;
        this.f15757d = new HashMap();
    }

    /* renamed from: a */
    private static String m19232a(C7691t.C7696e eVar, int i) {
        Map<String, List<String>> map;
        List list;
        if (((eVar.f18163d == 307 || eVar.f18163d == 308) && i < 5) && (map = eVar.f18165f) != null && (list = map.get(LogConstants.EVENT_LOCATION)) != null && !list.isEmpty()) {
            return (String) list.get(0);
        }
        return null;
    }

    /* renamed from: a */
    private static byte[] m19233a(C7691t.C7693b bVar, String str, byte[] bArr, Map<String, String> map) throws C7178s {
        C7673k kVar;
        C7715z zVar = new C7715z(bVar.mo54928c());
        C7674l a = new C7674l.C7676a().mo54913a(str).mo54914a(map).mo54910a(2).mo54915a(bArr).mo54917b(1).mo54916a();
        int i = 0;
        C7674l lVar = a;
        while (true) {
            try {
                kVar = new C7673k(zVar, lVar);
                byte[] a2 = C7728ai.m22219a((InputStream) kVar);
                C7728ai.m22210a((Closeable) kVar);
                return a2;
            } catch (C7691t.C7696e e) {
                String a3 = m19232a(e, i);
                if (a3 != null) {
                    i++;
                    lVar = lVar.mo54907b().mo54913a(a3).mo54916a();
                    C7728ai.m22210a((Closeable) kVar);
                } else {
                    throw e;
                }
            } catch (Exception e2) {
                throw new C7178s(a, (Uri) C7717a.m22120b(zVar.mo54951e()), zVar.mo54525b(), zVar.mo54950d(), e2);
            } catch (Throwable th) {
                C7728ai.m22210a((Closeable) kVar);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void mo53845a(String str, String str2) {
        C7717a.m22120b(str);
        C7717a.m22120b(str2);
        synchronized (this.f15757d) {
            this.f15757d.put(str, str2);
        }
    }

    /* renamed from: a */
    public byte[] mo53846a(UUID uuid, C7167m.C7168a aVar) throws C7178s {
        String b = aVar.mo53840b();
        if (this.f15756c || TextUtils.isEmpty(b)) {
            b = this.f15755b;
        }
        if (!TextUtils.isEmpty(b)) {
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", C7476h.f17126e.equals(uuid) ? "text/xml" : C7476h.f17124c.equals(uuid) ? "application/json" : "application/octet-stream");
            if (C7476h.f17126e.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f15757d) {
                hashMap.putAll(this.f15757d);
            }
            return m19233a(this.f15754a, b, aVar.mo53839a(), hashMap);
        }
        throw new C7178s(new C7674l.C7676a().mo54912a(Uri.EMPTY).mo54916a(), Uri.EMPTY, C7039u.m18834a(), 0, new IllegalStateException("No license URL"));
    }

    /* renamed from: a */
    public byte[] mo53847a(UUID uuid, C7167m.C7171d dVar) throws C7178s {
        return m19233a(this.f15754a, dVar.mo53842b() + "&signedRequest=" + C7728ai.m22203a(dVar.mo53841a()), (byte[]) null, Collections.emptyMap());
    }
}
