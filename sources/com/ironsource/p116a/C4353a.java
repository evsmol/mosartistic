package com.ironsource.p116a;

import android.util.Pair;
import java.util.ArrayList;

/* renamed from: com.ironsource.a.a */
public final class C4353a {

    /* renamed from: a */
    String f10376a;

    /* renamed from: b */
    public boolean f10377b;

    /* renamed from: c */
    String f10378c;

    /* renamed from: d */
    C4358d f10379d;

    /* renamed from: e */
    boolean f10380e = false;

    /* renamed from: f */
    ArrayList<Pair<String, String>> f10381f;

    /* renamed from: com.ironsource.a.a$a */
    public static class C4354a {

        /* renamed from: a */
        String f10382a = "";

        /* renamed from: b */
        public boolean f10383b = false;

        /* renamed from: c */
        public String f10384c = "POST";

        /* renamed from: d */
        public C4358d f10385d;

        /* renamed from: e */
        public boolean f10386e = false;

        /* renamed from: f */
        public ArrayList<Pair<String, String>> f10387f = new ArrayList<>();

        public C4354a(String str) {
            if (str != null && !str.isEmpty()) {
                this.f10382a = str;
            }
        }
    }

    public C4353a(C4354a aVar) {
        this.f10376a = aVar.f10382a;
        this.f10377b = aVar.f10383b;
        this.f10378c = aVar.f10384c;
        this.f10379d = aVar.f10385d;
        this.f10380e = aVar.f10386e;
        if (aVar.f10387f != null) {
            this.f10381f = new ArrayList<>(aVar.f10387f);
        }
    }
}
