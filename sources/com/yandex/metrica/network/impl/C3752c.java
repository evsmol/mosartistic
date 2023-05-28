package com.yandex.metrica.network.impl;

import com.yandex.metrica.network.Call;
import com.yandex.metrica.network.NetworkClient;
import com.yandex.metrica.network.Request;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.network.impl.c */
public final class C3752c implements Call {

    /* renamed from: a */
    private final NetworkClient f9647a;

    /* renamed from: b */
    private final Request f9648b;

    /* renamed from: c */
    private final C3753d f9649c;

    public C3752c(NetworkClient networkClient, Request request, C3753d dVar) {
        Intrinsics.checkNotNullParameter(networkClient, "client");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(dVar, "urlProvider");
        this.f9647a = networkClient;
        this.f9648b = request;
        this.f9649c = dVar;
    }

    /* renamed from: a */
    private final void m11153a(HttpsURLConnection httpsURLConnection) {
        for (Map.Entry entry : this.f9648b.getHeaders().entrySet()) {
            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Integer readTimeout = this.f9647a.getReadTimeout();
        if (readTimeout != null) {
            Intrinsics.checkNotNullExpressionValue(readTimeout, "it");
            httpsURLConnection.setReadTimeout(readTimeout.intValue());
        }
        Integer connectTimeout = this.f9647a.getConnectTimeout();
        if (connectTimeout != null) {
            Intrinsics.checkNotNullExpressionValue(connectTimeout, "it");
            httpsURLConnection.setConnectTimeout(connectTimeout.intValue());
        }
        Boolean useCaches = this.f9647a.getUseCaches();
        if (useCaches != null) {
            Intrinsics.checkNotNullExpressionValue(useCaches, "it");
            httpsURLConnection.setUseCaches(useCaches.booleanValue());
        }
        Boolean instanceFollowRedirects = this.f9647a.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            Intrinsics.checkNotNullExpressionValue(instanceFollowRedirects, "it");
            httpsURLConnection.setInstanceFollowRedirects(instanceFollowRedirects.booleanValue());
        }
        httpsURLConnection.setRequestMethod(this.f9648b.getMethod());
        SSLSocketFactory sslSocketFactory = this.f9647a.getSslSocketFactory();
        if (sslSocketFactory != null) {
            httpsURLConnection.setSSLSocketFactory(sslSocketFactory);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        kotlin.p151io.CloseableKt.closeFinally(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.network.Response execute() {
        /*
            r15 = this;
            com.yandex.metrica.network.impl.d r0 = r15.f9649c     // Catch:{ all -> 0x00c8 }
            com.yandex.metrica.network.Request r1 = r15.f9648b     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = r1.getUrl()     // Catch:{ all -> 0x00c8 }
            r0.getClass()     // Catch:{ all -> 0x00c8 }
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x00c8 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c8 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ all -> 0x00c8 }
            boolean r1 = r0 instanceof javax.net.ssl.HttpsURLConnection
            r2 = 0
            if (r1 != 0) goto L_0x001a
            r0 = r2
        L_0x001a:
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0
            if (r0 == 0) goto L_0x00a1
            r1 = 0
            byte[] r3 = new byte[r1]
            byte[] r4 = new byte[r1]
            r5 = 1
            r15.m11153a(r0)     // Catch:{ all -> 0x008d }
            com.yandex.metrica.network.Request r6 = r15.f9648b     // Catch:{ all -> 0x008d }
            java.lang.String r6 = r6.getMethod()     // Catch:{ all -> 0x008d }
            java.lang.String r7 = "POST"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x008d }
            if (r6 == 0) goto L_0x0055
            r0.setDoOutput(r5)     // Catch:{ all -> 0x008d }
            java.io.OutputStream r6 = r0.getOutputStream()     // Catch:{ all -> 0x008d }
            if (r6 == 0) goto L_0x0055
            com.yandex.metrica.network.Request r7 = r15.f9648b     // Catch:{ all -> 0x004e }
            byte[] r7 = r7.getBody()     // Catch:{ all -> 0x004e }
            r6.write(r7)     // Catch:{ all -> 0x004e }
            r6.flush()     // Catch:{ all -> 0x004e }
            kotlin.p151io.CloseableKt.closeFinally(r6, r2)     // Catch:{ all -> 0x008d }
            goto L_0x0055
        L_0x004e:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r7 = move-exception
            kotlin.p151io.CloseableKt.closeFinally(r6, r5)     // Catch:{ all -> 0x008d }
            throw r7     // Catch:{ all -> 0x008d }
        L_0x0055:
            int r6 = r0.getResponseCode()     // Catch:{ all -> 0x008d }
            java.util.Map r7 = r0.getHeaderFields()     // Catch:{ all -> 0x0089 }
            com.yandex.metrica.network.impl.e r8 = com.yandex.metrica.network.impl.C3754e.f9650a     // Catch:{ all -> 0x0087 }
            com.yandex.metrica.network.NetworkClient r9 = r15.f9647a     // Catch:{ all -> 0x0087 }
            int r9 = r9.getMaxResponseSize()     // Catch:{ all -> 0x0087 }
            com.yandex.metrica.network.impl.a r10 = new com.yandex.metrica.network.impl.a     // Catch:{ all -> 0x0087 }
            r10.<init>(r0)     // Catch:{ all -> 0x0087 }
            byte[] r3 = r8.mo18528a(r9, r10)     // Catch:{ all -> 0x0087 }
            com.yandex.metrica.network.NetworkClient r9 = r15.f9647a     // Catch:{ all -> 0x0087 }
            int r9 = r9.getMaxResponseSize()     // Catch:{ all -> 0x0087 }
            com.yandex.metrica.network.impl.b r10 = new com.yandex.metrica.network.impl.b     // Catch:{ all -> 0x0087 }
            r10.<init>(r0)     // Catch:{ all -> 0x0087 }
            byte[] r4 = r8.mo18528a(r9, r10)     // Catch:{ all -> 0x0087 }
            r0.disconnect()     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r14 = r2
            r11 = r3
            r12 = r4
            r10 = r6
            r13 = r7
            r9 = 1
            goto L_0x009a
        L_0x0087:
            r2 = move-exception
            goto L_0x0091
        L_0x0089:
            r5 = move-exception
            r7 = r2
            r2 = r5
            goto L_0x0091
        L_0x008d:
            r5 = move-exception
            r7 = r2
            r2 = r5
            r6 = 0
        L_0x0091:
            r0.disconnect()     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r14 = r2
            r11 = r3
            r12 = r4
            r10 = r6
            r13 = r7
            r9 = 0
        L_0x009a:
            com.yandex.metrica.network.Response r0 = new com.yandex.metrica.network.Response
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r0
        L_0x00a1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Connection created for "
            r0.append(r1)
            com.yandex.metrica.network.Request r1 = r15.f9648b
            java.lang.String r1 = r1.getUrl()
            r0.append(r1)
            java.lang.String r1 = " does not represent https connection"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.yandex.metrica.network.Response r1 = new com.yandex.metrica.network.Response
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r0)
            r1.<init>(r2)
            return r1
        L_0x00c8:
            r0 = move-exception
            com.yandex.metrica.network.Response r1 = new com.yandex.metrica.network.Response
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.network.impl.C3752c.execute():com.yandex.metrica.network.Response");
    }
}
