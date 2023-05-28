package com.explorestack.iab.vast.processor;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.explorestack.iab.vast.TrackingEvent;
import com.explorestack.iab.vast.VastLog;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.tags.AdContentTag;
import com.explorestack.iab.vast.tags.AdTag;
import com.explorestack.iab.vast.tags.C1473a;
import com.explorestack.iab.vast.tags.CompanionAdsCreativeTag;
import com.explorestack.iab.vast.tags.CompanionTag;
import com.explorestack.iab.vast.tags.CreativeContentTag;
import com.explorestack.iab.vast.tags.CreativeTag;
import com.explorestack.iab.vast.tags.InLineAdTag;
import com.explorestack.iab.vast.tags.LinearCreativeTag;
import com.explorestack.iab.vast.tags.MediaFileTag;
import com.explorestack.iab.vast.tags.VastTag;
import com.explorestack.iab.vast.tags.WrapperAdTag;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;
import p152ms.p153bd.p154o.Pgl.C5643c;

/* renamed from: com.explorestack.iab.vast.processor.c */
public class C1469c {

    /* renamed from: a */
    public final VastRequest f4546a;

    /* renamed from: b */
    public final int f4547b;

    /* renamed from: c */
    public C1468b<MediaFileTag> f4548c;

    /* renamed from: d */
    public final Stack<AdContentTag> f4549d;

    /* renamed from: e */
    public int f4550e;

    public C1469c(VastRequest vastRequest, C1468b<MediaFileTag> bVar) {
        this(vastRequest, bVar, 5);
    }

    public C1469c(VastRequest vastRequest, C1468b<MediaFileTag> bVar, int i) {
        this.f4549d = new Stack<>();
        this.f4550e = 0;
        this.f4546a = vastRequest;
        this.f4548c = bVar;
        this.f4547b = i;
    }

    /* renamed from: a */
    public final Pair<LinearCreativeTag, MediaFileTag> mo4432a(InLineAdTag inLineAdTag) {
        LinearCreativeTag linearCreativeTag;
        List<MediaFileTag> mediaFileTagList;
        ArrayList arrayList = new ArrayList();
        for (CreativeTag next : inLineAdTag.getCreativeTagList()) {
            if (next != null) {
                CreativeContentTag creativeContentTag = next.getCreativeContentTag();
                if ((creativeContentTag instanceof LinearCreativeTag) && (mediaFileTagList = linearCreativeTag.getMediaFileTagList()) != null && !mediaFileTagList.isEmpty()) {
                    for (MediaFileTag pair : mediaFileTagList) {
                        arrayList.add(new Pair((linearCreativeTag = (LinearCreativeTag) creativeContentTag), pair));
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        C1468b<MediaFileTag> bVar = this.f4548c;
        Pair<LinearCreativeTag, MediaFileTag> a = bVar != null ? bVar.mo4425a(arrayList) : null;
        return a != null ? a : new Pair<>((Object) null, (Object) null);
    }

    /* renamed from: a */
    public final C1470d mo4433a(AdContentTag adContentTag, VastTag vastTag, C1471e eVar) {
        C1470d dVar = new C1470d();
        int i = 0;
        while (true) {
            int i2 = 303;
            if (i < vastTag.getAdTagList().size()) {
                AdTag adTag = vastTag.getAdTagList().get(i);
                if (!(adTag == null || adTag.getAdContentTag() == null)) {
                    AdContentTag adContentTag2 = adTag.getAdContentTag();
                    if (adContentTag2 instanceof InLineAdTag) {
                        C1470d b = mo4441b((InLineAdTag) adContentTag2);
                        if (b.mo4451d()) {
                            return b;
                        }
                        mo4438a(b.mo4444a());
                        if (adContentTag == null) {
                            dVar.mo4445a(b.mo4449b());
                        } else if (b.mo4452e()) {
                            dVar.mo4447a(adContentTag, b.mo4449b());
                        }
                    } else if ((adContentTag2 instanceof WrapperAdTag) && eVar.mo4455c()) {
                        C1470d a = mo4434a((WrapperAdTag) adContentTag2);
                        if (a.mo4451d()) {
                            return a;
                        }
                        mo4438a(a.mo4444a());
                        if (adContentTag != null) {
                            if (a.mo4452e()) {
                                i2 = a.mo4449b();
                            }
                            dVar.mo4447a(adContentTag, i2);
                        } else {
                            dVar.mo4445a(303);
                        }
                        if (i == 0 && !eVar.mo4454b()) {
                            return dVar;
                        }
                    }
                    mo4442b(adContentTag2);
                }
                i++;
            } else {
                if (dVar.mo4449b() == -1 && adContentTag != null) {
                    dVar.mo4447a(adContentTag, 303);
                }
                return dVar;
            }
        }
    }

    /* renamed from: a */
    public C1470d mo4434a(WrapperAdTag wrapperAdTag) {
        C1470d dVar = new C1470d();
        if (mo4443b()) {
            VastLog.m6351a("VastProcessor", String.format(Locale.ENGLISH, "VAST wrapping exceeded max limit of %d", new Object[]{Integer.valueOf(this.f4547b)}));
            dVar.mo4447a(wrapperAdTag, IronSourceConstants.OFFERWALL_AVAILABLE);
            return dVar;
        }
        this.f4550e++;
        this.f4549d.push(wrapperAdTag);
        if (TextUtils.isEmpty(wrapperAdTag.getVastAdTagUri())) {
            VastLog.m6351a("VastProcessor", "VASTAdTagURI is null or empty");
            dVar.mo4447a(wrapperAdTag, 301);
            return dVar;
        }
        C1471e eVar = new C1471e(wrapperAdTag);
        InputStream inputStream = null;
        try {
            URLConnection openConnection = new URL(wrapperAdTag.getVastAdTagUri()).openConnection();
            int responseCode = ((HttpURLConnection) openConnection).getResponseCode();
            if (responseCode == 200) {
                inputStream = openConnection.getInputStream();
                VastTag a = C1473a.m6612a(inputStream);
                if (a == null) {
                    VastLog.m6351a("VastProcessor", "Invalid Vast");
                    dVar.mo4447a(wrapperAdTag, 101);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e) {
                            VastLog.m6353a("VastProcessor", (Throwable) e);
                        }
                    }
                    return dVar;
                } else if (!a.hasAd()) {
                    VastLog.m6351a("VastProcessor", "Vast has no ad");
                    dVar.mo4447a(wrapperAdTag, 303);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e2) {
                            VastLog.m6353a("VastProcessor", (Throwable) e2);
                        }
                    }
                    return dVar;
                } else if (a.getAdTagList().size() <= 1 || eVar.mo4453a()) {
                    C1470d a2 = mo4433a(wrapperAdTag, a, eVar);
                    a2.mo4448a(false);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e3) {
                            VastLog.m6353a("VastProcessor", (Throwable) e3);
                        }
                    }
                    return a2;
                } else {
                    dVar.mo4447a(wrapperAdTag, C5643c.COLLECT_MODE_FINANCE);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e4) {
                            VastLog.m6353a("VastProcessor", (Throwable) e4);
                        }
                    }
                    return dVar;
                }
            } else if (responseCode != 204) {
                dVar.mo4447a(wrapperAdTag, 301);
                return dVar;
            } else {
                VastLog.m6351a("VastProcessor", "Wrapper response code: 204");
                dVar.mo4447a(wrapperAdTag, 303);
                return dVar;
            }
        } catch (MalformedURLException e5) {
            VastLog.m6353a("VastProcessor", (Throwable) e5);
            dVar.mo4447a(wrapperAdTag, 301);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e6) {
                    VastLog.m6353a("VastProcessor", (Throwable) e6);
                }
            }
            return dVar;
        } catch (SocketTimeoutException | UnknownHostException | SSLException | ConnectTimeoutException e7) {
            VastLog.m6353a("VastProcessor", e7);
            dVar.mo4447a(wrapperAdTag, 301);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e8) {
                    VastLog.m6353a("VastProcessor", (Throwable) e8);
                }
            }
            return dVar;
        } catch (IOException e9) {
            VastLog.m6353a("VastProcessor", (Throwable) e9);
            dVar.mo4447a(wrapperAdTag, 301);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e10) {
                    VastLog.m6353a("VastProcessor", (Throwable) e10);
                }
            }
            return dVar;
        } catch (Exception e11) {
            VastLog.m6353a("VastProcessor", (Throwable) e11);
            dVar.mo4447a(wrapperAdTag, 100);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e12) {
                    VastLog.m6353a("VastProcessor", (Throwable) e12);
                }
            }
            return dVar;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e13) {
                    VastLog.m6353a("VastProcessor", (Throwable) e13);
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public C1470d mo4435a(String str) {
        int i;
        VastLog.m6354d("VastProcessor", "process");
        C1470d dVar = new C1470d();
        try {
            VastTag a = C1473a.m6613a(str);
            if (a != null && a.hasAd()) {
                return mo4433a((AdContentTag) null, a, new C1471e());
            }
            i = 101;
            dVar.mo4445a(i);
            return dVar;
        } catch (Exception unused) {
            i = 100;
        }
    }

    /* renamed from: a */
    public final ArrayList<String> mo4436a() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f4549d.empty()) {
            return arrayList;
        }
        Iterator it = this.f4549d.iterator();
        while (it.hasNext()) {
            AdContentTag adContentTag = (AdContentTag) it.next();
            if (!(adContentTag == null || adContentTag.getErrorUrlList() == null)) {
                arrayList.addAll(adContentTag.getErrorUrlList());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final ArrayList<CompanionTag> mo4437a(AdContentTag adContentTag) {
        ArrayList<CompanionTag> arrayList = new ArrayList<>();
        for (CreativeTag next : adContentTag.getCreativeTagList()) {
            if (next != null) {
                CreativeContentTag creativeContentTag = next.getCreativeContentTag();
                if (creativeContentTag instanceof CompanionAdsCreativeTag) {
                    CompanionAdsCreativeTag companionAdsCreativeTag = (CompanionAdsCreativeTag) creativeContentTag;
                    if (companionAdsCreativeTag.getCompanionTagList() != null) {
                        arrayList.addAll(companionAdsCreativeTag.getCompanionTagList());
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo4438a(List<String> list) {
        this.f4546a.fireErrorUrls(list, (Bundle) null);
    }

    /* renamed from: a */
    public final void mo4439a(List<String> list, CompanionAdsCreativeTag companionAdsCreativeTag) {
        List<String> companionClickTrackingList;
        for (CompanionTag next : companionAdsCreativeTag.getCompanionTagList()) {
            if (!next.hasCreative() && (companionClickTrackingList = next.getCompanionClickTrackingList()) != null) {
                list.addAll(companionClickTrackingList);
            }
        }
    }

    /* renamed from: a */
    public final void mo4440a(Map<TrackingEvent, List<String>> map, Map<TrackingEvent, List<String>> map2) {
        if (map2 != null && !map2.isEmpty()) {
            for (Map.Entry next : map2.entrySet()) {
                TrackingEvent trackingEvent = (TrackingEvent) next.getKey();
                List list = map.get(trackingEvent);
                if (list == null) {
                    list = new ArrayList();
                    map.put(trackingEvent, list);
                }
                list.addAll((Collection) next.getValue());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r10v4, types: [com.explorestack.iab.vast.tags.ExtensionTag] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.explorestack.iab.vast.processor.C1470d mo4441b(com.explorestack.iab.vast.tags.InLineAdTag r15) {
        /*
            r14 = this;
            java.util.Stack<com.explorestack.iab.vast.tags.AdContentTag> r0 = r14.f4549d
            r0.push(r15)
            com.explorestack.iab.vast.processor.d r0 = new com.explorestack.iab.vast.processor.d
            r0.<init>()
            android.util.Pair r1 = r14.mo4432a((com.explorestack.iab.vast.tags.InLineAdTag) r15)
            if (r1 != 0) goto L_0x0017
            r1 = 101(0x65, float:1.42E-43)
        L_0x0012:
            r0.mo4447a(r15, r1)
            goto L_0x0112
        L_0x0017:
            java.lang.Object r2 = r1.first
            if (r2 != 0) goto L_0x0022
            java.lang.Object r2 = r1.second
            if (r2 != 0) goto L_0x0022
            r1 = 403(0x193, float:5.65E-43)
            goto L_0x0012
        L_0x0022:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.EnumMap r5 = new java.util.EnumMap
            java.lang.Class<com.explorestack.iab.vast.TrackingEvent> r6 = com.explorestack.iab.vast.TrackingEvent.class
            r5.<init>(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
            java.util.Stack<com.explorestack.iab.vast.tags.AdContentTag> r8 = r14.f4549d
            boolean r8 = r8.empty()
            if (r8 != 0) goto L_0x00de
            java.util.Stack<com.explorestack.iab.vast.tags.AdContentTag> r8 = r14.f4549d
            java.util.Iterator r8 = r8.iterator()
        L_0x004c:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00de
            java.lang.Object r9 = r8.next()
            com.explorestack.iab.vast.tags.AdContentTag r9 = (com.explorestack.iab.vast.tags.AdContentTag) r9
            if (r9 != 0) goto L_0x005b
            goto L_0x004c
        L_0x005b:
            java.util.List r10 = r9.getImpressionUrlList()
            if (r10 == 0) goto L_0x0068
            java.util.List r10 = r9.getImpressionUrlList()
            r2.addAll(r10)
        L_0x0068:
            java.util.List r10 = r9.getCreativeTagList()
            if (r10 == 0) goto L_0x00b4
            java.util.List r10 = r9.getCreativeTagList()
            java.util.Iterator r10 = r10.iterator()
        L_0x0076:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00b4
            java.lang.Object r11 = r10.next()
            com.explorestack.iab.vast.tags.CreativeTag r11 = (com.explorestack.iab.vast.tags.CreativeTag) r11
            if (r11 != 0) goto L_0x0085
            goto L_0x0076
        L_0x0085:
            com.explorestack.iab.vast.tags.CreativeContentTag r11 = r11.getCreativeContentTag()
            boolean r12 = r11 instanceof com.explorestack.iab.vast.tags.LinearCreativeTag
            if (r12 == 0) goto L_0x00aa
            com.explorestack.iab.vast.tags.LinearCreativeTag r11 = (com.explorestack.iab.vast.tags.LinearCreativeTag) r11
            com.explorestack.iab.vast.tags.VideoClicksTag r12 = r11.getVideoClicksTag()
            if (r12 == 0) goto L_0x00a2
            java.util.List r13 = r12.getClickTrackingUrlList()
            if (r13 == 0) goto L_0x00a2
            java.util.List r12 = r12.getClickTrackingUrlList()
            r3.addAll(r12)
        L_0x00a2:
            java.util.Map r11 = r11.getTrackingEventListMap()
            r14.mo4440a((java.util.Map<com.explorestack.iab.vast.TrackingEvent, java.util.List<java.lang.String>>) r5, (java.util.Map<com.explorestack.iab.vast.TrackingEvent, java.util.List<java.lang.String>>) r11)
            goto L_0x0076
        L_0x00aa:
            boolean r12 = r11 instanceof com.explorestack.iab.vast.tags.CompanionAdsCreativeTag
            if (r12 == 0) goto L_0x0076
            com.explorestack.iab.vast.tags.CompanionAdsCreativeTag r11 = (com.explorestack.iab.vast.tags.CompanionAdsCreativeTag) r11
            r14.mo4439a((java.util.List<java.lang.String>) r4, (com.explorestack.iab.vast.tags.CompanionAdsCreativeTag) r11)
            goto L_0x0076
        L_0x00b4:
            java.util.List r9 = r9.getExtensionTagList()
            if (r9 == 0) goto L_0x004c
            java.util.Iterator r9 = r9.iterator()
        L_0x00be:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x004c
            java.lang.Object r10 = r9.next()
            com.explorestack.iab.vast.tags.ExtensionTag r10 = (com.explorestack.iab.vast.tags.ExtensionTag) r10
            boolean r11 = r10 instanceof com.explorestack.iab.vast.tags.AppodealExtensionTag
            if (r11 == 0) goto L_0x00d4
            if (r7 != 0) goto L_0x00be
            r7 = r10
            com.explorestack.iab.vast.tags.AppodealExtensionTag r7 = (com.explorestack.iab.vast.tags.AppodealExtensionTag) r7
            goto L_0x00be
        L_0x00d4:
            boolean r11 = r10 instanceof com.explorestack.iab.vast.tags.AdVerificationsExtensionTag
            if (r11 == 0) goto L_0x00be
            com.explorestack.iab.vast.tags.AdVerificationsExtensionTag r10 = (com.explorestack.iab.vast.tags.AdVerificationsExtensionTag) r10
            r6.add(r10)
            goto L_0x00be
        L_0x00de:
            com.explorestack.iab.vast.processor.VastAd r8 = new com.explorestack.iab.vast.processor.VastAd
            java.lang.Object r9 = r1.first
            com.explorestack.iab.vast.tags.LinearCreativeTag r9 = (com.explorestack.iab.vast.tags.LinearCreativeTag) r9
            java.lang.Object r1 = r1.second
            com.explorestack.iab.vast.tags.MediaFileTag r1 = (com.explorestack.iab.vast.tags.MediaFileTag) r1
            r8.<init>(r9, r1)
            r8.mo4403d(r2)
            java.util.ArrayList r1 = r14.mo4436a()
            r8.mo4402c(r1)
            r8.mo4399a((java.util.ArrayList<java.lang.String>) r3)
            r8.setWrapperCompanionClickTrackingUrlList(r4)
            r8.mo4400a((java.util.EnumMap<com.explorestack.iab.vast.TrackingEvent, java.util.List<java.lang.String>>) r5)
            java.util.ArrayList r15 = r14.mo4437a((com.explorestack.iab.vast.tags.AdContentTag) r15)
            r8.mo4401b(r15)
            r8.mo4398a((com.explorestack.iab.vast.tags.AppodealExtensionTag) r7)
            r8.setAdVerificationsExtensionList(r6)
            r15 = 0
            r0.mo4445a((int) r15)
            r0.mo4446a((com.explorestack.iab.vast.processor.VastAd) r8)
        L_0x0112:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.vast.processor.C1469c.mo4441b(com.explorestack.iab.vast.tags.InLineAdTag):com.explorestack.iab.vast.processor.d");
    }

    /* renamed from: b */
    public void mo4442b(AdContentTag adContentTag) {
        if (!this.f4549d.empty()) {
            int search = this.f4549d.search(adContentTag);
            for (int i = 0; i < search; i++) {
                this.f4549d.pop();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo4443b() {
        return this.f4550e >= this.f4547b;
    }
}
