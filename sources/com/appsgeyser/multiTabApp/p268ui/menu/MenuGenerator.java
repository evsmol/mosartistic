package com.appsgeyser.multiTabApp.p268ui.menu;

import android.content.Context;
import android.view.Menu;

/* renamed from: com.appsgeyser.multiTabApp.ui.menu.MenuGenerator */
public class MenuGenerator {
    public static Menu newEmptyMenuInstance(Context context) {
        try {
            return (Menu) Class.forName("com.android.internal.view.menu.MenuBuilder").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
