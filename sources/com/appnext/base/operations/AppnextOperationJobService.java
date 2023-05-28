package com.appnext.base.operations;

import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.HashMap;
import java.util.Map;

public abstract class AppnextOperationJobService extends JobService {

    /* renamed from: ej */
    private final Map<JobParameters, AsyncJobTask> f22456ej = new HashMap();

    /* renamed from: ek */
    private AsyncJobTask f22457ek;

    public abstract int onRunJob(JobParameters jobParameters);

    public boolean onStartJob(JobParameters jobParameters) {
        this.f22457ek = new AsyncJobTask(this, jobParameters);
        synchronized (this.f22456ej) {
            this.f22456ej.put(jobParameters, this.f22457ek);
        }
        this.f22457ek.execute(new Void[0]);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        synchronized (this.f22456ej) {
            AsyncJobTask remove = this.f22456ej.remove(jobParameters);
            if (remove == null) {
                return false;
            }
            remove.cancel(true);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58767a(JobParameters jobParameters) {
        synchronized (this.f22456ej) {
            this.f22456ej.remove(jobParameters);
        }
        this.f22457ek.finishJob();
    }
}
