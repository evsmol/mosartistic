package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.identifiers.impl.e */
public final class C1820e {

    /* renamed from: a */
    private final C1819d f4988a;

    /* renamed from: b */
    private final Function1 f4989b;

    /* renamed from: c */
    private final String f4990c;

    /* renamed from: d */
    private final C1838w f4991d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1820e(android.content.Intent r8, kotlin.jvm.functions.Function1 r9, java.lang.String r10) {
        /*
            r7 = this;
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "converter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "serviceShortTag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            com.yandex.metrica.identifiers.impl.d r2 = new com.yandex.metrica.identifiers.impl.d
            r2.<init>(r8, r10)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "[AdInServiceConnectionController-"
            r8.append(r0)
            r8.append(r10)
            r0 = 93
            r8.append(r0)
            java.lang.String r4 = r8.toString()
            com.yandex.metrica.identifiers.impl.w r6 = new com.yandex.metrica.identifiers.impl.w
            r6.<init>()
            r1 = r7
            r3 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.identifiers.impl.C1820e.<init>(android.content.Intent, kotlin.jvm.functions.Function1, java.lang.String):void");
    }

    public C1820e(C1819d dVar, Function1 function1, String str, String str2, C1838w wVar) {
        Intrinsics.checkNotNullParameter(dVar, "connection");
        Intrinsics.checkNotNullParameter(function1, "converter");
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(str2, "serviceShortTag");
        Intrinsics.checkNotNullParameter(wVar, "safePackageManager");
        this.f4988a = dVar;
        this.f4989b = function1;
        this.f4990c = str2;
        this.f4991d = wVar;
    }

    /* renamed from: a */
    public final Object mo15389a(Context context) {
        ResolveInfo resolveInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intent a = this.f4988a.mo15381a();
        Intrinsics.checkNotNullExpressionValue(a, "connection.intent");
        this.f4991d.getClass();
        IBinder iBinder = null;
        try {
            resolveInfo = context.getPackageManager().resolveService(a, 0);
        } catch (Throwable unused) {
            resolveInfo = null;
        }
        if (resolveInfo != null) {
            try {
                if (this.f4988a.mo15383a(context)) {
                    iBinder = this.f4988a.mo15382a(3000);
                }
            } catch (Throwable unused2) {
            }
            if (iBinder != null) {
                return this.f4989b.invoke(iBinder);
            }
            throw new C1825j("could not bind to " + this.f4990c + " services");
        }
        throw new C1828m("could not resolve " + this.f4990c + " services");
    }

    /* renamed from: b */
    public final void mo15390b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            this.f4988a.mo15384b(context);
        } catch (IllegalArgumentException unused) {
        }
    }
}
