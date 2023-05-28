package com.bykv.p271vk.openvk.component.video.p272a.p285e;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10202c;
import java.util.HashMap;

/* renamed from: com.bykv.vk.openvk.component.video.a.e.b */
/* compiled from: MediaUtils */
public class C10177b {

    /* renamed from: com.bykv.vk.openvk.component.video.a.e.b$b */
    /* compiled from: MediaUtils */
    public interface C10179b {
        /* renamed from: a */
        void mo2337a(Bitmap bitmap);
    }

    /* renamed from: a */
    public static void m29071a(long j, String str, C10179b bVar) {
        new C10178a(bVar, j).execute(new String[]{str});
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.e.b$a */
    /* compiled from: MediaUtils */
    public static class C10178a extends AsyncTask<String, Integer, Bitmap> {

        /* renamed from: a */
        private C10179b f25156a;

        /* renamed from: b */
        private long f25157b = 0;

        public C10178a(C10179b bVar, long j) {
            this.f25156a = bVar;
            this.f25157b = j;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                String str = strArr[0];
                if (str.startsWith("http")) {
                    mediaMetadataRetriever.setDataSource(str, new HashMap());
                } else {
                    mediaMetadataRetriever.setDataSource(str);
                }
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(this.f25157b * 1000, 3);
                mediaMetadataRetriever.release();
                return frameAtTime;
            } catch (Throwable th) {
                C10202c.m29294c("MediaUtils", "MediaUtils doInBackground : ", th);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            C10179b bVar = this.f25156a;
            if (bVar != null) {
                bVar.mo2337a(bitmap);
            }
        }
    }
}
