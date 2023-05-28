package com.explorestack.iab.vast;

import android.os.Bundle;
import com.explorestack.iab.vast.processor.url.C1472a;
import com.explorestack.iab.vast.processor.url.UrlProcessor;
import java.util.ArrayList;
import java.util.List;

public class VastUrlProcessorRegistry {

    /* renamed from: a */
    public static List<UrlProcessor> f4400a = new C1420a();

    /* renamed from: com.explorestack.iab.vast.VastUrlProcessorRegistry$a */
    public class C1420a extends ArrayList<UrlProcessor> {
        public C1420a() {
            add(new C1472a());
        }
    }

    /* renamed from: com.explorestack.iab.vast.VastUrlProcessorRegistry$b */
    public interface C1421b {
        /* renamed from: a */
        void mo4222a(String str);
    }

    /* renamed from: a */
    public static String m6379a(String str, Bundle bundle) {
        if (str == null) {
            return null;
        }
        for (UrlProcessor prepare : f4400a) {
            str = prepare.prepare(str, bundle);
        }
        return str;
    }

    /* renamed from: a */
    public static void m6380a(List<String> list, Bundle bundle, C1421b bVar) {
        if (list != null && !list.isEmpty() && bVar != null) {
            for (String a : list) {
                bVar.mo4222a(m6379a(a, bundle));
            }
        }
    }
}
