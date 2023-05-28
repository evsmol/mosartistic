package com.applovin.exoplayer2.p220k;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.exoplayer2.p220k.C7691t;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: com.applovin.exoplayer2.k.q */
public class C7684q extends C7664e implements C7691t {

    /* renamed from: b */
    private final boolean f18131b;

    /* renamed from: c */
    private final int f18132c;

    /* renamed from: d */
    private final int f18133d;

    /* renamed from: e */
    private final String f18134e;

    /* renamed from: f */
    private final C7691t.C7697f f18135f;

    /* renamed from: g */
    private final C7691t.C7697f f18136g;

    /* renamed from: h */
    private final boolean f18137h;

    /* renamed from: i */
    private Predicate<String> f18138i;

    /* renamed from: j */
    private C7674l f18139j;

    /* renamed from: k */
    private HttpURLConnection f18140k;

    /* renamed from: l */
    private InputStream f18141l;

    /* renamed from: m */
    private boolean f18142m;

    /* renamed from: n */
    private int f18143n;

    /* renamed from: o */
    private long f18144o;

    /* renamed from: p */
    private long f18145p;

    /* renamed from: com.applovin.exoplayer2.k.q$a */
    public static final class C7686a implements C7691t.C7693b {

        /* renamed from: a */
        private final C7691t.C7697f f18146a = new C7691t.C7697f();

        /* renamed from: b */
        private C7654aa f18147b;

        /* renamed from: c */
        private Predicate<String> f18148c;

        /* renamed from: d */
        private String f18149d;

        /* renamed from: e */
        private int f18150e = 8000;

        /* renamed from: f */
        private int f18151f = 8000;

        /* renamed from: g */
        private boolean f18152g;

        /* renamed from: h */
        private boolean f18153h;

        /* renamed from: a */
        public C7686a mo54926a(String str) {
            this.f18149d = str;
            return this;
        }

        /* renamed from: b */
        public C7684q mo54928c() {
            C7684q qVar = new C7684q(this.f18149d, this.f18150e, this.f18151f, this.f18152g, this.f18146a, this.f18148c, this.f18153h);
            C7654aa aaVar = this.f18147b;
            if (aaVar != null) {
                qVar.mo54524a(aaVar);
            }
            return qVar;
        }
    }

    @Deprecated
    public C7684q() {
        this((String) null, 8000, 8000);
    }

    @Deprecated
    public C7684q(String str, int i, int i2) {
        this(str, i, i2, false, (C7691t.C7697f) null);
    }

    @Deprecated
    public C7684q(String str, int i, int i2, boolean z, C7691t.C7697f fVar) {
        this(str, i, i2, z, fVar, (Predicate<String>) null, false);
    }

    private C7684q(String str, int i, int i2, boolean z, C7691t.C7697f fVar, Predicate<String> predicate, boolean z2) {
        super(true);
        this.f18134e = str;
        this.f18132c = i;
        this.f18133d = i2;
        this.f18131b = z;
        this.f18135f = fVar;
        this.f18138i = predicate;
        this.f18136g = new C7691t.C7697f();
        this.f18137h = z2;
    }

    /* renamed from: a */
    private HttpURLConnection m22014a(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection a = mo54925a(url);
        a.setConnectTimeout(this.f18132c);
        a.setReadTimeout(this.f18133d);
        HashMap hashMap = new HashMap();
        C7691t.C7697f fVar = this.f18135f;
        if (fVar != null) {
            hashMap.putAll(fVar.mo54932a());
        }
        hashMap.putAll(this.f18136g.mo54932a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            a.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a2 = C7698u.m22050a(j, j2);
        if (a2 != null) {
            a.setRequestProperty("Range", a2);
        }
        String str = this.f18134e;
        if (str != null) {
            a.setRequestProperty("User-Agent", str);
        }
        a.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        a.setInstanceFollowRedirects(z2);
        a.setDoOutput(bArr != null);
        a.setRequestMethod(C7674l.m21958a(i));
        if (bArr != null) {
            a.setFixedLengthStreamingMode(bArr.length);
            a.connect();
            OutputStream outputStream = a.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            a.connect();
        }
        return a;
    }

    /* renamed from: a */
    private URL m22015a(URL url, String str, C7674l lVar) throws C7691t.C7694c {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new C7691t.C7694c("Unsupported protocol redirect: " + protocol, lVar, 2001, 1);
                } else if (this.f18131b || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    throw new C7691t.C7694c("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", lVar, 2001, 1);
                }
            } catch (MalformedURLException e) {
                throw new C7691t.C7694c((IOException) e, lVar, 2001, 1);
            }
        } else {
            throw new C7691t.C7694c("Null location redirect", lVar, 2001, 1);
        }
    }

    /* renamed from: a */
    private void m22016a(long j, C7674l lVar) throws IOException {
        if (j != 0) {
            byte[] bArr = new byte[4096];
            while (j > 0) {
                int read = ((InputStream) C7728ai.m22198a(this.f18141l)).read(bArr, 0, (int) Math.min(j, (long) 4096));
                if (Thread.currentThread().isInterrupted()) {
                    throw new C7691t.C7694c((IOException) new InterruptedIOException(), lVar, 2000, 1);
                } else if (read != -1) {
                    j -= (long) read;
                    mo54897a(read);
                } else {
                    throw new C7691t.C7694c(lVar, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m22017a(HttpURLConnection httpURLConnection, long j) {
        if (httpURLConnection != null && C7728ai.f18249a >= 19 && C7728ai.f18249a <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = ((Class) C7717a.m22120b(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static boolean m22018a(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /* renamed from: b */
    private int m22019b(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f18144o;
        if (j != -1) {
            long j2 = j - this.f18145p;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min((long) i2, j2);
        }
        int read = ((InputStream) C7728ai.m22198a(this.f18141l)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f18145p += (long) read;
        mo54897a(read);
        return read;
    }

    /* renamed from: d */
    private HttpURLConnection m22020d(C7674l lVar) throws IOException {
        HttpURLConnection a;
        C7674l lVar2 = lVar;
        URL url = new URL(lVar2.f18057a.toString());
        int i = lVar2.f18059c;
        byte[] bArr = lVar2.f18060d;
        long j = lVar2.f18063g;
        long j2 = lVar2.f18064h;
        boolean b = lVar2.mo54908b(1);
        if (!this.f18131b && !this.f18137h) {
            return m22014a(url, i, bArr, j, j2, b, true, lVar2.f18061e);
        }
        URL url2 = url;
        int i2 = i;
        byte[] bArr2 = bArr;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 <= 20) {
                long j3 = j;
                int i5 = i2;
                long j4 = j;
                int i6 = i4;
                URL url3 = url2;
                long j5 = j2;
                a = m22014a(url2, i2, bArr2, j3, j2, b, false, lVar2.f18061e);
                int responseCode = a.getResponseCode();
                String headerField = a.getHeaderField(LogConstants.EVENT_LOCATION);
                if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    a.disconnect();
                    url2 = m22015a(url3, headerField, lVar2);
                    i2 = i5;
                } else if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return a;
                } else {
                    a.disconnect();
                    if (!(this.f18137h && responseCode == 302)) {
                        bArr2 = null;
                        i2 = 1;
                    } else {
                        i2 = i5;
                    }
                    url2 = m22015a(url3, headerField, lVar2);
                }
                i3 = i6;
                j = j4;
                j2 = j5;
            } else {
                throw new C7691t.C7694c((IOException) new NoRouteToHostException("Too many redirects: " + i4), lVar2, 2001, 1);
            }
        }
        return a;
    }

    /* renamed from: e */
    private void m22021e() {
        HttpURLConnection httpURLConnection = this.f18140k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C7755q.m22362c("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f18140k = null;
        }
    }

    /* renamed from: a */
    public int mo53898a(byte[] bArr, int i, int i2) throws C7691t.C7694c {
        try {
            return m22019b(bArr, i, i2);
        } catch (IOException e) {
            throw C7691t.C7694c.m22046a(e, (C7674l) C7728ai.m22198a(this.f18139j), 2);
        }
    }

    /* renamed from: a */
    public long mo54522a(C7674l lVar) throws C7691t.C7694c {
        byte[] bArr;
        this.f18139j = lVar;
        long j = 0;
        this.f18145p = 0;
        this.f18144o = 0;
        mo54898b(lVar);
        try {
            HttpURLConnection d = m22020d(lVar);
            this.f18140k = d;
            this.f18143n = d.getResponseCode();
            String responseMessage = d.getResponseMessage();
            int i = this.f18143n;
            long j2 = -1;
            if (i < 200 || i > 299) {
                Map headerFields = d.getHeaderFields();
                if (this.f18143n == 416) {
                    if (lVar.f18063g == C7698u.m22048a(d.getHeaderField("Content-Range"))) {
                        this.f18142m = true;
                        mo54899c(lVar);
                        if (lVar.f18064h != -1) {
                            return lVar.f18064h;
                        }
                        return 0;
                    }
                }
                InputStream errorStream = d.getErrorStream();
                if (errorStream != null) {
                    try {
                        bArr = C7728ai.m22219a(errorStream);
                    } catch (IOException unused) {
                        bArr = C7728ai.f18254f;
                    }
                } else {
                    bArr = C7728ai.f18254f;
                }
                byte[] bArr2 = bArr;
                m22021e();
                throw new C7691t.C7696e(this.f18143n, responseMessage, this.f18143n == 416 ? new C7672j(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, lVar, bArr2);
            }
            String contentType = d.getContentType();
            Predicate<String> predicate = this.f18138i;
            if (predicate == null || predicate.apply(contentType)) {
                if (this.f18143n == 200 && lVar.f18063g != 0) {
                    j = lVar.f18063g;
                }
                boolean a = m22018a(d);
                if (a || lVar.f18064h != -1) {
                    this.f18144o = lVar.f18064h;
                } else {
                    long a2 = C7698u.m22049a(d.getHeaderField("Content-Length"), d.getHeaderField("Content-Range"));
                    if (a2 != -1) {
                        j2 = a2 - j;
                    }
                    this.f18144o = j2;
                }
                try {
                    this.f18141l = d.getInputStream();
                    if (a) {
                        this.f18141l = new GZIPInputStream(this.f18141l);
                    }
                    this.f18142m = true;
                    mo54899c(lVar);
                    try {
                        m22016a(j, lVar);
                        return this.f18144o;
                    } catch (IOException e) {
                        m22021e();
                        if (e instanceof C7691t.C7694c) {
                            throw ((C7691t.C7694c) e);
                        }
                        throw new C7691t.C7694c(e, lVar, 2000, 1);
                    }
                } catch (IOException e2) {
                    m22021e();
                    throw new C7691t.C7694c(e2, lVar, 2000, 1);
                }
            } else {
                m22021e();
                throw new C7691t.C7695d(contentType, lVar);
            }
        } catch (IOException e3) {
            m22021e();
            throw C7691t.C7694c.m22046a(e3, lVar, 1);
        }
    }

    /* renamed from: a */
    public Uri mo54523a() {
        HttpURLConnection httpURLConnection = this.f18140k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public HttpURLConnection mo54925a(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: b */
    public Map<String, List<String>> mo54525b() {
        HttpURLConnection httpURLConnection = this.f18140k;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    /* renamed from: c */
    public void mo54526c() throws C7691t.C7694c {
        try {
            InputStream inputStream = this.f18141l;
            if (inputStream != null) {
                long j = -1;
                if (this.f18144o != -1) {
                    j = this.f18144o - this.f18145p;
                }
                m22017a(this.f18140k, j);
                inputStream.close();
            }
            this.f18141l = null;
            m22021e();
            if (this.f18142m) {
                this.f18142m = false;
                mo54900d();
            }
        } catch (IOException e) {
            throw new C7691t.C7694c(e, (C7674l) C7728ai.m22198a(this.f18139j), 2000, 3);
        } catch (Throwable th) {
            this.f18141l = null;
            m22021e();
            if (this.f18142m) {
                this.f18142m = false;
                mo54900d();
            }
            throw th;
        }
    }
}
