package com.yandex.metrica.impl.p082ob;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.j3 */
public class C3078j3 implements C3167lm<Thread, StackTraceElement[], C1979E6> {
    /* renamed from: a */
    public Object mo15813a(Object obj, Object obj2) {
        List list;
        Thread thread = (Thread) obj;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj2;
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        String name2 = threadGroup != null ? threadGroup.getName() : "";
        Integer valueOf = Integer.valueOf(thread.getState().ordinal());
        if (stackTraceElementArr == null) {
            list = null;
        } else {
            list = Arrays.asList(stackTraceElementArr);
        }
        return new C1979E6(name, priority, id, name2, valueOf, list);
    }
}
