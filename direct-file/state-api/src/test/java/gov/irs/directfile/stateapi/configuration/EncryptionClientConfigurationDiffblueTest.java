package gov.irs.directfile.stateapi.configuration;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.encryption.s3.materials.DefaultCryptoMaterialsManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

class EncryptionClientConfigurationDiffblueTest {
    /**
     * Test {@link EncryptionClientConfiguration#kmsCrypto(String)}.
     * <p>
     * Method under test: {@link EncryptionClientConfiguration#kmsCrypto(String)}
     */
    @Test
    @DisplayName("Test kmsCrypto(String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "software.amazon.encryption.s3.materials.CryptographicMaterialsManager EncryptionClientConfiguration.kmsCrypto(String)"
    })
    void testKmsCrypto() {
        // Arrange
        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setPrefix("Prefix");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");

        // Act and Assert
        assertTrue(
                new EncryptionClientConfiguration(
                                        new EncryptionConfigurationProperties(
                                                "https://config.us-east-2.amazonaws.com",
                                                "us-east-2",
                                                "Local Wrapping Key",
                                                "S3 Kms Wrapping Key Arn"),
                                        s3ConfigurationProperties,
                                        mock(AwsCredentialsProvider.class))
                                .kmsCrypto("Kms Wrapping Key Arn")
                        instanceof DefaultCryptoMaterialsManager);
    }

    /**
     * Test {@link EncryptionClientConfiguration#kmsCrypto(String)}.
     * <p>
     * Method under test: {@link EncryptionClientConfiguration#kmsCrypto(String)}
     */
    @Test
    @DisplayName("Test kmsCrypto(String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "software.amazon.encryption.s3.materials.CryptographicMaterialsManager EncryptionClientConfiguration.kmsCrypto(String)"
    })
    void testKmsCrypto2() {
        // Arrange
        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setPrefix("Prefix");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");

        // Act and Assert
        assertTrue(
                new EncryptionClientConfiguration(
                                        new EncryptionConfigurationProperties(
                                                "https://config.us-east-2.amazonaws.com",
                                                "~/U",
                                                "Local Wrapping Key",
                                                "S3 Kms Wrapping Key Arn"),
                                        s3ConfigurationProperties,
                                        mock(AwsCredentialsProvider.class))
                                .kmsCrypto("Kms Wrapping Key Arn")
                        instanceof DefaultCryptoMaterialsManager);
    }

    /**
     * Test {@link EncryptionClientConfiguration#kmsCrypto(String)}.
     * <p>
     * Method under test: {@link EncryptionClientConfiguration#kmsCrypto(String)}
     */
    @Test
    @DisplayName("Test kmsCrypto(String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "software.amazon.encryption.s3.materials.CryptographicMaterialsManager EncryptionClientConfiguration.kmsCrypto(String)"
    })
    void testKmsCrypto3() {
        // Arrange
        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setPrefix("Prefix");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");

        // Act and Assert
        assertTrue(
                new EncryptionClientConfiguration(
                                        new EncryptionConfigurationProperties(
                                                "https://config.us-east-2.amazonaws.com",
                                                "us-isof-U-9",
                                                "Local Wrapping Key",
                                                "S3 Kms Wrapping Key Arn"),
                                        s3ConfigurationProperties,
                                        mock(AwsCredentialsProvider.class))
                                .kmsCrypto("Kms Wrapping Key Arn")
                        instanceof DefaultCryptoMaterialsManager);
    }

    /**
     * Test {@link EncryptionClientConfiguration#kmsCrypto(String)}.
     * <p>
     * Method under test: {@link EncryptionClientConfiguration#kmsCrypto(String)}
     */
    @Test
    @DisplayName("Test kmsCrypto(String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "software.amazon.encryption.s3.materials.CryptographicMaterialsManager EncryptionClientConfiguration.kmsCrypto(String)"
    })
    void testKmsCrypto4() {
        // Arrange
        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setPrefix("Prefix");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");

        // Act and Assert
        assertTrue(
                new EncryptionClientConfiguration(
                                        new EncryptionConfigurationProperties(
                                                "https://config.us-east-2.amazonaws.com",
                                                "us-iso-U-9",
                                                "Local Wrapping Key",
                                                "S3 Kms Wrapping Key Arn"),
                                        s3ConfigurationProperties,
                                        mock(AwsCredentialsProvider.class))
                                .kmsCrypto("Kms Wrapping Key Arn")
                        instanceof DefaultCryptoMaterialsManager);
    }

    /**
     * Test {@link EncryptionClientConfiguration#kmsCrypto(String)}.
     * <p>
     * Method under test: {@link EncryptionClientConfiguration#kmsCrypto(String)}
     */
    @Test
    @DisplayName("Test kmsCrypto(String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "software.amazon.encryption.s3.materials.CryptographicMaterialsManager EncryptionClientConfiguration.kmsCrypto(String)"
    })
    void testKmsCrypto5() {
        // Arrange
        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setPrefix("Prefix");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");

        // Act and Assert
        assertTrue(
                new EncryptionClientConfiguration(
                                        new EncryptionConfigurationProperties(
                                                "https://config.us-east-2.amazonaws.com",
                                                "eu-isoe-U-9",
                                                "Local Wrapping Key",
                                                "S3 Kms Wrapping Key Arn"),
                                        s3ConfigurationProperties,
                                        mock(AwsCredentialsProvider.class))
                                .kmsCrypto("Kms Wrapping Key Arn")
                        instanceof DefaultCryptoMaterialsManager);
    }

    /**
     * Test {@link EncryptionClientConfiguration#kmsCrypto(String)}.
     * <p>
     * Method under test: {@link EncryptionClientConfiguration#kmsCrypto(String)}
     */
    @Test
    @DisplayName("Test kmsCrypto(String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "software.amazon.encryption.s3.materials.CryptographicMaterialsManager EncryptionClientConfiguration.kmsCrypto(String)"
    })
    void testKmsCrypto6() {
        // Arrange
        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setPrefix("Prefix");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");

        // Act and Assert
        assertTrue(
                new EncryptionClientConfiguration(
                                        new EncryptionConfigurationProperties(
                                                "https://config.us-east-2.amazonaws.com",
                                                "us-isob-U-9",
                                                "Local Wrapping Key",
                                                "S3 Kms Wrapping Key Arn"),
                                        s3ConfigurationProperties,
                                        mock(AwsCredentialsProvider.class))
                                .kmsCrypto("Kms Wrapping Key Arn")
                        instanceof DefaultCryptoMaterialsManager);
    }

    /**
     * Test {@link EncryptionClientConfiguration#kmsCrypto(String)}.
     * <p>
     * Method under test: {@link EncryptionClientConfiguration#kmsCrypto(String)}
     */
    @Test
    @DisplayName("Test kmsCrypto(String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "software.amazon.encryption.s3.materials.CryptographicMaterialsManager EncryptionClientConfiguration.kmsCrypto(String)"
    })
    void testKmsCrypto7() {
        // Arrange
        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setPrefix("Prefix");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");

        // Act and Assert
        assertTrue(
                new EncryptionClientConfiguration(
                                        new EncryptionConfigurationProperties(
                                                "https://config.us-east-2.amazonaws.com",
                                                "us-gov-U-9",
                                                "Local Wrapping Key",
                                                "S3 Kms Wrapping Key Arn"),
                                        s3ConfigurationProperties,
                                        mock(AwsCredentialsProvider.class))
                                .kmsCrypto("Kms Wrapping Key Arn")
                        instanceof DefaultCryptoMaterialsManager);
    }

    /**
     * Test {@link EncryptionClientConfiguration#kmsCrypto(String)}.
     * <p>
     * Method under test: {@link EncryptionClientConfiguration#kmsCrypto(String)}
     */
    @Test
    @DisplayName("Test kmsCrypto(String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "software.amazon.encryption.s3.materials.CryptographicMaterialsManager EncryptionClientConfiguration.kmsCrypto(String)"
    })
    void testKmsCrypto8() {
        // Arrange
        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setPrefix("Prefix");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");

        // Act and Assert
        assertTrue(
                new EncryptionClientConfiguration(
                                        new EncryptionConfigurationProperties(
                                                "https://config.us-east-2.amazonaws.com",
                                                "us-U-9",
                                                "Local Wrapping Key",
                                                "S3 Kms Wrapping Key Arn"),
                                        s3ConfigurationProperties,
                                        mock(AwsCredentialsProvider.class))
                                .kmsCrypto("Kms Wrapping Key Arn")
                        instanceof DefaultCryptoMaterialsManager);
    }

    /**
     * Test {@link EncryptionClientConfiguration#getLocalAesWrappingKey()}.
     * <ul>
     *   <li>Then return {@link SecretKeySpec}.</li>
     * </ul>
     * <p>
     * Method under test: {@link EncryptionClientConfiguration#getLocalAesWrappingKey()}
     */
    @Test
    @DisplayName("Test getLocalAesWrappingKey(); then return SecretKeySpec")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"SecretKey EncryptionClientConfiguration.getLocalAesWrappingKey()"})
    void testGetLocalAesWrappingKey_thenReturnSecretKeySpec() {
        // Arrange
        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setPrefix("Prefix");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");

        // Act
        SecretKey actualLocalAesWrappingKey = new EncryptionClientConfiguration(
                        new EncryptionConfigurationProperties(
                                "https://config.us-east-2.amazonaws.com", "us-east-2", "42", "S3 Kms Wrapping Key Arn"),
                        s3ConfigurationProperties,
                        mock(AwsCredentialsProvider.class))
                .getLocalAesWrappingKey();

        // Assert
        assertTrue(actualLocalAesWrappingKey instanceof SecretKeySpec);
        assertEquals("AES", actualLocalAesWrappingKey.getAlgorithm());
        assertEquals("RAW", actualLocalAesWrappingKey.getFormat());
        assertFalse(actualLocalAesWrappingKey.isDestroyed());
        assertArrayEquals(new byte[] {-29}, actualLocalAesWrappingKey.getEncoded());
    }

    /**
     * Test {@link EncryptionClientConfiguration#getS3KmsWrappingKeyArn()}.
     * <ul>
     *   <li>Then return {@code S3 Kms Wrapping Key Arn}.</li>
     * </ul>
     * <p>
     * Method under test: {@link EncryptionClientConfiguration#getS3KmsWrappingKeyArn()}
     */
    @Test
    @DisplayName("Test getS3KmsWrappingKeyArn(); then return 'S3 Kms Wrapping Key Arn'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"String EncryptionClientConfiguration.getS3KmsWrappingKeyArn()"})
    void testGetS3KmsWrappingKeyArn_thenReturnS3KmsWrappingKeyArn() {
        // Arrange
        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setPrefix("Prefix");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");

        // Act and Assert
        assertEquals(
                "S3 Kms Wrapping Key Arn",
                new EncryptionClientConfiguration(
                                new EncryptionConfigurationProperties(
                                        "https://config.us-east-2.amazonaws.com",
                                        "us-east-2",
                                        "Local Wrapping Key",
                                        "S3 Kms Wrapping Key Arn"),
                                s3ConfigurationProperties,
                                mock(AwsCredentialsProvider.class))
                        .getS3KmsWrappingKeyArn());
    }
}
