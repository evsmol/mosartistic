package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10350g;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.d */
/* compiled from: InteractViewFactory */
public class C10398d {
    /* renamed from: a */
    public static C10396b m30315a(Context context, DynamicBaseWidget dynamicBaseWidget, C10350g gVar, int i, int i2) {
        if (context == null || dynamicBaseWidget == null || gVar == null) {
            return null;
        }
        String D = gVar.mo63505D();
        char c = 65535;
        int hashCode = D.hashCode();
        if (hashCode != 50) {
            switch (hashCode) {
                case 53:
                    if (D.equals("5")) {
                        c = 7;
                        break;
                    }
                    break;
                case 54:
                    if (D.equals("6")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55:
                    if (D.equals("7")) {
                        c = 9;
                        break;
                    }
                    break;
                case 56:
                    if (D.equals("8")) {
                        c = 5;
                        break;
                    }
                    break;
                case 57:
                    if (D.equals("9")) {
                        c = 0;
                        break;
                    }
                    break;
                default:
                    switch (hashCode) {
                        case 1568:
                            if (D.equals("11")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1569:
                            if (D.equals("12")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 1570:
                            if (D.equals("13")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1571:
                            if (D.equals("14")) {
                                c = 10;
                                break;
                            }
                            break;
                        default:
                            switch (hashCode) {
                                case 1573:
                                    if (D.equals("16")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 1574:
                                    if (D.equals("17")) {
                                        c = 11;
                                        break;
                                    }
                                    break;
                                case 1575:
                                    if (D.equals("18")) {
                                        c = 12;
                                        break;
                                    }
                                    break;
                            }
                    }
            }
        } else if (D.equals("2")) {
            c = 8;
        }
        switch (c) {
            case 0:
            case 1:
                return new C10402h(context, dynamicBaseWidget, gVar, D, i);
            case 2:
                return new C10405j(context, dynamicBaseWidget, gVar);
            case 3:
            case 4:
                return new C10401g(context, dynamicBaseWidget, gVar);
            case 5:
                return new C10400f(context, dynamicBaseWidget, gVar);
            case 6:
            case 7:
                return new C10404i(context, dynamicBaseWidget, gVar);
            case 8:
                return new C10391a(context, dynamicBaseWidget, gVar);
            case 9:
            case 10:
                return new C10399e(context, dynamicBaseWidget, gVar);
            case 11:
            case 12:
                return new C10406k(context, dynamicBaseWidget, gVar, D, i2);
            default:
                return null;
        }
    }
}
