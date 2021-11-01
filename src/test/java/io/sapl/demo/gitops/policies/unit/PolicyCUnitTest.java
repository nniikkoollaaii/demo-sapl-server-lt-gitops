package io.sapl.demo.gitops.policies.unit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.sapl.api.pdp.AuthorizationSubscription;
import io.sapl.test.SaplTestFixture;
import io.sapl.test.unit.SaplUnitTestFixture;

public class PolicyCUnitTest {
	
	private SaplTestFixture fixture;
	
	@BeforeEach
	void setUp() {
		fixture = new SaplUnitTestFixture("policy_C");
	}
	

    @Test
    void testSinglePolicyC() {
    
       fixture.constructTestCase()
           .when(AuthorizationSubscription.of("WILLI", "shh", "server1"))
           .expectPermit()
           .verify();
    
    }
	
}