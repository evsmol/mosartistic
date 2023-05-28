package com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b;

import android.content.Context;
import android.os.Build;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bykv.p271vk.openvk.component.video.api.p290e.C10197a;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10202c;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bykv.vk.openvk.component.video.a.a.b.c */
/* compiled from: VideoFileManager */
public class C10073c {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, C10071b> f24876a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static synchronized void m28694a(Context context, C10188c cVar, C10197a.C10198a aVar) {
        synchronized (C10073c.class) {
            if (cVar == null) {
                C10202c.m29285a(" url、dir and hash is must property   in VideoInfoModel");
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                C10071b bVar = f24876a.get(cVar.mo62962k());
                if (bVar == null) {
                    bVar = new C10071b(context, cVar);
                    f24876a.put(cVar.mo62962k(), bVar);
                    C10202c.m29291b("VideoFileManager", "preloadVideo:  cache size = ", Integer.valueOf(cVar.mo62943b()), cVar.mo62962k());
                }
                bVar.mo62661a(aVar);
            }
            C10202c.m29291b("VideoFileManager", "preloadVideo:  cache size = ", Integer.valueOf(cVar.mo62943b()), cVar.mo62962k());
        }
    }

    /* renamed from: a */
    public static synchronized void m28695a(C10188c cVar) {
        synchronized (C10073c.class) {
            if (Build.VERSION.SDK_INT >= 23) {
                C10071b remove = f24876a.remove(cVar.mo62962k());
                if (remove != null) {
                    remove.mo62662a(true);
                }
                C10202c.m29291b("VideoFileManager", "removePreload:  cache size = ", Integer.valueOf(cVar.mo62943b()), cVar.mo62962k());
            }
        }
    }
}
