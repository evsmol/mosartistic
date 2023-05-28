package com.bytedance.sdk.component.p313d.p316c.p321c;

import java.io.Closeable;

/* renamed from: com.bytedance.sdk.component.d.c.c.b */
/* compiled from: IOUtils */
public class C10531b {
    /* renamed from: a */
    public static void m30852a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
