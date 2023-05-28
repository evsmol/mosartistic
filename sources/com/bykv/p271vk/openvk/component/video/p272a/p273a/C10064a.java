package com.bykv.p271vk.openvk.component.video.p272a.p273a;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10202c;
import com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10067b;
import com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bykv.vk.openvk.component.video.a.a.a */
/* compiled from: SdkMediaDataSource */
public class C10064a extends MediaDataSource {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, C10064a> f24840a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private C10067b f24841b = null;

    /* renamed from: c */
    private long f24842c = -2147483648L;

    /* renamed from: d */
    private Context f24843d;

    /* renamed from: e */
    private final C10188c f24844e;

    public C10064a(Context context, C10188c cVar) {
        this.f24843d = context;
        this.f24844e = cVar;
    }

    public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        m28639b();
        int a = this.f24841b.mo62653a(j, bArr, i, i2);
        C10202c.m29289b("SdkMediaDataSource", "readAt: position = " + j + "  buffer.length =" + bArr.length + "  offset = " + i + " size =" + a + "  current = " + Thread.currentThread());
        return a;
    }

    /* renamed from: b */
    private void m28639b() {
        if (this.f24841b == null) {
            this.f24841b = new C10068c(this.f24843d, this.f24844e);
        }
    }

    public long getSize() throws IOException {
        m28639b();
        if (this.f24842c == -2147483648L) {
            if (this.f24843d == null || TextUtils.isEmpty(this.f24844e.mo62961j())) {
                return -1;
            }
            this.f24842c = this.f24841b.mo62655b();
            C10202c.m29289b("SdkMediaDataSource", "getSize: " + this.f24842c);
        }
        return this.f24842c;
    }

    public void close() throws IOException {
        C10202c.m29291b("SdkMediaDataSource", "close: ", this.f24844e.mo62961j());
        C10067b bVar = this.f24841b;
        if (bVar != null) {
            bVar.mo62654a();
        }
        f24840a.remove(this.f24844e.mo62962k());
    }

    /* renamed from: a */
    public C10188c mo62641a() {
        return this.f24844e;
    }

    /* renamed from: a */
    public static C10064a m28638a(Context context, C10188c cVar) {
        C10064a aVar = new C10064a(context, cVar);
        f24840a.put(cVar.mo62962k(), aVar);
        return aVar;
    }
}
