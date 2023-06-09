package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p150io.bidmachine.utils.IabUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfim {
    public final int zza;
    public final int zzb;
    public final boolean zzc;

    public zzfim(int i, int i2, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = z;
    }

    static List zza(JsonReader jsonReader) throws IllegalStateException, IOException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (IabUtils.KEY_WIDTH.equals(nextName)) {
                    i = jsonReader.nextInt();
                } else if (IabUtils.KEY_HEIGHT.equals(nextName)) {
                    i2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new zzfim(i, i2, z));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
