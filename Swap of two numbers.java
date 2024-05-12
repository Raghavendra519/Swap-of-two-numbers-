import java.util.ArrayList;

import java.util.List;



class Solution {

    static List<Integer> get(int a, int b) {

        // Add b to a

        a = a + b;



        // Subtract a from the sum and assign it to b

        b = a - b;



        // Subtract b from the sum and assign it to a

        a = a - b;



        // Create a list to store the swapped numbers

        List<Integer> result = new ArrayList<>();

        result.add(a);

        result.add(b);



        return result;

    }

}
