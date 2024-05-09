package nobel.khandaker;

import nobel.khandaker.leetcode75.KeysAndRooms;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestKeysAndRooms {

    @Test
    public void TestRoomsAndKeys() {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> i1 = List.of(1,3);
        List<Integer> i2 = List.of(3, 0, 1);
        List<Integer> i3 = List.of(2);
        List<Integer> i4 = List.of(0);
        l.add(i1);
        l.add(i2);
        l.add(i3);
        l.add(i4);
        assertFalse(KeysAndRooms.canVisitAllRooms(l));

        l.clear();
        i1 = List.of(1);
        i2 = List.of(2);
        i3 = List.of(3);
        i4 = new ArrayList<Integer>();
        l.add(i1);
        l.add(i2);
        l.add(i3);
        l.add(i4);

        assertTrue(KeysAndRooms.canVisitAllRooms(l));
    }

}
