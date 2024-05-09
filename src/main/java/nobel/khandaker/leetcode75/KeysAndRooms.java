package nobel.khandaker.leetcode75;

import java.util.*;

public class KeysAndRooms {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {

        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[rooms.size()];

        stack.push(0);

        while (!stack.isEmpty()){
            int curr = stack.pop();
            visited[curr] = true;
            List<Integer> neighbors = rooms.get(curr);

            for(Integer neighbor : neighbors ){
                if (!visited[neighbor]){
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }

        for (boolean v : visited){
            if (!v){
                return false;
            }
        }
        return true;
    }
}
