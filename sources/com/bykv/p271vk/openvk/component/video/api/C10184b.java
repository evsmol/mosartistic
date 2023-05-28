package com.bykv.p271vk.openvk.component.video.api;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.sdk.component.p307b.p308a.C10476i;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.component.video.api.b */
/* compiled from: VideoConfig */
public class C10184b {

    /* renamed from: a */
    public static boolean f25158a = false;

    /* renamed from: b */
    private static Executor f25159b = null;

    /* renamed from: c */
    private static Context f25160c = null;

    /* renamed from: d */
    private static String f25161d = null;

    /* renamed from: e */
    private static boolean f25162e = false;

    /* renamed from: f */
    private static C10476i f25163f;

    /* renamed from: g */
    private static volatile Handler f25164g;

    /* renamed from: a */
    public static Context m29123a() {
        return f25160c;
    }

    /* renamed from: b */
    public static String m29127b() {
        if (TextUtils.isEmpty(f25161d)) {
            try {
                File file = new File(m29123a().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                f25161d = file.getAbsolutePath();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return f25161d;
    }

    /* renamed from: a */
    public static void m29124a(Context context, String str, Executor executor, Handler handler) {
        f25160c = context;
        f25159b = executor;
        f25161d = str;
        f25164g = handler;
    }

    /* renamed from: c */
    public static Handler m29128c() {
        if (f25164g == null) {
            synchronized (C10184b.class) {
                if (f25164g == null) {
                    HandlerThread handlerThread = new HandlerThread("tt_pangle_thread_video_handler_thread");
                    handlerThread.start();
                    f25164g = new Handler(handlerThread.getLooper());
                }
            }
        }
        return f25164g;
    }

    /* renamed from: d */
    public static boolean m29129d() {
        return f25162e;
    }

    /* renamed from: a */
    public static void m29126a(boolean z) {
        f25162e = z;
    }

    /* renamed from: e */
    public static C10476i m29130e() {
        if (f25163f == null) {
            f25163f = new C10476i.C10477a().mo63967a(10000, TimeUnit.MILLISECONDS).mo63970b(10000, TimeUnit.MILLISECONDS).mo63971c(10000, TimeUnit.MILLISECONDS).mo63969a();
        }
        return f25163f;
    }

    /* renamed from: a */
    public static void m29125a(C10476i iVar) {
        f25163f = iVar;
    }

    /* renamed from: f */
    public static boolean m29131f() {
        return f25158a;
    }
}
