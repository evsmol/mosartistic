package com.apm.insight;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.p172f.C6602b;
import com.apm.insight.p176j.C6629b;
import com.apm.insight.p178l.C6688q;
import com.apm.insight.runtime.C6756o;
import com.apm.insight.runtime.ConfigManager;
import java.util.HashMap;
import java.util.Map;

public class MonitorCrash {
    private static volatile boolean sAppMonitorCrashInit = false;
    Config mConfig;
    AttachUserData mCustomData;
    AttachUserData mCustomLongData;
    HeaderParams mParams;
    HashMap<String, String> mTagMap = new HashMap<>();

    public class Config {
        String mAid;
        String mChannel;
        String mDeviceId;
        String[] mPackageName;
        String mSSID;
        String[] mSoList;
        String mUID;
        long mVersionInt = -1;
        String mVersionStr;

        public Config() {
        }

        public Config setChannel(String str) {
            this.mChannel = str;
            C6629b.m16359d();
            return this;
        }

        public Config setDeviceId(String str) {
            this.mDeviceId = str;
            C6629b.m16359d();
            return this;
        }

        public Config setPackageName(String str) {
            return setPackageName(str);
        }

        public Config setPackageName(String... strArr) {
            this.mPackageName = strArr;
            C6629b.m16359d();
            return this;
        }

        public Config setSSID(String str) {
            this.mSSID = str;
            C6629b.m16359d();
            return this;
        }

        public Config setSoList(String[] strArr) {
            this.mSoList = strArr;
            C6629b.m16359d();
            return this;
        }

        public Config setUID(String str) {
            this.mUID = str;
            C6629b.m16359d();
            return this;
        }
    }

    public interface HeaderParams {
        Map<String, Object> getCommonParams();
    }

    private MonitorCrash(Context context, String str, long j, String str2) {
        Config config = new Config();
        this.mConfig = config;
        config.mAid = str;
        this.mConfig.mVersionInt = j;
        this.mConfig.mVersionStr = str2;
        C6606g.m16249a(context, this);
    }

    private MonitorCrash(String str, long j, String str2, String... strArr) {
        Config config = new Config();
        this.mConfig = config;
        config.mAid = str;
        this.mConfig.mVersionInt = j;
        this.mConfig.mVersionStr = str2;
        this.mConfig.mPackageName = strArr;
        C6606g.m16250a(this);
    }

    public static MonitorCrash init(Context context, String str, long j, String str2) {
        if (sAppMonitorCrashInit) {
            return null;
        }
        synchronized (MonitorCrash.class) {
            if (sAppMonitorCrashInit) {
                return null;
            }
            sAppMonitorCrashInit = true;
            C6756o.m16980a(context, true, true, true, true, 0);
            MonitorCrash monitorCrash = new MonitorCrash(context, str, j, str2);
            return monitorCrash;
        }
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String str3) {
        String str4 = str3;
        C6756o.m16980a(context, true, true, true, true, 0);
        MonitorCrash monitorCrash = new MonitorCrash(str, j, str2, str4);
        monitorCrash.config().setPackageName(str4);
        return monitorCrash;
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String str3, String[] strArr) {
        String str4 = str3;
        C6756o.m16980a(context, true, true, true, true, 0);
        MonitorCrash monitorCrash = new MonitorCrash(str, j, str2, str4);
        monitorCrash.config().setPackageName(str4).setSoList(strArr);
        return monitorCrash;
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String... strArr) {
        C6756o.m16980a(context, true, true, true, true, 0);
        MonitorCrash monitorCrash = new MonitorCrash(str, j, str2, strArr);
        monitorCrash.config().setPackageName(strArr);
        return monitorCrash;
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String[] strArr, String[] strArr2) {
        C6756o.m16980a(context, true, true, true, true, 0);
        MonitorCrash monitorCrash = new MonitorCrash(str, j, str2, strArr);
        monitorCrash.config().setPackageName(strArr).setSoList(strArr2);
        return monitorCrash;
    }

    public MonitorCrash addTags(String str, String str2) {
        this.mTagMap.put(str, str2);
        return this;
    }

    public Config config() {
        return this.mConfig;
    }

    public void reportCustomErr(String str, String str2, Throwable th) {
        C6602b.m16236a(this, th, str, true, (Map<String, String>) null, str2, "core_exception_monitor");
    }

    public MonitorCrash setCustomDataCallback(AttachUserData attachUserData) {
        this.mCustomData = attachUserData;
        return this;
    }

    public MonitorCrash setReportUrl(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        int indexOf = str.indexOf("://");
        if (indexOf < 0) {
            i = 8;
            str = "https://" + str;
        } else {
            i = indexOf + 3;
        }
        int indexOf2 = str.indexOf("/", i);
        if (indexOf2 >= 0) {
            str = str.substring(0, indexOf2);
        }
        C6688q.m16625a((Object) "set url " + str);
        C6617h.m16315i().setLaunchCrashUrl(str + ConfigManager.EXCEPTION_URL_SUFFIX);
        C6617h.m16315i().setJavaCrashUploadUrl(str + ConfigManager.JAVA_URL_SUFFIX);
        C6617h.m16315i().setNativeCrashUrl(str + ConfigManager.NATIVE_URL_SUFFIX);
        C6617h.m16315i().setConfigUrl(str + ConfigManager.CONFIG_URL_SUFFIX);
        return this;
    }

    public MonitorCrash withOtherHeaders(HeaderParams headerParams) {
        this.mParams = headerParams;
        return this;
    }
}
