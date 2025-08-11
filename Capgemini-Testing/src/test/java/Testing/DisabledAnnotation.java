package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DisabledAnnotation {

	@Test
	void btest() {
		System.out.println("Test B");
	}
	
	@Test @Disabled
	void atest() {
		System.out.println("Test A");
	}

}
