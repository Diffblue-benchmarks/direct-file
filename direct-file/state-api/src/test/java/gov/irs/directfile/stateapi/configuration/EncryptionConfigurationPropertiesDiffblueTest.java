package gov.irs.directfile.stateapi.configuration;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EncryptionConfigurationPropertiesDiffblueTest {
    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link EncryptionConfigurationProperties#EncryptionConfigurationProperties(String, String, String, String)}
     *   <li>{@link EncryptionConfigurationProperties#getKmsEndpoint()}
     *   <li>{@link EncryptionConfigurationProperties#getLocalWrappingKey()}
     *   <li>{@link EncryptionConfigurationProperties#getRegion()}
     *   <li>{@link EncryptionConfigurationProperties#getS3KmsWrappingKeyArn()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void EncryptionConfigurationProperties.<init>(String, String, String, String)",
        "String EncryptionConfigurationProperties.getKmsEndpoint()",
        "String EncryptionConfigurationProperties.getLocalWrappingKey()",
        "String EncryptionConfigurationProperties.getRegion()",
        "String EncryptionConfigurationProperties.getS3KmsWrappingKeyArn()"
    })
    void testGettersAndSetters() {
        // Arrange and Act
        EncryptionConfigurationProperties actualEncryptionConfigurationProperties =
                new EncryptionConfigurationProperties(
                        "https://config.us-east-2.amazonaws.com",
                        "us-east-2",
                        "Local Wrapping Key",
                        "S3 Kms Wrapping Key Arn");
        String actualKmsEndpoint = actualEncryptionConfigurationProperties.getKmsEndpoint();
        String actualLocalWrappingKey = actualEncryptionConfigurationProperties.getLocalWrappingKey();
        String actualRegion = actualEncryptionConfigurationProperties.getRegion();

        // Assert
        assertEquals("Local Wrapping Key", actualLocalWrappingKey);
        assertEquals("S3 Kms Wrapping Key Arn", actualEncryptionConfigurationProperties.getS3KmsWrappingKeyArn());
        assertEquals("https://config.us-east-2.amazonaws.com", actualKmsEndpoint);
        assertEquals("us-east-2", actualRegion);
    }
}
