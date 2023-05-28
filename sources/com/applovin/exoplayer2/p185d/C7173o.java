package com.applovin.exoplayer2.p185d;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.C7476h;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.p185d.C7148e;
import com.applovin.exoplayer2.p185d.C7167m;
import com.applovin.exoplayer2.p186e.p193g.C7253h;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7772y;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.applovin.exoplayer2.d.o */
public final class C7173o implements C7167m {

    /* renamed from: a */
    public static final C7167m.C7170c f15750a = $$Lambda$o$XVYXmOdxA2_o_KZZ58SbICq1sI.INSTANCE;

    /* renamed from: b */
    private final UUID f15751b;

    /* renamed from: c */
    private final MediaDrm f15752c;

    /* renamed from: d */
    private int f15753d = 1;

    /* renamed from: com.applovin.exoplayer2.d.o$a */
    private static class C7174a {
        /* renamed from: a */
        public static boolean m19231a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }
    }

    private C7173o(UUID uuid) throws UnsupportedSchemeException {
        C7717a.m22120b(uuid);
        C7717a.m22119a(!C7476h.f17123b.equals(uuid), (Object) "Use C.CLEARKEY_UUID instead");
        this.f15751b = uuid;
        this.f15752c = new MediaDrm(m19211b(uuid));
        if (C7476h.f17125d.equals(uuid) && m19214e()) {
            m19208a(this.f15752c);
        }
    }

    /* renamed from: a */
    private static C7148e.C7150a m19205a(UUID uuid, List<C7148e.C7150a> list) {
        boolean z;
        if (C7476h.f17125d.equals(uuid)) {
            if (C7728ai.f18249a >= 28 && list.size() > 1) {
                C7148e.C7150a aVar = list.get(0);
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    }
                    C7148e.C7150a aVar2 = list.get(i);
                    byte[] bArr = (byte[]) C7717a.m22120b(aVar2.f15729d);
                    if (!C7728ai.m22218a((Object) aVar2.f15728c, (Object) aVar.f15728c) || !C7728ai.m22218a((Object) aVar2.f15727b, (Object) aVar.f15727b) || !C7253h.m19764a(bArr)) {
                        z = false;
                    } else {
                        i2 += bArr.length;
                        i++;
                    }
                }
                z = false;
                if (z) {
                    byte[] bArr2 = new byte[i2];
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        byte[] bArr3 = (byte[]) C7717a.m22120b(list.get(i4).f15729d);
                        int length = bArr3.length;
                        System.arraycopy(bArr3, 0, bArr2, i3, length);
                        i3 += length;
                    }
                    return aVar.mo53807a(bArr2);
                }
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                C7148e.C7150a aVar3 = list.get(i5);
                int c = C7253h.m19769c((byte[]) C7717a.m22120b(aVar3.f15729d));
                if (C7728ai.f18249a < 23 && c == 0) {
                    return aVar3;
                }
                if (C7728ai.f18249a >= 23 && c == 1) {
                    return aVar3;
                }
            }
        }
        return list.get(0);
    }

    /* renamed from: a */
    public static C7173o m19206a(UUID uuid) throws C7179t {
        try {
            return new C7173o(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new C7179t(1, e);
        } catch (Exception e2) {
            throw new C7179t(2, e2);
        }
    }

    /* renamed from: a */
    private static String m19207a(UUID uuid, String str) {
        return (C7728ai.f18249a >= 26 || !C7476h.f17124c.equals(uuid) || (!"video/mp4".equals(str) && !"audio/mp4".equals(str))) ? str : "cenc";
    }

    /* renamed from: a */
    private static void m19208a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19209a(C7167m.C7169b bVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        bVar.mo53790a(this, bArr, i, i2, bArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        r2 = com.applovin.exoplayer2.p186e.p193g.C7253h.m19767a(r3, r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m19210a(java.util.UUID r2, byte[] r3) {
        /*
            java.util.UUID r0 = com.applovin.exoplayer2.C7476h.f17126e
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x001a
            byte[] r0 = com.applovin.exoplayer2.p186e.p193g.C7253h.m19767a((byte[]) r3, (java.util.UUID) r2)
            if (r0 != 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r3 = r0
        L_0x0010:
            java.util.UUID r0 = com.applovin.exoplayer2.C7476h.f17126e
            byte[] r3 = m19215f(r3)
            byte[] r3 = com.applovin.exoplayer2.p186e.p193g.C7253h.m19765a((java.util.UUID) r0, (byte[]) r3)
        L_0x001a:
            int r0 = com.applovin.exoplayer2.p221l.C7728ai.f18249a
            r1 = 23
            if (r0 >= r1) goto L_0x0028
            java.util.UUID r0 = com.applovin.exoplayer2.C7476h.f17125d
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0062
        L_0x0028:
            java.util.UUID r0 = com.applovin.exoplayer2.C7476h.f17126e
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = com.applovin.exoplayer2.p221l.C7728ai.f18251c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = com.applovin.exoplayer2.p221l.C7728ai.f18252d
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = com.applovin.exoplayer2.p221l.C7728ai.f18252d
            java.lang.String r1 = "AFTS"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = com.applovin.exoplayer2.p221l.C7728ai.f18252d
            java.lang.String r1 = "AFTM"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = com.applovin.exoplayer2.p221l.C7728ai.f18252d
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
        L_0x0062:
            byte[] r2 = com.applovin.exoplayer2.p186e.p193g.C7253h.m19767a((byte[]) r3, (java.util.UUID) r2)
            if (r2 == 0) goto L_0x0069
            return r2
        L_0x0069:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p185d.C7173o.m19210a(java.util.UUID, byte[]):byte[]");
    }

    /* renamed from: b */
    private static UUID m19211b(UUID uuid) {
        return (C7728ai.f18249a >= 27 || !C7476h.f17124c.equals(uuid)) ? uuid : C7476h.f17123b;
    }

    /* renamed from: b */
    private static byte[] m19212b(UUID uuid, byte[] bArr) {
        return C7476h.f17124c.equals(uuid) ? C7130a.m19013a(bArr) : bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ C7167m m19213c(UUID uuid) {
        try {
            return m19206a(uuid);
        } catch (C7179t unused) {
            C7755q.m22363d("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new C7165k();
        }
    }

    /* renamed from: e */
    private static boolean m19214e() {
        return "ASUS_Z00AD".equals(C7728ai.f18252d);
    }

    /* renamed from: f */
    private static byte[] m19215f(byte[] bArr) {
        C7772y yVar = new C7772y(bArr);
        int r = yVar.mo55094r();
        short l = yVar.mo55088l();
        short l2 = yVar.mo55088l();
        if (l == 1 && l2 == 1) {
            String a = yVar.mo55066a((int) yVar.mo55088l(), Charsets.UTF_16LE);
            if (a.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = a.indexOf("</DATA>");
            if (indexOf == -1) {
                C7755q.m22361c("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = a.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + a.substring(indexOf);
            int i = r + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i);
            allocate.putShort((short) l);
            allocate.putShort((short) l2);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(Charsets.UTF_16LE));
            return allocate.array();
        }
        C7755q.m22358b("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    /* renamed from: a */
    public C7167m.C7168a mo53826a(byte[] bArr, List<C7148e.C7150a> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException {
        String str;
        byte[] bArr2;
        C7148e.C7150a aVar = null;
        if (list != null) {
            aVar = m19205a(this.f15751b, list);
            bArr2 = m19210a(this.f15751b, (byte[]) C7717a.m22120b(aVar.f15729d));
            str = m19207a(this.f15751b, aVar.f15728c);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f15752c.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] b = m19212b(this.f15751b, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && aVar != null && !TextUtils.isEmpty(aVar.f15727b)) {
            defaultUrl = aVar.f15727b;
        }
        return new C7167m.C7168a(b, defaultUrl, C7728ai.f18249a >= 23 ? keyRequest.getRequestType() : RecyclerView.UNDEFINED_DURATION);
    }

    /* renamed from: a */
    public String mo53843a(String str) {
        return this.f15752c.getPropertyString(str);
    }

    /* renamed from: a */
    public void mo53827a(C7167m.C7169b bVar) {
        this.f15752c.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener(bVar) {
            public final /* synthetic */ C7167m.C7169b f$1;

            {
                this.f$1 = r2;
            }

            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                C7173o.this.m19209a(this.f$1, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    /* renamed from: a */
    public void mo53828a(byte[] bArr) {
        this.f15752c.closeSession(bArr);
    }

    /* renamed from: a */
    public boolean mo53829a(byte[] bArr, String str) {
        if (C7728ai.f18249a >= 31) {
            return C7174a.m19231a(this.f15752c, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f15751b, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    /* renamed from: a */
    public byte[] mo53830a() throws MediaDrmException {
        return this.f15752c.openSession();
    }

    /* renamed from: a */
    public byte[] mo53831a(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (C7476h.f17124c.equals(this.f15751b)) {
            bArr2 = C7130a.m19015b(bArr2);
        }
        return this.f15752c.provideKeyResponse(bArr, bArr2);
    }

    /* renamed from: b */
    public C7167m.C7171d mo53832b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f15752c.getProvisionRequest();
        return new C7167m.C7171d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    /* renamed from: b */
    public void mo53833b(byte[] bArr) throws DeniedByServerException {
        this.f15752c.provideProvisionResponse(bArr);
    }

    /* renamed from: b */
    public void mo53834b(byte[] bArr, byte[] bArr2) {
        this.f15752c.restoreKeys(bArr, bArr2);
    }

    /* renamed from: c */
    public Map<String, String> mo53835c(byte[] bArr) {
        return this.f15752c.queryKeyStatus(bArr);
    }

    /* renamed from: c */
    public synchronized void mo53836c() {
        int i = this.f15753d - 1;
        this.f15753d = i;
        if (i == 0) {
            this.f15752c.release();
        }
    }

    /* renamed from: d */
    public int mo53837d() {
        return 2;
    }

    /* renamed from: e */
    public C7172n mo53838d(byte[] bArr) throws MediaCryptoException {
        return new C7172n(m19211b(this.f15751b), bArr, C7728ai.f18249a < 21 && C7476h.f17125d.equals(this.f15751b) && "L3".equals(mo53843a("securityLevel")));
    }
}
