package com.yandex.metrica;

@Deprecated
/* renamed from: com.yandex.metrica.b */
public enum C10705b {
    PHONE("phone"),
    TABLET("tablet"),
    TV("tv");
    

    /* renamed from: a */
    private final String f26800a;

    private C10705b(String str) {
        this.f26800a = str;
    }

    /* renamed from: a */
    public String mo64728a() {
        return this.f26800a;
    }

    /* renamed from: a */
    public static C10705b m31526a(String str) {
        C10705b[] values = values();
        for (int i = 0; i < 3; i++) {
            C10705b bVar = values[i];
            if (bVar.f26800a.equals(str)) {
                return bVar;
            }
        }
        return null;
    }
}
