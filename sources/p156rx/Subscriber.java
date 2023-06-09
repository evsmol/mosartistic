package p156rx;

import p156rx.internal.util.SubscriptionList;

/* renamed from: rx.Subscriber */
public abstract class Subscriber<T> implements Observer<T>, Subscription {
    private Producer producer;
    private long requested;
    private final Subscriber<?> subscriber;
    private final SubscriptionList subscriptions;

    public void onStart() {
    }

    protected Subscriber() {
        this((Subscriber<?>) null, false);
    }

    protected Subscriber(Subscriber<?> subscriber2) {
        this(subscriber2, true);
    }

    protected Subscriber(Subscriber<?> subscriber2, boolean z) {
        this.requested = Long.MIN_VALUE;
        this.subscriber = subscriber2;
        this.subscriptions = (!z || subscriber2 == null) ? new SubscriptionList() : subscriber2.subscriptions;
    }

    public final void add(Subscription subscription) {
        this.subscriptions.add(subscription);
    }

    public final void unsubscribe() {
        this.subscriptions.unsubscribe();
    }

    public final boolean isUnsubscribed() {
        return this.subscriptions.isUnsubscribed();
    }

    public void setProducer(Producer producer2) {
        long j;
        boolean z;
        synchronized (this) {
            j = this.requested;
            this.producer = producer2;
            z = this.subscriber != null && j == Long.MIN_VALUE;
        }
        if (z) {
            this.subscriber.setProducer(this.producer);
        } else if (j == Long.MIN_VALUE) {
            this.producer.request(Long.MAX_VALUE);
        } else {
            this.producer.request(j);
        }
    }
}
