package com.applovin.exoplayer2.p209i;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.C6829as;
import com.applovin.exoplayer2.C7181e;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.C7867w;
import com.applovin.exoplayer2.p182c.C6922g;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7759u;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.i.m */
public final class C7622m extends C7181e implements Handler.Callback {

    /* renamed from: a */
    private final Handler f17801a;

    /* renamed from: b */
    private final C7621l f17802b;

    /* renamed from: c */
    private final C7603i f17803c;

    /* renamed from: d */
    private final C7867w f17804d;

    /* renamed from: e */
    private boolean f17805e;

    /* renamed from: f */
    private boolean f17806f;

    /* renamed from: g */
    private boolean f17807g;

    /* renamed from: h */
    private int f17808h;

    /* renamed from: i */
    private C7864v f17809i;

    /* renamed from: j */
    private C7588g f17810j;

    /* renamed from: k */
    private C7619j f17811k;

    /* renamed from: l */
    private C7620k f17812l;

    /* renamed from: m */
    private C7620k f17813m;

    /* renamed from: n */
    private int f17814n;

    /* renamed from: o */
    private long f17815o;

    public C7622m(C7621l lVar, Looper looper) {
        this(lVar, looper, C7603i.f17741a);
    }

    public C7622m(C7621l lVar, Looper looper, C7603i iVar) {
        super(3);
        this.f17802b = (C7621l) C7717a.m22120b(lVar);
        this.f17801a = looper == null ? null : C7728ai.m22196a(looper, (Handler.Callback) this);
        this.f17803c = iVar;
        this.f17804d = new C7867w();
        this.f17815o = -9223372036854775807L;
    }

    /* renamed from: B */
    private void m21700B() {
        this.f17811k = null;
        this.f17814n = -1;
        C7620k kVar = this.f17812l;
        if (kVar != null) {
            kVar.mo53146f();
            this.f17812l = null;
        }
        C7620k kVar2 = this.f17813m;
        if (kVar2 != null) {
            kVar2.mo53146f();
            this.f17813m = null;
        }
    }

    /* renamed from: C */
    private void m21701C() {
        m21700B();
        ((C7588g) C7717a.m22120b(this.f17810j)).mo53137d();
        this.f17810j = null;
        this.f17808h = 0;
    }

    /* renamed from: D */
    private void m21702D() {
        this.f17807g = true;
        this.f17810j = this.f17803c.mo54757b((C7864v) C7717a.m22120b(this.f17809i));
    }

    /* renamed from: E */
    private void m21703E() {
        m21701C();
        m21702D();
    }

    /* renamed from: F */
    private long m21704F() {
        if (this.f17814n == -1) {
            return Long.MAX_VALUE;
        }
        C7717a.m22120b(this.f17812l);
        if (this.f17814n >= this.f17812l.mo54697f_()) {
            return Long.MAX_VALUE;
        }
        return this.f17812l.mo54695a(this.f17814n);
    }

    /* renamed from: G */
    private void m21705G() {
        m21707a((List<C7540a>) Collections.emptyList());
    }

    /* renamed from: a */
    private void m21706a(C7600h hVar) {
        C7755q.m22362c("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f17809i, hVar);
        m21705G();
        m21703E();
    }

    /* renamed from: a */
    private void m21707a(List<C7540a> list) {
        Handler handler = this.f17801a;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            m21708b(list);
        }
    }

    /* renamed from: b */
    private void m21708b(List<C7540a> list) {
        this.f17802b.mo52877a(list);
    }

    /* renamed from: A */
    public boolean mo52825A() {
        return this.f17806f;
    }

    /* renamed from: a */
    public int mo52851a(C7864v vVar) {
        if (this.f17803c.mo54756a(vVar)) {
            return C6829as.CC.m17728b(vVar.f18908E == 0 ? 4 : 2);
        }
        return C6829as.CC.m17728b(C7759u.m22381c(vVar.f18921l) ? 1 : 0);
    }

    /* renamed from: a */
    public void mo52830a(long j, long j2) {
        boolean z;
        if (mo52841j()) {
            long j3 = this.f17815o;
            if (j3 != -9223372036854775807L && j >= j3) {
                m21700B();
                this.f17806f = true;
            }
        }
        if (!this.f17806f) {
            if (this.f17813m == null) {
                ((C7588g) C7717a.m22120b(this.f17810j)).mo54658a(j);
                try {
                    this.f17813m = (C7620k) ((C7588g) C7717a.m22120b(this.f17810j)).mo53135b();
                } catch (C7600h e) {
                    m21706a(e);
                    return;
                }
            }
            if (mo52835d_() == 2) {
                if (this.f17812l != null) {
                    long F = m21704F();
                    z = false;
                    while (F <= j) {
                        this.f17814n++;
                        F = m21704F();
                        z = true;
                    }
                } else {
                    z = false;
                }
                C7620k kVar = this.f17813m;
                if (kVar != null) {
                    if (kVar.mo53126c()) {
                        if (!z && m21704F() == Long.MAX_VALUE) {
                            if (this.f17808h == 2) {
                                m21703E();
                            } else {
                                m21700B();
                                this.f17806f = true;
                            }
                        }
                    } else if (kVar.f15345a <= j) {
                        C7620k kVar2 = this.f17812l;
                        if (kVar2 != null) {
                            kVar2.mo53146f();
                        }
                        this.f17814n = kVar.mo54694a(j);
                        this.f17812l = kVar;
                        this.f17813m = null;
                        z = true;
                    }
                }
                if (z) {
                    C7717a.m22120b(this.f17812l);
                    m21707a(this.f17812l.mo54696b(j));
                }
                if (this.f17808h != 2) {
                    while (!this.f17805e) {
                        try {
                            C7619j jVar = this.f17811k;
                            if (jVar == null) {
                                jVar = (C7619j) ((C7588g) C7717a.m22120b(this.f17810j)).mo53133a();
                                if (jVar != null) {
                                    this.f17811k = jVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.f17808h == 1) {
                                jVar.mo53122a_(4);
                                ((C7588g) C7717a.m22120b(this.f17810j)).mo53134a(jVar);
                                this.f17811k = null;
                                this.f17808h = 2;
                                return;
                            }
                            int a = mo53848a(this.f17804d, (C6922g) jVar, 0);
                            if (a == -4) {
                                if (jVar.mo53126c()) {
                                    this.f17805e = true;
                                    this.f17807g = false;
                                } else {
                                    C7864v vVar = this.f17804d.f18967b;
                                    if (vVar != null) {
                                        jVar.f17798f = vVar.f18925p;
                                        jVar.mo53143h();
                                        this.f17807g &= !jVar.mo53127d();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.f17807g) {
                                    ((C7588g) C7717a.m22120b(this.f17810j)).mo53134a(jVar);
                                    this.f17811k = null;
                                }
                            } else if (a == -3) {
                                return;
                            }
                        } catch (C7600h e2) {
                            m21706a(e2);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53044a(long j, boolean z) {
        m21705G();
        this.f17805e = false;
        this.f17806f = false;
        this.f17815o = -9223372036854775807L;
        if (this.f17808h != 0) {
            m21703E();
            return;
        }
        m21700B();
        ((C7588g) C7717a.m22120b(this.f17810j)).mo53136c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53851a(C7864v[] vVarArr, long j, long j2) {
        this.f17809i = vVarArr[0];
        if (this.f17810j != null) {
            this.f17808h = 1;
        } else {
            m21702D();
        }
    }

    /* renamed from: c */
    public void mo54793c(long j) {
        C7717a.m22121b(mo52841j());
        this.f17815o = j;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m21708b((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo53058r() {
        this.f17809i = null;
        this.f17815o = -9223372036854775807L;
        m21705G();
        m21701C();
    }

    /* renamed from: y */
    public String mo52846y() {
        return "TextRenderer";
    }

    /* renamed from: z */
    public boolean mo52847z() {
        return true;
    }
}
