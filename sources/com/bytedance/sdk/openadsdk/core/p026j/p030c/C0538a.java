package com.bytedance.sdk.openadsdk.core.p026j.p030c;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.c.a */
/* compiled from: ResourceHelper */
public class C0538a {

    /* renamed from: a */
    public static final Set<String> f2014a = new HashSet<String>() {
        {
            add("image/jpeg");
            add("image/png");
            add("image/bmp");
            add("image/gif");
            add("image/jpg");
        }
    };

    /* renamed from: b */
    public static Set<String> f2015b = new HashSet<String>() {
        {
            add("application/x-javascript");
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.c.a$a */
    /* compiled from: ResourceHelper */
    public enum C0541a {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.c.a$b */
    /* compiled from: ResourceHelper */
    public enum C0542b {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    /* renamed from: a */
    public static Point m2570a(Context context, int i, int i2, C0542b bVar) {
        if (context == null) {
            context = C0558m.m2663a();
        }
        Point point = new Point(i, i2);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int e = C1002v.m4749e(context, (float) i);
        int e2 = C1002v.m4749e(context, (float) i2);
        if (e <= width && e2 <= height) {
            return point;
        }
        Point point2 = new Point();
        if (C0542b.HTML_RESOURCE == bVar) {
            point2.x = Math.min(width, e);
            point2.y = Math.min(height, e2);
        } else {
            float f = (float) e;
            float f2 = f / ((float) width);
            float f3 = (float) e2;
            float f4 = f3 / ((float) height);
            if (f2 >= f4) {
                point2.x = width;
                point2.y = (int) (f3 / f2);
            } else {
                point2.x = (int) (f / f4);
                point2.y = height;
            }
        }
        if (point2.x < 0 || point2.y < 0) {
            return point;
        }
        point2.x = C1002v.m4745d(context, (float) point2.x);
        point2.y = C1002v.m4745d(context, (float) point2.y);
        return point2;
    }
}
