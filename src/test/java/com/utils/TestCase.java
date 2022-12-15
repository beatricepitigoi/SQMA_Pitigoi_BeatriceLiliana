package test.java.com.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import ro.ase.ism.sqma.main.Utils;


class TestCase {
	private Utils utils;
	
	@BeforeEach
	@Tag("NumberProcesses")
	@Tag("CharacterProcesses")
	public void setUp(){
		utils = new Utils();
	}
	
	@Test
	@Tag("NumberProcesses")
	public void testIsPrimeTrue() {
		boolean result = utils.isPrime(11);
		assertTrue(result);
		result = utils.isPrime(23);
		assertTrue(result);
	}
	
	@Test
	@Tag("NumberProcesses")
	public void testIsPrimeFalse() {
		boolean result = utils.isPrime(21);
		assertFalse(result);
		result = utils.isPrime(4);
		assertFalse(result);
		result = utils.isPrime(36);
		assertFalse(result);
	}
	
	
	@Test
	@Tag("NumberProcesses")
	public void testsumEvenNumbersTrue() {
		int result  =  utils.sumEvenNumbers(2, 2);
		assertEquals(4, result);
	}
	
	@Test
	@Tag("CharacterProcesses")
	public void testCountLetterOccurence1() {
		int actual = utils.countLetterOccurence("check", 'c');
		assertEquals(2, actual);
	}

	@Test
	@Tag("CharacterProcesses")
	public void testCountLetterOccurence2() {
		int actual = utils.countLetterOccurence("Check", 'c');
		assertEquals(1, actual);
	}

	

}
