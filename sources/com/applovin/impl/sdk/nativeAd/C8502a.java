package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p255d.C8393e;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.File;
import java.util.Collections;

/* renamed from: com.applovin.impl.sdk.nativeAd.a */
public class C8502a extends C8401a {

    /* renamed from: a */
    private final C8393e f21403a = new C8393e();

    /* renamed from: e */
    private final AppLovinNativeAdImpl f21404e;

    /* renamed from: f */
    private final C8503a f21405f;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a */
    public interface C8503a {
        /* renamed from: a */
        void mo57490a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public C8502a(AppLovinNativeAdImpl appLovinNativeAdImpl, C8490n nVar, C8503a aVar) {
        super("TaskCacheNativeAd", nVar);
        this.f21404e = appLovinNativeAdImpl;
        this.f21405f = aVar;
    }

    /* renamed from: a */
    private Uri m25709a(Uri uri) {
        if (uri == null) {
            return null;
        }
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str = this.f21119c;
            vVar2.mo57818b(str, "Attempting to cache resource: " + uri);
        }
        String a = this.f21118b.mo57363ad() != null ? this.f21118b.mo57363ad().mo57666a(mo57169f(), uri.toString(), this.f21404e.getCachePrefix(), Collections.emptyList(), false, true, this.f21403a) : this.f21118b.mo57364ae().mo57654a(mo57169f(), uri.toString(), this.f21404e.getCachePrefix(), Collections.emptyList(), false, true, this.f21403a);
        if (StringUtils.isValidString(a)) {
            File a2 = this.f21118b.mo57363ad() != null ? this.f21118b.mo57363ad().mo57665a(a, mo57169f()) : this.f21118b.mo57364ae().mo57652a(a, mo57169f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    return fromFile;
                }
                C8626v vVar3 = this.f21120d;
                if (C8626v.m26252a()) {
                    this.f21120d.mo57822e(this.f21119c, "Unable to extract Uri from image file");
                }
            } else {
                C8626v vVar4 = this.f21120d;
                if (C8626v.m26252a()) {
                    C8626v vVar5 = this.f21120d;
                    String str2 = this.f21119c;
                    vVar5.mo57822e(str2, "Unable to retrieve File from cached image filename = " + a);
                }
            }
        }
        return null;
    }

    public void run() {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str = this.f21119c;
            vVar2.mo57818b(str, "Begin caching ad #" + this.f21404e.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        Uri a = m25709a(this.f21404e.getIconUri());
        if (a != null) {
            this.f21404e.setIconUri(a);
        }
        Uri a2 = m25709a(this.f21404e.getMainImageUri());
        if (a2 != null) {
            this.f21404e.setMainImageUri(a2);
        }
        Uri a3 = m25709a(this.f21404e.getPrivacyIconUri());
        if (a3 != null) {
            this.f21404e.setPrivacyIconUri(a3);
        }
        C8626v vVar3 = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar4 = this.f21120d;
            String str2 = this.f21119c;
            vVar4.mo57818b(str2, "Finished caching ad #" + this.f21404e.getAdIdNumber());
        }
        this.f21405f.mo57490a(this.f21404e);
    }
}
