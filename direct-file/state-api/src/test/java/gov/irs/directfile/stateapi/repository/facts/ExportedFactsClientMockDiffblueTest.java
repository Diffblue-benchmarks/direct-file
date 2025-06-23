package gov.irs.directfile.stateapi.repository.facts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;
import reactor.test.StepVerifier.FirstStep;

import gov.irs.directfile.stateapi.model.GetStateExportedFactsResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExportedFactsClientMockDiffblueTest {
    /**
     * Test {@link ExportedFactsClientMock#getExportedFacts(String, String, String)}.
     * <p>
     * Method under test: {@link ExportedFactsClientMock#getExportedFacts(String, String, String)}
     */
    @Test
    @DisplayName("Test getExportedFacts(String, String, String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"reactor.core.publisher.Mono ExportedFactsClientMock.getExportedFacts(String, String, String)"})
    void testGetExportedFacts() throws AssertionError {
        // Arrange, Act and Assert
        FirstStep<GetStateExportedFactsResponse> createResult =
                StepVerifier.create(new ExportedFactsClientMock().getExportedFacts("42", "MD", "42"));
        createResult
                .assertNext(g -> {
                    Map<String, Object> exportedFactsResult = g.exportedFacts();
                    assertEquals(6, exportedFactsResult.size());
                    Object getResult = exportedFactsResult.get("familyAndHousehold");
                    Object getResult2 = exportedFactsResult.get("socialSecurityReports");
                    Object getResult3 = exportedFactsResult.get("filers");
                    Object getResult4 = exportedFactsResult.get("form1099Gs");
                    Object getResult5 = exportedFactsResult.get("formW2s");
                    Object getResult6 = exportedFactsResult.get("interestReports");
                    assertTrue(getResult instanceof List);
                    assertEquals(1, ((List<HashMap>) getResult).size());
                    HashMap getResult7 = ((List<HashMap>) getResult).get(0);
                    assertEquals(17, getResult7.size());
                    assertTrue(getResult7.containsKey("monthsLivedWithTPInUS"));
                    assertTrue(getResult7.containsKey("lastName"));
                    assertTrue(getResult7.containsKey("isClaimedDependent"));
                    assertTrue(getResult2 instanceof List);
                    assertEquals(1, ((List<HashMap>) getResult2).size());
                    HashMap getResult8 = ((List<HashMap>) getResult2).get(0);
                    assertEquals(3, getResult8.size());
                    assertTrue(getResult8.containsKey("formType"));
                    assertTrue(getResult8.containsKey("recipientTin"));
                    assertTrue(getResult8.containsKey("netBenefits"));
                    assertTrue(getResult3 instanceof List);
                    assertEquals(2, ((List<HashMap>) getResult3).size());
                    HashMap getResult9 = ((List<HashMap>) getResult3).get(0);
                    HashMap getResult10 = ((List<HashMap>) getResult3).get(1);
                    assertEquals(14, getResult9.size());
                    assertTrue(getResult9.containsKey("lastName"));
                    assertTrue(getResult9.containsKey("dateOfBirth"));
                    assertTrue(getResult9.containsKey("suffix"));
                    assertEquals(14, getResult10.size());
                    assertTrue(getResult10.containsKey("lastName"));
                    assertTrue(getResult10.containsKey("dateOfBirth"));
                    assertTrue(getResult10.containsKey("suffix"));
                    assertTrue(getResult4 instanceof List);
                    assertEquals(1, ((List<HashMap>) getResult4).size());
                    HashMap getResult11 = ((List<HashMap>) getResult4).get(0);
                    assertEquals(9, getResult11.size());
                    assertTrue(getResult11.containsKey("has1099"));
                    assertTrue(getResult11.containsKey("stateTaxWithheld"));
                    assertTrue(getResult11.containsKey("amount"));
                    assertTrue(getResult5 instanceof List);
                    assertEquals(1, ((List<HashMap>) getResult5).size());
                    HashMap getResult12 = ((List<HashMap>) getResult5).get(0);
                    assertEquals(3, getResult12.size());
                    assertTrue(getResult12.containsKey("BOX14_NJ_UIWFSWF"));
                    assertTrue(getResult12.containsKey("BOX14_NJ_UIHCWD"));
                    assertTrue(getResult12.containsKey("unionDuesAmount"));
                    assertTrue(getResult6 instanceof List);
                    assertEquals(1, ((List<HashMap>) getResult6).size());
                    HashMap getResult13 = ((List<HashMap>) getResult6).get(0);
                    assertEquals(10, getResult13.size());
                    assertTrue(getResult13.containsKey("has1099"));
                    assertTrue(getResult13.containsKey("taxExemptAndTaxCreditBondCusipNo"));
                    assertTrue(getResult13.containsKey("interestOnGovernmentBonds"));
                    return;
                })
                .expectComplete()
                .verify();
    }
}
