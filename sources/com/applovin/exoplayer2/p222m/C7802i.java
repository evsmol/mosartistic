package com.applovin.exoplayer2.p222m;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7747n;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.applovin.exoplayer2.m.i */
public final class C7802i extends GLSurfaceView implements C7805k {

    /* renamed from: a */
    private final C7803a f18492a;

    /* renamed from: com.applovin.exoplayer2.m.i$a */
    private static final class C7803a implements GLSurfaceView.Renderer {

        /* renamed from: a */
        private static final float[] f18493a = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* renamed from: b */
        private static final float[] f18494b = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: c */
        private static final float[] f18495c = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* renamed from: d */
        private static final String[] f18496d = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: e */
        private static final FloatBuffer f18497e = C7747n.m22324a(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: f */
        private final GLSurfaceView f18498f;

        /* renamed from: g */
        private final int[] f18499g;

        /* renamed from: h */
        private final int[] f18500h;

        /* renamed from: i */
        private final int[] f18501i;

        /* renamed from: j */
        private final int[] f18502j;

        /* renamed from: k */
        private final AtomicReference<C7804j> f18503k;

        /* renamed from: l */
        private final FloatBuffer[] f18504l;

        /* renamed from: m */
        private int f18505m;

        /* renamed from: n */
        private int f18506n;

        /* renamed from: o */
        private C7804j f18507o;

        /* renamed from: a */
        private void m22643a() {
            GLES20.glGenTextures(3, this.f18499g, 0);
            for (int i = 0; i < 3; i++) {
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f18505m, f18496d[i]), i);
                GLES20.glActiveTexture(33984 + i);
                GLES20.glBindTexture(3553, this.f18499g[i]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            C7747n.m22329b();
        }

        /* renamed from: a */
        public void mo55187a(C7804j jVar) {
            C7804j andSet = this.f18503k.getAndSet(jVar);
            if (andSet != null) {
                andSet.mo53146f();
            }
            this.f18498f.requestRender();
        }

        public void onDrawFrame(GL10 gl10) {
            C7804j andSet = this.f18503k.getAndSet((Object) null);
            if (andSet != null || this.f18507o != null) {
                if (andSet != null) {
                    C7804j jVar = this.f18507o;
                    if (jVar != null) {
                        jVar.mo53146f();
                    }
                    this.f18507o = andSet;
                }
                C7804j jVar2 = (C7804j) C7717a.m22120b(this.f18507o);
                float[] fArr = f18494b;
                int i = jVar2.f18512g;
                if (i == 1) {
                    fArr = f18493a;
                } else if (i == 3) {
                    fArr = f18495c;
                }
                GLES20.glUniformMatrix3fv(this.f18506n, 1, false, fArr, 0);
                int[] iArr = (int[]) C7717a.m22120b(jVar2.f18511f);
                ByteBuffer[] byteBufferArr = (ByteBuffer[]) C7717a.m22120b(jVar2.f18510e);
                int i2 = 0;
                while (i2 < 3) {
                    int i3 = i2 == 0 ? jVar2.f18509d : (jVar2.f18509d + 1) / 2;
                    GLES20.glActiveTexture(33984 + i2);
                    GLES20.glBindTexture(3553, this.f18499g[i2]);
                    GLES20.glPixelStorei(3317, 1);
                    GLES20.glTexImage2D(3553, 0, 6409, iArr[i2], i3, 0, 6409, 5121, byteBufferArr[i2]);
                    i2++;
                }
                int[] iArr2 = new int[3];
                iArr2[0] = jVar2.f18508c;
                int i4 = (iArr2[0] + 1) / 2;
                iArr2[2] = i4;
                iArr2[1] = i4;
                for (int i5 = 0; i5 < 3; i5++) {
                    if (this.f18501i[i5] != iArr2[i5] || this.f18502j[i5] != iArr[i5]) {
                        C7717a.m22121b(iArr[i5] != 0);
                        float f = ((float) iArr2[i5]) / ((float) iArr[i5]);
                        this.f18504l[i5] = C7747n.m22324a(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f, 0.0f, f, 1.0f});
                        GLES20.glVertexAttribPointer(this.f18500h[i5], 2, 5126, false, 0, this.f18504l[i5]);
                        this.f18501i[i5] = iArr2[i5];
                        this.f18502j[i5] = iArr[i5];
                    }
                }
                GLES20.glClear(16384);
                GLES20.glDrawArrays(5, 0, 4);
                C7747n.m22329b();
            }
        }

        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int a = C7747n.m22322a("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f18505m = a;
            GLES20.glUseProgram(a);
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f18505m, "in_pos");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, f18497e);
            this.f18500h[0] = GLES20.glGetAttribLocation(this.f18505m, "in_tc_y");
            GLES20.glEnableVertexAttribArray(this.f18500h[0]);
            this.f18500h[1] = GLES20.glGetAttribLocation(this.f18505m, "in_tc_u");
            GLES20.glEnableVertexAttribArray(this.f18500h[1]);
            this.f18500h[2] = GLES20.glGetAttribLocation(this.f18505m, "in_tc_v");
            GLES20.glEnableVertexAttribArray(this.f18500h[2]);
            C7747n.m22329b();
            this.f18506n = GLES20.glGetUniformLocation(this.f18505m, "mColorConversion");
            C7747n.m22329b();
            m22643a();
            C7747n.m22329b();
        }
    }

    @Deprecated
    public C7805k getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(C7804j jVar) {
        this.f18492a.mo55187a(jVar);
    }
}
