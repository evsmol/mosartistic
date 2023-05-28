package p164c;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: c.a */
public abstract class C6153a {

    /* renamed from: a */
    public static final AtomicBoolean f13107a = new AtomicBoolean(false);

    /* renamed from: a */
    public final void mo50212a(Context context) {
        if (f13107a.compareAndSet(false, true)) {
            try {
                mo18656b(context);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public abstract void mo18656b(Context context);
}
