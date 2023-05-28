package com.criteo.publisher.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.criteo.publisher.model.m */
/* compiled from: AutoValue_User */
final class C1265m extends C1252f {
    C1265m(String str, String str2, String str3, String str4, String str5, String str6, Map<String, Object> map) {
        super(str, str2, str3, str4, str5, str6, map);
    }

    /* renamed from: com.criteo.publisher.model.m$a */
    /* compiled from: AutoValue_User */
    static final class C1266a extends TypeAdapter<C1285z> {

        /* renamed from: a */
        private volatile TypeAdapter<String> f3936a;

        /* renamed from: b */
        private volatile TypeAdapter<Map<String, Object>> f3937b;

        /* renamed from: c */
        private final Gson f3938c;

        C1266a(Gson gson) {
            this.f3938c = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, C1285z zVar) throws IOException {
            if (zVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("deviceId");
            if (zVar.mo3522a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f3936a;
                if (typeAdapter == null) {
                    typeAdapter = this.f3938c.getAdapter(String.class);
                    this.f3936a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, zVar.mo3522a());
            }
            jsonWriter.name("deviceIdType");
            if (zVar.mo3523b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f3936a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f3938c.getAdapter(String.class);
                    this.f3936a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, zVar.mo3523b());
            }
            jsonWriter.name("deviceOs");
            if (zVar.mo3524c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f3936a;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f3938c.getAdapter(String.class);
                    this.f3936a = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, zVar.mo3524c());
            }
            jsonWriter.name("mopubConsent");
            if (zVar.mo3526e() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter4 = this.f3936a;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f3938c.getAdapter(String.class);
                    this.f3936a = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, zVar.mo3526e());
            }
            jsonWriter.name("uspIab");
            if (zVar.mo3528f() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter5 = this.f3936a;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f3938c.getAdapter(String.class);
                    this.f3936a = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, zVar.mo3528f());
            }
            jsonWriter.name("uspOptout");
            if (zVar.mo3529g() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter6 = this.f3936a;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f3938c.getAdapter(String.class);
                    this.f3936a = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, zVar.mo3529g());
            }
            jsonWriter.name("ext");
            if (zVar.mo3525d() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Map<String, Object>> typeAdapter7 = this.f3937b;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.f3938c.getAdapter(TypeToken.getParameterized(Map.class, String.class, Object.class));
                    this.f3937b = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, zVar.mo3525d());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public C1285z read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Map map = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if ("deviceId".equals(nextName)) {
                        TypeAdapter<String> typeAdapter = this.f3936a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f3938c.getAdapter(String.class);
                            this.f3936a = typeAdapter;
                        }
                        str = typeAdapter.read(jsonReader);
                    } else if ("deviceIdType".equals(nextName)) {
                        TypeAdapter<String> typeAdapter2 = this.f3936a;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f3938c.getAdapter(String.class);
                            this.f3936a = typeAdapter2;
                        }
                        str2 = typeAdapter2.read(jsonReader);
                    } else if ("deviceOs".equals(nextName)) {
                        TypeAdapter<String> typeAdapter3 = this.f3936a;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f3938c.getAdapter(String.class);
                            this.f3936a = typeAdapter3;
                        }
                        str3 = typeAdapter3.read(jsonReader);
                    } else if ("mopubConsent".equals(nextName)) {
                        TypeAdapter<String> typeAdapter4 = this.f3936a;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f3938c.getAdapter(String.class);
                            this.f3936a = typeAdapter4;
                        }
                        str4 = typeAdapter4.read(jsonReader);
                    } else if ("uspIab".equals(nextName)) {
                        TypeAdapter<String> typeAdapter5 = this.f3936a;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.f3938c.getAdapter(String.class);
                            this.f3936a = typeAdapter5;
                        }
                        str5 = typeAdapter5.read(jsonReader);
                    } else if ("uspOptout".equals(nextName)) {
                        TypeAdapter<String> typeAdapter6 = this.f3936a;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.f3938c.getAdapter(String.class);
                            this.f3936a = typeAdapter6;
                        }
                        str6 = typeAdapter6.read(jsonReader);
                    } else if ("ext".equals(nextName)) {
                        TypeAdapter<Map<String, Object>> typeAdapter7 = this.f3937b;
                        if (typeAdapter7 == null) {
                            typeAdapter7 = this.f3938c.getAdapter(TypeToken.getParameterized(Map.class, String.class, Object.class));
                            this.f3937b = typeAdapter7;
                        }
                        map = typeAdapter7.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C1265m(str, str2, str3, str4, str5, str6, map);
        }

        public String toString() {
            return "TypeAdapter(" + "User" + ")";
        }
    }
}
