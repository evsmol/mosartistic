package com.applovin.exoplayer2.p186e.p193g;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p186e.C7349r;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p198g.p203e.C7423a;
import com.applovin.exoplayer2.p198g.p203e.C7431e;
import com.applovin.exoplayer2.p198g.p203e.C7438h;
import com.applovin.exoplayer2.p198g.p203e.C7439i;
import com.applovin.exoplayer2.p198g.p203e.C7445l;
import com.applovin.exoplayer2.p198g.p204f.C7450a;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7772y;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.e.g.f */
final class C7250f {

    /* renamed from: a */
    static final String[] f16190a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: a */
    public static C7399a.C7401a m19723a(C7772y yVar) {
        int c = yVar.mo55074c() + yVar.mo55093q();
        int q = yVar.mo55093q();
        int i = (q >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i == 169 || i == 253) {
            int i2 = 16777215 & q;
            if (i2 == 6516084) {
                C7431e a = m19724a(q, yVar);
                yVar.mo55076d(c);
                return a;
            } else if (i2 == 7233901 || i2 == 7631467) {
                C7445l a2 = m19727a(q, "TIT2", yVar);
                yVar.mo55076d(c);
                return a2;
            } else if (i2 == 6516589 || i2 == 7828084) {
                C7445l a3 = m19727a(q, "TCOM", yVar);
                yVar.mo55076d(c);
                return a3;
            } else if (i2 == 6578553) {
                C7445l a4 = m19727a(q, "TDRC", yVar);
                yVar.mo55076d(c);
                return a4;
            } else if (i2 == 4280916) {
                C7445l a5 = m19727a(q, "TPE1", yVar);
                yVar.mo55076d(c);
                return a5;
            } else if (i2 == 7630703) {
                C7445l a6 = m19727a(q, "TSSE", yVar);
                yVar.mo55076d(c);
                return a6;
            } else if (i2 == 6384738) {
                C7445l a7 = m19727a(q, "TALB", yVar);
                yVar.mo55076d(c);
                return a7;
            } else if (i2 == 7108978) {
                C7445l a8 = m19727a(q, "USLT", yVar);
                yVar.mo55076d(c);
                return a8;
            } else if (i2 == 6776174) {
                C7445l a9 = m19727a(q, "TCON", yVar);
                yVar.mo55076d(c);
                return a9;
            } else if (i2 == 6779504) {
                C7445l a10 = m19727a(q, "TIT1", yVar);
                yVar.mo55076d(c);
                return a10;
            }
        } else if (q == 1735291493) {
            try {
                return m19732b(yVar);
            } finally {
                yVar.mo55076d(c);
            }
        } else if (q == 1684632427) {
            C7445l b = m19731b(q, "TPOS", yVar);
            yVar.mo55076d(c);
            return b;
        } else if (q == 1953655662) {
            C7445l b2 = m19731b(q, "TRCK", yVar);
            yVar.mo55076d(c);
            return b2;
        } else if (q == 1953329263) {
            C7438h a11 = m19725a(q, "TBPM", yVar, true, false);
            yVar.mo55076d(c);
            return a11;
        } else if (q == 1668311404) {
            C7438h a12 = m19725a(q, "TCMP", yVar, true, true);
            yVar.mo55076d(c);
            return a12;
        } else if (q == 1668249202) {
            C7423a c2 = m19733c(yVar);
            yVar.mo55076d(c);
            return c2;
        } else if (q == 1631670868) {
            C7445l a13 = m19727a(q, "TPE2", yVar);
            yVar.mo55076d(c);
            return a13;
        } else if (q == 1936682605) {
            C7445l a14 = m19727a(q, "TSOT", yVar);
            yVar.mo55076d(c);
            return a14;
        } else if (q == 1936679276) {
            C7445l a15 = m19727a(q, "TSO2", yVar);
            yVar.mo55076d(c);
            return a15;
        } else if (q == 1936679282) {
            C7445l a16 = m19727a(q, "TSOA", yVar);
            yVar.mo55076d(c);
            return a16;
        } else if (q == 1936679265) {
            C7445l a17 = m19727a(q, "TSOP", yVar);
            yVar.mo55076d(c);
            return a17;
        } else if (q == 1936679791) {
            C7445l a18 = m19727a(q, "TSOC", yVar);
            yVar.mo55076d(c);
            return a18;
        } else if (q == 1920233063) {
            C7438h a19 = m19725a(q, "ITUNESADVISORY", yVar, false, false);
            yVar.mo55076d(c);
            return a19;
        } else if (q == 1885823344) {
            C7438h a20 = m19725a(q, "ITUNESGAPLESS", yVar, false, true);
            yVar.mo55076d(c);
            return a20;
        } else if (q == 1936683886) {
            C7445l a21 = m19727a(q, "TVSHOWSORT", yVar);
            yVar.mo55076d(c);
            return a21;
        } else if (q == 1953919848) {
            C7445l a22 = m19727a(q, "TVSHOW", yVar);
            yVar.mo55076d(c);
            return a22;
        } else if (q == 757935405) {
            C7438h a23 = m19726a(yVar, c);
            yVar.mo55076d(c);
            return a23;
        }
        C7755q.m22356a("MetadataUtil", "Skipped unknown metadata entry: " + C7233a.m19620c(q));
        yVar.mo55076d(c);
        return null;
    }

    /* renamed from: a */
    private static C7431e m19724a(int i, C7772y yVar) {
        int q = yVar.mo55093q();
        if (yVar.mo55093q() == 1684108385) {
            yVar.mo55079e(8);
            String g = yVar.mo55083g(q - 16);
            return new C7431e("und", g, g);
        }
        C7755q.m22361c("MetadataUtil", "Failed to parse comment attribute: " + C7233a.m19620c(i));
        return null;
    }

    /* renamed from: a */
    private static C7438h m19725a(int i, String str, C7772y yVar, boolean z, boolean z2) {
        int d = m19734d(yVar);
        if (z2) {
            d = Math.min(1, d);
        }
        if (d >= 0) {
            return z ? new C7445l(str, (String) null, Integer.toString(d)) : new C7431e("und", str, Integer.toString(d));
        }
        C7755q.m22361c("MetadataUtil", "Failed to parse uint8 attribute: " + C7233a.m19620c(i));
        return null;
    }

    /* renamed from: a */
    private static C7438h m19726a(C7772y yVar, int i) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (yVar.mo55074c() < i) {
            int c = yVar.mo55074c();
            int q = yVar.mo55093q();
            int q2 = yVar.mo55093q();
            yVar.mo55079e(4);
            if (q2 == 1835360622) {
                str = yVar.mo55083g(q - 12);
            } else if (q2 == 1851878757) {
                str2 = yVar.mo55083g(q - 12);
            } else {
                if (q2 == 1684108385) {
                    i2 = c;
                    i3 = q;
                }
                yVar.mo55079e(q - 12);
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        yVar.mo55076d(i2);
        yVar.mo55079e(16);
        return new C7439i(str, str2, yVar.mo55083g(i3 - 16));
    }

    /* renamed from: a */
    private static C7445l m19727a(int i, String str, C7772y yVar) {
        int q = yVar.mo55093q();
        if (yVar.mo55093q() == 1684108385) {
            yVar.mo55079e(8);
            return new C7445l(str, (String) null, yVar.mo55083g(q - 16));
        }
        C7755q.m22361c("MetadataUtil", "Failed to parse text attribute: " + C7233a.m19620c(i));
        return null;
    }

    /* renamed from: a */
    public static C7450a m19728a(C7772y yVar, int i, String str) {
        while (true) {
            int c = yVar.mo55074c();
            if (c >= i) {
                return null;
            }
            int q = yVar.mo55093q();
            if (yVar.mo55093q() == 1684108385) {
                int q2 = yVar.mo55093q();
                int q3 = yVar.mo55093q();
                int i2 = q - 16;
                byte[] bArr = new byte[i2];
                yVar.mo55071a(bArr, 0, i2);
                return new C7450a(str, bArr, q3, q2);
            }
            yVar.mo55076d(c + q);
        }
    }

    /* renamed from: a */
    public static void m19729a(int i, C7349r rVar, C7864v.C7866a aVar) {
        if (i == 1 && rVar.mo54084a()) {
            aVar.mo55443n(rVar.f16767a).mo55444o(rVar.f16768b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r6 != null) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[LOOP:1: B:17:0x003e->B:18:0x0040, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m19730a(int r5, com.applovin.exoplayer2.p198g.C7399a r6, com.applovin.exoplayer2.p198g.C7399a r7, com.applovin.exoplayer2.C7864v.C7866a r8, com.applovin.exoplayer2.p198g.C7399a... r9) {
        /*
            com.applovin.exoplayer2.g.a r0 = new com.applovin.exoplayer2.g.a
            r1 = 0
            com.applovin.exoplayer2.g.a$a[] r2 = new com.applovin.exoplayer2.p198g.C7399a.C7401a[r1]
            r0.<init>((com.applovin.exoplayer2.p198g.C7399a.C7401a[]) r2)
            r2 = 1
            if (r5 != r2) goto L_0x000e
            if (r6 == 0) goto L_0x003c
            goto L_0x003d
        L_0x000e:
            r6 = 2
            if (r5 != r6) goto L_0x003c
            if (r7 == 0) goto L_0x003c
            r5 = 0
        L_0x0014:
            int r6 = r7.mo54200a()
            if (r5 >= r6) goto L_0x003c
            com.applovin.exoplayer2.g.a$a r6 = r7.mo54201a((int) r5)
            boolean r3 = r6 instanceof com.applovin.exoplayer2.p198g.p204f.C7450a
            if (r3 == 0) goto L_0x0039
            com.applovin.exoplayer2.g.f.a r6 = (com.applovin.exoplayer2.p198g.p204f.C7450a) r6
            java.lang.String r3 = r6.f17068a
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0039
            com.applovin.exoplayer2.g.a r5 = new com.applovin.exoplayer2.g.a
            com.applovin.exoplayer2.g.a$a[] r7 = new com.applovin.exoplayer2.p198g.C7399a.C7401a[r2]
            r7[r1] = r6
            r5.<init>((com.applovin.exoplayer2.p198g.C7399a.C7401a[]) r7)
            r6 = r5
            goto L_0x003d
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x0014
        L_0x003c:
            r6 = r0
        L_0x003d:
            int r5 = r9.length
        L_0x003e:
            if (r1 >= r5) goto L_0x0049
            r7 = r9[r1]
            com.applovin.exoplayer2.g.a r6 = r6.mo54202a((com.applovin.exoplayer2.p198g.C7399a) r7)
            int r1 = r1 + 1
            goto L_0x003e
        L_0x0049:
            int r5 = r6.mo54200a()
            if (r5 <= 0) goto L_0x0052
            r8.mo55419a((com.applovin.exoplayer2.p198g.C7399a) r6)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p193g.C7250f.m19730a(int, com.applovin.exoplayer2.g.a, com.applovin.exoplayer2.g.a, com.applovin.exoplayer2.v$a, com.applovin.exoplayer2.g.a[]):void");
    }

    /* renamed from: b */
    private static C7445l m19731b(int i, String str, C7772y yVar) {
        int q = yVar.mo55093q();
        if (yVar.mo55093q() == 1684108385 && q >= 22) {
            yVar.mo55079e(10);
            int i2 = yVar.mo55085i();
            if (i2 > 0) {
                String str2 = "" + i2;
                int i3 = yVar.mo55085i();
                if (i3 > 0) {
                    str2 = str2 + "/" + i3;
                }
                return new C7445l(str, (String) null, str2);
            }
        }
        C7755q.m22361c("MetadataUtil", "Failed to parse index/count attribute: " + C7233a.m19620c(i));
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.exoplayer2.p198g.p203e.C7445l m19732b(com.applovin.exoplayer2.p221l.C7772y r3) {
        /*
            int r3 = m19734d(r3)
            r0 = 0
            if (r3 <= 0) goto L_0x0011
            java.lang.String[] r1 = f16190a
            int r2 = r1.length
            if (r3 > r2) goto L_0x0011
            int r3 = r3 + -1
            r3 = r1[r3]
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            if (r3 == 0) goto L_0x001c
            com.applovin.exoplayer2.g.e.l r1 = new com.applovin.exoplayer2.g.e.l
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L_0x001c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p193g.C7250f.m19732b(com.applovin.exoplayer2.l.y):com.applovin.exoplayer2.g.e.l");
    }

    /* renamed from: c */
    private static C7423a m19733c(C7772y yVar) {
        String str;
        int q = yVar.mo55093q();
        if (yVar.mo55093q() == 1684108385) {
            int b = C7233a.m19619b(yVar.mo55093q());
            String str2 = b == 13 ? "image/jpeg" : b == 14 ? "image/png" : null;
            if (str2 == null) {
                str = "Unrecognized cover art flags: " + b;
            } else {
                yVar.mo55079e(4);
                int i = q - 16;
                byte[] bArr = new byte[i];
                yVar.mo55071a(bArr, 0, i);
                return new C7423a(str2, (String) null, 3, bArr);
            }
        } else {
            str = "Failed to parse cover art attribute";
        }
        C7755q.m22361c("MetadataUtil", str);
        return null;
    }

    /* renamed from: d */
    private static int m19734d(C7772y yVar) {
        yVar.mo55079e(4);
        if (yVar.mo55093q() == 1684108385) {
            yVar.mo55079e(8);
            return yVar.mo55084h();
        }
        C7755q.m22361c("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
