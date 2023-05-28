package com.yandex.metrica.impl.p082ob;

import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.m6 */
public class C3202m6 {
    /* renamed from: a */
    public boolean mo17838a(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return file.mkdir();
        }
        if (file.isDirectory()) {
            return true;
        }
        if (file.delete()) {
            return file.mkdir();
        }
        return false;
    }
}
