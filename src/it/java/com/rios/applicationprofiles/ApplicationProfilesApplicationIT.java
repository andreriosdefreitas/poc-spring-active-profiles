package com.rios.applicationprofiles;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@Slf4j
@SpringBootTest
@ActiveProfiles({"default", "it"})
class ApplicationProfilesApplicationIT {

	@Test
	@DisplayName("contextLoadsIt")
	void contextLoadsIt() {
		log.info("it");
	}

}
