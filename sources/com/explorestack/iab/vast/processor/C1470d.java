package com.explorestack.iab.vast.processor;

import android.os.Bundle;
import android.text.TextUtils;
import com.explorestack.iab.vast.VastUrlProcessorRegistry;
import com.explorestack.iab.vast.tags.AdContentTag;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.explorestack.iab.vast.processor.d */
public class C1470d {

    /* renamed from: a */
    public final List<String> f4551a = new ArrayList();

    /* renamed from: b */
    public VastAd f4552b;

    /* renamed from: c */
    public int f4553c = -1;

    /* renamed from: d */
    public boolean f4554d = true;

    /* renamed from: a */
    public List<String> mo4444a() {
        return this.f4551a;
    }

    /* renamed from: a */
    public void mo4445a(int i) {
        this.f4553c = i;
    }

    /* renamed from: a */
    public void mo4446a(VastAd vastAd) {
        this.f4552b = vastAd;
    }

    /* renamed from: a */
    public void mo4447a(AdContentTag adContentTag, int i) {
        mo4445a(i);
        Bundle bundle = new Bundle();
        bundle.putInt("params_error_code", i);
        List<String> errorUrlList = adContentTag.getErrorUrlList();
        if (errorUrlList != null && !errorUrlList.isEmpty()) {
            for (String a : errorUrlList) {
                String a2 = VastUrlProcessorRegistry.m6379a(a, bundle);
                if (!TextUtils.isEmpty(a2)) {
                    this.f4551a.add(a2);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4448a(boolean z) {
        this.f4554d = z;
    }

    /* renamed from: b */
    public int mo4449b() {
        return this.f4553c;
    }

    /* renamed from: c */
    public VastAd mo4450c() {
        return this.f4552b;
    }

    /* renamed from: d */
    public boolean mo4451d() {
        return this.f4552b != null;
    }

    /* renamed from: e */
    public boolean mo4452e() {
        return this.f4554d;
    }
}
