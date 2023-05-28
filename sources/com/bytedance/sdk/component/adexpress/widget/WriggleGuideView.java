package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.sdk.component.utils.C10647t;
import java.util.ArrayList;
import java.util.List;

public class WriggleGuideView extends View {

    /* renamed from: a */
    private int f26027a;

    /* renamed from: b */
    private int f26028b;

    /* renamed from: c */
    private Bitmap f26029c;

    /* renamed from: d */
    private Bitmap f26030d;

    /* renamed from: e */
    private Paint f26031e;

    /* renamed from: f */
    private int f26032f;

    /* renamed from: g */
    private final List<C10442b> f26033g;

    /* renamed from: h */
    private boolean f26034h;

    /* renamed from: i */
    private boolean f26035i;

    /* renamed from: j */
    private C10441a f26036j;

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.WriggleGuideView$a */
    public interface C10441a {
        /* renamed from: a */
        void mo63707a();
    }

    public WriggleGuideView(Context context) {
        this(context, (AttributeSet) null);
    }

    public WriggleGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WriggleGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26027a = 0;
        this.f26028b = 0;
        this.f26032f = 0;
        this.f26033g = new ArrayList();
        this.f26034h = true;
        this.f26035i = false;
        setLayerType(1, (Paint) null);
        this.f26031e = new Paint();
        this.f26031e = new Paint(1);
        this.f26033g.clear();
    }

    /* renamed from: a */
    private Bitmap m30435a(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(BitmapFactory.decodeResource(getContext().getResources(), C10647t.m31282d(getContext(), "tt_wriggle_union")), (Rect) null, new RectF(0.0f, 0.0f, (float) i, (float) i2), this.f26031e);
        return createBitmap;
    }

    /* renamed from: b */
    private Bitmap m30436b(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(BitmapFactory.decodeResource(getContext().getResources(), C10647t.m31282d(getContext(), "tt_wriggle_union_white")), (Rect) null, new RectF(0.0f, 0.0f, (float) i, (float) i2), new Paint(1));
        return createBitmap;
    }

    /* renamed from: c */
    private Bitmap m30437c(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        float f = ((float) this.f26032f) / ((float) this.f26027a);
        if (f >= 0.5f) {
            f = Math.abs(f - 1.0f);
        }
        int i3 = this.f26028b;
        this.f26033g.add(new C10442b((float) (i - this.f26032f), ((float) i2) - ((f * 2.0f) * ((float) i3)), ((float) Math.min(this.f26027a, i3)) / 2.0f));
        for (C10442b next : this.f26033g) {
            canvas.drawCircle(next.f26037a, next.f26038b, next.f26039c, paint);
        }
        return createBitmap;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f26034h) {
            this.f26027a = getWidth();
            int height = getHeight();
            this.f26028b = height;
            this.f26029c = m30435a(this.f26027a, height);
            this.f26030d = m30436b(this.f26027a, this.f26028b);
            this.f26034h = false;
        }
        canvas.drawBitmap(this.f26029c, 0.0f, 0.0f, this.f26031e);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (Paint) null, 31);
        canvas.drawBitmap(this.f26030d, 0.0f, 0.0f, this.f26031e);
        this.f26031e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(m30437c(this.f26027a, this.f26028b), 0.0f, 0.0f, this.f26031e);
        this.f26031e.setXfermode((Xfermode) null);
        canvas.restoreToCount(saveLayer);
        if (this.f26035i) {
            this.f26032f += 2;
            invalidate();
            if (this.f26032f >= this.f26027a) {
                C10441a aVar = this.f26036j;
                if (aVar != null) {
                    aVar.mo63707a();
                }
                this.f26035i = false;
            }
        }
    }

    /* renamed from: a */
    public void mo63853a(C10441a aVar) {
        this.f26036j = aVar;
        this.f26032f = 0;
        this.f26035i = true;
        invalidate();
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.WriggleGuideView$b */
    private static class C10442b {

        /* renamed from: a */
        public float f26037a;

        /* renamed from: b */
        public float f26038b;

        /* renamed from: c */
        public float f26039c;

        C10442b(float f, float f2, float f3) {
            this.f26037a = f;
            this.f26038b = f2;
            this.f26039c = f3;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f26036j != null) {
            this.f26036j = null;
        }
    }
}
