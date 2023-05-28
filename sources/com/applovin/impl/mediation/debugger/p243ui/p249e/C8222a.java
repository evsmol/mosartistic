package com.applovin.impl.mediation.debugger.p243ui.p249e;

import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.p238b.p239a.C8155d;
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

/* renamed from: com.applovin.impl.mediation.debugger.ui.e.a */
public class C8222a extends C8173a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C8490n f20160a;

    /* renamed from: b */
    private List<C8155d> f20161b;

    /* renamed from: c */
    private List<C8155d> f20162c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C8218d f20163d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<C8214c> f20164e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<C8214c> f20165f;

    /* renamed from: g */
    private ListView f20166g;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.e.a$a */
    enum C8226a {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public C8222a() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C8155d m24707a(C8212a aVar) {
        return (aVar.mo56470a() == C8226a.BIDDERS.ordinal() ? this.f20161b : this.f20162c).get(aVar.mo56471b());
    }

    /* renamed from: a */
    private List<C8214c> m24710a(List<C8155d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (final C8155d next : list) {
            arrayList.add(new C8199a(next.mo56342c(), this) {
                /* renamed from: a */
                public int mo55477a() {
                    if (C8222a.this.f20160a.mo57330N().mo56531c() == null || !C8222a.this.f20160a.mo57330N().mo56531c().equals(next.mo56340a())) {
                        return 0;
                    }
                    return C8656R.C8659drawable.applovin_ic_check_mark_borderless;
                }

                /* renamed from: b */
                public int mo55478b() {
                    if (C8222a.this.f20160a.mo57330N().mo56531c() == null || !C8222a.this.f20160a.mo57330N().mo56531c().equals(next.mo56340a())) {
                        return super.mo55478b();
                    }
                    return -16776961;
                }

                /* renamed from: k */
                public SpannedString mo56478k() {
                    return StringUtils.createSpannedString(next.mo56341b(), mo55479c() ? -16777216 : -7829368, 18, 1);
                }
            });
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public C8490n getSdk() {
        return this.f20160a;
    }

    public void initialize(List<C8155d> list, List<C8155d> list2, final C8490n nVar) {
        this.f20160a = nVar;
        this.f20161b = list;
        this.f20162c = list2;
        this.f20164e = m24710a(list);
        this.f20165f = m24710a(list2);
        C82231 r1 = new C8218d(this) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo55480a(int i) {
                return (i == C8226a.BIDDERS.ordinal() ? C8222a.this.f20164e : C8222a.this.f20165f).size();
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public C8214c mo55483b(int i) {
                return i == C8226a.BIDDERS.ordinal() ? new C8221e("BIDDERS") : new C8221e("WATERFALL");
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public List<C8214c> mo55486c(int i) {
                return i == C8226a.BIDDERS.ordinal() ? C8222a.this.f20164e : C8222a.this.f20165f;
            }

            /* access modifiers changed from: protected */
            /* renamed from: e */
            public int mo55488e() {
                return C8226a.COUNT.ordinal();
            }

            /* access modifiers changed from: protected */
            /* renamed from: o */
            public C8214c mo56510o() {
                return new C8214c.C8216a(C8214c.C8217b.SECTION_CENTERED).mo56486a("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").mo56488a();
            }
        };
        this.f20163d = r1;
        r1.mo56498a((C8218d.C8220a) new C8218d.C8220a() {
            /* renamed from: a */
            public void mo55474a(C8212a aVar, C8214c cVar) {
                C8155d a = C8222a.this.m24707a(aVar);
                if (!StringUtils.isValidString(a.mo56340a()) || !StringUtils.isValidString(nVar.mo57330N().mo56531c()) || !a.mo56340a().equals(nVar.mo57330N().mo56531c())) {
                    nVar.mo57330N().mo56528a(true);
                    nVar.mo57330N().mo56526a(a.mo56340a());
                    nVar.mo57369aj().mo57291a(a.mo56341b());
                } else {
                    nVar.mo57330N().mo56528a(false);
                    nVar.mo57330N().mo56526a((String) null);
                    nVar.mo57369aj().mo57291a((String) null);
                }
                C8222a.this.f20163d.notifyDataSetChanged();
            }
        });
        this.f20163d.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(C8656R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(C8656R.C8660id.listView);
        this.f20166g = listView;
        listView.setAdapter(this.f20163d);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f20164e = m24710a(this.f20161b);
        this.f20165f = m24710a(this.f20162c);
        this.f20163d.mo56508n();
    }
}
