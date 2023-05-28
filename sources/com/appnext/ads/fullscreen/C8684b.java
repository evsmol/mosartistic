package com.appnext.ads.fullscreen;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.appnext.ads.C8668a;
import com.appnext.base.p264b.C8850d;
import com.appnext.core.AppnextAd;
import com.appnext.core.C8874Ad;
import com.appnext.core.C8890a;
import com.appnext.core.C8898d;
import com.appnext.core.C8917f;
import com.appnext.core.C8922g;
import com.appnext.core.C8936p;
import com.appnext.core.p267a.C8894b;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.appnext.ads.fullscreen.b */
public final class C8684b extends C8898d {

    /* renamed from: aL */
    private static C8684b f22078aL;

    /* renamed from: aM */
    private final int f22079aM = 30;

    /* renamed from: aN */
    private HashMap<C8874Ad, String> f22080aN = new HashMap<>();

    /* renamed from: j */
    public static synchronized C8684b m26383j() {
        C8684b bVar;
        synchronized (C8684b.class) {
            if (f22078aL == null) {
                f22078aL = new C8684b();
            }
            bVar = f22078aL;
        }
        return bVar;
    }

    private C8684b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo58357a(Context context, C8874Ad ad, String str, ArrayList<Pair<String, String>> arrayList) {
        StringBuilder sb = new StringBuilder("&auid=");
        sb.append(ad != null ? ad.getAUID() : "700");
        sb.append("&vidmin=");
        Object obj = "";
        sb.append(ad == null ? obj : Integer.valueOf(ad.getMinVideoLength()));
        sb.append("&vidmax=");
        if (ad != null) {
            obj = Integer.valueOf(ad.getMaxVideoLength());
        }
        sb.append(obj);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo58354a(Context context, C8922g gVar) {
        int i;
        AppnextAd appnextAd = (AppnextAd) gVar;
        FullscreenAd fullscreenAd = new FullscreenAd(appnextAd);
        if (!fullscreenAd.getCampaignGoal().equals(C8894b.f22528hX) || !C8917f.m26946c(context, fullscreenAd.getAdPackage())) {
            i = (!fullscreenAd.getCampaignGoal().equals(C8894b.f22529hY) || C8917f.m26946c(context, fullscreenAd.getAdPackage())) ? 0 : 2;
        } else {
            i = 1;
        }
        int b = m26379b(context, appnextAd);
        if (i == 0 && b == 0) {
            return 0;
        }
        return i != 0 ? i : b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo58363a(C8874Ad ad) {
        return super.mo58363a(ad) && m26382e(ad);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo58362a(Context context, C8874Ad ad, ArrayList<?> arrayList) {
        return mo58356a(context, ad, (ArrayList<AppnextAd>) arrayList, "") != null;
    }

    /* renamed from: a */
    private void m26378a(Context context, C8874Ad ad, AppnextAd appnextAd) throws Exception {
        String str;
        if (!appnextAd.getImageURL().equals("")) {
            C8917f.m26913Y(appnextAd.getImageURL());
        }
        if (!appnextAd.getWideImageURL().equals("")) {
            C8917f.m26913Y(appnextAd.getWideImageURL());
        }
        Video video = (Video) ad;
        String videoUrl = getVideoUrl(appnextAd, video.getVideoLength());
        String c = m26381c(videoUrl);
        if (Video.getCacheVideo()) {
            str = context.getFilesDir().getAbsolutePath() + "/data/appnext/videos/";
        } else {
            str = context.getFilesDir().getAbsolutePath() + "/data/appnext/videos/" + "tmp/vid" + video.rnd + "/";
        }
        File file = new File(str + c);
        if (file.exists()) {
            file.setLastModified(System.currentTimeMillis());
            StringBuilder sb = new StringBuilder();
            sb.append(file.getPath());
            sb.append(" exists");
            this.f22080aN.put(ad, file.getAbsolutePath());
        } else if (!Video.isStreamingModeEnabled()) {
            new File(str).mkdirs();
            URL url = new URL(videoUrl);
            url.openConnection().connect();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream(), 1024);
            FileOutputStream fileOutputStream = new FileOutputStream(str + c + C8850d.f22419eY);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    StringBuilder sb2 = new StringBuilder("downloaded ");
                    sb2.append(str);
                    sb2.append(c);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    bufferedInputStream.close();
                    File file2 = new File(str + c + C8850d.f22419eY);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(c);
                    file2.renameTo(new File(sb3.toString()));
                    file2.delete();
                    this.f22080aN.put(ad, file.getAbsolutePath());
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m26377a(Context context, C8874Ad ad) {
        int i;
        int i2;
        try {
            File[] listFiles = new File(context.getFilesDir().getAbsolutePath() + "/data/appnext/videos/").listFiles();
            Arrays.sort(listFiles, new Comparator<File>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return Long.valueOf(((File) obj).lastModified()).compareTo(Long.valueOf(((File) obj2).lastModified()));
                }

                /* renamed from: a */
                public static int m26399a(File file, File file2) {
                    return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
                }
            });
            if (Video.getCacheVideo()) {
                if (ad instanceof FullScreenVideo) {
                    i2 = Integer.parseInt(C8686c.m26400m().get("num_saved_videos"));
                } else {
                    i2 = Integer.parseInt(C8704f.m26418q().get("num_saved_videos"));
                }
                i = i2 - 1;
            } else {
                i = 0;
            }
            if (listFiles.length > i) {
                for (int i3 = 0; i3 < listFiles.length - i; i3++) {
                    listFiles[i3].delete();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58359a(C8874Ad ad, String str, String str2) {
        if (ad != null) {
            C8917f.m26926a(ad.getTID(), ad.getVID(), ad.getAUID(), str2, str, C8668a.f22021k, "sdk", "", "");
        } else {
            C8917f.m26926a("300", "2.5.1.472", "700", str2, str, C8668a.f22021k, "sdk", "", "");
        }
        new StringBuilder("error ").append(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> void mo58361a(String str, C8874Ad ad, T t) {
        C8917f.m26926a(ad.getTID(), ad.getVID(), ad.getAUID(), str, ((Video) ad).getSessionId(), C8668a.f22020j, "sdk", "", "");
    }

    protected static String getVideoUrl(AppnextAd appnextAd, String str) {
        String str2;
        if (str.equals("30")) {
            str2 = appnextAd.getVideoUrlHigh30Sec();
            if (str2.equals("")) {
                str2 = appnextAd.getVideoUrlHigh();
            }
        } else {
            str2 = appnextAd.getVideoUrlHigh();
            if (str2.equals("")) {
                str2 = appnextAd.getVideoUrlHigh30Sec();
            }
        }
        StringBuilder sb = new StringBuilder("returning video url for: ");
        sb.append(appnextAd.getBannerID());
        sb.append(" with len: ");
        sb.append(str);
        sb.append(" url: ");
        sb.append(str2);
        return str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58360a(String str, C8874Ad ad) {
        super.mo58360a(str, ad);
        if (this.f22080aN.containsKey(ad)) {
            this.f22080aN.remove(ad);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo58365b(C8874Ad ad) {
        try {
            if (!mo58990h(ad) || mo58993k(ad).mo58956aU().longValue() + mo58992j(ad) + 300000 < System.currentTimeMillis() || !m26382e(ad)) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C8936p mo58366c(C8874Ad ad) {
        return ad instanceof RewardedVideo ? C8704f.m26418q() : C8686c.m26400m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo58367d(C8874Ad ad) {
        try {
            return mo58363a(ad) && m26382e(ad);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private boolean m26382e(C8874Ad ad) {
        if (Video.isStreamingModeEnabled()) {
            return true;
        }
        if (!this.f22080aN.containsKey(ad)) {
            return false;
        }
        return new File(this.f22080aN.get(ad)).exists();
    }

    /* renamed from: b */
    private static boolean m26380b(AppnextAd appnextAd) {
        return !appnextAd.getVideoUrlHigh().equals("") || !appnextAd.getVideoUrlHigh30Sec().equals("");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final AppnextAd mo58364b(Context context, C8874Ad ad) {
        return mo58355a(context, ad, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo58355a(Context context, C8874Ad ad, String str) {
        ArrayList<?> ads;
        if (mo58993k(ad) == null || (ads = mo58993k(ad).getAds()) == null) {
            return null;
        }
        return mo58356a(context, ad, (ArrayList<AppnextAd>) ads, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo58356a(Context context, C8874Ad ad, ArrayList<AppnextAd> arrayList, String str) {
        Iterator<AppnextAd> it = arrayList.iterator();
        while (it.hasNext()) {
            AppnextAd next = it.next();
            if (m26380b(next) && !m26851a(next.getBannerID(), ad.getPlacementID()) && !next.getBannerID().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final ArrayList<AppnextAd> mo58368f(C8874Ad ad) {
        return mo58993k(ad).getAds();
    }

    /* renamed from: a */
    private static int m26376a(Context context, AppnextAd appnextAd) {
        FullscreenAd fullscreenAd = new FullscreenAd(appnextAd);
        if (!fullscreenAd.getCampaignGoal().equals(C8894b.f22528hX) || !C8917f.m26946c(context, fullscreenAd.getAdPackage())) {
            return (!fullscreenAd.getCampaignGoal().equals(C8894b.f22529hY) || C8917f.m26946c(context, fullscreenAd.getAdPackage())) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    private static int m26379b(Context context, AppnextAd appnextAd) {
        FullscreenAd fullscreenAd = new FullscreenAd(appnextAd);
        if (!fullscreenAd.getCptList().equals("") && !fullscreenAd.getCptList().equals("[]")) {
            try {
                JSONArray jSONArray = new JSONArray(fullscreenAd.getCptList());
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (C8917f.m26946c(context, jSONArray.getString(i))) {
                        return 0;
                    }
                }
                return 3;
            } catch (JSONException unused) {
            }
        }
        return 0;
    }

    /* renamed from: c */
    protected static String m26381c(String str) {
        String substring = str.substring(str.lastIndexOf("/") + 1);
        if (substring.contains("?")) {
            substring = substring.substring(0, substring.indexOf("?"));
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("rnd");
            if (queryParameter == null || queryParameter.equals("")) {
                return substring;
            }
            return substring.substring(0, substring.lastIndexOf(46)) + "_" + queryParameter + substring.substring(substring.lastIndexOf(46));
        } catch (Throwable unused) {
            return substring;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58358a(Context context, C8874Ad ad, C8890a aVar) throws Exception {
        AppnextAd a;
        int i;
        int i2;
        try {
            File[] listFiles = new File(context.getFilesDir().getAbsolutePath() + "/data/appnext/videos/").listFiles();
            Arrays.sort(listFiles, new Comparator<File>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return Long.valueOf(((File) obj).lastModified()).compareTo(Long.valueOf(((File) obj2).lastModified()));
                }

                /* renamed from: a */
                public static int m26399a(File file, File file2) {
                    return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
                }
            });
            if (Video.getCacheVideo()) {
                if (ad instanceof FullScreenVideo) {
                    i2 = Integer.parseInt(C8686c.m26400m().get("num_saved_videos"));
                } else {
                    i2 = Integer.parseInt(C8704f.m26418q().get("num_saved_videos"));
                }
                i = i2 - 1;
            } else {
                i = 0;
            }
            if (listFiles.length > i) {
                for (int i3 = 0; i3 < listFiles.length - i; i3++) {
                    listFiles[i3].delete();
                }
            }
        } catch (Throwable unused) {
        }
        AppnextAd appnextAd = null;
        try {
            AppnextAd b = mo58364b(context, ad);
            if (b != null) {
                m26378a(context, ad, b);
                if (ad instanceof RewardedVideo) {
                    String mode = ((RewardedVideo) ad).getMode();
                    if (mode.equals(RewardedVideo.VIDEO_MODE_DEFAULT)) {
                        mode = C8704f.m26418q().get("default_mode");
                    }
                    if (mode.equals("multi") && (a = mo58355a(context, ad, b.getBannerID())) != null) {
                        m26378a(context, ad, a);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new Exception("No video ads");
        } catch (Throwable th) {
            if (appnextAd != null) {
                mo58360a(appnextAd.getBannerID(), ad);
            }
            throw th;
        }
    }
}
