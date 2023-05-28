package com.apm.insight.runtime;

import android.text.TextUtils;
import com.apm.insight.C6553b;
import com.apm.insight.C6617h;
import com.apm.insight.p178l.C6672f;
import com.apm.insight.p178l.C6677k;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;

/* renamed from: com.apm.insight.runtime.k */
public class C6751k {

    /* renamed from: a */
    private static C6750j f14500a;

    /* renamed from: a */
    public static JSONArray m16957a(String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            bufferedReader = new BufferedReader(new FileReader(str));
            try {
                File file = new File(str);
                if (file.length() > 512000) {
                    bufferedReader.skip(file.length() - 512000);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        jSONArray.put(readLine);
                    } else {
                        C6677k.m16550a((Closeable) bufferedReader);
                        return jSONArray;
                    }
                }
            } catch (IOException e) {
                e = e;
                try {
                    e.printStackTrace();
                    C6677k.m16550a((Closeable) bufferedReader);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    C6677k.m16550a((Closeable) bufferedReader2);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            bufferedReader = null;
            e.printStackTrace();
            C6677k.m16550a((Closeable) bufferedReader);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C6677k.m16550a((Closeable) bufferedReader2);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m16958a(C6750j jVar) {
        f14500a = jVar;
    }

    /* renamed from: b */
    public static JSONArray m16959b(String str) {
        if (f14500a != null && C6617h.m16312f().equals(str)) {
            try {
                return m16957a(f14500a.mo52306a());
            } catch (Throwable th) {
                C6553b.m16004a().mo52019a("NPTH_CATCH", th);
            }
        }
        try {
            return m16957a(C6672f.m16506a(str, C6617h.m16315i().getLogcatDumpCount(), C6617h.m16315i().getLogcatLevel()).getAbsolutePath());
        } catch (Throwable th2) {
            C6553b.m16004a().mo52019a("NPTH_CATCH", th2);
            return null;
        }
    }
}
