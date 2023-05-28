package com.bykv.p271vk.openvk.component.video.p272a.p276b;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.c */
/* compiled from: IncrementalTimeout */
public class C10097c {

    /* renamed from: a */
    private final long f24945a;

    /* renamed from: b */
    private final long f24946b;

    /* renamed from: c */
    private final long f24947c;

    /* renamed from: a */
    public long mo62720a(int i) {
        if (i <= 0) {
            return this.f24945a;
        }
        return Math.min(this.f24945a + (this.f24946b * ((long) i)), this.f24947c);
    }
}
