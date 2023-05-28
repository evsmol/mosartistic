package com.criteo.publisher.p061c0;

import com.criteo.publisher.C1146i;
import java.util.UUID;

/* renamed from: com.criteo.publisher.c0.d */
/* compiled from: UniqueIdGenerator */
public class C1061d {

    /* renamed from: a */
    private final C1146i f3465a;

    /* renamed from: a */
    private byte m4951a(long j, int i) {
        int i2 = (64 - (i + 1)) << 2;
        return (byte) ((int) (((j & (15 << i2)) >> i2) & 15));
    }

    /* renamed from: a */
    private long m4952a(long j, int i, byte b) {
        int i2 = (64 - (i + 1)) << 2;
        return (j & (~(15 << i2))) | (((long) b) << i2);
    }

    public C1061d(C1146i iVar) {
        this.f3465a = iVar;
    }

    /* renamed from: a */
    public String mo3078a() {
        return mo3079a(UUID.randomUUID(), this.f3465a.mo3242a() / 1000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo3079a(UUID uuid, long j) {
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        long a = m4952a(mostSignificantBits, 12, m4951a(mostSignificantBits, 0));
        long j2 = (j << 32) | (a & 4294967295L);
        return String.format("%016x%016x", new Object[]{Long.valueOf(j2), Long.valueOf(m4952a(leastSignificantBits, 0, m4951a(a, 1)))});
    }
}
