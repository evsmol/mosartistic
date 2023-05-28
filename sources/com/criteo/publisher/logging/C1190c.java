package com.criteo.publisher.logging;

import android.util.Log;
import com.criteo.publisher.p074n0.C1300g;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.logging.c */
/* compiled from: ConsoleHandler.kt */
public class C1190c implements C1192d {

    /* renamed from: a */
    private int f3744a = -1;

    /* renamed from: b */
    private final C1300g f3745b;

    static {
        new C1191a((DefaultConstructorMarker) null);
    }

    public C1190c(C1300g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "buildConfigWrapper");
        this.f3745b = gVar;
    }

    /* renamed from: com.criteo.publisher.logging.c$a */
    /* compiled from: ConsoleHandler.kt */
    public static final class C1191a {
        private C1191a() {
        }

        public /* synthetic */ C1191a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public void mo3329b(int i) {
        this.f3744a = i;
    }

    /* renamed from: a */
    public int mo3325a() {
        Integer valueOf = Integer.valueOf(this.f3744a);
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : this.f3745b.mo3635g();
    }

    /* renamed from: a */
    public void mo3328a(String str, C1193e eVar) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(eVar, "logMessage");
        int a = eVar.mo3330a();
        if (m5390a(a)) {
            String[] strArr = new String[2];
            boolean z = false;
            strArr[0] = eVar.mo3332c();
            Throwable d = eVar.mo3333d();
            strArr[1] = d != null ? m5391b(d) : null;
            String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((T[]) strArr), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
            if (joinToString$default.length() > 0) {
                z = true;
            }
            if (z) {
                mo3327a(a, str, joinToString$default);
            }
        }
    }

    /* renamed from: a */
    public void mo3327a(int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        Log.println(i, C1194f.m5402a(str), str2);
    }

    /* renamed from: b */
    private String m5391b(Throwable th) {
        return mo3326a(th);
    }

    /* renamed from: a */
    public String mo3326a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        return Log.getStackTraceString(th);
    }

    /* renamed from: a */
    private boolean m5390a(int i) {
        return i >= mo3325a();
    }
}
