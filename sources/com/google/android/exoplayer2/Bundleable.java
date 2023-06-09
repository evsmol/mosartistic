package com.google.android.exoplayer2;

import android.os.Bundle;

public interface Bundleable {

    public interface Creator<T extends Bundleable> {
        T fromBundle(Bundle bundle);
    }
}
