package p156rx;

import p156rx.functions.Action1;
import p156rx.functions.Func1;
import p156rx.plugins.RxJavaHooks;
import p156rx.subscriptions.Subscriptions;

/* renamed from: rx.Completable */
public class Completable {
    static final Completable COMPLETE = new Completable(new OnSubscribe() {
        public void call(CompletableSubscriber completableSubscriber) {
            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
            completableSubscriber.onCompleted();
        }
    }, false);
    static final Completable NEVER = new Completable(new OnSubscribe() {
        public void call(CompletableSubscriber completableSubscriber) {
            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
        }
    }, false);
    private final OnSubscribe onSubscribe;

    /* renamed from: rx.Completable$OnSubscribe */
    public interface OnSubscribe extends Action1<CompletableSubscriber> {
    }

    /* renamed from: rx.Completable$Operator */
    public interface Operator extends Func1<CompletableSubscriber, CompletableSubscriber> {
    }

    protected Completable(OnSubscribe onSubscribe2, boolean z) {
        this.onSubscribe = z ? RxJavaHooks.onCreate(onSubscribe2) : onSubscribe2;
    }
}
