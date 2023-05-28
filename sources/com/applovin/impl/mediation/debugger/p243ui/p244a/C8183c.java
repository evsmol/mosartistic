package com.applovin.impl.mediation.debugger.p243ui.p244a;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListView;
import com.applovin.impl.mediation.debugger.p238b.p239a.C8152a;
import com.applovin.impl.mediation.debugger.p238b.p239a.C8153b;
import com.applovin.impl.mediation.debugger.p243ui.C8173a;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8212a;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8214c;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8218d;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8221e;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.utils.C8562b;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.sdk.C8656R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.a.c */
public class C8183c extends C8173a {

    /* renamed from: a */
    private List<C8152a> f20012a;

    /* renamed from: b */
    private C8490n f20013b;

    /* renamed from: c */
    private C8218d f20014c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<C8214c> f20015d;

    /* renamed from: e */
    private boolean f20016e;

    /* renamed from: f */
    private ListView f20017f;

    /* renamed from: a */
    private List<C8214c> m24555a(List<C8152a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C8152a next : list) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(next.mo56324a(), -16777216));
            spannableStringBuilder.append(new SpannedString("\n"));
            spannableStringBuilder.append(StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(next.mo56326c(), -16777216));
            arrayList.add(C8214c.m24665a(C8214c.C8217b.DETAIL).mo56485a(StringUtils.createSpannedString(next.mo56325b(), -16777216, 18, 1)).mo56490b(new SpannedString(spannableStringBuilder)).mo56484a((Context) this).mo56487a(true).mo56488a());
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public C8490n getSdk() {
        return this.f20013b;
    }

    public void initialize(final List<C8152a> list, boolean z, final C8490n nVar) {
        this.f20012a = list;
        this.f20016e = z;
        this.f20013b = nVar;
        this.f20015d = m24555a(list);
        C81841 r3 = new C8218d(this) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo55480a(int i) {
                return list.size();
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public C8214c mo55483b(int i) {
                return new C8221e("");
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public List<C8214c> mo55486c(int i) {
                return C8183c.this.f20015d;
            }

            /* access modifiers changed from: protected */
            /* renamed from: e */
            public int mo55488e() {
                return 1;
            }
        };
        this.f20014c = r3;
        r3.mo56498a((C8218d.C8220a) new C8218d.C8220a() {
            /* renamed from: a */
            public void mo55474a(final C8212a aVar, C8214c cVar) {
                C8562b.m26056a(C8183c.this, MaxDebuggerAdUnitDetailActivity.class, nVar.mo57368ai(), new C8562b.C8564a<MaxDebuggerAdUnitDetailActivity>() {
                    /* renamed from: a */
                    public void mo55475a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                        maxDebuggerAdUnitDetailActivity.initialize((C8152a) list.get(aVar.mo56471b()), (C8153b) null, nVar);
                    }
                });
            }
        });
        this.f20014c.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20016e ? "Selective Init " : "");
        sb.append("Ad Units");
        setTitle(sb.toString());
        setContentView(C8656R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(C8656R.C8660id.listView);
        this.f20017f = listView;
        listView.setAdapter(this.f20014c);
    }
}
