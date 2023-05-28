package com.bytedance.sdk.component.p293a;

import android.net.Uri;
import com.bytedance.sdk.component.p293a.C10233k;
import com.bytedance.sdk.component.p293a.C10250v;
import com.bytedance.sdk.component.p293a.C10255w;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.component.a.u */
/* compiled from: PermissionChecker */
class C10249u {

    /* renamed from: a */
    private final Set<String> f25310a;

    /* renamed from: b */
    private final Set<String> f25311b;

    /* renamed from: c */
    private final C10255w f25312c = C10245r.f25298a;

    /* renamed from: d */
    private final C10250v f25313d;

    /* renamed from: e */
    private C10233k.C10236b f25314e;

    C10249u(C10250v vVar, Set<String> set, Set<String> set2) {
        this.f25313d = vVar;
        if (set == null || set.isEmpty()) {
            this.f25310a = new LinkedHashSet();
        } else {
            this.f25310a = new LinkedHashSet(set);
        }
        if (set2 == null || set2.isEmpty()) {
            this.f25311b = new LinkedHashSet();
        } else {
            this.f25311b = new LinkedHashSet(set2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C10257x mo63077a(boolean z, String str, C10219b bVar) throws C10250v.C10252a {
        C10257x xVar;
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (host == null) {
            return null;
        }
        C10257x xVar2 = this.f25311b.contains(bVar.mo63024a()) ? C10257x.PUBLIC : null;
        Iterator<String> it = this.f25310a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (parse.getHost().equals(next)) {
                break;
            }
            if (host.endsWith("." + next)) {
                break;
            }
        }
        xVar2 = C10257x.PRIVATE;
        if (xVar2 == null && this.f25314e != null && this.f25314e.mo63054a(str)) {
            if (this.f25314e.mo63055a(str, bVar.mo63024a())) {
                return null;
            }
            xVar2 = C10257x.PRIVATE;
        }
        if (z) {
            xVar = mo63076a(str, bVar);
        } else {
            xVar = mo63080b(str, bVar);
        }
        if (xVar != null) {
            return xVar;
        }
        return xVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C10257x mo63076a(String str, C10219b bVar) throws C10250v.C10252a {
        return m29430a(str, bVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C10257x mo63080b(String str, C10219b bVar) {
        return m29430a(str, bVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63078a(C10233k.C10236b bVar) {
        this.f25314e = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63079a(C10255w.C10256a aVar) {
        C10255w wVar = this.f25312c;
        if (wVar != null) {
            wVar.mo63085a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo63081b(C10255w.C10256a aVar) {
        C10255w wVar = this.f25312c;
        if (wVar != null) {
            wVar.mo63086b(aVar);
        }
    }

    /* renamed from: a */
    private C10257x m29430a(String str, C10219b bVar, boolean z) {
        C10250v vVar;
        if (!z || (vVar = this.f25313d) == null) {
            return null;
        }
        C10250v.C10254c a = vVar.mo63082a(str, this.f25310a);
        if (a.f25328c.contains(bVar.mo63024a())) {
            return null;
        }
        if (a.f25327b.contains(bVar.mo63024a())) {
            return C10257x.PRIVATE;
        }
        if (a.f25326a.compareTo(bVar.mo63026b()) < 0) {
            return null;
        }
        return a.f25326a;
    }
}
