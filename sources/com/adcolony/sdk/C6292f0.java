package com.adcolony.sdk;

import com.appodeal.ads.modules.common.internal.LogConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.adcolony.sdk.f0 */
class C6292f0 {

    /* renamed from: e */
    static final SimpleDateFormat f13504e = new SimpleDateFormat("yyyyMMdd'T'HHmmss.SSSZ", Locale.US);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Date f13505a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f13506b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6203b0 f13507c;

    /* renamed from: d */
    protected String f13508d;

    /* renamed from: com.adcolony.sdk.f0$a */
    static class C6293a {

        /* renamed from: a */
        protected C6292f0 f13509a = new C6292f0();

        C6293a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6293a mo50668a(int i) {
            int unused = this.f13509a.f13506b = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6293a mo50669a(C6203b0 b0Var) {
            C6203b0 unused = this.f13509a.f13507c = b0Var;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6293a mo50670a(String str) {
            this.f13509a.f13508d = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6292f0 mo50671a() {
            if (this.f13509a.f13505a == null) {
                Date unused = this.f13509a.f13505a = new Date(System.currentTimeMillis());
            }
            return this.f13509a;
        }
    }

    C6292f0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo50664b() {
        int i = this.f13506b;
        if (i == -1) {
            return "Fatal";
        }
        if (i == 0) {
            return LogConstants.EVENT_ERROR;
        }
        if (i == 1) {
            return "Warn";
        }
        if (i != 2) {
            return i != 3 ? "UNKNOWN LOG LEVEL" : "Debug";
        }
        return LogConstants.EVENT_INFO;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo50665c() {
        return this.f13508d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo50666d() {
        return f13504e.format(this.f13505a);
    }

    public String toString() {
        return mo50666d() + " " + mo50664b() + "/" + mo50663a().mo50459a() + ": " + mo50665c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6203b0 mo50663a() {
        return this.f13507c;
    }
}
