package com.adcolony.sdk;

public abstract class AdColonyAdViewListener {

    /* renamed from: a */
    String f13178a = "";

    /* renamed from: b */
    AdColonyAdSize f13179b;

    /* renamed from: c */
    C6401p0 f13180c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAdSize mo50275a() {
        return this.f13179b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6401p0 mo50279b() {
        return this.f13180c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo50280c() {
        return this.f13178a;
    }

    public void onClicked(AdColonyAdView adColonyAdView) {
    }

    public void onClosed(AdColonyAdView adColonyAdView) {
    }

    public void onLeftApplication(AdColonyAdView adColonyAdView) {
    }

    public void onOpened(AdColonyAdView adColonyAdView) {
    }

    public abstract void onRequestFilled(AdColonyAdView adColonyAdView);

    public void onRequestNotFilled(AdColonyZone adColonyZone) {
    }

    public void onShow(AdColonyAdView adColonyAdView) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50277a(C6401p0 p0Var) {
        this.f13180c = p0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50278a(String str) {
        this.f13178a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50276a(AdColonyAdSize adColonyAdSize) {
        this.f13179b = adColonyAdSize;
    }
}
