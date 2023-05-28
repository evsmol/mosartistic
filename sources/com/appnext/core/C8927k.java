package com.appnext.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

/* renamed from: com.appnext.core.k */
public final class C8927k {
    /* renamed from: a */
    public static void m26970a(final Context context, final ImageView imageView) {
        new Thread(new Runnable() {
            public final void run() {
                try {
                    final Bitmap Y = C8917f.m26913Y("https://cdn.appnext.com/tools/sdk/adchoices/adchoices_big.png");
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            try {
                                if (Y != null) {
                                    imageView.setImageDrawable(new BitmapDrawable(context.getResources(), Y));
                                    return;
                                }
                                imageView.setImageResource(C8885R.C8887drawable.apnxt_adchoices);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                } catch (Throwable unused) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            imageView.setImageResource(C8885R.C8887drawable.apnxt_adchoices);
                        }
                    });
                }
            }
        }).start();
    }

    /* renamed from: a */
    public static boolean m26971a(AppnextAd appnextAd, C8936p pVar) {
        return appnextAd.isGdpr() && Boolean.parseBoolean(pVar.get("gdpr"));
    }
}
