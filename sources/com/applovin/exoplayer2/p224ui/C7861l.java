package com.applovin.exoplayer2.p224ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p224ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.ui.l */
final class C7861l extends FrameLayout implements SubtitleView.C7838a {

    /* renamed from: a */
    private final C7840b f18893a;

    /* renamed from: b */
    private final WebView f18894b;

    /* renamed from: c */
    private List<C7540a> f18895c;

    /* renamed from: d */
    private C7841c f18896d;

    /* renamed from: e */
    private float f18897e;

    /* renamed from: f */
    private int f18898f;

    /* renamed from: g */
    private float f18899g;

    /* renamed from: com.applovin.exoplayer2.ui.l$2 */
    static /* synthetic */ class C78632 {

        /* renamed from: a */
        static final /* synthetic */ int[] f18901a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18901a = r0
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18901a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18901a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p224ui.C7861l.C78632.<clinit>():void");
        }
    }

    public C7861l(Context context) {
        this(context, (AttributeSet) null);
    }

    public C7861l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18895c = Collections.emptyList();
        this.f18896d = C7841c.f18712a;
        this.f18897e = 0.0533f;
        this.f18898f = 0;
        this.f18899g = 0.08f;
        this.f18893a = new C7840b(context, attributeSet);
        C78621 r1 = new WebView(context, attributeSet) {
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.f18894b = r1;
        r1.setBackgroundColor(0);
        addView(this.f18893a);
        addView(this.f18894b);
    }

    /* renamed from: a */
    private static String m23220a(int i) {
        return i != 1 ? i != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    /* renamed from: a */
    private String m23221a(int i, float f) {
        float a = C7858j.m23209a(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (a == -3.4028235E38f) {
            return "unset";
        }
        return C7728ai.m22200a("%.2fpx", Float.valueOf(a / getContext().getResources().getDisplayMetrics().density));
    }

    /* renamed from: a */
    private static String m23222a(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i = C78632.f18901a[alignment.ordinal()];
        return i != 1 ? i != 2 ? "center" : "end" : "start";
    }

    /* renamed from: a */
    private static String m23223a(C7540a aVar) {
        if (aVar.f17417r == 0.0f) {
            return "";
        }
        return C7728ai.m22200a("%s(%.2fdeg)", (aVar.f17416q == 2 || aVar.f17416q == 1) ? "skewY" : "skewX", Float.valueOf(aVar.f17417r));
    }

    /* renamed from: a */
    private static String m23224a(C7841c cVar) {
        int i = cVar.f18716e;
        if (i == 1) {
            return C7728ai.m22200a("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", C7843e.m23029a(cVar.f18717f));
        } else if (i == 2) {
            return C7728ai.m22200a("0.1em 0.12em 0.15em %s", C7843e.m23029a(cVar.f18717f));
        } else if (i == 3) {
            return C7728ai.m22200a("0.06em 0.08em 0.15em %s", C7843e.m23029a(cVar.f18717f));
        } else if (i != 4) {
            return "unset";
        } else {
            return C7728ai.m22200a("-0.05em -0.05em 0.15em %s", C7843e.m23029a(cVar.f18717f));
        }
    }

    /* renamed from: b */
    private static int m23225b(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0152, code lost:
        if (r13 != false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0155, code lost:
        if (r13 != false) goto L_0x0157;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x024f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m23226b() {
        /*
            r26 = this;
            r0 = r26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.applovin.exoplayer2.ui.c r4 = r0.f18896d
            int r4 = r4.f18713b
            java.lang.String r4 = com.applovin.exoplayer2.p224ui.C7843e.m23029a((int) r4)
            r5 = 0
            r3[r5] = r4
            int r4 = r0.f18898f
            float r6 = r0.f18897e
            java.lang.String r4 = r0.m23221a(r4, r6)
            r6 = 1
            r3[r6] = r4
            r4 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r7 = java.lang.Float.valueOf(r4)
            r8 = 2
            r3[r8] = r7
            com.applovin.exoplayer2.ui.c r7 = r0.f18896d
            java.lang.String r7 = m23224a((com.applovin.exoplayer2.p224ui.C7841c) r7)
            r9 = 3
            r3[r9] = r7
            java.lang.String r7 = "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>"
            java.lang.String r3 = com.applovin.exoplayer2.p221l.C7728ai.m22200a((java.lang.String) r7, (java.lang.Object[]) r3)
            r1.append(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r7 = "default_bg"
            java.lang.String r10 = com.applovin.exoplayer2.p224ui.C7843e.m23030a((java.lang.String) r7)
            java.lang.Object[] r11 = new java.lang.Object[r6]
            com.applovin.exoplayer2.ui.c r12 = r0.f18896d
            int r12 = r12.f18714c
            java.lang.String r12 = com.applovin.exoplayer2.p224ui.C7843e.m23029a((int) r12)
            r11[r5] = r12
            java.lang.String r12 = "background-color:%s;"
            java.lang.String r11 = com.applovin.exoplayer2.p221l.C7728ai.m22200a((java.lang.String) r12, (java.lang.Object[]) r11)
            r3.put(r10, r11)
            r10 = 0
        L_0x005d:
            java.util.List<com.applovin.exoplayer2.i.a> r11 = r0.f18895c
            int r11 = r11.size()
            if (r10 >= r11) goto L_0x026c
            java.util.List<com.applovin.exoplayer2.i.a> r11 = r0.f18895c
            java.lang.Object r11 = r11.get(r10)
            com.applovin.exoplayer2.i.a r11 = (com.applovin.exoplayer2.p209i.C7540a) r11
            float r12 = r11.f17408i
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r14 = 1120403456(0x42c80000, float:100.0)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 == 0) goto L_0x007d
            float r12 = r11.f17408i
            float r12 = r12 * r14
            goto L_0x007f
        L_0x007d:
            r12 = 1112014848(0x42480000, float:50.0)
        L_0x007f:
            int r15 = r11.f17409j
            int r15 = m23225b(r15)
            float r2 = r11.f17405f
            r17 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r9 = "%.2f%%"
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x00e7
            int r2 = r11.f17406g
            if (r2 == r6) goto L_0x00b6
            java.lang.Object[] r2 = new java.lang.Object[r6]
            float r8 = r11.f17405f
            float r8 = r8 * r14
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r2[r5] = r8
            java.lang.String r2 = com.applovin.exoplayer2.p221l.C7728ai.m22200a((java.lang.String) r9, (java.lang.Object[]) r2)
            int r8 = r11.f17416q
            if (r8 != r6) goto L_0x00af
            int r8 = r11.f17407h
            int r8 = m23225b(r8)
            int r8 = -r8
            goto L_0x00fb
        L_0x00af:
            int r8 = r11.f17407h
            int r8 = m23225b(r8)
            goto L_0x00fb
        L_0x00b6:
            float r2 = r11.f17405f
            r8 = 0
            java.lang.String r13 = "%.2fem"
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x00d1
            java.lang.Object[] r2 = new java.lang.Object[r6]
            float r8 = r11.f17405f
            float r8 = r8 * r4
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r2[r5] = r8
            java.lang.String r2 = com.applovin.exoplayer2.p221l.C7728ai.m22200a((java.lang.String) r13, (java.lang.Object[]) r2)
            r8 = 0
            goto L_0x00fb
        L_0x00d1:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            float r8 = r11.f17405f
            float r8 = -r8
            float r8 = r8 - r17
            float r8 = r8 * r4
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r2[r5] = r8
            java.lang.String r2 = com.applovin.exoplayer2.p221l.C7728ai.m22200a((java.lang.String) r13, (java.lang.Object[]) r2)
            r8 = 0
            r13 = 1
            goto L_0x00fc
        L_0x00e7:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            float r8 = r0.f18899g
            float r17 = r17 - r8
            float r17 = r17 * r14
            java.lang.Float r8 = java.lang.Float.valueOf(r17)
            r2[r5] = r8
            java.lang.String r2 = com.applovin.exoplayer2.p221l.C7728ai.m22200a((java.lang.String) r9, (java.lang.Object[]) r2)
            r8 = -100
        L_0x00fb:
            r13 = 0
        L_0x00fc:
            float r4 = r11.f17410k
            r18 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r4 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r4 == 0) goto L_0x0116
            java.lang.Object[] r4 = new java.lang.Object[r6]
            float r6 = r11.f17410k
            float r6 = r6 * r14
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r4[r5] = r6
            java.lang.String r4 = com.applovin.exoplayer2.p221l.C7728ai.m22200a((java.lang.String) r9, (java.lang.Object[]) r4)
            goto L_0x0118
        L_0x0116:
            java.lang.String r4 = "fit-content"
        L_0x0118:
            android.text.Layout$Alignment r6 = r11.f17402c
            java.lang.String r6 = m23222a((android.text.Layout.Alignment) r6)
            int r9 = r11.f17416q
            java.lang.String r9 = m23220a((int) r9)
            int r14 = r11.f17414o
            float r5 = r11.f17415p
            java.lang.String r5 = r0.m23221a(r14, r5)
            boolean r14 = r11.f17412m
            if (r14 == 0) goto L_0x0133
            int r14 = r11.f17413n
            goto L_0x0137
        L_0x0133:
            com.applovin.exoplayer2.ui.c r14 = r0.f18896d
            int r14 = r14.f18715d
        L_0x0137:
            java.lang.String r14 = com.applovin.exoplayer2.p224ui.C7843e.m23029a((int) r14)
            r20 = r8
            int r8 = r11.f17416q
            java.lang.String r21 = "right"
            java.lang.String r22 = "left"
            java.lang.String r23 = "top"
            r24 = r15
            r15 = 1
            if (r8 == r15) goto L_0x0155
            r15 = 2
            if (r8 == r15) goto L_0x0152
            if (r13 == 0) goto L_0x015d
            java.lang.String r23 = "bottom"
            goto L_0x015d
        L_0x0152:
            if (r13 == 0) goto L_0x0157
            goto L_0x0159
        L_0x0155:
            if (r13 == 0) goto L_0x0159
        L_0x0157:
            r21 = r22
        L_0x0159:
            r22 = r23
            r23 = r21
        L_0x015d:
            int r8 = r11.f17416q
            r13 = 2
            if (r8 == r13) goto L_0x016d
            int r8 = r11.f17416q
            r13 = 1
            if (r8 != r13) goto L_0x0168
            goto L_0x016d
        L_0x0168:
            java.lang.String r8 = "width"
            r15 = r24
            goto L_0x0173
        L_0x016d:
            java.lang.String r8 = "height"
            r15 = r20
            r20 = r24
        L_0x0173:
            java.lang.CharSequence r13 = r11.f17401b
            android.content.Context r21 = r26.getContext()
            android.content.res.Resources r21 = r21.getResources()
            android.util.DisplayMetrics r0 = r21.getDisplayMetrics()
            float r0 = r0.density
            com.applovin.exoplayer2.ui.h$a r0 = com.applovin.exoplayer2.p224ui.C7852h.m23189a((java.lang.CharSequence) r13, (float) r0)
            java.util.Set r13 = r3.keySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x018f:
            boolean r21 = r13.hasNext()
            if (r21 == 0) goto L_0x01c7
            java.lang.Object r21 = r13.next()
            r24 = r13
            r13 = r21
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r21 = r3.get(r13)
            r25 = r0
            r0 = r21
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r3.put(r13, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x01be
            java.lang.Object r13 = r3.get(r13)
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x01bc
            goto L_0x01be
        L_0x01bc:
            r0 = 0
            goto L_0x01bf
        L_0x01be:
            r0 = 1
        L_0x01bf:
            com.applovin.exoplayer2.p221l.C7717a.m22121b((boolean) r0)
            r13 = r24
            r0 = r25
            goto L_0x018f
        L_0x01c7:
            r25 = r0
            r0 = 14
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            r19 = 0
            r0[r19] = r13
            r13 = 1
            r0[r13] = r22
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r13 = 2
            r0[r13] = r12
            r12 = 3
            r0[r12] = r23
            r16 = 4
            r0[r16] = r2
            r2 = 5
            r0[r2] = r8
            r2 = 6
            r0[r2] = r4
            r2 = 7
            r0[r2] = r6
            r2 = 8
            r0[r2] = r9
            r2 = 9
            r0[r2] = r5
            r2 = 10
            r0[r2] = r14
            r2 = 11
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r0[r2] = r4
            r2 = 12
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            r0[r2] = r4
            r2 = 13
            java.lang.String r4 = m23223a((com.applovin.exoplayer2.p209i.C7540a) r11)
            r0[r2] = r4
            java.lang.String r2 = "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>"
            java.lang.String r0 = com.applovin.exoplayer2.p221l.C7728ai.m22200a((java.lang.String) r2, (java.lang.Object[]) r0)
            r1.append(r0)
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r4 = 0
            r2[r4] = r7
            java.lang.String r5 = "<span class='%s'>"
            java.lang.String r2 = com.applovin.exoplayer2.p221l.C7728ai.m22200a((java.lang.String) r5, (java.lang.Object[]) r2)
            r1.append(r2)
            android.text.Layout$Alignment r2 = r11.f17403d
            java.lang.String r5 = "</span>"
            if (r2 == 0) goto L_0x024f
            java.lang.Object[] r2 = new java.lang.Object[r0]
            android.text.Layout$Alignment r0 = r11.f17403d
            java.lang.String r0 = m23222a((android.text.Layout.Alignment) r0)
            r2[r4] = r0
            java.lang.String r0 = "<span style='display:inline-block; text-align:%s;'>"
            java.lang.String r0 = com.applovin.exoplayer2.p221l.C7728ai.m22200a((java.lang.String) r0, (java.lang.Object[]) r2)
            r1.append(r0)
            r0 = r25
            java.lang.String r0 = r0.f18847a
            r1.append(r0)
            r1.append(r5)
            goto L_0x0256
        L_0x024f:
            r0 = r25
            java.lang.String r0 = r0.f18847a
            r1.append(r0)
        L_0x0256:
            r1.append(r5)
            java.lang.String r0 = "</div>"
            r1.append(r0)
            int r10 = r10 + 1
            r2 = 4
            r4 = 1067030938(0x3f99999a, float:1.2)
            r5 = 0
            r8 = 2
            r9 = 3
            r0 = r26
            r6 = 1
            goto L_0x005d
        L_0x026c:
            java.lang.String r0 = "</div></body></html>"
            r1.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "<html><head><style>"
            r0.append(r2)
            java.util.Set r2 = r3.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0283:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x02a6
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r5 = "{"
            r0.append(r5)
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r4 = "}"
            r0.append(r4)
            goto L_0x0283
        L_0x02a6:
            java.lang.String r2 = "</style></head>"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            r1.insert(r2, r0)
            r0 = r26
            android.webkit.WebView r2 = r0.f18894b
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r3 = com.applovin.exoplayer2.common.base.Charsets.UTF_8
            byte[] r1 = r1.getBytes(r3)
            r3 = 1
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r3)
            java.lang.String r3 = "text/html"
            java.lang.String r4 = "base64"
            r2.loadData(r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p224ui.C7861l.m23226b():void");
    }

    /* renamed from: a */
    public void mo55404a() {
        this.f18894b.destroy();
    }

    /* renamed from: a */
    public void mo55291a(List<C7540a> list, C7841c cVar, float f, int i, float f2) {
        this.f18896d = cVar;
        this.f18897e = f;
        this.f18898f = i;
        this.f18899g = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C7540a aVar = list.get(i2);
            if (aVar.f17404e != null) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        if (!this.f18895c.isEmpty() || !arrayList2.isEmpty()) {
            this.f18895c = arrayList2;
            m23226b();
        }
        this.f18893a.mo55291a(arrayList, cVar, f, i, f2);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.f18895c.isEmpty()) {
            m23226b();
        }
    }
}
