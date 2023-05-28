package com.appodeal.ads.storage;

import android.content.SharedPreferences;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.storage.p */
public final class C9563p extends Lambda implements Function0<SharedPreferences> {

    /* renamed from: a */
    public final /* synthetic */ ContextProvider f24253a;

    /* renamed from: b */
    public final /* synthetic */ String f24254b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9563p(C9148b bVar, String str) {
        super(0);
        this.f24253a = bVar;
        this.f24254b = str;
    }

    public final Object invoke() {
        return this.f24253a.getApplicationContext().getSharedPreferences(this.f24254b, 0);
    }
}
