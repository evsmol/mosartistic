package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.StateSerializer;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.q9 */
public class C3391q9<T> implements StateSerializer<T> {

    /* renamed from: a */
    private final StateSerializer<T> f8720a;

    /* renamed from: b */
    private final C3636wm f8721b;

    public C3391q9(StateSerializer<T> stateSerializer, C3636wm wmVar) {
        this.f8720a = stateSerializer;
        this.f8721b = wmVar;
    }

    public T defaultValue() {
        return this.f8720a.defaultValue();
    }

    public byte[] toByteArray(T t) {
        try {
            return this.f8721b.mo18384a(this.f8720a.toByteArray(t));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    public T toState(byte[] bArr) throws IOException {
        try {
            C3636wm wmVar = this.f8721b;
            wmVar.getClass();
            return this.f8720a.toState(wmVar.mo18385a(bArr, 0, bArr.length));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
