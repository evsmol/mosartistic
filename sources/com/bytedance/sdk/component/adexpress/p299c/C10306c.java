package com.bytedance.sdk.component.adexpress.p299c;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.component.adexpress.c.c */
/* compiled from: UrlUtils */
public class C10306c {
    /* renamed from: a */
    public static C10307a m29755a(String str) {
        C10307a aVar;
        C10307a aVar2 = C10307a.IMAGE;
        if (TextUtils.isEmpty(str)) {
            return aVar2;
        }
        try {
            String path = Uri.parse(str).getPath();
            if (path == null) {
                return aVar2;
            }
            if (path.endsWith(".css")) {
                aVar = C10307a.CSS;
            } else if (path.endsWith(".js")) {
                aVar = C10307a.JS;
            } else {
                if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp")) {
                    if (!path.endsWith(".ico")) {
                        if (!path.endsWith(".html")) {
                            return aVar2;
                        }
                        aVar = C10307a.HTML;
                    }
                }
                aVar = C10307a.IMAGE;
            }
            return aVar;
        } catch (Throwable unused) {
            return aVar2;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.c.c$a */
    /* compiled from: UrlUtils */
    public enum C10307a {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");
        

        /* renamed from: e */
        private String f25484e;

        private C10307a(String str) {
            this.f25484e = str;
        }

        /* renamed from: a */
        public String mo63236a() {
            return this.f25484e;
        }
    }
}
