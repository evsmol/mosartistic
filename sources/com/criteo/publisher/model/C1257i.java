package com.criteo.publisher.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collection;

/* renamed from: com.criteo.publisher.model.i */
/* compiled from: AutoValue_CdbRequestSlot */
final class C1257i extends C1222b {
    C1257i(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Collection<String> collection) {
        super(str, str2, bool, bool2, bool3, collection);
    }

    /* renamed from: com.criteo.publisher.model.i$a */
    /* compiled from: AutoValue_CdbRequestSlot */
    static final class C1258a extends TypeAdapter<C1270q> {

        /* renamed from: a */
        private volatile TypeAdapter<String> f3921a;

        /* renamed from: b */
        private volatile TypeAdapter<Boolean> f3922b;

        /* renamed from: c */
        private volatile TypeAdapter<Collection<String>> f3923c;

        /* renamed from: d */
        private final Gson f3924d;

        C1258a(Gson gson) {
            this.f3924d = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, C1270q qVar) throws IOException {
            if (qVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("impId");
            if (qVar.mo3412a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f3921a;
                if (typeAdapter == null) {
                    typeAdapter = this.f3924d.getAdapter(String.class);
                    this.f3921a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, qVar.mo3412a());
            }
            jsonWriter.name("placementId");
            if (qVar.mo3413b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f3921a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f3924d.getAdapter(String.class);
                    this.f3921a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, qVar.mo3413b());
            }
            jsonWriter.name("isNative");
            if (qVar.mo3416e() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter3 = this.f3922b;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f3924d.getAdapter(Boolean.class);
                    this.f3922b = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, qVar.mo3416e());
            }
            jsonWriter.name("interstitial");
            if (qVar.mo3415d() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter4 = this.f3922b;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f3924d.getAdapter(Boolean.class);
                    this.f3922b = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, qVar.mo3415d());
            }
            jsonWriter.name("rewarded");
            if (qVar.mo3418f() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter5 = this.f3922b;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f3924d.getAdapter(Boolean.class);
                    this.f3922b = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, qVar.mo3418f());
            }
            jsonWriter.name("sizes");
            if (qVar.mo3414c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Collection<String>> typeAdapter6 = this.f3923c;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f3924d.getAdapter(TypeToken.getParameterized(Collection.class, String.class));
                    this.f3923c = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, qVar.mo3414c());
            }
            jsonWriter.endObject();
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.criteo.publisher.model.C1270q read(com.google.gson.stream.JsonReader r17) throws java.io.IOException {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                com.google.gson.stream.JsonToken r2 = r17.peek()
                com.google.gson.stream.JsonToken r3 = com.google.gson.stream.JsonToken.NULL
                r4 = 0
                if (r2 != r3) goto L_0x0011
                r17.nextNull()
                return r4
            L_0x0011:
                r17.beginObject()
                r6 = r4
                r7 = r6
                r8 = r7
                r9 = r8
                r10 = r9
                r11 = r10
            L_0x001a:
                boolean r2 = r17.hasNext()
                if (r2 == 0) goto L_0x011f
                java.lang.String r2 = r17.nextName()
                com.google.gson.stream.JsonToken r3 = r17.peek()
                com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.NULL
                if (r3 != r4) goto L_0x0030
                r17.nextNull()
                goto L_0x001a
            L_0x0030:
                int r4 = r2.hashCode()
                r5 = 0
                r12 = 5
                r13 = 4
                r14 = 3
                r15 = 2
                r3 = 1
                switch(r4) {
                    case -378584607: goto L_0x0070;
                    case -239580146: goto L_0x0066;
                    case 100326919: goto L_0x005c;
                    case 109453458: goto L_0x0052;
                    case 604727084: goto L_0x0048;
                    case 732231392: goto L_0x003e;
                    default: goto L_0x003d;
                }
            L_0x003d:
                goto L_0x007a
            L_0x003e:
                java.lang.String r4 = "placementId"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x007a
                r2 = 1
                goto L_0x007b
            L_0x0048:
                java.lang.String r4 = "interstitial"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x007a
                r2 = 3
                goto L_0x007b
            L_0x0052:
                java.lang.String r4 = "sizes"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x007a
                r2 = 5
                goto L_0x007b
            L_0x005c:
                java.lang.String r4 = "impId"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x007a
                r2 = 0
                goto L_0x007b
            L_0x0066:
                java.lang.String r4 = "rewarded"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x007a
                r2 = 4
                goto L_0x007b
            L_0x0070:
                java.lang.String r4 = "isNative"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x007a
                r2 = 2
                goto L_0x007b
            L_0x007a:
                r2 = -1
            L_0x007b:
                if (r2 == 0) goto L_0x0108
                if (r2 == r3) goto L_0x00f1
                if (r2 == r15) goto L_0x00da
                if (r2 == r14) goto L_0x00c3
                if (r2 == r13) goto L_0x00ac
                if (r2 == r12) goto L_0x008b
                r17.skipValue()
                goto L_0x001a
            L_0x008b:
                com.google.gson.TypeAdapter<java.util.Collection<java.lang.String>> r2 = r0.f3923c
                if (r2 != 0) goto L_0x00a3
                com.google.gson.Gson r2 = r0.f3924d
                java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r3[r5] = r4
                java.lang.Class<java.util.Collection> r4 = java.util.Collection.class
                com.google.gson.reflect.TypeToken r3 = com.google.gson.reflect.TypeToken.getParameterized(r4, r3)
                com.google.gson.TypeAdapter r2 = r2.getAdapter(r3)
                r0.f3923c = r2
            L_0x00a3:
                java.lang.Object r2 = r2.read(r1)
                java.util.Collection r2 = (java.util.Collection) r2
                r11 = r2
                goto L_0x001a
            L_0x00ac:
                com.google.gson.TypeAdapter<java.lang.Boolean> r2 = r0.f3922b
                if (r2 != 0) goto L_0x00ba
                com.google.gson.Gson r2 = r0.f3924d
                java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter(r3)
                r0.f3922b = r2
            L_0x00ba:
                java.lang.Object r2 = r2.read(r1)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                r10 = r2
                goto L_0x001a
            L_0x00c3:
                com.google.gson.TypeAdapter<java.lang.Boolean> r2 = r0.f3922b
                if (r2 != 0) goto L_0x00d1
                com.google.gson.Gson r2 = r0.f3924d
                java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter(r3)
                r0.f3922b = r2
            L_0x00d1:
                java.lang.Object r2 = r2.read(r1)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                r9 = r2
                goto L_0x001a
            L_0x00da:
                com.google.gson.TypeAdapter<java.lang.Boolean> r2 = r0.f3922b
                if (r2 != 0) goto L_0x00e8
                com.google.gson.Gson r2 = r0.f3924d
                java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter(r3)
                r0.f3922b = r2
            L_0x00e8:
                java.lang.Object r2 = r2.read(r1)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                r8 = r2
                goto L_0x001a
            L_0x00f1:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f3921a
                if (r2 != 0) goto L_0x00ff
                com.google.gson.Gson r2 = r0.f3924d
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter(r3)
                r0.f3921a = r2
            L_0x00ff:
                java.lang.Object r2 = r2.read(r1)
                java.lang.String r2 = (java.lang.String) r2
                r7 = r2
                goto L_0x001a
            L_0x0108:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f3921a
                if (r2 != 0) goto L_0x0116
                com.google.gson.Gson r2 = r0.f3924d
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter(r3)
                r0.f3921a = r2
            L_0x0116:
                java.lang.Object r2 = r2.read(r1)
                java.lang.String r2 = (java.lang.String) r2
                r6 = r2
                goto L_0x001a
            L_0x011f:
                r17.endObject()
                com.criteo.publisher.model.i r1 = new com.criteo.publisher.model.i
                r5 = r1
                r5.<init>(r6, r7, r8, r9, r10, r11)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.model.C1257i.C1258a.read(com.google.gson.stream.JsonReader):com.criteo.publisher.model.q");
        }

        public String toString() {
            return "TypeAdapter(" + "CdbRequestSlot" + ")";
        }
    }
}
