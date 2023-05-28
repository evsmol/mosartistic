package com.yandex.metrica.impl.p082ob;

import com.appnext.base.p260a.p263c.C8840a;
import com.appnext.base.p260a.p263c.C8843d;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.rl */
public class C3454rl {

    /* renamed from: a */
    public final String f9047a;

    /* renamed from: b */
    public final String f9048b;

    /* renamed from: c */
    public final C3456b f9049c;

    /* renamed from: d */
    public final int f9050d;

    /* renamed from: e */
    public final boolean f9051e;

    /* renamed from: f */
    public final C3457c f9052f;

    /* renamed from: g */
    public final C3455a f9053g;

    /* renamed from: com.yandex.metrica.impl.ob.rl$a */
    enum C3455a {
        LIST("LIST"),
        LABEL("LABEL"),
        BUTTON("BUTTON"),
        CONTAINER("CONTAINER"),
        TOOLBAR("TOOLBAR"),
        INPUT("INPUT"),
        IMAGE("IMAGE"),
        WEBVIEW("WEBVIEW"),
        OTHER("OTHER");
        
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f9064a;

        private C3455a(String str) {
            this.f9064a = str;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.rl$b */
    enum C3456b {
        TEXT_TOO_LONG("TEXT_TOO_LONG"),
        REGEXP_NOT_MATCHED("REGEXP_NOT_MATCHED"),
        IRRELEVANT_CLASS("IRRELEVANT_CLASS"),
        BAD_REGEXP_MATCHED("BAD_REGEXP_MATCHED"),
        EQUALS("EQUALS"),
        CONTAINS("CONTAINS");
        
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f9072a;

        private C3456b(String str) {
            this.f9072a = str;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.rl$c */
    enum C3457c {
        VIEW_CONTAINER("VIEW_CONTAINER"),
        VIEW("VIEW");
        
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f9076a;

        private C3457c(String str) {
            this.f9076a = str;
        }
    }

    C3454rl(String str, String str2, C3456b bVar, int i, boolean z, C3457c cVar, C3455a aVar) {
        this.f9047a = str;
        this.f9048b = str2;
        this.f9049c = bVar;
        this.f9050d = i;
        this.f9051e = z;
        this.f9052f = cVar;
        this.f9053g = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3456b mo17313a(C1870Ak ak) {
        return this.f9049c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONArray mo15957a(C3040hl hlVar) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo15958a() {
        return false;
    }

    public String toString() {
        return "UiElement{mClassName='" + this.f9047a + '\'' + ", mId='" + this.f9048b + '\'' + ", mParseFilterReason=" + this.f9049c + ", mDepth=" + this.f9050d + ", mListItem=" + this.f9051e + ", mViewType=" + this.f9052f + ", mClassType=" + this.f9053g + '}';
    }

    /* renamed from: a */
    public JSONObject mo18179a(C3040hl hlVar, C3456b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C8843d.COLUMN_TYPE, this.f9052f.f9076a);
            if (bVar == null) {
                jSONObject.put("cnt", mo15957a(hlVar));
            }
            if (hlVar.f8007e) {
                JSONObject put = new JSONObject().put(C8840a.f22387dS, this.f9053g.f9064a).put("cn", this.f9047a).put("rid", this.f9048b).put("d", this.f9050d).put("lc", this.f9051e).put("if", bVar != null);
                if (bVar != null) {
                    put.put("fr", bVar.f9072a);
                }
                jSONObject.put("i", put);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
