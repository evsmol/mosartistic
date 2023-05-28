package com.apm.insight.runtime;

import android.content.Context;
import com.apm.insight.C6553b;
import com.apm.insight.C6617h;
import com.apm.insight.entity.Header;
import com.apm.insight.p178l.C6675i;
import com.apm.insight.p178l.C6685o;
import com.apm.insight.p178l.C6688q;
import com.apm.insight.runtime.p179a.C6720b;
import com.appodeal.ads.adapters.admob.BuildConfig;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.s */
public class C6766s {

    /* renamed from: a */
    private static C6766s f14532a;

    /* renamed from: b */
    private File f14533b;

    /* renamed from: c */
    private File f14534c;

    /* renamed from: d */
    private File f14535d;

    /* renamed from: e */
    private Context f14536e;

    /* renamed from: f */
    private C6768a f14537f = null;

    /* renamed from: com.apm.insight.runtime.s$a */
    private static class C6768a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public long f14540a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public long f14541b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public File f14542c;

        /* renamed from: d */
        private JSONObject f14543d;

        private C6768a(File file) {
            this.f14543d = null;
            this.f14542c = file;
            String[] split = file.getName().split("-|\\.");
            this.f14540a = Long.parseLong(split[0]);
            this.f14541b = Long.parseLong(split[1]);
        }

        /* renamed from: a */
        private String m17047a() {
            return this.f14540a + "-" + this.f14541b + ".ctx";
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17049a(long j) {
            this.f14541b = j;
            this.f14542c.renameTo(new File(this.f14542c.getParent(), m17047a()));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public JSONObject m17052b() {
            if (this.f14543d == null) {
                try {
                    this.f14543d = new JSONObject(C6675i.m16540c(this.f14542c.getAbsolutePath()));
                } catch (Throwable unused) {
                }
                if (this.f14543d == null) {
                    this.f14543d = new JSONObject();
                }
            }
            return this.f14543d;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public boolean m17053b(long j) {
            long j2 = this.f14540a;
            if (j2 > j && j2 - j > 604800000) {
                return true;
            }
            long j3 = this.f14541b;
            if (j3 >= j || j - j3 <= 604800000) {
                return this.f14542c.lastModified() < j && j - this.f14542c.lastModified() > 604800000;
            }
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m17056c() {
            this.f14542c.delete();
        }
    }

    private C6766s(Context context) {
        File c = C6685o.m16594c(context);
        if (!c.exists() || (!c.isDirectory() && c.delete())) {
            c.mkdirs();
            C6720b.m16819a();
        }
        this.f14533b = c;
        this.f14534c = new File(c, "did");
        this.f14535d = new File(c, "device_uuid");
        this.f14536e = context;
    }

    /* renamed from: a */
    public static int m17030a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (Header.m16146c(jSONObject)) {
            return 2;
        }
        if (Header.m16146c(jSONObject2)) {
            return 0;
        }
        return (!String.valueOf(jSONObject2.opt("update_version_code")).equals(String.valueOf(jSONObject.opt("update_version_code"))) || !Header.m16147d(jSONObject)) ? 2 : 1;
    }

    /* renamed from: a */
    public static C6766s m17031a() {
        if (f14532a == null) {
            f14532a = new C6766s(C6617h.m16313g());
        }
        return f14532a;
    }

    /* renamed from: a */
    private void m17032a(long j, long j2, JSONObject jSONObject, JSONArray jSONArray) {
        File file = this.f14533b;
        File file2 = new File(file, "" + j + "-" + j2 + ".ctx");
        File file3 = this.f14533b;
        File file4 = new File(file3, "" + j + "-" + j2 + ".allData");
        try {
            C6675i.m16527a(file2, jSONObject, false);
            C6675i.m16526a(file4, jSONArray, false);
            this.f14537f = new C6768a(file2);
        } catch (IOException e) {
            C6553b.m16004a().mo52019a("NPTH_CATCH", (Throwable) e);
        }
    }

    /* renamed from: c */
    private C6768a m17033c() {
        if (this.f14537f == null) {
            m17036d(".ctx");
        }
        return this.f14537f;
    }

    /* renamed from: c */
    private void m17034c(long j) {
        try {
            ArrayList<C6768a> d = m17036d("");
            if (d.size() > 6) {
                Iterator<C6768a> it = d.iterator();
                while (it.hasNext()) {
                    C6768a next = it.next();
                    if (next.m17053b(j)) {
                        next.m17056c();
                    }
                }
            }
        } catch (Throwable th) {
            C6553b.m16004a().mo52019a("NPTH_CATCH", th);
        }
    }

    /* renamed from: d */
    private File m17035d(long j) {
        Iterator<C6768a> it = m17036d(".ctx").iterator();
        while (it.hasNext()) {
            C6768a next = it.next();
            if (j >= next.f14540a && j <= next.f14541b) {
                return next.f14542c;
            }
        }
        return null;
    }

    /* renamed from: d */
    private ArrayList<C6768a> m17036d(final String str) {
        File[] listFiles = this.f14533b.listFiles(new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str).matches();
            }
        });
        C6688q.m16625a((Object) "foundRuntimeContextFiles " + listFiles.length);
        ArrayList<C6768a> arrayList = new ArrayList<>();
        if (listFiles == null) {
            return arrayList;
        }
        C6768a aVar = null;
        for (File aVar2 : listFiles) {
            try {
                C6768a aVar3 = new C6768a(aVar2);
                arrayList.add(aVar3);
                if (this.f14537f == null && ".ctx".equals(str)) {
                    if (aVar != null) {
                        if (aVar3.f14541b < aVar.f14541b) {
                        }
                    }
                    aVar = aVar3;
                }
            } catch (Throwable th) {
                C6553b.m16004a().mo52019a("NPTH_CATCH", th);
            }
        }
        if (this.f14537f == null && aVar != null) {
            this.f14537f = aVar;
        }
        return arrayList;
    }

    /* renamed from: e */
    private File m17037e(long j) {
        Iterator<C6768a> it = m17036d(".allData").iterator();
        while (it.hasNext()) {
            C6768a next = it.next();
            if (j >= next.f14540a && j <= next.f14541b) {
                return next.f14542c;
            }
        }
        return null;
    }

    /* renamed from: f */
    private File m17038f(long j) {
        Iterator<C6768a> it = m17036d(".ctx").iterator();
        C6768a aVar = null;
        while (it.hasNext()) {
            C6768a next = it.next();
            if (aVar == null || Math.abs(aVar.f14541b - j) > Math.abs(next.f14541b - j)) {
                aVar = next;
            }
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f14542c;
    }

    /* renamed from: g */
    private File m17039g(long j) {
        Iterator<C6768a> it = m17036d(".allData").iterator();
        C6768a aVar = null;
        while (it.hasNext()) {
            C6768a next = it.next();
            if (aVar == null || Math.abs(aVar.f14541b - j) > Math.abs(next.f14541b - j)) {
                aVar = next;
            }
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f14542c;
    }

    /* renamed from: a */
    public String mo52314a(String str) {
        try {
            return C6675i.m16540c(this.f14535d.getAbsolutePath());
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    public JSONObject mo52315a(long j) {
        boolean z;
        String str;
        File d = m17035d(j);
        if (d == null) {
            d = m17038f(j);
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject = null;
        if (d != null) {
            try {
                str = C6675i.m16540c(d.getAbsolutePath());
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    th = th;
                    C6553b.m16004a().mo52019a("NPTH_CATCH", (Throwable) new IOException("content :" + str, th));
                    try {
                        jSONObject.put("unauthentic_version", 1);
                    } catch (JSONException e) {
                        C6553b.m16004a().mo52019a("NPTH_CATCH", (Throwable) e);
                    }
                    return jSONObject;
                }
            } catch (Throwable th2) {
                th = th2;
                str = null;
                C6553b.m16004a().mo52019a("NPTH_CATCH", (Throwable) new IOException("content :" + str, th));
                jSONObject.put("unauthentic_version", 1);
                return jSONObject;
            }
        }
        if (jSONObject != null && z) {
            jSONObject.put("unauthentic_version", 1);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo52316a(Map<String, Object> map, JSONArray jSONArray) {
        JSONObject a = Header.m16138a(this.f14536e).mo52037a(map);
        if (!Header.m16146c(a)) {
            long currentTimeMillis = System.currentTimeMillis();
            C6768a c = m17033c();
            if (c == null) {
                m17032a(currentTimeMillis, currentTimeMillis, a, jSONArray);
                return;
            }
            int a2 = m17030a(c.m17052b(), a);
            if (a2 == 1) {
                m17032a(c.f14540a, currentTimeMillis, a, jSONArray);
                C6675i.m16532a(c.f14542c);
            } else if (a2 == 2) {
                m17032a(currentTimeMillis, currentTimeMillis, a, jSONArray);
            } else if (a2 == 3) {
                c.m17049a(currentTimeMillis);
            }
            m17034c(currentTimeMillis);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo52317b() {
        try {
            return C6675i.m16540c(this.f14534c.getAbsolutePath());
        } catch (Throwable unused) {
            return BuildConfig.ADAPTER_VERSION;
        }
    }

    /* renamed from: b */
    public JSONArray mo52318b(long j) {
        String str;
        File e = m17037e(j);
        if (e == null) {
            e = m17039g(j);
        }
        if (e == null) {
            return null;
        }
        try {
            str = C6675i.m16540c(e.getAbsolutePath());
            try {
                return new JSONArray(str);
            } catch (Throwable th) {
                th = th;
                C6553b.m16004a().mo52019a("NPTH_CATCH", (Throwable) new IOException("content :" + str, th));
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
            C6553b.m16004a().mo52019a("NPTH_CATCH", (Throwable) new IOException("content :" + str, th));
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo52319b(String str) {
        try {
            C6675i.m16524a(this.f14534c, str, false);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public void mo52320c(String str) {
        try {
            C6675i.m16524a(this.f14535d, str, false);
        } catch (Throwable unused) {
        }
    }
}
