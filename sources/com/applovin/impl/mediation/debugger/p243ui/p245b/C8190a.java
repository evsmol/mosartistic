package com.applovin.impl.mediation.debugger.p243ui.p245b;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.applovin.impl.adview.C7888a;
import com.applovin.impl.mediation.debugger.p243ui.C8173a;
import com.applovin.impl.mediation.debugger.p243ui.p245b.C8201b;
import com.applovin.impl.mediation.debugger.p243ui.p245b.p246a.C8199a;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8212a;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8214c;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8218d;
import com.applovin.impl.sdk.C8313a;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.utils.C8562b;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.sdk.C8656R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.b.a */
public class C8190a extends C8173a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C8201b f20031a;

    /* renamed from: b */
    private DataSetObserver f20032b;

    /* renamed from: c */
    private FrameLayout f20033c;

    /* renamed from: d */
    private ListView f20034d;

    /* renamed from: e */
    private C7888a f20035e;

    /* renamed from: a */
    private void m24563a() {
        String m = this.f20031a.mo56459m();
        if (!TextUtils.isEmpty(m)) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", m);
            intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
            intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
            startActivity(Intent.createChooser(intent, (CharSequence) null));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24564a(final Context context) {
        if (StringUtils.isValidString(this.f20031a.mo56455i()) && !this.f20031a.mo56450c()) {
            this.f20031a.mo56448a(true);
            runOnUiThread(new Runnable() {
                public void run() {
                    Utils.showAlert(C8190a.this.f20031a.mo56454h(), C8190a.this.f20031a.mo56455i(), context);
                }
            });
        }
    }

    /* renamed from: b */
    private void m24568b() {
        m24569c();
        C7888a aVar = new C7888a(this, 50, 16842874);
        this.f20035e = aVar;
        aVar.setColor(-3355444);
        this.f20033c.addView(this.f20035e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f20033c.bringChildToFront(this.f20035e);
        this.f20035e.mo55509a();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m24569c() {
        C7888a aVar = this.f20035e;
        if (aVar != null) {
            aVar.mo55510b();
            this.f20033c.removeView(this.f20035e);
            this.f20035e = null;
        }
    }

    /* access modifiers changed from: protected */
    public C8490n getSdk() {
        C8201b bVar = this.f20031a;
        if (bVar != null) {
            return bVar.mo56451d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(C8656R.layout.mediation_debugger_list_view);
        this.f20033c = (FrameLayout) findViewById(16908290);
        this.f20034d = (ListView) findViewById(C8656R.C8660id.listView);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C8656R.C8662menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C8201b bVar = this.f20031a;
        if (bVar != null) {
            bVar.unregisterDataSetObserver(this.f20032b);
            this.f20031a.mo56498a((C8218d.C8220a) null);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C8656R.C8660id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        m24563a();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f20034d.setAdapter(this.f20031a);
        C8201b bVar = this.f20031a;
        if (bVar != null && !bVar.mo56449b()) {
            m24568b();
        }
    }

    public void setListAdapter(C8201b bVar, final C8313a aVar) {
        DataSetObserver dataSetObserver;
        C8201b bVar2 = this.f20031a;
        if (!(bVar2 == null || (dataSetObserver = this.f20032b) == null)) {
            bVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f20031a = bVar;
        this.f20032b = new DataSetObserver() {
            public void onChanged() {
                C8190a.this.m24569c();
                C8190a aVar = C8190a.this;
                aVar.m24564a((Context) aVar);
            }
        };
        m24564a((Context) this);
        this.f20031a.registerDataSetObserver(this.f20032b);
        this.f20031a.mo56498a((C8218d.C8220a) new C8218d.C8220a() {
            /* renamed from: a */
            public void mo55474a(C8212a aVar, final C8214c cVar) {
                C8190a aVar2;
                Class cls;
                C8313a aVar3;
                C8562b.C8564a r1;
                int a = aVar.mo56470a();
                if (a == C8201b.C8206b.APP_INFO.ordinal() || a == C8201b.C8206b.MAX.ordinal()) {
                    Utils.showAlert(cVar.mo56479l(), cVar.mo56480m(), (Context) C8190a.this);
                } else if (a == C8201b.C8206b.ADS.ordinal()) {
                    if (aVar.mo56471b() != C8201b.C8205a.AD_UNITS.ordinal()) {
                        if (aVar.mo56471b() == C8201b.C8205a.SELECT_LIVE_NETWORKS.ordinal()) {
                            if (C8190a.this.f20031a.mo56456j().size() > 0 || C8190a.this.f20031a.mo56457k().size() > 0) {
                                if (!C8190a.this.f20031a.mo56451d().mo57330N().mo56529a()) {
                                    aVar2 = C8190a.this;
                                    cls = MaxDebuggerTestLiveNetworkActivity.class;
                                    aVar3 = aVar;
                                    r1 = new C8562b.C8564a<MaxDebuggerTestLiveNetworkActivity>() {
                                        /* renamed from: a */
                                        public void mo55475a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                                            maxDebuggerTestLiveNetworkActivity.initialize(C8190a.this.f20031a.mo56456j(), C8190a.this.f20031a.mo56457k(), C8190a.this.f20031a.mo56451d());
                                        }
                                    };
                                }
                                Utils.showAlert("Restart Required", cVar.mo56480m(), (Context) C8190a.this);
                                return;
                            }
                        } else if (aVar.mo56471b() == C8201b.C8205a.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                            if (!C8190a.this.f20031a.mo56451d().mo57330N().mo56529a()) {
                                C8190a.this.getSdk().mo57330N().mo56532d();
                                Utils.showAlert("Restart Required", cVar.mo56480m(), (Context) C8190a.this);
                                return;
                            } else if (C8190a.this.f20031a.mo56458l().size() > 0) {
                                aVar2 = C8190a.this;
                                cls = MaxDebuggerTestModeNetworkActivity.class;
                                aVar3 = aVar;
                                r1 = new C8562b.C8564a<MaxDebuggerTestModeNetworkActivity>() {
                                    /* renamed from: a */
                                    public void mo55475a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                                        maxDebuggerTestModeNetworkActivity.initialize(C8190a.this.f20031a.mo56458l(), C8190a.this.f20031a.mo56451d());
                                    }
                                };
                            }
                        } else if (aVar.mo56471b() == C8201b.C8205a.INITIALIZATION_AD_UNITS.ordinal()) {
                            aVar2 = C8190a.this;
                            cls = MaxDebuggerAdUnitsListActivity.class;
                            aVar3 = aVar;
                            r1 = new C8562b.C8564a<MaxDebuggerAdUnitsListActivity>() {
                                /* renamed from: a */
                                public void mo55475a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                                    maxDebuggerAdUnitsListActivity.initialize(C8190a.this.f20031a.mo56453g(), true, C8190a.this.f20031a.mo56451d());
                                }
                            };
                        } else {
                            return;
                        }
                        Utils.showAlert("Complete Integrations", "Please complete integrations in order to access this.", (Context) C8190a.this);
                        return;
                    } else if (C8190a.this.f20031a.mo56452f().size() > 0) {
                        aVar2 = C8190a.this;
                        cls = MaxDebuggerAdUnitsListActivity.class;
                        aVar3 = aVar;
                        r1 = new C8562b.C8564a<MaxDebuggerAdUnitsListActivity>() {
                            /* renamed from: a */
                            public void mo55475a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                                maxDebuggerAdUnitsListActivity.initialize(C8190a.this.f20031a.mo56452f(), false, C8190a.this.f20031a.mo56451d());
                            }
                        };
                    } else {
                        Utils.showAlert("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", (Context) C8190a.this);
                        return;
                    }
                    C8562b.m26056a(aVar2, cls, aVar3, r1);
                } else if ((a == C8201b.C8206b.INCOMPLETE_NETWORKS.ordinal() || a == C8201b.C8206b.COMPLETED_NETWORKS.ordinal()) && (cVar instanceof C8199a)) {
                    C8562b.m26056a(C8190a.this, MaxDebuggerDetailActivity.class, aVar, new C8562b.C8564a<MaxDebuggerDetailActivity>() {
                        /* renamed from: a */
                        public void mo55475a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                            maxDebuggerDetailActivity.initialize(((C8199a) cVar).mo56442f());
                        }
                    });
                }
            }
        });
    }
}
