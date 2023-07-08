package Java.ClassWithReflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodWithReflection {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Quiz quiz = new Quiz();
        Method[] methods = quiz.getClass().getDeclaredMethods();

        for (var method : methods) {
            method.invoke(quiz);
        }
    }

    private static class Quiz {
        void quiz1() {
            StringBuilder sb = new StringBuilder();
            int[] arr = new int[5];
            Arrays.fill(arr, 10);

            for (int n : arr) {
                sb.append(n).append(' ');
            }
            System.out.println(sb);
        }

        void quiz2() {
            int[] arr = new int[5];
            Arrays.fill(arr, 10);

            System.out.println(arr[0] + arr[3]);
        }

        void quiz3() {
            StringBuilder sb = new StringBuilder();
            char[] arr = { 'A', 'P', 'P', 'L', 'E' };

            for (char c : arr) {
                sb.append((char) (c & ~32));
            }
            System.out.println(sb);
        }
    }
}