package android.support.p159v4.media.session;

import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() {
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    };
    final long mActions;
    final long mActiveItemId;
    final long mBufferedPosition;
    List<CustomAction> mCustomActions;
    final int mErrorCode;
    final CharSequence mErrorMessage;
    final Bundle mExtras;
    final long mPosition;
    final float mSpeed;
    final int mState;
    private PlaybackState mStateFwk;
    final long mUpdateTime;

    public int describeContents() {
        return 0;
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.mState = i;
        this.mPosition = j;
        this.mBufferedPosition = j2;
        this.mSpeed = f;
        this.mActions = j3;
        this.mErrorCode = i2;
        this.mErrorMessage = charSequence;
        this.mUpdateTime = j4;
        this.mCustomActions = new ArrayList(list);
        this.mActiveItemId = j5;
        this.mExtras = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.mState = parcel.readInt();
        this.mPosition = parcel.readLong();
        this.mSpeed = parcel.readFloat();
        this.mUpdateTime = parcel.readLong();
        this.mBufferedPosition = parcel.readLong();
        this.mActions = parcel.readLong();
        this.mErrorMessage = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mCustomActions = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.mActiveItemId = parcel.readLong();
        this.mExtras = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.mErrorCode = parcel.readInt();
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.mState + ", position=" + this.mPosition + ", buffered position=" + this.mBufferedPosition + ", speed=" + this.mSpeed + ", updated=" + this.mUpdateTime + ", actions=" + this.mActions + ", error code=" + this.mErrorCode + ", error message=" + this.mErrorMessage + ", custom actions=" + this.mCustomActions + ", active item id=" + this.mActiveItemId + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mState);
        parcel.writeLong(this.mPosition);
        parcel.writeFloat(this.mSpeed);
        parcel.writeLong(this.mUpdateTime);
        parcel.writeLong(this.mBufferedPosition);
        parcel.writeLong(this.mActions);
        TextUtils.writeToParcel(this.mErrorMessage, parcel, i);
        parcel.writeTypedList(this.mCustomActions);
        parcel.writeLong(this.mActiveItemId);
        parcel.writeBundle(this.mExtras);
        parcel.writeInt(this.mErrorCode);
    }

    public static PlaybackStateCompat fromPlaybackState(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = Api21Impl.getCustomActions(playbackState);
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction fromCustomAction : customActions) {
                arrayList2.add(CustomAction.fromCustomAction(fromCustomAction));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = Api22Impl.getExtras(playbackState);
            MediaSessionCompat.ensureClassLoader(bundle);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(Api21Impl.getState(playbackState), Api21Impl.getPosition(playbackState), Api21Impl.getBufferedPosition(playbackState), Api21Impl.getPlaybackSpeed(playbackState), Api21Impl.getActions(playbackState), 0, Api21Impl.getErrorMessage(playbackState), Api21Impl.getLastPositionUpdateTime(playbackState), arrayList, Api21Impl.getActiveQueueItemId(playbackState), bundle);
        playbackStateCompat.mStateFwk = playbackState;
        return playbackStateCompat;
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() {
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        };
        private final String mAction;
        private PlaybackState.CustomAction mCustomActionFwk;
        private final Bundle mExtras;
        private final int mIcon;
        private final CharSequence mName;

        public int describeContents() {
            return 0;
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.mAction = str;
            this.mName = charSequence;
            this.mIcon = i;
            this.mExtras = bundle;
        }

        CustomAction(Parcel parcel) {
            this.mAction = parcel.readString();
            this.mName = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.mIcon = parcel.readInt();
            this.mExtras = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mAction);
            TextUtils.writeToParcel(this.mName, parcel, i);
            parcel.writeInt(this.mIcon);
            parcel.writeBundle(this.mExtras);
        }

        public static CustomAction fromCustomAction(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle extras = Api21Impl.getExtras(customAction);
            MediaSessionCompat.ensureClassLoader(extras);
            CustomAction customAction2 = new CustomAction(Api21Impl.getAction(customAction), Api21Impl.getName(customAction), Api21Impl.getIcon(customAction), extras);
            customAction2.mCustomActionFwk = customAction;
            return customAction2;
        }

        public String toString() {
            return "Action:mName='" + this.mName + ", mIcon=" + this.mIcon + ", mExtras=" + this.mExtras;
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$Api21Impl */
    private static class Api21Impl {
        static PlaybackState.Builder createBuilder() {
            return new PlaybackState.Builder();
        }

        static void setState(PlaybackState.Builder builder, int i, long j, float f, long j2) {
            builder.setState(i, j, f, j2);
        }

        static void setBufferedPosition(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        static void setActions(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        static void setErrorMessage(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        static void addCustomAction(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        static void setActiveQueueItemId(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        static List<PlaybackState.CustomAction> getCustomActions(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        static PlaybackState build(PlaybackState.Builder builder) {
            return builder.build();
        }

        static int getState(PlaybackState playbackState) {
            return playbackState.getState();
        }

        static long getPosition(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        static long getBufferedPosition(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        static float getPlaybackSpeed(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        static long getActions(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        static CharSequence getErrorMessage(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        static long getLastPositionUpdateTime(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        static long getActiveQueueItemId(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        static PlaybackState.CustomAction.Builder createCustomActionBuilder(String str, CharSequence charSequence, int i) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i);
        }

        static void setExtras(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static PlaybackState.CustomAction build(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        static Bundle getExtras(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        static String getAction(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        static CharSequence getName(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        static int getIcon(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$Api22Impl */
    private static class Api22Impl {
        static void setExtras(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static Bundle getExtras(PlaybackState playbackState) {
            return playbackState.getExtras();
        }
    }
}
