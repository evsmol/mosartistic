package p150io.bidmachine;

import java.util.List;

/* renamed from: io.bidmachine.MediaAssetType */
public enum MediaAssetType {
    Icon,
    Image,
    Video,
    All;

    public static boolean isAll(List<MediaAssetType> list) {
        return list.contains(All) || (list.contains(Icon) && list.contains(Image) && list.contains(Video));
    }
}
