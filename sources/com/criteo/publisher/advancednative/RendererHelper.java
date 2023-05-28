package com.criteo.publisher.advancednative;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.criteo.publisher.C1330x;
import com.criteo.publisher.p063e0.C1076c;
import java.net.URL;

public class RendererHelper {
    /* access modifiers changed from: private */
    public final C1039h imageLoaderHolder;
    private final C1076c uiExecutor;

    public RendererHelper(C1039h hVar, C1076c cVar) {
        this.imageLoaderHolder = hVar;
        this.uiExecutor = cVar;
    }

    /* renamed from: com.criteo.publisher.advancednative.RendererHelper$a */
    class C1022a extends C1330x {

        /* renamed from: c */
        final /* synthetic */ URL f3397c;

        C1022a(URL url) {
            this.f3397c = url;
        }

        /* renamed from: a */
        public void mo3040a() throws Throwable {
            RendererHelper.this.imageLoaderHolder.mo3057a().preload(this.f3397c);
        }
    }

    /* access modifiers changed from: package-private */
    public void preloadMedia(URL url) {
        new C1022a(url).run();
    }

    public void setMediaInView(CriteoMedia criteoMedia, CriteoMediaView criteoMediaView) {
        setMediaInView(criteoMedia.getImageUrl(), criteoMediaView.getImageView(), criteoMediaView.getPlaceholder());
    }

    /* renamed from: com.criteo.publisher.advancednative.RendererHelper$b */
    class C1023b extends C1330x {

        /* renamed from: c */
        final /* synthetic */ URL f3399c;

        /* renamed from: d */
        final /* synthetic */ ImageView f3400d;

        /* renamed from: e */
        final /* synthetic */ Drawable f3401e;

        C1023b(URL url, ImageView imageView, Drawable drawable) {
            this.f3399c = url;
            this.f3400d = imageView;
            this.f3401e = drawable;
        }

        /* renamed from: a */
        public void mo3040a() throws Throwable {
            RendererHelper.this.imageLoaderHolder.mo3057a().loadImageInto(this.f3399c, this.f3400d, this.f3401e);
        }
    }

    /* access modifiers changed from: package-private */
    public void setMediaInView(URL url, ImageView imageView, Drawable drawable) {
        this.uiExecutor.execute(new C1023b(url, imageView, drawable));
    }
}
