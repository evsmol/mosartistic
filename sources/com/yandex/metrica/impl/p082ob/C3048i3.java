package com.yandex.metrica.impl.p082ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.i3 */
public class C3048i3 implements C3293nm<Thread, C1979E6> {
    /* renamed from: a */
    public C1979E6 mo15448a(Thread thread) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new C1979E6(name, priority, id, threadGroup != null ? threadGroup.getName() : "", (Integer) null, (List<StackTraceElement>) null);
    }
}
