package com.yandex.metrica.impl.interact;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.impl.p082ob.C2410P;
import com.yandex.metrica.impl.p082ob.C2723Xj;
import com.yandex.metrica.impl.p082ob.C2778Zj;
import com.yandex.metrica.impl.p082ob.C2810ak;
import com.yandex.metrica.impl.p082ob.C3555uj;
import java.util.HashMap;
import java.util.Map;

public class CellularNetworkInfo {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f5011a = "";

    /* renamed from: com.yandex.metrica.impl.interact.CellularNetworkInfo$a */
    class C1839a implements C2810ak {
        C1839a() {
        }

        /* renamed from: a */
        public void mo15406a(C2778Zj zj) {
            C3555uj b = zj.mo17124b();
            if (b != null) {
                String m = b.mo18287m();
                String n = b.mo18288n();
                Integer l = b.mo18286l();
                Integer k = b.mo18285k();
                Integer b2 = b.mo18276b();
                Integer e = b.mo18279e();
                Integer p = b.mo18290p();
                HashMap hashMap = new HashMap();
                hashMap.put("network_type", m);
                hashMap.put("operator_name", n);
                String str = null;
                hashMap.put("country_code", k != null ? String.valueOf(k) : null);
                hashMap.put("operator_id", l != null ? String.valueOf(l) : null);
                hashMap.put("cell_id", b2 != null ? String.valueOf(b2) : null);
                hashMap.put("lac", e != null ? String.valueOf(e) : null);
                if (p != null) {
                    str = String.valueOf(p);
                }
                hashMap.put("signal_strength", str);
                StringBuilder sb = new StringBuilder();
                String str2 = "";
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getValue();
                    if (!TextUtils.isEmpty(str3)) {
                        sb.append(str2);
                        sb.append((String) entry.getKey());
                        sb.append("=");
                        sb.append(str3);
                        str2 = "&";
                    }
                }
                String unused = CellularNetworkInfo.this.f5011a = sb.toString();
            }
        }
    }

    public CellularNetworkInfo(Context context) {
        new C2723Xj(context, C2410P.m8089g().mo16431d().mo15961b()).mo15941a((C2810ak) new C1839a());
    }

    public String getCelluralInfo() {
        return this.f5011a;
    }
}
