import java.util.Scanner;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Loan Amount:");
        double amount = scanner.nextInt();

        System.out.println("Enter Duration(# of Months):");
        double duration = scanner.nextInt();

        double RATE = 0.1, amount_owed = amount, payment = 0;
        int month = 0;

        while (month < duration) {
            payment = amount_owed * RATE;
            amount_owed -= payment;
            month++;

            System.out.println("\n\n MONTH--" + month + "| Payment: $" + payment + " | Remaining Amount: $"
                    + amount_owed + "\n\n");

        }

        System.out.println("==========================");
        ////
        ////////
        ////
        ////////
        ////
        scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        System.out.println("----------");

        /***
         * INEFFICIENT Adds an extra array, then loops the first array in reverse to
         * populate the added array
         */

        char[] result = new char[arr.length];
        int x = arr.length - 1;
        for (char t : arr) {
            result[x] = t;
            x--;
        }
        System.out.println(result);

        /***
         * N/2 Only 1 extra char variable used
         */

        int i = 0;
        for (int ii = arr.length - 1; ii > arr.length / 2; ii--, i++) {
            char lvals = arr[i];
            arr[i] = arr[ii];
            arr[ii] = lvals;
        }
        System.out.println(arr);

        /***
         * STRING BUILDER
         */

        String xtemp = new StringBuilder("hi").reverse().toString();
        System.out.println(xtemp);
// STRING MINIPULATION
//PALINDROME


// STRING MINIPULATION
//MATCHING ALL ()





//FREQUENCY


