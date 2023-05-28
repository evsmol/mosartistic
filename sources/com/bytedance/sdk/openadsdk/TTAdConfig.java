package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bykv.p271vk.openvk.component.video.api.C10184b;
import com.bytedance.sdk.openadsdk.core.C0558m;

public final class TTAdConfig {

    /* renamed from: a */
    private String f26639a;

    /* renamed from: b */
    private String f26640b;

    /* renamed from: c */
    private boolean f26641c;

    /* renamed from: d */
    private String f26642d;

    /* renamed from: e */
    private String f26643e;

    /* renamed from: f */
    private int f26644f;

    /* renamed from: g */
    private boolean f26645g;

    /* renamed from: h */
    private boolean f26646h;

    /* renamed from: i */
    private boolean f26647i;

    /* renamed from: j */
    private boolean f26648j;

    /* renamed from: k */
    private String[] f26649k;

    /* renamed from: l */
    private boolean f26650l;

    /* renamed from: m */
    private int f26651m;

    /* renamed from: n */
    private int f26652n;

    /* renamed from: o */
    private int f26653o;

    /* renamed from: p */
    private String f26654p;

    /* renamed from: q */
    private int f26655q;

    /* renamed from: r */
    private int f26656r;

    private TTAdConfig() {
        this.f26641c = false;
        this.f26644f = 0;
        boolean z = true;
        this.f26645g = true;
        this.f26646h = false;
        this.f26647i = Build.VERSION.SDK_INT < 14 ? false : z;
        this.f26648j = false;
        this.f26650l = false;
        this.f26651m = -1;
        this.f26652n = -1;
        this.f26653o = -1;
    }

    public void setPackageName(String str) {
        this.f26654p = str;
    }

    public String getPackageName() {
        return this.f26654p;
    }

    public void setCoppa(int i) {
        this.f26651m = i;
    }

    public int getCoppa() {
        return this.f26651m;
    }

    public void setGDPR(int i) {
        this.f26652n = i;
    }

    public int getGDPR() {
        return this.f26652n;
    }

    public void setCcpa(int i) {
        this.f26653o = i;
    }

    public int getCcpa() {
        return this.f26653o;
    }

    public String getAppId() {
        return this.f26639a;
    }

    public void setAppId(String str) {
        this.f26639a = str;
    }

    public String getAppName() {
        String str = this.f26640b;
        if (str == null || str.isEmpty()) {
            this.f26640b = m31392a(C0558m.m2663a());
        }
        return this.f26640b;
    }

    public void setAppName(String str) {
        this.f26640b = str;
    }

    public int getAppIconId() {
        return this.f26656r;
    }

    public void setAppIcon(int i) {
        this.f26656r = i;
    }

    public boolean isPaid() {
        return this.f26641c;
    }

    public void setPaid(boolean z) {
        this.f26641c = z;
    }

    public String getKeywords() {
        return this.f26642d;
    }

    public void setKeywords(String str) {
        this.f26642d = str;
    }

    public String getData() {
        return this.f26643e;
    }

    public void setData(String str) {
        this.f26643e = str;
    }

    public int getTitleBarTheme() {
        return this.f26644f;
    }

    public void setTitleBarTheme(int i) {
        this.f26644f = i;
    }

    public boolean isAllowShowNotify() {
        return this.f26645g;
    }

    public void setAllowShowNotify(boolean z) {
        this.f26645g = z;
    }

    public boolean isDebug() {
        return this.f26646h;
    }

    public void setDebug(boolean z) {
        this.f26646h = z;
    }

    public boolean isUseTextureView() {
        return this.f26647i;
    }

    public void setUseTextureView(boolean z) {
        this.f26647i = z;
    }

    public boolean isSupportMultiProcess() {
        return this.f26648j;
    }

    public void setSupportMultiProcess(boolean z) {
        this.f26648j = z;
        C10184b.m29126a(z);
    }

    public String[] getNeedClearTaskReset() {
        return this.f26649k;
    }

    public void setNeedClearTaskReset(String... strArr) {
        this.f26649k = strArr;
    }

    public boolean isAsyncInit() {
        return this.f26650l;
    }

    public void setAsyncInit(boolean z) {
        this.f26650l = z;
    }

    /* renamed from: a */
    private String m31392a(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public int getDebugLog() {
        return this.f26655q;
    }

    public void setDebugLog(int i) {
        this.f26655q = i;
    }

    public static class Builder {

        /* renamed from: a */
        private String f26657a;

        /* renamed from: b */
        private String f26658b;

        /* renamed from: c */
        private boolean f26659c = false;

        /* renamed from: d */
        private String f26660d;

        /* renamed from: e */
        private String f26661e;

        /* renamed from: f */
        private int f26662f = 0;

        /* renamed from: g */
        private boolean f26663g;

        /* renamed from: h */
        private boolean f26664h;

        /* renamed from: i */
        private boolean f26665i;

        /* renamed from: j */
        private boolean f26666j;

        /* renamed from: k */
        private String[] f26667k;

        /* renamed from: l */
        private boolean f26668l;

        /* renamed from: m */
        private int f26669m;

        /* renamed from: n */
        private int f26670n;

        /* renamed from: o */
        private int f26671o;

        /* renamed from: p */
        private int f26672p;

        /* renamed from: q */
        private String f26673q;

        /* renamed from: r */
        private int f26674r;

        @Deprecated
        public Builder allowShowPageWhenScreenLock(boolean z) {
            return this;
        }

        public Builder() {
            boolean z = true;
            this.f26663g = true;
            this.f26664h = false;
            this.f26665i = Build.VERSION.SDK_INT < 14 ? false : z;
            this.f26666j = false;
            this.f26668l = false;
            this.f26669m = -1;
            this.f26670n = -1;
            this.f26671o = -1;
        }

        public Builder coppa(int i) {
            this.f26669m = i;
            return this;
        }

        public Builder setGDPR(int i) {
            this.f26670n = i;
            return this;
        }

        public Builder setCCPA(int i) {
            this.f26671o = i;
            return this;
        }

        public Builder appId(String str) {
            this.f26657a = str;
            return this;
        }

        public Builder appIcon(int i) {
            this.f26674r = i;
            return this;
        }

        @Deprecated
        public Builder appName(String str) {
            this.f26658b = str;
            return this;
        }

        @Deprecated
        public Builder paid(boolean z) {
            this.f26659c = z;
            return this;
        }

        @Deprecated
        public Builder keywords(String str) {
            this.f26660d = str;
            return this;
        }

        public Builder data(String str) {
            this.f26661e = str;
            return this;
        }

        @Deprecated
        public Builder titleBarTheme(int i) {
            this.f26662f = i;
            return this;
        }

        @Deprecated
        public Builder allowShowNotify(boolean z) {
            this.f26663g = z;
            return this;
        }

        public Builder debug(boolean z) {
            this.f26664h = z;
            return this;
        }

        public Builder useTextureView(boolean z) {
            this.f26665i = z;
            return this;
        }

        public Builder supportMultiProcess(boolean z) {
            this.f26666j = z;
            return this;
        }

        @Deprecated
        public Builder needClearTaskReset(String... strArr) {
            this.f26667k = strArr;
            return this;
        }

        public Builder asyncInit(boolean z) {
            this.f26668l = z;
            return this;
        }

        public Builder debugLog(int i) {
            this.f26672p = i;
            return this;
        }

        public Builder setPackageName(String str) {
            this.f26673q = str;
            return this;
        }

        public TTAdConfig build() {
            TTAdConfig tTAdConfig = new TTAdConfig();
            tTAdConfig.setAppId(this.f26657a);
            tTAdConfig.setCoppa(this.f26669m);
            tTAdConfig.setAppName(this.f26658b);
            tTAdConfig.setAppIcon(this.f26674r);
            tTAdConfig.setPaid(this.f26659c);
            tTAdConfig.setKeywords(this.f26660d);
            tTAdConfig.setData(this.f26661e);
            tTAdConfig.setTitleBarTheme(this.f26662f);
            tTAdConfig.setAllowShowNotify(this.f26663g);
            tTAdConfig.setDebug(this.f26664h);
            tTAdConfig.setUseTextureView(this.f26665i);
            tTAdConfig.setSupportMultiProcess(this.f26666j);
            tTAdConfig.setNeedClearTaskReset(this.f26667k);
            tTAdConfig.setAsyncInit(this.f26668l);
            tTAdConfig.setGDPR(this.f26670n);
            tTAdConfig.setCcpa(this.f26671o);
            tTAdConfig.setDebugLog(this.f26672p);
            tTAdConfig.setPackageName(this.f26673q);
            return tTAdConfig;
        }
    }
}
