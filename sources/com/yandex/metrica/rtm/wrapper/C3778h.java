package com.yandex.metrica.rtm.wrapper;

import android.content.Context;
import com.yandex.metrica.rtm.client.ExceptionProcessor;

/* renamed from: com.yandex.metrica.rtm.wrapper.h */
public class C3778h implements C3775e {

    /* renamed from: a */
    private final ExceptionProcessor f9749a;

    public C3778h(C3779i iVar, Context context) throws Throwable {
        this(new ExceptionProcessor(context, new C3771a(iVar)));
    }

    public void reportException(String str, Throwable th) {
        try {
            this.f9749a.onException(str, th);
        } catch (Throwable unused) {
        }
    }

    C3778h(ExceptionProcessor exceptionProcessor) throws Throwable {
        this.f9749a = exceptionProcessor;
    }
}
