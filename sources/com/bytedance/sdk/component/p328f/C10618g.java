package com.bytedance.sdk.component.p328f;

import java.util.UUID;

/* renamed from: com.bytedance.sdk.component.f.g */
/* compiled from: TTRunnable */
public abstract class C10618g implements Comparable<C10618g>, Runnable {

    /* renamed from: a */
    private int f26501a;

    /* renamed from: b */
    private String f26502b;

    /* renamed from: c */
    private String f26503c;

    public C10618g(String str, int i) {
        this.f26501a = 0;
        this.f26501a = i == 0 ? 5 : i;
        this.f26502b = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());
        this.f26503c = str;
    }

    public C10618g(String str) {
        this.f26501a = 0;
        this.f26501a = 5;
        this.f26502b = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());
        this.f26503c = str;
    }

    /* renamed from: a */
    public void mo64255a(int i) {
        this.f26501a = i;
    }

    /* renamed from: a */
    public int mo64253a() {
        return this.f26501a;
    }

    /* renamed from: a */
    public int compareTo(C10618g gVar) {
        if (mo64253a() < gVar.mo64253a()) {
            return 1;
        }
        return mo64253a() >= gVar.mo64253a() ? -1 : 0;
    }

    /* renamed from: b */
    public String mo64256b() {
        return this.f26503c;
    }
}
