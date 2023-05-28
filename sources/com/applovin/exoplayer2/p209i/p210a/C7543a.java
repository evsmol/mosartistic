package com.applovin.exoplayer2.p209i.p210a;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p209i.C7585f;
import com.applovin.exoplayer2.p209i.C7600h;
import com.applovin.exoplayer2.p209i.C7619j;
import com.applovin.exoplayer2.p209i.C7620k;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7772y;
import com.explorestack.protobuf.openrtb.LossReason;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.i.a.a */
public final class C7543a extends C7550c {

    /* renamed from: a */
    private static final int[] f17435a = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: b */
    private static final int[] f17436b = {0, 4, 8, 12, 16, 20, 24, 28};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final int[] f17437c = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: d */
    private static final int[] f17438d = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, LossReason.f4818xd24c0733, 241, 9632};

    /* renamed from: e */
    private static final int[] f17439e = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: f */
    private static final int[] f17440f = {193, 201, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, LossReason.LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE, LossReason.LOSS_REASON_CREATIVE_FILTERED_SIZE_NOT_ALLOWED_VALUE, 235, LossReason.LOSS_REASON_CREATIVE_FILTERED_NOT_SECURE_VALUE, LossReason.LOSS_REASON_CREATIVE_FILTERED_LANGUAGE_EXCLUSIONS_VALUE, 239, LossReason.LOSS_REASON_CREATIVE_FILTERED_NOT_ALLOWED_IN_DEAL_VALUE, 217, 249, 219, 171, 187};

    /* renamed from: g */
    private static final int[] f17441g = {195, 227, LossReason.LOSS_REASON_CREATIVE_FILTERED_ADVERTISER_EXCLUSIONS_VALUE, 204, 236, LossReason.LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS_VALUE, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: h */
    private static final boolean[] f17442h = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: i */
    private final C7772y f17443i = new C7772y();

    /* renamed from: j */
    private final int f17444j;

    /* renamed from: k */
    private final int f17445k;

    /* renamed from: l */
    private final int f17446l;

    /* renamed from: m */
    private final long f17447m;

    /* renamed from: n */
    private final ArrayList<C7544a> f17448n = new ArrayList<>();

    /* renamed from: o */
    private C7544a f17449o = new C7544a(0, 4);

    /* renamed from: p */
    private List<C7540a> f17450p;

    /* renamed from: q */
    private List<C7540a> f17451q;

    /* renamed from: r */
    private int f17452r;

    /* renamed from: s */
    private int f17453s;

    /* renamed from: t */
    private boolean f17454t;

    /* renamed from: u */
    private boolean f17455u;

    /* renamed from: v */
    private byte f17456v;

    /* renamed from: w */
    private byte f17457w;

    /* renamed from: x */
    private int f17458x = 0;

    /* renamed from: y */
    private boolean f17459y;

    /* renamed from: z */
    private long f17460z;

    /* renamed from: com.applovin.exoplayer2.i.a.a$a */
    private static final class C7544a {

        /* renamed from: a */
        private final List<C7545a> f17461a = new ArrayList();

        /* renamed from: b */
        private final List<SpannableString> f17462b = new ArrayList();

        /* renamed from: c */
        private final StringBuilder f17463c = new StringBuilder();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f17464d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f17465e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f17466f;

        /* renamed from: g */
        private int f17467g;

        /* renamed from: h */
        private int f17468h;

        /* renamed from: com.applovin.exoplayer2.i.a.a$a$a */
        private static class C7545a {

            /* renamed from: a */
            public final int f17469a;

            /* renamed from: b */
            public final boolean f17470b;

            /* renamed from: c */
            public int f17471c;

            public C7545a(int i, boolean z, int i2) {
                this.f17469a = i;
                this.f17470b = z;
                this.f17471c = i2;
            }
        }

        public C7544a(int i, int i2) {
            mo54666a(i);
            this.f17468h = i2;
        }

        /* renamed from: a */
        private static void m21306a(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        /* renamed from: a */
        private static void m21307a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            }
        }

        /* renamed from: b */
        private static void m21309b(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        /* renamed from: d */
        private SpannableString m21311d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f17463c);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            boolean z = false;
            while (i < this.f17461a.size()) {
                C7545a aVar = this.f17461a.get(i);
                boolean z2 = aVar.f17470b;
                int i7 = aVar.f17469a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = C7543a.f17437c[i7];
                    }
                    z = z3;
                }
                int i8 = aVar.f17471c;
                i++;
                if (i8 != (i < this.f17461a.size() ? this.f17461a.get(i).f17471c : length)) {
                    if (i2 != -1 && !z2) {
                        m21306a(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i8;
                    }
                    if (i3 != -1 && !z) {
                        m21309b(spannableStringBuilder, i3, i8);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i6 != i5) {
                        m21307a(spannableStringBuilder, i4, i8, i5);
                        i5 = i6;
                        i4 = i8;
                    }
                }
            }
            if (!(i2 == -1 || i2 == length)) {
                m21306a(spannableStringBuilder, i2, length);
            }
            if (!(i3 == -1 || i3 == length)) {
                m21309b(spannableStringBuilder, i3, length);
            }
            if (i4 != length) {
                m21307a(spannableStringBuilder, i4, length, i5);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: a */
        public void mo54665a(char c) {
            if (this.f17463c.length() < 32) {
                this.f17463c.append(c);
            }
        }

        /* renamed from: a */
        public void mo54666a(int i) {
            this.f17467g = i;
            this.f17461a.clear();
            this.f17462b.clear();
            this.f17463c.setLength(0);
            this.f17464d = 15;
            this.f17465e = 0;
            this.f17466f = 0;
        }

        /* renamed from: a */
        public void mo54667a(int i, boolean z) {
            this.f17461a.add(new C7545a(i, z, this.f17463c.length()));
        }

        /* renamed from: a */
        public boolean mo54668a() {
            return this.f17461a.isEmpty() && this.f17462b.isEmpty() && this.f17463c.length() == 0;
        }

        /* renamed from: b */
        public void mo54669b() {
            int length = this.f17463c.length();
            if (length > 0) {
                this.f17463c.delete(length - 1, length);
                int size = this.f17461a.size() - 1;
                while (size >= 0) {
                    C7545a aVar = this.f17461a.get(size);
                    if (aVar.f17471c == length) {
                        aVar.f17471c--;
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo54670b(int i) {
            this.f17467g = i;
        }

        /* renamed from: c */
        public void mo54671c() {
            this.f17462b.add(m21311d());
            this.f17463c.setLength(0);
            this.f17461a.clear();
            int min = Math.min(this.f17468h, this.f17464d);
            while (this.f17462b.size() >= min) {
                this.f17462b.remove(0);
            }
        }

        /* renamed from: c */
        public void mo54672c(int i) {
            this.f17468h = i;
        }

        /* renamed from: d */
        public C7540a mo54673d(int i) {
            float f;
            int i2 = this.f17465e + this.f17466f;
            int i3 = 32 - i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f17462b.size(); i4++) {
                spannableStringBuilder.append(C7728ai.m22197a((CharSequence) this.f17462b.get(i4), i3));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(C7728ai.m22197a((CharSequence) m21311d(), i3));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i3 - spannableStringBuilder.length();
            int i5 = i2 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.f17467g != 2 || (Math.abs(i5) >= 3 && length >= 0)) ? (this.f17467g != 2 || i5 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i2 = 32 - length;
                }
                f = ((((float) i2) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i6 = this.f17464d;
            if (i6 > 7) {
                i6 = (i6 - 15) - 2;
            } else if (this.f17467g == 1) {
                i6 -= this.f17468h - 1;
            }
            return new C7540a.C7542a().mo54643a((CharSequence) spannableStringBuilder).mo54642a(Layout.Alignment.ALIGN_NORMAL).mo54639a((float) i6, 1).mo54638a(f).mo54648b(i).mo54656e();
        }
    }

    public C7543a(String str, int i, long j) {
        this.f17447m = j > 0 ? j * 1000 : -9223372036854775807L;
        this.f17444j = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.f17446l = 0;
                } else if (i != 4) {
                    C7755q.m22361c("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                } else {
                    this.f17446l = 1;
                }
                this.f17445k = 1;
                m21267a(0);
                m21292m();
                this.f17459y = true;
                this.f17460z = -9223372036854775807L;
            }
            this.f17446l = 1;
            this.f17445k = 0;
            m21267a(0);
            m21292m();
            this.f17459y = true;
            this.f17460z = -9223372036854775807L;
        }
        this.f17446l = 0;
        this.f17445k = 0;
        m21267a(0);
        m21292m();
        this.f17459y = true;
        this.f17460z = -9223372036854775807L;
    }

    /* renamed from: a */
    private void m21266a(byte b, byte b2) {
        int i = f17435a[b & 7];
        boolean z = false;
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.f17449o.f17464d) {
            if (this.f17452r != 1 && !this.f17449o.mo54668a()) {
                C7544a aVar = new C7544a(this.f17452r, this.f17453s);
                this.f17449o = aVar;
                this.f17448n.add(aVar);
            }
            int unused = this.f17449o.f17464d = i;
        }
        boolean z2 = (b2 & Ascii.DLE) == 16;
        if ((b2 & 1) == 1) {
            z = true;
        }
        int i2 = (b2 >> 1) & 7;
        this.f17449o.mo54667a(z2 ? 8 : i2, z);
        if (z2) {
            int unused2 = this.f17449o.f17465e = f17436b[i2];
        }
    }

    /* renamed from: a */
    private void m21267a(int i) {
        int i2 = this.f17452r;
        if (i2 != i) {
            this.f17452r = i;
            if (i == 3) {
                for (int i3 = 0; i3 < this.f17448n.size(); i3++) {
                    this.f17448n.get(i3).mo54670b(i);
                }
                return;
            }
            m21292m();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f17450p = Collections.emptyList();
            }
        }
    }

    /* renamed from: a */
    private boolean m21268a(byte b) {
        if (m21283h(b)) {
            this.f17458x = m21285i(b);
        }
        return this.f17458x == this.f17446l;
    }

    /* renamed from: a */
    private boolean m21269a(boolean z, byte b, byte b2) {
        if (!z || !m21288j(b)) {
            this.f17455u = false;
        } else if (this.f17455u && this.f17456v == b && this.f17457w == b2) {
            this.f17455u = false;
            return true;
        } else {
            this.f17455u = true;
            this.f17456v = b;
            this.f17457w = b2;
        }
        return false;
    }

    /* renamed from: b */
    private void m21270b(byte b) {
        this.f17449o.mo54665a(' ');
        this.f17449o.mo54667a((b >> 1) & 7, (b & 1) == 1);
    }

    /* renamed from: b */
    private void m21271b(byte b, byte b2) {
        if (!m21289k(b)) {
            if (m21291l(b)) {
                if (!(b2 == 32 || b2 == 47)) {
                    switch (b2) {
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (b2) {
                                case 41:
                                    break;
                                case 42:
                                case 43:
                                    break;
                                default:
                                    return;
                            }
                    }
                }
                this.f17459y = true;
                return;
            }
            return;
        }
        this.f17459y = false;
    }

    /* renamed from: b */
    private void m21272b(int i) {
        this.f17453s = i;
        this.f17449o.mo54672c(i);
    }

    /* renamed from: c */
    private void m21273c(byte b) {
        if (b == 32) {
            m21267a(2);
        } else if (b != 41) {
            switch (b) {
                case 37:
                    m21267a(1);
                    m21272b(2);
                    return;
                case 38:
                    m21267a(1);
                    m21272b(3);
                    return;
                case 39:
                    m21267a(1);
                    m21272b(4);
                    return;
                default:
                    int i = this.f17452r;
                    if (i != 0) {
                        if (b != 33) {
                            switch (b) {
                                case 44:
                                    this.f17450p = Collections.emptyList();
                                    int i2 = this.f17452r;
                                    if (!(i2 == 1 || i2 == 3)) {
                                        return;
                                    }
                                case 45:
                                    if (i == 1 && !this.f17449o.mo54668a()) {
                                        this.f17449o.mo54671c();
                                        return;
                                    }
                                    return;
                                case 46:
                                    break;
                                case 47:
                                    this.f17450p = m21290l();
                                    break;
                                default:
                                    return;
                            }
                            m21292m();
                            return;
                        }
                        this.f17449o.mo54669b();
                        return;
                    }
                    return;
            }
        } else {
            m21267a(3);
        }
    }

    /* renamed from: c */
    private static boolean m21274c(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    /* renamed from: d */
    private static char m21275d(byte b) {
        return (char) f17438d[(b & Ascii.DEL) - 32];
    }

    /* renamed from: d */
    private static boolean m21276d(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    /* renamed from: e */
    private static char m21277e(byte b) {
        return (char) f17439e[b & Ascii.f15551SI];
    }

    /* renamed from: e */
    private static char m21278e(byte b, byte b2) {
        return (b & 1) == 0 ? m21279f(b2) : m21281g(b2);
    }

    /* renamed from: f */
    private static char m21279f(byte b) {
        return (char) f17440f[b & Ascii.f15554US];
    }

    /* renamed from: f */
    private static boolean m21280f(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    /* renamed from: g */
    private static char m21281g(byte b) {
        return (char) f17441g[b & Ascii.f15554US];
    }

    /* renamed from: g */
    private static boolean m21282g(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    /* renamed from: h */
    private static boolean m21283h(byte b) {
        return (b & 224) == 0;
    }

    /* renamed from: h */
    private static boolean m21284h(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    /* renamed from: i */
    private static int m21285i(byte b) {
        return (b >> 3) & 1;
    }

    /* renamed from: i */
    private static boolean m21286i(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    /* renamed from: j */
    private static boolean m21288j(byte b) {
        return (b & 240) == 16;
    }

    /* renamed from: k */
    private static boolean m21289k(byte b) {
        return 1 <= b && b <= 15;
    }

    /* renamed from: l */
    private List<C7540a> m21290l() {
        int size = this.f17448n.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C7540a d = this.f17448n.get(i2).mo54673d(RecyclerView.UNDEFINED_DURATION);
            arrayList.add(d);
            if (d != null) {
                i = Math.min(i, d.f17409j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            C7540a aVar = (C7540a) arrayList.get(i3);
            if (aVar != null) {
                if (aVar.f17409j != i) {
                    aVar = (C7540a) C7717a.m22120b(this.f17448n.get(i3).mo54673d(i));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    /* renamed from: l */
    private static boolean m21291l(byte b) {
        return (b & 247) == 20;
    }

    /* renamed from: m */
    private void m21292m() {
        this.f17449o.mo54666a(this.f17452r);
        this.f17448n.clear();
        this.f17448n.add(this.f17449o);
    }

    /* renamed from: n */
    private boolean m21293n() {
        return (this.f17447m == -9223372036854775807L || this.f17460z == -9223372036854775807L || mo54691k() - this.f17460z < this.f17447m) ? false : true;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo54658a(long j) {
        super.mo54658a(j);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0018 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo54659a(com.applovin.exoplayer2.p209i.C7619j r10) {
        /*
            r9 = this;
            java.nio.ByteBuffer r10 = r10.f15332b
            java.lang.Object r10 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r10)
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            com.applovin.exoplayer2.l.y r0 = r9.f17443i
            byte[] r1 = r10.array()
            int r10 = r10.limit()
            r0.mo55070a((byte[]) r1, (int) r10)
            r10 = 0
            r0 = 1
            r1 = 0
        L_0x0018:
            com.applovin.exoplayer2.l.y r2 = r9.f17443i
            int r2 = r2.mo55064a()
            int r3 = r9.f17444j
            if (r2 < r3) goto L_0x00f0
            r2 = 2
            if (r3 != r2) goto L_0x0027
            r2 = -4
            goto L_0x002e
        L_0x0027:
            com.applovin.exoplayer2.l.y r2 = r9.f17443i
            int r2 = r2.mo55084h()
            byte r2 = (byte) r2
        L_0x002e:
            com.applovin.exoplayer2.l.y r3 = r9.f17443i
            int r3 = r3.mo55084h()
            com.applovin.exoplayer2.l.y r4 = r9.f17443i
            int r4 = r4.mo55084h()
            r5 = r2 & 2
            if (r5 == 0) goto L_0x003f
            goto L_0x0018
        L_0x003f:
            r5 = r2 & 1
            int r6 = r9.f17445k
            if (r5 == r6) goto L_0x0046
            goto L_0x0018
        L_0x0046:
            r5 = r3 & 127(0x7f, float:1.78E-43)
            byte r5 = (byte) r5
            r6 = r4 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            if (r5 != 0) goto L_0x0051
            if (r6 != 0) goto L_0x0051
            goto L_0x0018
        L_0x0051:
            boolean r7 = r9.f17454t
            r2 = r2 & 4
            r8 = 4
            if (r2 != r8) goto L_0x0064
            boolean[] r2 = f17442h
            boolean r3 = r2[r3]
            if (r3 == 0) goto L_0x0064
            boolean r2 = r2[r4]
            if (r2 == 0) goto L_0x0064
            r2 = 1
            goto L_0x0065
        L_0x0064:
            r2 = 0
        L_0x0065:
            r9.f17454t = r2
            boolean r2 = r9.m21269a(r2, r5, r6)
            if (r2 == 0) goto L_0x006e
            goto L_0x0018
        L_0x006e:
            boolean r2 = r9.f17454t
            if (r2 != 0) goto L_0x0079
            if (r7 == 0) goto L_0x0018
            r9.m21292m()
        L_0x0077:
            r1 = 1
            goto L_0x0018
        L_0x0079:
            r9.m21271b(r5, r6)
            boolean r2 = r9.f17459y
            if (r2 != 0) goto L_0x0081
            goto L_0x0018
        L_0x0081:
            boolean r2 = r9.m21268a((byte) r5)
            if (r2 != 0) goto L_0x0088
            goto L_0x0018
        L_0x0088:
            boolean r1 = m21283h(r5)
            if (r1 == 0) goto L_0x00d9
            boolean r1 = m21274c(r5, r6)
            if (r1 == 0) goto L_0x009b
            com.applovin.exoplayer2.i.a.a$a r1 = r9.f17449o
            char r2 = m21277e(r6)
            goto L_0x00ec
        L_0x009b:
            boolean r1 = m21276d(r5, r6)
            if (r1 == 0) goto L_0x00ad
            com.applovin.exoplayer2.i.a.a$a r1 = r9.f17449o
            r1.mo54669b()
            com.applovin.exoplayer2.i.a.a$a r1 = r9.f17449o
            char r2 = m21278e(r5, r6)
            goto L_0x00ec
        L_0x00ad:
            boolean r1 = m21280f(r5, r6)
            if (r1 == 0) goto L_0x00b7
            r9.m21270b((byte) r6)
            goto L_0x0077
        L_0x00b7:
            boolean r1 = m21282g(r5, r6)
            if (r1 == 0) goto L_0x00c1
            r9.m21266a(r5, r6)
            goto L_0x0077
        L_0x00c1:
            boolean r1 = m21284h(r5, r6)
            if (r1 == 0) goto L_0x00cf
            com.applovin.exoplayer2.i.a.a$a r1 = r9.f17449o
            int r6 = r6 + -32
            int unused = r1.f17466f = r6
            goto L_0x0077
        L_0x00cf:
            boolean r1 = m21286i(r5, r6)
            if (r1 == 0) goto L_0x0077
            r9.m21273c(r6)
            goto L_0x0077
        L_0x00d9:
            com.applovin.exoplayer2.i.a.a$a r1 = r9.f17449o
            char r2 = m21275d(r5)
            r1.mo54665a((char) r2)
            r1 = r6 & 224(0xe0, float:3.14E-43)
            if (r1 == 0) goto L_0x0077
            com.applovin.exoplayer2.i.a.a$a r1 = r9.f17449o
            char r2 = m21275d(r6)
        L_0x00ec:
            r1.mo54665a((char) r2)
            goto L_0x0077
        L_0x00f0:
            if (r1 == 0) goto L_0x0105
            int r10 = r9.f17452r
            if (r10 == r0) goto L_0x00f9
            r0 = 3
            if (r10 != r0) goto L_0x0105
        L_0x00f9:
            java.util.List r10 = r9.m21290l()
            r9.f17450p = r10
            long r0 = r9.mo54691k()
            r9.f17460z = r0
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p210a.C7543a.mo54659a(com.applovin.exoplayer2.i.j):void");
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo54660b(C7619j jVar) throws C7600h {
        super.mo53134a(jVar);
    }

    /* renamed from: c */
    public void mo53136c() {
        super.mo53136c();
        this.f17450p = null;
        this.f17451q = null;
        m21267a(0);
        m21272b(4);
        m21292m();
        this.f17454t = false;
        this.f17455u = false;
        this.f17456v = 0;
        this.f17457w = 0;
        this.f17458x = 0;
        this.f17459y = true;
        this.f17460z = -9223372036854775807L;
    }

    /* renamed from: d */
    public void mo53137d() {
    }

    /* renamed from: e */
    public C7620k mo53135b() throws C7600h {
        C7620k j;
        C7620k e = super.mo53135b();
        if (e != null) {
            return e;
        }
        if (!m21293n() || (j = mo54690j()) == null) {
            return null;
        }
        this.f17450p = Collections.emptyList();
        this.f17460z = -9223372036854775807L;
        C7620k kVar = j;
        kVar.mo54792a(mo54691k(), mo54663g(), Long.MAX_VALUE);
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo54662f() {
        return this.f17450p != this.f17451q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C7585f mo54663g() {
        List<C7540a> list = this.f17450p;
        this.f17451q = list;
        return new C7554d((List) C7717a.m22120b(list));
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ C7619j mo54664h() throws C7600h {
        return super.mo53133a();
    }
}
