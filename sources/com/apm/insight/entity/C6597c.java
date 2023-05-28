package com.apm.insight.entity;

import com.apm.insight.C6617h;
import com.apm.insight.p178l.C6662a;

/* renamed from: com.apm.insight.entity.c */
public class C6597c extends C6594a {

    /* renamed from: c */
    private String f14153c;

    public C6597c(String str) {
        this.f14153c = str;
    }

    /* renamed from: a */
    public static C6597c m16211a(StackTraceElement stackTraceElement, String str, String str2, String str3, boolean z, String str4, String str5) {
        C6597c cVar = new C6597c(str5);
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        cVar.mo52052a("event_type", (Object) "exception");
        cVar.mo52052a("log_type", (Object) str5);
        cVar.mo52052a("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
        cVar.mo52052a("crash_time", (Object) Long.valueOf(System.currentTimeMillis()));
        cVar.mo52052a("class_ref", (Object) className);
        cVar.mo52052a("method", (Object) methodName);
        cVar.mo52052a("line_num", (Object) Integer.valueOf(lineNumber));
        cVar.mo52052a("stack", (Object) str);
        cVar.mo52052a("exception_type", (Object) 1);
        cVar.mo52052a("ensure_type", (Object) str4);
        cVar.mo52052a("is_core", (Object) Integer.valueOf(z ? 1 : 0));
        cVar.mo52052a("message", (Object) str2);
        cVar.mo52052a("process_name", (Object) C6662a.m16480c(C6617h.m16313g()));
        cVar.mo52052a("crash_thread_name", (Object) str3);
        C6598d.m16214b(cVar.mo52066h());
        return cVar;
    }
}
