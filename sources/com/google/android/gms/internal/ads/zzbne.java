package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzbne extends zzash implements zzbnf {
    public zzbne() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbnf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof zzbnf ? (zzbnf) queryLocalInterface : new zzbnd(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String readString = parcel.readString();
                zzasi.zzc(parcel);
                String zzj = zzj(readString);
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzasi.zzc(parcel);
                zzbml zzg = zzg(readString2);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzg);
                return true;
            case 3:
                List zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(zzk);
                return true;
            case 4:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 5:
                String readString3 = parcel.readString();
                zzasi.zzc(parcel);
                zzn(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                zzdq zze = zze();
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zze);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper zzh = zzh();
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzh);
                return true;
            case 10:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasi.zzc(parcel);
                boolean zzr = zzr(asInterface);
                parcel2.writeNoException();
                zzasi.zzd(parcel2, zzr);
                return true;
            case 11:
                parcel2.writeNoException();
                zzasi.zzg(parcel2, (IInterface) null);
                return true;
            case 12:
                boolean zzq = zzq();
                parcel2.writeNoException();
                zzasi.zzd(parcel2, zzq);
                return true;
            case 13:
                boolean zzs = zzs();
                parcel2.writeNoException();
                zzasi.zzd(parcel2, zzs);
                return true;
            case 14:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasi.zzc(parcel);
                zzp(asInterface2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbmi zzf = zzf();
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzf);
                return true;
            default:
                return false;
        }
    }
}
