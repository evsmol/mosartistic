package com.explorestack.iab.vast.processor;

import com.explorestack.iab.vast.tags.VastXmlTag;

/* renamed from: com.explorestack.iab.vast.processor.e */
public class C1471e {

    /* renamed from: a */
    public boolean f4555a;

    /* renamed from: b */
    public boolean f4556b;

    /* renamed from: c */
    public boolean f4557c;

    public C1471e() {
        this(true, true, true);
    }

    public C1471e(VastXmlTag vastXmlTag) {
        this(vastXmlTag.getBooleanAttributeValueByName("followAdditionalWrappers", true), vastXmlTag.getBooleanAttributeValueByName("allowMultipleAds", true), vastXmlTag.getBooleanAttributeValueByName("fallbackOnNoAd", true));
    }

    private C1471e(boolean z, boolean z2, boolean z3) {
        this.f4555a = z;
        this.f4556b = z2;
        this.f4557c = z3;
    }

    /* renamed from: a */
    public boolean mo4453a() {
        return this.f4556b;
    }

    /* renamed from: b */
    public boolean mo4454b() {
        return this.f4557c;
    }

    /* renamed from: c */
    public boolean mo4455c() {
        return this.f4555a;
    }
}
