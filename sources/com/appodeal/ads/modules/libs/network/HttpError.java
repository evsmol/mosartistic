package com.appodeal.ads.modules.libs.network;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {}, mo38198d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0010\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0001\u0010\u001e\u001f !\"#$%&'()*+,-¨\u0006."}, mo38199d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "", "getDescription", "()Ljava/lang/String;", "description", "", "getRawResponse", "()[B", "rawResponse", "", "getCode", "()I", "code", "AdTypeNotSupportedInAdapter", "AdapterNotFound", "Canceled", "ConnectionError", "IncorrectAdUnit", "IncorrectCreative", "InternalError", "InvalidAssets", "NoFill", "RequestError", "RequestVerificationFailed", "SdkVersionNotSupported", "ServerError", "ShowFailed", "TimeoutError", "UncaughtException", "Lcom/appodeal/ads/modules/libs/network/HttpError$NoFill;", "Lcom/appodeal/ads/modules/libs/network/HttpError$InternalError;", "Lcom/appodeal/ads/modules/libs/network/HttpError$TimeoutError;", "Lcom/appodeal/ads/modules/libs/network/HttpError$ConnectionError;", "Lcom/appodeal/ads/modules/libs/network/HttpError$RequestError;", "Lcom/appodeal/ads/modules/libs/network/HttpError$ServerError;", "Lcom/appodeal/ads/modules/libs/network/HttpError$RequestVerificationFailed;", "Lcom/appodeal/ads/modules/libs/network/HttpError$SdkVersionNotSupported;", "Lcom/appodeal/ads/modules/libs/network/HttpError$InvalidAssets;", "Lcom/appodeal/ads/modules/libs/network/HttpError$AdapterNotFound;", "Lcom/appodeal/ads/modules/libs/network/HttpError$AdTypeNotSupportedInAdapter;", "Lcom/appodeal/ads/modules/libs/network/HttpError$Canceled;", "Lcom/appodeal/ads/modules/libs/network/HttpError$IncorrectAdUnit;", "Lcom/appodeal/ads/modules/libs/network/HttpError$IncorrectCreative;", "Lcom/appodeal/ads/modules/libs/network/HttpError$ShowFailed;", "Lcom/appodeal/ads/modules/libs/network/HttpError$UncaughtException;", "apd_network"}, mo38200k = 1, mo38201mv = {1, 6, 0})
public abstract class HttpError extends Throwable {

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo38199d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$AdTypeNotSupportedInAdapter;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class AdTypeNotSupportedInAdapter extends HttpError {

        /* renamed from: a */
        public final byte[] f23471a;

        /* renamed from: b */
        public final String f23472b = "ad type not supported in adapter";

        /* renamed from: c */
        public final int f23473c = 9;

        public AdTypeNotSupportedInAdapter(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f23471a = bArr;
        }

        public int getCode() {
            return this.f23473c;
        }

        public String getDescription() {
            return this.f23472b;
        }

        public byte[] getRawResponse() {
            return this.f23471a;
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo38199d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$AdapterNotFound;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class AdapterNotFound extends HttpError {

        /* renamed from: a */
        public final byte[] f23474a;

        /* renamed from: b */
        public final String f23475b = "adapter not found";

        /* renamed from: c */
        public final int f23476c = 8;

        public AdapterNotFound(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f23474a = bArr;
        }

        public int getCode() {
            return this.f23476c;
        }

        public String getDescription() {
            return this.f23475b;
        }

        public byte[] getRawResponse() {
            return this.f23474a;
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo38199d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$Canceled;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class Canceled extends HttpError {

        /* renamed from: a */
        public final byte[] f23477a;

        /* renamed from: b */
        public final String f23478b = "ad request canceled";

        /* renamed from: c */
        public final int f23479c = 2;

        public Canceled(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f23477a = bArr;
        }

        public int getCode() {
            return this.f23479c;
        }

        public String getDescription() {
            return this.f23478b;
        }

        public byte[] getRawResponse() {
            return this.f23477a;
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo38199d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$ConnectionError;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class ConnectionError extends HttpError {

        /* renamed from: a */
        public final byte[] f23480a;

        /* renamed from: b */
        public final String f23481b = "connection error";

        /* renamed from: c */
        public final int f23482c = 4;

        public ConnectionError(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f23480a = bArr;
        }

        public int getCode() {
            return this.f23482c;
        }

        public String getDescription() {
            return this.f23481b;
        }

        public byte[] getRawResponse() {
            return this.f23480a;
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo38199d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$IncorrectAdUnit;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class IncorrectAdUnit extends HttpError {

        /* renamed from: a */
        public final byte[] f23483a;

        /* renamed from: b */
        public final String f23484b = "incorrect adunit";

        /* renamed from: c */
        public final int f23485c = 2;

        public IncorrectAdUnit(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f23483a = bArr;
        }

        public int getCode() {
            return this.f23485c;
        }

        public String getDescription() {
            return this.f23484b;
        }

        public byte[] getRawResponse() {
            return this.f23483a;
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo38199d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$IncorrectCreative;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class IncorrectCreative extends HttpError {

        /* renamed from: a */
        public final byte[] f23486a;

        /* renamed from: b */
        public final String f23487b = "incorrect creative";

        /* renamed from: c */
        public final int f23488c = 4;

        public IncorrectCreative(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f23486a = bArr;
        }

        public int getCode() {
            return this.f23488c;
        }

        public String getDescription() {
            return this.f23487b;
        }

        public byte[] getRawResponse() {
            return this.f23486a;
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, mo38199d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$InternalError;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "", "rawResponse", "[B", "getRawResponse", "()[B", "apd_network"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class InternalError extends HttpError {
        public static final InternalError INSTANCE = new InternalError();

        /* renamed from: a */
        public static final String f23489a = "internal error";

        /* renamed from: b */
        public static final int f23490b = 4;

        public InternalError() {
            super((DefaultConstructorMarker) null);
        }

        public int getCode() {
            return f23490b;
        }

        public String getDescription() {
            return f23489a;
        }

        public byte[] getRawResponse() {
            return null;
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo38199d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$InvalidAssets;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class InvalidAssets extends HttpError {

        /* renamed from: a */
        public final byte[] f23491a;

        /* renamed from: b */
        public final String f23492b = "invalid assets";

        /* renamed from: c */
        public final int f23493c = 7;

        public InvalidAssets(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f23491a = bArr;
        }

        public int getCode() {
            return this.f23493c;
        }

        public String getDescription() {
            return this.f23492b;
        }

        public byte[] getRawResponse() {
            return this.f23491a;
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, mo38199d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$NoFill;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "", "rawResponse", "[B", "getRawResponse", "()[B", "apd_network"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class NoFill extends HttpError {
        public static final NoFill INSTANCE = new NoFill();

        /* renamed from: a */
        public static final String f23494a = "no fill";

        /* renamed from: b */
        public static final int f23495b = 2;

        public NoFill() {
            super((DefaultConstructorMarker) null);
        }

        public int getCode() {
            return f23495b;
        }

        public String getDescription() {
            return f23494a;
        }

        public byte[] getRawResponse() {
            return null;
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, mo38199d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$RequestError;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "", "rawResponse", "[B", "getRawResponse", "()[B", "apd_network"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class RequestError extends HttpError {
        public static final RequestError INSTANCE = new RequestError();

        /* renamed from: a */
        public static final String f23496a = "request error";

        /* renamed from: b */
        public static final int f23497b = 4;

        public RequestError() {
            super((DefaultConstructorMarker) null);
        }

        public int getCode() {
            return f23497b;
        }

        public String getDescription() {
            return f23496a;
        }

        public byte[] getRawResponse() {
            return null;
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo38199d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$RequestVerificationFailed;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class RequestVerificationFailed extends HttpError {

        /* renamed from: a */
        public final byte[] f23498a;

        /* renamed from: b */
        public final String f23499b = "request verification failed";

        /* renamed from: c */
        public final int f23500c = 4;

        public RequestVerificationFailed(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f23498a = bArr;
        }

        public int getCode() {
            return this.f23500c;
        }

        public String getDescription() {
            return this.f23499b;
        }

        public byte[] getRawResponse() {
            return this.f23498a;
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo38199d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$SdkVersionNotSupported;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class SdkVersionNotSupported extends HttpError {

        /* renamed from: a */
        public final byte[] f23501a;

        /* renamed from: b */
        public final String f23502b = "sdk version not supported";

        /* renamed from: c */
        public final int f23503c = 4;

        public SdkVersionNotSupported(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f23501a = bArr;
        }

        public int getCode() {
            return this.f23503c;
        }

        public String getDescription() {
            return this.f23502b;
        }

        public byte[] getRawResponse() {
            return this.f23501a;
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, mo38199d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$ServerError;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "", "rawResponse", "[B", "getRawResponse", "()[B", "apd_network"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class ServerError extends HttpError {
        public static final ServerError INSTANCE = new ServerError();

        /* renamed from: a */
        public static final String f23504a = "server error";

        /* renamed from: b */
        public static final int f23505b = 4;

        public ServerError() {
            super((DefaultConstructorMarker) null);
        }

        public int getCode() {
            return f23505b;
        }

        public String getDescription() {
            return f23504a;
        }

        public byte[] getRawResponse() {
            return null;
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo38199d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$ShowFailed;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class ShowFailed extends HttpError {

        /* renamed from: a */
        public final byte[] f23506a;

        /* renamed from: b */
        public final String f23507b = "show failed";

        /* renamed from: c */
        public final int f23508c = 4;

        public ShowFailed(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f23506a = bArr;
        }

        public int getCode() {
            return this.f23508c;
        }

        public String getDescription() {
            return this.f23507b;
        }

        public byte[] getRawResponse() {
            return this.f23506a;
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, mo38199d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$TimeoutError;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "", "rawResponse", "[B", "getRawResponse", "()[B", "apd_network"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class TimeoutError extends HttpError {
        public static final TimeoutError INSTANCE = new TimeoutError();

        /* renamed from: a */
        public static final String f23509a = "timeout error";

        /* renamed from: b */
        public static final int f23510b = 3;

        public TimeoutError() {
            super((DefaultConstructorMarker) null);
        }

        public int getCode() {
            return f23510b;
        }

        public String getDescription() {
            return f23509a;
        }

        public byte[] getRawResponse() {
            return null;
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, mo38199d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$UncaughtException;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "error", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "", "rawResponse", "[B", "getRawResponse", "()[B", "<init>", "(Ljava/lang/Throwable;)V", "apd_network"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class UncaughtException extends HttpError {

        /* renamed from: a */
        public final Throwable f23511a;

        /* renamed from: b */
        public final String f23512b = "";

        /* renamed from: c */
        public final int f23513c = -1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UncaughtException(Throwable th) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(th, "error");
            this.f23511a = th;
        }

        public int getCode() {
            return this.f23513c;
        }

        public String getDescription() {
            return this.f23512b;
        }

        public final Throwable getError() {
            return this.f23511a;
        }

        public byte[] getRawResponse() {
            return null;
        }
    }

    public HttpError() {
    }

    public /* synthetic */ HttpError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getCode();

    public abstract String getDescription();

    public abstract byte[] getRawResponse();
}
