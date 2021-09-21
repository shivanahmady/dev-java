 System.out.println("==========================");
        ////
        ////////
        ////
        ////////
        ////
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Loan Amount:");
        double amount = scanner.nextInt();

        System.out.println("Enter Duration(# of Months):");
        double duration = scanner.nextInt();
        // Scanner class:
        // Read a byte - nextByte()
        // Read a short - nextShort()
        // Read an int - nextInt()
        // Read a long - nextLong()
        // Read a float - nextFloat()
        // Read a double - nextDouble()
        // Read a boolean - nextBoolean()
        // Read a complete line - nextLine()
        // Read a word - next()

        double RATE = 0.1, amount_owed = amount, payment = 0;
        int month = 0;

        while (month < duration) {
            payment = amount_owed * RATE;
            amount_owed -= payment;
            month++;

            System.out.println("\n\n MONTH--" + month + "| Payment: $" + payment + " | Remaining Amount: $"
                    + amount_owed + "\n\n");

        }
