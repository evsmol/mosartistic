package com.applovin.impl.mediation.debugger.p243ui.testmode;

import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.p238b.p241c.C8160b;
import com.applovin.impl.mediation.debugger.p243ui.C8173a;
import com.applovin.impl.mediation.debugger.p243ui.p245b.p246a.C8199a;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8212a;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8214c;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8218d;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8221e;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.C8656R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.b */
public class C8233b extends C8173a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C8490n f20211a;

    /* renamed from: b */
    private List<C8160b> f20212b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8218d f20213c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<C8214c> f20214d;

    /* renamed from: e */
    private ListView f20215e;

    public C8233b() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    /* renamed from: a */
    private List<C8214c> m24742a(List<C8160b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (final C8160b next : list) {
            arrayList.add(new C8199a(this, next) {
                /* renamed from: a */
                public int mo55477a() {
                    if (C8233b.this.f20211a.mo57330N().mo56531c() == null || !C8233b.this.f20211a.mo57330N().mo56531c().equals(next.mo56372h())) {
                        return 0;
                    }
                    return C8656R.C8659drawable.applovin_ic_check_mark_borderless;
                }

                /* renamed from: b */
                public int mo55478b() {
                    if (C8233b.this.f20211a.mo57330N().mo56531c() == null || !C8233b.this.f20211a.mo57330N().mo56531c().equals(next.mo56372h())) {
                        return super.mo55478b();
                    }
                    return -16776961;
                }

                /* renamed from: k */
                public SpannedString mo56478k() {
                    return StringUtils.createSpannedString(next.mo56373i(), mo55479c() ? -16777216 : -7829368, 18, 1);
                }
            });
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public C8490n getSdk() {
        return this.f20211a;
    }

    public void initialize(final List<C8160b> list, final C8490n nVar) {
        this.f20211a = nVar;
        this.f20212b = list;
        this.f20214d = m24742a(list);
        C82341 r0 = new C8218d(this) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo55480a(int i) {
                return list.size();
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public C8214c mo55483b(int i) {
                return new C8221e("TEST MODE NETWORKS");
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public List<C8214c> mo55486c(int i) {
                return C8233b.this.f20214d;
            }

            /* access modifiers changed from: protected */
            /* renamed from: e */
            public int mo55488e() {
                return 1;
            }

            /* access modifiers changed from: protected */
            /* renamed from: o */
            public C8214c mo56510o() {
                return new C8214c.C8216a(C8214c.C8217b.SECTION_CENTERED).mo56486a("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").mo56488a();
            }
        };
        this.f20213c = r0;
        r0.mo56498a((C8218d.C8220a) new C8218d.C8220a() {
            /* renamed from: a */
            public void mo55474a(C8212a aVar, C8214c cVar) {
                C8160b bVar = (C8160b) list.get(aVar.mo56471b());
                String h = bVar.mo56372h();
                String c = nVar.mo57330N().mo56531c();
                if (!StringUtils.isValidString(h) || !StringUtils.isValidString(c) || !h.equals(c)) {
                    nVar.mo57330N().mo56528a(true);
                    nVar.mo57330N().mo56526a(h);
                    C8233b.this.getSdk().mo57369aj().mo57297b(bVar.mo56373i());
                } else {
                    nVar.mo57330N().mo56528a(false);
                    nVar.mo57330N().mo56526a((String) null);
                    C8233b.this.getSdk().mo57369aj().mo57297b((String) null);
                }
                C8233b.this.f20213c.notifyDataSetChanged();
            }
        });
        this.f20213c.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(C8656R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(C8656R.C8660id.listView);
        this.f20215e = listView;
        listView.setAdapter(this.f20213c);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f20214d = m24742a(this.f20212b);
        this.f20213c.notifyDataSetChanged();
    }
}
