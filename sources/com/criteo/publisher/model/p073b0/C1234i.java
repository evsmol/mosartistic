package com.criteo.publisher.model.p073b0;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URL;

/* renamed from: com.criteo.publisher.model.b0.i */
/* compiled from: AutoValue_NativeImage */
final class C1234i extends C1226c {
    C1234i(URL url) {
        super(url);
    }

    /* renamed from: com.criteo.publisher.model.b0.i$a */
    /* compiled from: AutoValue_NativeImage */
    static final class C1235a extends TypeAdapter<C1245o> {

        /* renamed from: a */
        private volatile TypeAdapter<URL> f3870a;

        /* renamed from: b */
        private final Gson f3871b;

        C1235a(Gson gson) {
            this.f3871b = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, C1245o oVar) throws IOException {
            if (oVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("url");
            if (oVar.mo3442a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<URL> typeAdapter = this.f3870a;
                if (typeAdapter == null) {
                    typeAdapter = this.f3871b.getAdapter(URL.class);
                    this.f3870a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, oVar.mo3442a());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public C1245o read(JsonReader jsonReader) throws IOException {
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
                        TypeAdapter<URL> typeAdapter = this.f3870a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f3871b.getAdapter(URL.class);
                            this.f3870a = typeAdapter;
                        }
                        url = typeAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C1234i(url);
        }

        public String toString() {
            return "TypeAdapter(" + "NativeImage" + ")";
        }
    }
}
