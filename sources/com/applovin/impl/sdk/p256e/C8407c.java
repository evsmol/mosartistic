package com.applovin.impl.sdk.p256e;

import android.net.Uri;
import android.os.Bundle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.C8287h;
import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8550r;
import com.applovin.impl.sdk.C8551s;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8511b;
import com.applovin.impl.sdk.network.C8516c;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p255d.C8392d;
import com.applovin.impl.sdk.p255d.C8393e;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.applovin.impl.sdk.e.c */
public abstract class C8407c extends C8401a implements C8287h.C8288a {

    /* renamed from: a */
    protected final C8350e f21126a;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AppLovinAdLoadListener f21127e;

    /* renamed from: f */
    private final C8550r f21128f;

    /* renamed from: g */
    private final C8551s f21129g;

    /* renamed from: h */
    private final Collection<Character> f21130h;

    /* renamed from: i */
    private final C8393e f21131i;

    /* renamed from: j */
    private boolean f21132j;

    C8407c(String str, C8350e eVar, C8490n nVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, nVar);
        if (eVar != null) {
            this.f21126a = eVar;
            this.f21127e = appLovinAdLoadListener;
            this.f21128f = nVar.mo57364ae();
            this.f21129g = nVar.mo57363ad();
            this.f21130h = m25332j();
            this.f21131i = new C8393e();
            return;
        }
        throw new IllegalArgumentException("No ad specified.");
    }

    /* renamed from: a */
    private Uri m25326a(Uri uri, String str) {
        String str2;
        C8626v vVar;
        StringBuilder sb;
        String str3;
        if (uri != null) {
            String uri2 = uri.toString();
            if (StringUtils.isValidString(uri2)) {
                C8626v vVar2 = this.f21120d;
                if (C8626v.m26252a()) {
                    C8626v vVar3 = this.f21120d;
                    String str4 = this.f21119c;
                    vVar3.mo57818b(str4, "Caching " + str + " image...");
                }
                return m25331c(uri2);
            }
            C8626v vVar4 = this.f21120d;
            if (!C8626v.m26252a()) {
                return null;
            }
            vVar = this.f21120d;
            str3 = this.f21119c;
            sb = new StringBuilder();
            sb.append("Failed to cache ");
            sb.append(str);
            str2 = " image";
        } else {
            C8626v vVar5 = this.f21120d;
            if (!C8626v.m26252a()) {
                return null;
            }
            vVar = this.f21120d;
            str3 = this.f21119c;
            sb = new StringBuilder();
            sb.append("No ");
            sb.append(str);
            str2 = " image to cache";
        }
        sb.append(str2);
        vVar.mo57818b(str3, sb.toString());
        return null;
    }

    /* renamed from: a */
    private Uri m25327a(String str, String str2) {
        StringBuilder sb;
        if (this.f21129g != null) {
            return m25330b(str, str2);
        }
        String replace = str2.replace("/", "_");
        String L = this.f21126a.mo56954L();
        if (StringUtils.isValidString(L)) {
            replace = L + replace;
        }
        File a = this.f21128f.mo57652a(replace, this.f21118b.mo57332P());
        if (a == null) {
            return null;
        }
        if (a.exists()) {
            this.f21131i.mo57145b(a.length());
            sb = new StringBuilder();
        } else {
            if (!this.f21128f.mo57658a(a, str + str2, (List<String>) Arrays.asList(new String[]{str}), this.f21131i)) {
                return null;
            }
            sb = new StringBuilder();
        }
        sb.append("file://");
        sb.append(a.getAbsolutePath());
        return Uri.parse(sb.toString());
    }

    /* renamed from: b */
    private Uri m25330b(String str, String str2) {
        StringBuilder sb;
        String replace = str2.replace("/", "_");
        String L = this.f21126a.mo56954L();
        if (StringUtils.isValidString(L)) {
            replace = L + replace;
        }
        File a = this.f21129g.mo57665a(replace, this.f21118b.mo57332P());
        if (a == null) {
            return null;
        }
        if (a.exists()) {
            this.f21131i.mo57145b(a.length());
            sb = new StringBuilder();
        } else {
            if (!this.f21129g.mo57669a(a, str + str2, (List<String>) Arrays.asList(new String[]{str}), this.f21131i)) {
                return null;
            }
            sb = new StringBuilder();
        }
        sb.append("file://");
        sb.append(a.getAbsolutePath());
        return Uri.parse(sb.toString());
    }

    /* renamed from: c */
    private Uri m25331c(String str) {
        return mo57186c(str, this.f21126a.mo56951I(), true);
    }

    /* renamed from: j */
    private Collection<Character> m25332j() {
        HashSet hashSet = new HashSet();
        for (char valueOf : ((String) this.f21118b.mo57342a(C8380b.f20799bv)).toCharArray()) {
            hashSet.add(Character.valueOf(valueOf));
        }
        hashSet.add('\"');
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Uri mo57178a(String str) {
        return mo57179a(str, this.f21126a.mo56951I(), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Uri mo57179a(String str, List<String> list, boolean z) {
        if (this.f21129g != null) {
            return mo57183b(str, list, z);
        }
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str2 = this.f21119c;
            vVar2.mo57818b(str2, "Caching video " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        String a = this.f21128f.mo57654a(mo57169f(), str, this.f21126a.mo56954L(), list, z, this.f21126a.shouldUrlEncodeResourcePath(), this.f21131i);
        if (StringUtils.isValidString(a)) {
            File a2 = this.f21128f.mo57652a(a, mo57169f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    C8626v vVar3 = this.f21120d;
                    if (C8626v.m26252a()) {
                        C8626v vVar4 = this.f21120d;
                        String str3 = this.f21119c;
                        vVar4.mo57818b(str3, "Finish caching video for ad #" + this.f21126a.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a);
                    }
                    return fromFile;
                }
                C8626v vVar5 = this.f21120d;
                if (!C8626v.m26252a()) {
                    return null;
                }
                C8626v vVar6 = this.f21120d;
                String str4 = this.f21119c;
                vVar6.mo57822e(str4, "Unable to create URI from cached video file = " + a2);
                return null;
            }
            C8626v vVar7 = this.f21120d;
            if (!C8626v.m26252a()) {
                return null;
            }
            C8626v vVar8 = this.f21120d;
            String str5 = this.f21119c;
            vVar8.mo57822e(str5, "Unable to cache video = " + str + "Video file was missing or null");
            return null;
        }
        C8626v vVar9 = this.f21120d;
        if (C8626v.m26252a()) {
            this.f21120d.mo57822e(this.f21119c, "Failed to cache video");
        }
        mo57191h();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo57180a(String str, List<String> list, C8350e eVar) {
        C8626v vVar;
        String str2;
        StringBuilder sb;
        if (!StringUtils.isValidString(str)) {
            return str;
        }
        if (!((Boolean) this.f21118b.mo57342a(C8380b.f20800bw)).booleanValue()) {
            C8626v vVar2 = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57818b(this.f21119c, "Resource caching is disabled, skipping cache...");
            }
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        boolean shouldCancelHtmlCachingIfShown = eVar.shouldCancelHtmlCachingIfShown();
        boolean aK = eVar.mo56984aK();
        List<String> H = eVar.mo56950H();
        for (String next : list) {
            int i = 0;
            int i2 = 0;
            while (i < sb2.length()) {
                if (mo57185b()) {
                    return str;
                }
                i = sb2.indexOf(next, i2);
                if (i == -1) {
                    continue;
                    break;
                }
                int length = sb2.length();
                int i3 = i;
                while (!this.f21130h.contains(Character.valueOf(sb2.charAt(i3))) && i3 < length) {
                    i3++;
                }
                if (i3 <= i || i3 == length) {
                    C8626v vVar3 = this.f21120d;
                    if (C8626v.m26252a()) {
                        this.f21120d.mo57822e(this.f21119c, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return str;
                }
                String substring = sb2.substring(next.length() + i, i3);
                if (!StringUtils.isValidString(substring)) {
                    C8626v vVar4 = this.f21120d;
                    if (C8626v.m26252a()) {
                        vVar = this.f21120d;
                        str2 = this.f21119c;
                        sb = new StringBuilder();
                        sb.append("Skip caching of non-resource ");
                    } else {
                        i2 = i3;
                    }
                } else if (!shouldCancelHtmlCachingIfShown || !eVar.hasShown()) {
                    if (aK) {
                        String d = eVar.mo55843d();
                        if (d.equals(next + substring)) {
                            C8626v vVar5 = this.f21120d;
                            if (C8626v.m26252a()) {
                                vVar = this.f21120d;
                                str2 = this.f21119c;
                                sb = new StringBuilder();
                                sb.append("Postponing caching for \"");
                                sb.append(substring);
                                substring = "\" video resource";
                            } else {
                                i2 = i3;
                            }
                        }
                    }
                    Uri a = m25327a(next, substring);
                    if (a != null) {
                        sb2.replace(i, i3, a.toString());
                        eVar.mo57011b(a);
                        this.f21131i.mo57144b();
                    } else {
                        if (H.contains(next + substring)) {
                            mo57191h();
                            this.f21132j = true;
                        }
                        this.f21131i.mo57146c();
                    }
                    i2 = i3;
                } else {
                    C8626v vVar6 = this.f21120d;
                    if (C8626v.m26252a()) {
                        this.f21120d.mo57818b(this.f21119c, "Cancelling HTML caching due to ad being shown already");
                    }
                    this.f21131i.mo57140a();
                    return str;
                }
                sb.append(substring);
                vVar.mo57818b(str2, sb.toString());
                i2 = i3;
            }
        }
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo57181a() {
        this.f21118b.mo57328L().mo56675b(this);
    }

    /* renamed from: a */
    public void mo56676a(C8070a aVar) {
        if (aVar.mo56071f().equalsIgnoreCase(this.f21126a.mo56956N())) {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57822e(this.f21119c, "Updating flag for timeout...");
            }
            this.f21132j = true;
        }
        this.f21118b.mo57328L().mo56675b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo57182a(AppLovinAdBase appLovinAdBase) {
        C8392d.m25255a(this.f21131i, appLovinAdBase, this.f21118b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Uri mo57183b(String str, List<String> list, boolean z) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str2 = this.f21119c;
            vVar2.mo57818b(str2, "Caching video " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        String a = this.f21129g.mo57666a(mo57169f(), str, this.f21126a.mo56954L(), list, z, this.f21126a.shouldUrlEncodeResourcePath(), this.f21131i);
        if (StringUtils.isValidString(a)) {
            File a2 = this.f21129g.mo57665a(a, mo57169f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    C8626v vVar3 = this.f21120d;
                    if (C8626v.m26252a()) {
                        C8626v vVar4 = this.f21120d;
                        String str3 = this.f21119c;
                        vVar4.mo57818b(str3, "Finish caching video for ad #" + this.f21126a.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a);
                    }
                    return fromFile;
                }
                C8626v vVar5 = this.f21120d;
                if (!C8626v.m26252a()) {
                    return null;
                }
                C8626v vVar6 = this.f21120d;
                String str4 = this.f21119c;
                vVar6.mo57822e(str4, "Unable to create URI from cached video file = " + a2);
                return null;
            }
            C8626v vVar7 = this.f21120d;
            if (!C8626v.m26252a()) {
                return null;
            }
            C8626v vVar8 = this.f21120d;
            String str5 = this.f21119c;
            vVar8.mo57822e(str5, "Unable to cache video = " + str + "Video file was missing or null");
            return null;
        }
        C8626v vVar9 = this.f21120d;
        if (C8626v.m26252a()) {
            this.f21120d.mo57822e(this.f21119c, "Failed to cache video");
        }
        mo57191h();
        Bundle bundle = new Bundle();
        bundle.putLong("ad_id", this.f21126a.getAdIdNumber());
        bundle.putInt("load_response_code", this.f21131i.mo57148e());
        Exception d = this.f21131i.mo57147d();
        if (d != null) {
            bundle.putString("load_exception_message", d.getMessage());
        }
        this.f21118b.mo57369aj().mo57287a(bundle, "video_caching_failed");
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo57184b(final String str) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        C8516c a = C8516c.m25763a(this.f21118b).mo57528a(str).mo57534b("GET").mo57527a("").mo57526a(0).mo57532a();
        final AtomicReference atomicReference = new AtomicReference((Object) null);
        this.f21118b.mo57336U().mo57501a(a, new C8511b.C8513a(), new C8511b.C8515c<String>() {
            /* renamed from: a */
            public void mo56275a(int i, String str, String str2) {
                C8626v vVar = C8407c.this.f21120d;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = C8407c.this.f21120d;
                    String str3 = C8407c.this.f21119c;
                    vVar2.mo57822e(str3, "Failed to load resource from '" + str + "'");
                }
            }

            /* renamed from: a */
            public void mo56277a(String str, int i) {
                atomicReference.set(str);
            }
        });
        String str2 = (String) atomicReference.get();
        if (str2 != null) {
            this.f21131i.mo57142a((long) str2.length());
        }
        return str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo57185b() {
        return this.f21132j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Uri mo57186c(String str, List<String> list, boolean z) {
        if (this.f21129g != null) {
            return mo57188d(str, list, z);
        }
        try {
            String a = this.f21128f.mo57654a(mo57169f(), str, this.f21126a.mo56954L(), list, z, this.f21126a.shouldUrlEncodeResourcePath(), this.f21131i);
            if (!StringUtils.isValidString(a)) {
                return null;
            }
            File a2 = this.f21128f.mo57652a(a, mo57169f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    return fromFile;
                }
                C8626v vVar = this.f21120d;
                if (!C8626v.m26252a()) {
                    return null;
                }
                this.f21120d.mo57822e(this.f21119c, "Unable to extract Uri from image file");
                return null;
            }
            C8626v vVar2 = this.f21120d;
            if (!C8626v.m26252a()) {
                return null;
            }
            C8626v vVar3 = this.f21120d;
            String str2 = this.f21119c;
            vVar3.mo57822e(str2, "Unable to retrieve File from cached image filename = " + a);
            return null;
        } catch (Throwable th) {
            C8626v vVar4 = this.f21120d;
            if (!C8626v.m26252a()) {
                return null;
            }
            C8626v vVar5 = this.f21120d;
            String str3 = this.f21119c;
            vVar5.mo57819b(str3, "Failed to cache image at url = " + str, th);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo57187c() {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            this.f21120d.mo57818b(this.f21119c, "Caching mute images...");
        }
        Uri a = m25326a(this.f21126a.mo56976aC(), "mute");
        if (a != null) {
            this.f21126a.mo57012c(a);
        }
        Uri a2 = m25326a(this.f21126a.mo56977aD(), "unmute");
        if (a2 != null) {
            this.f21126a.mo57013d(a2);
        }
        C8626v vVar2 = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar3 = this.f21120d;
            String str = this.f21119c;
            vVar3.mo57818b(str, "Ad updated with muteImageFilename = " + this.f21126a.mo56976aC() + ", unmuteImageFilename = " + this.f21126a.mo56977aD());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Uri mo57188d(String str, List<String> list, boolean z) {
        try {
            String a = this.f21129g.mo57666a(mo57169f(), str, this.f21126a.mo56954L(), list, z, this.f21126a.shouldUrlEncodeResourcePath(), this.f21131i);
            if (!StringUtils.isValidString(a)) {
                return null;
            }
            File a2 = this.f21129g.mo57665a(a, mo57169f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    return fromFile;
                }
                C8626v vVar = this.f21120d;
                if (!C8626v.m26252a()) {
                    return null;
                }
                this.f21120d.mo57822e(this.f21119c, "Unable to extract Uri from image file");
                return null;
            }
            C8626v vVar2 = this.f21120d;
            if (!C8626v.m26252a()) {
                return null;
            }
            C8626v vVar3 = this.f21120d;
            String str2 = this.f21119c;
            vVar3.mo57822e(str2, "Unable to retrieve File from cached image filename = " + a);
            return null;
        } catch (Throwable th) {
            C8626v vVar4 = this.f21120d;
            if (!C8626v.m26252a()) {
                return null;
            }
            C8626v vVar5 = this.f21120d;
            String str3 = this.f21119c;
            vVar5.mo57819b(str3, "Failed to cache image at url = " + str, th);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo57189e(String str, List<String> list, boolean z) {
        InputStream inputStream;
        if (this.f21129g != null) {
            return mo57190f(str, list, z);
        }
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                C8626v vVar = this.f21120d;
                if (C8626v.m26252a()) {
                    this.f21120d.mo57818b(this.f21119c, "Nothing to cache, skipping...");
                }
                return null;
            }
            String fileName = ((Boolean) this.f21118b.mo57342a(C8380b.f20964fe)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
            if (z) {
                fileName = StringUtils.encodeUriString(fileName, this.f21118b);
            }
            if (StringUtils.isValidString(this.f21126a.mo56954L())) {
                fileName = this.f21126a.mo56954L() + fileName;
            }
            try {
                File a = this.f21128f.mo57652a(fileName, mo57169f());
                if (a != null && a.exists()) {
                    return this.f21128f.mo57656a(a);
                }
                inputStream = this.f21128f.mo57653a(str, list, true, this.f21131i);
                if (inputStream != null) {
                    try {
                        this.f21128f.mo57661b(inputStream, a);
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                Utils.close(inputStream, this.f21118b);
                return this.f21128f.mo57656a(a);
            } catch (Throwable th2) {
                C8626v vVar2 = this.f21120d;
                if (C8626v.m26252a()) {
                    this.f21120d.mo57819b(this.f21119c, "Resource at " + str + " failed to load.", th2);
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo57190f(String str, List<String> list, boolean z) {
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                C8626v vVar = this.f21120d;
                if (C8626v.m26252a()) {
                    this.f21120d.mo57818b(this.f21119c, "Nothing to cache, skipping...");
                }
                return null;
            }
            String fileName = ((Boolean) this.f21118b.mo57342a(C8380b.f20964fe)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
            if (z) {
                fileName = StringUtils.encodeUriString(fileName, this.f21118b);
            }
            if (StringUtils.isValidString(this.f21126a.mo56954L())) {
                fileName = this.f21126a.mo56954L() + fileName;
            }
            File a = this.f21129g.mo57665a(fileName, mo57169f());
            ByteArrayOutputStream a2 = (a == null || !a.exists()) ? null : this.f21129g.mo57663a(a);
            if (a2 == null) {
                a2 = this.f21129g.mo57664a(str, list, true, this.f21131i);
                if (a2 != null) {
                    this.f21129g.mo57668a(a2, a);
                    this.f21131i.mo57142a((long) a2.size());
                }
            } else {
                this.f21131i.mo57145b((long) a2.size());
            }
            try {
                return a2.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                C8626v vVar2 = this.f21120d;
                if (C8626v.m26252a()) {
                    this.f21120d.mo57819b(this.f21119c, "UTF-8 encoding not supported.", e);
                }
            } catch (Throwable th) {
                C8626v vVar3 = this.f21120d;
                if (C8626v.m26252a()) {
                    this.f21120d.mo57819b(this.f21119c, "String resource at " + str + " failed to load.", th);
                }
                return null;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo57191h() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f21127e;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            this.f21127e = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo57192i() {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str = this.f21119c;
            vVar2.mo57818b(str, "Rendered new ad:" + this.f21126a);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C8407c.this.f21127e != null) {
                    C8407c.this.f21127e.adReceived(C8407c.this.f21126a);
                    AppLovinAdLoadListener unused = C8407c.this.f21127e = null;
                }
            }
        });
    }

    public void run() {
        if (this.f21126a.mo56955M()) {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57818b(this.f21119c, "Subscribing to timeout events...");
            }
            this.f21118b.mo57328L().mo56674a((C8287h.C8288a) this);
        }
    }
}
