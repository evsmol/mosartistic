package com.applovin.impl.sdk.network;

import androidx.core.util.Consumer;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8520e;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.C8572i;
import com.applovin.impl.sdk.utils.C8622s;
import com.applovin.impl.sdk.utils.C8623t;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.SAXException;

/* renamed from: com.applovin.impl.sdk.network.b */
public class C8511b {

    /* renamed from: a */
    private static final List<String> f21436a = Arrays.asList(new String[]{"5.0/i", "4.0/ad", "1.0/mediate"});
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8490n f21437b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8626v f21438c;

    /* renamed from: d */
    private C8520e f21439d;

    /* renamed from: com.applovin.impl.sdk.network.b$a */
    public static class C8513a {

        /* renamed from: a */
        private long f21440a;

        /* renamed from: b */
        private long f21441b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m25754a(long j) {
            this.f21440a = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m25756b(long j) {
            this.f21441b = j;
        }

        /* renamed from: a */
        public long mo57502a() {
            return this.f21440a;
        }

        /* renamed from: b */
        public long mo57503b() {
            return this.f21441b;
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.b$b */
    private class C8514b<T> implements Consumer<C8520e.C8526c> {

        /* renamed from: b */
        private final String f21443b;

        /* renamed from: c */
        private final C8516c<T> f21444c;

        /* renamed from: d */
        private final String f21445d;

        /* renamed from: e */
        private final T f21446e;

        /* renamed from: f */
        private final boolean f21447f;

        /* renamed from: g */
        private final long f21448g;

        /* renamed from: h */
        private final C8513a f21449h;

        /* renamed from: i */
        private final C8515c<T> f21450i;

        private C8514b(String str, C8516c<T> cVar, String str2, T t, boolean z, long j, C8513a aVar, C8515c<T> cVar2) {
            this.f21443b = str;
            this.f21444c = cVar;
            this.f21445d = str2;
            this.f21446e = t;
            this.f21447f = z;
            this.f21448g = j;
            this.f21449h = aVar;
            this.f21450i = cVar2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0134, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0135, code lost:
            if (r2 == 0) goto L_0x0137;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0137, code lost:
            r2 = com.applovin.impl.sdk.network.C8511b.m25738a(r11.f21442a, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
            r12 = r12.mo57561c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0141, code lost:
            if (r12 != null) goto L_0x0143;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0145, code lost:
            if (r11.f21447f != false) goto L_0x0147;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0147, code lost:
            r12 = com.applovin.impl.sdk.utils.C8614n.m26192a(r12, com.applovin.impl.sdk.network.C8511b.m25740a(r11.f21442a).mo57319C());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0155, code lost:
            r1 = com.applovin.impl.sdk.network.C8511b.m25741a(r11.f21442a, r12, (java.lang.Object) r11.f21446e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0174, code lost:
            r12 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0175, code lost:
            r0 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x017c, code lost:
            com.applovin.impl.sdk.network.C8511b.m25747a(r11.f21442a, r11.f21445d, r11.f21443b, r0, r11.f21448g, r12);
            r11.f21450i.mo56275a(-901, r12.getMessage(), null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0193, code lost:
            com.applovin.impl.sdk.network.C8511b.m25746a(r11.f21442a, r11.f21445d, r11.f21443b, r0, r11.f21448g);
            r11.f21450i.mo56277a(r11.f21446e, -901);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0134 A[ExcHandler: all (r0v5 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r2 
          PHI: (r2v3 int) = (r2v0 int), (r2v7 int), (r2v7 int), (r2v7 int) binds: [B:1:0x0004, B:4:0x000a, B:36:0x00cc, B:18:0x0049] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0004] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x017c  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0193  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(com.applovin.impl.sdk.network.C8520e.C8526c r12) {
            /*
                r11 = this;
                java.lang.String r0 = "ConnectionManager"
                r1 = 0
                r2 = 0
                int r2 = r12.mo57559a()     // Catch:{ MalformedURLException -> 0x0174, all -> 0x0134 }
                if (r2 <= 0) goto L_0x0121
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                long r5 = r11.f21448g     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                long r3 = r3 - r5
                r5 = 200(0xc8, float:2.8E-43)
                if (r2 < r5) goto L_0x011a
                r5 = 400(0x190, float:5.6E-43)
                if (r2 >= r5) goto L_0x011a
                com.applovin.impl.sdk.network.b$a r5 = r11.f21449h     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                if (r5 == 0) goto L_0x0022
                com.applovin.impl.sdk.network.b$a r5 = r11.f21449h     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                r5.m25754a(r3)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
            L_0x0022:
                com.applovin.impl.sdk.network.b r3 = com.applovin.impl.sdk.network.C8511b.this     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                java.lang.String r4 = r11.f21445d     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                java.lang.String r5 = r11.f21443b     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                long r7 = r11.f21448g     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                r6 = r2
                r3.m25748a((java.lang.String) r4, (java.lang.String) r5, (int) r6, (long) r7)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                java.lang.String r3 = r12.mo57560b()     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.impl.sdk.network.b r4 = com.applovin.impl.sdk.network.C8511b.this     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.impl.sdk.n r4 = r4.f21437b     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                android.content.Context r4 = r4.mo57332P()     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                boolean r4 = com.applovin.impl.sdk.utils.Utils.isDspDemoApp(r4)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                if (r4 == 0) goto L_0x006a
                java.lang.String r4 = ""
                if (r3 == 0) goto L_0x0048
                r5 = r3
                goto L_0x0049
            L_0x0048:
                r5 = r4
            L_0x0049:
                com.applovin.impl.sdk.network.c<T> r6 = r11.f21444c     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                org.json.JSONObject r6 = r6.mo57512e()     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                if (r6 == 0) goto L_0x005b
                com.applovin.impl.sdk.network.c<T> r4 = r11.f21444c     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                org.json.JSONObject r4 = r4.mo57512e()     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                java.lang.String r4 = r4.toString()     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
            L_0x005b:
                com.applovin.impl.sdk.network.b r6 = com.applovin.impl.sdk.network.C8511b.this     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.impl.sdk.n r6 = r6.f21437b     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.impl.sdk.j r6 = r6.mo57369aj()     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                java.lang.String r7 = r11.f21443b     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                r6.mo57294a(r5, r7, r4)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
            L_0x006a:
                if (r3 == 0) goto L_0x0111
                com.applovin.impl.sdk.network.b r4 = com.applovin.impl.sdk.network.C8511b.this     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.impl.sdk.v r4 = r4.f21438c     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                r4.mo57816a((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.impl.sdk.network.b$a r4 = r11.f21449h     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                if (r4 == 0) goto L_0x0083
                com.applovin.impl.sdk.network.b$a r4 = r11.f21449h     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                int r5 = r3.length()     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                long r5 = (long) r5     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                r4.m25756b(r5)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
            L_0x0083:
                boolean r4 = r11.f21447f     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                if (r4 == 0) goto L_0x00bc
                com.applovin.impl.sdk.network.b r4 = com.applovin.impl.sdk.network.C8511b.this     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.impl.sdk.n r4 = r4.f21437b     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                java.lang.String r4 = r4.mo57319C()     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                java.lang.String r4 = com.applovin.impl.sdk.utils.C8614n.m26192a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                if (r4 != 0) goto L_0x00bb
                r5 = 2
                java.util.Map r5 = com.applovin.impl.sdk.utils.CollectionUtils.map((int) r5)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                java.lang.String r6 = "request"
                java.lang.String r7 = r11.f21443b     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                java.lang.String r7 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r7)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                r5.put(r6, r7)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                java.lang.String r6 = "response"
                r5.put(r6, r3)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.impl.sdk.network.b r3 = com.applovin.impl.sdk.network.C8511b.this     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.impl.sdk.n r3 = r3.f21437b     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.sdk.AppLovinEventService r3 = r3.mo57408x()     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                java.lang.String r6 = "rdf"
                r3.trackEvent(r6, r5)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
            L_0x00bb:
                r3 = r4
            L_0x00bc:
                com.applovin.impl.sdk.network.b r4 = com.applovin.impl.sdk.network.C8511b.this     // Catch:{ all -> 0x00cb }
                T r5 = r11.f21446e     // Catch:{ all -> 0x00cb }
                java.lang.Object r3 = r4.m25742a((java.lang.String) r3, r5)     // Catch:{ all -> 0x00cb }
                com.applovin.impl.sdk.network.b$c<T> r4 = r11.f21450i     // Catch:{ all -> 0x00cb }
                r4.mo56277a(r3, r2)     // Catch:{ all -> 0x00cb }
                goto L_0x01a6
            L_0x00cb:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                r4.<init>()     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                java.lang.String r5 = "Unable to parse response from "
                r4.append(r5)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.impl.sdk.network.b r5 = com.applovin.impl.sdk.network.C8511b.this     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                java.lang.String r6 = r11.f21443b     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                java.lang.String r5 = r5.m25744a((java.lang.String) r6)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                r4.append(r5)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                java.lang.String r4 = r4.toString()     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.impl.sdk.network.b r5 = com.applovin.impl.sdk.network.C8511b.this     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.impl.sdk.C8626v unused = r5.f21438c     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                boolean r5 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                if (r5 == 0) goto L_0x00f9
                com.applovin.impl.sdk.network.b r5 = com.applovin.impl.sdk.network.C8511b.this     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.impl.sdk.v r5 = r5.f21438c     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                r5.mo57819b(r0, r4, r3)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
            L_0x00f9:
                com.applovin.impl.sdk.network.b r0 = com.applovin.impl.sdk.network.C8511b.this     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.impl.sdk.n r0 = r0.f21437b     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.impl.sdk.d.g r0 = r0.mo57338W()     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.impl.sdk.d.f r3 = com.applovin.impl.sdk.p255d.C8394f.f21092k     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                r0.mo57151a((com.applovin.impl.sdk.p255d.C8394f) r3)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.impl.sdk.network.b$c<T> r0 = r11.f21450i     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                r3 = -800(0xfffffffffffffce0, float:NaN)
                r0.mo56275a(r3, r4, r1)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                goto L_0x01a6
            L_0x0111:
                com.applovin.impl.sdk.network.b$c<T> r0 = r11.f21450i     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                T r3 = r11.f21446e     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                r0.mo56277a(r3, r2)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                goto L_0x01a6
            L_0x011a:
                com.applovin.impl.sdk.network.b$c<T> r0 = r11.f21450i     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
            L_0x011c:
                r0.mo56275a(r2, r1, r1)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                goto L_0x01a6
            L_0x0121:
                com.applovin.impl.sdk.network.b r3 = com.applovin.impl.sdk.network.C8511b.this     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                java.lang.String r4 = r11.f21445d     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                java.lang.String r5 = r11.f21443b     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                long r7 = r11.f21448g     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                r9 = 0
                r6 = r2
                r3.m25749a((java.lang.String) r4, (java.lang.String) r5, (int) r6, (long) r7, (java.lang.Throwable) r9)     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                com.applovin.impl.sdk.network.b$c<T> r0 = r11.f21450i     // Catch:{ MalformedURLException -> 0x0131, all -> 0x0134 }
                goto L_0x011c
            L_0x0131:
                r12 = move-exception
                r0 = r2
                goto L_0x0176
            L_0x0134:
                r0 = move-exception
                if (r2 != 0) goto L_0x013d
                com.applovin.impl.sdk.network.b r2 = com.applovin.impl.sdk.network.C8511b.this
                int r2 = r2.m25739a((java.lang.Throwable) r0)
            L_0x013d:
                java.lang.String r12 = r12.mo57561c()     // Catch:{ all -> 0x015d }
                if (r12 == 0) goto L_0x015d
                boolean r3 = r11.f21447f     // Catch:{ all -> 0x015d }
                if (r3 == 0) goto L_0x0155
                com.applovin.impl.sdk.network.b r3 = com.applovin.impl.sdk.network.C8511b.this     // Catch:{ all -> 0x015d }
                com.applovin.impl.sdk.n r3 = r3.f21437b     // Catch:{ all -> 0x015d }
                java.lang.String r3 = r3.mo57319C()     // Catch:{ all -> 0x015d }
                java.lang.String r12 = com.applovin.impl.sdk.utils.C8614n.m26192a((java.lang.String) r12, (java.lang.String) r3)     // Catch:{ all -> 0x015d }
            L_0x0155:
                com.applovin.impl.sdk.network.b r3 = com.applovin.impl.sdk.network.C8511b.this     // Catch:{ all -> 0x015d }
                T r4 = r11.f21446e     // Catch:{ all -> 0x015d }
                java.lang.Object r1 = r3.m25742a((java.lang.String) r12, r4)     // Catch:{ all -> 0x015d }
            L_0x015d:
                com.applovin.impl.sdk.network.b r3 = com.applovin.impl.sdk.network.C8511b.this
                java.lang.String r4 = r11.f21445d
                java.lang.String r5 = r11.f21443b
                long r7 = r11.f21448g
                r6 = r2
                r9 = r0
                r3.m25749a((java.lang.String) r4, (java.lang.String) r5, (int) r6, (long) r7, (java.lang.Throwable) r9)
                com.applovin.impl.sdk.network.b$c<T> r12 = r11.f21450i
                java.lang.String r0 = r0.getMessage()
                r12.mo56275a(r2, r0, r1)
                goto L_0x01a6
            L_0x0174:
                r12 = move-exception
                r0 = 0
            L_0x0176:
                T r2 = r11.f21446e
                r10 = -901(0xfffffffffffffc7b, float:NaN)
                if (r2 == 0) goto L_0x0193
                com.applovin.impl.sdk.network.b r3 = com.applovin.impl.sdk.network.C8511b.this
                java.lang.String r4 = r11.f21445d
                java.lang.String r5 = r11.f21443b
                long r7 = r11.f21448g
                r6 = r0
                r9 = r12
                r3.m25749a((java.lang.String) r4, (java.lang.String) r5, (int) r6, (long) r7, (java.lang.Throwable) r9)
                com.applovin.impl.sdk.network.b$c<T> r0 = r11.f21450i
                java.lang.String r12 = r12.getMessage()
                r0.mo56275a(r10, r12, r1)
                goto L_0x01a6
            L_0x0193:
                com.applovin.impl.sdk.network.b r2 = com.applovin.impl.sdk.network.C8511b.this
                java.lang.String r3 = r11.f21445d
                java.lang.String r4 = r11.f21443b
                long r6 = r11.f21448g
                r5 = r0
                r2.m25748a((java.lang.String) r3, (java.lang.String) r4, (int) r5, (long) r6)
                com.applovin.impl.sdk.network.b$c<T> r12 = r11.f21450i
                T r0 = r11.f21446e
                r12.mo56277a(r0, r10)
            L_0x01a6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.C8511b.C8514b.accept(com.applovin.impl.sdk.network.e$c):void");
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.b$c */
    public interface C8515c<T> {
        /* renamed from: a */
        void mo56275a(int i, String str, T t);

        /* renamed from: a */
        void mo56277a(T t, int i);
    }

    public C8511b(C8490n nVar) {
        this.f21437b = nVar;
        this.f21438c = nVar.mo57320D();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m25739a(Throwable th) {
        if (th instanceof UnknownHostException) {
            return -1009;
        }
        if (th instanceof SocketTimeoutException) {
            return -1001;
        }
        if (th instanceof IOException) {
            return -100;
        }
        return th instanceof JSONException ? -104 : -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T> T m25742a(String str, T t) throws JSONException, SAXException, ClassCastException {
        if (t == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (t instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (t instanceof C8622s) {
                return C8623t.m26237a(str, this.f21437b);
            }
            if (t instanceof String) {
                return str;
            }
            if (C8626v.m26252a()) {
                C8626v vVar = this.f21438c;
                vVar.mo57822e("ConnectionManager", "Failed to process response of type '" + t.getClass().getName() + "'");
            }
        }
        return t;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m25744a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }

    /* renamed from: a */
    private HttpURLConnection m25745a(String str, String str2, Map<String, String> map, int i) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(i < 0 ? ((Integer) this.f21437b.mo57342a(C8380b.f20825cV)).intValue() : i);
        if (i < 0) {
            i = ((Integer) this.f21437b.mo57342a(C8380b.f20826cW)).intValue();
        }
        httpURLConnection.setReadTimeout(i);
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setDoInput(true);
        if (map != null && map.size() > 0) {
            for (Map.Entry next : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
        }
        return httpURLConnection;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25748a(String str, String str2, int i, long j) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.f21438c;
            vVar.mo57820c("ConnectionManager", "Successful " + str + " returned " + i + " in " + (((float) (System.currentTimeMillis() - j)) / 1000.0f) + " s over " + C8572i.m26110f(this.f21437b) + " to " + m25744a(str2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25749a(String str, String str2, int i, long j, Throwable th) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.f21438c;
            vVar.mo57819b("ConnectionManager", "Failed " + str + " returned " + i + " in " + (((float) (System.currentTimeMillis() - j)) / 1000.0f) + " s over " + C8572i.m26110f(this.f21437b) + " to " + m25744a(str2), th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x01f1 A[Catch:{ all -> 0x01c9, all -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x022f A[Catch:{ all -> 0x01c9, all -> 0x0293 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> void m25751b(com.applovin.impl.sdk.network.C8516c<T> r23, com.applovin.impl.sdk.network.C8511b.C8513a r24, com.applovin.impl.sdk.network.C8511b.C8515c<T> r25) {
        /*
            r22 = this;
            r13 = r22
            r14 = r25
            if (r23 == 0) goto L_0x02c7
            java.lang.String r0 = r23.mo57505a()
            java.lang.String r15 = r23.mo57508b()
            if (r0 == 0) goto L_0x02bf
            if (r15 == 0) goto L_0x02b7
            if (r14 == 0) goto L_0x02af
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r2 = "http"
            boolean r1 = r1.startsWith(r2)
            r12 = 0
            java.lang.String r2 = "ConnectionManager"
            if (r1 != 0) goto L_0x0042
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Requested postback submission to non HTTP endpoint "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = "; skipping..."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.applovin.impl.sdk.C8626v.m26258i(r2, r0)
            r1 = -900(0xfffffffffffffc7c, float:NaN)
            r14.mo56275a(r1, r0, r12)
            return
        L_0x0042:
            com.applovin.impl.sdk.n r1 = r13.f21437b
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r3 = com.applovin.impl.sdk.p254c.C8380b.f20827cX
            java.lang.Object r1 = r1.mo57342a(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0076
            java.lang.String r1 = "https://"
            boolean r3 = r0.contains(r1)
            if (r3 != 0) goto L_0x0076
            com.applovin.impl.sdk.n r3 = r13.f21437b
            r3.mo57320D()
            boolean r3 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r3 == 0) goto L_0x0070
            com.applovin.impl.sdk.n r3 = r13.f21437b
            com.applovin.impl.sdk.v r3 = r3.mo57320D()
            java.lang.String r4 = "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting..."
            r3.mo57821d(r2, r4)
        L_0x0070:
            java.lang.String r3 = "http://"
            java.lang.String r0 = r0.replace(r3, r1)
        L_0x0076:
            r1 = 2
            java.util.Map r1 = com.applovin.impl.sdk.utils.CollectionUtils.map((int) r1)
            boolean r7 = r23.mo57523n()
            com.applovin.impl.sdk.n r3 = r13.f21437b
            long r3 = com.applovin.impl.sdk.utils.Utils.getServerAdjustedUnixTimestampMillis(r3)
            java.util.Map r5 = r23.mo57510c()
            if (r5 == 0) goto L_0x0095
            java.util.Map r5 = r23.mo57510c()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x009b
        L_0x0095:
            int r5 = r23.mo57518i()
            if (r5 < 0) goto L_0x00fe
        L_0x009b:
            java.util.Map r5 = r23.mo57510c()
            com.applovin.impl.sdk.n r6 = r13.f21437b
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r8 = com.applovin.impl.sdk.p254c.C8380b.f20894dm
            java.lang.Object r6 = r6.mo57342a(r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r5 == 0) goto L_0x00c4
            int r8 = r23.mo57518i()
            if (r8 < 0) goto L_0x00c4
            int r8 = r23.mo57518i()
            if (r8 <= 0) goto L_0x00c4
            int r8 = r23.mo57518i()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "current_retry_attempt"
            r5.put(r9, r8)
        L_0x00c4:
            boolean r6 = r6.booleanValue()
            if (r7 == 0) goto L_0x00fa
            com.applovin.impl.sdk.n r8 = r13.f21437b
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.p254c.C8380b.f20895dn
            java.lang.Object r8 = r8.mo57342a(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            java.lang.String r5 = com.applovin.impl.sdk.utils.Utils.encodeUrlMap(r5, r6, r8)
            com.applovin.impl.sdk.n r6 = r13.f21437b
            java.lang.String r6 = r6.mo57319C()
            java.lang.String r6 = com.applovin.impl.sdk.utils.C8614n.m26193a((java.lang.String) r5, (java.lang.String) r6, (long) r3)
            boolean r8 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)
            if (r8 == 0) goto L_0x00f3
            if (r6 != 0) goto L_0x00f3
            java.lang.String r8 = "query"
            r1.put(r8, r5)
        L_0x00f3:
            java.lang.String r5 = "p"
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.appendQueryParameter(r0, r5, r6)
            goto L_0x00fe
        L_0x00fa:
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.appendQueryParameters(r0, r5, r6)
        L_0x00fe:
            r11 = r0
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r11)     // Catch:{ all -> 0x0293 }
            java.util.List<java.lang.String> r5 = f21436a     // Catch:{ all -> 0x0293 }
            java.lang.Boolean r0 = com.applovin.impl.sdk.utils.StringUtils.endsWith(r0, r5)     // Catch:{ all -> 0x0293 }
            boolean r5 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x0293 }
            if (r5 == 0) goto L_0x014e
            com.applovin.impl.sdk.v r5 = r13.f21438c     // Catch:{ all -> 0x0293 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0293 }
            r6.<init>()     // Catch:{ all -> 0x0293 }
            java.lang.String r8 = "Sending "
            r6.append(r8)     // Catch:{ all -> 0x0293 }
            r6.append(r15)     // Catch:{ all -> 0x0293 }
            java.lang.String r8 = " request to id=#"
            r6.append(r8)     // Catch:{ all -> 0x0293 }
            int r8 = r11.hashCode()     // Catch:{ all -> 0x0293 }
            r6.append(r8)     // Catch:{ all -> 0x0293 }
            java.lang.String r8 = " \""
            r6.append(r8)     // Catch:{ all -> 0x0293 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0293 }
            if (r0 == 0) goto L_0x013b
            r0 = r11
            goto L_0x013f
        L_0x013b:
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r11)     // Catch:{ all -> 0x0293 }
        L_0x013f:
            r6.append(r0)     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = "\"..."
            r6.append(r0)     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0293 }
            r5.mo57820c(r2, r0)     // Catch:{ all -> 0x0293 }
        L_0x014e:
            com.applovin.impl.sdk.network.e$b$a r0 = new com.applovin.impl.sdk.network.e$b$a     // Catch:{ all -> 0x0293 }
            r0.<init>()     // Catch:{ all -> 0x0293 }
            com.applovin.impl.sdk.network.e$b$a r0 = r0.mo57552a((java.lang.String) r11)     // Catch:{ all -> 0x0293 }
            com.applovin.impl.sdk.network.e$b$a r0 = r0.mo57558b((java.lang.String) r15)     // Catch:{ all -> 0x0293 }
            java.util.Map r5 = r23.mo57511d()     // Catch:{ all -> 0x0293 }
            com.applovin.impl.sdk.network.e$b$a r0 = r0.mo57554a((java.util.Map<java.lang.String, java.lang.String>) r5)     // Catch:{ all -> 0x0293 }
            int r5 = r23.mo57519j()     // Catch:{ all -> 0x0293 }
            com.applovin.impl.sdk.network.e$b$a r10 = r0.mo57550a((int) r5)     // Catch:{ all -> 0x0293 }
            org.json.JSONObject r0 = r23.mo57512e()     // Catch:{ all -> 0x0293 }
            if (r0 == 0) goto L_0x0236
            if (r7 == 0) goto L_0x0195
            org.json.JSONObject r0 = r23.mo57512e()     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0293 }
            com.applovin.impl.sdk.n r5 = r13.f21437b     // Catch:{ all -> 0x0293 }
            java.lang.String r5 = r5.mo57319C()     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = com.applovin.impl.sdk.utils.C8614n.m26193a((java.lang.String) r0, (java.lang.String) r5, (long) r3)     // Catch:{ all -> 0x0293 }
            if (r0 != 0) goto L_0x019d
            java.lang.String r3 = "body"
            org.json.JSONObject r4 = r23.mo57512e()     // Catch:{ all -> 0x0293 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0293 }
            r1.put(r3, r4)     // Catch:{ all -> 0x0293 }
            goto L_0x019d
        L_0x0195:
            org.json.JSONObject r0 = r23.mo57512e()     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0293 }
        L_0x019d:
            r3 = r0
            boolean r0 = r23.mo57524o()     // Catch:{ all -> 0x0293 }
            java.lang.String r4 = "UTF-8"
            if (r0 == 0) goto L_0x01ea
            if (r3 == 0) goto L_0x01ea
            int r0 = r3.length()     // Catch:{ all -> 0x0293 }
            com.applovin.impl.sdk.n r5 = r13.f21437b     // Catch:{ all -> 0x0293 }
            com.applovin.impl.sdk.c.b<java.lang.Integer> r6 = com.applovin.impl.sdk.p254c.C8380b.f20912eE     // Catch:{ all -> 0x0293 }
            java.lang.Object r5 = r5.mo57342a(r6)     // Catch:{ all -> 0x0293 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0293 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0293 }
            if (r0 <= r5) goto L_0x01ea
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r4)     // Catch:{ all -> 0x01c9 }
            byte[] r0 = r3.getBytes(r0)     // Catch:{ all -> 0x01c9 }
            byte[] r0 = com.applovin.impl.sdk.utils.Utils.gzip(r0)     // Catch:{ all -> 0x01c9 }
            goto L_0x01eb
        L_0x01c9:
            r0 = move-exception
            boolean r5 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x0293 }
            if (r5 == 0) goto L_0x01ea
            com.applovin.impl.sdk.v r5 = r13.f21438c     // Catch:{ all -> 0x0293 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0293 }
            r6.<init>()     // Catch:{ all -> 0x0293 }
            java.lang.String r8 = "Failed to gzip POST body for request "
            r6.append(r8)     // Catch:{ all -> 0x0293 }
            java.lang.String r8 = r13.m25744a((java.lang.String) r11)     // Catch:{ all -> 0x0293 }
            r6.append(r8)     // Catch:{ all -> 0x0293 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0293 }
            r5.mo57819b(r2, r6, r0)     // Catch:{ all -> 0x0293 }
        L_0x01ea:
            r0 = r12
        L_0x01eb:
            boolean r5 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x0293 }
            if (r5 == 0) goto L_0x0213
            com.applovin.impl.sdk.v r5 = r13.f21438c     // Catch:{ all -> 0x0293 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0293 }
            r6.<init>()     // Catch:{ all -> 0x0293 }
            java.lang.String r8 = "Request to "
            r6.append(r8)     // Catch:{ all -> 0x0293 }
            java.lang.String r8 = r13.m25744a((java.lang.String) r11)     // Catch:{ all -> 0x0293 }
            r6.append(r8)     // Catch:{ all -> 0x0293 }
            java.lang.String r8 = " is "
            r6.append(r8)     // Catch:{ all -> 0x0293 }
            r6.append(r3)     // Catch:{ all -> 0x0293 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0293 }
            r5.mo57818b(r2, r6)     // Catch:{ all -> 0x0293 }
        L_0x0213:
            java.lang.String r2 = "Content-Type"
            java.lang.String r5 = "application/json; charset=utf-8"
            r10.mo57553a(r2, r5)     // Catch:{ all -> 0x0293 }
            boolean r2 = r23.mo57524o()     // Catch:{ all -> 0x0293 }
            if (r2 == 0) goto L_0x022d
            if (r0 == 0) goto L_0x022d
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r3 = "gzip"
            r10.mo57553a(r2, r3)     // Catch:{ all -> 0x0293 }
            r10.mo57556a((byte[]) r0)     // Catch:{ all -> 0x0293 }
            goto L_0x0236
        L_0x022d:
            if (r3 == 0) goto L_0x0236
            byte[] r0 = r3.getBytes(r4)     // Catch:{ all -> 0x0293 }
            r10.mo57556a((byte[]) r0)     // Catch:{ all -> 0x0293 }
        L_0x0236:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0293 }
            if (r0 != 0) goto L_0x0250
            java.lang.String r0 = "request"
            java.lang.String r2 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r11)     // Catch:{ all -> 0x0293 }
            r1.put(r0, r2)     // Catch:{ all -> 0x0293 }
            com.applovin.impl.sdk.n r0 = r13.f21437b     // Catch:{ all -> 0x0293 }
            com.applovin.sdk.AppLovinEventService r0 = r0.mo57408x()     // Catch:{ all -> 0x0293 }
            java.lang.String r2 = "ref"
            r0.trackEvent(r2, r1)     // Catch:{ all -> 0x0293 }
        L_0x0250:
            com.applovin.impl.sdk.network.e r0 = r13.f21439d     // Catch:{ all -> 0x0293 }
            com.applovin.impl.sdk.network.b$b r8 = new com.applovin.impl.sdk.network.b$b     // Catch:{ all -> 0x0293 }
            java.lang.Object r6 = r23.mo57515g()     // Catch:{ all -> 0x0293 }
            r18 = 0
            r1 = r8
            r2 = r22
            r3 = r11
            r4 = r23
            r5 = r15
            r19 = r8
            r8 = r16
            r20 = r10
            r10 = r24
            r21 = r11
            r11 = r25
            r14 = r12
            r12 = r18
            r1.<init>(r3, r4, r5, r6, r7, r8, r10, r11)     // Catch:{ all -> 0x0291 }
            r2 = r19
            r1 = r20
            com.applovin.impl.sdk.network.e$b$a r1 = r1.mo57551a((androidx.core.util.Consumer<com.applovin.impl.sdk.network.C8520e.C8526c>) r2)     // Catch:{ all -> 0x0291 }
            com.applovin.impl.sdk.n r2 = r13.f21437b     // Catch:{ all -> 0x0291 }
            com.applovin.impl.sdk.e.o r2 = r2.mo57337V()     // Catch:{ all -> 0x0291 }
            java.util.concurrent.Executor r2 = r2.mo57233b()     // Catch:{ all -> 0x0291 }
            com.applovin.impl.sdk.network.e$b$a r1 = r1.mo57555a((java.util.concurrent.Executor) r2)     // Catch:{ all -> 0x0291 }
            com.applovin.impl.sdk.network.e$b r1 = r1.mo57557a()     // Catch:{ all -> 0x0291 }
            r0.mo57545a(r1)     // Catch:{ all -> 0x0291 }
            goto L_0x02ae
        L_0x0291:
            r0 = move-exception
            goto L_0x0297
        L_0x0293:
            r0 = move-exception
            r21 = r11
            r14 = r12
        L_0x0297:
            r4 = 0
            r1 = r22
            r2 = r15
            r3 = r21
            r5 = r16
            r7 = r0
            r1.m25749a((java.lang.String) r2, (java.lang.String) r3, (int) r4, (long) r5, (java.lang.Throwable) r7)
            r1 = 0
            java.lang.String r0 = r0.getMessage()
            r2 = r25
            r3 = r14
            r2.mo56275a(r1, r0, r3)
        L_0x02ae:
            return
        L_0x02af:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No callback specified"
            r0.<init>(r1)
            throw r0
        L_0x02b7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No method specified"
            r0.<init>(r1)
            throw r0
        L_0x02bf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No endpoint specified"
            r0.<init>(r1)
            throw r0
        L_0x02c7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No request specified"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.C8511b.m25751b(com.applovin.impl.sdk.network.c, com.applovin.impl.sdk.network.b$a, com.applovin.impl.sdk.network.b$c):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v12, resolved type: java.lang.Object} */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0378, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0386, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0387, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x038a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x038d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x038e, code lost:
        r13 = r4;
        r19 = r5;
        r20 = r10;
        r10 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0394, code lost:
        r4 = r10;
        r18 = r13;
        r12 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x039c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x039d, code lost:
        r13 = r4;
        r19 = r5;
        r20 = r10;
        r10 = r6;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:116:0x02bb, B:154:0x0381] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x038a A[ExcHandler: MalformedURLException (e java.net.MalformedURLException), PHI: r10 r13 r19 r20 
      PHI: (r10v13 int) = (r10v14 int), (r10v14 int), (r10v15 int), (r10v15 int), (r10v15 int), (r10v15 int), (r10v15 int), (r10v15 int), (r10v15 int) binds: [B:154:0x0381, B:155:?, B:116:0x02bb, B:150:0x036f, B:151:?, B:140:0x0338, B:146:0x0366, B:147:?, B:123:0x02d7] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r13v13 java.io.InputStream) = (r13v14 java.io.InputStream), (r13v14 java.io.InputStream), (r13v15 java.io.InputStream), (r13v15 java.io.InputStream), (r13v15 java.io.InputStream), (r13v15 java.io.InputStream), (r13v15 java.io.InputStream), (r13v15 java.io.InputStream), (r13v15 java.io.InputStream) binds: [B:154:0x0381, B:155:?, B:116:0x02bb, B:150:0x036f, B:151:?, B:140:0x0338, B:146:0x0366, B:147:?, B:123:0x02d7] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r19v14 java.net.HttpURLConnection) = (r19v15 java.net.HttpURLConnection), (r19v15 java.net.HttpURLConnection), (r19v16 java.net.HttpURLConnection), (r19v16 java.net.HttpURLConnection), (r19v16 java.net.HttpURLConnection), (r19v16 java.net.HttpURLConnection), (r19v16 java.net.HttpURLConnection), (r19v16 java.net.HttpURLConnection), (r19v16 java.net.HttpURLConnection) binds: [B:154:0x0381, B:155:?, B:116:0x02bb, B:150:0x036f, B:151:?, B:140:0x0338, B:146:0x0366, B:147:?, B:123:0x02d7] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r20v19 java.lang.String) = (r20v20 java.lang.String), (r20v20 java.lang.String), (r20v21 java.lang.String), (r20v21 java.lang.String), (r20v21 java.lang.String), (r20v21 java.lang.String), (r20v21 java.lang.String), (r20v21 java.lang.String), (r20v21 java.lang.String) binds: [B:154:0x0381, B:155:?, B:116:0x02bb, B:150:0x036f, B:151:?, B:140:0x0338, B:146:0x0366, B:147:?, B:123:0x02d7] A[DONT_GENERATE, DONT_INLINE], Splitter:B:116:0x02bb] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x039c A[ExcHandler: MalformedURLException (e java.net.MalformedURLException), Splitter:B:104:0x0291] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x044e A[SYNTHETIC, Splitter:B:214:0x044e] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0464 A[Catch:{ all -> 0x047d }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01f5 A[Catch:{ all -> 0x01cd, all -> 0x0263 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> void m25752c(com.applovin.impl.sdk.network.C8516c<T> r22, com.applovin.impl.sdk.network.C8511b.C8513a r23, com.applovin.impl.sdk.network.C8511b.C8515c<T> r24) {
        /*
            r21 = this;
            r8 = r21
            r7 = r23
            r9 = r24
            if (r22 == 0) goto L_0x04c4
            java.lang.String r0 = r22.mo57505a()
            java.lang.String r10 = r22.mo57508b()
            if (r0 == 0) goto L_0x04bc
            if (r10 == 0) goto L_0x04b4
            if (r9 == 0) goto L_0x04ac
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r2 = "http"
            boolean r1 = r1.startsWith(r2)
            java.lang.String r11 = "ConnectionManager"
            r12 = 0
            if (r1 != 0) goto L_0x0044
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Requested postback submission to non HTTP endpoint "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "; skipping..."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.applovin.impl.sdk.C8626v.m26258i(r11, r0)
            r1 = -900(0xfffffffffffffc7c, float:NaN)
            r9.mo56275a(r1, r0, r12)
            return
        L_0x0044:
            com.applovin.impl.sdk.n r1 = r8.f21437b
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.p254c.C8380b.f20827cX
            java.lang.Object r1 = r1.mo57342a(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0078
            java.lang.String r1 = "https://"
            boolean r2 = r0.contains(r1)
            if (r2 != 0) goto L_0x0078
            com.applovin.impl.sdk.n r2 = r8.f21437b
            r2.mo57320D()
            boolean r2 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r2 == 0) goto L_0x0072
            com.applovin.impl.sdk.n r2 = r8.f21437b
            com.applovin.impl.sdk.v r2 = r2.mo57320D()
            java.lang.String r3 = "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting..."
            r2.mo57821d(r11, r3)
        L_0x0072:
            java.lang.String r2 = "http://"
            java.lang.String r0 = r0.replace(r2, r1)
        L_0x0078:
            r13 = 2
            java.util.Map r1 = com.applovin.impl.sdk.utils.CollectionUtils.map((int) r13)
            boolean r14 = r22.mo57523n()
            com.applovin.impl.sdk.n r2 = r8.f21437b
            long r2 = com.applovin.impl.sdk.utils.Utils.getServerAdjustedUnixTimestampMillis(r2)
            java.util.Map r4 = r22.mo57510c()
            if (r4 == 0) goto L_0x0097
            java.util.Map r4 = r22.mo57510c()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x009d
        L_0x0097:
            int r4 = r22.mo57518i()
            if (r4 < 0) goto L_0x0100
        L_0x009d:
            java.util.Map r4 = r22.mo57510c()
            com.applovin.impl.sdk.n r5 = r8.f21437b
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r6 = com.applovin.impl.sdk.p254c.C8380b.f20894dm
            java.lang.Object r5 = r5.mo57342a(r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r4 == 0) goto L_0x00c6
            int r6 = r22.mo57518i()
            if (r6 < 0) goto L_0x00c6
            int r6 = r22.mo57518i()
            if (r6 <= 0) goto L_0x00c6
            int r6 = r22.mo57518i()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r15 = "current_retry_attempt"
            r4.put(r15, r6)
        L_0x00c6:
            boolean r5 = r5.booleanValue()
            if (r14 == 0) goto L_0x00fc
            com.applovin.impl.sdk.n r6 = r8.f21437b
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r15 = com.applovin.impl.sdk.p254c.C8380b.f20895dn
            java.lang.Object r6 = r6.mo57342a(r15)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.String r4 = com.applovin.impl.sdk.utils.Utils.encodeUrlMap(r4, r5, r6)
            com.applovin.impl.sdk.n r5 = r8.f21437b
            java.lang.String r5 = r5.mo57319C()
            java.lang.String r5 = com.applovin.impl.sdk.utils.C8614n.m26193a((java.lang.String) r4, (java.lang.String) r5, (long) r2)
            boolean r6 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r4)
            if (r6 == 0) goto L_0x00f5
            if (r5 != 0) goto L_0x00f5
            java.lang.String r6 = "query"
            r1.put(r6, r4)
        L_0x00f5:
            java.lang.String r4 = "p"
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.appendQueryParameter(r0, r4, r5)
            goto L_0x0100
        L_0x00fc:
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.appendQueryParameters(r0, r4, r5)
        L_0x0100:
            r15 = r0
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r15)     // Catch:{ all -> 0x0445 }
            java.util.List<java.lang.String> r5 = f21436a     // Catch:{ all -> 0x0445 }
            java.lang.Boolean r0 = com.applovin.impl.sdk.utils.StringUtils.endsWith(r0, r5)     // Catch:{ all -> 0x0445 }
            boolean r5 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x0445 }
            if (r5 == 0) goto L_0x0159
            com.applovin.impl.sdk.v r5 = r8.f21438c     // Catch:{ all -> 0x0151 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0151 }
            r6.<init>()     // Catch:{ all -> 0x0151 }
            java.lang.String r4 = "Sending "
            r6.append(r4)     // Catch:{ all -> 0x0151 }
            r6.append(r10)     // Catch:{ all -> 0x0151 }
            java.lang.String r4 = " request to id=#"
            r6.append(r4)     // Catch:{ all -> 0x0151 }
            int r4 = r15.hashCode()     // Catch:{ all -> 0x0151 }
            r6.append(r4)     // Catch:{ all -> 0x0151 }
            java.lang.String r4 = " \""
            r6.append(r4)     // Catch:{ all -> 0x0151 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0151 }
            if (r0 == 0) goto L_0x013d
            r0 = r15
            goto L_0x0141
        L_0x013d:
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r15)     // Catch:{ all -> 0x0151 }
        L_0x0141:
            r6.append(r0)     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = "\"..."
            r6.append(r0)     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0151 }
            r5.mo57820c(r11, r0)     // Catch:{ all -> 0x0151 }
            goto L_0x0159
        L_0x0151:
            r0 = move-exception
            r20 = r10
            r7 = r12
        L_0x0155:
            r18 = r7
            goto L_0x044b
        L_0x0159:
            java.util.Map r0 = r22.mo57511d()     // Catch:{ all -> 0x0445 }
            int r4 = r22.mo57519j()     // Catch:{ all -> 0x0445 }
            java.net.HttpURLConnection r5 = r8.m25745a((java.lang.String) r15, (java.lang.String) r10, (java.util.Map<java.lang.String, java.lang.String>) r0, (int) r4)     // Catch:{ all -> 0x0445 }
            org.json.JSONObject r0 = r22.mo57512e()     // Catch:{ all -> 0x043d }
            if (r0 == 0) goto L_0x026d
            if (r14 == 0) goto L_0x0199
            org.json.JSONObject r0 = r22.mo57512e()     // Catch:{ all -> 0x018f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x018f }
            com.applovin.impl.sdk.n r4 = r8.f21437b     // Catch:{ all -> 0x018f }
            java.lang.String r4 = r4.mo57319C()     // Catch:{ all -> 0x018f }
            java.lang.String r0 = com.applovin.impl.sdk.utils.C8614n.m26193a((java.lang.String) r0, (java.lang.String) r4, (long) r2)     // Catch:{ all -> 0x018f }
            if (r0 != 0) goto L_0x01a1
            java.lang.String r2 = "body"
            org.json.JSONObject r3 = r22.mo57512e()     // Catch:{ all -> 0x018f }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x018f }
            r1.put(r2, r3)     // Catch:{ all -> 0x018f }
            goto L_0x01a1
        L_0x018f:
            r0 = move-exception
            r20 = r10
            r7 = r12
            r18 = r7
            r4 = 0
            r12 = r5
            goto L_0x044c
        L_0x0199:
            org.json.JSONObject r0 = r22.mo57512e()     // Catch:{ all -> 0x0263 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0263 }
        L_0x01a1:
            r2 = r0
            boolean r0 = r22.mo57524o()     // Catch:{ all -> 0x0263 }
            java.lang.String r3 = "UTF-8"
            if (r0 == 0) goto L_0x01ee
            if (r2 == 0) goto L_0x01ee
            int r0 = r2.length()     // Catch:{ all -> 0x0263 }
            com.applovin.impl.sdk.n r4 = r8.f21437b     // Catch:{ all -> 0x0263 }
            com.applovin.impl.sdk.c.b<java.lang.Integer> r6 = com.applovin.impl.sdk.p254c.C8380b.f20912eE     // Catch:{ all -> 0x0263 }
            java.lang.Object r4 = r4.mo57342a(r6)     // Catch:{ all -> 0x0263 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0263 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0263 }
            if (r0 <= r4) goto L_0x01ee
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r3)     // Catch:{ all -> 0x01cd }
            byte[] r0 = r2.getBytes(r0)     // Catch:{ all -> 0x01cd }
            byte[] r0 = com.applovin.impl.sdk.utils.Utils.gzip(r0)     // Catch:{ all -> 0x01cd }
            goto L_0x01ef
        L_0x01cd:
            r0 = move-exception
            boolean r4 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x0263 }
            if (r4 == 0) goto L_0x01ee
            com.applovin.impl.sdk.v r4 = r8.f21438c     // Catch:{ all -> 0x0263 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0263 }
            r6.<init>()     // Catch:{ all -> 0x0263 }
            java.lang.String r12 = "Failed to gzip POST body for request "
            r6.append(r12)     // Catch:{ all -> 0x0263 }
            java.lang.String r12 = r8.m25744a((java.lang.String) r15)     // Catch:{ all -> 0x0263 }
            r6.append(r12)     // Catch:{ all -> 0x0263 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0263 }
            r4.mo57819b(r11, r6, r0)     // Catch:{ all -> 0x0263 }
        L_0x01ee:
            r0 = 0
        L_0x01ef:
            boolean r4 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x0263 }
            if (r4 == 0) goto L_0x0217
            com.applovin.impl.sdk.v r4 = r8.f21438c     // Catch:{ all -> 0x0263 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0263 }
            r6.<init>()     // Catch:{ all -> 0x0263 }
            java.lang.String r12 = "Request to "
            r6.append(r12)     // Catch:{ all -> 0x0263 }
            java.lang.String r12 = r8.m25744a((java.lang.String) r15)     // Catch:{ all -> 0x0263 }
            r6.append(r12)     // Catch:{ all -> 0x0263 }
            java.lang.String r12 = " is "
            r6.append(r12)     // Catch:{ all -> 0x0263 }
            r6.append(r2)     // Catch:{ all -> 0x0263 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0263 }
            r4.mo57818b(r11, r6)     // Catch:{ all -> 0x0263 }
        L_0x0217:
            java.lang.String r4 = "Content-Type"
            java.lang.String r6 = "application/json; charset=utf-8"
            r5.setRequestProperty(r4, r6)     // Catch:{ all -> 0x0263 }
            r4 = 1
            r5.setDoOutput(r4)     // Catch:{ all -> 0x0263 }
            boolean r4 = r22.mo57524o()     // Catch:{ all -> 0x0263 }
            if (r4 == 0) goto L_0x0240
            if (r0 == 0) goto L_0x0240
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r3 = "gzip"
            r5.setRequestProperty(r2, r3)     // Catch:{ all -> 0x0263 }
            int r2 = r0.length     // Catch:{ all -> 0x0263 }
            r5.setFixedLengthStreamingMode(r2)     // Catch:{ all -> 0x0263 }
            java.io.OutputStream r2 = r5.getOutputStream()     // Catch:{ all -> 0x0263 }
            r2.write(r0)     // Catch:{ all -> 0x0263 }
            r2.close()     // Catch:{ all -> 0x0263 }
            goto L_0x026d
        L_0x0240:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r3)     // Catch:{ all -> 0x0263 }
            byte[] r0 = r2.getBytes(r0)     // Catch:{ all -> 0x0263 }
            int r0 = r0.length     // Catch:{ all -> 0x0263 }
            r5.setFixedLengthStreamingMode(r0)     // Catch:{ all -> 0x0263 }
            java.io.PrintWriter r0 = new java.io.PrintWriter     // Catch:{ all -> 0x0263 }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0263 }
            java.io.OutputStream r4 = r5.getOutputStream()     // Catch:{ all -> 0x0263 }
            java.lang.String r6 = "UTF8"
            r3.<init>(r4, r6)     // Catch:{ all -> 0x0263 }
            r0.<init>(r3)     // Catch:{ all -> 0x0263 }
            r0.print(r2)     // Catch:{ all -> 0x0263 }
            r0.close()     // Catch:{ all -> 0x0263 }
            goto L_0x026d
        L_0x0263:
            r0 = move-exception
            r12 = r5
            r20 = r10
        L_0x0267:
            r4 = 0
        L_0x0268:
            r7 = 0
            r18 = 0
            goto L_0x044c
        L_0x026d:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0437 }
            java.lang.String r12 = "request"
            if (r0 != 0) goto L_0x0287
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r15)     // Catch:{ all -> 0x0263 }
            r1.put(r12, r0)     // Catch:{ all -> 0x0263 }
            com.applovin.impl.sdk.n r0 = r8.f21437b     // Catch:{ all -> 0x0263 }
            com.applovin.sdk.AppLovinEventService r0 = r0.mo57408x()     // Catch:{ all -> 0x0263 }
            java.lang.String r2 = "ref"
            r0.trackEvent(r2, r1)     // Catch:{ all -> 0x0263 }
        L_0x0287:
            int r6 = r5.getResponseCode()     // Catch:{ MalformedURLException -> 0x03da, all -> 0x03d1 }
            if (r6 <= 0) goto L_0x03b2
            java.io.InputStream r4 = r5.getInputStream()     // Catch:{ MalformedURLException -> 0x03ab, all -> 0x03a4 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ MalformedURLException -> 0x039c, all -> 0x038d }
            long r0 = r0 - r16
            r2 = 200(0xc8, float:2.8E-43)
            if (r6 < r2) goto L_0x037a
            r2 = 400(0x190, float:5.6E-43)
            if (r6 >= r2) goto L_0x037a
            if (r7 == 0) goto L_0x02ae
            r7.m25754a(r0)     // Catch:{ MalformedURLException -> 0x039c, all -> 0x02a5 }
            goto L_0x02ae
        L_0x02a5:
            r0 = move-exception
            r18 = r4
            r12 = r5
            r4 = r6
            r20 = r10
            goto L_0x0399
        L_0x02ae:
            r1 = r21
            r2 = r10
            r3 = r15
            r13 = r4
            r4 = r6
            r19 = r5
            r20 = r10
            r10 = r6
            r5 = r16
            r1.m25748a((java.lang.String) r2, (java.lang.String) r3, (int) r4, (long) r5)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            com.applovin.impl.sdk.n r0 = r8.f21437b     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            java.lang.String r0 = com.applovin.impl.sdk.utils.C8572i.m26094a((java.io.InputStream) r13, (com.applovin.impl.sdk.C8490n) r0)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            com.applovin.impl.sdk.n r1 = r8.f21437b     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            android.content.Context r1 = r1.mo57332P()     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            boolean r1 = com.applovin.impl.sdk.utils.Utils.isDspDemoApp(r1)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            if (r1 == 0) goto L_0x02ee
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x02d6
            r2 = r0
            goto L_0x02d7
        L_0x02d6:
            r2 = r1
        L_0x02d7:
            org.json.JSONObject r3 = r22.mo57512e()     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            if (r3 == 0) goto L_0x02e5
            org.json.JSONObject r1 = r22.mo57512e()     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            java.lang.String r1 = r1.toString()     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
        L_0x02e5:
            com.applovin.impl.sdk.n r3 = r8.f21437b     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            com.applovin.impl.sdk.j r3 = r3.mo57369aj()     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            r3.mo57294a(r2, r15, r1)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
        L_0x02ee:
            if (r0 == 0) goto L_0x036f
            com.applovin.impl.sdk.v r1 = r8.f21438c     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            r1.mo57816a((java.lang.String) r11, (java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            if (r7 == 0) goto L_0x02ff
            int r1 = r0.length()     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            long r1 = (long) r1     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            r7.m25756b(r1)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
        L_0x02ff:
            if (r14 == 0) goto L_0x032a
            com.applovin.impl.sdk.n r1 = r8.f21437b     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            java.lang.String r1 = r1.mo57319C()     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            java.lang.String r1 = com.applovin.impl.sdk.utils.C8614n.m26192a((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            if (r1 != 0) goto L_0x0329
            r2 = 2
            java.util.Map r2 = com.applovin.impl.sdk.utils.CollectionUtils.map((int) r2)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            java.lang.String r3 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r15)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            r2.put(r12, r3)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            java.lang.String r3 = "response"
            r2.put(r3, r0)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            com.applovin.impl.sdk.n r0 = r8.f21437b     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            com.applovin.sdk.AppLovinEventService r0 = r0.mo57408x()     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            java.lang.String r3 = "rdf"
            r0.trackEvent(r3, r2)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
        L_0x0329:
            r0 = r1
        L_0x032a:
            java.lang.Object r1 = r22.mo57515g()     // Catch:{ all -> 0x0337 }
            java.lang.Object r0 = r8.m25742a((java.lang.String) r0, r1)     // Catch:{ all -> 0x0337 }
            r9.mo56277a(r0, r10)     // Catch:{ all -> 0x0337 }
            goto L_0x041b
        L_0x0337:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            r1.<init>()     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            java.lang.String r2 = "Unable to parse response from "
            r1.append(r2)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            java.lang.String r2 = r8.m25744a((java.lang.String) r15)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            r1.append(r2)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            java.lang.String r1 = r1.toString()     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            boolean r2 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            if (r2 == 0) goto L_0x0358
            com.applovin.impl.sdk.v r2 = r8.f21438c     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            r2.mo57819b(r11, r1, r0)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
        L_0x0358:
            com.applovin.impl.sdk.n r0 = r8.f21437b     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            com.applovin.impl.sdk.d.g r0 = r0.mo57338W()     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            com.applovin.impl.sdk.d.f r2 = com.applovin.impl.sdk.p255d.C8394f.f21092k     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            r0.mo57151a((com.applovin.impl.sdk.p255d.C8394f) r2)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            r0 = -800(0xfffffffffffffce0, float:NaN)
            r2 = 0
            r9.mo56275a(r0, r1, r2)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x036b }
            goto L_0x041b
        L_0x036b:
            r0 = move-exception
            r7 = r2
            goto L_0x0402
        L_0x036f:
            java.lang.Object r0 = r22.mo57515g()     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            r9.mo56277a(r0, r10)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0378 }
            goto L_0x041b
        L_0x0378:
            r0 = move-exception
            goto L_0x0394
        L_0x037a:
            r13 = r4
            r19 = r5
            r20 = r10
            r10 = r6
            r1 = 0
            r9.mo56275a(r10, r1, r1)     // Catch:{ MalformedURLException -> 0x038a, all -> 0x0386 }
            goto L_0x041b
        L_0x0386:
            r0 = move-exception
            r7 = r1
            goto L_0x0402
        L_0x038a:
            r0 = move-exception
            goto L_0x03e1
        L_0x038d:
            r0 = move-exception
            r13 = r4
            r19 = r5
            r20 = r10
            r10 = r6
        L_0x0394:
            r4 = r10
            r18 = r13
            r12 = r19
        L_0x0399:
            r7 = 0
            goto L_0x044c
        L_0x039c:
            r0 = move-exception
            r13 = r4
            r19 = r5
            r20 = r10
            r10 = r6
            goto L_0x03e1
        L_0x03a4:
            r0 = move-exception
            r19 = r5
            r20 = r10
            r10 = r6
            goto L_0x03ca
        L_0x03ab:
            r0 = move-exception
            r19 = r5
            r20 = r10
            r10 = r6
            goto L_0x03e0
        L_0x03b2:
            r19 = r5
            r20 = r10
            r10 = r6
            r7 = 0
            r1 = r21
            r2 = r20
            r3 = r15
            r4 = r10
            r5 = r16
            r1.m25749a((java.lang.String) r2, (java.lang.String) r3, (int) r4, (long) r5, (java.lang.Throwable) r7)     // Catch:{ MalformedURLException -> 0x03cf, all -> 0x03c9 }
            r1 = 0
            r9.mo56275a(r10, r1, r1)     // Catch:{ MalformedURLException -> 0x03cf, all -> 0x03c9 }
            r12 = 0
            goto L_0x041c
        L_0x03c9:
            r0 = move-exception
        L_0x03ca:
            r4 = r10
            r12 = r19
            goto L_0x0268
        L_0x03cf:
            r0 = move-exception
            goto L_0x03e0
        L_0x03d1:
            r0 = move-exception
            r19 = r5
            r20 = r10
            r12 = r19
            goto L_0x0267
        L_0x03da:
            r0 = move-exception
            r19 = r5
            r20 = r10
            r10 = 0
        L_0x03e0:
            r13 = 0
        L_0x03e1:
            java.lang.Object r1 = r22.mo57515g()     // Catch:{ all -> 0x042e }
            r11 = -901(0xfffffffffffffc7b, float:NaN)
            if (r1 == 0) goto L_0x0408
            r1 = r21
            r2 = r20
            r3 = r15
            r4 = r10
            r5 = r16
            r7 = r0
            r1.m25749a((java.lang.String) r2, (java.lang.String) r3, (int) r4, (long) r5, (java.lang.Throwable) r7)     // Catch:{ all -> 0x0400 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0400 }
            r7 = 0
            r9.mo56275a(r11, r0, r7)     // Catch:{ all -> 0x03fe }
            goto L_0x041b
        L_0x03fe:
            r0 = move-exception
            goto L_0x0402
        L_0x0400:
            r0 = move-exception
            r7 = 0
        L_0x0402:
            r4 = r10
            r18 = r13
            r12 = r19
            goto L_0x044c
        L_0x0408:
            r7 = 0
            r1 = r21
            r2 = r20
            r3 = r15
            r4 = r10
            r5 = r16
            r1.m25748a((java.lang.String) r2, (java.lang.String) r3, (int) r4, (long) r5)     // Catch:{ all -> 0x042a }
            java.lang.Object r0 = r22.mo57515g()     // Catch:{ all -> 0x042a }
            r9.mo56277a(r0, r11)     // Catch:{ all -> 0x042a }
        L_0x041b:
            r12 = r13
        L_0x041c:
            com.applovin.impl.sdk.n r0 = r8.f21437b
            com.applovin.impl.sdk.utils.Utils.close(r12, r0)
            com.applovin.impl.sdk.n r0 = r8.f21437b
            r1 = r19
            com.applovin.impl.sdk.utils.Utils.disconnect(r1, r0)
            goto L_0x049f
        L_0x042a:
            r0 = move-exception
            r1 = r19
            goto L_0x0432
        L_0x042e:
            r0 = move-exception
            r1 = r19
            r7 = 0
        L_0x0432:
            r12 = r1
            r4 = r10
            r18 = r13
            goto L_0x044c
        L_0x0437:
            r0 = move-exception
            r1 = r5
            r20 = r10
            r7 = 0
            goto L_0x0442
        L_0x043d:
            r0 = move-exception
            r1 = r5
            r20 = r10
            r7 = r12
        L_0x0442:
            r12 = r1
            goto L_0x0155
        L_0x0445:
            r0 = move-exception
            r20 = r10
            r7 = r12
            r18 = r12
        L_0x044b:
            r4 = 0
        L_0x044c:
            if (r4 != 0) goto L_0x0457
            int r4 = r8.m25739a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0453 }
            goto L_0x0457
        L_0x0453:
            r0 = move-exception
            r13 = r18
            goto L_0x04a1
        L_0x0457:
            r10 = r4
            java.io.InputStream r1 = r12.getErrorStream()     // Catch:{ all -> 0x047f }
            com.applovin.impl.sdk.n r2 = r8.f21437b     // Catch:{ all -> 0x047d }
            java.lang.String r2 = com.applovin.impl.sdk.utils.C8572i.m26094a((java.io.InputStream) r1, (com.applovin.impl.sdk.C8490n) r2)     // Catch:{ all -> 0x047d }
            if (r2 == 0) goto L_0x0479
            if (r14 == 0) goto L_0x0470
            com.applovin.impl.sdk.n r3 = r8.f21437b     // Catch:{ all -> 0x047d }
            java.lang.String r3 = r3.mo57319C()     // Catch:{ all -> 0x047d }
            java.lang.String r2 = com.applovin.impl.sdk.utils.C8614n.m26192a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x047d }
        L_0x0470:
            java.lang.Object r3 = r22.mo57515g()     // Catch:{ all -> 0x047d }
            java.lang.Object r2 = r8.m25742a((java.lang.String) r2, r3)     // Catch:{ all -> 0x047d }
            goto L_0x047a
        L_0x0479:
            r2 = r7
        L_0x047a:
            r13 = r1
            r11 = r2
            goto L_0x0482
        L_0x047d:
            r18 = r1
        L_0x047f:
            r11 = r7
            r13 = r18
        L_0x0482:
            r1 = r21
            r2 = r20
            r3 = r15
            r4 = r10
            r5 = r16
            r7 = r0
            r1.m25749a((java.lang.String) r2, (java.lang.String) r3, (int) r4, (long) r5, (java.lang.Throwable) r7)     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x04a0 }
            r9.mo56275a(r10, r0, r11)     // Catch:{ all -> 0x04a0 }
            com.applovin.impl.sdk.n r0 = r8.f21437b
            com.applovin.impl.sdk.utils.Utils.close(r13, r0)
            com.applovin.impl.sdk.n r0 = r8.f21437b
            com.applovin.impl.sdk.utils.Utils.disconnect(r12, r0)
        L_0x049f:
            return
        L_0x04a0:
            r0 = move-exception
        L_0x04a1:
            com.applovin.impl.sdk.n r1 = r8.f21437b
            com.applovin.impl.sdk.utils.Utils.close(r13, r1)
            com.applovin.impl.sdk.n r1 = r8.f21437b
            com.applovin.impl.sdk.utils.Utils.disconnect(r12, r1)
            throw r0
        L_0x04ac:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No callback specified"
            r0.<init>(r1)
            throw r0
        L_0x04b4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No method specified"
            r0.<init>(r1)
            throw r0
        L_0x04bc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No endpoint specified"
            r0.<init>(r1)
            throw r0
        L_0x04c4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No request specified"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.C8511b.m25752c(com.applovin.impl.sdk.network.c, com.applovin.impl.sdk.network.b$a, com.applovin.impl.sdk.network.b$c):void");
    }

    /* renamed from: a */
    public <T> void mo57501a(C8516c<T> cVar, C8513a aVar, C8515c<T> cVar2) {
        if (((Boolean) this.f21437b.mo57342a(C8380b.f20967fh)).booleanValue()) {
            if (this.f21439d == null) {
                C8520e eVar = new C8520e(this.f21437b);
                this.f21439d = eVar;
                eVar.mo57544a();
            }
            m25751b(cVar, aVar, cVar2);
            return;
        }
        m25752c(cVar, aVar, cVar2);
    }
}
