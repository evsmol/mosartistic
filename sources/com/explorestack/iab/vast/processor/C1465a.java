package com.explorestack.iab.vast.processor;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.explorestack.iab.utils.Utils;
import com.explorestack.iab.vast.VastLog;
import com.explorestack.iab.vast.tags.LinearCreativeTag;
import com.explorestack.iab.vast.tags.MediaFileTag;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.explorestack.iab.vast.processor.a */
public class C1465a extends C1468b<MediaFileTag> {

    /* renamed from: a */
    public int f4543a;

    /* renamed from: b */
    public boolean f4544b;

    /* renamed from: com.explorestack.iab.vast.processor.a$b */
    public class C1467b implements Comparator<Pair<LinearCreativeTag, MediaFileTag>> {
        private C1467b() {
        }

        /* renamed from: a */
        public int compare(Pair<LinearCreativeTag, MediaFileTag> pair, Pair<LinearCreativeTag, MediaFileTag> pair2) {
            int width = ((MediaFileTag) pair.second).getWidth() * ((MediaFileTag) pair.second).getHeight();
            int width2 = ((MediaFileTag) pair2.second).getWidth() * ((MediaFileTag) pair2.second).getHeight();
            int abs = Math.abs(width - C1465a.this.f4543a);
            int abs2 = Math.abs(width2 - C1465a.this.f4543a);
            VastLog.m6354d("DefaultMediaPicker", "AreaComparator: obj1:" + abs + " obj2:" + abs2);
            if (abs < abs2) {
                return -1;
            }
            return abs > abs2 ? 1 : 0;
        }
    }

    public C1465a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        mo4426a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f4544b = Utils.isLandscapeOrientation(context);
    }

    /* renamed from: a */
    public Pair<LinearCreativeTag, MediaFileTag> mo4425a(List<Pair<LinearCreativeTag, MediaFileTag>> list) {
        if (list == null) {
            return null;
        }
        Collections.sort(list, new C1467b());
        return mo4428b(list);
    }

    /* renamed from: a */
    public final void mo4426a(int i, int i2) {
        this.f4543a = i * i2;
    }

    /* renamed from: a */
    public boolean mo4427a(MediaFileTag mediaFileTag) {
        return mediaFileTag.getType().matches("video/.*(?i)(mp4|3gpp|mp2t|webm|matroska)");
    }

    /* renamed from: b */
    public final Pair<LinearCreativeTag, MediaFileTag> mo4428b(List<Pair<LinearCreativeTag, MediaFileTag>> list) {
        VastLog.m6354d("DefaultMediaPicker", "getBestMatch");
        Pair<LinearCreativeTag, MediaFileTag> pair = null;
        for (Pair<LinearCreativeTag, MediaFileTag> next : list) {
            if (mo4427a((MediaFileTag) next.second)) {
                if (mo4429b((MediaFileTag) next.second)) {
                    return next;
                }
                if (pair == null) {
                    pair = next;
                }
            }
        }
        return pair;
    }

    /* renamed from: b */
    public boolean mo4429b(MediaFileTag mediaFileTag) {
        return (mediaFileTag.getWidth() > mediaFileTag.getHeight()) == this.f4544b;
    }
}
