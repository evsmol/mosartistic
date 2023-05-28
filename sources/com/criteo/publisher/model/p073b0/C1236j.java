package com.criteo.publisher.model.p073b0;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URL;

/* renamed from: com.criteo.publisher.model.b0.j */
/* compiled from: AutoValue_NativeImpressionPixel */
final class C1236j extends C1227d {
    C1236j(URL url) {
        super(url);
    }

    /* renamed from: com.criteo.publisher.model.b0.j$a */
    /* compiled from: AutoValue_NativeImpressionPixel */
    static final class C1237a extends TypeAdapter<C1246p> {

        /* renamed from: a */
        private volatile TypeAdapter<URL> f3872a;

        /* renamed from: b */
        private final Gson f3873b;

        C1237a(Gson gson) {
            this.f3873b = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, C1246p pVar) throws IOException {
            if (pVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("url");
            if (pVar.mo3446a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<URL> typeAdapter = this.f3872a;
                if (typeAdapter == null) {
                    typeAdapter = this.f3873b.getAdapter(URL.class);
                    this.f3872a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, pVar.mo3446a());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public C1246p read(JsonReader jsonReader) throws IOException {
            URL url = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if ("url".equals(nextName)) {
                        TypeAdapter<URL> typeAdapter = this.f3872a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f3873b.getAdapter(URL.class);
                            this.f3872a = typeAdapter;
                        }
                        url = typeAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C1236j(url);
        }

        public String toString() {
            return "TypeAdapter(" + "NativeImpressionPixel" + ")";
        }
    }
}
