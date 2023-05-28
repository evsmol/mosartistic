package com.applovin.impl.mediation.debugger.p243ui.p248d;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.C8570g;
import com.applovin.sdk.C8656R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.d.c */
public class C8214c {

    /* renamed from: b */
    protected C8217b f20121b;

    /* renamed from: c */
    protected boolean f20122c;

    /* renamed from: d */
    protected SpannedString f20123d;

    /* renamed from: e */
    protected SpannedString f20124e;

    /* renamed from: f */
    protected String f20125f;

    /* renamed from: g */
    protected String f20126g;

    /* renamed from: h */
    protected int f20127h;

    /* renamed from: i */
    protected int f20128i;

    /* renamed from: j */
    protected int f20129j;

    /* renamed from: k */
    protected int f20130k;

    /* renamed from: l */
    protected int f20131l;

    /* renamed from: m */
    protected int f20132m;

    /* renamed from: n */
    protected boolean f20133n;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.d.c$a */
    public static class C8216a {

        /* renamed from: a */
        final C8217b f20134a;

        /* renamed from: b */
        boolean f20135b;

        /* renamed from: c */
        SpannedString f20136c;

        /* renamed from: d */
        SpannedString f20137d;

        /* renamed from: e */
        String f20138e;

        /* renamed from: f */
        String f20139f;

        /* renamed from: g */
        int f20140g = 0;

        /* renamed from: h */
        int f20141h = 0;

        /* renamed from: i */
        int f20142i = -16777216;

        /* renamed from: j */
        int f20143j = -16777216;

        /* renamed from: k */
        int f20144k = 0;

        /* renamed from: l */
        int f20145l = 0;

        /* renamed from: m */
        boolean f20146m;

        public C8216a(C8217b bVar) {
            this.f20134a = bVar;
        }

        /* renamed from: a */
        public C8216a mo56483a(int i) {
            this.f20141h = i;
            return this;
        }

        /* renamed from: a */
        public C8216a mo56484a(Context context) {
            this.f20141h = C8656R.C8659drawable.applovin_ic_disclosure_arrow;
            this.f20145l = C8570g.m26080a(C8656R.C8658color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        /* renamed from: a */
        public C8216a mo56485a(SpannedString spannedString) {
            this.f20136c = spannedString;
            return this;
        }

        /* renamed from: a */
        public C8216a mo56486a(String str) {
            return mo56485a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        /* renamed from: a */
        public C8216a mo56487a(boolean z) {
            this.f20135b = z;
            return this;
        }

        /* renamed from: a */
        public C8214c mo56488a() {
            return new C8214c(this);
        }

        /* renamed from: b */
        public C8216a mo56489b(int i) {
            this.f20143j = i;
            return this;
        }

        /* renamed from: b */
        public C8216a mo56490b(SpannedString spannedString) {
            this.f20137d = spannedString;
            return this;
        }

        /* renamed from: b */
        public C8216a mo56491b(String str) {
            return mo56490b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        /* renamed from: b */
        public C8216a mo56492b(boolean z) {
            this.f20146m = z;
            return this;
        }

        /* renamed from: c */
        public C8216a mo56493c(int i) {
            this.f20145l = i;
            return this;
        }

        /* renamed from: c */
        public C8216a mo56494c(String str) {
            this.f20138e = str;
            return this;
        }

        /* renamed from: d */
        public C8216a mo56495d(String str) {
            this.f20139f = str;
            return this;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.d.c$b */
    public enum C8217b {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);
        

        /* renamed from: g */
        private final int f20154g;

        private C8217b(int i) {
            this.f20154g = i;
        }

        /* renamed from: a */
        public int mo56496a() {
            return this.f20154g;
        }

        /* renamed from: b */
        public int mo56497b() {
            if (this == SECTION) {
                return C8656R.layout.mediation_debugger_list_section;
            }
            if (this == SECTION_CENTERED) {
                return C8656R.layout.mediation_debugger_list_section_centered;
            }
            if (this == SIMPLE) {
                return 17367043;
            }
            return this == DETAIL ? C8656R.layout.applovin_debugger_list_item_detail : C8656R.layout.mediation_debugger_list_item_right_detail;
        }
    }

    private C8214c(C8216a aVar) {
        this.f20127h = 0;
        this.f20128i = 0;
        this.f20129j = -16777216;
        this.f20130k = -16777216;
        this.f20131l = 0;
        this.f20132m = 0;
        this.f20121b = aVar.f20134a;
        this.f20122c = aVar.f20135b;
        this.f20123d = aVar.f20136c;
        this.f20124e = aVar.f20137d;
        this.f20125f = aVar.f20138e;
        this.f20126g = aVar.f20139f;
        this.f20127h = aVar.f20140g;
        this.f20128i = aVar.f20141h;
        this.f20129j = aVar.f20142i;
        this.f20130k = aVar.f20143j;
        this.f20131l = aVar.f20144k;
        this.f20132m = aVar.f20145l;
        this.f20133n = aVar.f20146m;
    }

    protected C8214c(C8217b bVar) {
        this.f20127h = 0;
        this.f20128i = 0;
        this.f20129j = -16777216;
        this.f20130k = -16777216;
        this.f20131l = 0;
        this.f20132m = 0;
        this.f20121b = bVar;
    }

    /* renamed from: a */
    public static C8216a m24665a(C8217b bVar) {
        return new C8216a(bVar);
    }

    /* renamed from: h */
    public static int m24666h() {
        return C8217b.COUNT.mo56496a();
    }

    /* renamed from: p */
    public static C8216a m24667p() {
        return m24665a(C8217b.RIGHT_DETAIL);
    }

    /* renamed from: a */
    public int mo55477a() {
        return this.f20128i;
    }

    /* renamed from: b */
    public int mo55478b() {
        return this.f20132m;
    }

    /* renamed from: c */
    public boolean mo55479c() {
        return this.f20122c;
    }

    /* renamed from: e */
    public int mo56424e() {
        return this.f20130k;
    }

    /* renamed from: g */
    public int mo56443g() {
        return this.f20127h;
    }

    /* renamed from: i */
    public int mo56476i() {
        return this.f20121b.mo56496a();
    }

    /* renamed from: i_ */
    public SpannedString mo56445i_() {
        return this.f20124e;
    }

    /* renamed from: j */
    public int mo56477j() {
        return this.f20121b.mo56497b();
    }

    /* renamed from: j_ */
    public boolean mo56446j_() {
        return this.f20133n;
    }

    /* renamed from: k */
    public SpannedString mo56478k() {
        return this.f20123d;
    }

    /* renamed from: l */
    public String mo56479l() {
        return this.f20125f;
    }

    /* renamed from: m */
    public String mo56480m() {
        return this.f20126g;
    }

    /* renamed from: n */
    public int mo56481n() {
        return this.f20129j;
    }

    /* renamed from: o */
    public int mo56482o() {
        return this.f20131l;
    }
}
