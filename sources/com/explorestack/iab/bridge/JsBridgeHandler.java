package com.explorestack.iab.bridge;

import android.text.TextUtils;
import com.explorestack.iab.mraid.C1361g;
import com.explorestack.iab.mraid.C1364i;
import com.explorestack.iab.mraid.MraidLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JsBridgeHandler {

    /* renamed from: a */
    public static final String f4059a;

    /* renamed from: b */
    public static final List<C1337a> f4060b = new ArrayList();

    /* renamed from: c */
    public static final /* synthetic */ boolean f4061c;

    static {
        Class<JsBridgeHandler> cls = JsBridgeHandler.class;
        f4061c = !cls.desiredAssertionStatus();
        f4059a = cls.getSimpleName();
    }

    /* renamed from: a */
    public static C1337a m5940a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (C1337a next : f4060b) {
            if (!f4061c && str == null) {
                throw new AssertionError();
            } else if (next.mo3739a(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m5941a() {
        StringBuilder sb = new StringBuilder();
        for (C1337a b : f4060b) {
            sb.append("<script type='application/javascript'>");
            sb.append(b.mo3740b());
            sb.append("</script>");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m5942a(C1364i iVar, String str) {
        Map<String, String> a;
        String str2 = f4059a;
        MraidLog.m5985d(str2, "handleJsCommand " + str);
        try {
            C1337a a2 = m5940a(str);
            if (a2 != null && (a = C1361g.m6113a(str, a2.mo3737a())) != null) {
                String str3 = a.get("command");
                if (str3 == null) {
                    MraidLog.m5984b(str2, "handleJsCommand: not found");
                } else {
                    a2.mo3738a(iVar, str3, a);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean addBridge(C1337a aVar) {
        List<C1337a> list = f4060b;
        return !list.contains(aVar) && list.add(aVar);
    }

    /* renamed from: b */
    public static boolean m5943b(String str) {
        return m5940a(str) != null;
    }
}
