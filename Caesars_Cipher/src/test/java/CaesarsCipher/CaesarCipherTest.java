package CaesarsCipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCipherTest {

	private CaesarsCipher CaesarsCipher = new CaesarsCipher();
	
	@Test
	void testCipheredMessageWithOffsetOf12() {
		assertEquals("tai mdq kag pauzs fapmk", CaesarsCipher.cipher("how are you doing today",12));
	}
	@Test
	void testEmptyString() {
		assertEquals("", CaesarsCipher.cipher("",12));
	}
//	@Test
//	void testCipheredMessageWithOffsetOf11() {
//		assertEquals("tai mdq kag pauzs fapmk", CaesarsCipher.cipher("how are you doing today",11));
//	}

}
