package gov.irs.directfile.stateapi.repository;

import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import software.amazon.awssdk.core.async.AsyncResponseTransformer;
import software.amazon.awssdk.services.s3.S3AsyncClient;
import software.amazon.awssdk.services.s3.internal.crossregion.S3CrossRegionAsyncClient;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;
import software.amazon.awssdk.services.s3.model.GetObjectResponse;
import software.amazon.encryption.s3.S3AsyncEncryptionClient;

import gov.irs.directfile.error.StateApiErrorCode;
import gov.irs.directfile.stateapi.configuration.S3ConfigurationProperties;
import gov.irs.directfile.stateapi.configuration.XmlSanitizedConfigurationProperties;
import gov.irs.directfile.stateapi.exception.StateApiException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class StateApiS3ClientImplDiffblueTest {
    /**
     * Test {@link StateApiS3ClientImpl#getCert(String)}.
     * <ul>
     *   <li>Given {@link S3ConfigurationProperties} (default constructor) Prefix is empty string.</li>
     *   <li>Then calls {@link S3AsyncClient#getObject(GetObjectRequest, AsyncResponseTransformer)}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiS3ClientImpl#getCert(String)}
     */
    @Test
    @DisplayName(
            "Test getCert(String); given S3ConfigurationProperties (default constructor) Prefix is empty string; then calls getObject(GetObjectRequest, AsyncResponseTransformer)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"reactor.core.publisher.Mono StateApiS3ClientImpl.getCert(String)"})
    void testGetCert_givenS3ConfigurationPropertiesPrefixIsEmptyString_thenCallsGetObject() {
        // Arrange
        S3AsyncClient s3Client = mock(S3AsyncClient.class);
        when(s3Client.getObject(
                        Mockito.<GetObjectRequest>any(),
                        Mockito.<AsyncResponseTransformer<GetObjectResponse, Object>>any()))
                .thenReturn(new CompletableFuture<>());

        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");
        s3ConfigurationProperties.setPrefix("");
        S3AsyncEncryptionClient s3EncryptionClient = mock(S3AsyncEncryptionClient.class);
        ArrayList<String> allowedHeaders = new ArrayList<>();

        // Act
        new StateApiS3ClientImpl(
                        s3Client,
                        s3EncryptionClient,
                        s3ConfigurationProperties,
                        new XmlSanitizedConfigurationProperties(allowedHeaders, new ArrayList<>()))
                .getCert("Cert Name");

        // Assert
        verify(s3Client).getObject(isA(GetObjectRequest.class), isA(AsyncResponseTransformer.class));
    }

    /**
     * Test {@link StateApiS3ClientImpl#getCert(String)}.
     * <ul>
     *   <li>Given {@link S3ConfigurationProperties} (default constructor) Prefix is {@code null}.</li>
     *   <li>Then calls {@link S3AsyncClient#getObject(GetObjectRequest, AsyncResponseTransformer)}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiS3ClientImpl#getCert(String)}
     */
    @Test
    @DisplayName(
            "Test getCert(String); given S3ConfigurationProperties (default constructor) Prefix is 'null'; then calls getObject(GetObjectRequest, AsyncResponseTransformer)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"reactor.core.publisher.Mono StateApiS3ClientImpl.getCert(String)"})
    void testGetCert_givenS3ConfigurationPropertiesPrefixIsNull_thenCallsGetObject() {
        // Arrange
        S3AsyncClient s3Client = mock(S3AsyncClient.class);
        when(s3Client.getObject(
                        Mockito.<GetObjectRequest>any(),
                        Mockito.<AsyncResponseTransformer<GetObjectResponse, Object>>any()))
                .thenReturn(new CompletableFuture<>());

        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");
        s3ConfigurationProperties.setPrefix(null);
        S3AsyncEncryptionClient s3EncryptionClient = mock(S3AsyncEncryptionClient.class);
        ArrayList<String> allowedHeaders = new ArrayList<>();

        // Act
        new StateApiS3ClientImpl(
                        s3Client,
                        s3EncryptionClient,
                        s3ConfigurationProperties,
                        new XmlSanitizedConfigurationProperties(allowedHeaders, new ArrayList<>()))
                .getCert("Cert Name");

        // Assert
        verify(s3Client).getObject(isA(GetObjectRequest.class), isA(AsyncResponseTransformer.class));
    }

    /**
     * Test {@link StateApiS3ClientImpl#getCert(String)}.
     * <ul>
     *   <li>Then calls {@link S3AsyncClient#getObject(GetObjectRequest, AsyncResponseTransformer)}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiS3ClientImpl#getCert(String)}
     */
    @Test
    @DisplayName("Test getCert(String); then calls getObject(GetObjectRequest, AsyncResponseTransformer)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"reactor.core.publisher.Mono StateApiS3ClientImpl.getCert(String)"})
    void testGetCert_thenCallsGetObject() {
        // Arrange
        S3AsyncClient s3Client = mock(S3AsyncClient.class);
        when(s3Client.getObject(
                        Mockito.<GetObjectRequest>any(),
                        Mockito.<AsyncResponseTransformer<GetObjectResponse, Object>>any()))
                .thenReturn(new CompletableFuture<>());

        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");
        s3ConfigurationProperties.setPrefix("not blank");
        S3AsyncEncryptionClient s3EncryptionClient = mock(S3AsyncEncryptionClient.class);
        ArrayList<String> allowedHeaders = new ArrayList<>();

        // Act
        new StateApiS3ClientImpl(
                        s3Client,
                        s3EncryptionClient,
                        s3ConfigurationProperties,
                        new XmlSanitizedConfigurationProperties(allowedHeaders, new ArrayList<>()))
                .getCert("Cert Name");

        // Assert
        verify(s3Client).getObject(isA(GetObjectRequest.class), isA(AsyncResponseTransformer.class));
    }

    /**
     * Test {@link StateApiS3ClientImpl#getCert(String)}.
     * <ul>
     *   <li>Then calls {@link S3AsyncClient#getObject(GetObjectRequest, AsyncResponseTransformer)}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiS3ClientImpl#getCert(String)}
     */
    @Test
    @DisplayName("Test getCert(String); then calls getObject(GetObjectRequest, AsyncResponseTransformer)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"reactor.core.publisher.Mono StateApiS3ClientImpl.getCert(String)"})
    void testGetCert_thenCallsGetObject2() {
        // Arrange
        S3AsyncClient s3Client = mock(S3AsyncClient.class);
        when(s3Client.getObject(
                        Mockito.<GetObjectRequest>any(),
                        Mockito.<AsyncResponseTransformer<GetObjectResponse, Object>>any()))
                .thenReturn(new CompletableFuture<>());

        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");
        s3ConfigurationProperties.setPrefix(" ");
        S3AsyncEncryptionClient s3EncryptionClient = mock(S3AsyncEncryptionClient.class);
        ArrayList<String> allowedHeaders = new ArrayList<>();

        // Act
        new StateApiS3ClientImpl(
                        s3Client,
                        s3EncryptionClient,
                        s3ConfigurationProperties,
                        new XmlSanitizedConfigurationProperties(allowedHeaders, new ArrayList<>()))
                .getCert("Cert Name");

        // Assert
        verify(s3Client).getObject(isA(GetObjectRequest.class), isA(AsyncResponseTransformer.class));
    }

    /**
     * Test {@link StateApiS3ClientImpl#getTaxReturnXml(int, UUID, String)}.
     * <ul>
     *   <li>Given {@link S3AsyncEncryptionClient} {@link S3AsyncEncryptionClient#getObject(GetObjectRequest, AsyncResponseTransformer)} return {@link CompletableFuture#CompletableFuture()}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiS3ClientImpl#getTaxReturnXml(int, UUID, String)}
     */
    @Test
    @DisplayName(
            "Test getTaxReturnXml(int, UUID, String); given S3AsyncEncryptionClient getObject(GetObjectRequest, AsyncResponseTransformer) return CompletableFuture()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"reactor.core.publisher.Mono StateApiS3ClientImpl.getTaxReturnXml(int, UUID, String)"})
    void testGetTaxReturnXml_givenS3AsyncEncryptionClientGetObjectReturnCompletableFuture() {
        // Arrange
        S3AsyncEncryptionClient s3EncryptionClient = mock(S3AsyncEncryptionClient.class);
        when(s3EncryptionClient.getObject(
                        Mockito.<GetObjectRequest>any(),
                        Mockito.<AsyncResponseTransformer<GetObjectResponse, Object>>any()))
                .thenReturn(new CompletableFuture<>());

        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");
        s3ConfigurationProperties.setPrefix("not blank");
        S3CrossRegionAsyncClient s3Client = new S3CrossRegionAsyncClient(mock(S3AsyncClient.class));
        ArrayList<String> allowedHeaders = new ArrayList<>();
        StateApiS3ClientImpl stateApiS3ClientImpl = new StateApiS3ClientImpl(
                s3Client,
                s3EncryptionClient,
                s3ConfigurationProperties,
                new XmlSanitizedConfigurationProperties(allowedHeaders, new ArrayList<>()));

        // Act
        stateApiS3ClientImpl.getTaxReturnXml(1, UUID.randomUUID(), "42");

        // Assert
        verify(s3EncryptionClient).getObject(isA(GetObjectRequest.class), isA(AsyncResponseTransformer.class));
    }

    /**
     * Test {@link StateApiS3ClientImpl#getTaxReturnXml(int, UUID, String)}.
     * <ul>
     *   <li>Given {@link S3ConfigurationProperties} (default constructor) Prefix is empty string.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiS3ClientImpl#getTaxReturnXml(int, UUID, String)}
     */
    @Test
    @DisplayName(
            "Test getTaxReturnXml(int, UUID, String); given S3ConfigurationProperties (default constructor) Prefix is empty string")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"reactor.core.publisher.Mono StateApiS3ClientImpl.getTaxReturnXml(int, UUID, String)"})
    void testGetTaxReturnXml_givenS3ConfigurationPropertiesPrefixIsEmptyString() {
        // Arrange
        S3AsyncEncryptionClient s3EncryptionClient = mock(S3AsyncEncryptionClient.class);
        when(s3EncryptionClient.getObject(
                        Mockito.<GetObjectRequest>any(),
                        Mockito.<AsyncResponseTransformer<GetObjectResponse, Object>>any()))
                .thenReturn(new CompletableFuture<>());

        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");
        s3ConfigurationProperties.setPrefix("");
        S3CrossRegionAsyncClient s3Client = new S3CrossRegionAsyncClient(mock(S3AsyncClient.class));
        ArrayList<String> allowedHeaders = new ArrayList<>();
        StateApiS3ClientImpl stateApiS3ClientImpl = new StateApiS3ClientImpl(
                s3Client,
                s3EncryptionClient,
                s3ConfigurationProperties,
                new XmlSanitizedConfigurationProperties(allowedHeaders, new ArrayList<>()));

        // Act
        stateApiS3ClientImpl.getTaxReturnXml(1, UUID.randomUUID(), "42");

        // Assert
        verify(s3EncryptionClient).getObject(isA(GetObjectRequest.class), isA(AsyncResponseTransformer.class));
    }

    /**
     * Test {@link StateApiS3ClientImpl#getTaxReturnXml(int, UUID, String)}.
     * <ul>
     *   <li>Given {@link S3ConfigurationProperties} (default constructor) Prefix is {@code null}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiS3ClientImpl#getTaxReturnXml(int, UUID, String)}
     */
    @Test
    @DisplayName(
            "Test getTaxReturnXml(int, UUID, String); given S3ConfigurationProperties (default constructor) Prefix is 'null'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"reactor.core.publisher.Mono StateApiS3ClientImpl.getTaxReturnXml(int, UUID, String)"})
    void testGetTaxReturnXml_givenS3ConfigurationPropertiesPrefixIsNull() {
        // Arrange
        S3AsyncEncryptionClient s3EncryptionClient = mock(S3AsyncEncryptionClient.class);
        when(s3EncryptionClient.getObject(
                        Mockito.<GetObjectRequest>any(),
                        Mockito.<AsyncResponseTransformer<GetObjectResponse, Object>>any()))
                .thenReturn(new CompletableFuture<>());

        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");
        s3ConfigurationProperties.setPrefix(null);
        S3CrossRegionAsyncClient s3Client = new S3CrossRegionAsyncClient(mock(S3AsyncClient.class));
        ArrayList<String> allowedHeaders = new ArrayList<>();
        StateApiS3ClientImpl stateApiS3ClientImpl = new StateApiS3ClientImpl(
                s3Client,
                s3EncryptionClient,
                s3ConfigurationProperties,
                new XmlSanitizedConfigurationProperties(allowedHeaders, new ArrayList<>()));

        // Act
        stateApiS3ClientImpl.getTaxReturnXml(1, UUID.randomUUID(), "42");

        // Assert
        verify(s3EncryptionClient).getObject(isA(GetObjectRequest.class), isA(AsyncResponseTransformer.class));
    }

    /**
     * Test {@link StateApiS3ClientImpl#getTaxReturnXml(int, UUID, String)}.
     * <ul>
     *   <li>Given {@link S3ConfigurationProperties} (default constructor) Prefix is space.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiS3ClientImpl#getTaxReturnXml(int, UUID, String)}
     */
    @Test
    @DisplayName(
            "Test getTaxReturnXml(int, UUID, String); given S3ConfigurationProperties (default constructor) Prefix is space")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"reactor.core.publisher.Mono StateApiS3ClientImpl.getTaxReturnXml(int, UUID, String)"})
    void testGetTaxReturnXml_givenS3ConfigurationPropertiesPrefixIsSpace() {
        // Arrange
        S3AsyncEncryptionClient s3EncryptionClient = mock(S3AsyncEncryptionClient.class);
        when(s3EncryptionClient.getObject(
                        Mockito.<GetObjectRequest>any(),
                        Mockito.<AsyncResponseTransformer<GetObjectResponse, Object>>any()))
                .thenReturn(new CompletableFuture<>());

        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");
        s3ConfigurationProperties.setPrefix(" ");
        S3CrossRegionAsyncClient s3Client = new S3CrossRegionAsyncClient(mock(S3AsyncClient.class));
        ArrayList<String> allowedHeaders = new ArrayList<>();
        StateApiS3ClientImpl stateApiS3ClientImpl = new StateApiS3ClientImpl(
                s3Client,
                s3EncryptionClient,
                s3ConfigurationProperties,
                new XmlSanitizedConfigurationProperties(allowedHeaders, new ArrayList<>()));

        // Act
        stateApiS3ClientImpl.getTaxReturnXml(1, UUID.randomUUID(), "42");

        // Assert
        verify(s3EncryptionClient).getObject(isA(GetObjectRequest.class), isA(AsyncResponseTransformer.class));
    }

    /**
     * Test {@link StateApiS3ClientImpl#getTaxReturnXml(int, UUID, String)}.
     * <ul>
     *   <li>Then throw {@link StateApiException}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiS3ClientImpl#getTaxReturnXml(int, UUID, String)}
     */
    @Test
    @DisplayName("Test getTaxReturnXml(int, UUID, String); then throw StateApiException")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"reactor.core.publisher.Mono StateApiS3ClientImpl.getTaxReturnXml(int, UUID, String)"})
    void testGetTaxReturnXml_thenThrowStateApiException() {
        // Arrange
        S3AsyncEncryptionClient s3EncryptionClient = mock(S3AsyncEncryptionClient.class);
        when(s3EncryptionClient.getObject(
                        Mockito.<GetObjectRequest>any(),
                        Mockito.<AsyncResponseTransformer<GetObjectResponse, Object>>any()))
                .thenThrow(new StateApiException(StateApiErrorCode.E_BEARER_TOKEN_MISSING));

        S3ConfigurationProperties s3ConfigurationProperties = new S3ConfigurationProperties();
        s3ConfigurationProperties.setAccessKey("EXAMPLEakiAIOSFODNN7");
        s3ConfigurationProperties.setAssumeRoleArn("Assume Role Arn");
        s3ConfigurationProperties.setAssumeRoleDurationSeconds("Assume Role Duration Seconds");
        s3ConfigurationProperties.setAssumeRoleSessionName("Assume Role Session Name");
        s3ConfigurationProperties.setCertBucketName("bucket-name");
        s3ConfigurationProperties.setEndPoint("https://config.us-east-2.amazonaws.com");
        s3ConfigurationProperties.setRegion("us-east-2");
        s3ConfigurationProperties.setSecretKey("EXAMPLEKEYwjalrXUtnFEMI/K7MDENG/bPxRfiCY");
        s3ConfigurationProperties.setTaxReturnXmlBucketName("bucket-name");
        s3ConfigurationProperties.setPrefix("not blank");
        S3CrossRegionAsyncClient s3Client = new S3CrossRegionAsyncClient(mock(S3AsyncClient.class));
        ArrayList<String> allowedHeaders = new ArrayList<>();
        StateApiS3ClientImpl stateApiS3ClientImpl = new StateApiS3ClientImpl(
                s3Client,
                s3EncryptionClient,
                s3ConfigurationProperties,
                new XmlSanitizedConfigurationProperties(allowedHeaders, new ArrayList<>()));

        // Act and Assert
        assertThrows(StateApiException.class, () -> stateApiS3ClientImpl.getTaxReturnXml(1, UUID.randomUUID(), "42"));
        verify(s3EncryptionClient).getObject(isA(GetObjectRequest.class), isA(AsyncResponseTransformer.class));
    }
}
