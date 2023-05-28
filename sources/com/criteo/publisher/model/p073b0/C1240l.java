package com.criteo.publisher.model.p073b0;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.criteo.publisher.model.b0.l */
/* compiled from: AutoValue_NativeProduct */
final class C1240l extends C1229f {
    C1240l(String str, String str2, String str3, URI uri, String str4, C1245o oVar) {
        super(str, str2, str3, uri, str4, oVar);
    }

    /* renamed from: com.criteo.publisher.model.b0.l$a */
    /* compiled from: AutoValue_NativeProduct */
    static final class C1241a extends TypeAdapter<C1248r> {

        /* renamed from: a */
        private volatile TypeAdapter<String> f3878a;

        /* renamed from: b */
        private volatile TypeAdapter<URI> f3879b;

        /* renamed from: c */
        private volatile TypeAdapter<C1245o> f3880c;

        /* renamed from: d */
        private final Gson f3881d;

        C1241a(Gson gson) {
            this.f3881d = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, C1248r rVar) throws IOException {
            if (rVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("title");
            if (rVar.mo3462g() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f3878a;
                if (typeAdapter == null) {
                    typeAdapter = this.f3881d.getAdapter(String.class);
                    this.f3878a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, rVar.mo3462g());
            }
            jsonWriter.name("description");
            if (rVar.mo3458c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f3878a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f3881d.getAdapter(String.class);
                    this.f3878a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, rVar.mo3458c());
            }
            jsonWriter.name("price");
            if (rVar.mo3461f() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f3878a;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f3881d.getAdapter(String.class);
                    this.f3878a = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, rVar.mo3461f());
            }
            jsonWriter.name(IabUtils.KEY_CLICK_URL);
            if (rVar.mo3457b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<URI> typeAdapter4 = this.f3879b;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f3881d.getAdapter(URI.class);
                    this.f3879b = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, rVar.mo3457b());
            }
            jsonWriter.name("callToAction");
            if (rVar.mo3456a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter5 = this.f3878a;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f3881d.getAdapter(String.class);
                    this.f3878a = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, rVar.mo3456a());
            }
            jsonWriter.name("image");
            if (rVar.mo3459d() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<C1245o> typeAdapter6 = this.f3880c;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f3881d.getAdapter(C1245o.class);
                    this.f3880c = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, rVar.mo3459d());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public C1248r read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            URI uri = null;
            String str4 = null;
            C1245o oVar = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if ("title".equals(nextName)) {
                        TypeAdapter<String> typeAdapter = this.f3878a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f3881d.getAdapter(String.class);
                            this.f3878a = typeAdapter;
                        }
                        str = typeAdapter.read(jsonReader);
                    } else if ("description".equals(nextName)) {
                        TypeAdapter<String> typeAdapter2 = this.f3878a;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f3881d.getAdapter(String.class);
                            this.f3878a = typeAdapter2;
                        }
                        str2 = typeAdapter2.read(jsonReader);
                    } else if ("price".equals(nextName)) {
                        TypeAdapter<String> typeAdapter3 = this.f3878a;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f3881d.getAdapter(String.class);
                            this.f3878a = typeAdapter3;
                        }
                        str3 = typeAdapter3.read(jsonReader);
                    } else if (IabUtils.KEY_CLICK_URL.equals(nextName)) {
                        TypeAdapter<URI> typeAdapter4 = this.f3879b;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f3881d.getAdapter(URI.class);
                            this.f3879b = typeAdapter4;
                        }
                        uri = typeAdapter4.read(jsonReader);
                    } else if ("callToAction".equals(nextName)) {
                        TypeAdapter<String> typeAdapter5 = this.f3878a;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.f3881d.getAdapter(String.class);
                            this.f3878a = typeAdapter5;
                        }
                        str4 = typeAdapter5.read(jsonReader);
                    } else if ("image".equals(nextName)) {
                        TypeAdapter<C1245o> typeAdapter6 = this.f3880c;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.f3881d.getAdapter(C1245o.class);
                            this.f3880c = typeAdapter6;
                        }
                        oVar = typeAdapter6.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new C1240l(str, str2, str3, uri, str4, oVar);
        }

        public String toString() {
            return "TypeAdapter(" + "NativeProduct" + ")";
        }
    }
}
