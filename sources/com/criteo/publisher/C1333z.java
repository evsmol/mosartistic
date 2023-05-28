package com.criteo.publisher;

import com.criteo.publisher.p061c0.C1061d;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.criteo.publisher.z */
/* compiled from: Session.kt */
public class C1333z {

    /* renamed from: a */
    private final long f4054a;

    /* renamed from: b */
    private final Lazy f4055b = LazyKt.lazy(new C1335b(this));

    /* renamed from: c */
    private final C1146i f4056c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1061d f4057d;

    static {
        new C1334a((DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public String mo3735b() {
        return (String) this.f4055b.getValue();
    }

    public C1333z(C1146i iVar, C1061d dVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "clock");
        Intrinsics.checkParameterIsNotNull(dVar, "uniqueIdGenerator");
        this.f4056c = iVar;
        this.f4057d = dVar;
        this.f4054a = iVar.mo3242a();
    }

    /* renamed from: com.criteo.publisher.z$a */
    /* compiled from: Session.kt */
    public static final class C1334a {
        private C1334a() {
        }

        public /* synthetic */ C1334a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.criteo.publisher.z$b */
    /* compiled from: Session.kt */
    static final class C1335b extends Lambda implements Function0<String> {

        /* renamed from: a */
        final /* synthetic */ C1333z f4058a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1335b(C1333z zVar) {
            super(0);
            this.f4058a = zVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return this.f4058a.f4057d.mo3078a();
        }
    }

    /* renamed from: a */
    public int mo3734a() {
        return (int) ((this.f4056c.mo3242a() - this.f4054a) / ((long) 1000));
    }
}
