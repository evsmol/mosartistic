package com.bytedance.sdk.openadsdk.p037d;

import com.bytedance.sdk.component.p313d.C10559h;
import com.bytedance.sdk.component.p313d.C10569r;
import com.bytedance.sdk.component.p313d.p316c.C10499a;
import com.bytedance.sdk.component.p313d.p316c.C10523c;
import com.bytedance.sdk.component.utils.C10638l;

/* renamed from: com.bytedance.sdk.openadsdk.d.b */
/* compiled from: StepTrackImpl */
public class C0753b implements C10569r {

    /* renamed from: a */
    private static int f2897a;

    /* renamed from: b */
    private long f2898b = 0;

    /* renamed from: c */
    private long f2899c;

    /* renamed from: d */
    private boolean f2900d;

    /* renamed from: e */
    private String f2901e;

    public C0753b() {
        f2897a++;
        this.f2901e = "image_request_" + f2897a;
    }

    /* renamed from: a */
    public void mo2508a(String str, C10559h hVar) {
        if (!this.f2900d) {
            C10638l.m31235b("ImageLoaderStep", "start " + this.f2901e + " request:" + hVar.mo64072a() + ", width:" + hVar.mo64079b() + ",height:" + hVar.mo64081c());
            this.f2900d = true;
        }
        this.f2898b = System.currentTimeMillis();
        C10638l.m31235b("ImageLoaderStep", this.f2901e + " start:" + m3840c(str, hVar));
    }

    /* renamed from: b */
    public void mo2509b(String str, C10559h hVar) {
        long currentTimeMillis = System.currentTimeMillis() - this.f2898b;
        this.f2899c += currentTimeMillis;
        C10638l.m31235b("ImageLoaderStep", this.f2901e + " end:" + m3840c(str, hVar) + ",cost：" + currentTimeMillis + " ms" + "， total：" + this.f2899c + "\r\n");
    }

    /* renamed from: c */
    private String m3840c(String str, C10559h hVar) {
        C10499a o;
        String str2;
        if (str == null) {
            return str;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1867169789:
                if (str.equals("success")) {
                    c = 8;
                    break;
                }
                break;
            case -1584526165:
                if (str.equals("raw_cache")) {
                    c = 4;
                    break;
                }
                break;
            case -1442758754:
                if (str.equals("image_type")) {
                    c = 10;
                    break;
                }
                break;
            case -1428113824:
                if (str.equals("disk_cache")) {
                    c = 5;
                    break;
                }
                break;
            case -1335717394:
                if (str.equals("decode")) {
                    c = 1;
                    break;
                }
                break;
            case -1281977283:
                if (str.equals("failed")) {
                    c = 9;
                    break;
                }
                break;
            case -1076854124:
                if (str.equals("check_duplicate")) {
                    c = 2;
                    break;
                }
                break;
            case 1017400004:
                if (str.equals("memory_cache")) {
                    c = 3;
                    break;
                }
                break;
            case 1478448621:
                if (str.equals("net_request")) {
                    c = 7;
                    break;
                }
                break;
            case 1718821013:
                if (str.equals("generate_key")) {
                    c = 6;
                    break;
                }
                break;
            case 2067979407:
                if (str.equals("cache_policy")) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "cache policy";
            case 1:
                return "decode";
            case 2:
                return "duplicate request";
            case 3:
                return "memory cache";
            case 4:
                return "raw cache";
            case 5:
                return "disk cache";
            case 6:
                return "generate key:" + hVar.mo64083e();
            case 7:
                return "net request";
            case 8:
                return "success";
            case 9:
                if (!(hVar instanceof C10523c) || (o = ((C10523c) hVar).mo64093o()) == null) {
                    return "fail";
                }
                Throwable c2 = o.mo64019c();
                StringBuilder sb = new StringBuilder();
                sb.append("fail：code:");
                sb.append(o.mo64017a());
                sb.append(", msg:");
                sb.append(o.mo64018b());
                sb.append(", exception:");
                if (c2 != null) {
                    str2 = c2.getMessage();
                } else {
                    str2 = "null \r\n";
                }
                sb.append(str2);
                return sb.toString();
            case 10:
                return "image type：";
            default:
                return str;
        }
    }
}
