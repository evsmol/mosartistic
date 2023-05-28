package com.criteo.publisher.p064f0;

import com.criteo.publisher.p064f0.C1112n;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: com.criteo.publisher.f0.e */
/* compiled from: AutoValue_Metric */
final class C1091e extends C1081a {
    C1091e(Long l, Long l2, boolean z, boolean z2, Long l3, String str, String str2, Integer num, Integer num2, boolean z3) {
        super(l, l2, z, z2, l3, str, str2, num, num2, z3);
    }

    /* renamed from: com.criteo.publisher.f0.e$a */
    /* compiled from: AutoValue_Metric */
    static final class C1092a extends TypeAdapter<C1112n> {

        /* renamed from: a */
        private volatile TypeAdapter<Long> f3543a;

        /* renamed from: b */
        private volatile TypeAdapter<Boolean> f3544b;

        /* renamed from: c */
        private volatile TypeAdapter<String> f3545c;

        /* renamed from: d */
        private volatile TypeAdapter<Integer> f3546d;

        /* renamed from: e */
        private final Gson f3547e;

        C1092a(Gson gson) {
            this.f3547e = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, C1112n nVar) throws IOException {
            if (nVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("cdbCallStartTimestamp");
            if (nVar.mo3132c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Long> typeAdapter = this.f3543a;
                if (typeAdapter == null) {
                    typeAdapter = this.f3547e.getAdapter(Long.class);
                    this.f3543a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, nVar.mo3132c());
            }
            jsonWriter.name("cdbCallEndTimestamp");
            if (nVar.mo3131b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Long> typeAdapter2 = this.f3543a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f3547e.getAdapter(Long.class);
                    this.f3543a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, nVar.mo3131b());
            }
            jsonWriter.name("cdbCallTimeout");
            TypeAdapter<Boolean> typeAdapter3 = this.f3544b;
            if (typeAdapter3 == null) {
                typeAdapter3 = this.f3547e.getAdapter(Boolean.class);
                this.f3544b = typeAdapter3;
            }
            typeAdapter3.write(jsonWriter, Boolean.valueOf(nVar.mo3141j()));
            jsonWriter.name("cachedBidUsed");
            TypeAdapter<Boolean> typeAdapter4 = this.f3544b;
            if (typeAdapter4 == null) {
                typeAdapter4 = this.f3547e.getAdapter(Boolean.class);
                this.f3544b = typeAdapter4;
            }
            typeAdapter4.write(jsonWriter, Boolean.valueOf(nVar.mo3140i()));
            jsonWriter.name("elapsedTimestamp");
            if (nVar.mo3133d() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Long> typeAdapter5 = this.f3543a;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f3547e.getAdapter(Long.class);
                    this.f3543a = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, nVar.mo3133d());
            }
            jsonWriter.name("impressionId");
            if (nVar.mo3134e() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter6 = this.f3545c;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f3547e.getAdapter(String.class);
                    this.f3545c = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, nVar.mo3134e());
            }
            jsonWriter.name("requestGroupId");
            if (nVar.mo3137g() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter7 = this.f3545c;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.f3547e.getAdapter(String.class);
                    this.f3545c = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, nVar.mo3137g());
            }
            jsonWriter.name("zoneId");
            if (nVar.mo3138h() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter8 = this.f3546d;
                if (typeAdapter8 == null) {
                    typeAdapter8 = this.f3547e.getAdapter(Integer.class);
                    this.f3546d = typeAdapter8;
                }
                typeAdapter8.write(jsonWriter, nVar.mo3138h());
            }
            jsonWriter.name("profileId");
            if (nVar.mo3136f() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter9 = this.f3546d;
                if (typeAdapter9 == null) {
                    typeAdapter9 = this.f3547e.getAdapter(Integer.class);
                    this.f3546d = typeAdapter9;
                }
                typeAdapter9.write(jsonWriter, nVar.mo3136f());
            }
            jsonWriter.name("readyToSend");
            TypeAdapter<Boolean> typeAdapter10 = this.f3544b;
            if (typeAdapter10 == null) {
                typeAdapter10 = this.f3547e.getAdapter(Boolean.class);
                this.f3544b = typeAdapter10;
            }
            typeAdapter10.write(jsonWriter, Boolean.valueOf(nVar.mo3142k()));
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public C1112n read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            C1112n.C1113a a = C1112n.m5141a();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if ("cdbCallStartTimestamp".equals(nextName)) {
                        TypeAdapter<Long> typeAdapter = this.f3543a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f3547e.getAdapter(Long.class);
                            this.f3543a = typeAdapter;
                        }
                        a.mo3151b(typeAdapter.read(jsonReader));
                    } else if ("cdbCallEndTimestamp".equals(nextName)) {
                        TypeAdapter<Long> typeAdapter2 = this.f3543a;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f3547e.getAdapter(Long.class);
                            this.f3543a = typeAdapter2;
                        }
                        a.mo3146a(typeAdapter2.read(jsonReader));
                    } else if ("cdbCallTimeout".equals(nextName)) {
                        TypeAdapter<Boolean> typeAdapter3 = this.f3544b;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f3547e.getAdapter(Boolean.class);
                            this.f3544b = typeAdapter3;
                        }
                        a.mo3153b(typeAdapter3.read(jsonReader).booleanValue());
                    } else if ("cachedBidUsed".equals(nextName)) {
                        TypeAdapter<Boolean> typeAdapter4 = this.f3544b;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f3547e.getAdapter(Boolean.class);
                            this.f3544b = typeAdapter4;
                        }
                        a.mo3148a(typeAdapter4.read(jsonReader).booleanValue());
                    } else if ("elapsedTimestamp".equals(nextName)) {
                        TypeAdapter<Long> typeAdapter5 = this.f3543a;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.f3547e.getAdapter(Long.class);
                            this.f3543a = typeAdapter5;
                        }
                        a.mo3154c(typeAdapter5.read(jsonReader));
                    } else if ("impressionId".equals(nextName)) {
                        TypeAdapter<String> typeAdapter6 = this.f3545c;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.f3547e.getAdapter(String.class);
                            this.f3545c = typeAdapter6;
                        }
                        a.mo3147a(typeAdapter6.read(jsonReader));
                    } else if ("requestGroupId".equals(nextName)) {
                        TypeAdapter<String> typeAdapter7 = this.f3545c;
                        if (typeAdapter7 == null) {
                            typeAdapter7 = this.f3547e.getAdapter(String.class);
                            this.f3545c = typeAdapter7;
                        }
                        a.mo3152b(typeAdapter7.read(jsonReader));
                    } else if ("zoneId".equals(nextName)) {
                        TypeAdapter<Integer> typeAdapter8 = this.f3546d;
                        if (typeAdapter8 == null) {
                            typeAdapter8 = this.f3547e.getAdapter(Integer.class);
                            this.f3546d = typeAdapter8;
                        }
                        a.mo3150b(typeAdapter8.read(jsonReader));
                    } else if ("profileId".equals(nextName)) {
                        TypeAdapter<Integer> typeAdapter9 = this.f3546d;
                        if (typeAdapter9 == null) {
                            typeAdapter9 = this.f3547e.getAdapter(Integer.class);
                            this.f3546d = typeAdapter9;
                        }
                        a.mo3145a(typeAdapter9.read(jsonReader));
                    } else if ("readyToSend".equals(nextName)) {
                        TypeAdapter<Boolean> typeAdapter10 = this.f3544b;
                        if (typeAdapter10 == null) {
                            typeAdapter10 = this.f3547e.getAdapter(Boolean.class);
                            this.f3544b = typeAdapter10;
                        }
                        a.mo3155c(typeAdapter10.read(jsonReader).booleanValue());
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return a.mo3149a();
        }

        public String toString() {
            return "TypeAdapter(" + "Metric" + ")";
        }
    }
}
