package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.networktasks.api.NetworkServiceLocator;
import com.yandex.metrica.networktasks.api.NetworkTask;

/* renamed from: com.yandex.metrica.impl.ob.xi */
public class C3670xi implements C3707yi {

    /* renamed from: a */
    private final C3450ri f9477a;

    public C3670xi(C3450ri riVar) {
        this.f9477a = riVar;
    }

    /* renamed from: a */
    public void mo15467a() {
        NetworkTask c = this.f9477a.mo18174c();
        if (c != null) {
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(c);
        }
    }
}
