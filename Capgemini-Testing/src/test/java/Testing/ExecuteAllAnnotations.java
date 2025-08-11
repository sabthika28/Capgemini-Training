package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExecuteAllAnnotations {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before first test method");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After last test method");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each test method");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each test method");
	}

	@Test
	void atest() {
		System.out.println("Test A");
	}
	
	@Test
	void btest() {
		System.out.println("Test B");
	}

}
