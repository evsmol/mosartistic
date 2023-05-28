package com.explorestack.iab.vast.processor;

import android.util.Pair;
import com.explorestack.iab.vast.tags.LinearCreativeTag;
import com.explorestack.iab.vast.tags.MediaFileTag;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.explorestack.iab.vast.processor.b */
public abstract class C1468b<T extends MediaFileTag> implements Serializable {
    /* renamed from: a */
    public abstract Pair<LinearCreativeTag, T> mo4425a(List<Pair<LinearCreativeTag, T>> list);
}
