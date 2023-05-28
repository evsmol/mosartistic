package com.bytedance.sdk.openadsdk.p046i.p047a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.p313d.C10561j;
import com.bytedance.sdk.component.p313d.C10565n;
import com.bytedance.sdk.openadsdk.p037d.C0750a;
import com.bytedance.sdk.openadsdk.p046i.C0826a;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.i.a.a */
/* compiled from: GifLoader */
public class C0827a {

    /* renamed from: com.bytedance.sdk.openadsdk.i.a.a$b */
    /* compiled from: GifLoader */
    public interface C0830b {
        /* renamed from: a */
        void mo2638a();

        /* renamed from: a */
        void mo2639a(int i, String str, Throwable th);

        /* renamed from: a */
        void mo2640a(String str, C0831b bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2633a() {
    }

    /* renamed from: a */
    public void mo2637a(C0826a aVar, C0830b bVar, int i, int i2, String str) {
        mo2636a(aVar, bVar, i, i2, ImageView.ScaleType.CENTER_INSIDE, str);
    }

    /* renamed from: a */
    public void mo2636a(C0826a aVar, final C0830b bVar, int i, int i2, ImageView.ScaleType scaleType, String str) {
        C0750a.m3821a(aVar.f3033a).mo64108a(aVar.f3034b).mo64103a(i).mo64110b(i2).mo64111b(str).mo64104a(Bitmap.Config.RGB_565).mo64105a(scaleType).mo64109a(!TextUtils.isEmpty(str)).mo64102a((C10565n) new C10565n() {
            /* renamed from: a */
            public void mo257a(C10561j jVar) {
                C0827a.this.mo2635a(jVar, bVar);
            }

            /* renamed from: a */
            public void mo256a(int i, String str, Throwable th) {
                C0827a.this.mo2634a(i, str, th, bVar);
            }
        });
        mo2633a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2635a(C10561j jVar, C0830b bVar) {
        if (bVar != null) {
            Object b = jVar.mo64116b();
            int a = m4052a(jVar);
            if (b instanceof byte[]) {
                bVar.mo2640a(jVar.mo64115a(), new C0831b((byte[]) b, a));
            } else if (b instanceof Bitmap) {
                bVar.mo2640a(jVar.mo64115a(), new C0831b((Bitmap) b, a));
            } else {
                bVar.mo2639a(0, "not bitmap or gif result!", (Throwable) null);
            }
        }
        if (bVar != null) {
            bVar.mo2638a();
        }
    }

    /* renamed from: a */
    private int m4052a(C10561j jVar) {
        String str;
        Map<String, String> c = jVar.mo64117c();
        if (c == null || (str = c.get("image_size")) == null || !(str instanceof Integer)) {
            return 0;
        }
        return ((Integer) str).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2634a(int i, String str, Throwable th, C0830b bVar) {
        if (bVar != null) {
            bVar.mo2639a(i, str, th);
        }
    }

    /* renamed from: b */
    public static C0829a m4053b() {
        return new C0829a();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.i.a.a$a */
    /* compiled from: GifLoader */
    static class C0829a implements C0830b {
        /* renamed from: a */
        public void mo2638a() {
        }

        /* renamed from: a */
        public void mo2639a(int i, String str, Throwable th) {
        }

        /* renamed from: a */
        public void mo2640a(String str, C0831b bVar) {
        }

        C0829a() {
        }
    }
}
