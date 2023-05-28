package com.criteo.publisher.model;

import com.criteo.publisher.p070l0.p071d.C1177c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

/* renamed from: com.criteo.publisher.model.h */
/* compiled from: AutoValue_CdbRequest */
final class C1255h extends C1220a {
    C1255h(String str, C1281v vVar, C1285z zVar, String str2, int i, C1177c cVar, List<C1270q> list) {
        super(str, vVar, zVar, str2, i, cVar, list);
    }

    /* renamed from: com.criteo.publisher.model.h$a */
    /* compiled from: AutoValue_CdbRequest */
    static final class C1256a extends TypeAdapter<C1268o> {

        /* renamed from: a */
        private volatile TypeAdapter<String> f3914a;

        /* renamed from: b */
        private volatile TypeAdapter<C1281v> f3915b;

        /* renamed from: c */
        private volatile TypeAdapter<C1285z> f3916c;

        /* renamed from: d */
        private volatile TypeAdapter<Integer> f3917d;

        /* renamed from: e */
        private volatile TypeAdapter<C1177c> f3918e;

        /* renamed from: f */
        private volatile TypeAdapter<List<C1270q>> f3919f;

        /* renamed from: g */
        private final Gson f3920g;

        C1256a(Gson gson) {
            this.f3920g = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, C1268o oVar) throws IOException {
            if (oVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("id");
            if (oVar.mo3394b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f3914a;
                if (typeAdapter == null) {
                    typeAdapter = this.f3920g.getAdapter(String.class);
                    this.f3914a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, oVar.mo3394b());
            }
            jsonWriter.name("publisher");
            if (oVar.mo3396d() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<C1281v> typeAdapter2 = this.f3915b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f3920g.getAdapter(C1281v.class);
                    this.f3915b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, oVar.mo3396d());
            }
            jsonWriter.name("user");
            if (oVar.mo3400g() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<C1285z> typeAdapter3 = this.f3916c;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f3920g.getAdapter(C1285z.class);
                    this.f3916c = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, oVar.mo3400g());
            }
            jsonWriter.name("sdkVersion");
            if (oVar.mo3397e() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter4 = this.f3914a;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f3920g.getAdapter(String.class);
                    this.f3914a = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, oVar.mo3397e());
            }
            jsonWriter.name("profileId");
            TypeAdapter<Integer> typeAdapter5 = this.f3917d;
            if (typeAdapter5 == null) {
                typeAdapter5 = this.f3920g.getAdapter(Integer.class);
                this.f3917d = typeAdapter5;
            }
            typeAdapter5.write(jsonWriter, Integer.valueOf(oVar.mo3395c()));
            jsonWriter.name("gdprConsent");
            if (oVar.mo3393a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<C1177c> typeAdapter6 = this.f3918e;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f3920g.getAdapter(C1177c.class);
                    this.f3918e = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, oVar.mo3393a());
            }
            jsonWriter.name("slots");
            if (oVar.mo3399f() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<C1270q>> typeAdapter7 = this.f3919f;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.f3920g.getAdapter(TypeToken.getParameterized(List.class, C1270q.class));
                    this.f3919f = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, oVar.mo3399f());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public C1268o read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            C1281v vVar = null;
            C1285z zVar = null;
            String str2 = null;
            C1177c cVar = null;
            List list = null;
            int i = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    char c = 65535;
                    if (nextName.hashCode() == 282722171 && nextName.equals("gdprConsent")) {
                        c = 0;
                    }
                    if (c == 0) {
                        TypeAdapter<C1177c> typeAdapter = this.f3918e;
                        if (typeAdapter == null) {
                            typeAdapter = this.f3920g.getAdapter(C1177c.class);
                            this.f3918e = typeAdapter;
                        }
                        cVar = typeAdapter.read(jsonReader);
                    } else if ("id".equals(nextName)) {
                        TypeAdapter<String> typeAdapter2 = this.f3914a;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f3920g.getAdapter(String.class);
                            this.f3914a = typeAdapter2;
                        }
                        str = typeAdapter2.read(jsonReader);
                    } else if ("publisher".equals(nextName)) {
                        TypeAdapter<C1281v> typeAdapter3 = this.f3915b;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f3920g.getAdapter(C1281v.class);
                            this.f3915b = typeAdapter3;
                        }
                        vVar = typeAdapter3.read(jsonReader);
                    } else if ("user".equals(nextName)) {
                        TypeAdapter<C1285z> typeAdapter4 = this.f3916c;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f3920g.getAdapter(C1285z.class);
                            this.f3916c = typeAdapter4;
                        }
                        zVar = typeAdapter4.read(jsonReader);
                    } else if ("sdkVersion".equals(nextName)) {
                        TypeAdapter<String> typeAdapter5 = this.f3914a;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.f3920g.getAdapter(String.class);
                            this.f3914a = typeAdapter5;
                        }
                        str2 = typeAdapter5.read(jsonReader);
                    } else if ("profileId".equals(nextName)) {
                        TypeAdapter<Integer> typeAdapter6 = this.f3917d;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.f3920g.getAdapter(Integer.class);
                            this.f3917d = typeAdapter6;
                        }
                        i = typeAdapter6.read(jsonReader).intValue();
                    } else if ("slots".equals(nextName)) {
                        TypeAdapter<List<C1270q>> typeAdapter7 = this.f3919f;
                        if (typeAdapter7 == null) {
                            typeAdapter7 = this.f3920g.getAdapter(TypeToken.getParameterized(List.class, C1270q.class));
                            this.f3919f = typeAdapter7;
                        }
                        list = typeAdapter7.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C1255h(str, vVar, zVar, str2, i, cVar, list);
        }

        public String toString() {
            return "TypeAdapter(" + "CdbRequest" + ")";
        }
    }
}
