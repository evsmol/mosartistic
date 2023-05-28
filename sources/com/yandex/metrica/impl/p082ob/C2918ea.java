package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufStateSerializer;
import com.yandex.metrica.impl.p082ob.C1924Cf;

/* renamed from: com.yandex.metrica.impl.ob.ea */
public class C2918ea {

    /* renamed from: a */
    private C3596vm f7737a;

    C2918ea(C3596vm vmVar) {
        this.f7737a = vmVar;
    }

    /* renamed from: a */
    public ProtobufStateSerializer<C3620wf> mo17535a() {
        return new C3092j9(new C2989g9(), new C3636wm("AES/CBC/PKCS5Padding", this.f7737a.mo18344b(), this.f7737a.mo18343a()));
    }

    /* renamed from: b */
    public ProtobufStateSerializer<C3664xf> mo17536b() {
        return new C3092j9(new C2756Z2(), new C3636wm("AES/CBC/PKCS5Padding", this.f7737a.mo18344b(), this.f7737a.mo18343a()));
    }

    /* renamed from: c */
    public ProtobufStateSerializer<C3699yf> mo17537c() {
        return new C3092j9(new C3054i9(), new C3636wm("AES/CBC/PKCS5Padding", this.f7737a.mo18344b(), this.f7737a.mo18343a()));
    }

    /* renamed from: d */
    public ProtobufStateSerializer<C1894Bf> mo17538d() {
        return new C3092j9(new C3121k9(), new C3636wm("AES/CBC/PKCS5Padding", this.f7737a.mo18344b(), this.f7737a.mo18343a()));
    }

    /* renamed from: e */
    public ProtobufStateSerializer<C1924Cf> mo17539e() {
        return new C3092j9(new C2769Zd(), new C3636wm("AES/CBC/PKCS5Padding", this.f7737a.mo18344b(), this.f7737a.mo18343a()));
    }

    @Deprecated
    /* renamed from: f */
    public ProtobufStateSerializer<C1924Cf.C1925a> mo17540f() {
        return new C3092j9(new C3030he(), new C3636wm("AES/CBC/PKCS5Padding", this.f7737a.mo18344b(), this.f7737a.mo18343a()));
    }

    /* renamed from: g */
    public ProtobufStateSerializer<C1956Df> mo17541g() {
        return new C3092j9(new C3205m9(), new C3636wm("AES/CBC/PKCS5Padding", this.f7737a.mo18344b(), this.f7737a.mo18343a()));
    }

    /* renamed from: h */
    public ProtobufStateSerializer<C2025Ff> mo17542h() {
        return new C3092j9(new C3313o9(), new C3636wm("AES/CBC/PKCS5Padding", this.f7737a.mo18344b(), this.f7737a.mo18343a()));
    }

    /* renamed from: i */
    public ProtobufStateSerializer<C2121If> mo17543i() {
        return new C3092j9(new C3345p9(), new C3636wm("AES/CBC/PKCS5Padding", this.f7737a.mo18344b(), this.f7737a.mo18343a()));
    }
}
