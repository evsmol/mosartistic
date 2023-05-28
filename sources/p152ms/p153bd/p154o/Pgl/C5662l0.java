package p152ms.p153bd.p154o.Pgl;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import p152ms.p153bd.p154o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.l0 */
public class C5662l0 {

    /* renamed from: a */
    private static volatile boolean f12984a;

    /* renamed from: b */
    private static final Map<String, C5643c> f12985b = new ConcurrentHashMap();

    /* renamed from: ms.bd.o.Pgl.l0$pgla */
    public interface pgla {
        Map<String, String> frameSign(String str, int i);

        Map<String, String> getFeatureHash(String str, byte[] bArr);

        Map<String, String> getReportRaw(String str, int i, Map<String, String> map);

        String getToken();

        void report(String str);

        void setBDDeviceID(String str);

        void setCollectMode(int i);

        void setDeviceID(String str);

        void setInstallID(String str);

        void setSessionID(String str);
    }

    /* renamed from: a */
    public static String m14578a() {
        return (String) pblb.m14599a(67108867);
    }

    /* renamed from: a */
    public static synchronized pgla m14579a(String str) {
        synchronized (C5662l0.class) {
            if (str == null) {
                throw new NullPointerException((String) pblk.m14617a(16777217, 0, 0, "50af32", new byte[]{37, 34, 2, 59, 40, 101, 59, 4, 35, 34, 100, 48, Ascii.ETB, 82, Ascii.f15554US, 32, 34}));
            } else if (!f12984a) {
                return null;
            } else {
                Object a = pblb.m14602a(67108866, str);
                if (a == null) {
                    return null;
                }
                C5643c cVar = f12985b.get(str);
                if (cVar == null) {
                    return null;
                }
                C5660k0 k0Var = new C5660k0(cVar, pgla.m14675a().mo42236b(), ((Long) a).longValue());
                return k0Var;
            }
        }
    }

    /* renamed from: a */
    public static synchronized boolean m14580a(Context context, C5643c cVar, String str, String str2) {
        C5643c cVar2 = cVar;
        synchronized (C5662l0.class) {
            if (context == null) {
                throw new NullPointerException((String) pblk.m14617a(16777217, 0, 0, "c3c598", new byte[]{113, 62, Ascii.f15550RS, 85, 3, 55, 116, 82, 49, 106, 103, 61, Ascii.DC4, 1, 8, 32, 116, 82, 48, 96, 50, 63, 5, 77, 10}));
            } else if (cVar2 != null) {
                String str3 = cVar2.f12967a;
                String str4 = (str3 == null || str3.length() <= 0) ? cVar2.f12973g : cVar2.f12967a;
                if (str4 == null || str4.length() <= 0) {
                    throw new NullPointerException((String) pblk.m14617a(16777217, 0, 0, "8b4cf5", new byte[]{40, 112, 87, 62, 125, 98, 54, 86, 118, 39, 105, 98, 66, 87, 74, 39, 47}));
                }
                synchronized (C5662l0.class) {
                    if (!f12984a) {
                        Context applicationContext = context.getApplicationContext();
                        pgla.m14675a().mo42235a(applicationContext);
                        try {
                            pblu.m14653a(applicationContext, str2);
                        } catch (Throwable unused) {
                        }
                        pblu.m14653a(applicationContext, str);
                        String str5 = (String) pblk.m14617a(16777217, 0, 0, "ac6ae2", new byte[]{62, 108, 86});
                        pblb.m14603a(16777218, (pblb.pgla) new C5665n());
                        pblb.m14603a(16777217, (pblb.pgla) new C5687y());
                        String str6 = (String) pblk.m14617a(16777217, 0, 0, "48316a", new byte[]{107, 55, 68});
                        pblb.m14603a(16777219, (pblb.pgla) new C5646d0());
                        pblb.m14603a(16777221, (pblb.pgla) new C5648e0());
                        pblb.m14603a(16777222, (pblb.pgla) new C5650f0());
                        pblb.m14603a(16777223, (pblb.pgla) new C5652g0());
                        pblb.m14603a(16777224, (pblb.pgla) new C5654h0());
                        pblb.m14603a(16777225, (pblb.pgla) new C5656i0());
                        pblb.m14603a(16777226, (pblb.pgla) new C5658j0());
                        pblb.m14603a(16777228, (pblb.pgla) new C5645d());
                        pblb.m14603a(16777232, (pblb.pgla) new C5647e());
                        pblb.m14603a(16777233, (pblb.pgla) new C5649f());
                        pblb.m14603a(16777235, (pblb.pgla) new C5651g());
                        pblb.m14603a(16777238, (pblb.pgla) new C5653h());
                        pblb.m14603a(16777239, (pblb.pgla) new C5655i());
                        pblb.m14603a(16777241, (pblb.pgla) new C5657j());
                        pblb.m14603a(16777242, (pblb.pgla) new C5659k());
                        pblb.m14603a(16777243, (pblb.pgla) new C5661l());
                        pblb.m14603a(16777244, (pblb.pgla) new C5663m());
                        pblb.m14603a(16777245, (pblb.pgla) new C5667o());
                        pblb.m14603a(16777246, (pblb.pgla) new C5669p());
                        pblb.m14603a(16777247, (pblb.pgla) new C5671q());
                        pblb.m14603a(16777248, (pblb.pgla) new C5673r());
                        pblb.m14603a(16777249, (pblb.pgla) new C5675s());
                        pblb.m14603a(16777250, (pblb.pgla) new C5677t());
                        pblb.m14603a(16777251, (pblb.pgla) new C5679u());
                        pblb.m14603a(16777240, (pblb.pgla) new C5681v());
                        pblb.m14603a(16777252, (pblb.pgla) new C5683w());
                        pblb.m14603a(16777253, (pblb.pgla) new C5685x());
                        pblb.m14603a(16777254, (pblb.pgla) new C5689z());
                        pblb.m14603a(16777255, (pblb.pgla) new C5640a0());
                        pblb.m14603a(16777256, (pblb.pgla) new C5642b0());
                        pblb.m14603a(16777257, (pblb.pgla) new C5644c0());
                        pblb.m14603a(33554433, pbly.m14668b() ? new C5670p0() : new C5666n0());
                        pblb.m14603a(33554434, (pblb.pgla) new C5672q0());
                        pblj.m14614a();
                        com.bytedance.mobsec.metasec.p292ov.pgla.m29313a();
                        pblk.m14617a(16777219, 0, 0, (String) null, applicationContext);
                        pblk.m14617a(16777220, 0, 0, (String) null, (Object) null);
                        f12984a = true;
                    }
                }
                if (f12985b.containsKey(str4)) {
                    return false;
                }
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(cVar2.mo42173a(cVar2.f12967a));
                jSONArray.put(cVar2.mo42173a(cVar2.f12974h));
                jSONArray.put(cVar2.mo42173a(cVar2.f12973g));
                jSONArray.put(cVar2.mo42173a(cVar2.f12975i));
                jSONArray.put(cVar2.mo42173a(C5686x0.m14704a()));
                jSONArray.put(cVar2.mo42173a(cVar2.f12968b));
                jSONArray.put(cVar2.mo42173a(cVar2.f12969c));
                jSONArray.put(cVar2.mo42173a(cVar2.f12970d));
                jSONArray.put(cVar2.mo42173a(cVar2.f12971e));
                jSONArray.put(cVar2.mo42173a(cVar2.f12972f));
                jSONArray.put(String.valueOf(cVar2.f12976j));
                jSONArray.put(String.valueOf(cVar2.f12977k));
                jSONArray.put(String.valueOf(cVar2.f12978l));
                JSONArray jSONArray2 = new JSONArray();
                for (Map.Entry next : cVar2.f12979m.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) next.getKey())) {
                        jSONArray2.put(cVar2.mo42173a(next.getKey()));
                        jSONArray2.put(cVar2.mo42173a(next.getValue()));
                    }
                }
                jSONArray.put(jSONArray2);
                JSONArray jSONArray3 = new JSONArray();
                for (Map.Entry next2 : cVar2.f12980n.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) next2.getKey())) {
                        jSONArray3.put(cVar2.mo42173a(next2.getKey()));
                        jSONArray3.put(cVar2.mo42173a(next2.getValue()));
                    }
                }
                jSONArray.put(jSONArray3);
                if (!((Boolean) pblb.m14602a(67108865, jSONArray.toString())).booleanValue()) {
                    return false;
                }
                f12985b.put(str4, cVar2);
                return true;
            } else {
                throw new NullPointerException((String) pblk.m14617a(16777217, 0, 0, "c20a0c", new byte[]{113, 63, 77, 19, 6, 115, 32, Ascii.DLE, 110, 36, 126, 52, 3, Ascii.ESC, 0, 96, 32, 17, 100, 113, 124, 37, 79, Ascii.f15543EM}));
            }
        }
    }
}
