package com.bykv.p271vk.openvk.component.video.p272a.p285e;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.bykv.vk.openvk.component.video.a.e.c */
/* compiled from: VideoFilesUtils */
public class C10180c {
    /* renamed from: a */
    public static long m29075a(String str, String str2) {
        File c = m29078c(str, str2);
        if (c.exists()) {
            return c.length();
        }
        File b = m29077b(str, str2);
        if (b.exists()) {
            return b.length();
        }
        return 0;
    }

    /* renamed from: b */
    public static File m29077b(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2 + ".temp");
    }

    /* renamed from: c */
    public static File m29078c(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    /* renamed from: a */
    public static void m29076a(RandomAccessFile randomAccessFile, byte[] bArr, int i, int i2, String str) throws IOException {
        try {
            randomAccessFile.seek((long) i);
            randomAccessFile.write(bArr, 0, i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
