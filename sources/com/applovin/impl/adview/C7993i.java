package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.applovin.impl.adview.i */
public abstract class C7993i extends View {

    /* renamed from: a */
    protected float f19308a = 1.0f;

    /* renamed from: b */
    protected final Context f19309b;

    /* renamed from: com.applovin.impl.adview.i$a */
    public enum C7994a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);
        

        /* renamed from: e */
        private final int f19315e;

        private C7994a(int i) {
            this.f19315e = i;
        }

        /* renamed from: a */
        public int mo55742a() {
            return this.f19315e;
        }
    }

    protected C7993i(Context context) {
        super(context);
        this.f19309b = context;
    }

    /* renamed from: a */
    public static C7993i m23745a(C7994a aVar, Context context) {
        return aVar.equals(C7994a.INVISIBLE) ? new C8020p(context) : aVar.equals(C7994a.WHITE_ON_TRANSPARENT) ? new C8021q(context) : aVar.equals(C7994a.TRANSPARENT_SKIP) ? new C8022r(context) : new C8028w(context);
    }

    /* renamed from: a */
    public void mo55738a(int i) {
        setViewScale(((float) i) / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.f19308a * 30.0f;
    }

    public abstract C7994a getStyle();

    public void setViewScale(float f) {
        this.f19308a = f;
    }
}
