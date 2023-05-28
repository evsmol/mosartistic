package com.appodeal.ads.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.widget.ImageView;
import com.appodeal.ads.C9182f1;
import com.appodeal.ads.C9212h5;
import com.appodeal.ads.C9263l2;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.C9643p;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;

/* renamed from: com.appodeal.ads.utils.p */
public final class C9643p {

    /* renamed from: com.appodeal.ads.utils.p$a */
    public static class C9644a implements Runnable {

        /* renamed from: a */
        public final Context f24435a;

        /* renamed from: b */
        public final String f24436b;

        /* renamed from: c */
        public final WeakReference<ImageView> f24437c;

        /* renamed from: d */
        public final C9645b f24438d;

        /* renamed from: e */
        public Bitmap f24439e;

        public C9644a(Context context, String str, ImageView imageView, C9263l2.C9265b bVar) {
            this.f24435a = context;
            this.f24436b = str;
            this.f24437c = new WeakReference<>(imageView);
            this.f24438d = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m28402a() {
            Bitmap bitmap;
            ImageView imageView = this.f24437c.get();
            if (imageView == null || (bitmap = this.f24439e) == null) {
                ((C9263l2.C9265b) this.f24438d).getClass();
                Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_ASSETS_ERROR, "Target ImageView or Bitmap is invalid");
                return;
            }
            ((C9263l2.C9265b) this.f24438d).getClass();
            imageView.setImageBitmap(bitmap);
        }

        public final void run() {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                int i = 1;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(this.f24436b, options);
                if (options.outWidth != 0) {
                    if (options.outHeight != 0) {
                        int a = C9643p.m28401a(this.f24435a);
                        int a2 = C9643p.m28400a(a, false);
                        int i2 = options.outWidth;
                        int i3 = options.outHeight;
                        while (true) {
                            if (i2 / i <= a) {
                                if (i3 / i <= a2) {
                                    options.inSampleSize = i;
                                    options.inJustDecodeBounds = false;
                                    this.f24439e = BitmapFactory.decodeFile(this.f24436b, options);
                                    C9212h5.f23153a.post(new Runnable() {
                                        public final void run() {
                                            C9643p.C9644a.this.m28402a();
                                        }
                                    });
                                    return;
                                }
                            }
                            i *= 2;
                        }
                    }
                }
                ((C9263l2.C9265b) this.f24438d).getClass();
                Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_ASSETS_ERROR, "Image size is (0;0)");
            } catch (Exception e) {
                if (e.getMessage() == null) {
                    ((C9263l2.C9265b) this.f24438d).getClass();
                    Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_ASSETS_ERROR, "ImagePreparation error");
                    return;
                }
                C9645b bVar = this.f24438d;
                String message = e.getMessage();
                ((C9263l2.C9265b) bVar).getClass();
                Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_ASSETS_ERROR, message);
            }
        }
    }

    /* renamed from: com.appodeal.ads.utils.p$b */
    public interface C9645b {
    }

    /* renamed from: a */
    public static int m28400a(int i, boolean z) {
        if (z) {
            i = (int) (((float) i) / 1.5f);
        }
        if (i > 700) {
            return 700;
        }
        return i;
    }

    /* renamed from: a */
    public static int m28401a(Context context) {
        Point o = C9182f1.m27295o(context);
        return Math.min(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, Math.min(o.x, o.y));
    }
}
