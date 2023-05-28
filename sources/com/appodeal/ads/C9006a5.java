package com.appodeal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

/* renamed from: com.appodeal.ads.a5 */
public final class C9006a5 {

    /* renamed from: a */
    public static final String[] f22787a = {"appodeal", AppodealNetworks.BIDMACHINE, "mraid", "vast", "nast"};

    /* renamed from: b */
    public static boolean f22788b = false;

    /* renamed from: com.appodeal.ads.a5$a */
    public static final class C9007a implements Runnable {

        /* renamed from: a */
        public final Context f22789a;

        public C9007a(Context context) {
            this.f22789a = context;
        }

        public final void run() {
            boolean z;
            String[] strArr = new String[0];
            try {
                strArr = this.f22789a.getAssets().list("apd_adapters");
            } catch (IOException e) {
                e.printStackTrace();
            }
            HashSet hashSet = null;
            if (strArr == null || strArr.length == 0) {
                hashSet = new HashSet();
                hashSet.addAll(Arrays.asList(C9006a5.f22787a));
            } else {
                String[] strArr2 = C9006a5.f22787a;
                for (int i = 0; i < 5; i++) {
                    String str = strArr2[i];
                    String format = String.format("%s.apdnetwork", new Object[]{str});
                    int length = strArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = false;
                            break;
                        } else if (Objects.equals(strArr[i2], format)) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z) {
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.add(str.toUpperCase());
                    }
                }
            }
            if (hashSet != null) {
                Log.e("Appodeal", String.format(" \n\nATTENTION:\n\tAdapters are not registered in you app: \n\t\t%s.\n\tPlease add the dependencies for them to improve your fill rates and increase revenue.\n\tIf you are sure that you do not need these adapters, skip this warning.\n ", new Object[]{TextUtils.join(", ", hashSet)}));
            }
        }
    }

    /* renamed from: a */
    public static void m27121a(Context context) {
        if (!f22788b) {
            f22788b = true;
            new Thread(new C9007a(context)).start();
        }
    }
}
