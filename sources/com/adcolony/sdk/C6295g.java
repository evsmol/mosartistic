package com.adcolony.sdk;

import com.adcolony.adcolonysdk.BuildConfig;
import com.appnext.ads.fullscreen.RewardedVideo;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.zip.DataFormatException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.adcolony.sdk.g */
public final class C6295g {

    /* renamed from: e */
    public static final C6296a f13511e = new C6296a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Map<String, String> f13512f = MapsKt.mutableMapOf(TuplesKt.m14544to(RewardedVideo.VIDEO_MODE_DEFAULT, "truefalse"), TuplesKt.m14544to(BuildConfig.LAUNCH_REQ_DICT_ID, BuildConfig.LAUNCH_REQ_DICT), TuplesKt.m14544to(BuildConfig.LAUNCH_RESP_DICT_ID, BuildConfig.LAUNCH_RESP_DICT));

    /* renamed from: a */
    private final String f13513a;

    /* renamed from: b */
    private final String f13514b;

    /* renamed from: c */
    private final String f13515c;

    /* renamed from: d */
    private final String f13516d;

    /* renamed from: com.adcolony.sdk.g$a */
    public static final class C6296a {
        private C6296a() {
        }

        public /* synthetic */ C6296a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Map<String, String> mo50717a() {
            return C6295g.f13512f;
        }

        /* renamed from: a */
        public final void mo50718a(Map<String, String> map) {
            synchronized (mo50717a()) {
                C6295g.f13511e.mo50717a().putAll(map);
                Unit unit = Unit.INSTANCE;
            }
        }

        /* renamed from: a */
        public final C6295g mo50716a(String str, String str2) {
            C6295g gVar;
            if (str == null || str2 == null) {
                return null;
            }
            synchronized (mo50717a()) {
                C6296a aVar = C6295g.f13511e;
                if (!aVar.mo50717a().containsKey(str)) {
                    str = RewardedVideo.VIDEO_MODE_DEFAULT;
                }
                if (!aVar.mo50717a().containsKey(str2)) {
                    str2 = RewardedVideo.VIDEO_MODE_DEFAULT;
                }
                gVar = new C6295g(str, str2, aVar.mo50717a().get(str), aVar.mo50717a().get(str2));
            }
            return gVar;
        }
    }

    public C6295g(String str, String str2, String str3, String str4) {
        this.f13513a = str;
        this.f13514b = str2;
        this.f13515c = str3;
        this.f13516d = str4;
    }

    /* renamed from: a */
    public static final C6295g m15271a(String str, String str2) {
        return f13511e.mo50716a(str, str2);
    }

    /* renamed from: a */
    public static final void m15273a(Map<String, String> map) {
        f13511e.mo50718a(map);
    }

    /* renamed from: b */
    public final String mo50713b() {
        return this.f13513a;
    }

    /* renamed from: c */
    public final String mo50715c() {
        return this.f13514b;
    }

    /* renamed from: a */
    public final byte[] mo50711a(String str) throws UnsupportedEncodingException {
        return mo50712a(str.getBytes(C6311h.f13542a));
    }

    /* renamed from: b */
    public final String mo50714b(byte[] bArr) throws DataFormatException, UnsupportedEncodingException, IllegalArgumentException {
        return m15275b(bArr, this.f13516d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        kotlin.p151io.CloseableKt.closeFinally(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        throw r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m15275b(byte[] r6, java.lang.String r7) throws java.util.zip.DataFormatException, java.io.UnsupportedEncodingException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            r0.setInput(r6)     // Catch:{ all -> 0x0053 }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0053 }
            r6.<init>()     // Catch:{ all -> 0x0053 }
            r1 = 0
            r2 = 512(0x200, float:7.175E-43)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x004c }
        L_0x0012:
            boolean r3 = r0.finished()     // Catch:{ all -> 0x004c }
            if (r3 != 0) goto L_0x003a
            int r3 = r0.inflate(r2)     // Catch:{ all -> 0x004c }
            r4 = 0
            r6.write(r2, r4, r3)     // Catch:{ all -> 0x004c }
            boolean r3 = r0.needsDictionary()     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x0012
            java.nio.charset.Charset r3 = com.adcolony.sdk.C6311h.f13542a     // Catch:{ all -> 0x004c }
            if (r7 == 0) goto L_0x0032
            byte[] r3 = r7.getBytes(r3)     // Catch:{ all -> 0x004c }
            r0.setDictionary(r3)     // Catch:{ all -> 0x004c }
            goto L_0x0012
        L_0x0032:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r7.<init>(r1)     // Catch:{ all -> 0x004c }
            throw r7     // Catch:{ all -> 0x004c }
        L_0x003a:
            byte[] r7 = r6.toByteArray()     // Catch:{ all -> 0x004c }
            java.nio.charset.Charset r2 = com.adcolony.sdk.C6311h.f13542a     // Catch:{ all -> 0x004c }
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x004c }
            r3.<init>(r7, r2)     // Catch:{ all -> 0x004c }
            kotlin.p151io.CloseableKt.closeFinally(r6, r1)     // Catch:{ all -> 0x0053 }
            r0.end()
            return r3
        L_0x004c:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            kotlin.p151io.CloseableKt.closeFinally(r6, r7)     // Catch:{ all -> 0x0053 }
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r6 = move-exception
            r0.end()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C6295g.m15275b(byte[], java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final byte[] mo50712a(byte[] bArr) throws UnsupportedEncodingException {
        return m15274a(bArr, this.f13515c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        kotlin.p151io.CloseableKt.closeFinally(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] m15274a(byte[] r5, java.lang.String r6) throws java.io.UnsupportedEncodingException {
        /*
            r4 = this;
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r0.<init>()
            java.nio.charset.Charset r1 = com.adcolony.sdk.C6311h.f13542a     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x0041
            byte[] r6 = r6.getBytes(r1)     // Catch:{ all -> 0x0049 }
            r0.setDictionary(r6)     // Catch:{ all -> 0x0049 }
            r0.setInput(r5)     // Catch:{ all -> 0x0049 }
            r0.finish()     // Catch:{ all -> 0x0049 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0049 }
            r5.<init>()     // Catch:{ all -> 0x0049 }
            r6 = 0
            r1 = 512(0x200, float:7.175E-43)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x003a }
        L_0x0020:
            boolean r2 = r0.finished()     // Catch:{ all -> 0x003a }
            if (r2 != 0) goto L_0x002f
            int r2 = r0.deflate(r1)     // Catch:{ all -> 0x003a }
            r3 = 0
            r5.write(r1, r3, r2)     // Catch:{ all -> 0x003a }
            goto L_0x0020
        L_0x002f:
            byte[] r1 = r5.toByteArray()     // Catch:{ all -> 0x003a }
            kotlin.p151io.CloseableKt.closeFinally(r5, r6)     // Catch:{ all -> 0x0049 }
            r0.end()
            return r1
        L_0x003a:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            kotlin.p151io.CloseableKt.closeFinally(r5, r6)     // Catch:{ all -> 0x0049 }
            throw r1     // Catch:{ all -> 0x0049 }
        L_0x0041:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch:{ all -> 0x0049 }
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.String"
            r5.<init>(r6)     // Catch:{ all -> 0x0049 }
            throw r5     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r5 = move-exception
            r0.end()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C6295g.m15274a(byte[], java.lang.String):byte[]");
    }
}
