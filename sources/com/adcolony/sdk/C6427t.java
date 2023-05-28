package com.adcolony.sdk;

import com.adcolony.sdk.C6288e0;
import com.adcolony.sdk.C6422s;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.t */
class C6427t implements C6422s.C6423a {

    /* renamed from: a */
    private LinkedBlockingQueue<Runnable> f13812a = new LinkedBlockingQueue<>();

    /* renamed from: b */
    private int f13813b = 4;

    /* renamed from: c */
    private int f13814c = 16;

    /* renamed from: d */
    private double f13815d = 1.0d;

    /* renamed from: e */
    private ThreadPoolExecutor f13816e = new ThreadPoolExecutor(this.f13813b, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, this.f13812a);

    /* renamed from: com.adcolony.sdk.t$a */
    class C6428a implements C6327j0 {
        C6428a() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6427t tVar = C6427t.this;
            tVar.mo51002a(new C6422s(h0Var, tVar));
        }
    }

    /* renamed from: com.adcolony.sdk.t$b */
    class C6429b implements C6327j0 {
        C6429b() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6427t tVar = C6427t.this;
            tVar.mo51002a(new C6422s(h0Var, tVar));
        }
    }

    /* renamed from: com.adcolony.sdk.t$c */
    class C6430c implements C6327j0 {
        C6430c() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6427t tVar = C6427t.this;
            tVar.mo51002a(new C6422s(h0Var, tVar));
        }
    }

    C6427t() {
    }

    /* renamed from: b */
    private void m15717b() {
        int corePoolSize = this.f13816e.getCorePoolSize();
        int size = this.f13812a.size();
        int i = this.f13813b;
        if (((double) size) * this.f13815d > ((double) ((corePoolSize - i) + 1)) && corePoolSize < this.f13814c) {
            this.f13816e.setCorePoolSize(corePoolSize + 1);
        } else if (size == 0 && corePoolSize > i) {
            this.f13816e.setCorePoolSize(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50999a() {
        this.f13816e.allowCoreThreadTimeOut(true);
        C6185a.m14886a("WebServices.download", (C6327j0) new C6428a());
        C6185a.m14886a("WebServices.get", (C6327j0) new C6429b());
        C6185a.m14886a("WebServices.post", (C6327j0) new C6430c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo51004c(int i) {
        this.f13816e.setKeepAliveTime((long) i, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo51003b(int i) {
        this.f13814c = i;
        int corePoolSize = this.f13816e.getCorePoolSize();
        int i2 = this.f13814c;
        if (corePoolSize > i2) {
            this.f13816e.setCorePoolSize(i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51002a(C6422s sVar) {
        m15717b();
        try {
            this.f13816e.execute(sVar);
        } catch (RejectedExecutionException unused) {
            C6288e0.C6289a a = new C6288e0.C6289a().mo50644a("RejectedExecutionException: ThreadPoolExecutor unable to ");
            a.mo50644a("execute download for url " + sVar.f13799l).mo50645a(C6288e0.f13498i);
            mo50823a(sVar, sVar.mo50984b(), (Map<String, List<String>>) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51001a(int i) {
        this.f13813b = i;
        int corePoolSize = this.f13816e.getCorePoolSize();
        int i2 = this.f13813b;
        if (corePoolSize < i2) {
            this.f13816e.setCorePoolSize(i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51000a(double d) {
        this.f13815d = d;
    }

    /* renamed from: a */
    public void mo50823a(C6422s sVar, C6312h0 h0Var, Map<String, List<String>> map) {
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15070a(b, "url", sVar.f13799l);
        C6235c0.m15079b(b, "success", sVar.f13801n);
        C6235c0.m15077b(b, "status", sVar.f13803p);
        C6235c0.m15070a(b, "body", sVar.f13800m);
        C6235c0.m15077b(b, "size", sVar.f13802o);
        if (map != null) {
            C6294f1 b2 = C6235c0.m15073b();
            for (Map.Entry next : map.entrySet()) {
                String obj = ((List) next.getValue()).toString();
                String substring = obj.substring(1, obj.length() - 1);
                if (next.getKey() != null) {
                    C6235c0.m15070a(b2, (String) next.getKey(), substring);
                }
            }
            C6235c0.m15069a(b, "headers", b2);
        }
        h0Var.mo50733a(b).mo50736c();
    }
}
