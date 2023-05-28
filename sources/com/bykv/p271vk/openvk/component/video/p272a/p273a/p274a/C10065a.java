package com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a;

import android.os.Build;
import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.api.p286a.C10183a;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bykv.p271vk.openvk.component.video.p272a.p273a.C10064a;
import com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b;
import com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10073c;
import com.bykv.p271vk.openvk.component.video.p272a.p285e.C10180c;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bykv.vk.openvk.component.video.a.a.a.a */
/* compiled from: MediaCacheDirImpl */
public class C10065a implements C10183a {

    /* renamed from: a */
    private String f24845a = "video_feed";

    /* renamed from: b */
    private String f24846b = "video_reward_full";

    /* renamed from: c */
    private String f24847c = "video_brand";

    /* renamed from: d */
    private String f24848d = "video_splash";

    /* renamed from: e */
    private String f24849e = "video_default";

    /* renamed from: f */
    private String f24850f = null;

    /* renamed from: g */
    private String f24851g = null;

    /* renamed from: h */
    private String f24852h = null;

    /* renamed from: i */
    private String f24853i = null;

    /* renamed from: j */
    private String f24854j = null;

    /* renamed from: k */
    private String f24855k = null;

    /* renamed from: a */
    public void mo62646a(String str) {
        this.f24850f = str;
    }

    /* renamed from: a */
    public String mo62645a() {
        if (this.f24851g == null) {
            this.f24851g = this.f24850f + File.separator + this.f24845a;
            File file = new File(this.f24851g);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f24851g;
    }

    /* renamed from: b */
    public String mo62649b() {
        if (this.f24852h == null) {
            this.f24852h = this.f24850f + File.separator + this.f24846b;
            File file = new File(this.f24852h);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f24852h;
    }

    /* renamed from: c */
    public void mo62650c() {
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 23) {
            for (C10064a next : C10064a.f24840a.values()) {
                if (!(next == null || next.mo62641a() == null)) {
                    C10188c a = next.mo62641a();
                    hashSet.add(C10180c.m29077b(a.mo62936a(), a.mo62962k()).getAbsolutePath());
                }
            }
            for (C10071b next2 : C10073c.f24876a.values()) {
                if (!(next2 == null || next2.mo62660a() == null)) {
                    C10188c a2 = next2.mo62660a();
                    hashSet.add(C10180c.m29077b(a2.mo62936a(), a2.mo62962k()).getAbsolutePath());
                }
            }
        }
        m28641a(new File(mo62645a()), 30, hashSet);
        m28641a(new File(mo62649b()), 20, hashSet);
    }

    /* renamed from: a */
    public boolean mo62647a(C10188c cVar) {
        if (TextUtils.isEmpty(cVar.mo62936a()) || TextUtils.isEmpty(cVar.mo62962k())) {
            return false;
        }
        return new File(cVar.mo62936a(), cVar.mo62962k()).exists();
    }

    /* renamed from: b */
    public long mo62648b(C10188c cVar) {
        if (TextUtils.isEmpty(cVar.mo62936a()) || TextUtils.isEmpty(cVar.mo62962k())) {
            return 0;
        }
        return C10180c.m29075a(cVar.mo62936a(), cVar.mo62962k());
    }

    /* renamed from: a */
    private static void m28641a(File file, int i, Set<String> set) {
        if (i >= 0 && file.exists() && !file.isFile()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > i) {
                    List asList = Arrays.asList(listFiles);
                    Collections.sort(asList, new Comparator<File>() {
                        /* renamed from: a */
                        public int compare(File file, File file2) {
                            int i = ((file2.lastModified() - file.lastModified()) > 0 ? 1 : ((file2.lastModified() - file.lastModified()) == 0 ? 0 : -1));
                            if (i == 0) {
                                return 0;
                            }
                            return i < 0 ? -1 : 1;
                        }
                    });
                    while (i < asList.size()) {
                        File file2 = (File) asList.get(i);
                        if (set != null && !set.contains(file2.getAbsolutePath())) {
                            ((File) asList.get(i)).delete();
                        }
                        i++;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
