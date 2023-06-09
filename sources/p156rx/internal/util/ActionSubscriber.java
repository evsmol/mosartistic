package p156rx.internal.util;

import p156rx.Subscriber;
import p156rx.functions.Action0;
import p156rx.functions.Action1;

/* renamed from: rx.internal.util.ActionSubscriber */
public final class ActionSubscriber<T> extends Subscriber<T> {
    final Action0 onCompleted;
    final Action1<Throwable> onError;
    final Action1<? super T> onNext;

    public ActionSubscriber(Action1<? super T> action1, Action1<Throwable> action12, Action0 action0) {
        this.onNext = action1;
        this.onError = action12;
        this.onCompleted = action0;
    }

    public void onNext(T t) {
        this.onNext.call(t);
    }

    public void onError(Throwable th) {
        this.onError.call(th);
    }

    public void onCompleted() {
        this.onCompleted.call();
    }
}
