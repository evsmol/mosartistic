package com.explorestack.iab.mraid;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.explorestack.iab.mraid.m */
public class C1379m extends GestureDetector {

    /* renamed from: a */
    public final C1380a f4238a;

    /* renamed from: com.explorestack.iab.mraid.m$a */
    public static class C1380a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        public boolean f4239a = false;

        /* renamed from: a */
        public boolean mo3969a() {
            return this.f4239a;
        }

        /* renamed from: b */
        public void mo3970b() {
            this.f4239a = false;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f4239a = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public C1379m(Context context) {
        this(context, new C1380a());
    }

    private C1379m(Context context, C1380a aVar) {
        super(context, aVar);
        this.f4238a = aVar;
        setIsLongpressEnabled(false);
    }

    /* renamed from: a */
    public boolean mo3967a() {
        return this.f4238a.mo3969a();
    }

    /* renamed from: b */
    public void mo3968b() {
        this.f4238a.mo3970b();
    }
}
