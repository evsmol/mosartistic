package com.applovin.exoplayer2.p209i.p218i;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.regex.Pattern;

/* renamed from: com.applovin.exoplayer2.i.i.h */
public final class C7617h {

    /* renamed from: a */
    private static final Pattern f17794a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static long m21684a(String str) throws NumberFormatException {
        String[] b = C7728ai.m22242b(str, "\\.");
        long j = 0;
        for (String parseLong : C7728ai.m22225a(b[0], ":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (b.length == 2) {
            j2 += Long.parseLong(b[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: a */
    public static void m21685a(C7772y yVar) throws C6809ai {
        int c = yVar.mo55074c();
        if (!m21687b(yVar)) {
            yVar.mo55076d(c);
            throw C6809ai.m17540b("Expected WEBVTT. Got " + yVar.mo55062C(), (Throwable) null);
        }
    }

    /* renamed from: b */
    public static float m21686b(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: b */
    public static boolean m21687b(C7772y yVar) {
        String C = yVar.mo55062C();
        return C != null && C.startsWith("WEBVTT");
    }
}
