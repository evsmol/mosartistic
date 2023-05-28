package com.bykv.p271vk.openvk.component.video.p272a.p284d;

import com.bykv.p271vk.openvk.component.video.api.p291f.C10202c;
import com.bykv.p271vk.openvk.component.video.p272a.p284d.C10153c;

/* renamed from: com.bykv.vk.openvk.component.video.a.d.a */
/* compiled from: AbstractMediaPlayer */
public abstract class C10150a implements C10153c {

    /* renamed from: a */
    protected boolean f25081a = false;

    /* renamed from: b */
    private C10153c.C10158e f25082b;

    /* renamed from: c */
    private C10153c.C10155b f25083c;

    /* renamed from: d */
    private C10153c.C10154a f25084d;

    /* renamed from: e */
    private C10153c.C10159f f25085e;

    /* renamed from: f */
    private C10153c.C10160g f25086f;

    /* renamed from: g */
    private C10153c.C10156c f25087g;

    /* renamed from: h */
    private C10153c.C10157d f25088h;

    /* renamed from: a */
    public final void mo62806a(C10153c.C10158e eVar) {
        this.f25082b = eVar;
    }

    /* renamed from: a */
    public final void mo62803a(C10153c.C10155b bVar) {
        this.f25083c = bVar;
    }

    /* renamed from: a */
    public final void mo62802a(C10153c.C10154a aVar) {
        this.f25084d = aVar;
    }

    /* renamed from: a */
    public final void mo62807a(C10153c.C10159f fVar) {
        this.f25085e = fVar;
    }

    /* renamed from: a */
    public final void mo62804a(C10153c.C10156c cVar) {
        this.f25087g = cVar;
    }

    /* renamed from: a */
    public final void mo62805a(C10153c.C10157d dVar) {
        this.f25088h = dVar;
    }

    /* renamed from: a */
    public final void mo62808a(C10153c.C10160g gVar) {
        this.f25086f = gVar;
    }

    /* renamed from: a */
    public void mo62799a() {
        this.f25082b = null;
        this.f25084d = null;
        this.f25083c = null;
        this.f25085e = null;
        this.f25086f = null;
        this.f25087g = null;
        this.f25088h = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo62811b() {
        try {
            if (this.f25082b != null) {
                this.f25082b.mo62846b(this);
            }
        } catch (Throwable th) {
            C10202c.m29294c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnPrepared error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62813c() {
        try {
            if (this.f25083c != null) {
                this.f25083c.mo62843a(this);
            }
        } catch (Throwable th) {
            C10202c.m29294c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnCompletion error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62800a(int i) {
        try {
            if (this.f25084d != null) {
                this.f25084d.mo62842a(this, i);
            }
        } catch (Throwable th) {
            C10202c.m29294c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnBufferingUpdate error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo62814d() {
        try {
            if (this.f25085e != null) {
                this.f25085e.mo62847c(this);
            }
        } catch (Throwable th) {
            C10202c.m29294c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnSeekComplete error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62801a(int i, int i2, int i3, int i4) {
        try {
            if (this.f25086f != null) {
                this.f25086f.mo62848a(this, i, i2, i3, i4);
            }
        } catch (Throwable th) {
            C10202c.m29294c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnVideoSizeChanged error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo62810a(int i, int i2) {
        try {
            return this.f25087g != null && this.f25087g.mo62844a(this, i, i2);
        } catch (Throwable th) {
            C10202c.m29294c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnError error: ", th);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo62812b(int i, int i2) {
        try {
            return this.f25088h != null && this.f25088h.mo62845b(this, i, i2);
        } catch (Throwable th) {
            C10202c.m29294c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnInfo error: ", th);
            return false;
        }
    }

    /* renamed from: a */
    public void mo62809a(boolean z) {
        this.f25081a = z;
    }
}
