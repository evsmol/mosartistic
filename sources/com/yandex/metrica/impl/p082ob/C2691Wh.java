package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.IParamsCallback;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: com.yandex.metrica.impl.ob.Wh */
public final class C2691Wh {

    /* renamed from: a */
    private C2720Xh f7090a = new C2720Xh();

    /* renamed from: a */
    public final synchronized C2720Xh mo17001a() {
        return this.f7090a;
    }

    /* renamed from: a */
    public final synchronized void mo17002a(C2720Xh xh) {
        this.f7090a = xh;
    }

    /* renamed from: a */
    public final C2673W0 mo17000a(String str) {
        Boolean b;
        String str2;
        C2720Xh xh = this.f7090a;
        if (str.hashCode() != 949037879 || !str.equals(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) || (b = xh.mo17057b()) == null) {
            return null;
        }
        boolean booleanValue = b.booleanValue();
        C2577U0 c = xh.mo17058c();
        String a = xh.mo17056a();
        if (booleanValue) {
            str2 = "true";
        } else if (!booleanValue) {
            str2 = "false";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return new C2673W0(str2, c, a);
    }

    /* renamed from: a */
    public final synchronized void mo17003a(List<String> list, Map<String, C2673W0> map) {
        Boolean b;
        String str;
        for (String str2 : list) {
            if (str2.hashCode() == 949037879) {
                if (str2.equals(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) && (b = this.f7090a.mo17057b()) != null) {
                    boolean booleanValue = b.booleanValue();
                    C2577U0 c = this.f7090a.mo17058c();
                    String a = this.f7090a.mo17056a();
                    if (booleanValue) {
                        str = "true";
                    } else if (!booleanValue) {
                        str = "false";
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    map.put(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED, new C2673W0(str, c, a));
                }
            }
        }
    }
}
