package com.yandex.metrica.identifiers;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.identifiers.impl.C1823h;
import java.util.Map;

public class AdsIdentifiersProvider {
    private static final C1823h retriever = new C1823h((Map) null, 1);

    public static Bundle requestIdentifiers(Context context, Bundle bundle) {
        return retriever.mo15399a(context, bundle.getString("com.yandex.metrica.identifiers.extra.PROVIDER"));
    }
}
