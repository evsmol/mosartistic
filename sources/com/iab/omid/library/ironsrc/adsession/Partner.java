package com.iab.omid.library.ironsrc.adsession;

import com.iab.omid.library.ironsrc.p113d.C4330e;

public class Partner {
    private final String name;
    private final String version;

    private Partner(String str, String str2) {
        this.name = str;
        this.version = str2;
    }

    public static Partner createPartner(String str, String str2) {
        C4330e.m12304a(str, "Name is null or empty");
        C4330e.m12304a(str2, "Version is null or empty");
        return new Partner(str, str2);
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }
}
