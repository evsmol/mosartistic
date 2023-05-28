package com.ironsource.mediationsdk.utils;

import android.text.TextUtils;
import com.ironsource.environment.C4377a;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;

/* renamed from: com.ironsource.mediationsdk.utils.g */
public final class C4719g {

    /* renamed from: d */
    private static final C4719g f11801d = new C4719g();

    /* renamed from: a */
    private String f11802a = "";

    /* renamed from: b */
    private String f11803b = "";

    /* renamed from: c */
    private String f11804c = "";

    /* renamed from: a */
    public static C4719g m13802a() {
        return f11801d;
    }

    /* renamed from: b */
    public final String mo34183b() {
        if (TextUtils.isEmpty(this.f11802a)) {
            this.f11802a = "C38FB23A402222A0C17D34A92F971D1F";
        }
        return this.f11802a;
    }

    /* renamed from: c */
    public final synchronized String mo34184c() {
        if (TextUtils.isEmpty(this.f11803b)) {
            StringBuilder sb = new StringBuilder();
            Random random = new Random();
            for (int i = 0; i < 32; i++) {
                sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".charAt(random.nextInt(93)));
            }
            this.f11803b = sb.toString();
        }
        return this.f11803b;
    }

    /* renamed from: d */
    public final String mo34185d() {
        if (TextUtils.isEmpty(this.f11804c)) {
            try {
                this.f11804c = C4377a.C43781.m12453a(mo34184c(), "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB");
            } catch (Exception e) {
                String str = "Session key encryption exception: " + e.getLocalizedMessage();
                IronLog.INTERNAL.error(str);
                throw new JSONException(str);
            }
        }
        return this.f11804c;
    }
}
