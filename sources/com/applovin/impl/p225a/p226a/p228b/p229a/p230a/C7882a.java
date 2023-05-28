package com.applovin.impl.p225a.p226a.p228b.p229a.p230a;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8214c;
import com.applovin.impl.p225a.p226a.p227a.C7878a;
import com.applovin.impl.sdk.utils.C8570g;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.C8656R;

/* renamed from: com.applovin.impl.a.a.b.a.a.a */
public class C7882a extends C8214c {

    /* renamed from: a */
    private final C7878a f19009a;

    /* renamed from: o */
    private final Context f19010o;

    public C7882a(C7878a aVar, Context context) {
        super(C8214c.C8217b.DETAIL);
        this.f19009a = aVar;
        this.f19010o = context;
        this.f20123d = m23343q();
        this.f20124e = m23344r();
    }

    /* renamed from: q */
    private SpannedString m23343q() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(this.f19009a.mo55466a());
        spannableStringBuilder.append(" - ");
        spannableStringBuilder.append(this.f19009a.mo55467b());
        return new SpannedString(spannableStringBuilder);
    }

    /* renamed from: r */
    private SpannedString m23344r() {
        return new SpannedString("Displayed " + Utils.getPrettyDate(this.f19009a.mo55469d(), true));
    }

    /* renamed from: a */
    public int mo55477a() {
        return mo55479c() ? C8656R.C8659drawable.applovin_ic_disclosure_arrow : super.mo56443g();
    }

    /* renamed from: b */
    public int mo55478b() {
        return C8570g.m26080a(C8656R.C8658color.applovin_sdk_disclosureButtonColor, this.f19010o);
    }

    /* renamed from: c */
    public boolean mo55479c() {
        return true;
    }
}
