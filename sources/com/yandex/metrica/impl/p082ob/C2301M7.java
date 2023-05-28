package com.yandex.metrica.impl.p082ob;

import android.util.SparseArray;
import com.yandex.metrica.impl.p082ob.C2707X7;
import com.yandex.metrica.impl.p082ob.C3084j8;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.M7 */
public class C2301M7 {

    /* renamed from: a */
    private final C2333N7 f6154a;

    /* renamed from: b */
    private final C2420P7 f6155b;

    /* renamed from: c */
    private final C2707X7.C2709b f6156c;

    public C2301M7(C2333N7 n7, C2420P7 p7, C2707X7.C2709b bVar) {
        this.f6154a = n7;
        this.f6155b = p7;
        this.f6156c = bVar;
    }

    /* renamed from: a */
    public C2707X7 mo16265a() {
        HashMap hashMap = new HashMap();
        hashMap.put("binary_data", C3084j8.C3088b.f8126a);
        return this.f6156c.mo17031a("auto_inapp", this.f6154a.mo16341a(), this.f6154a.mo16342b(), new SparseArray(), new C2763Z7("auto_inapp", hashMap));
    }

    /* renamed from: b */
    public C2707X7 mo16266b() {
        HashMap hashMap = new HashMap();
        hashMap.put("preferences", C3084j8.C3089c.f8127a);
        return this.f6156c.mo17031a("client storage", this.f6154a.mo16343c(), this.f6154a.mo16344d(), new SparseArray(), new C2763Z7("metrica.db", hashMap));
    }

    /* renamed from: c */
    public C2707X7 mo16267c() {
        return this.f6156c.mo17031a("main", this.f6154a.mo16345e(), this.f6154a.mo16346f(), this.f6154a.mo16352l(), new C2763Z7("main", this.f6155b.mo16447a()));
    }

    /* renamed from: d */
    public C2707X7 mo16268d() {
        HashMap hashMap = new HashMap();
        hashMap.put("preferences", C3084j8.C3089c.f8127a);
        return this.f6156c.mo17031a("metrica_multiprocess.db", this.f6154a.mo16347g(), this.f6154a.mo16348h(), new SparseArray(), new C2763Z7("metrica_multiprocess.db", hashMap));
    }

    /* renamed from: e */
    public C2707X7 mo16269e() {
        HashMap hashMap = new HashMap();
        List<String> list = C3084j8.C3089c.f8127a;
        hashMap.put("preferences", list);
        hashMap.put("binary_data", C3084j8.C3088b.f8126a);
        hashMap.put("startup", list);
        List<String> list2 = C3084j8.C3085a.f8121a;
        hashMap.put("l_dat", list2);
        hashMap.put("lbs_dat", list2);
        return this.f6156c.mo17031a("metrica.db", this.f6154a.mo16349i(), this.f6154a.mo16350j(), this.f6154a.mo16351k(), new C2763Z7("metrica.db", hashMap));
    }
}
