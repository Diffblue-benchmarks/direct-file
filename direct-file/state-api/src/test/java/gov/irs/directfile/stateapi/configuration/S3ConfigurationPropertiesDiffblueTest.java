package gov.irs.directfile.stateapi.configuration;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S3ConfigurationPropertiesDiffblueTest {
    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>default or parameterless constructor of {@link S3ConfigurationProperties}
     *   <li>{@link S3ConfigurationProperties#setAccessKey(String)}
     *   <li>{@link S3ConfigurationProperties#setAssumeRoleArn(String)}
     *   <li>{@link S3ConfigurationProperties#setAssumeRoleDurationSeconds(String)}
     *   <li>{@link S3ConfigurationProperties#setAssumeRoleSessionName(String)}
     *   <li>{@link S3ConfigurationProperties#setCertBucketName(String)}
     *   <li>{@link S3ConfigurationProperties#setEndPoint(String)}
     *   <li>{@link S3ConfigurationProperties#setPrefix(String)}
     *   <li>{@link S3ConfigurationProperties#setRegion(String)}
     *   <li>{@link S3ConfigurationProperties#setSecretKey(String)}
     *   <li>{@link S3ConfigurationProperties#setTaxReturnXmlBucketName(String)}
     *   <li>{@link S3ConfigurationProperties#getAccessKey()}
     *   <li>{@link S3ConfigurationProperties#getAssumeRoleArn()}
     *   <li>{@link S3ConfigurationProperties#getAssumeRoleDurationSeconds()}
     *   <li>{@link S3ConfigurationProperties#getAssumeRoleSessionName()}
     *   <li>{@link S3ConfigurationProperties#getCertBucketName()}
     *   <li>{@link S3ConfigurationProperties#getEndPoint()}
     *   <li>{@link S3ConfigurationProperties#getPrefix()}
     *   <li>{@link S3ConfigurationProperties#getRegion()}
     *   <li>{@link S3ConfigurationProperties#getSecretKey()}
     *   <li>{@link S3ConfigurationProperties#getTaxReturnXmlBucketName()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void S3ConfigurationProperties.<init>()",
        "String S3ConfigurationProperties.getAccessKey()",
        "String S3ConfigurationProperties.getAssumeRoleArn()",
        "String S3ConfigurationProperties.getAssumeRoleDurationSeconds()",
        "String S3ConfigurationProperties.getAssumeRoleSessionName()",
        "String S3ConfigurationProperties.getCertBucketName()",
        "String S3ConfigurationProperties.getEndPoint()",
        "String S3ConfigurationProperties.getPrefix()",
        "String S3ConfigurationProperties.getRegion()",
        "String S3ConfigurationProperties.getSecretKey()",
        "String S3ConfigurationProperties.getTaxReturnXmlBucketName()",
        "void S3ConfigurationProperties.setAccessKey(String)",
        "void S3ConfigurationProperties.setAssumeRoleArn(String)",
        "void S3ConfigurationProperties.setAssumeRoleDurationSeconds(String)",
        "void S3ConfigurationProperties.setAssumeRoleSessionName(String)",
        "void S3ConfigurationProperties.setCertBucketName(String)",
        "void S3ConfigurationProperties.setEndPoint(String)",
        "void S3ConfigurationProperties.setPrefix(String)",
        "void S3ConfigurationProperties.setRegion(String)",
        "void S3ConfigurationProperties.setSecretKey(String)",
        "void S3ConfigurationProperties.setTaxReturnXmlBucketName(String)"
    })
    void testGettersAndSetters() {
        // Arrange and Act
        S3ConfigurationProperties actualS3ConfigurationProperties = new S3ConfigurationProperties();
        actualS3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        actualS3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        actualS3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        actualS3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        actualS3ConfigurationProperties.setCertBucketName("bucket-name");
        actualS3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        actualS3ConfigurationProperties.setPrefix("Prefix");
        actualS3ConfigurationProperties.setRegion("us-east-2");
        actualS3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        actualS3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");
        String actualAccessKey = actualS3ConfigurationProperties.getAccessKey();
        String actualAssumeRoleArn = actualS3ConfigurationProperties.getAssumeRoleArn();
        String actualAssumeRoleDurationSeconds = actualS3ConfigurationProperties.getAssumeRoleDurationSeconds();
        String actualAssumeRoleSessionName = actualS3ConfigurationProperties.getAssumeRoleSessionName();
        String actualCertBucketName = actualS3ConfigurationProperties.getCertBucketName();
        String actualEndPoint = actualS3ConfigurationProperties.getEndPoint();
        String actualPrefix = actualS3ConfigurationProperties.getPrefix();
        String actualRegion = actualS3ConfigurationProperties.getRegion();
        String actualSecretKey = actualS3ConfigurationProperties.getSecretKey();

        // Assert
        assertEquals("Assume Role Arn", actualAssumeRoleArn);
        assertEquals("Assume Role Duration Seconds", actualAssumeRoleDurationSeconds);
        assertEquals("Assume Role Session Name", actualAssumeRoleSessionName);
        assertEquals("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY", actualSecretKey);
        assertEquals("EXAMPLEakiAIOSFODNN7", actualAccessKey);
        assertEquals("Prefix", actualPrefix);
        assertEquals("bucket-name", actualCertBucketName);
        assertEquals("bucket-name", actualS3ConfigurationProperties.getTaxReturnXmlBucketName());
        assertEquals("https://config.us-east-2.amazonaws.com", actualEndPoint);
        assertEquals("us-east-2", actualRegion);
    }
}
