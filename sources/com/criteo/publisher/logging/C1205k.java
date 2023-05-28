package com.criteo.publisher.logging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.criteo.publisher.C1146i;
import com.criteo.publisher.C1333z;
import com.criteo.publisher.logging.RemoteLogRecords;
import com.criteo.publisher.p067i0.C1150c;
import com.criteo.publisher.p074n0.C1289b;
import com.criteo.publisher.p074n0.C1300g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.logging.k */
/* compiled from: RemoteLogRecordsFactory.kt */
public class C1205k {

    /* renamed from: a */
    private final SimpleDateFormat f3769a;

    /* renamed from: b */
    private final C1300g f3770b;

    /* renamed from: c */
    private final Context f3771c;

    /* renamed from: d */
    private final C1289b f3772d;

    /* renamed from: e */
    private final C1333z f3773e;

    /* renamed from: f */
    private final C1150c f3774f;

    /* renamed from: g */
    private final C1146i f3775g;

    /* renamed from: h */
    private final C1198i f3776h;

    public C1205k(C1300g gVar, Context context, C1289b bVar, C1333z zVar, C1150c cVar, C1146i iVar, C1198i iVar2) {
        Intrinsics.checkParameterIsNotNull(gVar, "buildConfigWrapper");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "advertisingInfo");
        Intrinsics.checkParameterIsNotNull(zVar, "session");
        Intrinsics.checkParameterIsNotNull(cVar, "integrationRegistry");
        Intrinsics.checkParameterIsNotNull(iVar, "clock");
        Intrinsics.checkParameterIsNotNull(iVar2, "publisherCodeRemover");
        this.f3770b = gVar;
        this.f3771c = context;
        this.f3772d = bVar;
        this.f3773e = zVar;
        this.f3774f = cVar;
        this.f3775g = iVar;
        this.f3776h = iVar2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.f3769a = simpleDateFormat;
    }

    /* renamed from: a */
    public RemoteLogRecords mo3349a(C1193e eVar) {
        Class<?> cls;
        Intrinsics.checkParameterIsNotNull(eVar, "logMessage");
        RemoteLogRecords.RemoteLogLevel a = RemoteLogRecords.RemoteLogLevel.Companion.mo3308a(eVar.mo3330a());
        String b = mo3352b(eVar);
        String str = null;
        if (a == null || b == null) {
            return null;
        }
        RemoteLogRecords.C1185b bVar = new RemoteLogRecords.C1185b(a, CollectionsKt.listOf(b));
        String q = this.f3770b.mo3645q();
        Intrinsics.checkExpressionValueIsNotNull(q, "buildConfigWrapper.sdkVersion");
        String packageName = this.f3771c.getPackageName();
        Intrinsics.checkExpressionValueIsNotNull(packageName, "context.packageName");
        String b2 = this.f3772d.mo3613b();
        String b3 = this.f3773e.mo3735b();
        int b4 = this.f3774f.mo3247b();
        Throwable d = eVar.mo3333d();
        if (!(d == null || (cls = d.getClass()) == null)) {
            str = cls.getSimpleName();
        }
        String b5 = eVar.mo3331b();
        return new RemoteLogRecords(new RemoteLogRecords.C1184a(q, packageName, b2, b3, b4, str, b5, "android-" + Build.VERSION.SDK_INT), CollectionsKt.listOf(bVar));
    }

    /* renamed from: b */
    public String mo3352b(C1193e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "logMessage");
        if (eVar.mo3332c() == null && eVar.mo3333d() == null) {
            return null;
        }
        String format = this.f3769a.format(new Date(this.f3775g.mo3242a()));
        String[] strArr = new String[4];
        strArr[0] = eVar.mo3332c();
        Throwable d = eVar.mo3333d();
        strArr[1] = d != null ? m5426b(d) : null;
        strArr[2] = "threadId:" + mo3350a();
        strArr[3] = format;
        List listOfNotNull = CollectionsKt.listOfNotNull((T[]) strArr);
        List list = listOfNotNull.isEmpty() ^ true ? listOfNotNull : null;
        if (list != null) {
            return CollectionsKt.joinToString$default(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        }
        return null;
    }

    /* renamed from: a */
    public String mo3350a() {
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
        String name = currentThread.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "Thread.currentThread().name");
        return name;
    }

    /* renamed from: b */
    private String m5426b(Throwable th) {
        return mo3351a(this.f3776h.mo3344c(th));
    }

    /* renamed from: a */
    public String mo3351a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        return Log.getStackTraceString(th);
    }
}
