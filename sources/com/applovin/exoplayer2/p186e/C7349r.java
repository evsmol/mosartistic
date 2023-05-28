package com.applovin.exoplayer2.p186e;

import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p198g.p203e.C7431e;
import com.applovin.exoplayer2.p198g.p203e.C7439i;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.applovin.exoplayer2.e.r */
public final class C7349r {

    /* renamed from: c */
    private static final Pattern f16766c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f16767a = -1;

    /* renamed from: b */
    public int f16768b = -1;

    /* renamed from: a */
    private boolean m20276a(String str) {
        Matcher matcher = f16766c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) C7728ai.m22198a(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) C7728ai.m22198a(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f16767a = parseInt;
            this.f16768b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo54084a() {
        return (this.f16767a == -1 || this.f16768b == -1) ? false : true;
    }

    /* renamed from: a */
    public boolean mo54085a(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f16767a = i2;
        this.f16768b = i3;
        return true;
    }

    /* renamed from: a */
    public boolean mo54086a(C7399a aVar) {
        for (int i = 0; i < aVar.mo54200a(); i++) {
            C7399a.C7401a a = aVar.mo54201a(i);
            if (a instanceof C7431e) {
                C7431e eVar = (C7431e) a;
                if ("iTunSMPB".equals(eVar.f17032b) && m20276a(eVar.f17033c)) {
                    return true;
                }
            } else if (a instanceof C7439i) {
                C7439i iVar = (C7439i) a;
                if ("com.apple.iTunes".equals(iVar.f17044a) && "iTunSMPB".equals(iVar.f17045b) && m20276a(iVar.f17046c)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
