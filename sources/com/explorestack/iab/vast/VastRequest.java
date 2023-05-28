package com.explorestack.iab.vast;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.iab.CacheControl;
import com.explorestack.iab.measurer.VastAdMeasurer;
import com.explorestack.iab.utils.Utils;
import com.explorestack.iab.vast.VastUrlProcessorRegistry;
import com.explorestack.iab.vast.activity.VastActivity;
import com.explorestack.iab.vast.activity.VastView;
import com.explorestack.iab.vast.processor.C1465a;
import com.explorestack.iab.vast.processor.C1468b;
import com.explorestack.iab.vast.processor.C1469c;
import com.explorestack.iab.vast.processor.C1470d;
import com.explorestack.iab.vast.processor.VastAd;
import com.explorestack.iab.vast.tags.AppodealExtensionTag;
import com.explorestack.iab.vast.tags.MediaFileTag;
import com.explorestack.protobuf.openrtb.LossReason;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public class VastRequest {

    /* renamed from: y */
    public static int f4353y = 5;

    /* renamed from: z */
    public static final VastUrlProcessorRegistry.C1421b f4354z = new C1415f();

    /* renamed from: a */
    public final String f4355a = UUID.randomUUID().toString();

    /* renamed from: b */
    public CacheControl f4356b = CacheControl.FullLoad;

    /* renamed from: c */
    public Uri f4357c;

    /* renamed from: d */
    public VastAd f4358d;

    /* renamed from: e */
    public String f4359e;

    /* renamed from: f */
    public VideoType f4360f = VideoType.NonRewarded;

    /* renamed from: g */
    public Bundle f4361g;

    /* renamed from: h */
    public C1468b<MediaFileTag> f4362h;

    /* renamed from: i */
    public C1463d f4363i;

    /* renamed from: j */
    public float f4364j = 3.0f;

    /* renamed from: k */
    public float f4365k = -1.0f;

    /* renamed from: l */
    public float f4366l;

    /* renamed from: m */
    public boolean f4367m;

    /* renamed from: n */
    public int f4368n;

    /* renamed from: o */
    public int f4369o = 0;

    /* renamed from: p */
    public boolean f4370p;

    /* renamed from: q */
    public boolean f4371q = false;

    /* renamed from: r */
    public boolean f4372r = true;

    /* renamed from: s */
    public boolean f4373s = true;

    /* renamed from: t */
    public boolean f4374t = false;

    /* renamed from: u */
    public boolean f4375u = false;

    /* renamed from: v */
    public int f4376v = -1;

    /* renamed from: w */
    public final AtomicBoolean f4377w = new AtomicBoolean(false);

    /* renamed from: x */
    public final AtomicBoolean f4378x = new AtomicBoolean(false);

    public class Builder {
        public Builder() {
        }

        public Builder addExtra(String str, String str2) {
            VastRequest.this.addExtra(str, str2);
            return this;
        }

        public VastRequest build() {
            return VastRequest.this;
        }

        public Builder forceUseNativeCloseTime(boolean z) {
            boolean unused = VastRequest.this.f4367m = z;
            return this;
        }

        public Builder setAutoClose(boolean z) {
            boolean unused = VastRequest.this.f4370p = z;
            return this;
        }

        public Builder setCacheControl(CacheControl cacheControl) {
            CacheControl unused = VastRequest.this.f4356b = cacheControl;
            return this;
        }

        public Builder setCompanionCloseTime(int i) {
            float unused = VastRequest.this.f4366l = (float) i;
            return this;
        }

        public Builder setMaxDuration(int i) {
            int unused = VastRequest.this.f4368n = i;
            return this;
        }

        public Builder setPlaceholderTimeoutSec(float f) {
            float unused = VastRequest.this.f4364j = f;
            return this;
        }

        public Builder setVideoCloseTime(int i) {
            float unused = VastRequest.this.f4365k = (float) i;
            return this;
        }

        public Builder setXmlUrl(String str) {
            String unused = VastRequest.this.f4359e = str;
            return this;
        }
    }

    /* renamed from: com.explorestack.iab.vast.VastRequest$b */
    public class C1411b extends Thread {

        /* renamed from: a */
        public final /* synthetic */ Context f4380a;

        /* renamed from: b */
        public final /* synthetic */ String f4381b;

        /* renamed from: c */
        public final /* synthetic */ VastRequestListener f4382c;

        public C1411b(Context context, String str, VastRequestListener vastRequestListener) {
            this.f4380a = context;
            this.f4381b = str;
            this.f4382c = vastRequestListener;
        }

        public void run() {
            VastRequest.this.loadVideoWithDataSync(this.f4380a, this.f4381b, this.f4382c);
        }
    }

    /* renamed from: com.explorestack.iab.vast.VastRequest$c */
    public class C1412c extends Thread {

        /* renamed from: a */
        public final /* synthetic */ Context f4384a;

        /* renamed from: b */
        public final /* synthetic */ VastRequestListener f4385b;

        public C1412c(Context context, VastRequestListener vastRequestListener) {
            this.f4384a = context;
            this.f4385b = vastRequestListener;
        }

        public void run() {
            VastRequest vastRequest = VastRequest.this;
            vastRequest.mo4172a(this.f4384a, vastRequest.f4358d, this.f4385b);
        }
    }

    /* renamed from: com.explorestack.iab.vast.VastRequest$d */
    public class C1413d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ VastRequestListener f4387a;

        public C1413d(VastRequestListener vastRequestListener) {
            this.f4387a = vastRequestListener;
        }

        public void run() {
            this.f4387a.onVastLoaded(VastRequest.this);
        }
    }

    /* renamed from: com.explorestack.iab.vast.VastRequest$e */
    public class C1414e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ VastErrorListener f4389a;

        /* renamed from: b */
        public final /* synthetic */ Context f4390b;

        /* renamed from: c */
        public final /* synthetic */ int f4391c;

        public C1414e(VastErrorListener vastErrorListener, Context context, int i) {
            this.f4389a = vastErrorListener;
            this.f4390b = context;
            this.f4391c = i;
        }

        public void run() {
            int i;
            VastRequest vastRequest;
            Context context;
            VastErrorListener vastErrorListener;
            if (VastRequest.this.f4356b != CacheControl.PartialLoad || !VastRequest.this.f4377w.get() || VastRequest.this.f4378x.get()) {
                vastErrorListener = this.f4389a;
                context = this.f4390b;
                vastRequest = VastRequest.this;
                i = this.f4391c;
            } else {
                vastErrorListener = this.f4389a;
                context = this.f4390b;
                vastRequest = VastRequest.this;
                i = 4;
            }
            vastErrorListener.onVastError(context, vastRequest, i);
        }
    }

    /* renamed from: com.explorestack.iab.vast.VastRequest$f */
    public class C1415f implements VastUrlProcessorRegistry.C1421b {
        /* renamed from: a */
        public void mo4222a(String str) {
            VastLog.m6354d("VastRequest", String.format("Fire url: %s", new Object[]{str}));
            Utils.httpGetURL(str);
        }
    }

    /* renamed from: com.explorestack.iab.vast.VastRequest$g */
    public class C1416g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ VastAd f4393a;

        public C1416g(VastAd vastAd) {
            this.f4393a = vastAd;
        }

        public void run() {
            if (VastRequest.this.f4363i != null) {
                VastRequest.this.f4363i.mo4387a(VastRequest.this, this.f4393a);
            }
        }
    }

    /* renamed from: com.explorestack.iab.vast.VastRequest$h */
    public class C1417h implements Runnable {
        public C1417h() {
        }

        public void run() {
            if (VastRequest.this.f4363i != null) {
                VastRequest.this.f4363i.mo4386a(VastRequest.this);
            }
        }
    }

    /* renamed from: com.explorestack.iab.vast.VastRequest$i */
    public static /* synthetic */ class C1418i {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4396a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.explorestack.iab.CacheControl[] r0 = com.explorestack.iab.CacheControl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4396a = r0
                com.explorestack.iab.CacheControl r1 = com.explorestack.iab.CacheControl.FullLoad     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4396a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.explorestack.iab.CacheControl r1 = com.explorestack.iab.CacheControl.Stream     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4396a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.explorestack.iab.CacheControl r1 = com.explorestack.iab.CacheControl.PartialLoad     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.vast.VastRequest.C1418i.<clinit>():void");
        }
    }

    /* renamed from: com.explorestack.iab.vast.VastRequest$j */
    public class C1419j implements Comparable {

        /* renamed from: a */
        public long f4397a;

        /* renamed from: b */
        public File f4398b;

        public C1419j(File file) {
            this.f4398b = file;
            this.f4397a = file.lastModified();
        }

        public int compareTo(Object obj) {
            int i = (this.f4397a > ((C1419j) obj).f4397a ? 1 : (this.f4397a == ((C1419j) obj).f4397a ? 0 : -1));
            if (i > 0) {
                return -1;
            }
            return i == 0 ? 0 : 1;
        }
    }

    private VastRequest() {
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static void setCacheSize(int i) {
        if (i > 0) {
            f4353y = i;
        }
    }

    /* renamed from: a */
    public final Uri mo4167a(Context context, String str) {
        String b = mo4176b(context);
        if (b != null) {
            File file = new File(b);
            if (!file.exists()) {
                file.mkdirs();
            }
            String str2 = "temp" + System.currentTimeMillis();
            String replace = str.substring(0, Math.min(230 - file.getPath().length(), str.length())).replace("/", "").replace(":", "");
            File file2 = new File(file, replace);
            if (file2.exists()) {
                return Uri.fromFile(file2);
            }
            File file3 = new File(file, str2);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            long contentLength = (long) httpURLConnection.getContentLength();
            long j = 0;
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                j += (long) read;
            }
            fileOutputStream.close();
            if (contentLength == j) {
                file3.renameTo(new File(file, replace));
            }
            return Uri.fromFile(new File(file, replace));
        }
        throw new FileNotFoundException("No dir for caching file");
    }

    /* renamed from: a */
    public final synchronized void mo4168a() {
        if (this.f4363i != null) {
            Utils.onUiThread(new C1417h());
        }
    }

    /* renamed from: a */
    public final void mo4169a(int i) {
        try {
            sendError(i);
        } catch (Exception e) {
            VastLog.m6353a("VastRequest", (Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo4170a(Context context) {
        File[] listFiles;
        try {
            String b = mo4176b(context);
            if (b != null && (listFiles = new File(b).listFiles()) != null && listFiles.length > f4353y) {
                C1419j[] jVarArr = new C1419j[listFiles.length];
                for (int i = 0; i < listFiles.length; i++) {
                    jVarArr[i] = new C1419j(listFiles[i]);
                }
                Arrays.sort(jVarArr);
                for (int i2 = 0; i2 < listFiles.length; i2++) {
                    listFiles[i2] = jVarArr[i2].f4398b;
                }
                for (int i3 = f4353y; i3 < listFiles.length; i3++) {
                    if (!Uri.fromFile(listFiles[i3]).equals(this.f4357c)) {
                        listFiles[i3].delete();
                    }
                }
            }
        } catch (Exception e) {
            VastLog.m6353a("VastRequest", (Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo4171a(Context context, int i, VastErrorListener vastErrorListener) {
        VastLog.m6354d("VastRequest", "sendError, code: " + i);
        if (VastError.m6349a(i)) {
            mo4169a(i);
        }
        if (vastErrorListener != null) {
            Utils.onUiThread(new C1414e(vastErrorListener, context, i));
        }
    }

    /* renamed from: a */
    public final void mo4172a(Context context, VastAd vastAd, VastRequestListener vastRequestListener) {
        String str;
        try {
            Uri a = mo4167a(context, vastAd.getPickedMediaFileTag().getText());
            if (a != null && !TextUtils.isEmpty(a.getPath())) {
                if (new File(a.getPath()).exists()) {
                    Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(a.getPath(), 1);
                    if (createVideoThumbnail == null) {
                        str = "video file not supported";
                        VastLog.m6354d("VastRequest", str);
                    } else if (!createVideoThumbnail.equals(Bitmap.createBitmap(createVideoThumbnail.getWidth(), createVideoThumbnail.getHeight(), createVideoThumbnail.getConfig()))) {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(context, a);
                            long parseLong = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                            int i = this.f4368n;
                            if (i != 0) {
                                if (parseLong > ((long) i)) {
                                    mo4168a();
                                    mo4171a(context, (int) LossReason.LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE, (VastErrorListener) vastRequestListener);
                                    mo4170a(context);
                                    return;
                                }
                            }
                            this.f4357c = a;
                            mo4174a(vastAd);
                            mo4173a(vastRequestListener);
                        } catch (Exception e) {
                            VastLog.m6353a("VastRequest", (Throwable) e);
                        }
                        mo4170a(context);
                        return;
                    } else {
                        str = "empty thumbnail";
                        VastLog.m6354d("VastRequest", str);
                    }
                    mo4168a();
                    mo4171a(context, (int) TTAdConstant.DEEPLINK_UNAVAILABLE_CODE, (VastErrorListener) vastRequestListener);
                    mo4170a(context);
                    return;
                }
            }
            VastLog.m6354d("VastRequest", "fileUri is null");
            mo4168a();
            mo4171a(context, 301, (VastErrorListener) vastRequestListener);
        } catch (Exception unused) {
            VastLog.m6354d("VastRequest", "exception when to cache file");
            mo4168a();
            mo4171a(context, 301, (VastErrorListener) vastRequestListener);
        }
    }

    /* renamed from: a */
    public final void mo4173a(VastRequestListener vastRequestListener) {
        if (!this.f4377w.getAndSet(true)) {
            VastLog.m6354d("VastRequest", "sendReady");
            if (vastRequestListener != null) {
                Utils.onUiThread(new C1413d(vastRequestListener));
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo4174a(VastAd vastAd) {
        if (this.f4363i != null) {
            Utils.onUiThread(new C1416g(vastAd));
        }
    }

    public void addExtra(String str, String str2) {
        if (this.f4361g == null) {
            this.f4361g = new Bundle();
        }
        this.f4361g.putString(str, str2);
    }

    /* renamed from: b */
    public final String mo4176b(Context context) {
        File externalFilesDir = context.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getPath() + "/vast_rtb_cache/";
    }

    public boolean canDisplay() {
        return this.f4377w.get() && (this.f4356b != CacheControl.FullLoad || checkFile());
    }

    public boolean checkFile() {
        try {
            Uri uri = this.f4357c;
            return uri != null && !TextUtils.isEmpty(uri.getPath()) && new File(this.f4357c.getPath()).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public void display(Context context, VideoType videoType, VastActivityListener vastActivityListener) {
        display(context, videoType, vastActivityListener, (VastPlaybackListener) null, (VastAdMeasurer) null);
    }

    public void display(Context context, VideoType videoType, VastActivityListener vastActivityListener, VastPlaybackListener vastPlaybackListener, VastAdMeasurer vastAdMeasurer) {
        this.f4378x.set(true);
        VastLog.m6354d("VastRequest", "play");
        if (this.f4358d == null) {
            VastLog.m6354d("VastRequest", "vastAd is null; nothing to play");
        } else if (Utils.isNetworkAvailable(context)) {
            this.f4360f = videoType;
            this.f4369o = context.getResources().getConfiguration().orientation;
            if (!new VastActivity.Builder().setRequest(this).setListener(vastActivityListener).setPlaybackListener(vastPlaybackListener).setAdMeasurer(vastAdMeasurer).display(context)) {
                mo4171a(context, 2, (VastErrorListener) vastActivityListener);
            }
        } else {
            mo4171a(context, 1, (VastErrorListener) vastActivityListener);
        }
    }

    public void display(VastView vastView) {
        this.f4378x.set(true);
        if (this.f4358d != null) {
            this.f4360f = VideoType.NonRewarded;
            C1462c.m6524b(this);
            vastView.display(this, Boolean.FALSE);
            return;
        }
        VastLog.m6354d("VastRequest", "vastAd is null; nothing to play");
    }

    public void fireErrorUrls(List<String> list, Bundle bundle) {
        fireUrls(list, bundle);
    }

    public void fireUrls(List<String> list, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f4361g;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (list != null) {
            VastUrlProcessorRegistry.m6380a(list, bundle2, f4354z);
        } else {
            VastLog.m6354d("VastRequest", "Url list is null");
        }
    }

    public CacheControl getCacheControl() {
        return this.f4356b;
    }

    public float getCompanionCloseTime() {
        return this.f4366l;
    }

    public Uri getFileUri() {
        return this.f4357c;
    }

    public int getForceOrientation() {
        return this.f4376v;
    }

    public String getId() {
        return this.f4355a;
    }

    public int getMaxDurationMillis() {
        return this.f4368n;
    }

    public float getPlaceholderTimeoutSec() {
        return this.f4364j;
    }

    public int getPreferredVideoOrientation() {
        if (!shouldUseScreenSizeForVideoOrientation()) {
            return 0;
        }
        VastAd vastAd = this.f4358d;
        if (vastAd == null) {
            return 2;
        }
        MediaFileTag pickedMediaFileTag = vastAd.getPickedMediaFileTag();
        return Utils.orientationBySize(pickedMediaFileTag.getWidth(), pickedMediaFileTag.getHeight());
    }

    public int getRequestedOrientation() {
        return this.f4369o;
    }

    public VastAd getVastAd() {
        return this.f4358d;
    }

    public float getVideoCloseTime() {
        return this.f4365k;
    }

    public VideoType getVideoType() {
        return this.f4360f;
    }

    public boolean isAutoClose() {
        return this.f4370p;
    }

    public boolean isForceUseNativeCloseTime() {
        return this.f4367m;
    }

    public boolean isR1() {
        return this.f4374t;
    }

    public boolean isR2() {
        return this.f4375u;
    }

    public void loadVideoWithData(Context context, String str, VastRequestListener vastRequestListener) {
        int i;
        VastLog.m6354d("VastRequest", "loadVideoWithData\n" + str);
        this.f4358d = null;
        if (Utils.isNetworkAvailable(context)) {
            try {
                new C1411b(context, str, vastRequestListener).start();
            } catch (Exception unused) {
                i = 301;
            }
        } else {
            i = 1;
            mo4171a(context, i, (VastErrorListener) vastRequestListener);
        }
    }

    public void loadVideoWithDataSync(Context context, String str, VastRequestListener vastRequestListener) {
        C1468b bVar = this.f4362h;
        if (bVar == null) {
            bVar = new C1465a(context);
        }
        C1470d a = new C1469c(this, bVar).mo4435a(str);
        if (!a.mo4451d()) {
            mo4171a(context, a.mo4449b(), (VastErrorListener) vastRequestListener);
            return;
        }
        VastAd c = a.mo4450c();
        this.f4358d = c;
        c.setVastRequest(this);
        AppodealExtensionTag appodealExtension = this.f4358d.getAppodealExtension();
        if (appodealExtension != null) {
            Boolean isAutoRotate = appodealExtension.isAutoRotate();
            if (isAutoRotate != null) {
                if (isAutoRotate.booleanValue()) {
                    this.f4371q = false;
                    this.f4372r = false;
                } else {
                    this.f4371q = true;
                    this.f4372r = true;
                }
            }
            if (appodealExtension.getPostBannerTag().getCloseTimeSec() > 0.0f) {
                this.f4366l = appodealExtension.getPostBannerTag().getCloseTimeSec();
            }
            if (appodealExtension.getCloseTimeSec() != null) {
                this.f4365k = appodealExtension.getCloseTimeSec().floatValue();
            }
            this.f4374t = appodealExtension.isR1();
            this.f4375u = appodealExtension.isR2();
            Integer forceOrientation = appodealExtension.getForceOrientation();
            if (forceOrientation != null) {
                this.f4376v = forceOrientation.intValue();
            }
        }
        int i = C1418i.f4396a[this.f4356b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                mo4173a(vastRequestListener);
                return;
            } else if (i == 3) {
                mo4173a(vastRequestListener);
            } else {
                return;
            }
        }
        mo4172a(context, this.f4358d, vastRequestListener);
    }

    public void performCache(Context context, VastRequestListener vastRequestListener) {
        if (this.f4358d == null) {
            mo4168a();
            mo4171a(context, 5, (VastErrorListener) vastRequestListener);
            return;
        }
        try {
            new C1412c(context, vastRequestListener).start();
        } catch (Exception unused) {
            mo4168a();
            mo4171a(context, 301, (VastErrorListener) vastRequestListener);
        }
    }

    public void sendError(int i) {
        if (this.f4358d != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("params_error_code", i);
            fireErrorUrls(this.f4358d.getErrorUrlList(), bundle);
        }
    }

    public synchronized void setVastFileLoadedListener(C1463d dVar) {
        this.f4363i = dVar;
    }

    public boolean shouldPreloadCompanion() {
        return this.f4373s;
    }

    public boolean shouldUseScreenSizeForCompanionOrientation() {
        return this.f4372r;
    }

    public boolean shouldUseScreenSizeForVideoOrientation() {
        return this.f4371q;
    }
}
