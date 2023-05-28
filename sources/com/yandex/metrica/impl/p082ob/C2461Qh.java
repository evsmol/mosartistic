package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.yandex.metrica.impl.ob.Qh */
public class C2461Qh implements C2746Yh {

    /* renamed from: b */
    private static final IIdentifierCallback f6533b = new C2462a();

    /* renamed from: a */
    private final AtomicReference<IIdentifierCallback> f6534a;

    /* renamed from: com.yandex.metrica.impl.ob.Qh$a */
    class C2462a implements IIdentifierCallback {
        C2462a() {
        }

        public void onReceive(Map<String, String> map) {
        }

        public void onRequestError(IIdentifierCallback.Reason reason) {
        }
    }

    public C2461Qh(IIdentifierCallback iIdentifierCallback) {
        this.f6534a = new AtomicReference<>(iIdentifierCallback);
    }

    /* renamed from: a */
    public void mo16523a(IParamsCallback.Reason reason, Map<String, C2673W0> map) {
        IIdentifierCallback.Reason reason2;
        IIdentifierCallback andSet = this.f6534a.getAndSet(f6533b);
        int ordinal = reason.ordinal();
        if (ordinal == 1) {
            reason2 = IIdentifierCallback.Reason.NETWORK;
        } else if (ordinal != 2) {
            reason2 = IIdentifierCallback.Reason.UNKNOWN;
        } else {
            reason2 = IIdentifierCallback.Reason.INVALID_RESPONSE;
        }
        andSet.onRequestError(reason2);
    }

    public void onReceive(Map<String, C2673W0> map) {
        IIdentifierCallback andSet = this.f6534a.getAndSet(f6533b);
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            hashMap.put(next.getKey(), ((C2673W0) next.getValue()).f7065a);
        }
        andSet.onReceive(hashMap);
    }
}
