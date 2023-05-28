package com.ironsource.mediationsdk;

import android.content.Context;
import android.util.Pair;
import com.ironsource.environment.p124e.C4401c;
import com.ironsource.mediationsdk.server.C4707b;
import com.ironsource.mediationsdk.utils.C4714c;
import com.ironsource.mediationsdk.utils.C4719g;
import com.ironsource.mediationsdk.utils.C4733p;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.h */
public final class C4624h {

    /* renamed from: a */
    ISBannerSize f11429a;

    /* renamed from: b */
    private final String f11430b = "1";

    /* renamed from: c */
    private final String f11431c = "102";

    /* renamed from: d */
    private final String f11432d = "103";

    /* renamed from: e */
    private final String f11433e = "102";

    /* renamed from: f */
    private final String f11434f = "GenericNotifications";

    /* renamed from: g */
    private String f11435g;

    /* renamed from: h */
    private String f11436h;

    /* renamed from: i */
    private C4714c f11437i;

    /* renamed from: j */
    private C4623g f11438j;

    /* renamed from: com.ironsource.mediationsdk.h$a */
    static class C4625a implements Runnable {

        /* renamed from: a */
        private WeakReference<C4623g> f11439a;

        /* renamed from: b */
        private int f11440b;

        /* renamed from: c */
        private String f11441c;

        /* renamed from: d */
        private String f11442d;

        /* renamed from: e */
        private List<C4707b> f11443e;

        /* renamed from: f */
        private C4707b f11444f;

        /* renamed from: g */
        private JSONObject f11445g;

        /* renamed from: h */
        private JSONObject f11446h;

        /* renamed from: i */
        private long f11447i;

        /* renamed from: j */
        private int f11448j;

        /* renamed from: k */
        private String f11449k = "other";

        /* renamed from: l */
        private int f11450l;

        /* renamed from: m */
        private String f11451m = "";

        /* renamed from: n */
        private int f11452n = 0;

        /* renamed from: o */
        private final URL f11453o;

        /* renamed from: p */
        private final JSONObject f11454p;

        /* renamed from: q */
        private final boolean f11455q;

        /* renamed from: r */
        private final int f11456r;

        /* renamed from: s */
        private final long f11457s;

        /* renamed from: t */
        private final boolean f11458t;

        /* renamed from: u */
        private final boolean f11459u;

        /* renamed from: v */
        private final int f11460v;

        C4625a(C4623g gVar, URL url, JSONObject jSONObject, boolean z, int i, long j, boolean z2, boolean z3, int i2) {
            this.f11439a = new WeakReference<>(gVar);
            this.f11453o = url;
            this.f11454p = jSONObject;
            this.f11455q = z;
            this.f11456r = i;
            this.f11457s = j;
            this.f11458t = z2;
            this.f11459u = z3;
            this.f11460v = i2;
        }

        /* renamed from: a */
        private static String m13552a(HttpURLConnection httpURLConnection) {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
            }
        }

        /* JADX WARNING: type inference failed for: r0v19, types: [java.net.URLConnection] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0220  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m13553a() {
            /*
                r17 = this;
                r1 = r17
                java.lang.String r2 = "decompression error"
                java.lang.String r3 = "decryption error"
                java.lang.String r4 = "other"
                java.util.Date r0 = new java.util.Date
                r0.<init>()
                long r5 = r0.getTime()
                r1.f11447i = r5
                r5 = 0
                int r0 = r1.f11452n     // Catch:{ Exception -> 0x0252 }
                r6 = 1015(0x3f7, float:1.422E-42)
                r7 = 1
                if (r0 != r6) goto L_0x001d
                r0 = 1
                goto L_0x001f
            L_0x001d:
                int r0 = r1.f11460v     // Catch:{ Exception -> 0x0252 }
            L_0x001f:
                r1.f11450l = r0     // Catch:{ Exception -> 0x0252 }
                r1.f11448j = r5
                r0 = 0
                r8 = r0
            L_0x0025:
                int r0 = r1.f11448j
                int r9 = r1.f11456r
                if (r0 >= r9) goto L_0x0249
                java.util.Date r0 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                long r9 = r0.getTime()     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                java.lang.String r11 = "Auction Handler: auction trial "
                r0.<init>(r11)     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                int r11 = r1.f11448j     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                int r11 = r11 + r7
                r0.append(r11)     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                java.lang.String r11 = " out of "
                r0.append(r11)     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                int r11 = r1.f11456r     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                r0.append(r11)     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                java.lang.String r11 = " max trials"
                r0.append(r11)     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                java.lang.String r0 = r0.toString()     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                r11.log(r12, r0, r5)     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                java.net.URL r0 = r1.f11453o     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                long r11 = r1.f11457s     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                int r12 = (int) r11     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                r11 = r0
                java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                java.lang.String r0 = "POST"
                r11.setRequestMethod(r0)     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                java.lang.String r0 = "Content-Type"
                java.lang.String r13 = "application/json; charset=utf-8"
                r11.setRequestProperty(r0, r13)     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                r11.setReadTimeout(r12)     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                r11.setDoInput(r7)     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                r11.setDoOutput(r7)     // Catch:{ SocketTimeoutException -> 0x0231, Exception -> 0x020a }
                org.json.JSONObject r8 = r1.f11454p     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                boolean r12 = r1.f11458t     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                java.io.OutputStream r13 = r11.getOutputStream()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                java.io.OutputStreamWriter r14 = new java.io.OutputStreamWriter     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                java.lang.String r0 = "UTF-8"
                r14.<init>(r13, r0)     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                java.io.BufferedWriter r15 = new java.io.BufferedWriter     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r15.<init>(r14)     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                java.lang.String r16 = ""
                int r0 = r1.f11450l     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r5 = 2
                if (r0 != r5) goto L_0x00b0
                com.ironsource.mediationsdk.utils.g r0 = com.ironsource.mediationsdk.utils.C4719g.m13802a()     // Catch:{ JSONException -> 0x00a5 }
                java.lang.String r16 = r0.mo34185d()     // Catch:{ JSONException -> 0x00a5 }
                goto L_0x00b0
            L_0x00a5:
                r0 = move-exception
                java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r1.f11451m = r0     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r1.f11452n = r6     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r1.f11450l = r7     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
            L_0x00b0:
                java.lang.String r0 = r8.toString()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                java.lang.String r8 = r17.m13554b()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                if (r12 == 0) goto L_0x00c6
                com.ironsource.mediationsdk.logger.IronLog r12 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                java.lang.String r6 = "compressing and encrypting auction request"
                r12.verbose(r6)     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.compressAndEncrypt(r8, r0)     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                goto L_0x00ca
            L_0x00c6:
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.encode(r8, r0)     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
            L_0x00ca:
                int r6 = r1.f11450l     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                if (r6 != r5) goto L_0x00dc
                java.lang.String r6 = "{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}"
                java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r12 = 0
                r8[r12] = r16     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r8[r7] = r0     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                java.lang.String r0 = java.lang.String.format(r6, r8)     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                goto L_0x00e7
            L_0x00dc:
                java.lang.String r6 = "{\"request\" : \"%1$s\"}"
                java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r12 = 0
                r8[r12] = r0     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                java.lang.String r0 = java.lang.String.format(r6, r8)     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
            L_0x00e7:
                r15.write(r0)     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r15.flush()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r15.close()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r14.close()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r13.close()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                int r0 = r11.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r6 = 200(0xc8, float:2.8E-43)
                if (r0 == r6) goto L_0x013c
                r5 = 1001(0x3e9, float:1.403E-42)
                r1.f11440b = r5     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                java.lang.String r6 = "Auction status not 200 error, error code response from server - "
                r5.<init>(r6)     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r5.append(r0)     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                java.lang.String r0 = r5.toString()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r1.f11441c = r0     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                java.lang.String r5 = r1.f11441c     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r0.error(r5)     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r11.disconnect()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                int r0 = r1.f11448j     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                int r5 = r1.f11456r     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                int r5 = r5 - r7
                if (r0 >= r5) goto L_0x0139
                long r5 = r1.f11457s     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                java.util.Date r0 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                long r12 = r0.getTime()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                long r12 = r12 - r9
                long r5 = r5 - r12
                r8 = 0
                int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r0 <= 0) goto L_0x0139
                android.os.SystemClock.sleep(r5)     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
            L_0x0139:
                r8 = r11
                goto L_0x023f
            L_0x013c:
                java.lang.String r0 = m13552a(r11)     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                boolean r6 = r1.f11455q     // Catch:{ JSONException -> 0x01c3 }
                boolean r8 = r1.f11459u     // Catch:{ JSONException -> 0x01c3 }
                boolean r9 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x01c3 }
                if (r9 != 0) goto L_0x01bb
                org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01c3 }
                r9.<init>(r0)     // Catch:{ JSONException -> 0x01c3 }
                if (r6 == 0) goto L_0x0194
                java.lang.String r0 = r17.m13554b()     // Catch:{ JSONException -> 0x01c3 }
                int r6 = r1.f11450l     // Catch:{ JSONException -> 0x01c3 }
                if (r6 != r5) goto L_0x015c
                java.lang.String r5 = "ct"
                goto L_0x015e
            L_0x015c:
                java.lang.String r5 = "response"
            L_0x015e:
                java.lang.String r5 = r9.getString(r5)     // Catch:{ JSONException -> 0x01c3 }
                if (r8 == 0) goto L_0x017d
                com.ironsource.mediationsdk.logger.IronLog r6 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ JSONException -> 0x01c3 }
                java.lang.String r8 = "decrypting and decompressing auction response"
                r6.verbose(r8)     // Catch:{ JSONException -> 0x01c3 }
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.decryptAndDecompress(r0, r5)     // Catch:{ JSONException -> 0x01c3 }
                if (r0 == 0) goto L_0x0177
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01c3 }
                r5.<init>(r0)     // Catch:{ JSONException -> 0x01c3 }
                goto L_0x018c
            L_0x0177:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x01c3 }
                r0.<init>(r2)     // Catch:{ JSONException -> 0x01c3 }
                throw r0     // Catch:{ JSONException -> 0x01c3 }
            L_0x017d:
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.decode(r0, r5)     // Catch:{ JSONException -> 0x01c3 }
                boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x01c3 }
                if (r5 != 0) goto L_0x018e
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01c3 }
                r5.<init>(r0)     // Catch:{ JSONException -> 0x01c3 }
            L_0x018c:
                r9 = r5
                goto L_0x0194
            L_0x018e:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x01c3 }
                r0.<init>(r3)     // Catch:{ JSONException -> 0x01c3 }
                throw r0     // Catch:{ JSONException -> 0x01c3 }
            L_0x0194:
                com.ironsource.mediationsdk.C4619f.m13526a()     // Catch:{ JSONException -> 0x01c3 }
                com.ironsource.mediationsdk.f$a r0 = com.ironsource.mediationsdk.C4619f.m13525a((org.json.JSONObject) r9)     // Catch:{ JSONException -> 0x01c3 }
                java.lang.String r5 = r0.f11416a     // Catch:{ JSONException -> 0x01c3 }
                r1.f11442d = r5     // Catch:{ JSONException -> 0x01c3 }
                java.util.List<com.ironsource.mediationsdk.server.b> r5 = r0.f11417b     // Catch:{ JSONException -> 0x01c3 }
                r1.f11443e = r5     // Catch:{ JSONException -> 0x01c3 }
                com.ironsource.mediationsdk.server.b r5 = r0.f11418c     // Catch:{ JSONException -> 0x01c3 }
                r1.f11444f = r5     // Catch:{ JSONException -> 0x01c3 }
                org.json.JSONObject r5 = r0.f11419d     // Catch:{ JSONException -> 0x01c3 }
                r1.f11445g = r5     // Catch:{ JSONException -> 0x01c3 }
                org.json.JSONObject r5 = r0.f11420e     // Catch:{ JSONException -> 0x01c3 }
                r1.f11446h = r5     // Catch:{ JSONException -> 0x01c3 }
                int r5 = r0.f11421f     // Catch:{ JSONException -> 0x01c3 }
                r1.f11440b = r5     // Catch:{ JSONException -> 0x01c3 }
                java.lang.String r0 = r0.f11422g     // Catch:{ JSONException -> 0x01c3 }
                r1.f11441c = r0     // Catch:{ JSONException -> 0x01c3 }
                r11.disconnect()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                return r7
            L_0x01bb:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x01c3 }
                java.lang.String r5 = "empty response"
                r0.<init>(r5)     // Catch:{ JSONException -> 0x01c3 }
                throw r0     // Catch:{ JSONException -> 0x01c3 }
            L_0x01c3:
                r0 = move-exception
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                if (r5 == 0) goto L_0x01dc
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                boolean r5 = r5.equalsIgnoreCase(r3)     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                if (r5 == 0) goto L_0x01dc
                r5 = 1003(0x3eb, float:1.406E-42)
                r1.f11440b = r5     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                java.lang.String r5 = "Auction decryption error"
                r1.f11441c = r5     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
            L_0x01dc:
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                if (r5 == 0) goto L_0x01f5
                java.lang.String r0 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                if (r0 == 0) goto L_0x01f5
                r0 = 1008(0x3f0, float:1.413E-42)
                r1.f11440b = r0     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                java.lang.String r0 = "Auction decompression error"
            L_0x01f2:
                r1.f11441c = r0     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                goto L_0x01fc
            L_0x01f5:
                r0 = 1002(0x3ea, float:1.404E-42)
                r1.f11440b = r0     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                java.lang.String r0 = "Auction parsing error"
                goto L_0x01f2
            L_0x01fc:
                java.lang.String r0 = "parsing"
                r1.f11449k = r0     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r11.disconnect()     // Catch:{ SocketTimeoutException -> 0x0208, Exception -> 0x0205 }
                r2 = 0
                return r2
            L_0x0205:
                r0 = move-exception
                r8 = r11
                goto L_0x020b
            L_0x0208:
                r8 = r11
                goto L_0x0232
            L_0x020a:
                r0 = move-exception
            L_0x020b:
                com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r5 = "getting exception "
                r3.<init>(r5)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.error(r3)
                if (r8 == 0) goto L_0x0223
                r8.disconnect()
            L_0x0223:
                r2 = 1000(0x3e8, float:1.401E-42)
                r1.f11440b = r2
                java.lang.String r0 = r0.getMessage()
                r1.f11441c = r0
                r1.f11449k = r4
                r2 = 0
                return r2
            L_0x0231:
            L_0x0232:
                if (r8 == 0) goto L_0x0237
                r8.disconnect()
            L_0x0237:
                r0 = 1006(0x3ee, float:1.41E-42)
                r1.f11440b = r0
                java.lang.String r0 = "Connection timed out"
                r1.f11441c = r0
            L_0x023f:
                int r0 = r1.f11448j
                int r0 = r0 + r7
                r1.f11448j = r0
                r5 = 0
                r6 = 1015(0x3f7, float:1.422E-42)
                goto L_0x0025
            L_0x0249:
                int r9 = r9 - r7
                r1.f11448j = r9
                java.lang.String r0 = "trials_fail"
                r1.f11449k = r0
                r2 = 0
                return r2
            L_0x0252:
                r0 = move-exception
                r2 = 0
                r3 = 1007(0x3ef, float:1.411E-42)
                r1.f11440b = r3
                java.lang.String r0 = r0.getMessage()
                r1.f11441c = r0
                r1.f11448j = r2
                r1.f11449k = r4
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4624h.C4625a.m13553a():boolean");
        }

        /* renamed from: b */
        private String m13554b() {
            return this.f11450l == 2 ? C4719g.m13802a().mo34184c() : C4719g.m13802a().mo34183b();
        }

        public final void run() {
            boolean a = m13553a();
            C4623g gVar = (C4623g) this.f11439a.get();
            if (gVar != null) {
                long time = new Date().getTime() - this.f11447i;
                if (a) {
                    gVar.mo33391a(this.f11443e, this.f11442d, this.f11444f, this.f11445g, this.f11446h, this.f11448j + 1, time, this.f11452n, this.f11451m);
                } else {
                    gVar.mo33383a(this.f11440b, this.f11441c, this.f11448j + 1, this.f11449k, time);
                }
            }
        }
    }

    public C4624h(String str, C4714c cVar, C4623g gVar) {
        this.f11435g = str;
        this.f11437i = cVar;
        this.f11438j = gVar;
        this.f11436h = IronSourceUtils.getSessionId();
    }

    /* renamed from: a */
    private JSONObject m13545a(Context context, Map<String, Object> map, List<String> list, C4626i iVar, int i, boolean z, IronSourceSegment ironSourceSegment) {
        new JSONObject();
        C4733p c = C4455H.m12683a().f10651i.f11953c.f11614e.mo34651c();
        JSONObject a = m13546a(ironSourceSegment);
        boolean z2 = c.f11995d;
        C4619f a2 = C4619f.m13526a();
        if (z2) {
            return a2.mo33903a(this.f11435g, z, map, list, iVar, i, this.f11429a, a);
        }
        JSONObject a3 = a2.mo33902a(context, map, list, iVar, i, this.f11436h, this.f11437i, this.f11429a, a);
        a3.put("adUnit", this.f11435g);
        a3.put("doNotEncryptResponse", z ? "false" : "true");
        return a3;
    }

    /* renamed from: a */
    private static JSONObject m13546a(IronSourceSegment ironSourceSegment) {
        JSONObject jSONObject = new JSONObject();
        if (ironSourceSegment == null) {
            return null;
        }
        Vector<Pair<String, String>> a = ironSourceSegment.mo33440a();
        for (int i = 0; i < a.size(); i++) {
            try {
                jSONObject.put((String) a.get(i).first, a.get(i).second);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m13547a(C4707b bVar, int i, C4707b bVar2) {
        for (String a : bVar.mo34162f()) {
            String a2 = C4619f.m13526a().mo33901a(a, i, bVar, "", "", "");
            C4619f.m13526a();
            C4619f.m13531a("reportLoadSuccess", bVar.mo34157a(), a2);
        }
        if (bVar2 != null) {
            for (String a3 : bVar2.mo34162f()) {
                String a4 = C4619f.m13526a().mo33901a(a3, i, bVar, "", "102", "");
                C4619f.m13526a();
                C4619f.m13531a("reportLoadSuccess", "GenericNotifications", a4);
            }
        }
    }

    /* renamed from: a */
    public static void m13548a(C4707b bVar, int i, C4707b bVar2, String str) {
        for (String a : bVar.mo34160d()) {
            String a2 = C4619f.m13526a().mo33901a(a, i, bVar, "", "", str);
            C4619f.m13526a();
            C4619f.m13531a("reportImpression", bVar.mo34157a(), a2);
        }
        if (bVar2 != null) {
            for (String a3 : bVar2.mo34160d()) {
                String a4 = C4619f.m13526a().mo33901a(a3, i, bVar, "", "102", str);
                C4619f.m13526a();
                C4619f.m13531a("reportImpression", "GenericNotifications", a4);
            }
        }
    }

    /* renamed from: a */
    public static void m13549a(ArrayList<String> arrayList, ConcurrentHashMap<String, C4707b> concurrentHashMap, int i, C4707b bVar, C4707b bVar2) {
        Iterator<String> it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(bVar2.mo34157a())) {
                z2 = i == 2;
                z = true;
            } else {
                int i2 = i;
                C4707b bVar3 = concurrentHashMap.get(next);
                String c = bVar3.mo34159c();
                String str = z ? z2 ? "102" : "103" : "1";
                for (String a : bVar3.mo34161e()) {
                    String a2 = C4619f.m13526a().mo33901a(a, i, bVar2, c, str, "");
                    C4619f.m13526a();
                    C4619f.m13531a("reportAuctionLose", bVar3.mo34157a(), a2);
                }
            }
        }
        int i3 = i;
        if (bVar != null) {
            for (String a3 : bVar.mo34161e()) {
                String a4 = C4619f.m13526a().mo33901a(a3, i, bVar2, "", "102", "");
                C4619f.m13526a();
                C4619f.m13531a("reportAuctionLose", "GenericNotifications", a4);
            }
        }
    }

    /* renamed from: a */
    public final void mo33907a(Context context, Map<String, Object> map, List<String> list, C4626i iVar, int i, IronSourceSegment ironSourceSegment) {
        try {
            boolean z = IronSourceUtils.getSerr() == 1;
            C4401c.f10496a.mo33211c(new C4625a(this.f11438j, new URL(this.f11437i.f11776d), m13545a(context, map, list, iVar, i, z, ironSourceSegment), z, this.f11437i.f11777e, this.f11437i.f11780h, this.f11437i.f11788p, this.f11437i.f11789q, this.f11437i.f11790r));
        } catch (Exception e) {
            this.f11438j.mo33383a(1000, e.getMessage(), 0, "other", 0);
        }
    }

    /* renamed from: a */
    public final void mo33908a(CopyOnWriteArrayList<C4514Y> copyOnWriteArrayList, ConcurrentHashMap<String, C4707b> concurrentHashMap, int i, C4707b bVar, C4707b bVar2) {
        ArrayList arrayList = new ArrayList();
        Iterator<C4514Y> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo33612k());
        }
        m13549a((ArrayList<String>) arrayList, concurrentHashMap, i, bVar, bVar2);
    }
}
