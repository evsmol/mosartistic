package p152ms.p153bd.p154o.Pgl;

import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import kotlin.KotlinVersion;
import org.json.JSONArray;
import p152ms.p153bd.p154o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.m */
final class C5663m extends pblb.pgla {
    C5663m() {
    }

    /* renamed from: a */
    public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
        JSONArray jSONArray = new JSONArray();
        try {
            DhcpInfo dhcpInfo = ((WifiManager) pgla.m14675a().mo42236b().getApplicationContext().getSystemService((String) pblk.m14617a(16777217, 0, 0, "7913e4", new byte[]{49, 50, 68, 78}))).getDhcpInfo();
            StringBuilder sb = new StringBuilder();
            sb.append(dhcpInfo.dns1 & KotlinVersion.MAX_COMPONENT_VALUE);
            sb.append((String) pblk.m14617a(16777217, 0, 0, "59aff9", new byte[]{106}));
            sb.append((dhcpInfo.dns1 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            sb.append((String) pblk.m14617a(16777217, 0, 0, "6718cf", new byte[]{105}));
            sb.append((dhcpInfo.dns1 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            sb.append((String) pblk.m14617a(16777217, 0, 0, "0b3535", new byte[]{111}));
            sb.append((dhcpInfo.dns1 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            jSONArray.put(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dhcpInfo.dns2 & KotlinVersion.MAX_COMPONENT_VALUE);
            sb2.append((String) pblk.m14617a(16777217, 0, 0, "d1ed5a", new byte[]{59}));
            sb2.append((dhcpInfo.dns2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            sb2.append((String) pblk.m14617a(16777217, 0, 0, "06013b", new byte[]{111}));
            sb2.append((dhcpInfo.dns2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            sb2.append((String) pblk.m14617a(16777217, 0, 0, "915671", new byte[]{102}));
            sb2.append((dhcpInfo.dns2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            jSONArray.put(sb2.toString());
        } catch (Throwable unused) {
            String str2 = (String) pblk.m14617a(16777217, 0, 0, "2e0a34", new byte[]{46, 110, 75, 42, 8, 47});
        }
        return jSONArray.toString();
    }
}
