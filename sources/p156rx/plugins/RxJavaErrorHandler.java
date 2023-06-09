package p156rx.plugins;

import p156rx.exceptions.Exceptions;

/* renamed from: rx.plugins.RxJavaErrorHandler */
public abstract class RxJavaErrorHandler {
    @Deprecated
    public void handleError(Throwable th) {
    }

    /* access modifiers changed from: protected */
    public String render(Object obj) throws InterruptedException {
        return null;
    }

    public final String handleOnNextValueRendering(Object obj) {
        try {
            return render(obj);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return obj.getClass().getName() + ".errorRendering";
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            return obj.getClass().getName() + ".errorRendering";
        }
    }
}
