package com.yandex.metrica.impl.p082ob;

import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.Gm */
public class C2068Gm implements Executor {
    public void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
