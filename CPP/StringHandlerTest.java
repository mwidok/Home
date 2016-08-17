import static org.junit.Assert.*;

import org.junit.Test;

public class StringHandlerTest
{
    StringHandler _handler;
    GuiService _service;
    
    public StringHandlerTest()
    {
        _handler = new StringHandler();
        _service = new GuiService();
    }
    
    
    @Test
    public void reverseTest()
    {
        assertEquals("retsmaH", _handler.reverse("Hamster"));
        assertEquals("alBalb", _handler.reverse("blaBla"));
        assertEquals("ollaH", _handler.reverse("Hallo"));
    }
    
    @Test
    public void asciiValTest()
    {
        assertEquals("97 66 99 68 101 70 ", _handler.charValues("aBcDeF"));
        assertEquals("120 86 86 101 70 ", _handler.charValues("xVVeF"));
        assertEquals("74 65 89 65 ", _handler.charValues("JAYA"));
    }
    
    @Test
    public void asciiSumTest()
    {
        assertEquals("501", _handler.valSum("aBcDeF"));
        assertEquals("463", _handler.valSum("xVVeF"));
        assertEquals("1220", _handler.valSum("zzzzzzzzzz"));
    }
    
    @Test
    public void palindromTest()
    {
        assertTrue(_handler.istPalindrom("anna"));
        assertTrue(_handler.istPalindrom("OtTo"));
        assertTrue(_handler.istPalindrom("rotor"));
        assertFalse(_handler.istPalindrom("helloworld"));
        assertFalse(_handler.istPalindrom("haLlo"));
    }
    
    @Test
    public void vowelTest()
    {
        assertEquals("Total: 3, a: 0, e: 1, i: 0, o: 2, u: 0", _handler.displayVowels("HelloWorld"));
        assertEquals("Total: 5, a: 1, e: 1, i: 1, o: 0, u: 2", _handler.displayVowels("Beautiful"));
        assertEquals("Total: 0, a: 0, e: 0, i: 0, o: 0, u: 0", _handler.displayVowels("fsdfldfgm"));
        assertEquals("Total: 5, a: 1, e: 1, i: 1, o: 1, u: 1", _handler.displayVowels("UeIAo"));
        
    }
}
