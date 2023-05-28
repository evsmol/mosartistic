package com.google.android.youtube.player.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;

/* renamed from: com.google.android.youtube.player.internal.z */
public final class C3967z {

    /* renamed from: a */
    private static final Uri f9781a = Uri.parse("http://play.google.com/store/apps/details");

    /* renamed from: b */
    private static final String[] f9782b = {"com.google.android.youtube", "com.google.android.youtube.tv", "com.google.android.youtube.googletv", "com.google.android.gms", null};

    /* renamed from: a */
    public static String m11237a() {
        StringBuilder sb = new StringBuilder(35);
        sb.append(1);
        sb.append(".2.2");
        return sb.toString();
    }

    /* renamed from: d */
    public static String m11238d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("Cannot retrieve calling Context's PackageInfo", e);
        }
    }
}
