package p156rx;

import p156rx.exceptions.Exceptions;
import p156rx.exceptions.OnErrorFailedException;
import p156rx.functions.Action1;
import p156rx.functions.Actions;
import p156rx.functions.Func1;
import p156rx.internal.util.ActionSubscriber;
import p156rx.internal.util.InternalObservableUtils;
import p156rx.observers.SafeSubscriber;
import p156rx.plugins.RxJavaHooks;

/* renamed from: rx.Observable */
public class Observable<T> {
    final OnSubscribe<T> onSubscribe;

    /* renamed from: rx.Observable$OnSubscribe */
    public interface OnSubscribe<T> extends Action1<Subscriber<? super T>> {
    }

    /* renamed from: rx.Observable$Operator */
    public interface Operator<R, T> extends Func1<Subscriber<? super R>, Subscriber<? super T>> {
    }

    protected Observable(OnSubscribe<T> onSubscribe2) {
        this.onSubscribe = onSubscribe2;
    }

    public final Subscription subscribe(Action1<? super T> action1) {
        if (action1 != null) {
            return subscribe(new ActionSubscriber(action1, InternalObservableUtils.ERROR_NOT_IMPLEMENTED, Actions.empty()));
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public final Subscription subscribe(Subscriber<? super T> subscriber) {
        return subscribe(subscriber, this);
    }

    static <T> Subscription subscribe(Subscriber<? super T> subscriber, Observable<T> observable) {
        if (subscriber == null) {
            throw new IllegalArgumentException("subscriber can not be null");
        } else if (observable.onSubscribe != null) {
            subscriber.onStart();
            if (!(subscriber instanceof SafeSubscriber)) {
                subscriber = new SafeSubscriber<>(subscriber);
            }
            try {
                RxJavaHooks.onObservableStart(observable, observable.onSubscribe).call(subscriber);
                return RxJavaHooks.onObservableReturn(subscriber);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th);
                RxJavaHooks.onObservableError(onErrorFailedException);
                throw onErrorFailedException;
            }
        } else {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
    }
}
