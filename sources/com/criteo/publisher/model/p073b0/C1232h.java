package com.criteo.publisher.model.p073b0;

import com.criteo.publisher.model.p073b0.C1243n;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

/* renamed from: com.criteo.publisher.model.b0.h */
/* compiled from: AutoValue_NativeAssets */
final class C1232h extends C1224b {
    C1232h(List<C1248r> list, C1242m mVar, C1247q qVar, List<C1246p> list2) {
        super(list, mVar, qVar, list2);
    }

    /* renamed from: com.criteo.publisher.model.b0.h$a */
    /* compiled from: AutoValue_NativeAssets */
    static final class C1233a extends TypeAdapter<C1243n> {

        /* renamed from: a */
        private volatile TypeAdapter<List<C1248r>> f3865a;

        /* renamed from: b */
        private volatile TypeAdapter<C1242m> f3866b;

        /* renamed from: c */
        private volatile TypeAdapter<C1247q> f3867c;

        /* renamed from: d */
        private volatile TypeAdapter<List<C1246p>> f3868d;

        /* renamed from: e */
        private final Gson f3869e;

        C1233a(Gson gson) {
            this.f3869e = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, C1243n nVar) throws IOException {
            if (nVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("products");
            if (nVar.mo3430h() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<C1248r>> typeAdapter = this.f3865a;
                if (typeAdapter == null) {
                    typeAdapter = this.f3869e.getAdapter(TypeToken.getParameterized(List.class, C1248r.class));
                    this.f3865a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, nVar.mo3430h());
            }
            jsonWriter.name("advertiser");
            if (nVar.mo3428b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<C1242m> typeAdapter2 = this.f3866b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f3869e.getAdapter(C1242m.class);
                    this.f3866b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, nVar.mo3428b());
            }
            jsonWriter.name("privacy");
            if (nVar.mo3433j() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<C1247q> typeAdapter3 = this.f3867c;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f3869e.getAdapter(C1247q.class);
                    this.f3867c = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, nVar.mo3433j());
            }
            jsonWriter.name("impressionPixels");
            if (nVar.mo3432i() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<C1246p>> typeAdapter4 = this.f3868d;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f3869e.getAdapter(TypeToken.getParameterized(List.class, C1246p.class));
                    this.f3868d = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, nVar.mo3432i());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public C1243n read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            C1243n.C1244a a = C1243n.m5524a();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    char c = 65535;
                    int hashCode = nextName.hashCode();
                    if (hashCode != -1684631018) {
                        if (hashCode == -1003761308 && nextName.equals("products")) {
                            c = 0;
                        }
                    } else if (nextName.equals("impressionPixels")) {
                        c = 1;
                    }
                    if (c == 0) {
                        TypeAdapter<List<C1248r>> typeAdapter = this.f3865a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f3869e.getAdapter(TypeToken.getParameterized(List.class, C1248r.class));
                            this.f3865a = typeAdapter;
                        }
                        a.mo3437a(typeAdapter.read(jsonReader));
                    } else if (c == 1) {
                        TypeAdapter<List<C1246p>> typeAdapter2 = this.f3868d;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f3869e.getAdapter(TypeToken.getParameterized(List.class, C1246p.class));
                            this.f3868d = typeAdapter2;
                        }
                        a.mo3439b(typeAdapter2.read(jsonReader));
                    } else if ("advertiser".equals(nextName)) {
                        TypeAdapter<C1242m> typeAdapter3 = this.f3866b;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f3869e.getAdapter(C1242m.class);
                            this.f3866b = typeAdapter3;
                        }
                        a.mo3435a(typeAdapter3.read(jsonReader));
                    } else if ("privacy".equals(nextName)) {
                        TypeAdapter<C1247q> typeAdapter4 = this.f3867c;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f3869e.getAdapter(C1247q.class);
                            this.f3867c = typeAdapter4;
                        }
                        a.mo3436a(typeAdapter4.read(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return a.mo3492b();
        }

        public String toString() {
            return "TypeAdapter(" + "NativeAssets" + ")";
        }
    }
}
