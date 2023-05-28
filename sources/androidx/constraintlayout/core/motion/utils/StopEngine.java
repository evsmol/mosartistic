package androidx.constraintlayout.core.motion.utils;

public interface StopEngine {
    float getInterpolation(float f);

    float getVelocity();

    boolean isStopped();
}
