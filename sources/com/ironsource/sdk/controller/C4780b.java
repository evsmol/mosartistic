package com.ironsource.sdk.controller;

import java.util.ArrayList;

/* renamed from: com.ironsource.sdk.controller.b */
public final class C4780b {

    /* renamed from: a */
    private int f12164a = C4781a.f12167a;

    /* renamed from: b */
    private ArrayList f12165b = new ArrayList();

    /* renamed from: c */
    private String f12166c;

    /* renamed from: com.ironsource.sdk.controller.b$a */
    enum C4781a {
        ;
        

        /* renamed from: a */
        public static final int f12167a = 1;

        /* renamed from: b */
        public static final int f12168b = 2;

        static {
            f12169c = new int[]{1, 2};
        }
    }

    public C4780b(String str) {
        this.f12166c = str;
    }

    /* renamed from: a */
    public final synchronized void mo34323a() {
        this.f12164a = C4781a.f12168b;
    }

    /* renamed from: a */
    public final synchronized void mo34324a(Runnable runnable) {
        if (this.f12164a != C4781a.f12168b) {
            this.f12165b.add(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: b */
    public final synchronized void mo34325b() {
        Object[] array = this.f12165b.toArray();
        for (int i = 0; i < array.length; i++) {
            ((Runnable) array[i]).run();
            array[i] = null;
        }
        this.f12165b.clear();
    }
}
