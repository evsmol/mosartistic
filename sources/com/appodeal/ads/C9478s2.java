package com.appodeal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.appodeal.ads.Native;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.segments.C9490g;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.unified.UnifiedNativeParams;
import com.appodeal.ads.utils.C9631l;
import com.appodeal.ads.utils.C9634m;
import com.appodeal.ads.utils.C9637n;
import com.appodeal.ads.utils.C9650s;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.appodeal.ads.s2 */
public final class C9478s2 extends C9258l<C9573t2, UnifiedNative, UnifiedNativeParams, UnifiedNativeCallback> {

    /* renamed from: s */
    public ArrayList f24068s;

    /* renamed from: t */
    public int f24069t = 0;

    /* renamed from: u */
    public boolean f24070u = false;

    /* renamed from: com.appodeal.ads.s2$b */
    public static final class C9480b implements UnifiedNativeParams {

        /* renamed from: a */
        public final int f24072a;

        public C9480b(int i) {
            this.f24072a = i;
        }

        public final int getAdCountToLoad() {
            return this.f24072a;
        }

        public final Native.MediaAssetType getMediaAssetType() {
            return Native.f22733c;
        }

        public final Native.NativeAdType getNativeAdType() {
            return Native.f22732b;
        }

        public final String obtainPlacementId() {
            return C9490g.m28075a(Native.m27078a().f24294l);
        }

        public final String obtainSegmentId() {
            return Native.m27078a().mo60856r().toString();
        }
    }

    public C9478s2(C9573t2 t2Var, AdNetwork adNetwork, C9162d0 d0Var) {
        super(t2Var, adNetwork, d0Var, 5000);
    }

    /* renamed from: a */
    public final UnifiedAd mo60071a(AdNetwork adNetwork) {
        return adNetwork.createNativeAd();
    }

    /* renamed from: c */
    public final UnifiedAdCallback mo60074c() {
        return new C9479a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007e, code lost:
        if (m28029a(r3) != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0062 A[Catch:{ Exception -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007a A[Catch:{ Exception -> 0x0081 }] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60721m() {
        /*
            r8 = this;
            int r0 = r8.f24069t
            if (r0 != 0) goto L_0x00d4
            monitor-enter(r8)
            java.util.ArrayList r0 = r8.f24068s     // Catch:{ all -> 0x00d1 }
            if (r0 != 0) goto L_0x0019
            com.appodeal.ads.Native$b r0 = com.appodeal.ads.Native.m27079b()     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.r r1 = r8.mo60101d()     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.t2 r1 = (com.appodeal.ads.C9573t2) r1     // Catch:{ all -> 0x00d1 }
            r0.mo59840a((com.appodeal.ads.C9573t2) r1, (com.appodeal.ads.C9258l) r8)     // Catch:{ all -> 0x00d1 }
            monitor-exit(r8)
            goto L_0x00d4
        L_0x0019:
            boolean r1 = r8.f24070u     // Catch:{ all -> 0x00d1 }
            if (r1 == 0) goto L_0x00cf
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00d1 }
            java.util.ArrayList r1 = r8.f24068s     // Catch:{ all -> 0x00d1 }
            int r1 = r1.size()     // Catch:{ all -> 0x00d1 }
        L_0x0027:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x00d1 }
            if (r2 == 0) goto L_0x0094
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.NativeAd r2 = (com.appodeal.ads.NativeAd) r2     // Catch:{ all -> 0x00d1 }
            r3 = r2
            com.appodeal.ads.l2 r3 = (com.appodeal.ads.C9263l2) r3     // Catch:{ all -> 0x00d1 }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0085
            java.lang.String r6 = r3.f23289d     // Catch:{ Exception -> 0x0081 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0081 }
            if (r6 != 0) goto L_0x0085
            java.lang.String r6 = r3.f23290e     // Catch:{ Exception -> 0x0081 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0081 }
            if (r6 != 0) goto L_0x0085
            com.appodeal.ads.Native$MediaAssetType r6 = com.appodeal.ads.Native.f22733c     // Catch:{ Exception -> 0x0081 }
            com.appodeal.ads.Native$MediaAssetType r7 = com.appodeal.ads.Native.MediaAssetType.IMAGE     // Catch:{ Exception -> 0x0081 }
            if (r6 == r7) goto L_0x005f
            java.lang.String r6 = r3.f23295j     // Catch:{ Exception -> 0x0081 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0081 }
            if (r6 == 0) goto L_0x005f
            android.graphics.Bitmap r6 = r3.f23296k     // Catch:{ Exception -> 0x0081 }
            if (r6 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r6 = 0
            goto L_0x0060
        L_0x005f:
            r6 = 1
        L_0x0060:
            if (r6 == 0) goto L_0x0085
            com.appodeal.ads.Native$MediaAssetType r6 = com.appodeal.ads.Native.f22733c     // Catch:{ Exception -> 0x0081 }
            com.appodeal.ads.Native$MediaAssetType r7 = com.appodeal.ads.Native.MediaAssetType.ICON     // Catch:{ Exception -> 0x0081 }
            if (r6 == r7) goto L_0x0077
            java.lang.String r6 = r3.f23297l     // Catch:{ Exception -> 0x0081 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0081 }
            if (r6 == 0) goto L_0x0077
            android.graphics.Bitmap r6 = r3.f23298m     // Catch:{ Exception -> 0x0081 }
            if (r6 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r6 = 0
            goto L_0x0078
        L_0x0077:
            r6 = 1
        L_0x0078:
            if (r6 == 0) goto L_0x0085
            boolean r3 = m28029a((com.appodeal.ads.C9263l2) r3)     // Catch:{ Exception -> 0x0081 }
            if (r3 == 0) goto L_0x0085
            goto L_0x0086
        L_0x0081:
            r3 = move-exception
            com.appodeal.ads.utils.Log.log(r3)     // Catch:{ all -> 0x00d1 }
        L_0x0085:
            r4 = 0
        L_0x0086:
            if (r4 != 0) goto L_0x0027
            r0.remove()     // Catch:{ Exception -> 0x008f }
            r2.destroy()     // Catch:{ Exception -> 0x008f }
            goto L_0x0027
        L_0x008f:
            r2 = move-exception
            com.appodeal.ads.utils.Log.log(r2)     // Catch:{ all -> 0x00d1 }
            goto L_0x0027
        L_0x0094:
            java.util.ArrayList r0 = r8.f24068s     // Catch:{ all -> 0x00d1 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00d1 }
            if (r0 != 0) goto L_0x00aa
            com.appodeal.ads.Native$b r0 = com.appodeal.ads.Native.m27079b()     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.r r1 = r8.mo60101d()     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.t2 r1 = (com.appodeal.ads.C9573t2) r1     // Catch:{ all -> 0x00d1 }
            r0.mo59858n(r1, r8)     // Catch:{ all -> 0x00d1 }
            goto L_0x00cf
        L_0x00aa:
            if (r1 <= 0) goto L_0x00c2
            r0 = 0
            r1 = 0
            r8.mo60098a(r0, r1)     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.Native$b r0 = com.appodeal.ads.Native.m27079b()     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.r r1 = r8.mo60101d()     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.t2 r1 = (com.appodeal.ads.C9573t2) r1     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.networking.LoadingError r2 = com.appodeal.ads.networking.LoadingError.InvalidAssets     // Catch:{ all -> 0x00d1 }
            r0.mo59838a(r1, r8, (com.appodeal.ads.networking.LoadingError) r2)     // Catch:{ all -> 0x00d1 }
            goto L_0x00cf
        L_0x00c2:
            com.appodeal.ads.Native$b r0 = com.appodeal.ads.Native.m27079b()     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.r r1 = r8.mo60101d()     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.t2 r1 = (com.appodeal.ads.C9573t2) r1     // Catch:{ all -> 0x00d1 }
            r0.mo59840a((com.appodeal.ads.C9573t2) r1, (com.appodeal.ads.C9258l) r8)     // Catch:{ all -> 0x00d1 }
        L_0x00cf:
            monitor-exit(r8)
            goto L_0x00d4
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9478s2.mo60721m():void");
    }

    /* renamed from: n */
    public final void mo60722n() {
        String str;
        ArrayList arrayList = this.f24068s;
        if (arrayList == null) {
            Native.m27079b().mo59838a((C9573t2) this.f23267a, this, (LoadingError) null);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C9263l2 l2Var = (C9263l2) ((NativeAd) it.next());
            String str2 = l2Var.f23295j;
            String str3 = l2Var.f23297l;
            if (l2Var.containsVideo() && TextUtils.isEmpty(str3) && (str = Native.f22734d) != null) {
                l2Var.f23297l = str;
                str3 = str;
            }
            String str4 = l2Var.f23293h;
            String str5 = l2Var.f23294i;
            Native.MediaAssetType mediaAssetType = Native.f22733c;
            Native.MediaAssetType mediaAssetType2 = Native.MediaAssetType.IMAGE;
            if (mediaAssetType != mediaAssetType2) {
                this.f24069t++;
            }
            Native.MediaAssetType mediaAssetType3 = Native.f22733c;
            Native.MediaAssetType mediaAssetType4 = Native.MediaAssetType.ICON;
            if (mediaAssetType3 != mediaAssetType4) {
                this.f24069t++;
            }
            if (Native.f22733c != mediaAssetType2) {
                if (str2 == null || str2.isEmpty()) {
                    this.f24069t--;
                } else {
                    C9650s.f24449e.f24450a.execute(new C9631l(C9148b.f22956b.f22957a.getApplicationContext(), str2, false, new C9382o2(this, l2Var)));
                }
            }
            if (Native.f22733c != mediaAssetType4) {
                if (str3 == null || str3.isEmpty()) {
                    this.f24069t--;
                } else {
                    C9650s.f24449e.f24450a.execute(new C9631l(C9148b.f22956b.f22957a.getApplicationContext(), str3, true, new C9397p2(this, l2Var)));
                }
                if (Native.f22732b == Native.NativeAdType.Video) {
                    if (str4 != null && !str4.isEmpty()) {
                        this.f24069t++;
                        if (!str4.isEmpty()) {
                            C9650s.f24449e.f24450a.execute(new C9634m(C9148b.f22956b.f22957a.getApplicationContext(), new C9407q2(this, l2Var), str4));
                        } else {
                            this.f24069t--;
                        }
                    } else if (str5 != null && !str5.isEmpty()) {
                        this.f24069t++;
                        C9650s.f24449e.f24450a.execute(new C9637n(C9148b.f22956b.f22957a.getApplicationContext(), new C9426r2(this, l2Var), str5));
                    }
                }
            }
        }
        this.f24070u = true;
        mo60721m();
    }

    /* renamed from: o */
    public final ArrayList mo60723o() {
        ArrayList arrayList = this.f24068s;
        return arrayList == null ? new ArrayList() : arrayList;
    }

    /* renamed from: com.appodeal.ads.s2$a */
    public final class C9479a extends UnifiedNativeCallback {
        public C9479a() {
        }

        /* renamed from: a */
        public final C9263l2 mo60724a(int i) {
            ArrayList arrayList = C9478s2.this.f24068s;
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            Iterator it = C9478s2.this.f24068s.iterator();
            while (it.hasNext()) {
                NativeAd nativeAd = (NativeAd) it.next();
                if (nativeAd instanceof C9263l2) {
                    C9263l2 l2Var = (C9263l2) nativeAd;
                    if (i == l2Var.mo60110a()) {
                        return l2Var;
                    }
                }
            }
            return (C9263l2) C9478s2.this.f24068s.get(0);
        }

        public final void onAdClicked() {
            Native.C8989b b = Native.m27079b();
            C9478s2 s2Var = C9478s2.this;
            b.mo59837a((C9420r) (C9573t2) s2Var.f23267a, (C9258l) s2Var, mo60724a(-1), (UnifiedAdCallbackClickTrackListener) null);
        }

        public final void onAdClicked(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
            onAdClicked(-1, unifiedAdCallbackClickTrackListener);
        }

        public final void onAdExpired() {
            Native.C8989b b = Native.m27079b();
            C9478s2 s2Var = C9478s2.this;
            b.m27166e((C9573t2) s2Var.f23267a, s2Var);
        }

        public final void onAdFinished(int i) {
            Native.C8989b b = Native.m27079b();
            C9478s2 s2Var = C9478s2.this;
            b.mo59853i((C9573t2) s2Var.f23267a, s2Var, mo60724a(i));
        }

        public final void onAdInfoRequested(Bundle bundle) {
            C9478s2.this.mo60095a(bundle);
        }

        public final void onAdLoadFailed(LoadingError loadingError) {
            Native.C8989b b = Native.m27079b();
            C9478s2 s2Var = C9478s2.this;
            b.mo59838a((C9573t2) s2Var.f23267a, s2Var, loadingError);
        }

        public final void onAdLoaded(UnifiedNativeAd unifiedNativeAd) {
            C9478s2 s2Var = C9478s2.this;
            UnifiedNativeCallback unifiedNativeCallback = (UnifiedNativeCallback) s2Var.f23274h;
            ArrayList arrayList = s2Var.f24068s;
            if (arrayList == null || unifiedNativeCallback == null) {
                onAdLoadFailed(LoadingError.InternalError);
                return;
            }
            arrayList.add(new C9263l2(s2Var, unifiedNativeAd, unifiedNativeCallback));
            C9478s2.this.mo60722n();
        }

        public final void onAdShowFailed() {
            Native.C8989b b = Native.m27079b();
            C9478s2 s2Var = C9478s2.this;
            b.mo59845b((C9573t2) s2Var.f23267a, s2Var, mo60724a(-1), LoadingError.ShowFailed);
        }

        public final void onAdShown(int i) {
            Native.C8989b b = Native.m27079b();
            C9478s2 s2Var = C9478s2.this;
            b.mo59855j((C9573t2) s2Var.f23267a, s2Var, mo60724a(i));
        }

        public final void printError(String str, Object obj) {
            C9478s2 s2Var = C9478s2.this;
            ((C9573t2) s2Var.f23267a).mo60600a((C9258l) s2Var, str, obj);
        }

        public final void onAdClicked(int i, UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
            Native.C8989b b = Native.m27079b();
            C9478s2 s2Var = C9478s2.this;
            b.mo59837a((C9420r) (C9573t2) s2Var.f23267a, (C9258l) s2Var, mo60724a(i), unifiedAdCallbackClickTrackListener);
        }
    }

    /* renamed from: a */
    public final UnifiedAdParams mo60072a(int i) {
        return new C9480b(i);
    }

    /* renamed from: a */
    public static boolean m28029a(C9263l2 l2Var) {
        if (Native.f22733c == Native.MediaAssetType.ICON || Native.f22732b != Native.NativeAdType.Video || l2Var.f23287b.hasVideo() || l2Var.f23302q != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo60097a(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback, UnifiedAd unifiedAd) {
        UnifiedNativeParams unifiedNativeParams = (UnifiedNativeParams) unifiedAdParams;
        this.f24068s = new ArrayList(unifiedNativeParams.getAdCountToLoad());
        ((UnifiedNative) unifiedAd).load(contextProvider, unifiedNativeParams, obj, (UnifiedNativeCallback) unifiedAdCallback);
    }
}
