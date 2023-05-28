package com.appodeal.advertising;

import com.appodeal.advertising.AdvertisingInfo;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.advertising.b */
public interface C9742b {

    /* renamed from: com.appodeal.advertising.b$a */
    public static final class C9743a implements C9742b {

        /* renamed from: a */
        public final AdvertisingInfo.AdvertisingProfile f24693a;

        public C9743a(AdvertisingInfo.AdvertisingProfile advertisingProfile) {
            Intrinsics.checkNotNullParameter(advertisingProfile, "advertisingProfile");
            this.f24693a = advertisingProfile;
        }

        /* renamed from: a */
        public final AdvertisingInfo.AdvertisingProfile mo61263a() {
            return this.f24693a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9743a) && Intrinsics.areEqual((Object) this.f24693a, (Object) ((C9743a) obj).f24693a);
        }

        public final int hashCode() {
            return this.f24693a.hashCode();
        }

        public final String toString() {
            return "Initialized(advertisingProfile=" + this.f24693a + ')';
        }
    }

    /* renamed from: com.appodeal.advertising.b$b */
    public static final class C9744b implements C9742b {

        /* renamed from: a */
        public static final C9744b f24694a = new C9744b();
    }

    /* renamed from: com.appodeal.advertising.b$c */
    public static final class C9745c implements C9742b {

        /* renamed from: a */
        public static final C9745c f24695a = new C9745c();
    }
}
