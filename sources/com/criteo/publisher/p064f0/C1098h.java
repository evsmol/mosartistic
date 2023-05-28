package com.criteo.publisher.p064f0;

import com.criteo.publisher.p064f0.C1121t;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: com.criteo.publisher.f0.h */
/* compiled from: AutoValue_MetricRequest_MetricRequestSlot */
final class C1098h extends C1089d {
    C1098h(String str, Integer num, boolean z) {
        super(str, num, z);
    }

    /* renamed from: com.criteo.publisher.f0.h$a */
    /* compiled from: AutoValue_MetricRequest_MetricRequestSlot */
    static final class C1099a extends TypeAdapter<C1121t.C1123b> {

        /* renamed from: a */
        private volatile TypeAdapter<String> f3565a;

        /* renamed from: b */
        private volatile TypeAdapter<Integer> f3566b;

        /* renamed from: c */
        private volatile TypeAdapter<Boolean> f3567c;

        /* renamed from: d */
        private final Gson f3568d;

        C1099a(Gson gson) {
            this.f3568d = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, C1121t.C1123b bVar) throws IOException {
            if (bVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("impressionId");
            if (bVar.mo3177b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f3565a;
                if (typeAdapter == null) {
                    typeAdapter = this.f3568d.getAdapter(String.class);
                    this.f3565a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, bVar.mo3177b());
            }
            jsonWriter.name("zoneId");
            if (bVar.mo3178c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter2 = this.f3566b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f3568d.getAdapter(Integer.class);
                    this.f3566b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, bVar.mo3178c());
            }
            jsonWriter.name("cachedBidUsed");
            TypeAdapter<Boolean> typeAdapter3 = this.f3567c;
            if (typeAdapter3 == null) {
                typeAdapter3 = this.f3568d.getAdapter(Boolean.class);
                this.f3567c = typeAdapter3;
            }
            typeAdapter3.write(jsonWriter, Boolean.valueOf(bVar.mo3176a()));
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public C1121t.C1123b read(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            boolean z = false;
            Integer num = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if ("impressionId".equals(nextName)) {
                        TypeAdapter<String> typeAdapter = this.f3565a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f3568d.getAdapter(String.class);
                            this.f3565a = typeAdapter;
                        }
                        str = typeAdapter.read(jsonReader);
                    } else if ("zoneId".equals(nextName)) {
                        TypeAdapter<Integer> typeAdapter2 = this.f3566b;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f3568d.getAdapter(Integer.class);
                            this.f3566b = typeAdapter2;
                        }
                        num = typeAdapter2.read(jsonReader);
                    } else if ("cachedBidUsed".equals(nextName)) {
                        TypeAdapter<Boolean> typeAdapter3 = this.f3567c;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f3568d.getAdapter(Boolean.class);
                            this.f3567c = typeAdapter3;
                        }
                        z = typeAdapter3.read(jsonReader).booleanValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C1098h(str, num, z);
        }

        public String toString() {
            return "TypeAdapter(" + "MetricRequest.MetricRequestSlot" + ")";
        }
    }
}
