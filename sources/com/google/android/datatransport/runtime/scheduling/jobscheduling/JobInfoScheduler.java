package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public class JobInfoScheduler implements WorkScheduler {
    private final SchedulerConfig config;
    private final Context context;
    private final EventStore eventStore;

    public JobInfoScheduler(Context context2, EventStore eventStore2, SchedulerConfig schedulerConfig) {
        this.context = context2;
        this.eventStore = eventStore2;
        this.config = schedulerConfig;
    }

    /* access modifiers changed from: package-private */
    public int getJobId(TransportContext transportContext) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(transportContext.getBackendName().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(PriorityMapping.toInt(transportContext.getPriority())).array());
        if (transportContext.getExtras() != null) {
            adler32.update(transportContext.getExtras());
        }
        return (int) adler32.getValue();
    }

    private boolean isJobServiceOn(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                if (i3 >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public void schedule(TransportContext transportContext, int i) {
        ComponentName componentName = new ComponentName(this.context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.context.getSystemService("jobscheduler");
        int jobId = getJobId(transportContext);
        if (isJobServiceOn(jobScheduler, jobId, i)) {
            Logging.m6662d("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", (Object) transportContext);
            return;
        }
        long nextCallTime = this.eventStore.getNextCallTime(transportContext);
        JobInfo.Builder configureJob = this.config.configureJob(new JobInfo.Builder(jobId, componentName), transportContext.getPriority(), nextCallTime, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", transportContext.getBackendName());
        persistableBundle.putInt("priority", PriorityMapping.toInt(transportContext.getPriority()));
        if (transportContext.getExtras() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(transportContext.getExtras(), 0));
        }
        configureJob.setExtras(persistableBundle);
        Logging.m6663d("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", transportContext, Integer.valueOf(jobId), Long.valueOf(this.config.getScheduleDelay(transportContext.getPriority(), nextCallTime, i)), Long.valueOf(nextCallTime), Integer.valueOf(i));
        jobScheduler.schedule(configureJob.build());
    }
}
