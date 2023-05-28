package com.applovin.exoplayer2.p224ui;

import android.graphics.Color;
import com.applovin.exoplayer2.p221l.C7728ai;

/* renamed from: com.applovin.exoplayer2.ui.e */
final class C7843e {
    /* renamed from: a */
    public static String m23029a(int i) {
        return C7728ai.m22200a("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d));
    }

    /* renamed from: a */
    public static String m23030a(String str) {
        return "." + str + ",." + str + " *";
    }
}
