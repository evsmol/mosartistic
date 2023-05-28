package com.criteo.publisher.model.p073b0;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

/* renamed from: com.criteo.publisher.model.b0.k */
/* compiled from: AutoValue_NativePrivacy */
final class C1238k extends C1228e {
    C1238k(URI uri, URL url, String str) {
        super(uri, url, str);
    }

    /* renamed from: com.criteo.publisher.model.b0.k$a */
    /* compiled from: AutoValue_NativePrivacy */
    static final class C1239a extends TypeAdapter<C1247q> {

        /* renamed from: a */
        private volatile TypeAdapter<URI> f3874a;

        /* renamed from: b */
        private volatile TypeAdapter<URL> f3875b;

        /* renamed from: c */
        private volatile TypeAdapter<String> f3876c;

        /* renamed from: d */
        private final Gson f3877d;

        C1239a(Gson gson) {
            this.f3877d = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, C1247q qVar) throws IOException {
            if (qVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("optoutClickUrl");
            if (qVar.mo3450a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<URI> typeAdapter = this.f3874a;
                if (typeAdapter == null) {
                    typeAdapter = this.f3877d.getAdapter(URI.class);
                    this.f3874a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, qVar.mo3450a());
            }
            jsonWriter.name("optoutImageUrl");
            if (qVar.mo3451b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<URL> typeAdapter2 = this.f3875b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f3877d.getAdapter(URL.class);
                    this.f3875b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, qVar.mo3451b());
            }
            jsonWriter.name("longLegalText");
            if (qVar.mo3452c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f3876c;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f3877d.getAdapter(String.class);
                    this.f3876c = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, qVar.mo3452c());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public C1247q read(JsonReader jsonReader) throws IOException {
            URI uri = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            URL url = null;
            String str = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    char c = 65535;
                    int hashCode = nextName.hashCode();
                    if (hashCode != -111772945) {
                        if (hashCode != 763886698) {
                            if (hashCode == 1654281122 && nextName.equals("optoutClickUrl")) {
                                c = 0;
                            }
                        } else if (nextName.equals("longLegalText")) {
                            c = 2;
                        }
                    } else if (nextName.equals("optoutImageUrl")) {
                        c = 1;
                    }
                    if (c == 0) {
                        TypeAdapter<URI> typeAdapter = this.f3874a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f3877d.getAdapter(URI.class);
                            this.f3874a = typeAdapter;
                        }
                        uri = typeAdapter.read(jsonReader);
                    } else if (c == 1) {
                        TypeAdapter<URL> typeAdapter2 = this.f3875b;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f3877d.getAdapter(URL.class);
                            this.f3875b = typeAdapter2;
                        }
                        url = typeAdapter2.read(jsonReader);
                    } else if (c != 2) {
                        jsonReader.skipValue();
                    } else {
                        TypeAdapter<String> typeAdapter3 = this.f3876c;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f3877d.getAdapter(String.class);
                            this.f3876c = typeAdapter3;
                        }
                        str = typeAdapter3.read(jsonReader);
                    }
                }
            }
            jsonReader.endObject();
            return new C1238k(uri, url, str);
        }

        public String toString() {
            return "TypeAdapter(" + "NativePrivacy" + ")";
        }
    }
}
