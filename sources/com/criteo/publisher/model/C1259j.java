package com.criteo.publisher.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.criteo.publisher.model.j */
/* compiled from: AutoValue_Publisher */
final class C1259j extends C1249c {
    C1259j(String str, String str2, Map<String, Object> map) {
        super(str, str2, map);
    }

    /* renamed from: com.criteo.publisher.model.j$a */
    /* compiled from: AutoValue_Publisher */
    static final class C1260a extends TypeAdapter<C1281v> {

        /* renamed from: a */
        private volatile TypeAdapter<String> f3925a;

        /* renamed from: b */
        private volatile TypeAdapter<Map<String, Object>> f3926b;

        /* renamed from: c */
        private final Gson f3927c;

        C1260a(Gson gson) {
            this.f3927c = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, C1281v vVar) throws IOException {
            if (vVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("bundleId");
            if (vVar.mo3494a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f3925a;
                if (typeAdapter == null) {
                    typeAdapter = this.f3927c.getAdapter(String.class);
                    this.f3925a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, vVar.mo3494a());
            }
            jsonWriter.name("cpId");
            if (vVar.mo3495b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f3925a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f3927c.getAdapter(String.class);
                    this.f3925a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, vVar.mo3495b());
            }
            jsonWriter.name("ext");
            if (vVar.mo3496c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Map<String, Object>> typeAdapter3 = this.f3926b;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f3927c.getAdapter(TypeToken.getParameterized(Map.class, String.class, Object.class));
                    this.f3926b = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, vVar.mo3496c());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public C1281v read(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str2 = null;
            Map map = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    char c = 65535;
                    if (nextName.hashCode() == 3059304 && nextName.equals("cpId")) {
                        c = 0;
                    }
                    if (c == 0) {
                        TypeAdapter<String> typeAdapter = this.f3925a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f3927c.getAdapter(String.class);
                            this.f3925a = typeAdapter;
                        }
                        str2 = typeAdapter.read(jsonReader);
                    } else if ("bundleId".equals(nextName)) {
                        TypeAdapter<String> typeAdapter2 = this.f3925a;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f3927c.getAdapter(String.class);
                            this.f3925a = typeAdapter2;
                        }
                        str = typeAdapter2.read(jsonReader);
                    } else if ("ext".equals(nextName)) {
                        TypeAdapter<Map<String, Object>> typeAdapter3 = this.f3926b;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f3927c.getAdapter(TypeToken.getParameterized(Map.class, String.class, Object.class));
                            this.f3926b = typeAdapter3;
                        }
                        map = typeAdapter3.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C1259j(str, str2, map);
        }

        public String toString() {
            return "TypeAdapter(" + "Publisher" + ")";
        }
    }
}
