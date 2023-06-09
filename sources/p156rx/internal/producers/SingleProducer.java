package p156rx.internal.producers;

import java.util.concurrent.atomic.AtomicBoolean;
import p156rx.Producer;
import p156rx.Subscriber;
import p156rx.exceptions.Exceptions;

/* renamed from: rx.internal.producers.SingleProducer */
public final class SingleProducer<T> extends AtomicBoolean implements Producer {
    final Subscriber<? super T> child;
    final T value;

    public SingleProducer(Subscriber<? super T> subscriber, T t) {
        this.child = subscriber;
        this.value = t;
    }

    public void request(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        } else if (i != 0 && compareAndSet(false, true)) {
            Subscriber<? super T> subscriber = this.child;
            if (!subscriber.isUnsubscribed()) {
                T t = this.value;
                try {
                    subscriber.onNext(t);
                    if (!subscriber.isUnsubscribed()) {
                        subscriber.onCompleted();
                    }
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, subscriber, t);
                }
            }
        }
    }
}
