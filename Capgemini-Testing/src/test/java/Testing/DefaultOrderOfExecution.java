package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DefaultOrderOfExecution {

	@Test
	void btest() {
		System.out.println("Test B");
	}
	
	@Test
	void atest() {
		System.out.println("Test A");
	}
	
	@Test
	void ctest() {
		System.out.println("Test C");
	}

}
