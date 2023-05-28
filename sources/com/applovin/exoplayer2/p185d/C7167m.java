package com.applovin.exoplayer2.p185d;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.applovin.exoplayer2.p182c.C6915b;
import com.applovin.exoplayer2.p185d.C7148e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.applovin.exoplayer2.d.m */
public interface C7167m {

    /* renamed from: com.applovin.exoplayer2.d.m$a */
    public static final class C7168a {

        /* renamed from: a */
        private final byte[] f15741a;

        /* renamed from: b */
        private final String f15742b;

        /* renamed from: c */
        private final int f15743c;

        public C7168a(byte[] bArr, String str, int i) {
            this.f15741a = bArr;
            this.f15742b = str;
            this.f15743c = i;
        }

        /* renamed from: a */
        public byte[] mo53839a() {
            return this.f15741a;
        }

        /* renamed from: b */
        public String mo53840b() {
            return this.f15742b;
        }
    }

    /* renamed from: com.applovin.exoplayer2.d.m$b */
    public interface C7169b {
        /* renamed from: a */
        void mo53790a(C7167m mVar, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    /* renamed from: com.applovin.exoplayer2.d.m$c */
    public interface C7170c {
        C7167m acquireExoMediaDrm(UUID uuid);
    }

    /* renamed from: com.applovin.exoplayer2.d.m$d */
    public static final class C7171d {

        /* renamed from: a */
        private final byte[] f15744a;

        /* renamed from: b */
        private final String f15745b;

        public C7171d(byte[] bArr, String str) {
            this.f15744a = bArr;
            this.f15745b = str;
        }

        /* renamed from: a */
        public byte[] mo53841a() {
            return this.f15744a;
        }

        /* renamed from: b */
        public String mo53842b() {
            return this.f15745b;
        }
    }

    /* renamed from: a */
    C7168a mo53826a(byte[] bArr, List<C7148e.C7150a> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException;

    /* renamed from: a */
    void mo53827a(C7169b bVar);

    /* renamed from: a */
    void mo53828a(byte[] bArr);

    /* renamed from: a */
    boolean mo53829a(byte[] bArr, String str);

    /* renamed from: a */
    byte[] mo53830a() throws MediaDrmException;

    /* renamed from: a */
    byte[] mo53831a(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    /* renamed from: b */
    C7171d mo53832b();

    /* renamed from: b */
    void mo53833b(byte[] bArr) throws DeniedByServerException;

    /* renamed from: b */
    void mo53834b(byte[] bArr, byte[] bArr2);

    /* renamed from: c */
    Map<String, String> mo53835c(byte[] bArr);

    /* renamed from: c */
    void mo53836c();

    /* renamed from: d */
    int mo53837d();

    /* renamed from: d */
    C6915b mo53838d(byte[] bArr) throws MediaCryptoException;
}
