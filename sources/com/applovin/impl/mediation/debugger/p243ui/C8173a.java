package com.applovin.impl.mediation.debugger.p243ui;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.C8656R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.a */
public abstract class C8173a extends Activity implements AppLovinCommunicatorSubscriber {
    protected List<String> communicatorTopics = new ArrayList();

    public String getCommunicatorId() {
        return getClass().getSimpleName();
    }

    /* access modifiers changed from: protected */
    public abstract C8490n getSdk();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getSdk() != null && !Utils.isPubInDebugMode(this, getSdk())) {
            setTheme(C8656R.style.com_applovin_mediation_MaxDebuggerActivity_Theme_Live);
        }
        List<String> list = this.communicatorTopics;
        if (list != null && list.size() > 0) {
            AppLovinCommunicator.getInstance(this).subscribe((AppLovinCommunicatorSubscriber) this, this.communicatorTopics);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        List<String> list = this.communicatorTopics;
        if (list != null && list.size() > 0) {
            AppLovinCommunicator.getInstance(this).unsubscribe((AppLovinCommunicatorSubscriber) this, this.communicatorTopics);
        }
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
    }
}
