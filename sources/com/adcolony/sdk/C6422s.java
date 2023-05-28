package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C6288e0;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;

/* renamed from: com.adcolony.sdk.s */
class C6422s implements Runnable {

    /* renamed from: a */
    private HttpURLConnection f13788a;

    /* renamed from: b */
    private InputStream f13789b;

    /* renamed from: c */
    private C6312h0 f13790c;

    /* renamed from: d */
    private C6423a f13791d;

    /* renamed from: e */
    private C6295g f13792e = null;

    /* renamed from: f */
    private String f13793f;

    /* renamed from: g */
    private int f13794g = 0;

    /* renamed from: h */
    private boolean f13795h = false;

    /* renamed from: i */
    private Map<String, List<String>> f13796i;

    /* renamed from: j */
    private String f13797j = "";

    /* renamed from: k */
    private String f13798k = "";

    /* renamed from: l */
    String f13799l = "";

    /* renamed from: m */
    String f13800m = "";

    /* renamed from: n */
    boolean f13801n;

    /* renamed from: o */
    int f13802o;

    /* renamed from: p */
    int f13803p;

    /* renamed from: com.adcolony.sdk.s$a */
    interface C6423a {
        /* renamed from: a */
        void mo50823a(C6422s sVar, C6312h0 h0Var, Map<String, List<String>> map);
    }

    C6422s(C6312h0 h0Var, C6423a aVar) {
        this.f13790c = h0Var;
        this.f13791d = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        r1 = "UTF-8";
        r2 = r7.f13793f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r2 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        if (r2.isEmpty() != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        r1 = r7.f13793f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if ((r9 instanceof java.io.ByteArrayOutputStream) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        r2 = r7.f13788a.getHeaderField("Content-Type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r7.f13792e == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r2 == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r2.contains("application/octet-stream") == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        if (((java.io.ByteArrayOutputStream) r9).size() == 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        r7.f13800m = r7.f13792e.mo50714b(((java.io.ByteArrayOutputStream) r9).toByteArray());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        r7.f13800m = ((java.io.ByteArrayOutputStream) r9).toString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        if (r9 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (r8 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ac, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15699a(java.io.InputStream r8, java.io.OutputStream r9) throws java.lang.Exception {
        /*
            r7 = this;
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00ba }
            r0.<init>(r8)     // Catch:{ all -> 0x00ba }
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x00b0 }
        L_0x0009:
            r3 = 0
            int r4 = r0.read(r2, r3, r1)     // Catch:{ all -> 0x00b0 }
            r5 = -1
            if (r4 == r5) goto L_0x0058
            int r5 = r7.f13802o     // Catch:{ all -> 0x00b0 }
            int r5 = r5 + r4
            r7.f13802o = r5     // Catch:{ all -> 0x00b0 }
            boolean r6 = r7.f13795h     // Catch:{ all -> 0x00b0 }
            if (r6 == 0) goto L_0x0054
            int r6 = r7.f13794g     // Catch:{ all -> 0x00b0 }
            if (r5 > r6) goto L_0x001f
            goto L_0x0054
        L_0x001f:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r2.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "Data exceeds expected maximum ("
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            int r3 = r7.f13802o     // Catch:{ all -> 0x00b0 }
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            int r3 = r7.f13794g     // Catch:{ all -> 0x00b0 }
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "): "
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            java.net.HttpURLConnection r3 = r7.f13788a     // Catch:{ all -> 0x00b0 }
            java.net.URL r3 = r3.getURL()     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00b0 }
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00b0 }
            r1.<init>(r2)     // Catch:{ all -> 0x00b0 }
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x0054:
            r9.write(r2, r3, r4)     // Catch:{ all -> 0x00b0 }
            goto L_0x0009
        L_0x0058:
            java.lang.String r1 = "UTF-8"
            java.lang.String r2 = r7.f13793f     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x0066
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00b0 }
            if (r2 != 0) goto L_0x0066
            java.lang.String r1 = r7.f13793f     // Catch:{ all -> 0x00b0 }
        L_0x0066:
            boolean r2 = r9 instanceof java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x00a2
            java.net.HttpURLConnection r2 = r7.f13788a     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r2 = r2.getHeaderField(r3)     // Catch:{ all -> 0x00b0 }
            com.adcolony.sdk.g r3 = r7.f13792e     // Catch:{ all -> 0x00b0 }
            if (r3 == 0) goto L_0x0099
            if (r2 == 0) goto L_0x0099
            java.lang.String r3 = "application/octet-stream"
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x0099
            r2 = r9
            java.io.ByteArrayOutputStream r2 = (java.io.ByteArrayOutputStream) r2     // Catch:{ all -> 0x00b0 }
            int r2 = r2.size()     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x0099
            com.adcolony.sdk.g r1 = r7.f13792e     // Catch:{ all -> 0x00b0 }
            r2 = r9
            java.io.ByteArrayOutputStream r2 = (java.io.ByteArrayOutputStream) r2     // Catch:{ all -> 0x00b0 }
            byte[] r2 = r2.toByteArray()     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = r1.mo50714b(r2)     // Catch:{ all -> 0x00b0 }
            r7.f13800m = r1     // Catch:{ all -> 0x00b0 }
            goto L_0x00a2
        L_0x0099:
            r2 = r9
            java.io.ByteArrayOutputStream r2 = (java.io.ByteArrayOutputStream) r2     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = r2.toString(r1)     // Catch:{ all -> 0x00b0 }
            r7.f13800m = r1     // Catch:{ all -> 0x00b0 }
        L_0x00a2:
            r0.close()     // Catch:{ all -> 0x00ba }
            if (r9 == 0) goto L_0x00aa
            r9.close()
        L_0x00aa:
            if (r8 == 0) goto L_0x00af
            r8.close()
        L_0x00af:
            return
        L_0x00b0:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x00b5 }
            goto L_0x00b9
        L_0x00b5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ba }
        L_0x00b9:
            throw r1     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            if (r9 == 0) goto L_0x00c0
            r9.close()
        L_0x00c0:
            if (r8 == 0) goto L_0x00c5
            r8.close()
        L_0x00c5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C6422s.m15699a(java.io.InputStream, java.io.OutputStream):void");
    }

    /* renamed from: c */
    private boolean m15701c() throws IOException {
        C6294f1 a = this.f13790c.mo50732a();
        String h = C6235c0.m15087h(a, "content_type");
        String h2 = C6235c0.m15087h(a, AppLovinEventTypes.USER_VIEWED_CONTENT);
        C6294f1 n = a.mo50705n("dictionaries");
        C6294f1 n2 = a.mo50705n("dictionaries_mapping");
        this.f13799l = C6235c0.m15087h(a, "url");
        if (n != null) {
            C6295g.m15273a(n.mo50696f());
        }
        if (C6185a.m14887b().mo50768H() && n2 != null) {
            this.f13792e = C6295g.m15271a(C6235c0.m15088i(n2, "request"), C6235c0.m15088i(n2, "response"));
        }
        String h3 = C6235c0.m15087h(a, "user_agent");
        int a2 = C6235c0.m15057a(a, "read_timeout", 60000);
        int a3 = C6235c0.m15057a(a, "connect_timeout", 60000);
        boolean b = C6235c0.m15076b(a, "no_redirect");
        this.f13799l = C6235c0.m15087h(a, "url");
        this.f13797j = C6235c0.m15087h(a, "filepath");
        StringBuilder sb = new StringBuilder();
        sb.append(C6185a.m14887b().mo50815z().mo51055d());
        String str = this.f13797j;
        sb.append(str.substring(str.lastIndexOf("/") + 1));
        this.f13798k = sb.toString();
        this.f13793f = C6235c0.m15087h(a, "encoding");
        int a4 = C6235c0.m15057a(a, "max_size", 0);
        this.f13794g = a4;
        this.f13795h = a4 != 0;
        this.f13802o = 0;
        this.f13789b = null;
        this.f13788a = null;
        this.f13796i = null;
        if (!this.f13799l.startsWith("file://")) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f13799l).openConnection();
            this.f13788a = httpURLConnection;
            httpURLConnection.setReadTimeout(a2);
            this.f13788a.setConnectTimeout(a3);
            this.f13788a.setInstanceFollowRedirects(!b);
            if (h3 != null && !h3.equals("")) {
                this.f13788a.setRequestProperty("User-Agent", h3);
            }
            if (this.f13792e != null) {
                this.f13788a.setRequestProperty("Content-Type", "application/octet-stream");
                this.f13788a.setRequestProperty("Req-Dict-Id", this.f13792e.mo50713b());
                this.f13788a.setRequestProperty("Resp-Dict-Id", this.f13792e.mo50715c());
            } else {
                this.f13788a.setRequestProperty("Accept-Charset", C6311h.f13542a.name());
                if (!h.equals("")) {
                    this.f13788a.setRequestProperty("Content-Type", h);
                }
            }
            if (this.f13790c.mo50734b().equals("WebServices.post")) {
                this.f13788a.setDoOutput(true);
                C6295g gVar = this.f13792e;
                if (gVar != null) {
                    byte[] a5 = gVar.mo50711a(h2);
                    this.f13788a.setFixedLengthStreamingMode(a5.length);
                    this.f13788a.getOutputStream().write(a5);
                    this.f13788a.getOutputStream().flush();
                } else {
                    this.f13788a.setFixedLengthStreamingMode(h2.getBytes(C6311h.f13542a).length);
                    new PrintStream(this.f13788a.getOutputStream()).print(h2);
                }
            }
        } else if (this.f13799l.startsWith("file:///android_asset/")) {
            Context a6 = C6185a.m14880a();
            if (a6 != null) {
                this.f13789b = a6.getAssets().open(this.f13799l.substring(22));
            }
        } else {
            this.f13789b = new FileInputStream(this.f13799l.substring(7));
        }
        if (this.f13788a == null && this.f13789b == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m15702d() throws Exception {
        OutputStream outputStream;
        InputStream inputStream;
        String b = this.f13790c.mo50734b();
        if (this.f13789b != null) {
            outputStream = this.f13797j.length() == 0 ? new ByteArrayOutputStream(4096) : new FileOutputStream(new File(this.f13797j).getAbsolutePath());
        } else if (b.equals("WebServices.download")) {
            this.f13789b = this.f13788a.getInputStream();
            outputStream = new FileOutputStream(this.f13798k);
        } else if (b.equals("WebServices.get")) {
            this.f13789b = this.f13788a.getInputStream();
            outputStream = new ByteArrayOutputStream(4096);
        } else if (b.equals("WebServices.post")) {
            this.f13788a.connect();
            if (this.f13788a.getResponseCode() < 200 || this.f13788a.getResponseCode() > 299) {
                inputStream = this.f13788a.getErrorStream();
            } else {
                inputStream = this.f13788a.getInputStream();
            }
            this.f13789b = inputStream;
            outputStream = new ByteArrayOutputStream(4096);
        } else {
            outputStream = null;
        }
        HttpURLConnection httpURLConnection = this.f13788a;
        if (httpURLConnection != null) {
            this.f13803p = httpURLConnection.getResponseCode();
            this.f13796i = this.f13788a.getHeaderFields();
        }
        m15699a(this.f13789b, outputStream);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6312h0 mo50984b() {
        return this.f13790c;
    }

    public void run() {
        boolean z;
        boolean z2 = false;
        this.f13801n = false;
        try {
            if (m15701c()) {
                m15702d();
                if (this.f13790c.mo50734b().equals("WebServices.post")) {
                    if (this.f13803p != 200) {
                        z = false;
                        this.f13801n = z;
                    }
                }
                z = true;
                this.f13801n = z;
            }
        } catch (MalformedURLException e) {
            new C6288e0.C6289a().mo50644a("MalformedURLException: ").mo50644a(e.toString()).mo50645a(C6288e0.f13498i);
            this.f13801n = true;
        } catch (OutOfMemoryError unused) {
            C6288e0.C6289a a = new C6288e0.C6289a().mo50644a("Out of memory error - disabling AdColony. (").mo50642a(this.f13802o).mo50644a("/").mo50642a(this.f13794g);
            a.mo50644a("): " + this.f13799l).mo50645a(C6288e0.f13497h);
            C6185a.m14887b().mo50786b(true);
        } catch (IOException e2) {
            new C6288e0.C6289a().mo50644a("Download of ").mo50644a(this.f13799l).mo50644a(" failed: ").mo50644a(e2.toString()).mo50645a(C6288e0.f13496g);
            int i = this.f13803p;
            if (i == 0) {
                i = 504;
            }
            this.f13803p = i;
        } catch (IllegalStateException e3) {
            new C6288e0.C6289a().mo50644a("okhttp error: ").mo50644a(e3.toString()).mo50645a(C6288e0.f13497h);
            e3.printStackTrace();
        } catch (DataFormatException e4) {
            new C6288e0.C6289a().mo50644a("Exception, possibly trying to decompress plain response: ").mo50644a(e4.toString()).mo50645a(C6288e0.f13498i);
            e4.printStackTrace();
        } catch (IllegalArgumentException e5) {
            new C6288e0.C6289a().mo50644a("Exception, possibly response encoded with different dictionary: ").mo50644a(e5.toString()).mo50645a(C6288e0.f13498i);
            e5.printStackTrace();
        } catch (AssertionError e6) {
            new C6288e0.C6289a().mo50644a("okhttp error: ").mo50644a(e6.toString()).mo50645a(C6288e0.f13497h);
            e6.printStackTrace();
        } catch (Exception e7) {
            new C6288e0.C6289a().mo50644a("Exception: ").mo50644a(e7.toString()).mo50645a(C6288e0.f13497h);
            e7.printStackTrace();
        }
        z2 = true;
        if (z2) {
            if (this.f13790c.mo50734b().equals("WebServices.download")) {
                m15700a(this.f13798k, this.f13797j);
            }
            this.f13791d.mo50823a(this, this.f13790c, this.f13796i);
        }
    }

    /* renamed from: a */
    private void m15700a(String str, String str2) {
        try {
            String substring = str2.substring(0, str2.lastIndexOf("/") + 1);
            if (!str2.equals("") && !substring.equals(C6185a.m14887b().mo50815z().mo51055d()) && !new File(str).renameTo(new File(str2))) {
                new C6288e0.C6289a().mo50644a("Moving of ").mo50644a(str).mo50644a(" failed.").mo50645a(C6288e0.f13496g);
            }
        } catch (Exception e) {
            new C6288e0.C6289a().mo50644a("Exception: ").mo50644a(e.toString()).mo50645a(C6288e0.f13497h);
            e.printStackTrace();
        }
    }
}
