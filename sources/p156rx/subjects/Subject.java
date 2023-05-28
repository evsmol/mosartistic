package p156rx.subjects;

import p156rx.Observable;
import p156rx.Observer;

/* renamed from: rx.subjects.Subject */
public abstract class Subject<T, R> extends Observable<R> implements Observer<T> {
    protected Subject(Observable.OnSubscribe<R> onSubscribe) {
        super(onSubscribe);
    }
}
