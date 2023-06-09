package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.Spliterator;

final class SingletonImmutableList<E> extends ImmutableList<E> {
    final transient E element;

    public int size() {
        return 1;
    }

    SingletonImmutableList(E e) {
        this.element = Preconditions.checkNotNull(e);
    }

    public E get(int i) {
        Preconditions.checkElementIndex(i, 1);
        return this.element;
    }

    public UnmodifiableIterator<E> iterator() {
        return Iterators.singletonIterator(this.element);
    }

    public Spliterator<E> spliterator() {
        return Collections.singleton(this.element).spliterator();
    }

    public ImmutableList<E> subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, 1);
        return i == i2 ? ImmutableList.m11239of() : this;
    }

    public String toString() {
        String obj = this.element.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
