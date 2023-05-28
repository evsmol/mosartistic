package com.iab.omid.library.amazon.adsession;

import android.view.View;
import com.iab.omid.library.amazon.p099b.C4154a;
import com.iab.omid.library.amazon.p099b.C4157c;
import com.iab.omid.library.amazon.p099b.C4161f;
import com.iab.omid.library.amazon.p101d.C4173e;
import com.iab.omid.library.amazon.p102e.C4175a;
import com.iab.omid.library.amazon.publisher.AdSessionStatePublisher;
import com.iab.omid.library.amazon.publisher.C4178a;
import com.iab.omid.library.amazon.publisher.C4179b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.adsession.a */
public class C4152a extends AdSession {

    /* renamed from: a */
    private static final Pattern f9913a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f9914b;

    /* renamed from: c */
    private final AdSessionConfiguration f9915c;

    /* renamed from: d */
    private final List<C4157c> f9916d = new ArrayList();

    /* renamed from: e */
    private C4175a f9917e;

    /* renamed from: f */
    private AdSessionStatePublisher f9918f;

    /* renamed from: g */
    private boolean f9919g = false;

    /* renamed from: h */
    private boolean f9920h = false;

    /* renamed from: i */
    private final String f9921i;

    /* renamed from: j */
    private boolean f9922j;

    /* renamed from: k */
    private boolean f9923k;

    /* renamed from: l */
    private PossibleObstructionListener f9924l;

    C4152a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f9915c = adSessionConfiguration;
        this.f9914b = adSessionContext;
        this.f9921i = UUID.randomUUID().toString();
        m11486c((View) null);
        this.f9918f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C4178a(adSessionContext.getWebView()) : new C4179b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f9918f.mo32388a();
        C4154a.m11508a().mo32336a(this);
        this.f9918f.mo32392a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C4157c m11483a(View view) {
        for (C4157c next : this.f9916d) {
            if (next.mo32355a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m11484a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f9913a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    /* renamed from: b */
    private static void m11485b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m11486c(View view) {
        this.f9917e = new C4175a(view);
    }

    /* renamed from: d */
    private void m11487d(View view) {
        Collection<C4152a> b = C4154a.m11508a().mo32337b();
        if (b != null && !b.isEmpty()) {
            for (C4152a next : b) {
                if (next != this && next.mo32305e() == view) {
                    next.f9917e.clear();
                }
            }
        }
    }

    /* renamed from: k */
    private void m11488k() {
        if (this.f9922j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: l */
    private void m11489l() {
        if (this.f9923k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C4157c> mo32299a() {
        return this.f9916d;
    }

    /* renamed from: a */
    public void mo32300a(List<C4175a> list) {
        if (mo32302b()) {
            ArrayList arrayList = new ArrayList();
            for (C4175a aVar : list) {
                View view = (View) aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f9924l.onPossibleObstructionsDetected(this.f9921i, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32301a(JSONObject jSONObject) {
        m11489l();
        getAdSessionStatePublisher().mo32400a(jSONObject);
        this.f9923k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f9920h) {
            m11485b(view);
            m11484a(str);
            if (m11483a(view) == null) {
                this.f9916d.add(new C4157c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* renamed from: b */
    public boolean mo32302b() {
        return this.f9924l != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo32303c() {
        m11488k();
        getAdSessionStatePublisher().mo32408g();
        this.f9922j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo32304d() {
        m11489l();
        getAdSessionStatePublisher().mo32410h();
        this.f9923k = true;
    }

    /* renamed from: e */
    public View mo32305e() {
        return (View) this.f9917e.get();
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f9920h) {
            C4173e.m11602a((Object) errorType, "Error type is null");
            C4173e.m11604a(str, "Message is null");
            getAdSessionStatePublisher().mo32393a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo32306f() {
        return this.f9919g && !this.f9920h;
    }

    public void finish() {
        if (!this.f9920h) {
            this.f9917e.clear();
            removeAllFriendlyObstructions();
            this.f9920h = true;
            getAdSessionStatePublisher().mo32407f();
            C4154a.m11508a().mo32340c(this);
            getAdSessionStatePublisher().mo32402b();
            this.f9918f = null;
            this.f9924l = null;
        }
    }

    /* renamed from: g */
    public boolean mo32307g() {
        return this.f9919g;
    }

    public String getAdSessionId() {
        return this.f9921i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f9918f;
    }

    /* renamed from: h */
    public boolean mo32308h() {
        return this.f9920h;
    }

    /* renamed from: i */
    public boolean mo32309i() {
        return this.f9915c.isNativeImpressionOwner();
    }

    /* renamed from: j */
    public boolean mo32310j() {
        return this.f9915c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f9920h) {
            C4173e.m11602a((Object) view, "AdView is null");
            if (mo32305e() != view) {
                m11486c(view);
                getAdSessionStatePublisher().mo32411i();
                m11487d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f9920h) {
            this.f9916d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f9920h) {
            m11485b(view);
            C4157c a = m11483a(view);
            if (a != null) {
                this.f9916d.remove(a);
            }
        }
    }

    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f9924l = possibleObstructionListener;
    }

    public void start() {
        if (!this.f9919g) {
            this.f9919g = true;
            C4154a.m11508a().mo32338b(this);
            this.f9918f.mo32389a(C4161f.m11548a().mo32381d());
            this.f9918f.mo32394a(this, this.f9914b);
        }
    }
}
