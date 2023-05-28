package com.apm.insight.p176j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.C6617h;
import com.apm.insight.entity.C6595b;
import com.apm.insight.runtime.C6740d;
import com.apm.insight.runtime.C6761p;
import com.apm.insight.runtime.C6766s;
import java.util.Map;

/* renamed from: com.apm.insight.j.b */
public class C6629b extends C6628a {

    /* renamed from: b */
    private static Runnable f14251b = new Runnable() {
        public void run() {
            C6761p.m17019b().mo52325a().removeCallbacks(this);
            C6761p.m17019b().mo52327a((Runnable) new C6629b(C6761p.m17019b().mo52325a(), 0, 30000, C6617h.m16313g()));
        }
    };

    /* renamed from: a */
    private Context f14252a;

    public C6629b(Handler handler, long j, long j2, Context context) {
        super(handler, j, j2);
        this.f14252a = context;
    }

    /* renamed from: d */
    public static void m16359d() {
        C6761p.m17019b().mo52328a(f14251b, 100);
    }

    public void run() {
        Map<String, Object> map;
        try {
            map = C6617h.m16297a().mo52292c().getCommonParams();
        } catch (Throwable unused) {
            map = null;
        }
        if (map != null) {
            try {
                if (C6740d.m16924a(map)) {
                    mo52114a(mo52116c());
                    return;
                }
            } catch (Throwable unused2) {
                return;
            }
        }
        C6766s.m17031a().mo52316a(map, C6595b.m16208b());
    }
}
