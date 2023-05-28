package com.applovin.exoplayer2.p185d;

import android.util.Pair;
import java.util.Map;

/* renamed from: com.applovin.exoplayer2.d.u */
public final class C7180u {
    /* renamed from: a */
    private static long m19239a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: a */
    public static Pair<Long, Long> m19240a(C7152f fVar) {
        Map<String, String> h = fVar.mo53769h();
        if (h == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(m19239a(h, "LicenseDurationRemaining")), Long.valueOf(m19239a(h, "PlaybackDurationRemaining")));
    }
}
