package com.applovin.impl.mediation.debugger.p243ui.p247c;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.mediation.debugger.p238b.p241c.C8159a;
import com.applovin.impl.mediation.debugger.p238b.p241c.C8160b;
import com.applovin.impl.mediation.debugger.p238b.p241c.C8163c;
import com.applovin.impl.mediation.debugger.p238b.p241c.C8164d;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8212a;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8214c;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8218d;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8221e;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.utils.C8570g;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.C8656R;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.c.b */
public class C8210b extends C8218d {

    /* renamed from: a */
    private final C8160b f20099a;

    /* renamed from: b */
    private List<C8214c> f20100b;

    /* renamed from: d */
    private final List<C8214c> f20101d;

    /* renamed from: e */
    private final List<C8214c> f20102e;

    /* renamed from: f */
    private final List<C8214c> f20103f;

    /* renamed from: g */
    private final List<C8214c> f20104g;

    /* renamed from: h */
    private SpannedString f20105h;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.c.b$a */
    public enum C8211a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    C8210b(C8160b bVar, Context context) {
        super(context);
        this.f20099a = bVar;
        if (bVar.mo56364a() == C8160b.C8161a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f20105h = new SpannedString(spannableString);
        } else {
            this.f20105h = new SpannedString("");
        }
        this.f20100b = m24645c();
        this.f20101d = m24640a(bVar.mo56382r());
        this.f20102e = m24639a(bVar.mo56386u());
        this.f20103f = m24642b(bVar.mo56383s());
        this.f20104g = m24651h();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    private int m24636a(boolean z) {
        return z ? C8656R.C8659drawable.applovin_ic_check_mark_bordered : C8656R.C8659drawable.applovin_ic_x_mark;
    }

    /* renamed from: a */
    private C8214c m24637a(C8160b.C8162b bVar) {
        C8214c.C8216a p = C8214c.m24667p();
        if (bVar == C8160b.C8162b.READY) {
            p.mo56484a(this.f20157c);
        }
        return p.mo56486a("Test Mode").mo56491b(bVar.mo56392a()).mo56489b(bVar.mo56393b()).mo56494c("Restart Required").mo56495d(bVar.mo56394c()).mo56487a(true).mo56488a();
    }

    /* renamed from: a */
    private C8214c m24638a(String str, String str2, boolean z, boolean z2) {
        return C8214c.m24665a(z ? C8214c.C8217b.RIGHT_DETAIL : C8214c.C8217b.DETAIL).mo56486a(str).mo56490b(z ? null : this.f20105h).mo56494c("Instructions").mo56495d(str2).mo56483a(z ? C8656R.C8659drawable.applovin_ic_check_mark_bordered : m24641b(z2)).mo56493c(z ? C8570g.m26080a(C8656R.C8658color.applovin_sdk_checkmarkColor, this.f20157c) : m24646d(z2)).mo56487a(!z).mo56488a();
    }

    /* renamed from: a */
    private List<C8214c> m24639a(C8163c cVar) {
        ArrayList arrayList = new ArrayList(1);
        if (cVar.mo56395a()) {
            arrayList.add(m24638a("Cleartext Traffic", cVar.mo56397c(), cVar.mo56396b(), false));
        }
        if (this.f20099a.mo56384t()) {
            arrayList.add(m24638a("Java 8", "For optimal performance, please enable Java 8 support. See: https://dash.applovin.com/documentation/mediation/android/getting-started/integration", C8490n.m25592B(), true));
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<C8214c> m24640a(List<C8164d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (C8164d next : list) {
                arrayList.add(m24638a(next.mo56398a(), next.mo56399b(), next.mo56400c(), true));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private int m24641b(boolean z) {
        return z ? C8656R.C8659drawable.applovin_ic_x_mark : C8656R.C8659drawable.applovin_ic_warning;
    }

    /* renamed from: b */
    private List<C8214c> m24642b(List<C8159a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (C8159a next : list) {
                arrayList.add(m24638a(next.mo56357a(), next.mo56358b(), next.mo56359c(), true));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private int m24643c(boolean z) {
        return C8570g.m26080a(z ? C8656R.C8658color.applovin_sdk_checkmarkColor : C8656R.C8658color.applovin_sdk_xmarkColor, this.f20157c);
    }

    /* renamed from: c */
    private C8214c m24644c(List<String> list) {
        return C8214c.m24667p().mo56486a("Region/VPN Required").mo56491b(CollectionUtils.implode(list, ", ", list.size())).mo56488a();
    }

    /* renamed from: c */
    private List<C8214c> m24645c() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(m24647d());
        arrayList.add(m24649f());
        arrayList.add(m24650g());
        return arrayList;
    }

    /* renamed from: d */
    private int m24646d(boolean z) {
        return C8570g.m26080a(z ? C8656R.C8658color.applovin_sdk_xmarkColor : C8656R.C8658color.applovin_sdk_warningColor, this.f20157c);
    }

    /* renamed from: d */
    private C8214c m24647d() {
        C8214c.C8216a b = C8214c.m24667p().mo56486a(LogConstants.KEY_SDK).mo56491b(this.f20099a.mo56374j());
        if (TextUtils.isEmpty(this.f20099a.mo56374j())) {
            b.mo56483a(m24636a(this.f20099a.mo56368d())).mo56493c(m24643c(this.f20099a.mo56368d()));
        }
        return b.mo56488a();
    }

    /* renamed from: e */
    private String m24648e(int i) {
        return (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i) ? "Initialized" : MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i ? "Failure" : MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i ? "Initializing..." : "Not Initialized";
    }

    /* renamed from: f */
    private C8214c m24649f() {
        C8214c.C8216a b = C8214c.m24667p().mo56486a("Adapter").mo56491b(this.f20099a.mo56375k());
        if (TextUtils.isEmpty(this.f20099a.mo56375k())) {
            b.mo56483a(m24636a(this.f20099a.mo56369e())).mo56493c(m24643c(this.f20099a.mo56369e()));
        }
        return b.mo56488a();
    }

    /* renamed from: g */
    private C8214c m24650g() {
        return C8214c.m24667p().mo56486a("Initialization Status").mo56491b(m24648e(this.f20099a.mo56365b())).mo56487a(false).mo56488a();
    }

    /* renamed from: h */
    private List<C8214c> m24651h() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f20099a.mo56388w())) {
            arrayList.add(C8214c.m24665a(C8214c.C8217b.DETAIL).mo56486a(this.f20099a.mo56388w()).mo56488a());
        }
        if (this.f20099a.mo56366c() == C8160b.C8162b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f20099a.mo56378n() != null) {
            arrayList.add(m24644c(this.f20099a.mo56378n()));
        }
        if (this.f20099a.mo56389x()) {
            arrayList.add(m24638a("Not an Age Restricted User", "Test mode requires Age Restricted User (COPPA) to be set to false.", !AppLovinPrivacySettings.isAgeRestrictedUser(this.f20157c) && AppLovinPrivacySettings.isAgeRestrictedUserSet(this.f20157c), false));
        }
        arrayList.add(m24637a(this.f20099a.mo56366c()));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo55480a(int i) {
        return (i == C8211a.INTEGRATIONS.ordinal() ? this.f20100b : i == C8211a.PERMISSIONS.ordinal() ? this.f20101d : i == C8211a.CONFIGURATION.ordinal() ? this.f20102e : i == C8211a.DEPENDENCIES.ordinal() ? this.f20103f : this.f20104g).size();
    }

    /* renamed from: a */
    public C8160b mo56466a() {
        return this.f20099a;
    }

    /* renamed from: a */
    public boolean mo56467a(C8212a aVar) {
        return aVar.mo56470a() == C8211a.TEST_ADS.ordinal() && aVar.mo56471b() == this.f20104g.size() - 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C8214c mo55483b(int i) {
        return i == C8211a.INTEGRATIONS.ordinal() ? new C8221e("INTEGRATIONS") : i == C8211a.PERMISSIONS.ordinal() ? new C8221e("PERMISSIONS") : i == C8211a.CONFIGURATION.ordinal() ? new C8221e("CONFIGURATION") : i == C8211a.DEPENDENCIES.ordinal() ? new C8221e("DEPENDENCIES") : new C8221e("TEST ADS");
    }

    /* renamed from: b */
    public void mo56468b() {
        this.f20100b = m24645c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List<C8214c> mo55486c(int i) {
        return i == C8211a.INTEGRATIONS.ordinal() ? this.f20100b : i == C8211a.PERMISSIONS.ordinal() ? this.f20101d : i == C8211a.CONFIGURATION.ordinal() ? this.f20102e : i == C8211a.DEPENDENCIES.ordinal() ? this.f20103f : this.f20104g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo55488e() {
        return C8211a.COUNT.ordinal();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }
}
