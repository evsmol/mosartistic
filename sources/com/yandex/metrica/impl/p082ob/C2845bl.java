package com.yandex.metrica.impl.p082ob;

import com.appnext.base.p260a.p263c.C8843d;
import com.yandex.metrica.impl.p082ob.C3454rl;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.bl */
public class C2845bl extends C3454rl {

    /* renamed from: h */
    public String f7498h;

    /* renamed from: i */
    public final int f7499i;

    /* renamed from: j */
    public Integer f7500j;

    /* renamed from: k */
    public final boolean f7501k;

    /* renamed from: l */
    public final C2847b f7502l;

    /* renamed from: m */
    public final Float f7503m;

    /* renamed from: n */
    public final Float f7504n;

    /* renamed from: o */
    public final Float f7505o;

    /* renamed from: p */
    public final String f7506p;

    /* renamed from: q */
    public final Boolean f7507q;

    /* renamed from: r */
    public final Boolean f7508r;

    /* renamed from: s */
    public Integer f7509s;

    /* renamed from: com.yandex.metrica.impl.ob.bl$a */
    static /* synthetic */ class C2846a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7510a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.text.TextUtils$TruncateAt[] r0 = android.text.TextUtils.TruncateAt.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7510a = r0
                android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7510a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7510a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.MIDDLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7510a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.MARQUEE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2845bl.C2846a.<clinit>():void");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bl$b */
    enum C2847b {
        START("START"),
        END("END"),
        MIDDLE("MIDDLE"),
        MARQUEE("MARQUEE"),
        NONE("NONE"),
        UNKNOWN("UNKNOWN");
        

        /* renamed from: a */
        final String f7518a;

        private C2847b(String str) {
            this.f7518a = str;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2845bl(String str, String str2, C3454rl.C3456b bVar, int i, boolean z, C3454rl.C3455a aVar, String str3, Float f, Float f2, Float f3, String str4, Boolean bool, Boolean bool2, boolean z2, int i2, C2847b bVar2) {
        super(str, str2, (C3454rl.C3456b) null, i, z, C3454rl.C3457c.VIEW, aVar);
        this.f7498h = str3;
        this.f7499i = i2;
        this.f7502l = bVar2;
        this.f7501k = z2;
        this.f7503m = f;
        this.f7504n = f2;
        this.f7505o = f3;
        this.f7506p = str4;
        this.f7507q = bool;
        this.f7508r = bool2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3454rl.C3456b mo17313a(C1870Ak ak) {
        C3454rl.C3456b bVar = this.f9049c;
        return bVar == null ? ak.mo15471a(this.f7498h) : bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo15958a() {
        return true;
    }

    public String toString() {
        return "TextViewElement{mText='" + this.f7498h + '\'' + ", mVisibleTextLength=" + this.f7499i + ", mOriginalTextLength=" + this.f7500j + ", mIsVisible=" + this.f7501k + ", mTextShorteningType=" + this.f7502l + ", mSizePx=" + this.f7503m + ", mSizeDp=" + this.f7504n + ", mSizeSp=" + this.f7505o + ", mColor='" + this.f7506p + '\'' + ", mIsBold=" + this.f7507q + ", mIsItalic=" + this.f7508r + ", mRelativeTextSize=" + this.f7509s + ", mClassName='" + this.f9047a + '\'' + ", mId='" + this.f9048b + '\'' + ", mParseFilterReason=" + this.f9049c + ", mDepth=" + this.f9050d + ", mListItem=" + this.f9051e + ", mViewType=" + this.f9052f + ", mClassType=" + this.f9053g + '}';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONArray mo15957a(C3040hl hlVar) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.f7498h;
            if (str.length() > hlVar.f8014l) {
                this.f7500j = Integer.valueOf(this.f7498h.length());
                str = this.f7498h.substring(0, hlVar.f8014l);
            }
            jSONObject.put(C8843d.COLUMN_TYPE, "TEXT");
            jSONObject.put("vl", str);
            jSONObject.put("i", m9204a(hlVar, str));
            jSONArray.put(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    /* renamed from: a */
    private JSONObject m9204a(C3040hl hlVar, String str) {
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            if (hlVar.f8003a) {
                jSONObject.putOpt("sp", this.f7503m).putOpt("sd", this.f7504n).putOpt("ss", this.f7505o);
            }
            if (hlVar.f8004b) {
                jSONObject.put("rts", this.f7509s);
            }
            if (hlVar.f8006d) {
                jSONObject.putOpt("c", this.f7506p).putOpt("ib", this.f7507q).putOpt("ii", this.f7508r);
            }
            if (hlVar.f8005c) {
                jSONObject.put("vtl", this.f7499i).put("iv", this.f7501k).put("tst", this.f7502l.f7518a);
            }
            Integer num = this.f7500j;
            if (num != null) {
                i = num.intValue();
            } else {
                i = this.f7498h.length();
            }
            if (hlVar.f8009g) {
                jSONObject.put("tl", str.length()).put("otl", i);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
