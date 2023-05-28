package com.criteo.publisher.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: com.criteo.publisher.model.k */
/* compiled from: AutoValue_RemoteConfigRequest */
final class C1261k extends C1250d {
    C1261k(String str, String str2, String str3, int i, String str4, String str5) {
        super(str, str2, str3, i, str4, str5);
    }

    /* renamed from: com.criteo.publisher.model.k$a */
    /* compiled from: AutoValue_RemoteConfigRequest */
    static final class C1262a extends TypeAdapter<C1282w> {

        /* renamed from: a */
        private volatile TypeAdapter<String> f3928a;

        /* renamed from: b */
        private volatile TypeAdapter<Integer> f3929b;

        /* renamed from: c */
        private final Gson f3930c;

        C1262a(Gson gson) {
            this.f3930c = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, C1282w wVar) throws IOException {
            if (wVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("cpId");
            if (wVar.mo3501b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f3928a;
                if (typeAdapter == null) {
                    typeAdapter = this.f3930c.getAdapter(String.class);
                    this.f3928a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, wVar.mo3501b());
            }
            jsonWriter.name("bundleId");
            if (wVar.mo3500a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f3928a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f3930c.getAdapter(String.class);
                    this.f3928a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, wVar.mo3500a());
            }
            jsonWriter.name("sdkVersion");
            if (wVar.mo3506f() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f3928a;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f3930c.getAdapter(String.class);
                    this.f3928a = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, wVar.mo3506f());
            }
            jsonWriter.name("rtbProfileId");
            TypeAdapter<Integer> typeAdapter4 = this.f3929b;
            if (typeAdapter4 == null) {
                typeAdapter4 = this.f3930c.getAdapter(Integer.class);
                this.f3929b = typeAdapter4;
            }
            typeAdapter4.write(jsonWriter, Integer.valueOf(wVar.mo3504e()));
            jsonWriter.name("deviceId");
            if (wVar.mo3502c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter5 = this.f3928a;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f3930c.getAdapter(String.class);
                    this.f3928a = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, wVar.mo3502c());
            }
            jsonWriter.name("deviceOs");
            if (wVar.mo3503d() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter6 = this.f3928a;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f3930c.getAdapter(String.class);
                    this.f3928a = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, wVar.mo3503d());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public C1282w read(JsonReader jsonReader) throws IOException {
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
            int i = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    char c = 65535;
                    int hashCode = nextName.hashCode();
                    if (hashCode != -1537286620) {
                        if (hashCode == 3059304 && nextName.equals("cpId")) {
                            c = 0;
                        }
                    } else if (nextName.equals("rtbProfileId")) {
                        c = 1;
                    }
                    if (c == 0) {
                        TypeAdapter<String> typeAdapter = this.f3928a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f3930c.getAdapter(String.class);
                            this.f3928a = typeAdapter;
                        }
                        str = typeAdapter.read(jsonReader);
                    } else if (c == 1) {
                        TypeAdapter<Integer> typeAdapter2 = this.f3929b;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f3930c.getAdapter(Integer.class);
                            this.f3929b = typeAdapter2;
                        }
                        i = typeAdapter2.read(jsonReader).intValue();
                    } else if ("bundleId".equals(nextName)) {
                        TypeAdapter<String> typeAdapter3 = this.f3928a;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f3930c.getAdapter(String.class);
                            this.f3928a = typeAdapter3;
                        }
                        str2 = typeAdapter3.read(jsonReader);
                    } else if ("sdkVersion".equals(nextName)) {
                        TypeAdapter<String> typeAdapter4 = this.f3928a;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f3930c.getAdapter(String.class);
                            this.f3928a = typeAdapter4;
                        }
                        str3 = typeAdapter4.read(jsonReader);
                    } else if ("deviceId".equals(nextName)) {
                        TypeAdapter<String> typeAdapter5 = this.f3928a;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.f3930c.getAdapter(String.class);
                            this.f3928a = typeAdapter5;
                        }
                        str4 = typeAdapter5.read(jsonReader);
                    } else if ("deviceOs".equals(nextName)) {
                        TypeAdapter<String> typeAdapter6 = this.f3928a;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.f3930c.getAdapter(String.class);
                            this.f3928a = typeAdapter6;
                        }
                        str5 = typeAdapter6.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C1261k(str, str2, str3, i, str4, str5);
        }

        public String toString() {
            return "TypeAdapter(" + "RemoteConfigRequest" + ")";
        }
    }
}
