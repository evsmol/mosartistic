package com.appnext.ads;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.appnext.core.AdsService;
import com.appnext.core.C8934o;

/* renamed from: com.appnext.ads.b */
public final class C8670b extends C8934o {

    /* renamed from: am */
    String f22037am;

    /* renamed from: an */
    String f22038an;

    /* renamed from: ao */
    String f22039ao;

    /* renamed from: ap */
    String f22040ap;

    /* renamed from: aq */
    String f22041aq;

    /* renamed from: ar */
    String f22042ar;

    /* renamed from: as */
    String f22043as;

    /* renamed from: at */
    ResultReceiver f22044at;
    String guid;

    public C8670b() {
    }

    public C8670b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ResultReceiver resultReceiver) {
        this.f22037am = str;
        this.f22038an = str2;
        this.guid = str3;
        this.f22039ao = str4;
        this.f22040ap = str5;
        this.f22044at = resultReceiver;
        this.f22041aq = str6;
        this.f22042ar = str7;
        this.f22043as = str8;
    }

    /* renamed from: a */
    public final void mo58215a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ResultReceiver resultReceiver) {
        this.f22037am = str;
        this.f22038an = str2;
        this.guid = str3;
        this.f22039ao = str4;
        this.f22040ap = str5;
        this.f22044at = resultReceiver;
        this.f22041aq = str6;
        this.f22042ar = str7;
        this.f22043as = str8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58214a(Intent intent) {
        intent.putExtra("added_info", AdsService.ADD_PACK);
        intent.putExtra("package", this.f22037am);
        intent.putExtra("link", this.f22038an);
        intent.putExtra("guid", this.guid);
        intent.putExtra("bannerid", this.f22039ao);
        intent.putExtra("placementid", this.f22040ap);
        intent.putExtra("receiver", this.f22044at);
        intent.putExtra("vid", this.f22041aq);
        intent.putExtra("tid", this.f22042ar);
        intent.putExtra("auid", this.f22043as);
    }

    /* renamed from: a */
    public final void mo58213a(Context context) {
        super.mo58213a(context);
        this.f22044at = null;
    }
}
