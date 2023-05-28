package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.networktasks.api.Compressor;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: com.yandex.metrica.impl.ob.Ql */
public class C2466Ql implements Compressor {
    public byte[] compress(byte[] bArr) throws IOException {
        if (bArr == null) {
            return null;
        }
        return C2254L0.m7693b(bArr);
    }

    public byte[] uncompress(byte[] bArr) throws IOException {
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        if (bArr == null) {
            return null;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    byte[] a = C2254L0.m7691a((InputStream) gZIPInputStream);
                    C1848A2.m6807a((Closeable) gZIPInputStream);
                    C1848A2.m6807a((Closeable) byteArrayInputStream);
                    return a;
                } catch (Throwable th2) {
                    th = th2;
                    C1848A2.m6807a((Closeable) gZIPInputStream);
                    C1848A2.m6807a((Closeable) byteArrayInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                gZIPInputStream = null;
                C1848A2.m6807a((Closeable) gZIPInputStream);
                C1848A2.m6807a((Closeable) byteArrayInputStream);
                throw th;
            }
        } catch (Throwable th4) {
            byteArrayInputStream = null;
            th = th4;
            gZIPInputStream = null;
            C1848A2.m6807a((Closeable) gZIPInputStream);
            C1848A2.m6807a((Closeable) byteArrayInputStream);
            throw th;
        }
    }
}
