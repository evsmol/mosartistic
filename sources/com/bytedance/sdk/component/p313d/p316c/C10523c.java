package com.bytedance.sdk.component.p313d.p316c;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.sdk.component.p313d.C10492b;
import com.bytedance.sdk.component.p313d.C10558g;
import com.bytedance.sdk.component.p313d.C10559h;
import com.bytedance.sdk.component.p313d.C10560i;
import com.bytedance.sdk.component.p313d.C10561j;
import com.bytedance.sdk.component.p313d.C10565n;
import com.bytedance.sdk.component.p313d.C10569r;
import com.bytedance.sdk.component.p313d.C10570s;
import com.bytedance.sdk.component.p313d.C10571t;
import com.bytedance.sdk.component.p313d.p316c.p317a.C10500a;
import com.bytedance.sdk.component.p313d.p322d.C10544c;
import com.bytedance.sdk.component.p313d.p322d.C10549h;
import com.bytedance.sdk.component.p313d.p322d.C10550i;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.bytedance.sdk.component.d.c.c */
/* compiled from: ImageRequest */
public class C10523c implements C10559h {

    /* renamed from: a */
    Future<?> f26241a;

    /* renamed from: b */
    private String f26242b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f26243c;

    /* renamed from: d */
    private String f26244d;

    /* renamed from: e */
    private C10565n f26245e;

    /* renamed from: f */
    private ImageView.ScaleType f26246f;

    /* renamed from: g */
    private Bitmap.Config f26247g;

    /* renamed from: h */
    private int f26248h;

    /* renamed from: i */
    private int f26249i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C10571t f26250j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public WeakReference<ImageView> f26251k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public volatile boolean f26252l;

    /* renamed from: m */
    private boolean f26253m;

    /* renamed from: n */
    private boolean f26254n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C10569r f26255o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C10570s f26256p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Queue<C10550i> f26257q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Handler f26258r;

    /* renamed from: s */
    private boolean f26259s;

    /* renamed from: t */
    private C10558g f26260t;

    /* renamed from: u */
    private int f26261u;

    /* renamed from: v */
    private C10537f f26262v;

    /* renamed from: w */
    private C10499a f26263w;

    /* renamed from: x */
    private C10492b f26264x;

    private C10523c(C10529b bVar) {
        C10570s sVar;
        this.f26257q = new LinkedBlockingQueue();
        this.f26258r = new Handler(Looper.getMainLooper());
        this.f26259s = true;
        this.f26242b = bVar.f26280d;
        this.f26245e = new C10525a(bVar.f26277a);
        this.f26251k = new WeakReference<>(bVar.f26278b);
        this.f26246f = bVar.f26281e;
        this.f26247g = bVar.f26282f;
        this.f26248h = bVar.f26283g;
        this.f26249i = bVar.f26284h;
        this.f26250j = bVar.f26285i == null ? C10571t.AUTO : bVar.f26285i;
        if (bVar.f26286j == null) {
            sVar = C10570s.MAIN;
        } else {
            sVar = bVar.f26286j;
        }
        this.f26256p = sVar;
        this.f26255o = bVar.f26287k;
        this.f26264x = m30780a(bVar);
        if (!TextUtils.isEmpty(bVar.f26279c)) {
            mo64080b(bVar.f26279c);
            mo64076a(bVar.f26279c);
        }
        this.f26253m = bVar.f26288l;
        this.f26254n = bVar.f26289m;
        this.f26262v = bVar.f26292p;
        this.f26257q.add(new C10544c());
    }

    /* renamed from: a */
    private C10492b m30780a(C10529b bVar) {
        if (bVar.f26291o != null) {
            return bVar.f26291o;
        }
        if (!TextUtils.isEmpty(bVar.f26290n)) {
            return C10500a.m30668a(new File(bVar.f26290n));
        }
        return C10500a.m30670f();
    }

    /* renamed from: a */
    public String mo64072a() {
        return this.f26242b;
    }

    /* renamed from: f */
    public C10565n mo64084f() {
        return this.f26245e;
    }

    /* renamed from: g */
    public String mo64085g() {
        return this.f26244d;
    }

    /* renamed from: a */
    public void mo64076a(String str) {
        this.f26244d = str;
    }

    /* renamed from: e */
    public String mo64083e() {
        return this.f26243c;
    }

    /* renamed from: b */
    public void mo64080b(String str) {
        WeakReference<ImageView> weakReference = this.f26251k;
        if (!(weakReference == null || weakReference.get() == null)) {
            ((ImageView) this.f26251k.get()).setTag(1094453505, str);
        }
        this.f26243c = str;
    }

    /* renamed from: d */
    public ImageView.ScaleType mo64082d() {
        return this.f26246f;
    }

    /* renamed from: h */
    public Bitmap.Config mo64086h() {
        return this.f26247g;
    }

    /* renamed from: b */
    public int mo64079b() {
        return this.f26248h;
    }

    /* renamed from: c */
    public int mo64081c() {
        return this.f26249i;
    }

    /* renamed from: i */
    public C10571t mo64087i() {
        return this.f26250j;
    }

    /* renamed from: j */
    public boolean mo64088j() {
        return this.f26253m;
    }

    /* renamed from: k */
    public boolean mo64089k() {
        return this.f26254n;
    }

    /* renamed from: a */
    public void mo64077a(boolean z) {
        this.f26259s = z;
    }

    /* renamed from: l */
    public boolean mo64090l() {
        return this.f26259s;
    }

    /* renamed from: m */
    public C10558g mo64091m() {
        return this.f26260t;
    }

    /* renamed from: a */
    public void mo64075a(C10558g gVar) {
        this.f26260t = gVar;
    }

    /* renamed from: n */
    public int mo64092n() {
        return this.f26261u;
    }

    /* renamed from: a */
    public void mo64073a(int i) {
        this.f26261u = i;
    }

    /* renamed from: o */
    public C10499a mo64093o() {
        return this.f26263w;
    }

    /* renamed from: a */
    public void mo64074a(C10499a aVar) {
        this.f26263w = aVar;
    }

    /* renamed from: p */
    public C10537f mo64094p() {
        return this.f26262v;
    }

    /* renamed from: q */
    public C10492b mo64095q() {
        return this.f26264x;
    }

    /* renamed from: a */
    public boolean mo64078a(C10550i iVar) {
        if (this.f26252l) {
            return false;
        }
        return this.f26257q.add(iVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public C10559h m30792s() {
        try {
            if (this.f26262v == null) {
                if (this.f26245e != null) {
                    this.f26245e.mo256a(1005, "not init !", (Throwable) null);
                }
                return this;
            }
            ExecutorService e = this.f26262v.mo64142e();
            if (e != null) {
                this.f26241a = e.submit(new Runnable() {
                    public void run() {
                        while (true) {
                            try {
                                if (C10523c.this.f26252l) {
                                    break;
                                }
                                C10550i iVar = (C10550i) C10523c.this.f26257q.poll();
                                if (iVar == null) {
                                    break;
                                }
                                if (C10523c.this.f26255o != null) {
                                    C10523c.this.f26255o.mo2508a(iVar.mo64146a(), C10523c.this);
                                }
                                iVar.mo64147a(C10523c.this);
                                if (C10523c.this.f26255o != null) {
                                    C10523c.this.f26255o.mo2509b(iVar.mo64146a(), C10523c.this);
                                }
                            } catch (Throwable th) {
                                C10523c.this.m30781a(2000, th.getMessage(), th);
                                if (C10523c.this.f26255o != null) {
                                    C10523c.this.f26255o.mo2509b("exception", C10523c.this);
                                    return;
                                }
                                return;
                            }
                        }
                        if (C10523c.this.f26252l) {
                            C10523c.this.m30781a(1003, "canceled", (Throwable) null);
                        }
                    }
                });
            }
            return this;
        } catch (Exception e2) {
            Log.e("ImageRequest", e2.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30781a(int i, String str, Throwable th) {
        new C10549h(i, str, th).mo64147a(this);
        this.f26257q.clear();
    }

    /* renamed from: r */
    public String mo64096r() {
        return mo64083e() + mo64087i();
    }

    /* renamed from: com.bytedance.sdk.component.d.c.c$b */
    /* compiled from: ImageRequest */
    public static class C10529b implements C10560i {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C10565n f26277a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public ImageView f26278b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f26279c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f26280d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public ImageView.ScaleType f26281e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Bitmap.Config f26282f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f26283g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f26284h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C10571t f26285i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C10570s f26286j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C10569r f26287k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f26288l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public boolean f26289m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public String f26290n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public C10492b f26291o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public C10537f f26292p;

        public C10529b(C10537f fVar) {
            this.f26292p = fVar;
        }

        /* renamed from: c */
        public C10560i mo64112c(String str) {
            this.f26280d = str;
            return this;
        }

        /* renamed from: a */
        public C10560i mo64108a(String str) {
            this.f26279c = str;
            return this;
        }

        /* renamed from: a */
        public C10560i mo64105a(ImageView.ScaleType scaleType) {
            this.f26281e = scaleType;
            return this;
        }

        /* renamed from: a */
        public C10560i mo64104a(Bitmap.Config config) {
            this.f26282f = config;
            return this;
        }

        /* renamed from: a */
        public C10560i mo64103a(int i) {
            this.f26283g = i;
            return this;
        }

        /* renamed from: b */
        public C10560i mo64110b(int i) {
            this.f26284h = i;
            return this;
        }

        /* renamed from: a */
        public C10560i mo64107a(C10571t tVar) {
            this.f26285i = tVar;
            return this;
        }

        /* renamed from: a */
        public C10560i mo64106a(C10569r rVar) {
            this.f26287k = rVar;
            return this;
        }

        /* renamed from: a */
        public C10560i mo64109a(boolean z) {
            this.f26289m = z;
            return this;
        }

        /* renamed from: b */
        public C10560i mo64111b(String str) {
            this.f26290n = str;
            return this;
        }

        /* renamed from: a */
        public C10559h mo64102a(C10565n nVar) {
            this.f26277a = nVar;
            return new C10523c(this).m30792s();
        }

        /* renamed from: a */
        public C10559h mo64101a(ImageView imageView) {
            this.f26278b = imageView;
            return new C10523c(this).m30792s();
        }
    }

    /* renamed from: com.bytedance.sdk.component.d.c.c$a */
    /* compiled from: ImageRequest */
    private class C10525a implements C10565n {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C10565n f26267b;

        public C10525a(C10565n nVar) {
            this.f26267b = nVar;
        }

        /* renamed from: a */
        public void mo257a(final C10561j jVar) {
            final ImageView imageView = (ImageView) C10523c.this.f26251k.get();
            if (imageView != null && C10523c.this.f26250j != C10571t.RAW && m30819a(imageView) && (jVar.mo64116b() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) jVar.mo64116b();
                C10523c.this.f26258r.post(new Runnable() {
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            if (C10523c.this.f26256p == C10570s.MAIN) {
                C10523c.this.f26258r.post(new Runnable() {
                    public void run() {
                        if (C10525a.this.f26267b != null) {
                            C10525a.this.f26267b.mo257a(jVar);
                        }
                    }
                });
                return;
            }
            C10565n nVar = this.f26267b;
            if (nVar != null) {
                nVar.mo257a(jVar);
            }
        }

        /* renamed from: a */
        private boolean m30819a(ImageView imageView) {
            Object tag;
            if (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(C10523c.this.f26243c)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public void mo256a(final int i, final String str, final Throwable th) {
            if (C10523c.this.f26256p == C10570s.MAIN) {
                C10523c.this.f26258r.post(new Runnable() {
                    public void run() {
                        if (C10525a.this.f26267b != null) {
                            C10525a.this.f26267b.mo256a(i, str, th);
                        }
                    }
                });
                return;
            }
            C10565n nVar = this.f26267b;
            if (nVar != null) {
                nVar.mo256a(i, str, th);
            }
        }
    }
}
