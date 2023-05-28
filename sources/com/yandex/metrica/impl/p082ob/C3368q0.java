package com.yandex.metrica.impl.p082ob;

import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.util.UUID;

/* renamed from: com.yandex.metrica.impl.ob.q0 */
public class C3368q0 {

    /* renamed from: a */
    private final Context f8672a;

    /* renamed from: b */
    private final C3370b f8673b;

    /* renamed from: com.yandex.metrica.impl.ob.q0$a */
    public static class C3369a {

        /* renamed from: a */
        public final long f8674a;

        /* renamed from: b */
        public final long f8675b;

        public C3369a(long j, long j2) {
            this.f8674a = j;
            this.f8675b = j2;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q0$b */
    static class C3370b {
        C3370b() {
        }
    }

    public C3368q0(Context context) {
        this(context, new C3370b());
    }

    /* renamed from: a */
    public C3369a mo18063a() {
        long j;
        long j2 = 0;
        if (C1848A2.m6808a(26)) {
            StorageStatsManager storageStatsManager = (StorageStatsManager) this.f8672a.getSystemService("storagestats");
            StorageManager storageManager = (StorageManager) this.f8672a.getSystemService("storage");
            if (storageManager == null || storageStatsManager == null) {
                j = 0;
            } else {
                long j3 = 0;
                for (StorageVolume uuid : storageManager.getStorageVolumes()) {
                    try {
                        String uuid2 = uuid.getUuid();
                        UUID fromString = uuid2 == null ? StorageManager.UUID_DEFAULT : UUID.fromString(uuid2);
                        j2 += storageStatsManager.getTotalBytes(fromString);
                        j3 += storageStatsManager.getFreeBytes(fromString);
                    } catch (Throwable unused) {
                    }
                }
                long j4 = j2;
                j2 = j3;
                j = j4;
            }
            return new C3369a(j / 1024, j2 / 1024);
        } else if (C1848A2.m6808a(18)) {
            try {
                this.f8673b.getClass();
                StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                long blockSizeLong = statFs.getBlockSizeLong();
                return new C3369a((statFs.getBlockCountLong() * blockSizeLong) / 1024, (statFs.getAvailableBlocksLong() * blockSizeLong) / 1024);
            } catch (Throwable unused2) {
                return new C3369a(0, 0);
            }
        } else {
            try {
                this.f8673b.getClass();
                StatFs statFs2 = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                long blockSize = (long) statFs2.getBlockSize();
                return new C3369a((((long) statFs2.getBlockCount()) * blockSize) / 1024, (((long) statFs2.getAvailableBlocks()) * blockSize) / 1024);
            } catch (Throwable unused3) {
                return new C3369a(0, 0);
            }
        }
    }

    C3368q0(Context context, C3370b bVar) {
        this.f8672a = context;
        this.f8673b = bVar;
    }
}
