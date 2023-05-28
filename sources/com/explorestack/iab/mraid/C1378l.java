package com.explorestack.iab.mraid;

import android.text.TextUtils;

/* renamed from: com.explorestack.iab.mraid.l */
public enum C1378l {
    TopLeft(51),
    TopCenter(49),
    TopRight(53),
    Center(17),
    BottomLeft(83),
    BottomCenter(81),
    BottomRight(85);
    

    /* renamed from: a */
    public final int f4237a;

    private C1378l(int i) {
        this.f4237a = i;
    }

    /* renamed from: a */
    public static C1378l m6194a(String str) {
        return m6195a(str, TopRight);
    }

    /* renamed from: a */
    public static C1378l m6195a(String str, C1378l lVar) {
        if (TextUtils.isEmpty(str)) {
            return lVar;
        }
        if (f4236j || str != null) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1314880604:
                    if (str.equals("top-right")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1012429441:
                    if (str.equals("top-left")) {
                        c = 2;
                        break;
                    }
                    break;
                case -655373719:
                    if (str.equals("bottom-left")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1163912186:
                    if (str.equals("bottom-right")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1288627767:
                    if (str.equals("bottom-center")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1755462605:
                    if (str.equals("top-center")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return Center;
                case 1:
                    return TopRight;
                case 2:
                    return TopLeft;
                case 3:
                    return BottomLeft;
                case 4:
                    return BottomRight;
                case 5:
                    return BottomCenter;
                case 6:
                    return TopCenter;
                default:
                    return lVar;
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public int mo3966a() {
        return this.f4237a;
    }
}
