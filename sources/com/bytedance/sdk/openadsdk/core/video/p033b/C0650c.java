package com.bytedance.sdk.openadsdk.core.video.p033b;

import com.bytedance.sdk.component.utils.C10627f;
import com.bytedance.sdk.openadsdk.p332a.C10682b;
import java.io.File;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.b.c */
/* compiled from: TotalCountLruDiskDir */
public class C0650c extends C10682b {
    public C0650c(int i, int i2) {
        super(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2134a(List<File> list) {
        int size = list.size();
        if (!mo64589a(0, size)) {
            for (File next : list) {
                C10627f.m31210c(next);
                size--;
                if (mo64590a(next, 0, size)) {
                    return;
                }
            }
        }
    }
}
