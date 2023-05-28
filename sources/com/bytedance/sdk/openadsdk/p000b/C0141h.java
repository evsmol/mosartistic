package com.bytedance.sdk.openadsdk.p000b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.core.C0547k;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0561n;
import com.bytedance.sdk.openadsdk.p000b.C0147k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.h */
/* compiled from: AdEventThread */
public class C0141h<T extends C0147k> extends HandlerThread implements Handler.Callback {

    /* renamed from: a */
    public static String f538a = "AdEventThread";

    /* renamed from: b */
    public static String f539b = "ttad_bk";
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static long f540l = 180000;

    /* renamed from: c */
    public final C0139f<T> f541c;

    /* renamed from: d */
    public C0561n<T> f542d;

    /* renamed from: e */
    public final List<T> f543e;

    /* renamed from: f */
    public long f544f;

    /* renamed from: g */
    public boolean f545g;

    /* renamed from: h */
    public int f546h;

    /* renamed from: i */
    public Handler f547i;

    /* renamed from: j */
    public final C0143b f548j;

    /* renamed from: k */
    public final C0144c f549k;

    /* renamed from: com.bytedance.sdk.openadsdk.b.h$b */
    /* compiled from: AdEventThread */
    public interface C0143b {
        /* renamed from: a */
        boolean mo418a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo414a() {
        return true;
    }

    public C0141h(C0139f<T> fVar, C0561n<T> nVar, C0144c cVar, C0143b bVar) {
        this(f539b, f538a, fVar, nVar, cVar, bVar);
    }

    public C0141h(String str, String str2, C0139f<T> fVar, C0561n<T> nVar, C0144c cVar, C0143b bVar) {
        super(str);
        f538a = str2;
        this.f549k = cVar;
        this.f548j = bVar;
        this.f541c = fVar;
        this.f542d = nVar;
        this.f543e = Collections.synchronizedList(new LinkedList());
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        this.f544f = System.currentTimeMillis();
        this.f547i = new Handler(getLooper(), this);
        C0547k.m2621c().postDelayed(new C0142a(this.f547i), f540l);
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                m658a((C0147k) message.obj);
                return true;
            case 2:
                m676g();
                return true;
            case 3:
                m675f();
                return true;
            case 4:
                m672e();
                return true;
            case 5:
                m668c();
                return true;
            case 6:
                m670d();
                return true;
            default:
                return true;
        }
    }

    /* renamed from: c */
    private void m668c() {
        this.f541c.mo403a(this.f549k.f554d, this.f549k.f555e);
        this.f545g = this.f541c.mo408a();
        this.f546h = this.f541c.mo409b();
        if (this.f545g) {
            m659a("onHandleInitEvent serverBusy, retryCount = " + this.f546h);
            m678i();
            return;
        }
        m665b(this.f541c.mo401a(30, "_id"));
        m659a("onHandleInitEvent cacheData count = " + this.f543e.size());
        m677h();
    }

    /* renamed from: d */
    private void m670d() {
        this.f541c.mo403a(this.f549k.f554d, this.f549k.f555e);
        this.f545g = this.f541c.mo408a();
        this.f546h = this.f541c.mo409b();
        if (this.f545g) {
            m659a("onHandleInitEvent serverBusy, retryCount = " + this.f546h);
            m678i();
            return;
        }
        m665b(this.f541c.mo401a(30, "_id"));
        m671d(this.f543e);
        m659a("onHandleInitEvent cacheData count = " + this.f543e.size());
        m677h();
    }

    /* renamed from: b */
    private void m665b(List<T> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    HashSet hashSet = new HashSet();
                    for (T d : this.f543e) {
                        hashSet.add(d.mo308d());
                    }
                    for (T t : list) {
                        if (!hashSet.contains(t.mo308d())) {
                            this.f543e.add(t);
                        }
                    }
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        m659a("reloadCacheList adEventList is empty======");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0045 A[LOOP:0: B:11:0x0045->B:14:0x0060, LOOP_START] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m672e() {
        /*
            r4 = this;
            com.bytedance.sdk.openadsdk.b.h$b r0 = r4.f548j
            boolean r0 = r0.mo418a()
            if (r0 != 0) goto L_0x0016
            r0 = 4
            com.bytedance.sdk.openadsdk.b.h$c r1 = r4.f549k
            long r1 = r1.f553c
            r4.m657a((int) r0, (long) r1)
            java.lang.String r0 = "onHandleServerBusyRetryEvent, no net"
            r4.m659a((java.lang.String) r0)
            return
        L_0x0016:
            com.bytedance.sdk.openadsdk.b.f<T> r0 = r4.f541c
            r1 = 30
            java.lang.String r2 = "_id"
            java.util.List r0 = r0.mo401a((int) r1, (java.lang.String) r2)
            boolean r1 = com.bytedance.sdk.component.utils.C10633j.m31221a(r0)
            if (r1 == 0) goto L_0x0032
            java.lang.String r0 = "onHandleServerBusyRetryEvent, empty list start routine"
            r4.m659a((java.lang.String) r0)
            r4.m684o()
            r4.m680k()
            return
        L_0x0032:
            boolean r1 = r4.mo414a()
            r2 = 1
            if (r1 == 0) goto L_0x0063
            java.util.HashMap r0 = r4.m674f(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0045:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0066
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            boolean r3 = r0.hasNext()
            r3 = r3 ^ r2
            boolean r1 = r4.m663a(r1, (boolean) r3)
            if (r1 != 0) goto L_0x0045
            goto L_0x0066
        L_0x0063:
            r4.m663a(r0, (boolean) r2)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p000b.C0141h.m672e():void");
    }

    /* renamed from: a */
    private boolean m663a(List<T> list, boolean z) {
        C0145i a = mo413a(list);
        if (a == null) {
            return false;
        }
        if (a.f557a) {
            m659a("onHandleServerBusyRetryEvent, success");
            m673e(list);
            m660a(z);
            return true;
        } else if (m661a(a)) {
            int i = this.f546h + 1;
            this.f546h = i;
            this.f541c.mo402a(i);
            this.f541c.mo406a(list, this.f549k.f554d, this.f549k.f555e);
            m678i();
            m659a("onHandleServerBusyRetryEvent, serverbusy, count = " + this.f546h);
            return false;
        } else if (m666b(a) || m662a(list, a)) {
            m673e(list);
            m660a(true);
            return false;
        } else {
            m679j();
            return false;
        }
    }

    /* renamed from: c */
    private boolean m669c(List<T> list) {
        JSONObject b;
        if (list == null || list.size() == 0 || !(list.get(0) instanceof C0106a) || (b = ((C0106a) list.get(0)).mo306b()) == null) {
            return true;
        }
        return TextUtils.isEmpty(b.optString("app_log_url"));
    }

    /* renamed from: a */
    public C0145i mo413a(List<T> list) {
        if (this.f542d == null) {
            C0558m.m2671f();
        }
        C0561n<T> nVar = this.f542d;
        if (nVar == null) {
            return null;
        }
        return nVar.mo1838a(list);
    }

    /* renamed from: f */
    private void m675f() {
        if (!this.f545g) {
            m659a("onHandleRoutineRetryEvent");
            m677h();
        }
    }

    /* renamed from: g */
    private void m676g() {
        if (!this.f545g) {
            m659a("onHandleRoutineUploadEvent");
            m677h();
        }
    }

    /* renamed from: a */
    private void m658a(T t) {
        C10638l.m31235b("ReportEvent", "execute onHandleReceivedAdEvent()  start...");
        this.f541c.mo404a(t);
        if (!this.f545g) {
            m659a("onHandleReceivedAdEvent");
            this.f543e.add(t);
            m671d(this.f543e);
            C10638l.m31235b("ReportEvent", "execute onHandleReceivedAdEvent() ... mIsServerBusy =" + this.f545g);
            if (m683n()) {
                C10638l.m31235b("ReportEvent", "execute onHandleReceivedAdEvent()  needUploadRoutine ... upload ");
                m677h();
            }
        }
    }

    /* renamed from: d */
    private void m671d(List<T> list) {
        if (list != null) {
            if (list.size() <= 45) {
                m659a("start and return, checkAndDeleteEvent local size:" + list.size() + "less than:" + 45);
                return;
            }
            int size = list.size() - 30;
            m659a("start checkAndDeleteEvent local size,deleteCnt:" + list.size() + "," + size);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                arrayList.add((C0147k) list.get(i));
            }
            list.removeAll(arrayList);
            m659a("end checkAndDeleteEvent local size:" + list.size());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006b A[LOOP:0: B:11:0x006b->B:14:0x0086, LOOP_START] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m677h() {
        /*
            r4 = this;
            java.lang.String r0 = "ReportEvent"
            java.lang.String r1 = "execute doRoutineUpload ... start "
            com.bytedance.sdk.component.utils.C10638l.m31238c(r0, r1)
            android.os.Handler r1 = r4.f547i
            r2 = 3
            r1.removeMessages(r2)
            android.os.Handler r1 = r4.f547i
            r2 = 2
            r1.removeMessages(r2)
            android.os.Handler r1 = r4.f547i
            r2 = 6
            r1.removeMessages(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "execute doRoutineUpload ... ListUtils.isEmpty(mCacheList) :"
            r1.append(r2)
            java.util.List<T> r2 = r4.f543e
            boolean r2 = com.bytedance.sdk.component.utils.C10633j.m31221a(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.C10638l.m31238c(r0, r1)
            java.util.List<T> r1 = r4.f543e
            boolean r1 = com.bytedance.sdk.component.utils.C10633j.m31221a(r1)
            if (r1 == 0) goto L_0x0045
            long r0 = java.lang.System.currentTimeMillis()
            r4.f544f = r0
            r4.m680k()
            return
        L_0x0045:
            com.bytedance.sdk.openadsdk.b.h$b r1 = r4.f548j
            boolean r1 = r1.mo418a()
            if (r1 != 0) goto L_0x0056
            java.lang.String r1 = "execute doRoutineUpload ...no network, wait retry "
            com.bytedance.sdk.component.utils.C10638l.m31238c(r0, r1)
            r4.m679j()
            return
        L_0x0056:
            boolean r0 = r4.mo414a()
            r1 = 1
            if (r0 == 0) goto L_0x0089
            java.util.List<T> r0 = r4.f543e
            java.util.HashMap r0 = r4.m674f(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x006b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x008e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            boolean r3 = r0.hasNext()
            r3 = r3 ^ r1
            boolean r2 = r4.m667b(r2, r3)
            if (r2 != 0) goto L_0x006b
            goto L_0x008e
        L_0x0089:
            java.util.List<T> r0 = r4.f543e
            r4.m667b(r0, r1)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p000b.C0141h.m677h():void");
    }

    /* renamed from: b */
    private boolean m667b(List<T> list, boolean z) {
        C0145i a = mo413a(list);
        if (a == null) {
            return false;
        }
        if (a.f557a) {
            C10638l.m31238c("ReportEvent", "doRoutineUpload success");
            m673e(list);
            m660a(z);
            return true;
        } else if (m661a(a)) {
            m681l();
            return false;
        } else if (m666b(a) || m662a(list, a)) {
            m673e(list);
            m660a(true);
            return false;
        } else if (this.f545g) {
            return false;
        } else {
            m679j();
            return false;
        }
    }

    /* renamed from: a */
    private void m660a(boolean z) {
        this.f544f = System.currentTimeMillis();
        m684o();
        if (z) {
            m680k();
        }
    }

    /* renamed from: e */
    private void m673e(List<T> list) {
        this.f541c.mo405a(list);
        this.f543e.removeAll(list);
    }

    /* renamed from: i */
    private void m678i() {
        m657a(4, m682m());
    }

    /* renamed from: j */
    private void m679j() {
        m657a(3, this.f549k.f553c);
    }

    /* renamed from: k */
    private void m680k() {
        m657a(2, this.f549k.f552b);
    }

    /* renamed from: a */
    private void m657a(int i, long j) {
        Message obtainMessage = this.f547i.obtainMessage();
        obtainMessage.what = i;
        this.f547i.sendMessageDelayed(obtainMessage, j);
    }

    /* renamed from: l */
    private void m681l() {
        this.f545g = true;
        this.f541c.mo407a(true);
        this.f543e.clear();
        this.f547i.removeMessages(3);
        this.f547i.removeMessages(2);
        m678i();
    }

    /* renamed from: m */
    private long m682m() {
        return ((long) ((this.f546h % 3) + 1)) * this.f549k.f556f;
    }

    /* renamed from: a */
    private static boolean m661a(C0145i iVar) {
        return iVar.f558b == 509;
    }

    /* renamed from: a */
    private boolean m662a(List<T> list, C0145i iVar) {
        if (!m669c(list) && iVar.f558b >= 400 && iVar.f558b < 500) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m666b(C0145i iVar) {
        return iVar.f560d;
    }

    /* renamed from: n */
    private boolean m683n() {
        return !this.f545g && (this.f543e.size() >= this.f549k.f551a || System.currentTimeMillis() - this.f544f >= this.f549k.f552b);
    }

    /* renamed from: o */
    private void m684o() {
        this.f545g = false;
        this.f541c.mo407a(false);
        this.f546h = 0;
        this.f541c.mo402a(0);
        this.f547i.removeMessages(4);
    }

    /* renamed from: a */
    private void m659a(String str) {
        C10638l.m31238c(f538a, str);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.h$c */
    /* compiled from: AdEventThread */
    public static class C0144c {

        /* renamed from: a */
        final int f551a;

        /* renamed from: b */
        final long f552b;

        /* renamed from: c */
        final long f553c;

        /* renamed from: d */
        final int f554d;

        /* renamed from: e */
        final long f555e;

        /* renamed from: f */
        final long f556f;

        C0144c(int i, long j, long j2, int i2, long j3, long j4) {
            this.f551a = i;
            this.f552b = j;
            this.f553c = j2;
            this.f554d = i2;
            this.f555e = j3;
            this.f556f = j4;
        }

        /* renamed from: a */
        public static C0144c m688a() {
            return new C0144c(1, 120000, 15000, 5, 172800000, 300000);
        }

        /* renamed from: b */
        public static C0144c m689b() {
            return new C0144c(3, 120000, 15000, 5, 172800000, 300000);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r2 = (com.bytedance.sdk.openadsdk.p000b.C0106a) r6.get(r1);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.HashMap<java.lang.String, java.util.List<T>> m674f(java.util.List<T> r6) {
        /*
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
        L_0x0006:
            int r2 = r6.size()
            if (r1 >= r2) goto L_0x003c
            java.lang.Object r2 = r6.get(r1)
            boolean r2 = r2 instanceof com.bytedance.sdk.openadsdk.p000b.C0106a
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r6.get(r1)
            com.bytedance.sdk.openadsdk.b.a r2 = (com.bytedance.sdk.openadsdk.p000b.C0106a) r2
            org.json.JSONObject r3 = r2.mo306b()
            if (r3 == 0) goto L_0x0039
            java.lang.String r4 = "app_log_url"
            java.lang.String r3 = r3.optString(r4)
            java.lang.Object r4 = r0.get(r3)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x0036
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.put(r3, r4)
        L_0x0036:
            r4.add(r2)
        L_0x0039:
            int r1 = r1 + 1
            goto L_0x0006
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p000b.C0141h.m674f(java.util.List):java.util.HashMap");
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.h$a */
    /* compiled from: AdEventThread */
    private static class C0142a implements Runnable {

        /* renamed from: a */
        WeakReference<Handler> f550a;

        public C0142a(Handler handler) {
            this.f550a = new WeakReference<>(handler);
        }

        public void run() {
            Handler handler;
            C10638l.m31238c(C0141h.f538a, "EventTimerRunnable: run");
            WeakReference<Handler> weakReference = this.f550a;
            if (weakReference != null && weakReference.get() != null && (handler = (Handler) this.f550a.get()) != null) {
                handler.removeMessages(6);
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = 6;
                handler.sendMessage(obtainMessage);
                C0547k.m2621c().postDelayed(this, C0141h.f540l);
            }
        }
    }
}
