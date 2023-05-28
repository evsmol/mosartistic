package com.apm.insight.runtime;

import android.text.TextUtils;
import com.apm.insight.C6553b;
import com.apm.insight.C6582c;
import com.apm.insight.C6617h;
import com.apm.insight.p178l.C6662a;
import com.apm.insight.p178l.C6675i;
import com.apm.insight.p178l.C6685o;
import com.appnext.base.p264b.C8850d;
import com.appodeal.ads.modules.common.internal.Constants;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;

/* renamed from: com.apm.insight.runtime.r */
public class C6764r {

    /* renamed from: a */
    private static File f14528a;

    /* renamed from: com.apm.insight.runtime.r$a */
    public static class C6765a {

        /* renamed from: a */
        public String f14529a;

        /* renamed from: b */
        public String f14530b;

        /* renamed from: c */
        public long f14531c;

        C6765a(String str) {
            String[] split = str.split("\\s+");
            if (split.length == 3) {
                this.f14529a = split[0];
                this.f14530b = split[1];
                try {
                    this.f14531c = Long.parseLong(split[2]);
                } catch (Throwable th) {
                    C6582c a = C6553b.m16004a();
                    a.mo52019a("NPTH_CATCH", (Throwable) new RuntimeException("err ProcessTrack line:" + str, th));
                }
            } else {
                C6582c a2 = C6553b.m16004a();
                a2.mo52019a("NPTH_CATCH", (Throwable) new RuntimeException("err ProcessTrack line:" + str));
            }
        }
    }

    /* renamed from: a */
    private static File m17026a() {
        if (f14528a == null) {
            String c = C6662a.m16480c(C6617h.m16313g());
            if (c == null) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String j = C6685o.m16615j(C6617h.m16313g());
            f14528a = new File(j, "apminsight/ProcessTrack/" + ((currentTimeMillis - (currentTimeMillis % Constants.MILLIS_IN_DAY)) / Constants.MILLIS_IN_DAY) + '/' + c.replace(':', '_') + ".txt");
        }
        return f14528a;
    }

    /* renamed from: a */
    public static File m17027a(long j) {
        String j2 = C6685o.m16615j(C6617h.m16313g());
        return new File(j2, "apminsight/ProcessTrack/" + ((j - (j % Constants.MILLIS_IN_DAY)) / Constants.MILLIS_IN_DAY));
    }

    /* renamed from: a */
    public static HashMap<String, C6765a> m17028a(long j, String str) {
        File file = new File(C6685o.m16615j(C6617h.m16313g()), "apminsight/ProcessTrack/" + ((j - (j % Constants.MILLIS_IN_DAY)) / Constants.MILLIS_IN_DAY));
        String[] list = file.list();
        HashMap<String, C6765a> hashMap = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray a = C6675i.m16522a(file2, length > C8850d.f22423fc ? length - 524288 : 0);
                    int length2 = a.length() - 1;
                    while (true) {
                        if (length2 < 0) {
                            break;
                        }
                        String optString = a.optString(length2);
                        if (!TextUtils.isEmpty(optString)) {
                            if (optString.startsWith(str)) {
                                hashMap.put(str2.replace('_', ':').replace(".txt", ""), new C6765a(optString));
                                break;
                            }
                        }
                        length2--;
                    }
                } catch (IOException unused) {
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m17029a(String str, String str2) {
        try {
            File a = m17026a();
            if (a != null) {
                C6675i.m16524a(a, str + ' ' + str2 + ' ' + System.currentTimeMillis() + 10, true);
            }
        } catch (Throwable unused) {
        }
    }
}
