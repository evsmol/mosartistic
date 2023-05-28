package com.applovin.impl.mediation.debugger.p243ui.p247c;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.p238b.p241c.C8160b;
import com.applovin.impl.mediation.debugger.p243ui.C8173a;
import com.applovin.impl.mediation.debugger.p243ui.p247c.C8210b;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8212a;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8214c;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8218d;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.utils.C8562b;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.C8656R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.c.a */
public class C8207a extends C8173a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C8210b f20094a;

    /* renamed from: b */
    private ListView f20095b;

    public C8207a() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    /* access modifiers changed from: protected */
    public C8490n getSdk() {
        C8210b bVar = this.f20094a;
        if (bVar != null) {
            return bVar.mo56466a().mo56390y();
        }
        return null;
    }

    public void initialize(final C8160b bVar) {
        setTitle(bVar.mo56373i());
        C8210b bVar2 = new C8210b(bVar, this);
        this.f20094a = bVar2;
        bVar2.mo56498a((C8218d.C8220a) new C8218d.C8220a() {
            /* renamed from: a */
            public void mo55474a(C8212a aVar, C8214c cVar) {
                if (aVar.mo56470a() == C8210b.C8211a.TEST_ADS.ordinal()) {
                    C8490n y = bVar.mo56390y();
                    C8160b.C8162b c = bVar.mo56366c();
                    if (C8207a.this.f20094a.mo56467a(aVar)) {
                        if (C8160b.C8162b.READY == c) {
                            C8562b.m26056a(C8207a.this, MaxDebuggerMultiAdActivity.class, y.mo57368ai(), new C8562b.C8564a<MaxDebuggerMultiAdActivity>() {
                                /* renamed from: a */
                                public void mo55475a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                                    maxDebuggerMultiAdActivity.initialize(bVar);
                                }
                            });
                            return;
                        } else if (C8160b.C8162b.DISABLED == c) {
                            y.mo57330N().mo56532d();
                        }
                    }
                }
                Utils.showAlert(cVar.mo56479l(), cVar.mo56480m(), (Context) C8207a.this);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C8656R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(C8656R.C8660id.listView);
        this.f20095b = listView;
        listView.setAdapter(this.f20094a);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f20094a.mo56466a().mo56377m().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f20094a.mo56468b();
            this.f20094a.mo56508n();
        }
    }
}
