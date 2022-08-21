package com.sudheergogula.quotes;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class QuotesApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void main() {
		QuotesApplication.main(new String[] {});
	}

}
