package com.appodeal.advertising;

import java.util.regex.Pattern;

/* renamed from: com.appodeal.advertising.a */
public final class C9741a {

    /* renamed from: a */
    public static final Pattern f24692a = Pattern.compile("[a-f0-9]{8}(?:-[a-f0-9]{4}){4}[a-f0-9]{8}");

    /* renamed from: a */
    public static final boolean m28560a(String str) {
        return f24692a.matcher(str).matches();
    }
}
