package com.criteo.publisher.logging;

import com.applovin.sdk.AppLovinEventTypes;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\b\u0018\u0000:\u0003\u001d\u001e\u001fB\u001d\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0002\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u00020\u00018\u0016@\u0017X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0003R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016@\u0017X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u0007¨\u0006 "}, mo38199d2 = {"Lcom/criteo/publisher/logging/RemoteLogRecords;", "Lcom/criteo/publisher/logging/RemoteLogRecords$RemoteLogContext;", "component1", "()Lcom/criteo/publisher/logging/RemoteLogRecords$RemoteLogContext;", "", "Lcom/criteo/publisher/logging/RemoteLogRecords$RemoteLogRecord;", "component2", "()Ljava/util/List;", "context", "logRecords", "copy", "(Lcom/criteo/publisher/logging/RemoteLogRecords$RemoteLogContext;Ljava/util/List;)Lcom/criteo/publisher/logging/RemoteLogRecords;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/criteo/publisher/logging/RemoteLogRecords$RemoteLogContext;", "getContext", "Ljava/util/List;", "getLogRecords", "<init>", "(Lcom/criteo/publisher/logging/RemoteLogRecords$RemoteLogContext;Ljava/util/List;)V", "RemoteLogContext", "RemoteLogLevel", "RemoteLogRecord", "publisher-sdk_release"}, mo38200k = 1, mo38201mv = {1, 1, 15}, mo38202pn = "", mo38203xi = 0, mo38204xs = "")
/* compiled from: RemoteLogRecords.kt */
public class RemoteLogRecords {
    @SerializedName("context")

    /* renamed from: a */
    private final C1184a f3730a;
    @SerializedName("errors")

    /* renamed from: b */
    private final List<C1185b> f3731b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteLogRecords)) {
            return false;
        }
        RemoteLogRecords remoteLogRecords = (RemoteLogRecords) obj;
        return Intrinsics.areEqual((Object) mo3303a(), (Object) remoteLogRecords.mo3303a()) && Intrinsics.areEqual((Object) mo3304b(), (Object) remoteLogRecords.mo3304b());
    }

    public int hashCode() {
        C1184a a = mo3303a();
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        List<C1185b> b = mo3304b();
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "RemoteLogRecords(context=" + mo3303a() + ", logRecords=" + mo3304b() + ")";
    }

    public RemoteLogRecords(C1184a aVar, List<C1185b> list) {
        Intrinsics.checkParameterIsNotNull(aVar, "context");
        Intrinsics.checkParameterIsNotNull(list, "logRecords");
        this.f3730a = aVar;
        this.f3731b = list;
    }

    /* renamed from: a */
    public C1184a mo3303a() {
        return this.f3730a;
    }

    /* renamed from: b */
    public List<C1185b> mo3304b() {
        return this.f3731b;
    }

    /* renamed from: com.criteo.publisher.logging.RemoteLogRecords$b */
    /* compiled from: RemoteLogRecords.kt */
    public static final class C1185b {
        @SerializedName("errorType")

        /* renamed from: a */
        private final RemoteLogLevel f3740a;
        @SerializedName("messages")

        /* renamed from: b */
        private final List<String> f3741b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1185b)) {
                return false;
            }
            C1185b bVar = (C1185b) obj;
            return Intrinsics.areEqual((Object) this.f3740a, (Object) bVar.f3740a) && Intrinsics.areEqual((Object) this.f3741b, (Object) bVar.f3741b);
        }

        public int hashCode() {
            RemoteLogLevel remoteLogLevel = this.f3740a;
            int i = 0;
            int hashCode = (remoteLogLevel != null ? remoteLogLevel.hashCode() : 0) * 31;
            List<String> list = this.f3741b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "RemoteLogRecord(level=" + this.f3740a + ", messages=" + this.f3741b + ")";
        }

        public C1185b(RemoteLogLevel remoteLogLevel, List<String> list) {
            Intrinsics.checkParameterIsNotNull(remoteLogLevel, AppLovinEventTypes.USER_COMPLETED_LEVEL);
            Intrinsics.checkParameterIsNotNull(list, "messages");
            this.f3740a = remoteLogLevel;
            this.f3741b = list;
        }
    }

    /* renamed from: com.criteo.publisher.logging.RemoteLogRecords$a */
    /* compiled from: RemoteLogRecords.kt */
    public static class C1184a {
        @SerializedName("version")

        /* renamed from: a */
        private final String f3732a;
        @SerializedName("bundleId")

        /* renamed from: b */
        private final String f3733b;
        @SerializedName("deviceId")

        /* renamed from: c */
        private String f3734c;
        @SerializedName("sessionId")

        /* renamed from: d */
        private final String f3735d;
        @SerializedName("profileId")

        /* renamed from: e */
        private final int f3736e;
        @SerializedName("exception")

        /* renamed from: f */
        private final String f3737f;
        @SerializedName("logId")

        /* renamed from: g */
        private final String f3738g;
        @SerializedName("deviceOs")

        /* renamed from: h */
        private final String f3739h;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1184a)) {
                return false;
            }
            C1184a aVar = (C1184a) obj;
            return Intrinsics.areEqual((Object) mo3318h(), (Object) aVar.mo3318h()) && Intrinsics.areEqual((Object) mo3309a(), (Object) aVar.mo3309a()) && Intrinsics.areEqual((Object) mo3311b(), (Object) aVar.mo3311b()) && Intrinsics.areEqual((Object) mo3317g(), (Object) aVar.mo3317g()) && mo3316f() == aVar.mo3316f() && Intrinsics.areEqual((Object) mo3313d(), (Object) aVar.mo3313d()) && Intrinsics.areEqual((Object) mo3314e(), (Object) aVar.mo3314e()) && Intrinsics.areEqual((Object) mo3312c(), (Object) aVar.mo3312c());
        }

        public int hashCode() {
            String h = mo3318h();
            int i = 0;
            int hashCode = (h != null ? h.hashCode() : 0) * 31;
            String a = mo3309a();
            int hashCode2 = (hashCode + (a != null ? a.hashCode() : 0)) * 31;
            String b = mo3311b();
            int hashCode3 = (hashCode2 + (b != null ? b.hashCode() : 0)) * 31;
            String g = mo3317g();
            int hashCode4 = (((hashCode3 + (g != null ? g.hashCode() : 0)) * 31) + mo3316f()) * 31;
            String d = mo3313d();
            int hashCode5 = (hashCode4 + (d != null ? d.hashCode() : 0)) * 31;
            String e = mo3314e();
            int hashCode6 = (hashCode5 + (e != null ? e.hashCode() : 0)) * 31;
            String c = mo3312c();
            if (c != null) {
                i = c.hashCode();
            }
            return hashCode6 + i;
        }

        public String toString() {
            return "RemoteLogContext(version=" + mo3318h() + ", bundleId=" + mo3309a() + ", deviceId=" + mo3311b() + ", sessionId=" + mo3317g() + ", profileId=" + mo3316f() + ", exceptionType=" + mo3313d() + ", logId=" + mo3314e() + ", deviceOs=" + mo3312c() + ")";
        }

        public C1184a(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7) {
            Intrinsics.checkParameterIsNotNull(str, "version");
            Intrinsics.checkParameterIsNotNull(str2, "bundleId");
            Intrinsics.checkParameterIsNotNull(str4, "sessionId");
            this.f3732a = str;
            this.f3733b = str2;
            this.f3734c = str3;
            this.f3735d = str4;
            this.f3736e = i;
            this.f3737f = str5;
            this.f3738g = str6;
            this.f3739h = str7;
        }

        /* renamed from: h */
        public String mo3318h() {
            return this.f3732a;
        }

        /* renamed from: a */
        public String mo3309a() {
            return this.f3733b;
        }

        /* renamed from: a */
        public void mo3310a(String str) {
            this.f3734c = str;
        }

        /* renamed from: b */
        public String mo3311b() {
            return this.f3734c;
        }

        /* renamed from: g */
        public String mo3317g() {
            return this.f3735d;
        }

        /* renamed from: f */
        public int mo3316f() {
            return this.f3736e;
        }

        /* renamed from: d */
        public String mo3313d() {
            return this.f3737f;
        }

        /* renamed from: e */
        public String mo3314e() {
            return this.f3738g;
        }

        /* renamed from: c */
        public String mo3312c() {
            return this.f3739h;
        }
    }

    @Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, mo38199d2 = {"Lcom/criteo/publisher/logging/RemoteLogRecords$RemoteLogLevel;", "Ljava/lang/Enum;", "<init>", "(Ljava/lang/String;I)V", "Companion", "DEBUG", "INFO", "WARNING", "ERROR", "NONE", "publisher-sdk_release"}, mo38200k = 1, mo38201mv = {1, 1, 15}, mo38202pn = "", mo38203xi = 0, mo38204xs = "")
    /* compiled from: RemoteLogRecords.kt */
    public enum RemoteLogLevel {
        DEBUG,
        INFO,
        WARNING,
        ERROR,
        NONE;
        
        public static final C1183a Companion = null;

        static {
            Companion = new C1183a((DefaultConstructorMarker) null);
        }

        /* renamed from: com.criteo.publisher.logging.RemoteLogRecords$RemoteLogLevel$a */
        /* compiled from: RemoteLogRecords.kt */
        public static final class C1183a {
            private C1183a() {
            }

            public /* synthetic */ C1183a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final RemoteLogLevel mo3308a(int i) {
                if (i == 3) {
                    return RemoteLogLevel.DEBUG;
                }
                if (i == 4) {
                    return RemoteLogLevel.INFO;
                }
                if (i == 5) {
                    return RemoteLogLevel.WARNING;
                }
                if (i != 6) {
                    return null;
                }
                return RemoteLogLevel.ERROR;
            }
        }
    }
}
