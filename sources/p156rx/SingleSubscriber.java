package p156rx;

import p156rx.internal.util.SubscriptionList;

/* renamed from: rx.SingleSubscriber */
public abstract class SingleSubscriber<T> implements Subscription {

    /* renamed from: cs */
    private final SubscriptionList f13048cs = new SubscriptionList();

    public abstract void onError(Throwable th);

    public abstract void onSuccess(T t);

    public final void add(Subscription subscription) {
        this.f13048cs.add(subscription);
    }

    public final void unsubscribe() {
        this.f13048cs.unsubscribe();
    }

    public final boolean isUnsubscribed() {
        return this.f13048cs.isUnsubscribed();
    }
}
