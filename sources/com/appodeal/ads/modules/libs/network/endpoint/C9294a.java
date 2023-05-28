package com.appodeal.ads.modules.libs.network.endpoint;

import com.appodeal.ads.modules.libs.network.AppodealEndpoint;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.modules.libs.network.endpoint.a */
public final class C9294a implements AppodealEndpoint {

    /* renamed from: a */
    public final LinkedList f23518a = new LinkedList();

    /* renamed from: b */
    public String f23519b = "https://a.appbaqend.com";

    public final String getActiveEndpoint() {
        String str = (String) this.f23518a.peek();
        return str == null ? this.f23519b : str;
    }

    public final void init(String str, Set<String> set) {
        Intrinsics.checkNotNullParameter(str, "defaultBaseUrl");
        Intrinsics.checkNotNullParameter(set, "loadedUrls");
        this.f23519b = str;
        Date date = new Date();
        ArrayList arrayList = new ArrayList();
        Locale locale = Locale.ENGLISH;
        String format = new SimpleDateFormat("yyyy", locale).format(date);
        String format2 = new SimpleDateFormat("yyyyMM", locale).format(date);
        String format3 = new SimpleDateFormat("yyyyMMww", locale).format(date);
        StringBuilder sb = new StringBuilder();
        sb.append("https://a.");
        Intrinsics.checkNotNullExpressionValue(format, "year");
        sb.append(m27476a(format));
        sb.append(".com");
        arrayList.add(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://a.");
        Intrinsics.checkNotNullExpressionValue(format2, "month");
        sb2.append(m27476a(format2));
        sb2.append(".com");
        arrayList.add(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("https://a.");
        Intrinsics.checkNotNullExpressionValue(format3, "week");
        sb3.append(m27476a(format3));
        sb3.append(".com");
        arrayList.add(sb3.toString());
        Set<T> plus = SetsKt.plus(set, arrayList);
        this.f23518a.add(str);
        this.f23518a.addAll(CollectionsKt.distinct(plus));
    }

    public final String popNextEndpoint() {
        this.f23518a.poll();
        return (String) this.f23518a.peek();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r1 = com.appodeal.ads.modules.common.internal.ext.ByteArrayExtKt.toHexString(r1);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m27476a(java.lang.String r1) {
        /*
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            byte[] r1 = r1.getBytes(r0)
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            java.lang.String r0 = "SHA-224"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0019 }
            r0.update(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0019 }
            byte[] r1 = r0.digest()     // Catch:{ NoSuchAlgorithmException -> 0x0019 }
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            if (r1 != 0) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            java.lang.String r1 = com.appodeal.ads.modules.common.internal.ext.ByteArrayExtKt.toHexString(r1)
            if (r1 != 0) goto L_0x0025
        L_0x0023:
            java.lang.String r1 = "appbaqend"
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.modules.libs.network.endpoint.C9294a.m27476a(java.lang.String):java.lang.String");
    }
}
