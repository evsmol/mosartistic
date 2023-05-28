package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.D6 */
public final class C1947D6 {

    /* renamed from: a */
    private final String f5224a;

    /* renamed from: b */
    private final String f5225b;

    /* renamed from: c */
    private final Integer f5226c;

    /* renamed from: d */
    private final Integer f5227d;

    /* renamed from: e */
    private final String f5228e;

    /* renamed from: f */
    private final Boolean f5229f;

    public C1947D6(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f5224a = str;
        this.f5225b = str2;
        this.f5226c = num;
        this.f5227d = num2;
        this.f5228e = str3;
        this.f5229f = bool;
    }

    /* renamed from: a */
    public final String mo15619a() {
        return this.f5224a;
    }

    /* renamed from: b */
    public final Integer mo15620b() {
        return this.f5227d;
    }

    /* renamed from: c */
    public final String mo15621c() {
        return this.f5225b;
    }

    /* renamed from: d */
    public final Integer mo15622d() {
        return this.f5226c;
    }

    /* renamed from: e */
    public final String mo15623e() {
        return this.f5228e;
    }

    /* renamed from: f */
    public final Boolean mo15624f() {
        return this.f5229f;
    }

    public C1947D6(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), (Integer) null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
