package com.appnext.ads.fullscreen;

import com.appnext.core.C8936p;
import java.io.Serializable;

public class FullscreenConfig extends VideoConfig implements Serializable {
    private static final long serialVersionUID = 1;
    public Boolean backButtonCanClose;
    public long closeDelay;
    public Boolean showClose;

    public FullscreenConfig() {
        this.backButtonCanClose = Boolean.TRUE;
        this.closeDelay = 2000;
        this.closeDelay = (long) Integer.parseInt(C8686c.m26400m().get("show_close_time"));
    }

    public boolean isBackButtonCanClose() {
        Boolean bool = this.backButtonCanClose;
        return bool == null ? Boolean.parseBoolean(C8686c.m26400m().get("can_close")) : bool.booleanValue();
    }

    public void setBackButtonCanClose(boolean z) {
        this.backButtonCanClose = Boolean.valueOf(z);
    }

    public boolean isShowClose() {
        Boolean bool = this.showClose;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Boolean mo58278k() {
        return this.showClose;
    }

    public void setShowClose(Boolean bool) {
        this.showClose = bool;
    }

    public void setShowClose(boolean z, long j) {
        this.showClose = Boolean.valueOf(z);
        if (j >= 100 && j <= 7500) {
            this.closeDelay = j;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C8936p mo58279l() {
        return C8686c.m26400m();
    }
}
