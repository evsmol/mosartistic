package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.core.api.JsonParser;
import com.yandex.metrica.modules.api.RemoteConfigExtensionConfiguration;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.hd */
public final class C3029hd implements Converter<Object, byte[]>, JsonParser<Object> {

    /* renamed from: a */
    private final /* synthetic */ JsonParser<? extends Object> f7972a;

    /* renamed from: b */
    private final /* synthetic */ Converter<Object, byte[]> f7973b;

    public C3029hd(RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.f7972a = remoteConfigExtensionConfiguration.getJsonParser();
        this.f7973b = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    /* renamed from: a */
    public Object parse(JSONObject jSONObject) {
        return this.f7972a.parse(jSONObject);
    }

    /* renamed from: a */
    public Object mo17663a(byte[] bArr) {
        return this.f7973b.toModel(bArr);
    }

    /* renamed from: a */
    public byte[] mo17664a(Object obj) {
        return (byte[]) this.f7973b.fromModel(obj);
    }

    public Object fromModel(Object obj) {
        return (byte[]) this.f7973b.fromModel(obj);
    }

    public Object parseOrNull(Object obj) {
        return this.f7972a.parseOrNull((JSONObject) obj);
    }

    public Object toModel(Object obj) {
        return this.f7973b.toModel((byte[]) obj);
    }
}
