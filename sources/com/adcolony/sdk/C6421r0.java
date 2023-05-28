package com.adcolony.sdk;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: com.adcolony.sdk.r0 */
class C6421r0 {

    /* renamed from: a */
    private static int f13785a;

    /* renamed from: b */
    private static HashMap<String, Integer> f13786b = new HashMap<>();

    /* renamed from: c */
    private static HashMap<String, Integer> f13787c = new HashMap<>();

    /* renamed from: a */
    static boolean m15698a(int i, Bundle bundle) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i != 0) {
            if (i != 1 || bundle == null) {
                return false;
            }
            String string = bundle.getString("zone_id");
            if (f13786b.get(string) == null) {
                f13786b.put(string, Integer.valueOf(currentTimeMillis));
            }
            if (f13787c.get(string) == null) {
                f13787c.put(string, 0);
            }
            if (currentTimeMillis - f13786b.get(string).intValue() > 1) {
                f13787c.put(string, 1);
                f13786b.put(string, Integer.valueOf(currentTimeMillis));
                return false;
            }
            int intValue = f13787c.get(string).intValue() + 1;
            f13787c.put(string, Integer.valueOf(intValue));
            return intValue > 3;
        } else if (currentTimeMillis - f13785a < 5) {
            return true;
        } else {
            f13785a = currentTimeMillis;
            return false;
        }
    }
}
