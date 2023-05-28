package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class FirebaseInstallationServiceClient {
    private static final Pattern EXPIRATION_TIMESTAMP_PATTERN = Pattern.compile("[0-9]+s");
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final Context context;
    private final Provider<HeartBeatController> heartBeatProvider;
    private final RequestLimiter requestLimiter = new RequestLimiter();

    private static boolean isSuccessfulResponseCode(int i) {
        return i >= 200 && i < 300;
    }

    public FirebaseInstallationServiceClient(Context context2, Provider<HeartBeatController> provider) {
        this.context = context2;
        this.heartBeatProvider = provider;
    }

    public InstallationResponse createFirebaseInstallation(String str, String str2, String str3, String str4, String str5) throws FirebaseInstallationsException {
        InstallationResponse readCreateResponse;
        if (this.requestLimiter.isRequestAllowed()) {
            int i = 0;
            URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(String.format("projects/%s/installations", new Object[]{str3}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection openHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
                try {
                    openHttpURLConnection.setRequestMethod("POST");
                    openHttpURLConnection.setDoOutput(true);
                    if (str5 != null) {
                        openHttpURLConnection.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    writeFIDCreateRequestBodyToOutputStream(openHttpURLConnection, str2, str4);
                    int responseCode = openHttpURLConnection.getResponseCode();
                    this.requestLimiter.setNextRequestTime(responseCode);
                    if (isSuccessfulResponseCode(responseCode)) {
                        readCreateResponse = readCreateResponse(openHttpURLConnection);
                    } else {
                        logFisCommunicationError(openHttpURLConnection, str4, str, str3);
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            logBadConfigError();
                            readCreateResponse = InstallationResponse.builder().setResponseCode(InstallationResponse.ResponseCode.BAD_CONFIG).build();
                        } else {
                            openHttpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                        }
                    }
                    openHttpURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return readCreateResponse;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    openHttpURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    private void writeFIDCreateRequestBodyToOutputStream(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildCreateFirebaseInstallationRequestBody(str, str2)));
    }

    private static byte[] getJsonBytes(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static void writeRequestBodyToOutputStream(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    private static JSONObject buildCreateFirebaseInstallationRequestBody(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.1");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    private void writeGenerateAuthTokenRequestBodyToOutputStream(HttpURLConnection httpURLConnection) throws IOException {
        writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildGenerateAuthTokenRequestBody()));
    }

    private static JSONObject buildGenerateAuthTokenRequestBody() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    private URL getFullyQualifiedRequestUri(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e) {
            throw new FirebaseInstallationsException(e.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    public TokenResult generateAuthToken(String str, String str2, String str3, String str4) throws FirebaseInstallationsException {
        TokenResult readGenerateAuthTokenResponse;
        if (this.requestLimiter.isRequestAllowed()) {
            int i = 0;
            URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection openHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
                try {
                    openHttpURLConnection.setRequestMethod("POST");
                    openHttpURLConnection.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    openHttpURLConnection.setDoOutput(true);
                    writeGenerateAuthTokenRequestBodyToOutputStream(openHttpURLConnection);
                    int responseCode = openHttpURLConnection.getResponseCode();
                    this.requestLimiter.setNextRequestTime(responseCode);
                    if (isSuccessfulResponseCode(responseCode)) {
                        readGenerateAuthTokenResponse = readGenerateAuthTokenResponse(openHttpURLConnection);
                    } else {
                        logFisCommunicationError(openHttpURLConnection, (String) null, str, str3);
                        if (responseCode != 401) {
                            if (responseCode != 404) {
                                if (responseCode == 429) {
                                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                                } else if (responseCode < 500 || responseCode >= 600) {
                                    logBadConfigError();
                                    readGenerateAuthTokenResponse = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.BAD_CONFIG).build();
                                } else {
                                    openHttpURLConnection.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    i++;
                                }
                            }
                        }
                        readGenerateAuthTokenResponse = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.AUTH_ERROR).build();
                    }
                    openHttpURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return readGenerateAuthTokenResponse;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    openHttpURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    private static void logBadConfigError() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private HttpURLConnection openHttpURLConnection(URL url, String str) throws FirebaseInstallationsException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.context.getPackageName());
            HeartBeatController heartBeatController = this.heartBeatProvider.get();
            if (heartBeatController != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(heartBeatController.getHeartBeatsHeader()));
                } catch (ExecutionException e) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", getFingerprintHashForPackage());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    private InstallationResponse readCreateResponse(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, UTF_8));
        TokenResult.Builder builder = TokenResult.builder();
        InstallationResponse.Builder builder2 = InstallationResponse.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                builder2.setUri(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                builder2.setFid(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                builder2.setRefreshToken(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        builder.setToken(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                builder2.setAuthToken(builder.build());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder2.setResponseCode(InstallationResponse.ResponseCode.OK).build();
    }

    private TokenResult readGenerateAuthTokenResponse(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, UTF_8));
        TokenResult.Builder builder = TokenResult.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                builder.setToken(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder.setResponseCode(TokenResult.ResponseCode.OK).build();
    }

    private String getFingerprintHashForPackage() {
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(this.context, this.context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.context.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.context.getPackageName(), e);
            return null;
        }
    }

    static long parseTokenExpirationTimestamp(String str) {
        Preconditions.checkArgument(EXPIRATION_TIMESTAMP_PATTERN.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private static void logFisCommunicationError(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String readErrorResponse = readErrorResponse(httpURLConnection);
        if (!TextUtils.isEmpty(readErrorResponse)) {
            Log.w("Firebase-Installations", readErrorResponse);
            Log.w("Firebase-Installations", availableFirebaseOptions(str, str2, str3));
        }
    }

    private static String availableFirebaseOptions(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String readErrorResponse(java.net.HttpURLConnection r7) {
        /*
            java.io.InputStream r0 = r7.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = UTF_8
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r0.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            if (r3 == 0) goto L_0x0028
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            goto L_0x0019
        L_0x0028:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 0
            int r6 = r7.getResponseCode()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r6     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 1
            java.lang.String r7 = r7.getResponseMessage()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r7     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r7 = 2
            r4[r7] = r0     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r7
        L_0x004a:
            r7 = move-exception
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r7
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.FirebaseInstallationServiceClient.readErrorResponse(java.net.HttpURLConnection):java.lang.String");
    }
}