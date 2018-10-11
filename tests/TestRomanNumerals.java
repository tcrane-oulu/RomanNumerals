import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
  @Test
  public void convertToInteger_IsCorrectForI() {
    assertEquals(1, RomanNumerals.convertToInteger("I"));
  }
  @Test
  public void convertToInteger_IsCorrectForV() {
    assertEquals(5, RomanNumerals.convertToInteger("V"));
  }
  @Test
  public void convertToInteger_IsCorrectForX() {
    assertEquals(10, RomanNumerals.convertToInteger("X"));
  }
  @Test
  public void convertToInteger_IsCorrectForL() {
    assertEquals(50, RomanNumerals.convertToInteger("L"));
  }
  @Test
  public void convertToInteger_IsCorrectForC() {
    assertEquals(100, RomanNumerals.convertToInteger("C"));
  }
  @Test
  public void convertToInteger_IsCorrectForD() {
    assertEquals(500, RomanNumerals.convertToInteger("D"));
  }
  @Test
  public void convertToInteger_IsCorrectForM() {
    assertEquals(1000, RomanNumerals.convertToInteger("M"));
  }
  @Test
  public void convertToInteger_IsCorrectForMultipleLetters() {
    assertEquals(2, RomanNumerals.convertToInteger("II"));
    assertEquals(3, RomanNumerals.convertToInteger("III"));

    assertEquals(20, RomanNumerals.convertToInteger("XX"));
    assertEquals(30, RomanNumerals.convertToInteger("XXX"));

    assertEquals(200, RomanNumerals.convertToInteger("CC"));
    assertEquals(300, RomanNumerals.convertToInteger("CCC"));
  }

  @Test
  public void convertToInteger_IsCorrectForCombinations() {
    assertEquals(6, RomanNumerals.convertToInteger("VI"));

    assertEquals(60, RomanNumerals.convertToInteger("LX"));

    assertEquals(600, RomanNumerals.convertToInteger("DC"));
  }

  @Test
  public void convertToInteger_DoesNotAllowRepetition() {
    assertEquals(-1, RomanNumerals.convertToInteger("IIII"));
    assertEquals(-1, RomanNumerals.convertToInteger("XXXX"));
    assertEquals(-1, RomanNumerals.convertToInteger("CCCC"));

    assertEquals(-1, RomanNumerals.convertToInteger("VV"));
    assertEquals(-1, RomanNumerals.convertToInteger("LL"));
    assertEquals(-1, RomanNumerals.convertToInteger("DD"));
  }

  @Test
  public void convertToInteger_DoesAllowSeparatedRepetition() {
    assertEquals(9, RomanNumerals.convertToInteger("IIIVIII"));
  }

  @Test
  public void convertToInteger_1SymbolsAreSubtractedCorrectly() {
    assertEquals(4, RomanNumerals.convertToInteger("IV"));
    assertEquals(9, RomanNumerals.convertToInteger("IX"));

    assertEquals(40, RomanNumerals.convertToInteger("XL"));
    assertEquals(90, RomanNumerals.convertToInteger("XC"));

    assertEquals(400, RomanNumerals.convertToInteger("CD"));
    assertEquals(900, RomanNumerals.convertToInteger("CM"));
  }

  @Test
  public void convertToInteger_OnlyOneSubtractionAllowed() {
    assertEquals(5, RomanNumerals.convertToInteger("IIV"));
    assertEquals(10, RomanNumerals.convertToInteger("IIX"));

    assertEquals(50, RomanNumerals.convertToInteger("XXL"));
    assertEquals(100, RomanNumerals.convertToInteger("XXC"));

    assertEquals(500, RomanNumerals.convertToInteger("CCD"));
    assertEquals(1000, RomanNumerals.convertToInteger("CCM"));
  }

  @Test
  public void convertToInteger_5SymbolsCannotBeSubtracted() {
    assertEquals(15, RomanNumerals.convertToInteger("VX"));
    assertEquals(150, RomanNumerals.convertToInteger("LC"));
    assertEquals(1500, RomanNumerals.convertToInteger("DM"));
  }

  @Test
  public void convertToInteger_WorksForVariousCombinations() {
    assertEquals(1984, RomanNumerals.convertToInteger("MCMLXXXIV"));
    assertEquals(2014, RomanNumerals.convertToInteger("MMXIV"));
  }

  @Test
  public void convertToInteger_WorksForAllBasicCombinations() {
    assertEquals(1, RomanNumerals.convertToInteger("I"));
    assertEquals(2, RomanNumerals.convertToInteger("II"));
    assertEquals(3, RomanNumerals.convertToInteger("III"));
    assertEquals(4, RomanNumerals.convertToInteger("IV"));
    assertEquals(5, RomanNumerals.convertToInteger("V"));
    assertEquals(6, RomanNumerals.convertToInteger("VI"));
    assertEquals(7, RomanNumerals.convertToInteger("VII"));
    assertEquals(8, RomanNumerals.convertToInteger("VIII"));
    assertEquals(9, RomanNumerals.convertToInteger("IX"));

    assertEquals(10, RomanNumerals.convertToInteger("X"));
    assertEquals(20, RomanNumerals.convertToInteger("XX"));
    assertEquals(30, RomanNumerals.convertToInteger("XXX"));
    assertEquals(40, RomanNumerals.convertToInteger("XL"));
    assertEquals(50, RomanNumerals.convertToInteger("L"));
    assertEquals(60, RomanNumerals.convertToInteger("LX"));
    assertEquals(70, RomanNumerals.convertToInteger("LXX"));
    assertEquals(80, RomanNumerals.convertToInteger("LXXX"));
    assertEquals(90, RomanNumerals.convertToInteger("XC"));

    assertEquals(100, RomanNumerals.convertToInteger("C"));
    assertEquals(200, RomanNumerals.convertToInteger("CC"));
    assertEquals(300, RomanNumerals.convertToInteger("CCC"));
    assertEquals(400, RomanNumerals.convertToInteger("CD"));
    assertEquals(500, RomanNumerals.convertToInteger("D"));
    assertEquals(600, RomanNumerals.convertToInteger("DC"));
    assertEquals(700, RomanNumerals.convertToInteger("DCC"));
    assertEquals(800, RomanNumerals.convertToInteger("DCCC"));
    assertEquals(900, RomanNumerals.convertToInteger("CM"));
  }
}
