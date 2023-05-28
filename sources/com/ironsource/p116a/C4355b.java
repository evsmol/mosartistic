package com.ironsource.p116a;

import android.net.Uri;
import android.util.Log;
import com.ironsource.p119d.C4371b;
import com.ironsource.p119d.C4374c;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ironsource.a.b */
public final class C4355b {

    /* renamed from: a */
    C4353a f10388a;

    /* renamed from: b */
    private C4357c f10389b;

    /* renamed from: c */
    private C4358d f10390c;

    /* renamed from: d */
    private ExecutorService f10391d;

    public C4355b(C4353a aVar, C4357c cVar) {
        if (aVar == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        } else if (aVar.f10379d != null) {
            this.f10388a = aVar;
            this.f10389b = cVar;
            this.f10390c = aVar.f10379d;
            this.f10391d = Executors.newSingleThreadExecutor();
        } else {
            throw new InvalidParameterException("Null formatter not supported ");
        }
    }

    /* renamed from: a */
    private static void m12402a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33048a(String str) {
        if (this.f10388a.f10380e) {
            Log.d("EventsTracker", str);
        }
    }

    /* renamed from: a */
    public final void mo33049a(String str, Map<String, Object> map) {
        mo33048a(String.format(Locale.ENGLISH, "%s %s", new Object[]{str, map.toString()}));
        if (this.f10388a.f10377b && !str.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("eventname", str);
            m12402a((Map<String, Object>) hashMap, this.f10389b.mo33051a());
            m12402a((Map<String, Object>) hashMap, map);
            final String a = this.f10390c.mo33052a(hashMap);
            this.f10391d.submit(new Runnable() {
                public final void run() {
                    try {
                        C4374c cVar = new C4374c();
                        ArrayList arrayList = new ArrayList(C4355b.this.f10388a.f10381f);
                        if ("POST".equals(C4355b.this.f10388a.f10378c)) {
                            cVar = C4371b.m12425a(C4355b.this.f10388a.f10376a, a, arrayList);
                        } else if ("GET".equals(C4355b.this.f10388a.f10378c)) {
                            String str = C4355b.this.f10388a.f10376a;
                            String str2 = a;
                            Uri build = Uri.parse(str).buildUpon().encodedQuery(str2).build();
                            C4371b.C4372a.C4373a aVar = new C4371b.C4372a.C4373a();
                            aVar.f10415b = build.toString();
                            aVar.f10417d = str2;
                            aVar.f10416c = "GET";
                            aVar.mo33170a(arrayList);
                            cVar = C4371b.m12424a(aVar.mo33171a());
                        }
                        C4355b bVar = C4355b.this;
                        bVar.mo33048a("response status code: " + cVar.f10421a);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
