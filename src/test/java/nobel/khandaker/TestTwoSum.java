package nobel.khandaker;

import nobel.khandaker.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestTwoSum {
    @Test
    public void TestTwoSum(){
        assertArrayEquals(
                new int[]{0,1},
                TwoSum.FindIndices(new int[]{3,2,4}, 5));
        assertArrayEquals(
                new int[]{0,1},
                TwoSum.FindIndices(new int[]{2,8,11,15}, 10));
        assertArrayEquals(
                new int[]{0,1},
                TwoSum.FindIndices(new int[]{100,-100}, 0));
    }
}
