package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: com.bytedance.sdk.component.utils.h */
/* compiled from: HandlerUtils */
public class C10631h {

    /* renamed from: a */
    private static volatile HandlerThread f26515a = new HandlerThread("tt_pangle_thread_io_handler");

    /* renamed from: b */
    private static volatile Handler f26516b;

    /* renamed from: c */
    private static volatile Handler f26517c = new Handler(f26515a.getLooper());

    static {
        f26515a.start();
    }

    /* renamed from: a */
    public static Handler m31217a() {
        if (f26515a == null || !f26515a.isAlive()) {
            synchronized (C10631h.class) {
                if (f26515a == null || !f26515a.isAlive()) {
                    f26515a = new HandlerThread("tt_pangle_thread_io_handler");
                    f26515a.start();
                    f26517c = new Handler(f26515a.getLooper());
                }
            }
        }
        return f26517c;
    }

    /* renamed from: b */
    public static Handler m31218b() {
        if (f26516b == null) {
            synchronized (C10631h.class) {
                if (f26516b == null) {
                    f26516b = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f26516b;
    }
}
