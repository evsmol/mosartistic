package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

public abstract class Key {
    public static int UNSET = -1;
    HashMap<String, ConstraintAttribute> mCustomConstraints;
    int mFramePosition;
    int mTargetId;
    String mTargetString = null;
    protected int mType;

    public abstract void addValues(HashMap<String, ViewSpline> hashMap);

    public abstract Key clone();

    /* access modifiers changed from: package-private */
    public abstract void getAttributeNames(HashSet<String> hashSet);

    public void setInterpolation(HashMap<String, Integer> hashMap) {
    }

    public Key() {
        int i = UNSET;
        this.mFramePosition = i;
        this.mTargetId = i;
    }

    /* access modifiers changed from: package-private */
    public boolean matches(String str) {
        String str2 = this.mTargetString;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public Key copy(Key key) {
        this.mFramePosition = key.mFramePosition;
        this.mTargetId = key.mTargetId;
        this.mTargetString = key.mTargetString;
        this.mType = key.mType;
        this.mCustomConstraints = key.mCustomConstraints;
        return this;
    }

    public Key setViewId(int i) {
        this.mTargetId = i;
        return this;
    }
}
