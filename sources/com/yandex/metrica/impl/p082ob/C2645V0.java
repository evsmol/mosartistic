package com.yandex.metrica.impl.p082ob;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* renamed from: com.yandex.metrica.impl.ob.V0 */
public class C2645V0 implements Parcelable {
    public static final Parcelable.Creator<C2645V0> CREATOR = new C2647b();

    /* renamed from: a */
    private ResultReceiver f7020a;

    /* renamed from: b */
    private List<String> f7021b;

    /* renamed from: c */
    private Map<String, String> f7022c;

    /* renamed from: com.yandex.metrica.impl.ob.V0$a */
    class C2646a implements Function0<C2104I> {
        C2646a(C2645V0 v0) {
        }

        public Object invoke() {
            return C2007F0.m7154g().mo15742d();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.V0$b */
    class C2647b implements Parcelable.Creator<C2645V0> {
        C2647b() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C2645V0(parcel);
        }

        public Object[] newArray(int i) {
            return new C2645V0[i];
        }
    }

    public C2645V0(List<String> list, Map<String, String> map, ResultReceiver resultReceiver) {
        HashMap hashMap;
        this.f7021b = list;
        this.f7020a = resultReceiver;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        this.f7022c = hashMap;
    }

    /* renamed from: a */
    public boolean mo16936a(C3356pi piVar) {
        return C3289ni.m10180a(piVar, this.f7021b, this.f7022c, new C2646a(this));
    }

    /* renamed from: b */
    public List<String> mo16937b() {
        return this.f7021b;
    }

    /* renamed from: c */
    public ResultReceiver mo16938c() {
        return this.f7020a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.CounterConfiguration.receiver", this.f7020a);
        if (this.f7021b != null) {
            bundle.putStringArrayList("com.yandex.metrica.CounterConfiguration.identifiersList", new ArrayList(this.f7021b));
        }
        Map<String, String> map = this.f7022c;
        if (map != null) {
            bundle.putString("com.yandex.metrica.CounterConfiguration.clidsForVerification", C2572Tl.m8538c(map));
        }
        parcel.writeBundle(bundle);
    }

    /* renamed from: a */
    public Map<String, String> mo16935a() {
        return this.f7022c;
    }

    protected C2645V0(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(C2936f0.class.getClassLoader());
        if (readBundle != null) {
            this.f7020a = (ResultReceiver) readBundle.getParcelable("com.yandex.metrica.CounterConfiguration.receiver");
            this.f7021b = readBundle.getStringArrayList("com.yandex.metrica.CounterConfiguration.identifiersList");
            this.f7022c = C2572Tl.m8518a(readBundle.getString("com.yandex.metrica.CounterConfiguration.clidsForVerification"));
            return;
        }
        this.f7022c = new HashMap();
    }
}
