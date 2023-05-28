package com.applovin.exoplayer2.p206h;

import com.applovin.exoplayer2.p186e.C7262h;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7340l;
import com.applovin.exoplayer2.p186e.C7352u;
import com.applovin.exoplayer2.p186e.p192f.C7227d;
import com.applovin.exoplayer2.p221l.C7717a;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.h.c */
public final class C7488c implements C7516s {

    /* renamed from: a */
    private final C7340l f17178a;

    /* renamed from: b */
    private C7262h f17179b;

    /* renamed from: c */
    private C7279i f17180c;

    public C7488c(C7340l lVar) {
        this.f17178a = lVar;
    }

    /* renamed from: a */
    public int mo54487a(C7352u uVar) throws IOException {
        return ((C7262h) C7717a.m22120b(this.f17179b)).mo53876a((C7279i) C7717a.m22120b(this.f17180c), uVar);
    }

    /* renamed from: a */
    public void mo54488a() {
        C7262h hVar = this.f17179b;
        if (hVar != null) {
            hVar.mo53880c();
            this.f17179b = null;
        }
        this.f17180c = null;
    }

    /* renamed from: a */
    public void mo54489a(long j, long j2) {
        ((C7262h) C7717a.m22120b(this.f17179b)).mo53877a(j, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r0.mo53892c() != r11) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006d, code lost:
        if (r0.mo53892c() != r11) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0070, code lost:
        r1 = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo54490a(com.applovin.exoplayer2.p220k.C7668g r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, com.applovin.exoplayer2.p186e.C7329j r15) throws java.io.IOException {
        /*
            r7 = this;
            com.applovin.exoplayer2.e.e r6 = new com.applovin.exoplayer2.e.e
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f17180c = r6
            com.applovin.exoplayer2.e.h r8 = r7.f17179b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            com.applovin.exoplayer2.e.l r8 = r7.f17178a
            com.applovin.exoplayer2.e.h[] r8 = r8.mo53858a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0020
            r8 = r8[r13]
            r7.f17179b = r8
            goto L_0x0080
        L_0x0020:
            int r10 = r8.length
            r0 = 0
        L_0x0022:
            if (r0 >= r10) goto L_0x007c
            r1 = r8[r0]
            boolean r2 = r1.mo53879a((com.applovin.exoplayer2.p186e.C7279i) r6)     // Catch:{ EOFException -> 0x0062, all -> 0x004d }
            if (r2 == 0) goto L_0x0040
            r7.f17179b = r1     // Catch:{ EOFException -> 0x0062, all -> 0x004d }
            if (r1 != 0) goto L_0x0038
            long r0 = r6.mo53892c()
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x0039
        L_0x0038:
            r13 = 1
        L_0x0039:
            com.applovin.exoplayer2.p221l.C7717a.m22121b((boolean) r13)
            r6.mo53899a()
            goto L_0x007c
        L_0x0040:
            com.applovin.exoplayer2.e.h r1 = r7.f17179b
            if (r1 != 0) goto L_0x0072
            long r1 = r6.mo53892c()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0070
            goto L_0x0072
        L_0x004d:
            r8 = move-exception
            com.applovin.exoplayer2.e.h r9 = r7.f17179b
            if (r9 != 0) goto L_0x005a
            long r9 = r6.mo53892c()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x005b
        L_0x005a:
            r13 = 1
        L_0x005b:
            com.applovin.exoplayer2.p221l.C7717a.m22121b((boolean) r13)
            r6.mo53899a()
            throw r8
        L_0x0062:
            com.applovin.exoplayer2.e.h r1 = r7.f17179b
            if (r1 != 0) goto L_0x0072
            long r1 = r6.mo53892c()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r1 = 0
            goto L_0x0073
        L_0x0072:
            r1 = 1
        L_0x0073:
            com.applovin.exoplayer2.p221l.C7717a.m22121b((boolean) r1)
            r6.mo53899a()
            int r0 = r0 + 1
            goto L_0x0022
        L_0x007c:
            com.applovin.exoplayer2.e.h r10 = r7.f17179b
            if (r10 == 0) goto L_0x0086
        L_0x0080:
            com.applovin.exoplayer2.e.h r8 = r7.f17179b
            r8.mo53878a((com.applovin.exoplayer2.p186e.C7329j) r15)
            return
        L_0x0086:
            com.applovin.exoplayer2.h.ae r10 = new com.applovin.exoplayer2.h.ae
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = com.applovin.exoplayer2.p221l.C7728ai.m22240b((java.lang.Object[]) r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p206h.C7488c.mo54490a(com.applovin.exoplayer2.k.g, android.net.Uri, java.util.Map, long, long, com.applovin.exoplayer2.e.j):void");
    }

    /* renamed from: b */
    public void mo54491b() {
        C7262h hVar = this.f17179b;
        if (hVar instanceof C7227d) {
            ((C7227d) hVar).mo53947a();
        }
    }

    /* renamed from: c */
    public long mo54492c() {
        C7279i iVar = this.f17180c;
        if (iVar != null) {
            return iVar.mo53892c();
        }
        return -1;
    }
}
