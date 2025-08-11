package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder (MethodOrderer.DisplayName.class)
class DisplayNameOrder {

	@Test @DisplayName ("1st Test")
	void btest() {
		System.out.println("Test B");
	}
	
	@Test @DisplayName ("2nd Test")
	void atest() {
		System.out.println("Test A");
	}

}
