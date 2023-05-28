package com.applovin.impl.p233b;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8533h;
import com.applovin.impl.sdk.utils.C8622s;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.b.m */
public class C8046m {

    /* renamed from: a */
    private static final DateFormat f19485a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b */
    private static final Random f19486b = new Random(System.currentTimeMillis());

    /* renamed from: a */
    public static Uri m23947a(String str, long j, Uri uri, C8038f fVar, C8490n nVar) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String num = Integer.toString(fVar.mo55902a());
                String replace = str.replace("[ERRORCODE]", num).replace("[REASON]", num);
                if (j >= 0) {
                    replace = replace.replace("[CONTENTPLAYHEAD]", m23950a(j));
                }
                if (uri != null) {
                    replace = replace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(replace.replace("[CACHEBUSTING]", m23949a()).replace("[TIMESTAMP]", m23962b()));
            } catch (Throwable th) {
                nVar.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D = nVar.mo57320D();
                    D.mo57819b("VastUtils", "Unable to replace macros in URL string " + str, th);
                }
                return null;
            }
        } else {
            nVar.mo57320D();
            if (C8626v.m26252a()) {
                nVar.mo57320D().mo57822e("VastUtils", "Unable to replace macros in invalid URL string.");
            }
            return null;
        }
    }

    /* renamed from: a */
    public static C8038f m23948a(C8029a aVar) {
        if (m23963b(aVar) || m23965c(aVar)) {
            return null;
        }
        return C8038f.GENERAL_WRAPPER_ERROR;
    }

    /* renamed from: a */
    private static String m23949a() {
        return Integer.toString(f19486b.nextInt(89999999) + 10000000);
    }

    /* renamed from: a */
    private static String m23950a(long j) {
        if (j <= 0) {
            return "00:00:00.000";
        }
        long hours = TimeUnit.SECONDS.toHours(j);
        long seconds = j % TimeUnit.MINUTES.toSeconds(1);
        return String.format(Locale.US, "%02d:%02d:%02d.000", new Object[]{Long.valueOf(hours), Long.valueOf(TimeUnit.SECONDS.toMinutes(j) % TimeUnit.MINUTES.toSeconds(1)), Long.valueOf(seconds)});
    }

    /* renamed from: a */
    public static String m23951a(C8037e eVar) {
        C8622s c;
        if (eVar != null) {
            List<C8622s> b = eVar.mo55895b();
            int size = eVar.mo55895b().size();
            if (size <= 0 || (c = b.get(size - 1).mo57798c("VASTAdTagURI")) == null) {
                return null;
            }
            return c.mo57799c();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    /* renamed from: a */
    public static String m23952a(C8622s sVar, String str, String str2) {
        C8622s b = sVar.mo57796b(str);
        if (b != null) {
            String c = b.mo57799c();
            if (StringUtils.isValidString(c)) {
                return c;
            }
        }
        return str2;
    }

    /* renamed from: a */
    private static Set<C8044k> m23953a(C8037e eVar, C8490n nVar) {
        if (eVar == null) {
            return null;
        }
        List<C8622s> b = eVar.mo55895b();
        Set<C8044k> hashSet = new HashSet<>(b.size());
        for (C8622s next : b) {
            C8622s c = next.mo57798c("Wrapper");
            if (c == null) {
                c = next.mo57798c("InLine");
            }
            hashSet = m23954a(hashSet, c != null ? c.mo57795a(LogConstants.EVENT_ERROR) : next.mo57795a(LogConstants.EVENT_ERROR), eVar, nVar);
        }
        nVar.mo57320D();
        if (C8626v.m26252a()) {
            C8626v D = nVar.mo57320D();
            D.mo57818b("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    /* renamed from: a */
    private static Set<C8044k> m23954a(Set<C8044k> set, List<C8622s> list, C8037e eVar, C8490n nVar) {
        if (list != null) {
            for (C8622s a : list) {
                C8044k a2 = C8044k.m23943a(a, eVar, nVar);
                if (a2 != null) {
                    set.add(a2);
                }
            }
        }
        return set;
    }

    /* renamed from: a */
    public static void m23955a(C8037e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C8038f fVar, int i, C8490n nVar) {
        if (nVar != null) {
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
            }
            m23959a(m23953a(eVar, nVar), fVar, nVar);
            return;
        }
        throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
    }

    /* renamed from: a */
    public static void m23956a(C8622s sVar, Map<String, Set<C8044k>> map, C8037e eVar, C8490n nVar) {
        List<C8622s> a;
        if (nVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        } else if (sVar == null) {
            nVar.mo57320D();
            if (C8626v.m26252a()) {
                nVar.mo57320D().mo57822e("VastUtils", "Unable to render event trackers; null node provided");
            }
        } else if (map == null) {
            nVar.mo57320D();
            if (C8626v.m26252a()) {
                nVar.mo57320D().mo57822e("VastUtils", "Unable to render event trackers; null event trackers provided");
            }
        } else {
            C8622s b = sVar.mo57796b("TrackingEvents");
            if (b != null && (a = b.mo57795a("Tracking")) != null) {
                for (C8622s next : a) {
                    String str = next.mo57797b().get("event");
                    if (StringUtils.isValidString(str)) {
                        C8044k a2 = C8044k.m23943a(next, eVar, nVar);
                        if (a2 != null) {
                            Set set = map.get(str);
                            if (set != null) {
                                set.add(a2);
                            } else {
                                HashSet hashSet = new HashSet();
                                hashSet.add(a2);
                                map.put(str, hashSet);
                            }
                        }
                    } else {
                        nVar.mo57320D();
                        if (C8626v.m26252a()) {
                            C8626v D = nVar.mo57320D();
                            D.mo57822e("VastUtils", "Could not find event for tracking node = " + next);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m23957a(List<C8622s> list, Set<C8044k> set, C8037e eVar, C8490n nVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        } else if (list == null) {
            nVar.mo57320D();
            if (C8626v.m26252a()) {
                nVar.mo57320D().mo57822e("VastUtils", "Unable to render trackers; null nodes provided");
            }
        } else if (set == null) {
            nVar.mo57320D();
            if (C8626v.m26252a()) {
                nVar.mo57320D().mo57822e("VastUtils", "Unable to render trackers; null trackers provided");
            }
        } else {
            for (C8622s a : list) {
                C8044k a2 = C8044k.m23943a(a, eVar, nVar);
                if (a2 != null) {
                    set.add(a2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m23958a(Set<C8044k> set, long j, Uri uri, C8038f fVar, C8490n nVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
        } else if (set != null && !set.isEmpty()) {
            for (C8044k b : set) {
                Uri a = m23947a(b.mo55928b(), j, uri, fVar, nVar);
                if (a != null) {
                    nVar.mo57339X().mo57569a(C8533h.m25871o().mo57602c(a.toString()).mo57597a(false).mo57598a(), false);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m23959a(Set<C8044k> set, C8038f fVar, C8490n nVar) {
        m23958a(set, -1, (Uri) null, fVar, nVar);
    }

    /* renamed from: a */
    public static void m23960a(Set<C8044k> set, C8490n nVar) {
        m23958a(set, -1, (Uri) null, C8038f.UNSPECIFIED, nVar);
    }

    /* renamed from: a */
    public static boolean m23961a(C8622s sVar) {
        if (sVar != null) {
            return sVar.mo57798c("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    /* renamed from: b */
    private static String m23962b() {
        f19485a.setTimeZone(TimeZone.getDefault());
        return f19485a.format(new Date());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r1 = (r1 = r1.mo55829aM()).mo55933a();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m23963b(com.applovin.impl.p233b.C8029a r1) {
        /*
            r0 = 0
            if (r1 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.applovin.impl.b.n r1 = r1.mo55829aM()
            if (r1 == 0) goto L_0x0017
            java.util.List r1 = r1.mo55933a()
            if (r1 == 0) goto L_0x0017
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0017
            r0 = 1
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.p233b.C8046m.m23963b(com.applovin.impl.b.a):boolean");
    }

    /* renamed from: b */
    public static boolean m23964b(C8622s sVar) {
        if (sVar != null) {
            return sVar.mo57798c("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    /* renamed from: c */
    public static boolean m23965c(C8029a aVar) {
        C8036d aO;
        C8041i b;
        if (aVar == null || (aO = aVar.mo55831aO()) == null || (b = aO.mo55888b()) == null) {
            return false;
        }
        return b.mo55918b() != null || StringUtils.isValidString(b.mo55919c());
    }
}
