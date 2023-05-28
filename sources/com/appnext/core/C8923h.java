package com.appnext.core;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;

/* renamed from: com.appnext.core.h */
public final class C8923h extends C8934o {

    /* renamed from: am */
    String f22626am;

    /* renamed from: an */
    String f22627an;

    /* renamed from: ao */
    String f22628ao;

    /* renamed from: ap */
    String f22629ap;

    /* renamed from: aq */
    String f22630aq;

    /* renamed from: ar */
    String f22631ar;

    /* renamed from: as */
    String f22632as;

    /* renamed from: at */
    ResultReceiver f22633at;
    String guid;

    public C8923h() {
    }

    public C8923h(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ResultReceiver resultReceiver) {
        this.f22626am = str;
        this.f22627an = str2;
        this.guid = str3;
        this.f22628ao = str4;
        this.f22629ap = str5;
        this.f22633at = resultReceiver;
        this.f22630aq = str6;
        this.f22631ar = str7;
        this.f22632as = str8;
    }

    /* renamed from: a */
    public final void mo59028a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ResultReceiver resultReceiver) {
        this.f22626am = str;
        this.f22627an = str2;
        this.guid = str3;
        this.f22628ao = str4;
        this.f22629ap = str5;
        this.f22633at = null;
        this.f22630aq = str6;
        this.f22631ar = str7;
        this.f22632as = str8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58214a(Intent intent) {
        intent.putExtra("added_info", AdsService.ADD_PACK);
        intent.putExtra("package", this.f22626am);
        intent.putExtra("link", this.f22627an);
        intent.putExtra("guid", this.guid);
        intent.putExtra("bannerid", this.f22628ao);
        intent.putExtra("placementid", this.f22629ap);
        intent.putExtra("receiver", this.f22633at);
        intent.putExtra("vid", this.f22630aq);
        intent.putExtra("tid", this.f22631ar);
        intent.putExtra("auid", this.f22632as);
    }

    /* renamed from: a */
    public final void mo58213a(Context context) {
        super.mo58213a(context);
        this.f22633at = null;
    }
}
