package gov.irs.directfile.stateapi.configuration;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AwsCredentialsConfigurationDiffblueTest {
    /**
     * Test {@link AwsCredentialsConfiguration#staticCredentialsProvider(S3ConfigurationProperties)}.
     * <ul>
     *   <li>Then resolveCredentials return {@link AwsBasicCredentials}.</li>
     * </ul>
     * <p>
     * Method under test: {@link AwsCredentialsConfiguration#staticCredentialsProvider(S3ConfigurationProperties)}
     */
    @Test
    @DisplayName(
            "Test staticCredentialsProvider(S3ConfigurationProperties); then resolveCredentials return AwsBasicCredentials")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "AwsCredentialsProvider AwsCredentialsConfiguration.staticCredentialsProvider(S3ConfigurationProperties)"
    })
    void testStaticCredentialsProvider_thenResolveCredentialsReturnAwsBasicCredentials() {
        // Arrange
        AwsCredentialsConfiguration awsCredentialsConfiguration = new AwsCredentialsConfiguration();

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
        AwsCredentialsProvider actualStaticCredentialsProviderResult =
                awsCredentialsConfiguration.staticCredentialsProvider(s3ConfigurationProperties);
        AwsCredentials actualResolveCredentialsResult = actualStaticCredentialsProviderResult.resolveCredentials();

        // Assert
        assertTrue(actualResolveCredentialsResult instanceof AwsBasicCredentials);
        assertTrue(actualStaticCredentialsProviderResult instanceof StaticCredentialsProvider);
        assertEquals("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY", actualResolveCredentialsResult.secretAccessKey());
        assertEquals("EXAMPLEakiAIOSFODNN7", actualResolveCredentialsResult.accessKeyId());
    }

    /**
     * Test {@link AwsCredentialsConfiguration#defaultAWSCredentialsProvider()}.
     * <p>
     * Method under test: {@link AwsCredentialsConfiguration#defaultAWSCredentialsProvider()}
     */
    @Test
    @DisplayName("Test defaultAWSCredentialsProvider()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"AwsCredentialsProvider AwsCredentialsConfiguration.defaultAWSCredentialsProvider()"})
    void testDefaultAWSCredentialsProvider() {
        // Arrange and Act
        AwsCredentialsProvider actualDefaultAWSCredentialsProviderResult =
                new AwsCredentialsConfiguration().defaultAWSCredentialsProvider();
        AwsCredentials actualResolveCredentialsResult = actualDefaultAWSCredentialsProviderResult.resolveCredentials();

        // Assert
        assertTrue(actualResolveCredentialsResult instanceof AwsBasicCredentials);
        assertTrue(actualDefaultAWSCredentialsProviderResult instanceof DefaultCredentialsProvider);
        assertEquals("AKIA3FP4ALX664NHSEXQ", actualResolveCredentialsResult.accessKeyId());
        assertEquals("Q8qq1uedj193YVgpVfPaRbGdFAHx0DdcbtucqEhc", actualResolveCredentialsResult.secretAccessKey());
    }

    /**
     * Test {@link AwsCredentialsConfiguration#defaultAWSCredentialsProvider()}.
     * <p>
     * Method under test: {@link AwsCredentialsConfiguration#defaultAWSCredentialsProvider()}
     */
    @Test
    @DisplayName("Test defaultAWSCredentialsProvider()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"AwsCredentialsProvider AwsCredentialsConfiguration.defaultAWSCredentialsProvider()"})
    void testDefaultAWSCredentialsProvider2() {
        // Arrange, Act and Assert
        assertTrue(
                new AwsCredentialsConfiguration().defaultAWSCredentialsProvider()
                        instanceof DefaultCredentialsProvider);
    }
}
