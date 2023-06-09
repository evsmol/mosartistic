package com.criteo.publisher.model;

import com.criteo.publisher.logging.RemoteLogRecords;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: com.criteo.publisher.model.l */
/* compiled from: AutoValue_RemoteConfigResponse */
final class C1263l extends C1251e {
    C1263l(Boolean bool, String str, String str2, String str3, String str4, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, RemoteLogRecords.RemoteLogLevel remoteLogLevel) {
        super(bool, str, str2, str3, str4, bool2, bool3, num, bool4, remoteLogLevel);
    }

    /* renamed from: com.criteo.publisher.model.l$a */
    /* compiled from: AutoValue_RemoteConfigResponse */
    static final class C1264a extends TypeAdapter<C1284y> {

        /* renamed from: a */
        private volatile TypeAdapter<Boolean> f3931a;

        /* renamed from: b */
        private volatile TypeAdapter<String> f3932b;

        /* renamed from: c */
        private volatile TypeAdapter<Integer> f3933c;

        /* renamed from: d */
        private volatile TypeAdapter<RemoteLogRecords.RemoteLogLevel> f3934d;

        /* renamed from: e */
        private final Gson f3935e;

        C1264a(Gson gson) {
            this.f3935e = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, C1284y yVar) throws IOException {
            if (yVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("killSwitch");
            if (yVar.mo3515g() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter = this.f3931a;
                if (typeAdapter == null) {
                    typeAdapter = this.f3935e.getAdapter(Boolean.class);
                    this.f3931a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, yVar.mo3515g());
            }
            jsonWriter.name("AndroidDisplayUrlMacro");
            if (yVar.mo3512e() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f3932b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f3935e.getAdapter(String.class);
                    this.f3932b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, yVar.mo3512e());
            }
            jsonWriter.name("AndroidAdTagUrlMode");
            if (yVar.mo3511d() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f3932b;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f3935e.getAdapter(String.class);
                    this.f3932b = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, yVar.mo3511d());
            }
            jsonWriter.name("AndroidAdTagDataMacro");
            if (yVar.mo3509b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter4 = this.f3932b;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f3935e.getAdapter(String.class);
                    this.f3932b = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, yVar.mo3509b());
            }
            jsonWriter.name("AndroidAdTagDataMode");
            if (yVar.mo3510c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter5 = this.f3932b;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f3935e.getAdapter(String.class);
                    this.f3932b = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, yVar.mo3510c());
            }
            jsonWriter.name("csmEnabled");
            if (yVar.mo3514f() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter6 = this.f3931a;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f3935e.getAdapter(Boolean.class);
                    this.f3931a = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, yVar.mo3514f());
            }
            jsonWriter.name("liveBiddingEnabled");
            if (yVar.mo3516h() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter7 = this.f3931a;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.f3935e.getAdapter(Boolean.class);
                    this.f3931a = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, yVar.mo3516h());
            }
            jsonWriter.name("liveBiddingTimeBudgetInMillis");
            if (yVar.mo3518i() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter8 = this.f3933c;
                if (typeAdapter8 == null) {
                    typeAdapter8 = this.f3935e.getAdapter(Integer.class);
                    this.f3933c = typeAdapter8;
                }
                typeAdapter8.write(jsonWriter, yVar.mo3518i());
            }
            jsonWriter.name("prefetchOnInitEnabled");
            if (yVar.mo3519j() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter9 = this.f3931a;
                if (typeAdapter9 == null) {
                    typeAdapter9 = this.f3935e.getAdapter(Boolean.class);
                    this.f3931a = typeAdapter9;
                }
                typeAdapter9.write(jsonWriter, yVar.mo3519j());
            }
            jsonWriter.name("remoteLogLevel");
            if (yVar.mo3520k() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<RemoteLogRecords.RemoteLogLevel> typeAdapter10 = this.f3934d;
                if (typeAdapter10 == null) {
                    typeAdapter10 = this.f3935e.getAdapter(RemoteLogRecords.RemoteLogLevel.class);
                    this.f3934d = typeAdapter10;
                }
                typeAdapter10.write(jsonWriter, yVar.mo3520k());
            }
            jsonWriter.endObject();
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0185  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.criteo.publisher.model.C1284y read(com.google.gson.stream.JsonReader r17) throws java.io.IOException {
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
                r12 = r11
                r13 = r12
                r14 = r13
                r15 = r14
            L_0x001e:
                boolean r2 = r17.hasNext()
                if (r2 == 0) goto L_0x019c
                java.lang.String r2 = r17.nextName()
                com.google.gson.stream.JsonToken r3 = r17.peek()
                com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.NULL
                if (r3 != r4) goto L_0x0034
                r17.nextNull()
                goto L_0x001e
            L_0x0034:
                int r4 = r2.hashCode()
                r5 = -648432651(0xffffffffd959b3f5, float:-3.82987092E15)
                r3 = 3
                if (r4 == r5) goto L_0x006c
                r5 = 28088106(0x1ac972a, float:6.339973E-38)
                if (r4 == r5) goto L_0x0062
                r5 = 1373006778(0x51d66bba, float:1.15116294E11)
                if (r4 == r5) goto L_0x0058
                r5 = 1395208240(0x53293030, float:7.2665793E11)
                if (r4 == r5) goto L_0x004e
                goto L_0x0076
            L_0x004e:
                java.lang.String r4 = "AndroidDisplayUrlMacro"
                boolean r4 = r2.equals(r4)
                if (r4 == 0) goto L_0x0076
                r4 = 0
                goto L_0x0077
            L_0x0058:
                java.lang.String r4 = "AndroidAdTagDataMacro"
                boolean r4 = r2.equals(r4)
                if (r4 == 0) goto L_0x0076
                r4 = 2
                goto L_0x0077
            L_0x0062:
                java.lang.String r4 = "AndroidAdTagUrlMode"
                boolean r4 = r2.equals(r4)
                if (r4 == 0) goto L_0x0076
                r4 = 1
                goto L_0x0077
            L_0x006c:
                java.lang.String r4 = "AndroidAdTagDataMode"
                boolean r4 = r2.equals(r4)
                if (r4 == 0) goto L_0x0076
                r4 = 3
                goto L_0x0077
            L_0x0076:
                r4 = -1
            L_0x0077:
                if (r4 == 0) goto L_0x0185
                r5 = 1
                if (r4 == r5) goto L_0x016e
                r5 = 2
                if (r4 == r5) goto L_0x0157
                if (r4 == r3) goto L_0x0140
                java.lang.String r3 = "killSwitch"
                boolean r3 = r3.equals(r2)
                if (r3 == 0) goto L_0x00a0
                com.google.gson.TypeAdapter<java.lang.Boolean> r2 = r0.f3931a
                if (r2 != 0) goto L_0x0097
                com.google.gson.Gson r2 = r0.f3935e
                java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter(r3)
                r0.f3931a = r2
            L_0x0097:
                java.lang.Object r2 = r2.read(r1)
                r6 = r2
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                goto L_0x001e
            L_0x00a0:
                java.lang.String r3 = "csmEnabled"
                boolean r3 = r3.equals(r2)
                if (r3 == 0) goto L_0x00bf
                com.google.gson.TypeAdapter<java.lang.Boolean> r2 = r0.f3931a
                if (r2 != 0) goto L_0x00b6
                com.google.gson.Gson r2 = r0.f3935e
                java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter(r3)
                r0.f3931a = r2
            L_0x00b6:
                java.lang.Object r2 = r2.read(r1)
                r11 = r2
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                goto L_0x001e
            L_0x00bf:
                java.lang.String r3 = "liveBiddingEnabled"
                boolean r3 = r3.equals(r2)
                if (r3 == 0) goto L_0x00de
                com.google.gson.TypeAdapter<java.lang.Boolean> r2 = r0.f3931a
                if (r2 != 0) goto L_0x00d5
                com.google.gson.Gson r2 = r0.f3935e
                java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter(r3)
                r0.f3931a = r2
            L_0x00d5:
                java.lang.Object r2 = r2.read(r1)
                r12 = r2
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                goto L_0x001e
            L_0x00de:
                java.lang.String r3 = "liveBiddingTimeBudgetInMillis"
                boolean r3 = r3.equals(r2)
                if (r3 == 0) goto L_0x00fd
                com.google.gson.TypeAdapter<java.lang.Integer> r2 = r0.f3933c
                if (r2 != 0) goto L_0x00f4
                com.google.gson.Gson r2 = r0.f3935e
                java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter(r3)
                r0.f3933c = r2
            L_0x00f4:
                java.lang.Object r2 = r2.read(r1)
                r13 = r2
                java.lang.Integer r13 = (java.lang.Integer) r13
                goto L_0x001e
            L_0x00fd:
                java.lang.String r3 = "prefetchOnInitEnabled"
                boolean r3 = r3.equals(r2)
                if (r3 == 0) goto L_0x011c
                com.google.gson.TypeAdapter<java.lang.Boolean> r2 = r0.f3931a
                if (r2 != 0) goto L_0x0113
                com.google.gson.Gson r2 = r0.f3935e
                java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter(r3)
                r0.f3931a = r2
            L_0x0113:
                java.lang.Object r2 = r2.read(r1)
                r14 = r2
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                goto L_0x001e
            L_0x011c:
                java.lang.String r3 = "remoteLogLevel"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L_0x013b
                com.google.gson.TypeAdapter<com.criteo.publisher.logging.RemoteLogRecords$RemoteLogLevel> r2 = r0.f3934d
                if (r2 != 0) goto L_0x0132
                com.google.gson.Gson r2 = r0.f3935e
                java.lang.Class<com.criteo.publisher.logging.RemoteLogRecords$RemoteLogLevel> r3 = com.criteo.publisher.logging.RemoteLogRecords.RemoteLogLevel.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter(r3)
                r0.f3934d = r2
            L_0x0132:
                java.lang.Object r2 = r2.read(r1)
                r15 = r2
                com.criteo.publisher.logging.RemoteLogRecords$RemoteLogLevel r15 = (com.criteo.publisher.logging.RemoteLogRecords.RemoteLogLevel) r15
                goto L_0x001e
            L_0x013b:
                r17.skipValue()
                goto L_0x001e
            L_0x0140:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f3932b
                if (r2 != 0) goto L_0x014e
                com.google.gson.Gson r2 = r0.f3935e
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter(r3)
                r0.f3932b = r2
            L_0x014e:
                java.lang.Object r2 = r2.read(r1)
                java.lang.String r2 = (java.lang.String) r2
                r10 = r2
                goto L_0x001e
            L_0x0157:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f3932b
                if (r2 != 0) goto L_0x0165
                com.google.gson.Gson r2 = r0.f3935e
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter(r3)
                r0.f3932b = r2
            L_0x0165:
                java.lang.Object r2 = r2.read(r1)
                java.lang.String r2 = (java.lang.String) r2
                r9 = r2
                goto L_0x001e
            L_0x016e:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f3932b
                if (r2 != 0) goto L_0x017c
                com.google.gson.Gson r2 = r0.f3935e
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter(r3)
                r0.f3932b = r2
            L_0x017c:
                java.lang.Object r2 = r2.read(r1)
                java.lang.String r2 = (java.lang.String) r2
                r8 = r2
                goto L_0x001e
            L_0x0185:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f3932b
                if (r2 != 0) goto L_0x0193
                com.google.gson.Gson r2 = r0.f3935e
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter(r3)
                r0.f3932b = r2
            L_0x0193:
                java.lang.Object r2 = r2.read(r1)
                java.lang.String r2 = (java.lang.String) r2
                r7 = r2
                goto L_0x001e
            L_0x019c:
                r17.endObject()
                com.criteo.publisher.model.l r1 = new com.criteo.publisher.model.l
                r5 = r1
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.model.C1263l.C1264a.read(com.google.gson.stream.JsonReader):com.criteo.publisher.model.y");
        }

        public String toString() {
            return "TypeAdapter(" + "RemoteConfigResponse" + ")";
        }
    }
}
