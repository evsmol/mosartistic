package com.apm.insight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.apm.insight.a */
public class C6548a {

    /* renamed from: a */
    private Map<CrashType, List<AttachUserData>> f13983a = new HashMap();

    /* renamed from: b */
    private Map<CrashType, List<AttachUserData>> f13984b = new HashMap();

    /* renamed from: c */
    private Map<String, String> f13985c = new HashMap();

    /* renamed from: d */
    private ICrashFilter f13986d = null;

    /* renamed from: c */
    private void m15985c(CrashType crashType, AttachUserData attachUserData) {
        List list;
        if (this.f13983a.get(crashType) == null) {
            list = new ArrayList();
            this.f13983a.put(crashType, list);
        } else {
            list = this.f13983a.get(crashType);
        }
        list.add(attachUserData);
    }

    /* renamed from: d */
    private void m15986d(CrashType crashType, AttachUserData attachUserData) {
        List list;
        if (this.f13984b.get(crashType) == null) {
            list = new ArrayList();
            this.f13984b.put(crashType, list);
        } else {
            list = this.f13984b.get(crashType);
        }
        list.add(attachUserData);
    }

    /* renamed from: e */
    private void m15987e(CrashType crashType, AttachUserData attachUserData) {
        List list = this.f13983a.get(crashType);
        if (list != null) {
            list.remove(attachUserData);
        }
    }

    /* renamed from: f */
    private void m15988f(CrashType crashType, AttachUserData attachUserData) {
        List list = this.f13984b.get(crashType);
        if (list != null) {
            list.remove(attachUserData);
        }
    }

    /* renamed from: a */
    public List<AttachUserData> mo51966a(CrashType crashType) {
        return this.f13983a.get(crashType);
    }

    /* renamed from: a */
    public Map<String, String> mo51967a() {
        return this.f13985c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51968a(AttachUserData attachUserData, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            m15985c(CrashType.LAUNCH, attachUserData);
            m15985c(CrashType.JAVA, attachUserData);
            m15985c(CrashType.CUSTOM_JAVA, attachUserData);
            m15985c(CrashType.NATIVE, attachUserData);
            m15985c(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        m15985c(crashType, attachUserData);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51969a(CrashType crashType, AttachUserData attachUserData) {
        if (crashType == CrashType.ALL) {
            m15987e(CrashType.LAUNCH, attachUserData);
            m15987e(CrashType.JAVA, attachUserData);
            m15987e(CrashType.CUSTOM_JAVA, attachUserData);
            m15987e(CrashType.NATIVE, attachUserData);
            m15987e(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        m15987e(crashType, attachUserData);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51970a(ICrashFilter iCrashFilter) {
        this.f13986d = iCrashFilter;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51971a(Map<? extends String, ? extends String> map) {
        this.f13985c.putAll(map);
    }

    /* renamed from: b */
    public ICrashFilter mo51972b() {
        return this.f13986d;
    }

    /* renamed from: b */
    public List<AttachUserData> mo51973b(CrashType crashType) {
        return this.f13984b.get(crashType);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo51974b(AttachUserData attachUserData, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            m15986d(CrashType.LAUNCH, attachUserData);
            m15986d(CrashType.JAVA, attachUserData);
            m15986d(CrashType.CUSTOM_JAVA, attachUserData);
            m15986d(CrashType.NATIVE, attachUserData);
            m15986d(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        m15986d(crashType, attachUserData);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo51975b(CrashType crashType, AttachUserData attachUserData) {
        if (crashType == CrashType.ALL) {
            m15988f(CrashType.LAUNCH, attachUserData);
            m15988f(CrashType.JAVA, attachUserData);
            m15988f(CrashType.CUSTOM_JAVA, attachUserData);
            m15988f(CrashType.NATIVE, attachUserData);
            m15988f(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        m15988f(crashType, attachUserData);
    }
}
