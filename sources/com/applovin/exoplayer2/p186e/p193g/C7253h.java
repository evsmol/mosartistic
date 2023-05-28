package com.applovin.exoplayer2.p186e.p193g;

import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7772y;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: com.applovin.exoplayer2.e.g.h */
public final class C7253h {

    /* renamed from: com.applovin.exoplayer2.e.g.h$a */
    private static class C7254a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final UUID f16220a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f16221b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final byte[] f16222c;

        public C7254a(UUID uuid, int i, byte[] bArr) {
            this.f16220a = uuid;
            this.f16221b = i;
            this.f16222c = bArr;
        }
    }

    /* renamed from: a */
    public static boolean m19764a(byte[] bArr) {
        return m19770d(bArr) != null;
    }

    /* renamed from: a */
    public static byte[] m19765a(UUID uuid, byte[] bArr) {
        return m19766a(uuid, (UUID[]) null, bArr);
    }

    /* renamed from: a */
    public static byte[] m19766a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || bArr.length == 0)) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: a */
    public static byte[] m19767a(byte[] bArr, UUID uuid) {
        C7254a d = m19770d(bArr);
        if (d == null) {
            return null;
        }
        if (uuid.equals(d.f16220a)) {
            return d.f16222c;
        }
        C7755q.m22361c("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + d.f16220a + ".");
        return null;
    }

    /* renamed from: b */
    public static UUID m19768b(byte[] bArr) {
        C7254a d = m19770d(bArr);
        if (d == null) {
            return null;
        }
        return d.f16220a;
    }

    /* renamed from: c */
    public static int m19769c(byte[] bArr) {
        C7254a d = m19770d(bArr);
        if (d == null) {
            return -1;
        }
        return d.f16221b;
    }

    /* renamed from: d */
    private static C7254a m19770d(byte[] bArr) {
        C7772y yVar = new C7772y(bArr);
        if (yVar.mo55072b() < 32) {
            return null;
        }
        yVar.mo55076d(0);
        if (yVar.mo55093q() != yVar.mo55064a() + 4 || yVar.mo55093q() != 1886614376) {
            return null;
        }
        int a = C7233a.m19618a(yVar.mo55093q());
        if (a > 1) {
            C7755q.m22361c("PsshAtomUtil", "Unsupported pssh version: " + a);
            return null;
        }
        UUID uuid = new UUID(yVar.mo55095s(), yVar.mo55095s());
        if (a == 1) {
            yVar.mo55079e(yVar.mo55099w() * 16);
        }
        int w = yVar.mo55099w();
        if (w != yVar.mo55064a()) {
            return null;
        }
        byte[] bArr2 = new byte[w];
        yVar.mo55071a(bArr2, 0, w);
        return new C7254a(uuid, a, bArr2);
    }
}
