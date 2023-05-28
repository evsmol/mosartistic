package com.appnext.banners;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.appnext.core.AdsService;
import com.appnext.core.C8934o;

/* renamed from: com.appnext.banners.i */
public final class C8826i extends C8934o {

    /* renamed from: am */
    String f22349am;

    /* renamed from: an */
    String f22350an;

    /* renamed from: ao */
    String f22351ao;

    /* renamed from: ap */
    String f22352ap;

    /* renamed from: aq */
    String f22353aq;

    /* renamed from: ar */
    String f22354ar;

    /* renamed from: as */
    String f22355as;

    /* renamed from: at */
    ResultReceiver f22356at;
    String guid;

    public C8826i() {
    }

    public C8826i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ResultReceiver resultReceiver) {
        this.f22349am = str;
        this.f22350an = str2;
        this.guid = str3;
        this.f22351ao = str4;
        this.f22352ap = str5;
        this.f22356at = resultReceiver;
        this.f22353aq = str6;
        this.f22354ar = str7;
        this.f22355as = str8;
    }

    /* renamed from: a */
    public final void mo58681a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ResultReceiver resultReceiver) {
        this.f22349am = str;
        this.f22350an = str2;
        this.guid = str3;
        this.f22351ao = str4;
        this.f22352ap = str5;
        this.f22356at = resultReceiver;
        this.f22353aq = str6;
        this.f22354ar = str7;
        this.f22355as = str8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58214a(Intent intent) {
        intent.putExtra("added_info", AdsService.ADD_PACK);
        intent.putExtra("package", this.f22349am);
        intent.putExtra("link", this.f22350an);
        intent.putExtra("guid", this.guid);
        intent.putExtra("bannerid", this.f22351ao);
        intent.putExtra("placementid", this.f22352ap);
        intent.putExtra("receiver", this.f22356at);
        intent.putExtra("vid", this.f22353aq);
        intent.putExtra("tid", this.f22354ar);
        intent.putExtra("auid", this.f22355as);
    }

    /* renamed from: a */
    public final void mo58213a(Context context) {
        super.mo58213a(context);
        this.f22356at = null;
    }
}
