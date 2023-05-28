package p156rx;

import p156rx.functions.Action1;

/* renamed from: rx.Single */
public class Single<T> {

    /* renamed from: rx.Single$OnSubscribe */
    public interface OnSubscribe<T> extends Action1<SingleSubscriber<? super T>> {
    }
}
