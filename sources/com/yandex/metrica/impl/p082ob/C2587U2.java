package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Handler;
import android.os.ResultReceiver;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

/* renamed from: com.yandex.metrica.impl.ob.U2 */
class C2587U2 {
    C2587U2() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2936f0 mo16757a(Handler handler, C2548T2 t2) {
        return new C2936f0(handler, t2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1850A3 mo16753a(Context context, C2936f0 f0Var) {
        return new C1850A3(context, (ResultReceiver) f0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2541T1 mo16755a(C1850A3 a3, Context context, ICommonExecutor iCommonExecutor) {
        return new C2541T1(a3, context, new C3298o1(context, iCommonExecutor), new C2419P6(), new C3570v6());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3035hi mo16758a(Context context, C2541T1 t1, C2830b9 b9Var, Handler handler) {
        return new C3035hi(context, t1, b9Var, handler);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2837bg mo16756a(C2541T1 t1, C2830b9 b9Var, Handler handler) {
        return new C2837bg(t1, b9Var, handler);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2469R1 mo16754a(Context context, C1850A3 a3, C2541T1 t1, Handler handler, C3035hi hiVar) {
        return new C2469R1(context, a3, t1, handler, hiVar);
    }
}
