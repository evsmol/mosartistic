package com.ironsource.sdk.controller;

import android.text.TextUtils;
import java.util.HashSet;

/* renamed from: com.ironsource.sdk.controller.u */
public class C4839u {

    /* renamed from: a */
    private boolean f12335a = false;

    /* renamed from: b */
    private HashSet<String> f12336b = new HashSet<>();

    /* renamed from: c */
    private String f12337c;

    /* renamed from: d */
    private String f12338d;

    /* renamed from: e */
    private boolean f12339e = false;

    /* renamed from: f */
    private int f12340f;

    /* renamed from: g */
    private boolean f12341g = true;

    /* renamed from: a */
    public HashSet<String> mo34415a() {
        return this.f12336b;
    }

    /* renamed from: a */
    public void mo34416a(int i) {
        this.f12340f = i;
    }

    /* renamed from: a */
    public void mo34417a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f12336b.add(str);
        }
    }

    /* renamed from: a */
    public void mo34418a(boolean z) {
        this.f12335a = z;
    }

    /* renamed from: b */
    public void mo34419b(String str) {
        this.f12337c = str;
    }

    /* renamed from: b */
    public void mo34420b(boolean z) {
        this.f12339e = z;
    }

    /* renamed from: b */
    public boolean mo34421b() {
        return this.f12335a;
    }

    /* renamed from: c */
    public String mo34422c() {
        return this.f12337c;
    }

    /* renamed from: c */
    public void mo34423c(String str) {
        this.f12338d = str;
    }

    /* renamed from: c */
    public void mo34424c(boolean z) {
        this.f12341g = z;
    }

    /* renamed from: d */
    public String mo34425d() {
        return this.f12338d;
    }

    /* renamed from: e */
    public boolean mo34426e() {
        return this.f12339e;
    }

    /* renamed from: f */
    public int mo34427f() {
        return this.f12340f;
    }

    /* renamed from: g */
    public boolean mo34428g() {
        return this.f12341g;
    }
}
