package p152ms.p153bd.p154o.Pgl;

import com.applovin.exoplayer2.common.base.Ascii;
import org.json.JSONObject;
import p152ms.p153bd.p154o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.pblm */
public abstract class pblm extends pblb.pgla {

    /* renamed from: a */
    private static pblm f12995a;

    /* renamed from: ms.bd.o.Pgl.pblm$pgla */
    public static class pgla {

        /* renamed from: a */
        private long f12996a;

        /* renamed from: b */
        private long f12997b;

        /* renamed from: c */
        private String f12998c;

        /* renamed from: d */
        private String f12999d;

        /* renamed from: a */
        public void mo42209a(String str) {
            this.f12998c = str;
            this.f12999d = null;
            this.f12996a = System.currentTimeMillis();
        }

        /* renamed from: a */
        public void mo42210a(String str, int i) {
            pblm a = pblm.m14623a();
            if (a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f12996a;
                long j2 = currentTimeMillis - j;
                this.f12997b = j2;
                a.mo42205a(j2, j, this.f12998c, this.f12999d, str, i, (JSONObject) null);
            }
        }

        /* renamed from: b */
        public void mo42211b(String str, int i) {
            pblm a = pblm.m14623a();
            if (a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f12996a;
                long j2 = currentTimeMillis - j;
                this.f12997b = j2;
                a.mo42208b(j2, j, this.f12998c, this.f12999d, str, i, (JSONObject) null);
            }
        }
    }

    /* renamed from: a */
    public static synchronized pblm m14623a() {
        pblm pblm;
        synchronized (pblm.class) {
            pblm = f12995a;
        }
        return pblm;
    }

    /* renamed from: a */
    public static synchronized void m14624a(pblm pblm) {
        synchronized (pblm.class) {
            f12995a = pblm;
        }
    }

    /* renamed from: a */
    public Object mo42204a(int i, int i2, long j, String str, Object obj) throws Throwable {
        if (i != 131073) {
            if (i == 131074) {
                String[] strArr = (String[]) obj;
                if (!(str == null || strArr == null || strArr.length == 0)) {
                    mo42206a(str, new JSONObject(strArr[0]), new JSONObject(strArr[1]), new JSONObject(strArr[2]));
                }
            }
            return null;
        } else if (str == null || !mo42207a(str)) {
            return null;
        } else {
            return (String) pblk.m14617a(16777217, 0, 0, "15fb7c", new byte[]{Ascii.f15551SI, Ascii.f15545FS});
        }
    }

    /* renamed from: a */
    public abstract void mo42205a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject);

    /* renamed from: a */
    public abstract void mo42206a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    /* renamed from: a */
    public abstract boolean mo42207a(String str);

    /* renamed from: b */
    public abstract void mo42208b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject);
}
