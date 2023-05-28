package com.applovin.exoplayer2.p224ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.p183a.C7039u;
import com.applovin.exoplayer2.p209i.p213d.C7573a;
import com.applovin.exoplayer2.p209i.p213d.C7575c;
import com.applovin.exoplayer2.p209i.p213d.C7577e;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.applovin.exoplayer2.ui.h */
final class C7852h {

    /* renamed from: a */
    private static final Pattern f18846a = Pattern.compile("(&#13;)?&#10;");

    /* renamed from: com.applovin.exoplayer2.ui.h$a */
    public static class C7854a {

        /* renamed from: a */
        public final String f18847a;

        /* renamed from: b */
        public final Map<String, String> f18848b;

        private C7854a(String str, Map<String, String> map) {
            this.f18847a = str;
            this.f18848b = map;
        }
    }

    /* renamed from: com.applovin.exoplayer2.ui.h$b */
    private static final class C7855b {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public static final Comparator<C7855b> f18849e = $$Lambda$h$b$5bdUpXq4pNI6toR2uujrLFzamZI.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final Comparator<C7855b> f18850f = $$Lambda$h$b$gApkYc4yd0eZadMMNalVbgTXI.INSTANCE;

        /* renamed from: a */
        public final int f18851a;

        /* renamed from: b */
        public final int f18852b;

        /* renamed from: c */
        public final String f18853c;

        /* renamed from: d */
        public final String f18854d;

        private C7855b(int i, int i2, String str, String str2) {
            this.f18851a = i;
            this.f18852b = i2;
            this.f18853c = str;
            this.f18854d = str2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ int m23196a(C7855b bVar, C7855b bVar2) {
            int compare = Integer.compare(bVar2.f18851a, bVar.f18851a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = bVar2.f18853c.compareTo(bVar.f18853c);
            return compareTo != 0 ? compareTo : bVar2.f18854d.compareTo(bVar.f18854d);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ int m23198b(C7855b bVar, C7855b bVar2) {
            int compare = Integer.compare(bVar2.f18852b, bVar.f18852b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = bVar.f18853c.compareTo(bVar2.f18853c);
            return compareTo != 0 ? compareTo : bVar.f18854d.compareTo(bVar2.f18854d);
        }
    }

    /* renamed from: com.applovin.exoplayer2.ui.h$c */
    private static final class C7856c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<C7855b> f18855a = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final List<C7855b> f18856b = new ArrayList();
    }

    /* renamed from: a */
    private static SparseArray<C7856c> m23188a(Spanned spanned, float f) {
        SparseArray<C7856c> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String a = m23195a(obj, f);
            String a2 = m23194a(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (a != null) {
                C7717a.m22120b(a2);
                C7855b bVar = new C7855b(spanStart, spanEnd, a, a2);
                m23190a(sparseArray, spanStart).f18855a.add(bVar);
                m23190a(sparseArray, spanEnd).f18856b.add(bVar);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static C7854a m23189a(CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new C7854a("", C7039u.m18834a());
        }
        if (!(charSequence instanceof Spanned)) {
            return new C7854a(m23193a(charSequence), C7039u.m18834a());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet<Integer> hashSet = new HashSet<>();
        int i = 0;
        for (BackgroundColorSpan backgroundColor : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColor.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        for (Integer intValue : hashSet) {
            int intValue2 = intValue.intValue();
            hashMap.put(C7843e.m23030a("bg_" + intValue2), C7728ai.m22200a("background-color:%s;", C7843e.m23029a(intValue2)));
        }
        SparseArray<C7856c> a = m23188a(spanned, f);
        StringBuilder sb = new StringBuilder(spanned.length());
        int i2 = 0;
        while (i < a.size()) {
            int keyAt = a.keyAt(i);
            sb.append(m23193a(spanned.subSequence(i2, keyAt)));
            C7856c cVar = a.get(keyAt);
            Collections.sort(cVar.f18856b, C7855b.f18850f);
            for (C7855b bVar : cVar.f18856b) {
                sb.append(bVar.f18854d);
            }
            Collections.sort(cVar.f18855a, C7855b.f18849e);
            for (C7855b bVar2 : cVar.f18855a) {
                sb.append(bVar2.f18853c);
            }
            i++;
            i2 = keyAt;
        }
        sb.append(m23193a(spanned.subSequence(i2, spanned.length())));
        return new C7854a(sb.toString(), hashMap);
    }

    /* renamed from: a */
    private static C7856c m23190a(SparseArray<C7856c> sparseArray, int i) {
        C7856c cVar = sparseArray.get(i);
        if (cVar != null) {
            return cVar;
        }
        C7856c cVar2 = new C7856c();
        sparseArray.put(i, cVar2);
        return cVar2;
    }

    /* renamed from: a */
    private static String m23191a(int i) {
        return i != 2 ? "over right" : "under left";
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m23192a(int r3, int r4) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2
            r2 = 1
            if (r4 == r2) goto L_0x000f
            if (r4 == r1) goto L_0x000c
            goto L_0x0014
        L_0x000c:
            java.lang.String r4 = "open "
            goto L_0x0011
        L_0x000f:
            java.lang.String r4 = "filled "
        L_0x0011:
            r0.append(r4)
        L_0x0014:
            if (r3 == 0) goto L_0x0029
            if (r3 == r2) goto L_0x0026
            if (r3 == r1) goto L_0x0023
            r4 = 3
            if (r3 == r4) goto L_0x0020
            java.lang.String r3 = "unset"
            goto L_0x002b
        L_0x0020:
            java.lang.String r3 = "sesame"
            goto L_0x002b
        L_0x0023:
            java.lang.String r3 = "dot"
            goto L_0x002b
        L_0x0026:
            java.lang.String r3 = "circle"
            goto L_0x002b
        L_0x0029:
            java.lang.String r3 = "none"
        L_0x002b:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p224ui.C7852h.m23192a(int, int):java.lang.String");
    }

    /* renamed from: a */
    private static String m23193a(CharSequence charSequence) {
        return f18846a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    /* renamed from: a */
    private static String m23194a(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof C7573a) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof C7577e)) {
            return "</span>";
        }
        if (!(obj instanceof TypefaceSpan)) {
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    return "</b>";
                }
                if (style == 2) {
                    return "</i>";
                }
                if (style != 3) {
                    return null;
                }
                return "</i></b>";
            } else if (obj instanceof C7575c) {
                return "<rt>" + m23193a((CharSequence) ((C7575c) obj).f17612a) + "</rt></ruby>";
            } else if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
            return null;
        } else if (((TypefaceSpan) obj).getFamily() != null) {
            return "</span>";
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private static String m23195a(Object obj, float f) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return C7728ai.m22200a("<span style='color:%s;'>", C7843e.m23029a(((ForegroundColorSpan) obj).getForegroundColor()));
        } else if (obj instanceof BackgroundColorSpan) {
            return C7728ai.m22200a("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        } else if (obj instanceof C7573a) {
            return "<span style='text-combine-upright:all;'>";
        } else {
            if (obj instanceof AbsoluteSizeSpan) {
                AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
                boolean dip = absoluteSizeSpan.getDip();
                float size = (float) absoluteSizeSpan.getSize();
                if (!dip) {
                    size /= f;
                }
                return C7728ai.m22200a("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
            } else if (obj instanceof RelativeSizeSpan) {
                return C7728ai.m22200a("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
            } else if (obj instanceof TypefaceSpan) {
                String family = ((TypefaceSpan) obj).getFamily();
                if (family == null) {
                    return null;
                }
                return C7728ai.m22200a("<span style='font-family:\"%s\";'>", family);
            } else if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    return "<b>";
                }
                if (style == 2) {
                    return "<i>";
                }
                if (style != 3) {
                    return null;
                }
                return "<b><i>";
            } else if (obj instanceof C7575c) {
                int i = ((C7575c) obj).f17613b;
                if (i == -1) {
                    return "<ruby style='ruby-position:unset;'>";
                }
                if (i == 1) {
                    return "<ruby style='ruby-position:over;'>";
                }
                if (i != 2) {
                    return null;
                }
                return "<ruby style='ruby-position:under;'>";
            } else if (obj instanceof UnderlineSpan) {
                return "<u>";
            } else {
                if (!(obj instanceof C7577e)) {
                    return null;
                }
                C7577e eVar = (C7577e) obj;
                return C7728ai.m22200a("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", m23192a(eVar.f17614a, eVar.f17615b), m23191a(eVar.f17616c));
            }
        }
    }
}
