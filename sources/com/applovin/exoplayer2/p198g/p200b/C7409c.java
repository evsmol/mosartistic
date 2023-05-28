package com.applovin.exoplayer2.p198g.p200b;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.g.b.c */
public final class C7409c {

    /* renamed from: a */
    private final ByteArrayOutputStream f16989a = new ByteArrayOutputStream(512);

    /* renamed from: b */
    private final DataOutputStream f16990b = new DataOutputStream(this.f16989a);

    /* renamed from: a */
    private static void m20639a(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public byte[] mo54235a(C7406a aVar) {
        this.f16989a.reset();
        try {
            m20639a(this.f16990b, aVar.f16983a);
            m20639a(this.f16990b, aVar.f16984b != null ? aVar.f16984b : "");
            this.f16990b.writeLong(aVar.f16985c);
            this.f16990b.writeLong(aVar.f16986d);
            this.f16990b.write(aVar.f16987e);
            this.f16990b.flush();
            return this.f16989a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
