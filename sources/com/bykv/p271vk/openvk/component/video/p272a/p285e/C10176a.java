package com.bykv.p271vk.openvk.component.video.p272a.p285e;

import android.os.Build;
import android.view.View;

/* renamed from: com.bykv.vk.openvk.component.video.a.e.a */
/* compiled from: MediaHelper */
public class C10176a {

    /* renamed from: a */
    private static final int f25155a = Build.VERSION.SDK_INT;

    /* renamed from: a */
    public static int m29068a(long j, long j2) {
        return Math.min(Math.max(0, j2 > 0 ? (int) (((((double) j) * 1.0d) / ((double) j2)) * 100.0d) : 0), 100);
    }

    /* renamed from: a */
    public static String m29069a(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / 60000;
        long j3 = ((j % 3600000) % 60000) / 1000;
        if (j2 >= 10) {
            sb.append(j2);
        } else if (j2 > 0) {
            sb.append(0);
            sb.append(j2);
        } else {
            sb.append(0);
            sb.append(0);
        }
        sb.append(":");
        if (j3 >= 10) {
            sb.append(j3);
        } else if (j3 > 0) {
            sb.append(0);
            sb.append(j3);
        } else {
            sb.append(0);
            sb.append(0);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m29070a(View view, boolean z) {
        if (view != null) {
            if (z) {
                view.setSystemUiVisibility(0);
                return;
            }
            int i = f25155a;
            if (i >= 19) {
                view.setSystemUiVisibility(3846);
            } else if (i >= 16) {
                view.setSystemUiVisibility(5);
            } else {
                view.setSystemUiVisibility(1);
            }
        }
    }
}
