package com.criteo.publisher.advancednative;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.criteo.publisher.p063e0.C1073a;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.net.URL;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.criteo.publisher.advancednative.g */
/* compiled from: CriteoImageLoader.kt */
public final class C1036g implements ImageLoader {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Picasso f3422a;

    /* renamed from: b */
    private final C1073a f3423b;

    /* renamed from: com.criteo.publisher.advancednative.g$a */
    /* compiled from: CriteoImageLoader.kt */
    static final class C1037a extends Lambda implements Function1<C1073a.C1074a, Unit> {

        /* renamed from: a */
        final /* synthetic */ C1036g f3424a;

        /* renamed from: b */
        final /* synthetic */ URL f3425b;

        /* renamed from: c */
        final /* synthetic */ Drawable f3426c;

        /* renamed from: d */
        final /* synthetic */ ImageView f3427d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1037a(C1036g gVar, URL url, Drawable drawable, ImageView imageView) {
            super(1);
            this.f3424a = gVar;
            this.f3425b = url;
            this.f3426c = drawable;
            this.f3427d = imageView;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo3054a((C1073a.C1074a) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo3054a(C1073a.C1074a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            C1036g gVar = this.f3424a;
            RequestCreator load = gVar.f3422a.load(this.f3425b.toString());
            Intrinsics.checkExpressionValueIsNotNull(load, "picasso.load(imageUrl.toString())");
            gVar.m4895a(load, this.f3426c).into(this.f3427d, new C1038a(aVar));
        }

        /* renamed from: com.criteo.publisher.advancednative.g$a$a */
        /* compiled from: CriteoImageLoader.kt */
        public static final class C1038a implements Callback {

            /* renamed from: a */
            final /* synthetic */ C1073a.C1074a f3428a;

            C1038a(C1073a.C1074a aVar) {
                this.f3428a = aVar;
            }

            public void onSuccess() {
                this.f3428a.mo3125a();
            }

            public void onError(Exception exc) {
                Intrinsics.checkParameterIsNotNull(exc, "e");
                this.f3428a.mo3125a();
            }
        }
    }

    public C1036g(Picasso picasso, C1073a aVar) {
        Intrinsics.checkParameterIsNotNull(picasso, "picasso");
        Intrinsics.checkParameterIsNotNull(aVar, "asyncResources");
        this.f3422a = picasso;
        this.f3423b = aVar;
    }

    public void preload(URL url) {
        Intrinsics.checkParameterIsNotNull(url, IabUtils.KEY_IMAGE_URL);
        this.f3422a.load(url.toString()).fetch();
    }

    public void loadImageInto(URL url, ImageView imageView, Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(url, IabUtils.KEY_IMAGE_URL);
        Intrinsics.checkParameterIsNotNull(imageView, "imageView");
        this.f3423b.mo3123a(new C1037a(this, url, drawable, imageView));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final RequestCreator m4895a(RequestCreator requestCreator, Drawable drawable) {
        if (drawable == null) {
            return requestCreator;
        }
        RequestCreator placeholder = requestCreator.placeholder(drawable);
        Intrinsics.checkExpressionValueIsNotNull(placeholder, "placeholder(placeholder)");
        return placeholder;
    }
}
