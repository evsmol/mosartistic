package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.mediation.p234a.C8076f;
import com.applovin.impl.mediation.p234a.C8079h;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

public class MaxAdapterParametersImpl implements MaxAdapterInitializationParameters, MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters {

    /* renamed from: a */
    private String f19530a;

    /* renamed from: b */
    private Map<String, Object> f19531b;

    /* renamed from: c */
    private Bundle f19532c;

    /* renamed from: d */
    private Bundle f19533d;

    /* renamed from: e */
    private Boolean f19534e;

    /* renamed from: f */
    private Boolean f19535f;

    /* renamed from: g */
    private Boolean f19536g;

    /* renamed from: h */
    private String f19537h;

    /* renamed from: i */
    private boolean f19538i;

    /* renamed from: j */
    private String f19539j;

    /* renamed from: k */
    private String f19540k;

    /* renamed from: l */
    private long f19541l;

    /* renamed from: m */
    private MaxAdFormat f19542m;

    private MaxAdapterParametersImpl() {
    }

    /* renamed from: a */
    static MaxAdapterParametersImpl m23994a(C8070a aVar) {
        MaxAdapterParametersImpl a = m23995a((C8076f) aVar);
        a.f19539j = aVar.mo56096p();
        a.f19540k = aVar.mo56090j();
        a.f19541l = aVar.mo56091k();
        return a;
    }

    /* renamed from: a */
    static MaxAdapterParametersImpl m23995a(C8076f fVar) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f19530a = fVar.getAdUnitId();
        maxAdapterParametersImpl.f19534e = fVar.mo56155V();
        maxAdapterParametersImpl.f19535f = fVar.mo56156W();
        maxAdapterParametersImpl.f19536g = fVar.mo56157X();
        maxAdapterParametersImpl.f19537h = fVar.mo56158Y();
        maxAdapterParametersImpl.f19531b = fVar.mo56168aa();
        maxAdapterParametersImpl.f19532c = fVar.mo56169ab();
        maxAdapterParametersImpl.f19533d = fVar.mo56170ac();
        maxAdapterParametersImpl.f19538i = fVar.mo56154U();
        return maxAdapterParametersImpl;
    }

    /* renamed from: a */
    static MaxAdapterParametersImpl m23996a(C8079h hVar, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl a = m23995a((C8076f) hVar);
        a.f19542m = maxAdFormat;
        return a;
    }

    public MaxAdFormat getAdFormat() {
        return this.f19542m;
    }

    public String getAdUnitId() {
        return this.f19530a;
    }

    public long getBidExpirationMillis() {
        return this.f19541l;
    }

    public String getBidResponse() {
        return this.f19540k;
    }

    public String getConsentString() {
        return this.f19537h;
    }

    public Bundle getCustomParameters() {
        return this.f19533d;
    }

    public Map<String, Object> getLocalExtraParameters() {
        return this.f19531b;
    }

    public Bundle getServerParameters() {
        return this.f19532c;
    }

    public String getThirdPartyAdPlacementId() {
        return this.f19539j;
    }

    public Boolean hasUserConsent() {
        return this.f19534e;
    }

    public Boolean isAgeRestrictedUser() {
        return this.f19535f;
    }

    public Boolean isDoNotSell() {
        return this.f19536g;
    }

    public boolean isTesting() {
        return this.f19538i;
    }
}
