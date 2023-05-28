package com.applovin.exoplayer2.p220k;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.exoplayer2.p220k.C7670i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.exoplayer2.k.t */
public interface C7691t extends C7670i {

    /* renamed from: a */
    public static final Predicate<String> f18159a = $$Lambda$t$H1UlgPnTKRt6qV1j43DU5tw7_I.INSTANCE;

    /* renamed from: com.applovin.exoplayer2.k.t$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: a */
        public static /* synthetic */ boolean m22042a(String str) {
            if (str == null) {
                return false;
            }
            String lowerCase = Ascii.toLowerCase(str);
            if (!TextUtils.isEmpty(lowerCase)) {
                return (!lowerCase.contains("text") || lowerCase.contains("text/vtt")) && !lowerCase.contains("html") && !lowerCase.contains("xml");
            }
            return false;
        }
    }

    /* renamed from: com.applovin.exoplayer2.k.t$a */
    public static final class C7692a extends C7694c {
        public C7692a(IOException iOException, C7674l lVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, lVar, 2007, 1);
        }
    }

    /* renamed from: com.applovin.exoplayer2.k.t$b */
    public interface C7693b extends C7670i.C7671a {

        /* renamed from: com.applovin.exoplayer2.k.t$b$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
        }

        /* renamed from: a */
        /* synthetic */ C7670i mo54901a();

        /* renamed from: c */
        C7691t mo54928c();
    }

    /* renamed from: com.applovin.exoplayer2.k.t$c */
    public static class C7694c extends C7672j {

        /* renamed from: b */
        public final C7674l f18160b;

        /* renamed from: c */
        public final int f18161c;

        public C7694c(C7674l lVar, int i, int i2) {
            super(m22045a(i, i2));
            this.f18160b = lVar;
            this.f18161c = i2;
        }

        public C7694c(IOException iOException, C7674l lVar, int i, int i2) {
            super((Throwable) iOException, m22045a(i, i2));
            this.f18160b = lVar;
            this.f18161c = i2;
        }

        public C7694c(String str, C7674l lVar, int i, int i2) {
            super(str, m22045a(i, i2));
            this.f18160b = lVar;
            this.f18161c = i2;
        }

        public C7694c(String str, IOException iOException, C7674l lVar, int i, int i2) {
            super(str, iOException, m22045a(i, i2));
            this.f18160b = lVar;
            this.f18161c = i2;
        }

        /* renamed from: a */
        private static int m22045a(int i, int i2) {
            if (i == 2000 && i2 == 1) {
                return 2001;
            }
            return i;
        }

        /* renamed from: a */
        public static C7694c m22046a(IOException iOException, C7674l lVar, int i) {
            String message = iOException.getMessage();
            int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            return i2 == 2007 ? new C7692a(iOException, lVar) : new C7694c(iOException, lVar, i2, i);
        }
    }

    /* renamed from: com.applovin.exoplayer2.k.t$d */
    public static final class C7695d extends C7694c {

        /* renamed from: d */
        public final String f18162d;

        public C7695d(String str, C7674l lVar) {
            super("Invalid content type: " + str, lVar, 2003, 1);
            this.f18162d = str;
        }
    }

    /* renamed from: com.applovin.exoplayer2.k.t$e */
    public static final class C7696e extends C7694c {

        /* renamed from: d */
        public final int f18163d;

        /* renamed from: e */
        public final String f18164e;

        /* renamed from: f */
        public final Map<String, List<String>> f18165f;

        /* renamed from: g */
        public final byte[] f18166g;

        public C7696e(int i, String str, IOException iOException, Map<String, List<String>> map, C7674l lVar, byte[] bArr) {
            super("Response code: " + i, iOException, lVar, 2004, 1);
            this.f18163d = i;
            this.f18164e = str;
            this.f18165f = map;
            this.f18166g = bArr;
        }
    }

    /* renamed from: com.applovin.exoplayer2.k.t$f */
    public static final class C7697f {

        /* renamed from: a */
        private final Map<String, String> f18167a = new HashMap();

        /* renamed from: b */
        private Map<String, String> f18168b;

        /* renamed from: a */
        public synchronized Map<String, String> mo54932a() {
            if (this.f18168b == null) {
                this.f18168b = Collections.unmodifiableMap(new HashMap(this.f18167a));
            }
            return this.f18168b;
        }
    }
}
