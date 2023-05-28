package com.applovin.impl.p225a.p226a.p228b.p229a;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8212a;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8214c;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8218d;
import com.applovin.impl.p225a.p226a.p228b.p229a.C7883b;
import com.applovin.impl.sdk.C8313a;
import com.applovin.impl.sdk.utils.C8562b;
import com.applovin.sdk.C8656R;

/* renamed from: com.applovin.impl.a.a.b.a.a */
public class C7879a extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C7883b f19002a;

    /* renamed from: b */
    private FrameLayout f19003b;

    /* renamed from: c */
    private ListView f19004c;

    /* renamed from: a */
    private void m23338a(int i) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i);
        this.f19003b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f19003b.bringChildToFront(textView);
    }

    /* renamed from: a */
    public void mo55470a(C7883b bVar, final C8313a aVar) {
        this.f19002a = bVar;
        bVar.mo56498a((C8218d.C8220a) new C8218d.C8220a() {
            /* renamed from: a */
            public void mo55474a(final C8212a aVar, C8214c cVar) {
                if (aVar.mo56470a() == C7883b.C7885a.RECENT_ADS.ordinal()) {
                    C8562b.m26056a(C7879a.this, MaxCreativeDebuggerDisplayedAdActivity.class, aVar, new C8562b.C8564a<MaxCreativeDebuggerDisplayedAdActivity>() {
                        /* renamed from: a */
                        public void mo55475a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                            maxCreativeDebuggerDisplayedAdActivity.mo55491a(C7879a.this.f19002a.mo55487d().get(aVar.mo56471b()), C7879a.this.f19002a.mo55485c());
                        }
                    });
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(C8656R.layout.mediation_debugger_list_view);
        this.f19003b = (FrameLayout) findViewById(16908290);
        this.f19004c = (ListView) findViewById(C8656R.C8660id.listView);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C7883b bVar = this.f19002a;
        if (bVar != null) {
            bVar.mo56498a((C8218d.C8220a) null);
            this.f19002a.mo55481a();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        int i;
        super.onStart();
        this.f19004c.setAdapter(this.f19002a);
        C7883b bVar = this.f19002a;
        if (bVar == null || bVar.mo55485c().mo57373an().mo55456c()) {
            C7883b bVar2 = this.f19002a;
            if (bVar2 != null && bVar2.mo55484b()) {
                i = C8656R.string.applovin_creative_debugger_no_ads_text;
            } else {
                return;
            }
        } else {
            i = C8656R.string.applovin_creative_debugger_disabled_text;
        }
        m23338a(i);
    }
}
