package com.explorestack.iab.mraid;

import android.content.Context;
import java.util.Arrays;

/* renamed from: com.explorestack.iab.mraid.c */
public final class C1357c {

    /* renamed from: a */
    public boolean f4167a;

    /* renamed from: b */
    public int f4168b;

    public C1357c(boolean z, int i) {
        this.f4167a = z;
        this.f4168b = i;
    }

    /* renamed from: a */
    public static int m6092a(String str) {
        int indexOf = Arrays.asList(new String[]{"portrait", "landscape", "none"}).indexOf(str);
        if (indexOf != -1) {
            return indexOf;
        }
        return 2;
    }

    /* renamed from: a */
    public int mo3888a(Context context) {
        int i = context.getResources().getConfiguration().orientation == 1 ? 1 : 0;
        int i2 = this.f4168b;
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 0;
        }
        if (this.f4167a) {
            return -1;
        }
        return i;
    }

    /* renamed from: a */
    public String mo3889a() {
        int i = this.f4168b;
        return i != 0 ? i != 1 ? i != 2 ? "error" : "none" : "landscape" : "portrait";
    }

    public String toString() {
        return "MRAIDOrientationProperties{allowOrientationChange=" + this.f4167a + ", forceOrientation=" + mo3889a() + '}';
    }
}
