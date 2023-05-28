package p156rx.internal.operators;

import p156rx.Observable;
import p156rx.Single;
import p156rx.Subscriber;
import p156rx.internal.operators.SingleLiftObservableOperator;

/* renamed from: rx.internal.operators.SingleToObservable */
public final class SingleToObservable<T> implements Observable.OnSubscribe<T> {
    final Single.OnSubscribe<T> source;

    public SingleToObservable(Single.OnSubscribe<T> onSubscribe) {
        this.source = onSubscribe;
    }

    public void call(Subscriber<? super T> subscriber) {
        SingleLiftObservableOperator.WrapSubscriberIntoSingle wrapSubscriberIntoSingle = new SingleLiftObservableOperator.WrapSubscriberIntoSingle(subscriber);
        subscriber.add(wrapSubscriberIntoSingle);
        this.source.call(wrapSubscriberIntoSingle);
    }
}
