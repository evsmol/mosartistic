package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.p082ob.C2897dh;

/* renamed from: com.yandex.metrica.impl.ob.ah */
public class C2806ah {

    /* renamed from: a */
    private ProtobufStateStorage<C2926eh> f7396a;

    /* renamed from: b */
    private C2926eh f7397b;

    /* renamed from: c */
    private SystemTimeProvider f7398c;

    /* renamed from: d */
    private C3003gh f7399d;

    /* renamed from: e */
    private C2807a f7400e;

    /* renamed from: com.yandex.metrica.impl.ob.ah$a */
    interface C2807a {
    }

    public C2806ah(ProtobufStateStorage<C2926eh> protobufStateStorage, C2807a aVar) {
        this(protobufStateStorage, aVar, new SystemTimeProvider(), new C3003gh(protobufStateStorage));
    }

    /* renamed from: a */
    public void mo17193a(C2926eh ehVar) {
        this.f7396a.save(ehVar);
        this.f7397b = ehVar;
        this.f7399d.mo17639a();
        C2897dh.C2898a aVar = (C2897dh.C2898a) this.f7400e;
        C2897dh.this.mo17464b();
        boolean unused = C2897dh.this.f7661h = false;
    }

    C2806ah(ProtobufStateStorage<C2926eh> protobufStateStorage, C2807a aVar, SystemTimeProvider systemTimeProvider, C3003gh ghVar) {
        this.f7396a = protobufStateStorage;
        this.f7397b = (C2926eh) protobufStateStorage.read();
        this.f7398c = systemTimeProvider;
        this.f7399d = ghVar;
        this.f7400e = aVar;
    }

    /* renamed from: a */
    public void mo17192a() {
        C2926eh ehVar = this.f7397b;
        C2926eh ehVar2 = new C2926eh(ehVar.f7761a, ehVar.f7762b, this.f7398c.currentTimeMillis(), true, true);
        this.f7396a.save(ehVar2);
        this.f7397b = ehVar2;
        C2897dh.C2898a aVar = (C2897dh.C2898a) this.f7400e;
        C2897dh.this.mo17464b();
        boolean unused = C2897dh.this.f7661h = false;
    }
}
