package com.yandex.metrica.impl.p082ob;

import android.text.Layout;
import android.text.TextUtils;
import android.widget.TextView;

/* renamed from: com.yandex.metrica.impl.ob.Fl */
public class C2033Fl {

    /* renamed from: a */
    private final C3710yl f5422a;

    public C2033Fl(C3710yl ylVar) {
        this.f5422a = ylVar;
    }

    /* renamed from: a */
    public int mo15791a(TextView textView) {
        int i = 0;
        try {
            if (TextUtils.isEmpty(textView.getText()) || textView.getVisibility() != 0) {
                return 0;
            }
            String charSequence = textView.getText().toString();
            Layout layout = textView.getLayout();
            int length = charSequence.length();
            if (layout != null) {
                try {
                    int lineCount = textView.getLineCount() - 1;
                    TextUtils.TruncateAt ellipsize = textView.getEllipsize();
                    if (ellipsize != null && lineCount >= 0 && (lineCount == 0 || ellipsize == TextUtils.TruncateAt.END)) {
                        i = 1;
                    }
                    if (i != 0) {
                        return length - layout.getEllipsisCount(lineCount);
                    }
                } catch (Throwable th) {
                    th = th;
                    i = length;
                    this.f5422a.mo18437a("ui_parsing_visibility", th);
                    return i;
                }
            }
            return length;
        } catch (Throwable th2) {
            th = th2;
            this.f5422a.mo18437a("ui_parsing_visibility", th);
            return i;
        }
    }
}
