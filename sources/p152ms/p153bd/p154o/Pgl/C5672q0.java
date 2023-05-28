package p152ms.p153bd.p154o.Pgl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ms.bd.o.Pgl.q0 */
public class C5672q0 extends C5668o0 {

    /* renamed from: a */
    private Interceptor f13021a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f13022b;

    /* renamed from: ms.bd.o.Pgl.q0$pgla */
    class pgla implements Interceptor {
        pgla() {
        }

        public SsResponse intercept(Interceptor.Chain chain) throws Exception {
            SsResponse proceed = chain.proceed(chain.request());
            Iterator it = proceed.headers().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Header header = (Header) it.next();
                if (((String) pblk.m14617a(16777217, 0, 0, "b86b16", new byte[]{107, 119, 81, 91, Ascii.DC4, 41, 102})).equals(header.getName()) && header.getValue() != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((String) pblk.m14617a(16777217, 0, 0, "eb8180", new byte[]{102, 101, 91, 122, 3, 38, 114, 66}));
                    arrayList.add(header.getValue());
                    pblb.m14600a(117440513, 0, C5672q0.this.f13022b, (String) pblk.m14617a(16777217, 0, 0, "e1acaa", new byte[]{102, 54, 2, Ascii.CAN, 76, 98}), (String[]) arrayList.toArray(new String[0]));
                    break;
                }
            }
            return proceed;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo42198a(long j) {
        this.f13022b = j;
        pgla pgla2 = new pgla();
        this.f13021a = pgla2;
        RetrofitUtils.addInterceptor(pgla2);
        return Boolean.TRUE;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        RetrofitUtils.removeInterceptor(this.f13021a);
        super.finalize();
    }
}
