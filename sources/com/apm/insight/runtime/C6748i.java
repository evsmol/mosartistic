package com.apm.insight.runtime;

import android.content.Context;
import com.apm.insight.ICommonParams;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.apm.insight.runtime.i */
public class C6748i {
    /* renamed from: a */
    public static C6740d m16955a(Context context) {
        return new C6740d(context, new ICommonParams() {
            public Map<String, Object> getCommonParams() {
                return new HashMap();
            }

            public String getDeviceId() {
                return null;
            }

            public List<String> getPatchInfo() {
                return null;
            }

            public Map<String, Integer> getPluginInfo() {
                return null;
            }

            public String getSessionId() {
                return null;
            }

            public long getUserId() {
                return 0;
            }
        });
    }
}
