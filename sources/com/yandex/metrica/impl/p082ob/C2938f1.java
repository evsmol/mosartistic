package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.f1 */
public class C2938f1 {

    /* renamed from: a */
    private final C3310o6 f7784a;

    /* renamed from: b */
    private final C2174J2 f7785b;

    /* renamed from: c */
    private final C1906C f7786c;

    /* renamed from: d */
    private final C3598w f7787d;

    /* renamed from: e */
    private final List<C3140l2> f7788e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2938f1(Context context, ICommonExecutor iCommonExecutor) {
        this(C1848A2.m6808a(21) ? new C3341p6(context) : new C3388q6(), new C2174J2(context, iCommonExecutor), new C1906C(context, iCommonExecutor), new C3598w());
    }

    /* renamed from: a */
    public synchronized void mo17563a(C3140l2 l2Var) {
        this.f7788e.add(l2Var);
    }

    /* renamed from: b */
    public C1906C mo17564b() {
        return this.f7786c;
    }

    /* renamed from: c */
    public C3310o6 mo17565c() {
        return this.f7784a;
    }

    /* renamed from: d */
    public C2174J2 mo17566d() {
        return this.f7785b;
    }

    /* renamed from: e */
    public synchronized void mo17567e() {
        for (C3140l2 a : this.f7788e) {
            a.mo15575a();
        }
    }

    /* renamed from: f */
    public synchronized void mo17568f() {
        for (C3140l2 b : this.f7788e) {
            b.mo15576b();
        }
    }

    /* renamed from: a */
    public C3598w mo17562a() {
        return this.f7787d;
    }

    C2938f1(C3310o6 o6Var, C2174J2 j2, C1906C c, C3598w wVar) {
        ArrayList arrayList = new ArrayList();
        this.f7788e = arrayList;
        this.f7784a = o6Var;
        arrayList.add(o6Var);
        this.f7785b = j2;
        arrayList.add(j2);
        this.f7786c = c;
        arrayList.add(c);
        this.f7787d = wVar;
        arrayList.add(wVar);
    }
}
