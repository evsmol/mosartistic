package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.api.p286a.C10183a;
import com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10065a;
import com.bytedance.sdk.component.utils.C10627f;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import java.io.File;

public class CacheDirFactory {
    public static volatile C10183a MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    public static volatile C10183a TTVIDEO_CACHE_DIR = null;

    /* renamed from: a */
    private static String f26617a = null;

    /* renamed from: b */
    private static int f26618b = 1;

    /* renamed from: a */
    private static C10183a m31391a() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                if (MEDIA_CACHE_DIR == null) {
                    MEDIA_CACHE_DIR = new C10065a();
                    MEDIA_CACHE_DIR.mo62646a(getRootDir());
                    MEDIA_CACHE_DIR.mo62650c();
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File a = C10627f.m31204a(C0558m.m2663a(), C0934b.m4334c(), "tt_ad");
        if (a.isFile()) {
            a.delete();
        }
        if (!a.exists()) {
            a.mkdirs();
        }
        String absolutePath = a.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    public static C10183a getICacheDir(int i) {
        return m31391a();
    }

    public static String getBrandCacheDir() {
        return getRootDir() + File.separator + "video_brand";
    }

    public static int getCacheType() {
        return f26618b;
    }

    public static String getImageCacheDir() {
        if (f26617a == null) {
            f26617a = getDiskCacheDirPath("image");
        }
        return f26617a;
    }

    public static String getDiskCacheDirPath(String str) {
        return getRootDir() + File.separator + str;
    }
}
