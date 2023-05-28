package com.apm.insight.runtime;

import android.content.Context;
import com.apm.insight.C6553b;
import com.apm.insight.p178l.C6675i;
import com.apm.insight.p178l.C6678l;
import com.apm.insight.p178l.C6685o;
import com.apm.insight.p178l.C6689r;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.banners.BannerAdRequest;
import com.appnext.base.p264b.C8850d;
import com.appodeal.ads.modules.common.internal.Constants;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.apm.insight.runtime.h */
public class C6747h {

    /* renamed from: a */
    private Context f14496a;

    /* renamed from: b */
    private HashMap<String, Long> f14497b = null;

    /* renamed from: c */
    private int f14498c = 50;

    /* renamed from: d */
    private int f14499d = 100;

    public C6747h(Context context) {
        this.f14496a = context;
        this.f14497b = m16952c();
        m16951b();
    }

    /* renamed from: a */
    private void m16950a(File file) {
        File g = C6685o.m16607g(this.f14496a);
        file.renameTo(new File(g, String.valueOf(System.currentTimeMillis())));
        String[] list = g.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            new File(g, list[0]).delete();
        }
    }

    /* renamed from: b */
    private void m16951b() {
        this.f14498c = C6718a.m16789a(this.f14498c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f14499d = C6718a.m16789a(this.f14499d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    /* renamed from: c */
    private HashMap<String, Long> m16952c() {
        File h = C6685o.m16610h(this.f14496a);
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.put(C8850d.f22432fl, Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray b = C6675i.m16535b(h.getAbsolutePath());
            if (C6678l.m16558a(b)) {
                return hashMap;
            }
            Long decode = Long.decode(b.optString(0, (String) null));
            if (System.currentTimeMillis() - decode.longValue() > Constants.MILLIS_IN_DAY) {
                m16950a(h);
                return hashMap;
            }
            hashMap.put(C8850d.f22432fl, decode);
            for (int i = 1; i < b.length(); i++) {
                String[] split = b.optString(i, "").split(" ");
                if (split.length == 2) {
                    hashMap.put(split[0], Long.decode(split[1]));
                }
            }
            return hashMap;
        } catch (IOException unused) {
        } catch (Throwable th) {
            C6553b.m16004a().mo52019a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    public void mo52304a() {
        HashMap<String, Long> hashMap = this.f14497b;
        Long remove = hashMap.remove(C8850d.f22432fl);
        if (remove == null) {
            C6553b.m16004a().mo52019a("NPTH_CATCH", (Throwable) new RuntimeException("err times, no time"));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(remove);
        sb.append(10);
        for (Map.Entry next : hashMap.entrySet()) {
            sb.append((String) next.getKey());
            sb.append(' ');
            sb.append(next.getValue());
            sb.append(10);
        }
        try {
            C6675i.m16524a(C6685o.m16610h(this.f14496a), sb.toString(), false);
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public boolean mo52305a(String str) {
        if (str == null) {
            str = RewardedVideo.VIDEO_MODE_DEFAULT;
        }
        return C6689r.m16635a(this.f14497b, str, 1L).longValue() < ((long) this.f14498c) && C6689r.m16635a(this.f14497b, BannerAdRequest.TYPE_ALL, 1L).longValue() < ((long) this.f14499d);
    }
}
