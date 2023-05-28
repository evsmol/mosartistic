package com.appodeal.ads;

import android.location.Location;

/* renamed from: com.appodeal.ads.z1 */
public final class C9729z1 implements LocationData {

    /* renamed from: d */
    public static Location f24653d;

    /* renamed from: a */
    public final RestrictedData f24654a;

    /* renamed from: b */
    public final Location f24655b;

    /* renamed from: c */
    public final Integer f24656c;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9729z1(android.content.Context r1, com.appodeal.ads.RestrictedData r2) {
        /*
            r0 = this;
            r0.<init>()
            r0.f24654a = r2
            if (r1 == 0) goto L_0x001d
            com.appodeal.ads.q4 r2 = com.appodeal.ads.C9409q4.f23839a
            r2.getClass()
            boolean r2 = com.appodeal.ads.C9409q4.m27880p()
            if (r2 != 0) goto L_0x001d
            android.location.Location r1 = com.appodeal.ads.C9182f1.m27284i(r1)
            r0.f24655b = r1
            if (r1 == 0) goto L_0x0021
            f24653d = r1
            goto L_0x0021
        L_0x001d:
            android.location.Location r1 = f24653d
            r0.f24655b = r1
        L_0x0021:
            android.location.Location r1 = r0.f24655b
            if (r1 != 0) goto L_0x0027
            r1 = 0
            goto L_0x0028
        L_0x0027:
            r1 = 1
        L_0x0028:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f24656c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9729z1.<init>(android.content.Context, com.appodeal.ads.RestrictedData):void");
    }

    public final Location getDeviceLocation() {
        if (this.f24654a.canSendLocation()) {
            return this.f24655b;
        }
        return null;
    }

    public final Integer getDeviceLocationType() {
        if (this.f24654a.canSendLocationType()) {
            return this.f24656c;
        }
        return null;
    }

    public final Float obtainLatitude() {
        if (!this.f24654a.canSendLocation()) {
            return null;
        }
        Location location = this.f24655b;
        return location != null ? Float.valueOf(Double.valueOf(location.getLatitude()).floatValue()) : C9269l5.m27453a().f23322h;
    }

    public final Location obtainLocation() {
        Float obtainLatitude;
        Float obtainLongitude;
        if (!this.f24654a.canSendLocation() || (obtainLatitude = obtainLatitude()) == null || (obtainLongitude = obtainLongitude()) == null) {
            return null;
        }
        Location location = new Location(DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
        location.setLatitude((double) obtainLatitude.floatValue());
        location.setLongitude((double) obtainLongitude.floatValue());
        return location;
    }

    public final Float obtainLongitude() {
        if (!this.f24654a.canSendLocation()) {
            return null;
        }
        Location location = this.f24655b;
        return location != null ? Float.valueOf(Double.valueOf(location.getLongitude()).floatValue()) : C9269l5.m27453a().f23323i;
    }
}
