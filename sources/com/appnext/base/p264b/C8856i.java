package com.appnext.base.p264b;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* renamed from: com.appnext.base.b.i */
public final class C8856i {
    private static final String TAG = "LibrarySettings";

    /* renamed from: fA */
    public static final String f22443fA = "_cycles";

    /* renamed from: fB */
    public static final String f22444fB = "google_ads_id";

    /* renamed from: fC */
    public static final String f22445fC = "lat";

    /* renamed from: fD */
    public static final String f22446fD = "lib_shared_preferences";

    /* renamed from: fE */
    private static final C8856i f22447fE = new C8856i();

    /* renamed from: fy */
    public static final String f22448fy = "_lastupdate";

    /* renamed from: fz */
    public static final String f22449fz = "_lastcollectedtime";

    /* renamed from: fx */
    private SharedPreferences f22450fx;
    private Context mContext;

    private C8856i() {
        Context context = C8852e.getContext();
        this.mContext = context;
        if (context != null) {
            this.f22450fx = context.getSharedPreferences(TAG, 0);
        }
    }

    /* renamed from: aR */
    public static C8856i m26695aR() {
        return f22447fE;
    }

    public final void clear() {
        this.f22450fx.edit().clear().apply();
    }

    public final void init(Context context) {
        if (context != null) {
            this.mContext = context;
            this.f22450fx = context.getSharedPreferences(f22446fD, 0);
        }
    }

    public final String getString(String str, String str2) {
        SharedPreferences sharedPreferences = this.f22450fx;
        return sharedPreferences != null ? sharedPreferences.getString(str, str2) : str2;
    }

    public final long getLong(String str, long j) {
        SharedPreferences sharedPreferences = this.f22450fx;
        return sharedPreferences != null ? sharedPreferences.getLong(str, j) : j;
    }

    public final int getInt(String str, int i) {
        SharedPreferences sharedPreferences = this.f22450fx;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(str, 0);
        }
        return 0;
    }

    public final boolean getBoolean(String str, boolean z) {
        SharedPreferences sharedPreferences = this.f22450fx;
        return sharedPreferences != null ? sharedPreferences.getBoolean(str, z) : z;
    }

    public final void putLong(String str, long j) {
        SharedPreferences sharedPreferences = this.f22450fx;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong(str, j).apply();
        }
    }

    public final void putInt(String str, int i) {
        SharedPreferences sharedPreferences = this.f22450fx;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt(str, i).apply();
        }
    }

    public final void putBoolean(String str, boolean z) {
        SharedPreferences sharedPreferences = this.f22450fx;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(str, true).apply();
        }
    }

    public final void putString(String str, String str2) {
        SharedPreferences sharedPreferences = this.f22450fx;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    public final Set<String> getStringSet(String str, Set<String> set) {
        SharedPreferences sharedPreferences = this.f22450fx;
        return sharedPreferences != null ? sharedPreferences.getStringSet(str, set) : set;
    }

    public final void putStringSet(String str, Set<String> set) {
        SharedPreferences sharedPreferences = this.f22450fx;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove(str);
            this.f22450fx.edit().putStringSet(str, set).apply();
        }
    }

    /* renamed from: aS */
    private SharedPreferences m26696aS() {
        return this.mContext.getSharedPreferences(TAG, 0);
    }
}
