package com.features;

import java.util.HashMap;
import java.util.List;

public class LocalVariableInference {

    public static void main(String[] args) {
        // Local Variable Type Inference
        var numbers = List.of(1,2,3,4,5);
        numbers.stream().forEach(n -> System.out.println(n));

        for (var i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // can't use
        // var x;
        // var x = 5, y = 10;
        // var x = null;
        // var x[] = new Integer[10];
        // var min = (a, b) -> a < b ? a : b;
        // var minimum = Math::min;
        // var nums = {1,2,3,4,5};

        var x = new Integer[3];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        for (var i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        // With Generics
        var map1 = new HashMap();
        var map2 = new HashMap<>();

        // Anonymous class types
        var runnable = new Runnable() {
            @Override
            public void run() {
                var numbers = List.of(1,2,3,4,5);
                numbers.stream().forEach(n -> System.out.println(n));
            }
        };
        new Thread(runnable).start();

        // Non denotable type
        var map3 = new HashMap<>() {
          int someVar;
        };
    }

}
