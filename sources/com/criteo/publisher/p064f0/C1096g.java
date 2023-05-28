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

/* renamed from: com.criteo.publisher.f0.g */
/* compiled from: AutoValue_MetricRequest_MetricRequestFeedback */
final class C1096g extends C1087c {
    C1096g(List<C1121t.C1123b> list, Long l, boolean z, long j, Long l2, String str) {
        super(list, l, z, j, l2, str);
    }

    /* renamed from: com.criteo.publisher.f0.g$a */
    /* compiled from: AutoValue_MetricRequest_MetricRequestFeedback */
    static final class C1097a extends TypeAdapter<C1121t.C1122a> {

        /* renamed from: a */
        private volatile TypeAdapter<List<C1121t.C1123b>> f3559a;

        /* renamed from: b */
        private volatile TypeAdapter<Long> f3560b;

        /* renamed from: c */
        private volatile TypeAdapter<Boolean> f3561c;

        /* renamed from: d */
        private volatile TypeAdapter<Long> f3562d;

        /* renamed from: e */
        private volatile TypeAdapter<String> f3563e;

        /* renamed from: f */
        private final Gson f3564f;

        C1097a(Gson gson) {
            this.f3564f = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, C1121t.C1122a aVar) throws IOException {
            if (aVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("slots");
            if (aVar.mo3171e() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<C1121t.C1123b>> typeAdapter = this.f3559a;
                if (typeAdapter == null) {
                    typeAdapter = this.f3564f.getAdapter(TypeToken.getParameterized(List.class, C1121t.C1123b.class));
                    this.f3559a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, aVar.mo3171e());
            }
            jsonWriter.name("elapsed");
            if (aVar.mo3169c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Long> typeAdapter2 = this.f3560b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f3564f.getAdapter(Long.class);
                    this.f3560b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, aVar.mo3169c());
            }
            jsonWriter.name("isTimeout");
            TypeAdapter<Boolean> typeAdapter3 = this.f3561c;
            if (typeAdapter3 == null) {
                typeAdapter3 = this.f3564f.getAdapter(Boolean.class);
                this.f3561c = typeAdapter3;
            }
            typeAdapter3.write(jsonWriter, Boolean.valueOf(aVar.mo3173f()));
            jsonWriter.name("cdbCallStartElapsed");
            TypeAdapter<Long> typeAdapter4 = this.f3562d;
            if (typeAdapter4 == null) {
                typeAdapter4 = this.f3564f.getAdapter(Long.class);
                this.f3562d = typeAdapter4;
            }
            typeAdapter4.write(jsonWriter, Long.valueOf(aVar.mo3168b()));
            jsonWriter.name("cdbCallEndElapsed");
            if (aVar.mo3167a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Long> typeAdapter5 = this.f3560b;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f3564f.getAdapter(Long.class);
                    this.f3560b = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, aVar.mo3167a());
            }
            jsonWriter.name("requestGroupId");
            if (aVar.mo3170d() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter6 = this.f3563e;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f3564f.getAdapter(String.class);
                    this.f3563e = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, aVar.mo3170d());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public C1121t.C1122a read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            long j = 0;
            List list = null;
            Long l = null;
            Long l2 = null;
            String str = null;
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    char c = 65535;
                    if (nextName.hashCode() == -1893690153 && nextName.equals("isTimeout")) {
                        c = 0;
                    }
                    if (c == 0) {
                        TypeAdapter<Boolean> typeAdapter = this.f3561c;
                        if (typeAdapter == null) {
                            typeAdapter = this.f3564f.getAdapter(Boolean.class);
                            this.f3561c = typeAdapter;
                        }
                        z = typeAdapter.read(jsonReader).booleanValue();
                    } else if ("slots".equals(nextName)) {
                        TypeAdapter<List<C1121t.C1123b>> typeAdapter2 = this.f3559a;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f3564f.getAdapter(TypeToken.getParameterized(List.class, C1121t.C1123b.class));
                            this.f3559a = typeAdapter2;
                        }
                        list = typeAdapter2.read(jsonReader);
                    } else if ("elapsed".equals(nextName)) {
                        TypeAdapter<Long> typeAdapter3 = this.f3560b;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f3564f.getAdapter(Long.class);
                            this.f3560b = typeAdapter3;
                        }
                        l = typeAdapter3.read(jsonReader);
                    } else if ("cdbCallStartElapsed".equals(nextName)) {
                        TypeAdapter<Long> typeAdapter4 = this.f3562d;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f3564f.getAdapter(Long.class);
                            this.f3562d = typeAdapter4;
                        }
                        j = typeAdapter4.read(jsonReader).longValue();
                    } else if ("cdbCallEndElapsed".equals(nextName)) {
                        TypeAdapter<Long> typeAdapter5 = this.f3560b;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.f3564f.getAdapter(Long.class);
                            this.f3560b = typeAdapter5;
                        }
                        l2 = typeAdapter5.read(jsonReader);
                    } else if ("requestGroupId".equals(nextName)) {
                        TypeAdapter<String> typeAdapter6 = this.f3563e;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.f3564f.getAdapter(String.class);
                            this.f3563e = typeAdapter6;
                        }
                        str = typeAdapter6.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C1096g(list, l, z, j, l2, str);
        }

        public String toString() {
            return "TypeAdapter(" + "MetricRequest.MetricRequestFeedback" + ")";
        }
    }
}
