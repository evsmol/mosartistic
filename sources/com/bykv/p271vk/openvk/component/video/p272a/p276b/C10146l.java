package com.bykv.p271vk.openvk.component.video.p272a.p276b;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.l */
/* compiled from: Urls */
public class C10146l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Set<String> f25068a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Set<String> f25069b = new HashSet();

    /* renamed from: c */
    private final ArrayList<C10147a> f25070c;

    /* renamed from: d */
    private final int f25071d;

    /* renamed from: e */
    private int f25072e = -1;

    /* renamed from: f */
    private int f25073f;

    /* renamed from: g */
    private final int f25074g;

    C10146l(List<String> list) {
        int i;
        if (!list.isEmpty()) {
            this.f25071d = list.size();
            this.f25070c = new ArrayList<>(this.f25071d);
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (String next : list) {
                C10147a aVar = new C10147a(next);
                if (f25068a.contains(next)) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(aVar);
                } else if (f25069b.contains(next)) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(aVar);
                } else {
                    this.f25070c.add(aVar);
                }
            }
            if (arrayList != null) {
                this.f25070c.addAll(arrayList);
            }
            if (arrayList2 != null) {
                this.f25070c.addAll(arrayList2);
            }
            Integer num = C10112e.f24985i;
            if (num == null || num.intValue() <= 0) {
                i = this.f25071d >= 2 ? 1 : 2;
            } else {
                i = num.intValue();
            }
            this.f25074g = i;
            return;
        }
        throw new IllegalArgumentException("urls can't be empty");
    }

    C10146l(String str) {
        ArrayList<C10147a> arrayList = new ArrayList<>(1);
        this.f25070c = arrayList;
        arrayList.add(new C10147a(str));
        this.f25071d = 1;
        this.f25074g = 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo62793a() {
        return this.f25073f < this.f25074g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10147a mo62794b() {
        if (mo62793a()) {
            int i = this.f25072e + 1;
            if (i >= this.f25071d - 1) {
                this.f25072e = -1;
                this.f25073f++;
            } else {
                this.f25072e = i;
            }
            C10147a aVar = this.f25070c.get(i);
            aVar.f25076b = (this.f25073f * this.f25071d) + this.f25072e;
            return aVar;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.l$a */
    /* compiled from: Urls */
    public class C10147a {

        /* renamed from: a */
        final String f25075a;

        /* renamed from: b */
        int f25076b;

        C10147a(String str) {
            this.f25075a = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo62795a() {
            C10146l.f25068a.add(this.f25075a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo62796b() {
            C10146l.f25069b.add(this.f25075a);
        }

        public String toString() {
            return this.f25075a;
        }
    }
}
