package com.yandex.metrica.impl.p082ob;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.p082ob.C2895dg;
import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.fg */
class C2967fg implements Callable<C2895dg> {

    /* renamed from: a */
    final /* synthetic */ C3002gg f7863a;

    C2967fg(C3002gg ggVar) {
        this.f7863a = ggVar;
    }

    public Object call() throws Exception {
        Uri parse = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f7863a.f7920a.getContentResolver();
        C3002gg ggVar = this.f7863a;
        Cursor unused = ggVar.f7921b = contentResolver.query(parse, (String[]) null, (String) null, new String[]{ggVar.f7920a.getPackageName()}, (String) null);
        if (this.f7863a.f7921b != null && this.f7863a.f7921b.moveToFirst()) {
            String string = this.f7863a.f7921b.getString(0);
            if (!TextUtils.isEmpty(string)) {
                return new C2895dg(string, this.f7863a.f7921b.getLong(1), this.f7863a.f7921b.getLong(2), C2895dg.C2896a.HMS);
            }
        }
        return null;
    }
}
