package com.bytedance.sdk.openadsdk.p332a;

import com.bytedance.sdk.component.utils.C10638l;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.bytedance.sdk.openadsdk.a.b */
/* compiled from: TotalCountLruDiskFile */
public class C10682b extends C10679a {

    /* renamed from: a */
    private int f26705a = 15;

    /* renamed from: b */
    private int f26706b = 3;

    /* renamed from: c */
    private volatile boolean f26707c;

    public C10682b(int i, int i2) {
        if (i > 0) {
            this.f26705a = i;
            this.f26706b = i2;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }

    public C10682b(int i, int i2, boolean z) {
        if (i > 0) {
            this.f26705a = i;
            this.f26706b = i2;
            this.f26707c = z;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo64589a(long j, int i) {
        return i <= this.f26705a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo64590a(File file, long j, int i) {
        return i <= this.f26706b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2134a(List<File> list) {
        if (this.f26707c) {
            m31423d(list);
            this.f26707c = false;
            return;
        }
        m31422c(list);
    }

    /* renamed from: c */
    private void m31422c(List<File> list) {
        long b = mo64591b(list);
        int size = list.size();
        if (!mo64589a(b, size)) {
            for (File next : list) {
                long length = next.length();
                if (next.delete()) {
                    size--;
                    b -= length;
                    C10638l.m31238c("TotalCountLruDiskFile", "Cache file " + next + " is deleted because it exceeds cache limit");
                } else {
                    C10638l.m31238c("TotalCountLruDiskFile", "Error deleting file " + next + " for trimming cache");
                }
                if (mo64590a(next, b, size)) {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    private void m31423d(List<File> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    long b = mo64591b(list);
                    int size = list.size();
                    boolean a = mo64589a(b, size);
                    if (a) {
                        C10638l.m31238c("splashLoadAd", "Do not meet the delete condition, do not perform a delete operation(true)" + a);
                        return;
                    }
                    TreeMap treeMap = new TreeMap();
                    for (File next : list) {
                        treeMap.put(Long.valueOf(next.lastModified()), next);
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (entry != null) {
                            if (!a) {
                                C10638l.m31242e("splashLoadAd", "LRUDeleteFile deleting fileTime " + ((Long) entry.getKey()).longValue());
                                File file = (File) entry.getValue();
                                long length = file.length();
                                if (file.delete()) {
                                    size--;
                                    b -= length;
                                    C10638l.m31238c("splashLoadAd", "Delete, the current total number of a Cache file：" + size);
                                } else {
                                    C10638l.m31242e("splashLoadAd", "Error deleting file " + file + " for trimming cache");
                                }
                                if (mo64590a(file, b, size)) {
                                    C10638l.m31238c("splashLoadAd", "Stop deleting, the current total number totalCount：" + size + " Maximum storage limit number maxCount " + this.f26705a + " Minimum number " + this.f26706b);
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
