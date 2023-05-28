package p156rx;

/* renamed from: rx.Observer */
public interface Observer<T> {
    void onCompleted();

    void onError(Throwable th);

    void onNext(T t);
}
