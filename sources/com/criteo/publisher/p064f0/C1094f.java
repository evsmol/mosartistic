package com.criteo.publisher.p064f0;

import com.criteo.publisher.p064f0.C1121t;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

/* renamed from: com.criteo.publisher.f0.f */
/* compiled from: AutoValue_MetricRequest */
final class C1094f extends C1085b {
    C1094f(List<C1121t.C1122a> list, String str, int i) {
        super(list, str, i);
    }

    /* renamed from: com.criteo.publisher.f0.f$a */
    /* compiled from: AutoValue_MetricRequest */
    static final class C1095a extends TypeAdapter<C1121t> {

        /* renamed from: a */
        private volatile TypeAdapter<List<C1121t.C1122a>> f3555a;

        /* renamed from: b */
        private volatile TypeAdapter<String> f3556b;

        /* renamed from: c */
        private volatile TypeAdapter<Integer> f3557c;

        /* renamed from: d */
        private final Gson f3558d;

        C1095a(Gson gson) {
            this.f3558d = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, C1121t tVar) throws IOException {
            if (tVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("feedbacks");
            if (tVar.mo3160a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<C1121t.C1122a>> typeAdapter = this.f3555a;
                if (typeAdapter == null) {
                    typeAdapter = this.f3558d.getAdapter(TypeToken.getParameterized(List.class, C1121t.C1122a.class));
                    this.f3555a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, tVar.mo3160a());
            }
            jsonWriter.name("wrapper_version");
            if (tVar.mo3162c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f3556b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f3558d.getAdapter(String.class);
                    this.f3556b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, tVar.mo3162c());
            }
            jsonWriter.name("profile_id");
            TypeAdapter<Integer> typeAdapter3 = this.f3557c;
            if (typeAdapter3 == null) {
                typeAdapter3 = this.f3558d.getAdapter(Integer.class);
                this.f3557c = typeAdapter3;
            }
            typeAdapter3.write(jsonWriter, Integer.valueOf(tVar.mo3161b()));
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public C1121t read(JsonReader jsonReader) throws IOException {
            List list = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            int i = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    char c = 65535;
                    int hashCode = nextName.hashCode();
                    if (hashCode != -1102636175) {
                        if (hashCode == 1143342380 && nextName.equals("wrapper_version")) {
                            c = 0;
                        }
                    } else if (nextName.equals("profile_id")) {
                        c = 1;
                    }
                    if (c == 0) {
                        TypeAdapter<String> typeAdapter = this.f3556b;
                        if (typeAdapter == null) {
                            typeAdapter = this.f3558d.getAdapter(String.class);
                            this.f3556b = typeAdapter;
                        }
                        str = typeAdapter.read(jsonReader);
                    } else if (c == 1) {
                        TypeAdapter<Integer> typeAdapter2 = this.f3557c;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f3558d.getAdapter(Integer.class);
                            this.f3557c = typeAdapter2;
                        }
                        i = typeAdapter2.read(jsonReader).intValue();
                    } else if ("feedbacks".equals(nextName)) {
                        TypeAdapter<List<C1121t.C1122a>> typeAdapter3 = this.f3555a;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f3558d.getAdapter(TypeToken.getParameterized(List.class, C1121t.C1122a.class));
                            this.f3555a = typeAdapter3;
                        }
                        list = typeAdapter3.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C1094f(list, str, i);
        }

        public String toString() {
            return "TypeAdapter(" + "MetricRequest" + ")";
        }
    }
}
