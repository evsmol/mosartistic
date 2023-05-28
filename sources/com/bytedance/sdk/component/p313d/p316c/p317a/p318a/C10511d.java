package com.bytedance.sdk.component.p313d.p316c.p317a.p318a;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.sdk.component.d.c.a.a.d */
/* compiled from: Util */
final class C10511d {

    /* renamed from: a */
    static final Charset f26212a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f26213b = Charset.forName("UTF-8");

    /* renamed from: a */
    static void m30736a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m30736a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
