package androidx.core.p161os;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.core.os.HandlerCompat */
public final class HandlerCompat {
    public static Handler createAsync(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.createAsync(looper);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, true});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException e) {
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else if (cause instanceof Error) {
                    throw ((Error) cause);
                } else {
                    throw new RuntimeException(cause);
                }
            }
        }
        return new Handler(looper);
    }

    /* renamed from: androidx.core.os.HandlerCompat$Api28Impl */
    private static class Api28Impl {
        public static Handler createAsync(Looper looper) {
            return Handler.createAsync(looper);
        }
    }
}
