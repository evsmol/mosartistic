package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.graphics.drawable.GradientDrawable;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a */
/* compiled from: CoverDrawable */
public class C10386a extends GradientDrawable {

    /* renamed from: a */
    private Paint f25809a;

    /* renamed from: b */
    private Path f25810b = new Path();

    public C10386a() {
        Paint paint = new Paint(1);
        this.f25809a = paint;
        paint.setColor(-1);
    }

    public C10386a(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        Paint paint = new Paint(1);
        this.f25809a = paint;
        paint.setColor(-1);
    }

    public void draw(Canvas canvas) {
        Path path = this.f25810b;
        if (path == null || path.isEmpty()) {
            super.draw(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.f25809a, 31);
        super.draw(canvas);
        this.f25809a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.f25810b, this.f25809a);
        this.f25809a.setXfermode((Xfermode) null);
        canvas.restoreToCount(saveLayer);
    }

    /* renamed from: a */
    public void mo63683a(int i, int i2, int i3, int i4) {
        this.f25810b.addRect((float) i, (float) i2, (float) i3, (float) i4, Path.Direction.CW);
        invalidateSelf();
    }
}
