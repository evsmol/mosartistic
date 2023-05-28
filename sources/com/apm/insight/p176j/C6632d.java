package com.apm.insight.p176j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.p178l.C6662a;
import com.apm.insight.p178l.C6688q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.apm.insight.j.d */
public final class C6632d {

    /* renamed from: a */
    private List<C6628a> f14253a = new ArrayList(3);

    private C6632d(Handler handler, Context context) {
        if (C6662a.m16479b(context)) {
            this.f14253a.add(new C6631c(handler, 0, 15000));
        }
    }

    /* renamed from: a */
    public static C6632d m16360a(Handler handler, Context context) {
        return new C6632d(handler, context);
    }

    /* renamed from: a */
    public void mo52120a() {
        C6688q.m16625a((Object) "[ScheduleTaskManager] execute, task size=" + this.f14253a.size());
        for (C6628a a : this.f14253a) {
            try {
                a.mo52113a();
            } catch (Throwable unused) {
            }
        }
    }
}
