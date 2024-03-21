package com.exoscale.api.experiment;

import com.exoscale.experiment.exception.SignatureGenerationException;
import org.springframework.stereotype.Service;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * Service class for generating cryptographic signatures.
 */
@Service
public class SignatureService {

    public static final String HMAC_SHA_256 = "HmacSHA256";

    /**
     * Generates a cryptographic signature using the HMAC-SHA256 algorithm.
     *
     * @param secretKey The secret key for generating the signature.
     * @param message The message to be signed.
     * @return The generated signature as a Base64 encoded string.
     * @throws SignatureGenerationException if any cryptographic errors occur during signature generation.
     */
    public String generateSignature(String secretKey, String message) throws Exception {
        try {
            String algorithm = HMAC_SHA_256;
            Mac mac = Mac.getInstance(algorithm);
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), algorithm);
            mac.init(secretKeySpec);
            byte[] hash = mac.doFinal(message.getBytes());
            return Base64.getEncoder().encodeToString(hash);
        } catch (Exception e) {
            throw new SignatureGenerationException("Error generating signature");
        }
    }
}