package com.yandex.metrica.impl.p082ob;

import android.os.Build;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.DigitalClock;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextClock;
import android.widget.TextView;
import com.yandex.metrica.impl.p082ob.C3454rl;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Mk */
public class C2320Mk implements C2874cl {

    /* renamed from: a */
    private final Set<Class> f6232a;

    public C2320Mk() {
        HashSet hashSet = new HashSet();
        this.f6232a = hashSet;
        hashSet.add(EditText.class);
        hashSet.add(Chronometer.class);
        hashSet.add(DigitalClock.class);
        if (Build.VERSION.SDK_INT >= 17) {
            hashSet.add(TextClock.class);
        }
        hashSet.add(RadioButton.class);
        hashSet.add(CheckBox.class);
    }

    /* renamed from: a */
    public boolean mo15595a(Object obj) {
        TextView textView = (TextView) obj;
        for (Class isInstance : this.f6232a) {
            if (isInstance.isInstance(textView)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C3454rl.C3456b mo15594a() {
        return C3454rl.C3456b.IRRELEVANT_CLASS;
    }
}
