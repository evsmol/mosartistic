package com.criteo.publisher;

/* renamed from: com.criteo.publisher.q */
/* compiled from: CriteoNotInitializedException */
public class C1320q extends IllegalStateException {
    public C1320q(String str) {
        super(str + "\nDid you properly initialize the Criteo SDK ?\nPlease follow this step: https://publisherdocs.criteotilt.com/app/android/standalone/#sdk-initialization\n");
    }
}
