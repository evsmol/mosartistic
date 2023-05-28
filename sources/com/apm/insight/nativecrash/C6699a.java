package com.apm.insight.nativecrash;

import android.text.TextUtils;
import com.apm.insight.p178l.C6685o;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.apm.insight.nativecrash.a */
public class C6699a {

    /* renamed from: a */
    private Map<String, String> f14385a;

    public C6699a(File file) {
        String a;
        File c = C6685o.m16595c(file);
        if (c.exists() && c.length() != 0 && (a = NativeImpl.m16701a(c.getAbsolutePath())) != null) {
            String[] split = a.split("\n");
            this.f14385a = new HashMap();
            for (String split2 : split) {
                String[] split3 = split2.split("=");
                if (split3.length == 2) {
                    this.f14385a.put(split3[0], split3[1]);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo52177a() {
        Map<String, String> map = this.f14385a;
        return map != null && !map.isEmpty() && !TextUtils.isEmpty(this.f14385a.get("process_name")) && !TextUtils.isEmpty(this.f14385a.get("crash_thread_name")) && !TextUtils.isEmpty(this.f14385a.get("pid")) && !TextUtils.isEmpty(this.f14385a.get("tid")) && !TextUtils.isEmpty(this.f14385a.get("start_time")) && !TextUtils.isEmpty(this.f14385a.get("crash_time")) && !TextUtils.isEmpty(this.f14385a.get("signal_line"));
    }

    /* renamed from: b */
    public String mo52178b() {
        return this.f14385a.get("signal_line");
    }

    /* renamed from: c */
    public Map<String, String> mo52179c() {
        return this.f14385a;
    }
}
