package com.applovin.impl.mediation.debugger.p243ui.p245b.p246a;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.mediation.debugger.p238b.p241c.C8160b;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8214c;
import com.applovin.impl.sdk.utils.C8570g;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.C8656R;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.impl.mediation.debugger.ui.b.a.a */
public class C8199a extends C8214c {

    /* renamed from: a */
    private final C8160b f20047a;

    /* renamed from: o */
    private final Context f20048o;

    public C8199a(C8160b bVar, Context context) {
        super(C8214c.C8217b.DETAIL);
        this.f20047a = bVar;
        this.f20048o = context;
        this.f20123d = m24581q();
        this.f20124e = m24582r();
    }

    /* renamed from: q */
    private SpannedString m24581q() {
        return StringUtils.createSpannedString(this.f20047a.mo56373i(), mo55479c() ? -16777216 : -7829368, 18, 1);
    }

    /* renamed from: r */
    private SpannedString m24582r() {
        if (!mo55479c()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(m24583s());
        spannableStringBuilder.append(new SpannableString("\n"));
        spannableStringBuilder.append(m24584t());
        if (this.f20047a.mo56364a() == C8160b.C8161a.INVALID_INTEGRATION) {
            spannableStringBuilder.append(new SpannableString("\n"));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString("Invalid Integration", -65536));
        }
        return new SpannedString(spannableStringBuilder);
    }

    /* renamed from: s */
    private SpannedString m24583s() {
        if (!this.f20047a.mo56368d()) {
            return StringUtils.createListItemDetailSpannedString("SDK Missing", -65536);
        }
        if (!TextUtils.isEmpty(this.f20047a.mo56374j())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(this.f20047a.mo56374j(), -16777216));
            return new SpannedString(spannableStringBuilder);
        }
        return StringUtils.createListItemDetailSpannedString(this.f20047a.mo56369e() ? "Retrieving SDK Version..." : "SDK Found", -16777216);
    }

    /* renamed from: t */
    private SpannedString m24584t() {
        if (!this.f20047a.mo56369e()) {
            return StringUtils.createListItemDetailSpannedString("Adapter Missing", -65536);
        }
        if (TextUtils.isEmpty(this.f20047a.mo56375k())) {
            return StringUtils.createListItemDetailSpannedString("Adapter Found", -16777216);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
        spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(this.f20047a.mo56375k(), -16777216));
        if (this.f20047a.mo56370f()) {
            spannableStringBuilder.append(StringUtils.createListItemDetailSubSpannedString("  LATEST  ", Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 127, 0)));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(this.f20047a.mo56376l(), -16777216));
        }
        return new SpannedString(spannableStringBuilder);
    }

    /* renamed from: a */
    public int mo55477a() {
        return mo55479c() ? C8656R.C8659drawable.applovin_ic_disclosure_arrow : super.mo56443g();
    }

    /* renamed from: b */
    public int mo55478b() {
        return C8570g.m26080a(C8656R.C8658color.applovin_sdk_disclosureButtonColor, this.f20048o);
    }

    /* renamed from: c */
    public boolean mo55479c() {
        return this.f20047a.mo56364a() != C8160b.C8161a.MISSING;
    }

    /* renamed from: f */
    public C8160b mo56442f() {
        return this.f20047a;
    }

    /* renamed from: g */
    public int mo56443g() {
        int o = this.f20047a.mo56379o();
        return o > 0 ? o : C8656R.C8659drawable.applovin_ic_mediation_placeholder;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + this.f20123d + ", detailText=" + this.f20124e + ", network=" + this.f20047a + "}";
    }
}
