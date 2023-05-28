package com.criteo.publisher.p070l0.p071d;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: com.criteo.publisher.l0.d.b */
/* compiled from: AutoValue_GdprData */
final class C1175b extends C1174a {
    C1175b(String str, Boolean bool, Integer num) {
        super(str, bool, num);
    }

    /* renamed from: com.criteo.publisher.l0.d.b$a */
    /* compiled from: AutoValue_GdprData */
    static final class C1176a extends TypeAdapter<C1177c> {

        /* renamed from: a */
        private volatile TypeAdapter<String> f3722a;

        /* renamed from: b */
        private volatile TypeAdapter<Boolean> f3723b;

        /* renamed from: c */
        private volatile TypeAdapter<Integer> f3724c;

        /* renamed from: d */
        private final Gson f3725d;

        C1176a(Gson gson) {
            this.f3725d = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, C1177c cVar) throws IOException {
            if (cVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("consentData");
            if (cVar.mo3287a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f3722a;
                if (typeAdapter == null) {
                    typeAdapter = this.f3725d.getAdapter(String.class);
                    this.f3722a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, cVar.mo3287a());
            }
            jsonWriter.name("gdprApplies");
            if (cVar.mo3288b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter2 = this.f3723b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f3725d.getAdapter(Boolean.class);
                    this.f3723b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, cVar.mo3288b());
            }
            jsonWriter.name("version");
            if (cVar.mo3289c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter3 = this.f3724c;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f3725d.getAdapter(Integer.class);
                    this.f3724c = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, cVar.mo3289c());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public C1177c read(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Boolean bool = null;
            Integer num = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if ("consentData".equals(nextName)) {
                        TypeAdapter<String> typeAdapter = this.f3722a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f3725d.getAdapter(String.class);
                            this.f3722a = typeAdapter;
                        }
                        str = typeAdapter.read(jsonReader);
                    } else if ("gdprApplies".equals(nextName)) {
                        TypeAdapter<Boolean> typeAdapter2 = this.f3723b;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f3725d.getAdapter(Boolean.class);
                            this.f3723b = typeAdapter2;
                        }
                        bool = typeAdapter2.read(jsonReader);
                    } else if ("version".equals(nextName)) {
                        TypeAdapter<Integer> typeAdapter3 = this.f3724c;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f3725d.getAdapter(Integer.class);
                            this.f3724c = typeAdapter3;
                        }
                        num = typeAdapter3.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C1175b(str, bool, num);
        }

        public String toString() {
            return "TypeAdapter(" + "GdprData" + ")";
        }
    }
}
