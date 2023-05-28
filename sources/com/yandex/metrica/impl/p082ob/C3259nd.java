package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.networktasks.api.ResponseValidityChecker;

/* renamed from: com.yandex.metrica.impl.ob.nd */
public final class C3259nd implements ResponseValidityChecker {
    public boolean isResponseValid(int i) {
        return (i == 400 || i == 500) ? false : true;
    }
}
