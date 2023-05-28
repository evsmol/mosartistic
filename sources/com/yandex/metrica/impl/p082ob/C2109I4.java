package com.yandex.metrica.impl.p082ob;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.I4 */
public class C2109I4 extends C2230K4<C2702X4> {

    /* renamed from: a */
    private final C1978E5 f5547a;

    /* renamed from: b */
    private final Map<C2788a1, C3644x5<C2702X4>> f5548b = m7355a();

    /* renamed from: c */
    private C3495t5<C2702X4> f5549c;

    public C2109I4(C2259L3 l3) {
        C1978E5 e5 = new C1978E5(l3);
        this.f5547a = e5;
        this.f5549c = new C3495t5(e5);
    }

    /* renamed from: a */
    private HashMap<C2788a1, C3644x5<C2702X4>> m7355a() {
        HashMap<C2788a1, C3644x5<C2702X4>> hashMap = new HashMap<>();
        hashMap.put(C2788a1.EVENT_TYPE_ACTIVATION, new C3469s5(this.f5547a));
        hashMap.put(C2788a1.EVENT_TYPE_START, new C2084H5(this.f5547a));
        hashMap.put(C2788a1.EVENT_TYPE_REGULAR, new C1882B5(this.f5547a));
        C3723z5 z5Var = new C3723z5(this.f5547a);
        hashMap.put(C2788a1.EVENT_TYPE_EXCEPTION_USER, z5Var);
        hashMap.put(C2788a1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, z5Var);
        hashMap.put(C2788a1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, z5Var);
        hashMap.put(C2788a1.EVENT_TYPE_SEND_REFERRER, z5Var);
        hashMap.put(C2788a1.EVENT_TYPE_STATBOX, z5Var);
        hashMap.put(C2788a1.EVENT_TYPE_CUSTOM_EVENT, z5Var);
        C2788a1 a1Var = C2788a1.EVENT_TYPE_SET_SESSION_EXTRA;
        C1978E5 e5 = this.f5547a;
        hashMap.put(a1Var, new C2051G5(e5, e5.mo15668u()));
        hashMap.put(C2788a1.EVENT_TYPE_APP_OPEN, new C1946D5(this.f5547a));
        hashMap.put(C2788a1.EVENT_TYPE_PURGE_BUFFER, new C1853A5(this.f5547a));
        C2788a1 a1Var2 = C2788a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        C1978E5 e52 = this.f5547a;
        hashMap.put(a1Var2, new C2051G5(e52, e52.mo15659l()));
        C2788a1 a1Var3 = C2788a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        C1978E5 e53 = this.f5547a;
        hashMap.put(a1Var3, new C2051G5(e53, e53.mo15659l()));
        hashMap.put(C2788a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, new C3606w5(this.f5547a));
        hashMap.put(C2788a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C3606w5(this.f5547a));
        hashMap.put(C2788a1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF, new C3569v5(this.f5547a));
        C2788a1 a1Var4 = C2788a1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        C1978E5 e54 = this.f5547a;
        hashMap.put(a1Var4, new C2051G5(e54, e54.mo15659l()));
        hashMap.put(C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C2178J5(this.f5547a));
        C2110I5 i5 = new C2110I5(this.f5547a);
        hashMap.put(C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED, i5);
        hashMap.put(C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, i5);
        hashMap.put(C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, i5);
        hashMap.put(C2788a1.EVENT_TYPE_ANR, z5Var);
        hashMap.put(C2788a1.EVENT_TYPE_IDENTITY, new C3684y5(this.f5547a));
        hashMap.put(C2788a1.EVENT_TYPE_SET_USER_INFO, new C2015F5(this.f5547a));
        C2788a1 a1Var5 = C2788a1.EVENT_TYPE_REPORT_USER_INFO;
        C1978E5 e55 = this.f5547a;
        hashMap.put(a1Var5, new C2051G5(e55, e55.mo15662o()));
        C2788a1 a1Var6 = C2788a1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C1978E5 e56 = this.f5547a;
        hashMap.put(a1Var6, new C2051G5(e56, e56.mo15651d()));
        C2788a1 a1Var7 = C2788a1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C1978E5 e57 = this.f5547a;
        hashMap.put(a1Var7, new C2051G5(e57, e57.mo15650c()));
        hashMap.put(C2788a1.EVENT_TYPE_SEND_USER_PROFILE, z5Var);
        C2788a1 a1Var8 = C2788a1.EVENT_TYPE_SET_USER_PROFILE_ID;
        C1978E5 e58 = this.f5547a;
        hashMap.put(a1Var8, new C2051G5(e58, e58.mo15671x()));
        hashMap.put(C2788a1.EVENT_TYPE_SEND_REVENUE_EVENT, z5Var);
        hashMap.put(C2788a1.EVENT_TYPE_SEND_AD_REVENUE_EVENT, z5Var);
        hashMap.put(C2788a1.EVENT_TYPE_IDENTITY_LIGHT, z5Var);
        hashMap.put(C2788a1.EVENT_TYPE_CLEANUP, z5Var);
        hashMap.put(C2788a1.EVENT_TYPE_VIEW_TREE, z5Var);
        hashMap.put(C2788a1.EVENT_TYPE_RAW_VIEW_TREE, z5Var);
        hashMap.put(C2788a1.EVENT_TYPE_SEND_ECOMMERCE_EVENT, z5Var);
        hashMap.put(C2788a1.EVENT_TYPE_STATBOX_EXP, z5Var);
        hashMap.put(C2788a1.EVENT_TYPE_WEBVIEW_SYNC, z5Var);
        return hashMap;
    }

    /* renamed from: b */
    public C1978E5 mo15885b() {
        return this.f5547a;
    }

    /* renamed from: a */
    public void mo15884a(C2788a1 a1Var, C3644x5<C2702X4> x5Var) {
        this.f5548b.put(a1Var, x5Var);
    }

    /* renamed from: a */
    public C2083H4<C2702X4> mo15815a(int i) {
        LinkedList linkedList = new LinkedList();
        C2788a1 a = C2788a1.m8989a(i);
        C3495t5<C2702X4> t5Var = this.f5549c;
        if (t5Var != null) {
            t5Var.mo18226a(a, linkedList);
        }
        C3644x5 x5Var = this.f5548b.get(a);
        if (x5Var != null) {
            x5Var.mo15439a(linkedList);
        }
        return new C2083H4<>(linkedList);
    }
}
