package com.bykv.p271vk.openvk.component.video.p272a.p276b.p281e;

import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10139i;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.InputStream;
import java.util.List;
import p152ms.p153bd.p154o.Pgl.C5643c;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.e.a */
/* compiled from: AbsResponseWrapper */
public abstract class C10114a {

    /* renamed from: a */
    List<C10139i.C10141b> f24988a;

    /* renamed from: b */
    C10119e f24989b;

    /* renamed from: a */
    public abstract int mo62743a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo62745a(int i) {
        switch (i) {
            case 200:
                return "OK";
            case 201:
                return "Created";
            case LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE:
                return "Accepted";
            case LOSS_REASON_CREATIVE_FILTERED_SIZE_NOT_ALLOWED_VALUE:
                return "Non-Authoritative";
            case 204:
                return "No Content";
            case LOSS_REASON_CREATIVE_FILTERED_ADVERTISER_EXCLUSIONS_VALUE:
                return "Reset Content";
            case LOSS_REASON_CREATIVE_FILTERED_NOT_SECURE_VALUE:
                return "Partial Content";
            default:
                switch (i) {
                    case C5643c.COLLECT_MODE_FINANCE:
                        return "Multiple Choices";
                    case 301:
                        return "Moved Permanently";
                    case IronSourceConstants.OFFERWALL_AVAILABLE:
                        return "Temporary Redirect";
                    case 303:
                        return "See Other";
                    case 304:
                        return "Not Modified";
                    case IronSourceConstants.OFFERWALL_OPENED:
                        return "Use Proxy";
                    default:
                        switch (i) {
                            case 400:
                                return "Bad Request";
                            case TTAdConstant.MATE_IS_NULL_CODE /*401*/:
                                return "Unauthorized";
                            case TTAdConstant.AD_ID_IS_NULL_CODE /*402*/:
                                return "Payment Required";
                            case TTAdConstant.DEEPLINK_UNAVAILABLE_CODE /*403*/:
                                return "Forbidden";
                            case TTAdConstant.DEEPLINK_FALLBACK_CODE /*404*/:
                                return "Not Found";
                            case TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE /*405*/:
                                return "Method Not Allowed";
                            case TTAdConstant.LANDING_PAGE_TYPE_CODE /*406*/:
                                return "Not Acceptable";
                            case TTAdConstant.DOWNLOAD_APP_INFO_CODE /*407*/:
                                return "Proxy Authentication Required";
                            case TTAdConstant.DOWNLOAD_URL_CODE /*408*/:
                                return "Request Time-Out";
                            case TTAdConstant.IMAGE_LIST_CODE /*409*/:
                                return "Conflict";
                            case TTAdConstant.IMAGE_LIST_SIZE_CODE /*410*/:
                                return "Gone";
                            case TTAdConstant.IMAGE_CODE /*411*/:
                                return "Length Required";
                            case TTAdConstant.IMAGE_URL_CODE /*412*/:
                                return "Precondition Failed";
                            case TTAdConstant.VIDEO_INFO_CODE /*413*/:
                                return "Request Entity Too Large";
                            case TTAdConstant.VIDEO_URL_CODE /*414*/:
                                return "Request-URI Too Large";
                            case TTAdConstant.VIDEO_COVER_URL_CODE /*415*/:
                                return "Unsupported Media Type";
                            default:
                                switch (i) {
                                    case 500:
                                        return "Internal Server Error";
                                    case 501:
                                        return "Not Implemented";
                                    case 502:
                                        return "Bad Gateway";
                                    case 503:
                                        return "Service Unavailable";
                                    case 504:
                                        return "Gateway Timeout";
                                    case 505:
                                        return "HTTP Version Not Supported";
                                    default:
                                        return "";
                                }
                        }
                }
        }
    }

    /* renamed from: a */
    public abstract String mo62746a(String str, String str2);

    /* renamed from: b */
    public abstract boolean mo62747b();

    /* renamed from: c */
    public abstract List<C10139i.C10141b> mo62748c();

    /* renamed from: d */
    public abstract InputStream mo62749d();

    /* renamed from: e */
    public abstract String mo62750e();

    /* renamed from: f */
    public abstract String mo62751f();

    /* renamed from: g */
    public C10119e mo62752g() {
        return this.f24989b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10139i.C10141b mo62744a(String str) {
        List<C10139i.C10141b> list;
        if (!(str == null || (list = this.f24988a) == null || list.size() <= 0)) {
            for (C10139i.C10141b next : this.f24988a) {
                if (str.equals(next.f25059a)) {
                    return next;
                }
            }
        }
        return null;
    }
}
