package com.applovin.exoplayer2.p209i.p214e;

import android.text.Layout;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p209i.C7572d;
import com.applovin.exoplayer2.p209i.C7585f;
import com.applovin.exoplayer2.p209i.p214e.C7581c;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.applovin.exoplayer2.i.e.a */
public final class C7579a extends C7572d {

    /* renamed from: a */
    private static final Pattern f17618a = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: b */
    private final boolean f17619b;

    /* renamed from: c */
    private final C7580b f17620c;

    /* renamed from: d */
    private Map<String, C7581c> f17621d;

    /* renamed from: e */
    private float f17622e;

    /* renamed from: f */
    private float f17623f;

    public C7579a() {
        this((List<byte[]>) null);
    }

    public C7579a(List<byte[]> list) {
        super("SsaDecoder");
        this.f17622e = -3.4028235E38f;
        this.f17623f = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f17619b = false;
            this.f17620c = null;
            return;
        }
        this.f17619b = true;
        String a = C7728ai.m22203a(list.get(0));
        C7717a.m22118a(a.startsWith("Format:"));
        this.f17620c = (C7580b) C7717a.m22120b(C7580b.m21469a(a));
        m21459a(new C7772y(list.get(1)));
    }

    /* renamed from: a */
    private static int m21456a(long j, List<Long> list, List<List<C7540a>> list2) {
        int i;
        ArrayList arrayList;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            } else if (list.get(size).longValue() == j) {
                return size;
            } else {
                if (list.get(size).longValue() < j) {
                    i = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i, Long.valueOf(j));
        if (i != 0) {
            arrayList = new ArrayList(list2.get(i - 1));
        }
        list2.add(i, arrayList);
        return i;
    }

    /* renamed from: a */
    private static long m21457a(String str) {
        Matcher matcher = f17618a.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong((String) C7728ai.m22198a(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) C7728ai.m22198a(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) C7728ai.m22198a(matcher.group(3))) * 1000000) + (Long.parseLong((String) C7728ai.m22198a(matcher.group(4))) * 10000);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.exoplayer2.p209i.C7540a m21458a(java.lang.String r6, com.applovin.exoplayer2.p209i.p214e.C7581c r7, com.applovin.exoplayer2.p209i.p214e.C7581c.C7583b r8, float r9, float r10) {
        /*
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r6)
            com.applovin.exoplayer2.i.a$a r6 = new com.applovin.exoplayer2.i.a$a
            r6.<init>()
            com.applovin.exoplayer2.i.a$a r6 = r6.mo54643a((java.lang.CharSequence) r0)
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2 = 0
            if (r7 == 0) goto L_0x0088
            java.lang.Integer r3 = r7.f17631c
            r4 = 33
            if (r3 == 0) goto L_0x002c
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            java.lang.Integer r5 = r7.f17631c
            int r5 = r5.intValue()
            r3.<init>(r5)
            int r5 = r0.length()
            r0.setSpan(r3, r2, r5, r4)
        L_0x002c:
            float r3 = r7.f17632d
            r5 = 1
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x003d
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x003d
            float r3 = r7.f17632d
            float r3 = r3 / r10
            r6.mo54647b(r3, r5)
        L_0x003d:
            boolean r3 = r7.f17633e
            if (r3 == 0) goto L_0x004c
            boolean r3 = r7.f17634f
            if (r3 == 0) goto L_0x004c
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r5 = 3
            r3.<init>(r5)
            goto L_0x0055
        L_0x004c:
            boolean r3 = r7.f17633e
            if (r3 == 0) goto L_0x005d
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r5)
        L_0x0055:
            int r5 = r0.length()
            r0.setSpan(r3, r2, r5, r4)
            goto L_0x0068
        L_0x005d:
            boolean r3 = r7.f17634f
            if (r3 == 0) goto L_0x0068
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r5 = 2
            r3.<init>(r5)
            goto L_0x0055
        L_0x0068:
            boolean r3 = r7.f17635g
            if (r3 == 0) goto L_0x0078
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            int r5 = r0.length()
            r0.setSpan(r3, r2, r5, r4)
        L_0x0078:
            boolean r3 = r7.f17636h
            if (r3 == 0) goto L_0x0088
            android.text.style.StrikethroughSpan r3 = new android.text.style.StrikethroughSpan
            r3.<init>()
            int r5 = r0.length()
            r0.setSpan(r3, r2, r5, r4)
        L_0x0088:
            int r0 = r8.f17650a
            r3 = -1
            if (r0 == r3) goto L_0x0090
            int r3 = r8.f17650a
            goto L_0x0094
        L_0x0090:
            if (r7 == 0) goto L_0x0094
            int r3 = r7.f17630b
        L_0x0094:
            android.text.Layout$Alignment r7 = m21462b((int) r3)
            com.applovin.exoplayer2.i.a$a r7 = r6.mo54642a((android.text.Layout.Alignment) r7)
            int r0 = m21466d(r3)
            com.applovin.exoplayer2.i.a$a r7 = r7.mo54648b((int) r0)
            int r0 = m21464c((int) r3)
            r7.mo54640a((int) r0)
            android.graphics.PointF r7 = r8.f17651b
            if (r7 == 0) goto L_0x00c5
            int r7 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r7 == 0) goto L_0x00c5
            int r7 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r7 == 0) goto L_0x00c5
            android.graphics.PointF r7 = r8.f17651b
            float r7 = r7.x
            float r7 = r7 / r9
            r6.mo54638a((float) r7)
            android.graphics.PointF r7 = r8.f17651b
            float r7 = r7.y
            float r7 = r7 / r10
            goto L_0x00d8
        L_0x00c5:
            int r7 = r6.mo54650c()
            float r7 = m21467e(r7)
            r6.mo54638a((float) r7)
            int r7 = r6.mo54645b()
            float r7 = m21467e(r7)
        L_0x00d8:
            r6.mo54639a(r7, r2)
            com.applovin.exoplayer2.i.a r6 = r6.mo54656e()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p214e.C7579a.m21458a(java.lang.String, com.applovin.exoplayer2.i.e.c, com.applovin.exoplayer2.i.e.c$b, float, float):com.applovin.exoplayer2.i.a");
    }

    /* renamed from: a */
    private void m21459a(C7772y yVar) {
        while (true) {
            String C = yVar.mo55062C();
            if (C == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(C)) {
                m21463b(yVar);
            } else if ("[V4+ Styles]".equalsIgnoreCase(C)) {
                this.f17621d = m21465c(yVar);
            } else if ("[V4 Styles]".equalsIgnoreCase(C)) {
                C7755q.m22358b("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(C)) {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m21460a(C7772y yVar, List<List<C7540a>> list, List<Long> list2) {
        C7580b bVar = this.f17619b ? this.f17620c : null;
        while (true) {
            String C = yVar.mo55062C();
            if (C == null) {
                return;
            }
            if (C.startsWith("Format:")) {
                bVar = C7580b.m21469a(C);
            } else if (C.startsWith("Dialogue:")) {
                if (bVar == null) {
                    C7755q.m22361c("SsaDecoder", "Skipping dialogue line before complete format: " + C);
                } else {
                    m21461a(C, bVar, list, list2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m21461a(String str, C7580b bVar, List<List<C7540a>> list, List<Long> list2) {
        StringBuilder sb;
        C7717a.m22118a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", bVar.f17628e);
        if (split.length != bVar.f17628e) {
            sb = new StringBuilder();
            sb.append("Skipping dialogue line with fewer columns than format: ");
        } else {
            long a = m21457a(split[bVar.f17624a]);
            if (a == -9223372036854775807L) {
                sb = new StringBuilder();
            } else {
                long a2 = m21457a(split[bVar.f17625b]);
                if (a2 == -9223372036854775807L) {
                    sb = new StringBuilder();
                } else {
                    C7581c cVar = (this.f17621d == null || bVar.f17626c == -1) ? null : this.f17621d.get(split[bVar.f17626c].trim());
                    String str2 = split[bVar.f17627d];
                    C7540a a3 = m21458a(C7581c.C7583b.m21479b(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, C7581c.C7583b.m21478a(str2), this.f17622e, this.f17623f);
                    int a4 = m21456a(a2, list2, list);
                    for (int a5 = m21456a(a, list2, list); a5 < a4; a5++) {
                        list.get(a5).add(a3);
                    }
                    return;
                }
            }
            sb.append("Skipping invalid timing: ");
        }
        sb.append(str);
        C7755q.m22361c("SsaDecoder", sb.toString());
    }

    /* renamed from: b */
    private static Layout.Alignment m21462b(int i) {
        switch (i) {
            case -1:
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
            default:
                C7755q.m22361c("SsaDecoder", "Unknown alignment: " + i);
                return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r2.equals("playresx") != false) goto L_0x0048;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21463b(com.applovin.exoplayer2.p221l.C7772y r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.String r0 = r7.mo55062C()
            if (r0 == 0) goto L_0x0069
            int r1 = r7.mo55064a()
            if (r1 == 0) goto L_0x0014
            int r1 = r7.mo55080f()
            r2 = 91
            if (r1 == r2) goto L_0x0069
        L_0x0014:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 2
            if (r1 == r2) goto L_0x001f
            goto L_0x0000
        L_0x001f:
            r1 = 0
            r2 = r0[r1]
            java.lang.String r2 = r2.trim()
            java.lang.String r2 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase((java.lang.String) r2)
            r3 = -1
            int r4 = r2.hashCode()
            r5 = 1
            switch(r4) {
                case 1879649548: goto L_0x003e;
                case 1879649549: goto L_0x0034;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x0047
        L_0x0034:
            java.lang.String r1 = "playresy"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x003e:
            java.lang.String r4 = "playresx"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r1 = -1
        L_0x0048:
            if (r1 == 0) goto L_0x005c
            if (r1 == r5) goto L_0x004d
            goto L_0x0000
        L_0x004d:
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x005a }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x005a }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x005a }
            r6.f17623f = r0     // Catch:{ NumberFormatException -> 0x005a }
            goto L_0x0000
        L_0x005a:
            goto L_0x0000
        L_0x005c:
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x005a }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x005a }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x005a }
            r6.f17622e = r0     // Catch:{ NumberFormatException -> 0x005a }
            goto L_0x0000
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p214e.C7579a.m21463b(com.applovin.exoplayer2.l.y):void");
    }

    /* renamed from: c */
    private static int m21464c(int i) {
        switch (i) {
            case -1:
                return RecyclerView.UNDEFINED_DURATION;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
            default:
                C7755q.m22361c("SsaDecoder", "Unknown alignment: " + i);
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    /* renamed from: c */
    private static Map<String, C7581c> m21465c(C7772y yVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C7581c.C7582a aVar = null;
        while (true) {
            String C = yVar.mo55062C();
            if (C == null || (yVar.mo55064a() != 0 && yVar.mo55080f() == 91)) {
                return linkedHashMap;
            }
            if (C.startsWith("Format:")) {
                aVar = C7581c.C7582a.m21477a(C);
            } else if (C.startsWith("Style:")) {
                if (aVar == null) {
                    C7755q.m22361c("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + C);
                } else {
                    C7581c a = C7581c.m21470a(C, aVar);
                    if (a != null) {
                        linkedHashMap.put(a.f17629a, a);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: d */
    private static int m21466d(int i) {
        switch (i) {
            case -1:
                return RecyclerView.UNDEFINED_DURATION;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
            default:
                C7755q.m22361c("SsaDecoder", "Unknown alignment: " + i);
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    /* renamed from: e */
    private static float m21467e(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7585f mo54699a(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C7772y yVar = new C7772y(bArr, i);
        if (!this.f17619b) {
            m21459a(yVar);
        }
        m21460a(yVar, (List<List<C7540a>>) arrayList, (List<Long>) arrayList2);
        return new C7584d(arrayList, arrayList2);
    }
}
