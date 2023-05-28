package com.criteo.publisher.model.p073b0;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;

/* renamed from: com.criteo.publisher.model.b0.g */
/* compiled from: AutoValue_NativeAdvertiser */
final class C1230g extends C1223a {
    C1230g(String str, String str2, URI uri, C1245o oVar) {
        super(str, str2, uri, oVar);
    }

    /* renamed from: com.criteo.publisher.model.b0.g$a */
    /* compiled from: AutoValue_NativeAdvertiser */
    static final class C1231a extends TypeAdapter<C1242m> {

        /* renamed from: a */
        private volatile TypeAdapter<String> f3861a;

        /* renamed from: b */
        private volatile TypeAdapter<URI> f3862b;

        /* renamed from: c */
        private volatile TypeAdapter<C1245o> f3863c;

        /* renamed from: d */
        private final Gson f3864d;

        C1231a(Gson gson) {
            this.f3864d = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, C1242m mVar) throws IOException {
            if (mVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("domain");
            if (mVar.mo3422b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f3861a;
                if (typeAdapter == null) {
                    typeAdapter = this.f3864d.getAdapter(String.class);
                    this.f3861a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, mVar.mo3422b());
            }
            jsonWriter.name("description");
            if (mVar.mo3421a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f3861a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f3864d.getAdapter(String.class);
                    this.f3861a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, mVar.mo3421a());
            }
            jsonWriter.name("logoClickUrl");
            if (mVar.mo3424d() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<URI> typeAdapter3 = this.f3862b;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f3864d.getAdapter(URI.class);
                    this.f3862b = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, mVar.mo3424d());
            }
            jsonWriter.name("logo");
            if (mVar.mo3423c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<C1245o> typeAdapter4 = this.f3863c;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f3864d.getAdapter(C1245o.class);
                    this.f3863c = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, mVar.mo3423c());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public C1242m read(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str2 = null;
            URI uri = null;
            C1245o oVar = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if ("domain".equals(nextName)) {
                        TypeAdapter<String> typeAdapter = this.f3861a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f3864d.getAdapter(String.class);
                            this.f3861a = typeAdapter;
                        }
                        str = typeAdapter.read(jsonReader);
                    } else if ("description".equals(nextName)) {
                        TypeAdapter<String> typeAdapter2 = this.f3861a;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f3864d.getAdapter(String.class);
                            this.f3861a = typeAdapter2;
                        }
                        str2 = typeAdapter2.read(jsonReader);
                    } else if ("logoClickUrl".equals(nextName)) {
                        TypeAdapter<URI> typeAdapter3 = this.f3862b;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f3864d.getAdapter(URI.class);
                            this.f3862b = typeAdapter3;
                        }
                        uri = typeAdapter3.read(jsonReader);
                    } else if ("logo".equals(nextName)) {
                        TypeAdapter<C1245o> typeAdapter4 = this.f3863c;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f3864d.getAdapter(C1245o.class);
                            this.f3863c = typeAdapter4;
                        }
                        oVar = typeAdapter4.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C1230g(str, str2, uri, oVar);
        }

        public String toString() {
            return "TypeAdapter(" + "NativeAdvertiser" + ")";
        }
    }
}
