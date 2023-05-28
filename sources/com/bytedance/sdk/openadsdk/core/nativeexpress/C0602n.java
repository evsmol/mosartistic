package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.p016b.C0412f;
import com.bytedance.sdk.openadsdk.core.p021e.C0455g;
import com.bytedance.sdk.openadsdk.utils.C1002v;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.n */
/* compiled from: ViewGestureDetector */
public class C0602n extends GestureDetector {

    /* renamed from: a */
    private final C0603a f2250a;

    /* renamed from: b */
    private final C0412f f2251b;

    public C0602n(Context context) {
        this(context, new C0603a());
    }

    public C0602n(Context context, C0603a aVar) {
        super(context, aVar);
        this.f2250a = aVar;
        this.f2251b = new C0412f();
        setIsLongpressEnabled(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1987a() {
        this.f2250a.mo1990a();
    }

    /* renamed from: b */
    public boolean mo1988b() {
        return this.f2250a.mo1991b();
    }

    /* renamed from: a */
    public C0455g mo1986a(Context context, View view, View view2) {
        if (this.f2251b == null) {
            return new C0455g.C0457a().mo1241a();
        }
        return new C0455g.C0457a().mo1254f(this.f2251b.f1379a).mo1252e(this.f2251b.f1380b).mo1249d(this.f2251b.f1381c).mo1246c(this.f2251b.f1382d).mo1244b(this.f2251b.f1383e).mo1236a(this.f2251b.f1384f).mo1245b(C1002v.m4730a(view)).mo1240a(C1002v.m4730a(view2)).mo1248c(C1002v.m4743c(view)).mo1251d(C1002v.m4743c(view2)).mo1250d(this.f2251b.f1385g).mo1253e(this.f2251b.f1386h).mo1255f(this.f2251b.f1387i).mo1237a(this.f2251b.f1389l).mo1243b(C0503h.m2281d().mo1591b() ? 1 : 2).mo1238a("vessel").mo1234a(C1002v.m4748e(context)).mo1247c(C1002v.m4753g(context)).mo1242b(C1002v.m4751f(context)).mo1241a();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f2251b.mo1121a(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.n$a */
    /* compiled from: ViewGestureDetector */
    static class C0603a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        boolean f2252a = false;

        C0603a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1990a() {
            this.f2252a = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1991b() {
            return this.f2252a;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f2252a = true;
            return super.onSingleTapUp(motionEvent);
        }
    }
}
