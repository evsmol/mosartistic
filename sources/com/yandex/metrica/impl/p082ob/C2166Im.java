package com.yandex.metrica.impl.p082ob;

import android.os.Handler;
import android.os.Looper;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;

/* renamed from: com.yandex.metrica.impl.ob.Im */
public class C2166Im {

    /* renamed from: a */
    private final C2102Hm f5801a;

    /* renamed from: b */
    private volatile IHandlerExecutor f5802b;

    /* renamed from: c */
    private volatile ICommonExecutor f5803c;

    /* renamed from: d */
    private volatile ICommonExecutor f5804d;

    /* renamed from: e */
    private volatile Handler f5805e;

    public C2166Im() {
        this(new C2102Hm());
    }

    /* renamed from: a */
    public ICommonExecutor mo15960a() {
        if (this.f5803c == null) {
            synchronized (this) {
                if (this.f5803c == null) {
                    this.f5801a.getClass();
                    this.f5803c = new C2211Jm("YMM-APT");
                }
            }
        }
        return this.f5803c;
    }

    /* renamed from: b */
    public IHandlerExecutor mo15961b() {
        if (this.f5802b == null) {
            synchronized (this) {
                if (this.f5802b == null) {
                    this.f5801a.getClass();
                    this.f5802b = new C2211Jm("YMM-YM");
                }
            }
        }
        return this.f5802b;
    }

    /* renamed from: c */
    public Handler mo15962c() {
        if (this.f5805e == null) {
            synchronized (this) {
                if (this.f5805e == null) {
                    this.f5801a.getClass();
                    this.f5805e = new Handler(Looper.getMainLooper());
                }
            }
        }
        return this.f5805e;
    }

    /* renamed from: d */
    public ICommonExecutor mo15963d() {
        if (this.f5804d == null) {
            synchronized (this) {
                if (this.f5804d == null) {
                    this.f5801a.getClass();
                    this.f5804d = new C2211Jm("YMM-RS");
                }
            }
        }
        return this.f5804d;
    }

    C2166Im(C2102Hm hm) {
        this.f5801a = hm;
    }
}
