package com.appodeal.ads.modules.common.internal.log;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {}, mo38198d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJR\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010&R$\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\n\"\u0004\b*\u0010+¨\u0006."}, mo38199d2 = {"Lcom/appodeal/ads/modules/common/internal/log/InternalLogEvent;", "", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "()Ljava/lang/Long;", "key", "event", "message", "logLevel", "sessionUuid", "sessionUptimeMono", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/appodeal/ads/modules/common/internal/log/InternalLogEvent;", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "b", "getEvent", "c", "getMessage", "d", "getLogLevel", "e", "getSessionUuid", "setSessionUuid", "(Ljava/lang/String;)V", "f", "Ljava/lang/Long;", "getSessionUptimeMono", "setSessionUptimeMono", "(Ljava/lang/Long;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "apd_internal"}, mo38200k = 1, mo38201mv = {1, 6, 0})
public final class InternalLogEvent {

    /* renamed from: a */
    public final String f23357a;

    /* renamed from: b */
    public final String f23358b;

    /* renamed from: c */
    public final String f23359c;

    /* renamed from: d */
    public final String f23360d;

    /* renamed from: e */
    public String f23361e;

    /* renamed from: f */
    public Long f23362f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InternalLogEvent(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, (String) null, (Long) null, 48, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "event");
        Intrinsics.checkNotNullParameter(str4, "logLevel");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InternalLogEvent(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, (Long) null, 32, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "event");
        Intrinsics.checkNotNullParameter(str4, "logLevel");
    }

    public InternalLogEvent(String str, String str2, String str3, String str4, String str5, Long l) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "event");
        Intrinsics.checkNotNullParameter(str4, "logLevel");
        this.f23357a = str;
        this.f23358b = str2;
        this.f23359c = str3;
        this.f23360d = str4;
        this.f23361e = str5;
        this.f23362f = l;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InternalLogEvent(String str, String str2, String str3, String str4, String str5, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : l);
    }

    public static /* synthetic */ InternalLogEvent copy$default(InternalLogEvent internalLogEvent, String str, String str2, String str3, String str4, String str5, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = internalLogEvent.f23357a;
        }
        if ((i & 2) != 0) {
            str2 = internalLogEvent.f23358b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = internalLogEvent.f23359c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = internalLogEvent.f23360d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = internalLogEvent.f23361e;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            l = internalLogEvent.f23362f;
        }
        return internalLogEvent.copy(str, str6, str7, str8, str9, l);
    }

    public final String component1() {
        return this.f23357a;
    }

    public final String component2() {
        return this.f23358b;
    }

    public final String component3() {
        return this.f23359c;
    }

    public final String component4() {
        return this.f23360d;
    }

    public final String component5() {
        return this.f23361e;
    }

    public final Long component6() {
        return this.f23362f;
    }

    public final InternalLogEvent copy(String str, String str2, String str3, String str4, String str5, Long l) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "event");
        Intrinsics.checkNotNullParameter(str4, "logLevel");
        return new InternalLogEvent(str, str2, str3, str4, str5, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalLogEvent)) {
            return false;
        }
        InternalLogEvent internalLogEvent = (InternalLogEvent) obj;
        return Intrinsics.areEqual((Object) this.f23357a, (Object) internalLogEvent.f23357a) && Intrinsics.areEqual((Object) this.f23358b, (Object) internalLogEvent.f23358b) && Intrinsics.areEqual((Object) this.f23359c, (Object) internalLogEvent.f23359c) && Intrinsics.areEqual((Object) this.f23360d, (Object) internalLogEvent.f23360d) && Intrinsics.areEqual((Object) this.f23361e, (Object) internalLogEvent.f23361e) && Intrinsics.areEqual((Object) this.f23362f, (Object) internalLogEvent.f23362f);
    }

    public final String getEvent() {
        return this.f23358b;
    }

    public final String getKey() {
        return this.f23357a;
    }

    public final String getLogLevel() {
        return this.f23360d;
    }

    public final String getMessage() {
        return this.f23359c;
    }

    public final Long getSessionUptimeMono() {
        return this.f23362f;
    }

    public final String getSessionUuid() {
        return this.f23361e;
    }

    public int hashCode() {
        int hashCode = (this.f23358b.hashCode() + (this.f23357a.hashCode() * 31)) * 31;
        String str = this.f23359c;
        int i = 0;
        int hashCode2 = (this.f23360d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f23361e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f23362f;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode3 + i;
    }

    public final void setSessionUptimeMono(Long l) {
        this.f23362f = l;
    }

    public final void setSessionUuid(String str) {
        this.f23361e = str;
    }

    public String toString() {
        return "InternalLogEvent(key=" + this.f23357a + ", event=" + this.f23358b + ", message=" + this.f23359c + ", logLevel=" + this.f23360d + ", sessionUuid=" + this.f23361e + ", sessionUptimeMono=" + this.f23362f + ')';
    }
}
