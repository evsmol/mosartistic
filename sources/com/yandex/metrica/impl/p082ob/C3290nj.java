package com.yandex.metrica.impl.p082ob;

import android.os.Handler;
import com.yandex.metrica.C10725i;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.nj */
public class C3290nj implements C2502S0 {

    /* renamed from: a */
    private final Handler f8468a;

    /* renamed from: b */
    private final ICommonExecutor f8469b;

    /* renamed from: c */
    private final ICommonExecutor f8470c;

    public C3290nj(ICommonExecutor iCommonExecutor, Handler handler, ICommonExecutor iCommonExecutor2, C2443Q q) {
        this.f8469b = iCommonExecutor;
        this.f8468a = handler;
        this.f8470c = iCommonExecutor2;
    }

    /* renamed from: a */
    public C3520u mo16440a() {
        return new C3520u(this.f8470c);
    }

    /* renamed from: a */
    public void mo16441a(C10725i iVar, C2361O0 o0) {
    }

    /* renamed from: a */
    public void mo16442a(Map<String, Object> map) {
    }

    /* renamed from: b */
    public ICommonExecutor mo16443b() {
        return this.f8469b;
    }

    /* renamed from: c */
    public Handler mo16444c() {
        return this.f8468a;
    }

    /* renamed from: d */
    public C1984Eb mo16445d() {
        return new C3695yb();
    }
}
