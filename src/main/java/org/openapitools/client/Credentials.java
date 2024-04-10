package org.openapitools.client;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Credentials {
    private static final String HMAC_SHA_256 = "HmacSHA256";
    private static final String EXPIRES = "expires=";
    private static final String EXO_2_HMAC_SHA_256_CREDENTIAL = "EXO2-HMAC-SHA256 credential=";
    private static final String SIGNATURE = "signature=";
    private static final String FOUR_NEW_LINES = "\n\n\n\n";
    private static final String LINE_BREAK = "\n";
    private static final String SPACE = " ";
    private static final String COMMA = ",";
    private String secretKey;
    private String apiKey;
    public Credentials(String secretKey, String apiKey) {
        this.secretKey = secretKey;
        this.apiKey = apiKey;
    }

    public String generateSignature(String method, String path, String requestBody) throws Exception {
        long unixTimestamp = System.currentTimeMillis() / 1000L;
        String message = method + SPACE + path + LINE_BREAK+LINE_BREAK+LINE_BREAK+LINE_BREAK + unixTimestamp;
        if (!requestBody.isEmpty()) {
            message = method + SPACE + path + LINE_BREAK + requestBody + LINE_BREAK+LINE_BREAK+LINE_BREAK + unixTimestamp;
        }
        Mac mac = Mac.getInstance(HMAC_SHA_256);
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), HMAC_SHA_256);
        mac.init(secretKeySpec);
        byte[] hash = mac.doFinal(message.getBytes());
        String signature = Base64.getEncoder().encodeToString(hash);
        return EXO_2_HMAC_SHA_256_CREDENTIAL + apiKey + COMMA + EXPIRES + unixTimestamp + COMMA + SIGNATURE + signature;
    }
}

