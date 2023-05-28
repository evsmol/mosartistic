package com.appodeal.consent.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.appodeal.consent.view.c */
public final class C9789c extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9784b f24830a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9789c(C9784b bVar) {
        super(0);
        this.f24830a = bVar;
    }

    public final Object invoke() {
        C9784b bVar = this.f24830a;
        C9784b.m28620a(bVar, bVar.getCloseJs());
        if (!this.f24830a.f24825g.getAndSet(true)) {
            this.f24830a.f24819a.mo61332a((JSONObject) null);
        }
        return Unit.INSTANCE;
    }
}
