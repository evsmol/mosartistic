package com.criteo.publisher.advancednative;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.criteo.publisher.advancednative.h */
/* compiled from: ImageLoaderHolder */
public class C1039h {

    /* renamed from: a */
    private final AtomicReference<ImageLoader> f3429a;

    public C1039h(ImageLoader imageLoader) {
        this.f3429a = new AtomicReference<>(imageLoader);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ImageLoader mo3057a() {
        return this.f3429a.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3058a(ImageLoader imageLoader) {
        this.f3429a.set(imageLoader);
    }
}
