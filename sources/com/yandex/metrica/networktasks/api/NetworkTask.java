package com.yandex.metrica.networktasks.api;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

public class NetworkTask {

    /* renamed from: a */
    private C3759d f9671a = C3759d.EMPTY;

    /* renamed from: b */
    private final Executor f9672b;

    /* renamed from: c */
    private final IExecutionPolicy f9673c;

    /* renamed from: d */
    private final ExponentialBackoffPolicy f9674d;

    /* renamed from: e */
    private final UnderlyingNetworkTask f9675e;

    /* renamed from: f */
    private final List f9676f;

    /* renamed from: g */
    private final String f9677g;

    public enum Method {
        GET,
        POST
    }

    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i);
    }

    public NetworkTask(Executor executor, IExecutionPolicy iExecutionPolicy, ExponentialBackoffPolicy exponentialBackoffPolicy, UnderlyingNetworkTask underlyingNetworkTask, List list, String str) {
        this.f9672b = executor;
        this.f9673c = iExecutionPolicy;
        this.f9674d = exponentialBackoffPolicy;
        this.f9675e = underlyingNetworkTask;
        this.f9676f = list;
        this.f9677g = str;
    }

    /* renamed from: a */
    private synchronized boolean m11156a(C3759d dVar) {
        if (!m11157a(dVar)) {
            return false;
        }
        this.f9671a = dVar;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r5 = java.lang.Boolean.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0065, code lost:
        r5 = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0074, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0076, code lost:
        r5 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x007e, code lost:
        if (java.lang.Boolean.TRUE.equals(r5) != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0080, code lost:
        r0 = r5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m11157a(com.yandex.metrica.networktasks.api.C3759d... r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0090 }
            com.yandex.metrica.networktasks.api.d r1 = r7.f9671a     // Catch:{ all -> 0x0090 }
            int r2 = r8.length     // Catch:{ all -> 0x0090 }
            r3 = 0
            r4 = 0
        L_0x0008:
            if (r4 >= r2) goto L_0x0085
            r5 = r8[r4]     // Catch:{ all -> 0x0090 }
            int r5 = r5.ordinal()     // Catch:{ all -> 0x0090 }
            r6 = 1
            switch(r5) {
                case 0: goto L_0x0074;
                case 1: goto L_0x006d;
                case 2: goto L_0x0061;
                case 3: goto L_0x004f;
                case 4: goto L_0x0045;
                case 5: goto L_0x0045;
                case 6: goto L_0x0061;
                case 7: goto L_0x0027;
                case 8: goto L_0x0016;
                default: goto L_0x0014;
            }     // Catch:{ all -> 0x0090 }
        L_0x0014:
            goto L_0x0076
        L_0x0016:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.C3759d.EMPTY     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x001c
            goto L_0x0074
        L_0x001c:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.C3759d.REMOVED     // Catch:{ all -> 0x0090 }
            if (r1 == r5) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r6 = 0
        L_0x0022:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0090 }
            goto L_0x0078
        L_0x0027:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.C3759d.SUCCESS     // Catch:{ all -> 0x0090 }
            if (r1 == r5) goto L_0x0065
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.C3759d.FAILED     // Catch:{ all -> 0x0090 }
            if (r1 == r5) goto L_0x0065
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.C3759d.SHOULD_NOT_EXECUTE     // Catch:{ all -> 0x0090 }
            if (r1 == r5) goto L_0x0065
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.C3759d.PENDING     // Catch:{ all -> 0x0090 }
            if (r1 == r5) goto L_0x0065
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.C3759d.PREPARING     // Catch:{ all -> 0x0090 }
            if (r1 == r5) goto L_0x0065
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.C3759d.EXECUTING     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x0040
            goto L_0x0065
        L_0x0040:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.C3759d.REMOVED     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x0074
            goto L_0x0076
        L_0x0045:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.C3759d.EXECUTING     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x004a
            goto L_0x0065
        L_0x004a:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.C3759d.REMOVED     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x0074
            goto L_0x0076
        L_0x004f:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.C3759d.PREPARING     // Catch:{ all -> 0x0090 }
            if (r1 == r5) goto L_0x0065
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.C3759d.SUCCESS     // Catch:{ all -> 0x0090 }
            if (r1 == r5) goto L_0x0065
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.C3759d.FAILED     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x005c
            goto L_0x0065
        L_0x005c:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.C3759d.REMOVED     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x0074
            goto L_0x0076
        L_0x0061:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.C3759d.PENDING     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x0068
        L_0x0065:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0090 }
            goto L_0x0078
        L_0x0068:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.C3759d.REMOVED     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x0074
            goto L_0x0076
        L_0x006d:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.C3759d.EMPTY     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x0072
            goto L_0x0022
        L_0x0072:
            r6 = 0
            goto L_0x0022
        L_0x0074:
            r5 = 0
            goto L_0x0078
        L_0x0076:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0090 }
        L_0x0078:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0090 }
            boolean r6 = r6.equals(r5)     // Catch:{ all -> 0x0090 }
            if (r6 != 0) goto L_0x0082
            r0 = r5
            goto L_0x0085
        L_0x0082:
            int r4 = r4 + 1
            goto L_0x0008
        L_0x0085:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0090 }
            r8.equals(r0)     // Catch:{ all -> 0x0090 }
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x0090 }
            monitor-exit(r7)
            return r8
        L_0x0090:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.networktasks.api.NetworkTask.m11157a(com.yandex.metrica.networktasks.api.d[]):boolean");
    }

    public String description() {
        return this.f9675e.description();
    }

    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f9673c;
    }

    public Executor getExecutor() {
        return this.f9672b;
    }

    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f9674d;
    }

    public RequestDataHolder getRequestDataHolder() {
        return this.f9675e.getRequestDataHolder();
    }

    public ResponseDataHolder getResponseDataHolder() {
        return this.f9675e.getResponseDataHolder();
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f9675e.getRetryPolicyConfig();
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f9675e.getSslSocketFactory();
    }

    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.f9675e;
    }

    public String getUrl() {
        return this.f9675e.getFullUrlFormer().getUrl();
    }

    public String getUserAgent() {
        return this.f9677g;
    }

    public boolean onCreateNetworkTask() {
        if (m11156a(C3759d.PREPARING)) {
            return this.f9675e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean a = m11156a(C3759d.EXECUTING);
        if (a) {
            this.f9675e.getFullUrlFormer().incrementAttemptNumber();
            this.f9675e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f9675e.onPerformRequest();
        }
        return a;
    }

    public boolean onRequestComplete() {
        boolean z;
        boolean z2;
        synchronized (this) {
            C3759d dVar = C3759d.SUCCESS;
            z = false;
            C3759d dVar2 = C3759d.FAILED;
            if (m11157a(dVar, dVar2)) {
                boolean onRequestComplete = this.f9675e.onRequestComplete();
                if (onRequestComplete) {
                    this.f9671a = dVar;
                } else {
                    this.f9671a = dVar2;
                }
                z2 = onRequestComplete;
                z = true;
            } else {
                z2 = false;
            }
        }
        if (z) {
            this.f9675e.onPostRequestComplete(z2);
        }
        return z2;
    }

    public void onRequestError(Throwable th) {
        if (m11156a(C3759d.FAILED)) {
            this.f9675e.onRequestError(th);
        }
    }

    public void onShouldNotExecute() {
        if (m11156a(C3759d.SHOULD_NOT_EXECUTE)) {
            this.f9675e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean a = m11156a(C3759d.PENDING);
        if (a) {
            this.f9675e.onTaskAdded();
        }
        return a;
    }

    public void onTaskFinished() {
        C3759d dVar;
        boolean a;
        synchronized (this) {
            dVar = this.f9671a;
            a = m11156a(C3759d.FINISHED);
        }
        if (a) {
            this.f9675e.onTaskFinished();
            if (dVar == C3759d.SUCCESS) {
                this.f9675e.onSuccessfulTaskFinished();
            } else if (dVar == C3759d.FAILED || dVar == C3759d.SHOULD_NOT_EXECUTE) {
                this.f9675e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public void onTaskRemoved() {
        if (m11156a(C3759d.REMOVED)) {
            this.f9675e.onTaskRemoved();
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean z;
        boolean z2;
        boolean hasMoreHosts = this.f9675e.getFullUrlFormer().hasMoreHosts();
        int responseCode = this.f9675e.getResponseDataHolder().getResponseCode();
        Iterator it = this.f9676f.iterator();
        while (true) {
            z = false;
            if (it.hasNext()) {
                if (!((ShouldTryNextHostCondition) it.next()).shouldTryNextHost(responseCode)) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        C3759d dVar = this.f9671a;
        if (dVar != C3759d.REMOVED && dVar != C3759d.FINISHED && hasMoreHosts && z2) {
            z = true;
        }
        return z;
    }
}
