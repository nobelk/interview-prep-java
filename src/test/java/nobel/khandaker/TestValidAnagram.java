package nobel.khandaker;

import nobel.khandaker.misc.ValidAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestValidAnagram {
    @Test
    public void anagramTest(){
        ValidAnagram va = new ValidAnagram();
        assertTrue(va.isAnagram("anagram", "nagaram"));
    }
}
