package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class SpecificOrderOfExecution {

	@Test @Order(1)
	void btest() {
		System.out.println("Test B");
	}
	
	@Test @Order(3)
	void atest() {
		System.out.println("Test A");
	}
	
	@Test @Order(2)
	void ctest() {
		System.out.println("Test C");
	}

}
