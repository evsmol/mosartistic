package com.yandex.metrica.networktasks.api;

/* renamed from: com.yandex.metrica.networktasks.api.c */
class C3758c {

    /* renamed from: a */
    final NetworkTask f9696a;

    /* renamed from: b */
    private final String f9697b;

    private C3758c(NetworkTask networkTask) {
        this.f9696a = networkTask;
        this.f9697b = networkTask.description();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3758c.class != obj.getClass()) {
            return false;
        }
        return this.f9697b.equals(((C3758c) obj).f9697b);
    }

    public int hashCode() {
        return this.f9697b.hashCode();
    }
}
