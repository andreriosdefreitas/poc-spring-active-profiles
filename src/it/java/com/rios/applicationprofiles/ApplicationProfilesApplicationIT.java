package com.rios.applicationprofiles;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"default", "test"})
class ApplicationProfilesApplicationIT {

	@Test
	@DisplayName("contextLoadsIt")
	void contextLoadsIt() {
	}

}
