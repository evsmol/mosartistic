package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzfm extends FutureTask implements Comparable {
    final boolean zza;
    final /* synthetic */ zzfo zzb;
    private final long zzc;
    private final String zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfm(zzfo zzfo, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.zzb = zzfo;
        Preconditions.checkNotNull(str);
        long andIncrement = zzfo.zza.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzfo.zzt.zzay().zzd().zza("Tasks index overflow");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzfm zzfm = (zzfm) obj;
        boolean z = this.zza;
        if (z != zzfm.zza) {
            return !z ? 1 : -1;
        }
        int i = (this.zzc > zzfm.zzc ? 1 : (this.zzc == zzfm.zzc ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        this.zzb.zzt.zzay().zzh().zzb("Two tasks share the same index. index", Long.valueOf(this.zzc));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzt.zzay().zzd().zzb(this.zzd, th);
        if ((th instanceof zzfk) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfm(zzfo zzfo, Callable callable, boolean z, String str) {
        super(callable);
        this.zzb = zzfo;
        Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = zzfo.zza.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzfo.zzt.zzay().zzd().zza("Tasks index overflow");
        }
    }
}
