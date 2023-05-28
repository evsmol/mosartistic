package com.criteo.publisher.p070l0;

import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.l0.a */
/* compiled from: ConsentData.kt */
public class C1170a {

    /* renamed from: a */
    private final SharedPreferences f3711a;

    static {
        new C1171a((DefaultConstructorMarker) null);
    }

    /* renamed from: com.criteo.publisher.l0.a$a */
    /* compiled from: ConsentData.kt */
    public static final class C1171a {
        private C1171a() {
        }

        public /* synthetic */ C1171a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1170a(SharedPreferences sharedPreferences) {
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "sharedPreferences");
        this.f3711a = sharedPreferences;
    }

    /* renamed from: a */
    public SharedPreferences mo3275a() {
        return this.f3711a;
    }

    /* renamed from: b */
    public boolean mo3277b() {
        return mo3275a().getBoolean("CRTO_ConsentGiven", false);
    }

    /* renamed from: a */
    public void mo3276a(boolean z) {
        SharedPreferences.Editor edit = mo3275a().edit();
        edit.putBoolean("CRTO_ConsentGiven", z);
        edit.apply();
    }
}
