package nobel.khandaker;

import nobel.khandaker.misc.ReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestReverseString {

    @Test
    public void TestReversal(){
        ReverseString rv = new ReverseString();
        char[] s = {'h','e','l','l','o'};
        rv.reverseString(s);

        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, s);
    }
}
