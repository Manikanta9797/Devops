import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumofnumstest {

	@Test
	void test() {
		sumofnums s=new sumofnums();
		int d=s.add(25, 25);
		assertEquals(50, d);
	}

}
