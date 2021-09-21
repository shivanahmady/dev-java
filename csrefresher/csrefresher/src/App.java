import java.util.ArrayList;

import javax.lang.model.element.Element;

import datastructures.MyStackT;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("\n\n=====Rotational Cipher====\n\n");
        String output = "";

        String input = "3-elCXZmgdfgj-ETGHYnsdfglDEFGHbra";
        int d = 3;

        ArrayList<Character> cap = new ArrayList<Character>();
        ArrayList<Character> low = new ArrayList<Character>();
        ArrayList<Integer> num = new ArrayList<Integer>();

        char c, l;
        int n;
        for (c = 'A', l = 'a', n = 0; c <= 'Z' && l <= 'z'; ++c, ++l) {
            cap.add(c);
            low.add(l);
            if (n <= 9) {
                num.add(n);
                n++;
            }
            // System.out.print("\n[" + c + "-" + l + "-" + n);
        }

        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            if (cap.contains(x)) {
                int location = (cap.indexOf(x) + d) % cap.size();
                output += cap.get(location);
            } else if (low.contains(x)) {
                int location = (low.indexOf(x) + d) % low.size();
                output += low.get(location);
            } else if (num.contains(Character.getNumericValue(x))) {
                int value = (Character.getNumericValue(x) + d) % num.size();
                output += "" + value + "";
            } else {
                output += x;
            }

        }
        System.out.println("INPUT - - > " + input + "\nOUTPUT = = > " + output + "\n\n");

    }
}
