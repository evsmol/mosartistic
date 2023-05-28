package com.applovin.exoplayer2.p222m.p223a;

import com.applovin.exoplayer2.p222m.p223a.C7782e;

/* renamed from: com.applovin.exoplayer2.m.a.g */
final class C7786g {

    /* renamed from: a */
    private static final String[] f18386a = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: b */
    private static final String[] f18387b = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: c */
    private static final float[] f18388c = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: d */
    private static final float[] f18389d = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: e */
    private static final float[] f18390e = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: f */
    private static final float[] f18391f = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: g */
    private static final float[] f18392g = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a */
    public static boolean m22533a(C7782e eVar) {
        C7782e.C7783a aVar = eVar.f18377a;
        C7782e.C7783a aVar2 = eVar.f18378b;
        return aVar.mo55136a() == 1 && aVar.mo55137a(0).f18382a == 0 && aVar2.mo55136a() == 1 && aVar2.mo55137a(0).f18382a == 0;
    }
}
