package com.yandex.metrica.impl.p082ob;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.yandex.metrica.impl.ob.m7 */
class C3203m7 implements FilenameFilter {
    C3203m7(C3250n7 n7Var) {
    }

    public boolean accept(File file, String str) {
        return str.endsWith(".dmp");
    }
}
