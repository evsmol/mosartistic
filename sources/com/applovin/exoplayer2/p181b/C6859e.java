package com.applovin.exoplayer2.p181b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.common.p184b.C7056c;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.applovin.exoplayer2.b.e */
public final class C6859e {

    /* renamed from: a */
    public static final C6859e f15010a = new C6859e(new int[]{2}, 8);

    /* renamed from: b */
    private static final C6859e f15011b = new C6859e(new int[]{2, 5, 6}, 8);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final int[] f15012c = {5, 6, 18, 17, 14, 7, 8};

    /* renamed from: d */
    private final int[] f15013d;

    /* renamed from: e */
    private final int f15014e;

    /* renamed from: com.applovin.exoplayer2.b.e$a */
    private static final class C6860a {
        /* renamed from: a */
        public static int[] m17962a() {
            C7033s.C7034a i = C7033s.m18804i();
            for (int i2 : C6859e.f15012c) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i2).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    i.mo53515a(Integer.valueOf(i2));
                }
            }
            i.mo53515a(2);
            return C7056c.m18929a((Collection<? extends Number>) i.mo53531a());
        }
    }

    public C6859e(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f15013d = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f15013d = new int[0];
        }
        this.f15014e = i;
    }

    /* renamed from: a */
    public static C6859e m17956a(Context context) {
        return m17957a(context, context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    /* renamed from: a */
    static C6859e m17957a(Context context, Intent intent) {
        return (!m17959c() || Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) != 1) ? (C7728ai.f18249a < 29 || !C7728ai.m22249c(context)) ? (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f15010a : new C6859e(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new C6859e(C6860a.m17962a(), 8) : f15011b;
    }

    /* renamed from: c */
    private static boolean m17959c() {
        return C7728ai.f18249a >= 17 && ("Amazon".equals(C7728ai.f18251c) || "Xiaomi".equals(C7728ai.f18251c));
    }

    /* renamed from: a */
    public int mo52922a() {
        return this.f15014e;
    }

    /* renamed from: a */
    public boolean mo52923a(int i) {
        return Arrays.binarySearch(this.f15013d, i) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6859e)) {
            return false;
        }
        C6859e eVar = (C6859e) obj;
        return Arrays.equals(this.f15013d, eVar.f15013d) && this.f15014e == eVar.f15014e;
    }

    public int hashCode() {
        return this.f15014e + (Arrays.hashCode(this.f15013d) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f15014e + ", supportedEncodings=" + Arrays.toString(this.f15013d) + "]";
    }
}
