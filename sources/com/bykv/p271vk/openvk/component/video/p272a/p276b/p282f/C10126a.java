package com.bykv.p271vk.openvk.component.video.p272a.p276b.p282f;

import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.api.C10184b;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10202c;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10102d;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10121f;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p277a.C10079c;
import com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a;
import com.bytedance.sdk.component.utils.C10638l;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.f.a */
/* compiled from: VideoCachePreloader */
public class C10126a {

    /* renamed from: a */
    public static final boolean f25017a = C10202c.m29292b();

    /* renamed from: b */
    private HashMap<String, Boolean> f25018b;

    /* renamed from: c */
    private C10128a f25019c;

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.f.a$b */
    /* compiled from: VideoCachePreloader */
    private static class C10130b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C10126a f25032a = new C10126a();
    }

    private C10126a() {
        this.f25018b = new HashMap<>();
        mo62770b();
    }

    /* renamed from: a */
    public static C10126a m28843a() {
        return C10130b.f25032a;
    }

    /* renamed from: b */
    public boolean mo62770b() {
        if (this.f25019c != null) {
            return true;
        }
        C10079c c = m28844c();
        if (c == null) {
            return false;
        }
        C10112e.m28785a(true);
        C10112e.m28787b(true);
        C10112e.m28783a(1);
        C10121f.m28816a().mo62761d();
        try {
            C10128a aVar = new C10128a();
            this.f25019c = aVar;
            aVar.setName("tt_pangle_thread_video_cache_preloader");
            this.f25019c.start();
            C10112e.m28784a(c, C10184b.m29123a());
            C10102d.m28766c().mo62723a(30000, 30000, 30000);
            C10102d.m28766c().mo62722a(10485759);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo62768a(C10188c cVar) {
        if (!mo62770b()) {
            return false;
        }
        this.f25019c.mo62771a(cVar);
        return true;
    }

    /* renamed from: b */
    public String mo62769b(C10188c cVar) {
        if (cVar == null) {
            return null;
        }
        boolean z = !TextUtils.isEmpty(cVar.mo62962k());
        return C10121f.m28816a().mo62755a(false, z, z ? cVar.mo62962k() : cVar.mo62961j(), cVar.mo62961j());
    }

    /* renamed from: c */
    private static C10079c m28844c() {
        File file = new File(C10184b.m29123a().getCacheDir(), "proxy_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        C10079c cVar = null;
        try {
            C10079c cVar2 = new C10079c(file);
            try {
                cVar2.mo62683a(104857600);
                return cVar2;
            } catch (IOException e) {
                e = e;
                cVar = cVar2;
            }
        } catch (IOException e2) {
            e = e2;
            e.printStackTrace();
            return cVar;
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.f.a$a */
    /* compiled from: VideoCachePreloader */
    class C10128a extends Thread {

        /* renamed from: b */
        private Queue<C10129a> f25021b = new LinkedBlockingQueue();

        /* renamed from: c */
        private boolean f25022c = true;

        /* renamed from: d */
        private final Queue<C10129a> f25023d = new ArrayBlockingQueue(10);

        /* renamed from: e */
        private Queue<C10129a> f25024e = new LinkedBlockingQueue();

        /* renamed from: a */
        private void m28849a() {
        }

        /* renamed from: b */
        private void m28851b() {
        }

        public C10128a() {
        }

        /* renamed from: a */
        private C10129a m28848a(int i, C10188c cVar) {
            m28851b();
            C10638l.m31235b("VideoCachePreloader", "pool: " + this.f25023d.size());
            C10129a poll = this.f25023d.poll();
            if (poll == null) {
                poll = new C10129a();
            }
            poll.f25025a = i;
            poll.f25030f = cVar;
            return poll;
        }

        /* renamed from: a */
        private void m28850a(C10129a aVar) {
            m28849a();
            aVar.f25027c = null;
            aVar.f25026b = null;
            aVar.f25025a = -1;
            aVar.f25030f = null;
            this.f25023d.offer(aVar);
        }

        /* renamed from: b */
        private synchronized void m28852b(C10129a aVar) {
            m28851b();
            this.f25024e.add(aVar);
            notify();
        }

        /* renamed from: c */
        private void m28854c(C10129a aVar) {
            m28849a();
            if (aVar != null) {
                this.f25021b.offer(aVar);
                notify();
            }
        }

        public void run() {
            while (this.f25022c) {
                synchronized (this) {
                    if (!this.f25024e.isEmpty()) {
                        m28853c();
                    }
                    while (!this.f25021b.isEmpty()) {
                        C10129a poll = this.f25021b.poll();
                        if (poll != null) {
                            int i = poll.f25025a;
                            if (i != 0) {
                                if (i == 1) {
                                    C10102d.m28766c().mo62726a(poll.f25026b);
                                } else if (i == 2) {
                                    C10102d.m28766c().mo62732d();
                                } else if (i == 3) {
                                    C10102d.m28766c().mo62732d();
                                    if (C10112e.m28788c() != null) {
                                        C10112e.m28788c().mo62678a();
                                    }
                                    if (C10112e.m28786b() != null) {
                                        C10112e.m28786b().mo62682a();
                                    }
                                } else if (i == 4) {
                                    C10102d.m28766c().mo62732d();
                                    this.f25022c = false;
                                }
                            } else if (poll.f25027c != null && poll.f25027c.length > 0) {
                                ArrayList arrayList = new ArrayList();
                                for (String str : poll.f25027c) {
                                    if (C10148a.m28914a(str)) {
                                        arrayList.add(str);
                                    }
                                }
                                C10102d.m28766c().mo62729a(false, !TextUtils.isEmpty(poll.f25029e), poll.f25028d, poll.f25026b, (String[]) arrayList.toArray(new String[arrayList.size()]));
                            }
                            m28850a(poll);
                        }
                    }
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        /* renamed from: c */
        private void m28853c() {
            m28849a();
            while (true) {
                C10129a poll = this.f25024e.poll();
                if (poll != null) {
                    poll.f25026b = poll.f25030f.mo62961j();
                    poll.f25027c = new String[]{poll.f25030f.mo62961j()};
                    poll.f25028d = poll.f25030f.mo62943b();
                    poll.f25029e = poll.f25030f.mo62962k();
                    if (!TextUtils.isEmpty(poll.f25030f.mo62962k())) {
                        poll.f25026b = poll.f25030f.mo62962k();
                    }
                    poll.f25030f = null;
                    m28854c(poll);
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public void mo62771a(C10188c cVar) {
            m28852b(m28848a(0, cVar));
        }

        /* renamed from: com.bykv.vk.openvk.component.video.a.b.f.a$a$a */
        /* compiled from: VideoCachePreloader */
        private class C10129a {

            /* renamed from: a */
            public int f25025a;

            /* renamed from: b */
            public String f25026b;

            /* renamed from: c */
            public String[] f25027c;

            /* renamed from: d */
            public int f25028d;

            /* renamed from: e */
            public String f25029e;

            /* renamed from: f */
            public C10188c f25030f;

            public C10129a() {
            }
        }
    }
}
