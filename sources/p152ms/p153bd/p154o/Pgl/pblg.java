package p152ms.p153bd.p154o.Pgl;

import android.content.res.AssetManager;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import p152ms.p153bd.p154o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.pblg */
final class pblg extends pblb.pgla {
    pblg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        IOException e;
        AssetManager assets = pgla.m14675a().mo42236b().getAssets();
        if (!str.startsWith((String) pblk.m14617a(16777217, 0, 0, "df24d3", new byte[]{59}))) {
            str = ((String) pblk.m14617a(16777217, 0, 0, "6af8e7", new byte[]{105})) + str;
        }
        String[] list = assets.list("");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.length; i2++) {
            if (list[i2].endsWith(str)) {
                String str2 = list[i2];
                String absolutePath = File.createTempFile((String) pblk.m14617a(16777217, 0, 0, "34dbd5", new byte[]{47, 37, Ascii.DC2, Ascii.f15552SO, 79}), "").getAbsolutePath();
                FileOutputStream fileOutputStream2 = null;
                try {
                    inputStream = assets.open(str2);
                    try {
                        fileOutputStream = new FileOutputStream(absolutePath);
                    } catch (IOException e2) {
                        e = e2;
                        try {
                            e.printStackTrace();
                            fileOutputStream = fileOutputStream2;
                            pblz.m14673a((Closeable) inputStream);
                            pblz.m14673a((Closeable) fileOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            pblz.m14673a((Closeable) inputStream);
                            pblz.m14673a((Closeable) fileOutputStream2);
                            throw th;
                        }
                    }
                    try {
                        if (pblz.m14671a(inputStream, fileOutputStream) > 0) {
                            arrayList.add(absolutePath);
                        }
                    } catch (IOException e3) {
                        e = e3;
                        fileOutputStream2 = fileOutputStream;
                        e.printStackTrace();
                        fileOutputStream = fileOutputStream2;
                        pblz.m14673a((Closeable) inputStream);
                        pblz.m14673a((Closeable) fileOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2 = fileOutputStream;
                        pblz.m14673a((Closeable) inputStream);
                        pblz.m14673a((Closeable) fileOutputStream2);
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                    inputStream = null;
                    e.printStackTrace();
                    fileOutputStream = fileOutputStream2;
                    pblz.m14673a((Closeable) inputStream);
                    pblz.m14673a((Closeable) fileOutputStream);
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                    pblz.m14673a((Closeable) inputStream);
                    pblz.m14673a((Closeable) fileOutputStream2);
                    throw th;
                }
                pblz.m14673a((Closeable) inputStream);
                pblz.m14673a((Closeable) fileOutputStream);
            }
        }
        return arrayList.toArray(new String[0]);
    }
}
