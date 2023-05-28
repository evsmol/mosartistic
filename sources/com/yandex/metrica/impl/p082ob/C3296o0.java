package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.o0 */
public class C3296o0 {

    /* renamed from: a */
    private boolean f8472a;

    /* renamed from: b */
    private DeferredDeeplinkListener f8473b;

    /* renamed from: c */
    private DeferredDeeplinkParametersListener f8474c;

    /* renamed from: d */
    private C3243n0 f8475d;

    /* renamed from: com.yandex.metrica.impl.ob.o0$a */
    enum C3297a {
        NOT_A_FIRST_LAUNCH,
        PARSE_ERROR,
        NO_REFERRER
    }

    public C3296o0(boolean z) {
        this.f8472a = z;
    }

    /* renamed from: a */
    public void mo17892a(C3243n0 n0Var) {
        this.f8475d = n0Var;
        m10194a();
    }

    /* renamed from: a */
    private void m10195a(C3297a aVar) {
        DeferredDeeplinkListener.Error error;
        C3243n0 n0Var = this.f8475d;
        String str = n0Var == null ? null : n0Var.f8410c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f8473b;
        if (deferredDeeplinkListener != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                error = DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH;
            } else if (ordinal == 1) {
                error = DeferredDeeplinkListener.Error.PARSE_ERROR;
            } else if (ordinal != 2) {
                error = DeferredDeeplinkListener.Error.UNKNOWN;
            } else {
                error = DeferredDeeplinkListener.Error.NO_REFERRER;
            }
            deferredDeeplinkListener.onError(error, str == null ? "" : str);
            this.f8473b = null;
        }
        m10196a(aVar, str);
    }

    /* renamed from: a */
    public void mo17891a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f8474c = deferredDeeplinkParametersListener;
        if (this.f8472a) {
            m10195a(C3297a.NOT_A_FIRST_LAUNCH);
        } else {
            m10194a();
        }
    }

    /* renamed from: a */
    public void mo17890a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f8473b = deferredDeeplinkListener;
        if (this.f8472a) {
            m10195a(C3297a.NOT_A_FIRST_LAUNCH);
        } else {
            m10194a();
        }
    }

    /* renamed from: a */
    private void m10194a() {
        C3243n0 n0Var = this.f8475d;
        if (n0Var != null) {
            String str = n0Var.f8409b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f8473b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f8473b = null;
                }
                if (!C1848A2.m6815b((Map) this.f8475d.f8408a)) {
                    Map<String, String> map = this.f8475d.f8408a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f8474c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f8474c = null;
                        return;
                    }
                    return;
                }
                m10196a(C3297a.PARSE_ERROR, this.f8475d.f8410c);
            } else if (n0Var.f8410c != null) {
                m10195a(C3297a.PARSE_ERROR);
            } else {
                m10195a(C3297a.NO_REFERRER);
            }
        }
    }

    /* renamed from: a */
    private void m10196a(C3297a aVar, String str) {
        DeferredDeeplinkParametersListener.Error error;
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f8474c;
        if (deferredDeeplinkParametersListener != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                error = DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH;
            } else if (ordinal == 1) {
                error = DeferredDeeplinkParametersListener.Error.PARSE_ERROR;
            } else if (ordinal != 2) {
                error = DeferredDeeplinkParametersListener.Error.UNKNOWN;
            } else {
                error = DeferredDeeplinkParametersListener.Error.NO_REFERRER;
            }
            if (str == null) {
                str = "";
            }
            deferredDeeplinkParametersListener.onError(error, str);
            this.f8474c = null;
        }
    }
}
