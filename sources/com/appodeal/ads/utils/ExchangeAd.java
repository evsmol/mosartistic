package com.appodeal.ads.utils;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.appodeal.ads.C9326n5;
import java.util.List;
import java.util.Map;

public class ExchangeAd implements Parcelable {
    public static final int CLICK_REQUEST_ERROR = 1002;
    public static final String CREATIVE_HEIGHT = "X-Appodeal-Creative-Height";
    public static final String CREATIVE_WIDTH = "X-Appodeal-Creative-Width";
    public static final Parcelable.Creator<ExchangeAd> CREATOR = new C9602a();
    public static final int FILL_REQUEST_ERROR = 1004;
    public static final int FINISH_REQUEST_ERROR = 1003;
    public static final int IMPRESSION_REQUEST_ERROR = 1001;
    public static final int LOADING_TIMEOUT_ERROR = 1005;

    /* renamed from: a */
    public final String f24345a;

    /* renamed from: b */
    public final Map<String, List<String>> f24346b;

    /* renamed from: c */
    public int f24347c = -1;

    /* renamed from: d */
    public final long f24348d;

    /* renamed from: com.appodeal.ads.utils.ExchangeAd$a */
    public class C9602a implements Parcelable.Creator<ExchangeAd> {
        public final Object createFromParcel(Parcel parcel) {
            return new ExchangeAd(parcel);
        }

        public final Object[] newArray(int i) {
            return new ExchangeAd[i];
        }
    }

    public ExchangeAd(Parcel parcel) {
        this.f24345a = parcel.readString();
        this.f24346b = parcel.readHashMap(List.class.getClassLoader());
        this.f24347c = parcel.readInt();
        this.f24348d = parcel.readLong();
    }

    public ExchangeAd(String str, Map<String, List<String>> map, long j) {
        this.f24345a = str;
        this.f24346b = map;
        this.f24348d = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28343a() {
        trackError(1002);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m28344b() {
        trackError(1004);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m28345c() {
        trackError(1003);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m28346d() {
        trackError(1001);
    }

    /* renamed from: a */
    public final int mo61031a(String str) {
        List list;
        try {
            Map<String, List<String>> map = this.f24346b;
            if (map != null && map.containsKey(str) && (list = this.f24346b.get(str)) != null && list.size() > 0) {
                return Integer.parseInt((String) list.get(0));
            }
        } catch (Exception e) {
            Log.log(e);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo61032a(String str, String str2, Runnable runnable) {
        Map<String, List<String>> map = this.f24346b;
        if (map != null && map.containsKey(str)) {
            for (String str3 : this.f24346b.get(str)) {
                long j = this.f24348d;
                int i = this.f24347c;
                C9326n5.m27539a(TextUtils.isEmpty(str3) ? null : str3.replace("%%SEGMENT%%", String.valueOf(j)).replace("%25%25SEGMENT%25%25", String.valueOf(j)).replace("%%PLACEMENT%%", String.valueOf(i)).replace("%25%25PLACEMENT%25%25", String.valueOf(i)).replace("%%ERRORCODE%%", str2).replace("%25%25ERRORCODE%25%25", str2), C9650s.f24449e, runnable);
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getAdm() {
        return this.f24345a;
    }

    public int getCloseTime() {
        return mo61031a("X-Appodeal-Close-Time");
    }

    public int getHeight() {
        return mo61031a(CREATIVE_HEIGHT);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r0 = r2.f24346b.get("X-Appodeal-Creative-Type");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType() {
        /*
            r2 = this;
            java.lang.String r0 = "X-Appodeal-Creative-Type"
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r2.f24346b     // Catch:{ Exception -> 0x0024 }
            if (r1 == 0) goto L_0x0028
            boolean r1 = r1.containsKey(r0)     // Catch:{ Exception -> 0x0024 }
            if (r1 == 0) goto L_0x0028
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r2.f24346b     // Catch:{ Exception -> 0x0024 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ Exception -> 0x0024 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0024 }
            if (r0 == 0) goto L_0x0028
            int r1 = r0.size()     // Catch:{ Exception -> 0x0024 }
            if (r1 <= 0) goto L_0x0028
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0024 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0024 }
            return r0
        L_0x0024:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)
        L_0x0028:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.utils.ExchangeAd.getType():java.lang.String");
    }

    public int getWidth() {
        return mo61031a(CREATIVE_WIDTH);
    }

    public void trackClick() {
        mo61032a("X-Appodeal-Url-Click", "", new Runnable() {
            public final void run() {
                ExchangeAd.this.m28343a();
            }
        });
    }

    public void trackError(int i) {
        mo61032a("X-Appodeal-Url-Error", String.valueOf(i), (Runnable) null);
    }

    public void trackFill() {
        mo61032a("X-Appodeal-Url-Fill", "", new Runnable() {
            public final void run() {
                ExchangeAd.this.m28344b();
            }
        });
    }

    public void trackFinish() {
        mo61032a("X-Appodeal-Url-Finish", "", new Runnable() {
            public final void run() {
                ExchangeAd.this.m28345c();
            }
        });
    }

    public void trackImpression(int i) {
        this.f24347c = i;
        mo61032a("X-Appodeal-Url-Impression", "", new Runnable() {
            public final void run() {
                ExchangeAd.this.m28346d();
            }
        });
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f24345a);
        parcel.writeMap(this.f24346b);
        parcel.writeInt(this.f24347c);
        parcel.writeLong(this.f24348d);
    }
}
