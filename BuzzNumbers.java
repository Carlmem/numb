package numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuzzNumbers {
    public void number() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Amazing Numbers!\n" +
                "\n" +
                "Supported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter two natural numbers to obtain the properties of the list:\n" +
                "  * the first parameter represents a starting number;\n" +
                "  * the second parameter shows how many consecutive numbers are to be processed;\n" +
                "- two natural numbers and properties to search for;\n" +
                "- a property preceded by minus must not be present in numbers;\n" +
                "- separate the parameters with one space;\n" +
                "- enter 0 to exit.");
        boolean stop = true;
        while (stop) {
            System.out.print("Enter a request: ");
            String number = scanner.nextLine();
            if (number.contains(" ")) {
                String[] n = number.split(" ");
                try {
                    Long.parseLong(n[0]);
                } catch (NumberFormatException e) {
                    System.out.println("The first parameter should be a natural number or zero.");
                    continue;
                }
                try {
                    Long.parseLong(n[1]);
                } catch (NumberFormatException e) {
                    System.out.println("The first parameter should be a natural number or zero.");
                    continue;
                }
                long n1 = Long.parseLong(n[0]);
                long n2 = Long.parseLong((n[1]));
                checkNumber(n1);
                checkNumber2(n2);
                if (n.length == 3) {
                    if (uTrue(n[2])) {
                        long i = 0;
                        while (i != n2) {
                            String str = n1 + " is " + EvenS(n1) + OddS(n1) + findDuckS(n1) + findBuzzS(n1) + findGapfulS(n1) +
                                    findPalindromicS(n1) + findSpyS(n1) + findSunnyS(n1) + findSquareS(n1) + findJumpingS(n1) +
                                    findSadS(n1) + findHappys(n1);
                            if (str.contains(n[2].toLowerCase()) || n[2].contains("-") && !str.contains(n[2].replace('-', ' ').toLowerCase())) {
                                System.out.println(str);
                                i++;
                            }
                            n1++;
                        }
                    } else {
                        System.out.println("The property " + n[2] +  " is wrong.");
                        System.out.println("Available properties:\n" +
                                "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                    }
                } else if (n.length == 4) {
                    if (uTrue(n[2]) && uTrue(n[3])) {
                        long i = 0;
                        if (thisTrue(n)) {
                        } else {
                            while (i != n2) {
                                String str = n1 + " is " + EvenS(n1) + OddS(n1) + findDuckS(n1) + findBuzzS(n1) + findGapfulS(n1) +
                                        findPalindromicS(n1) + findSpyS(n1) + findSunnyS(n1) + findSquareS(n1) + findJumpingS(n1) +
                                        findSadS(n1) + findHappys(n1);
                                if (str.contains(n[2].toLowerCase()) || n[2].contains("-") && !str.contains(n[2].replace('-', ' ').toLowerCase())) {
                                    if (str.contains(n[3].toLowerCase()) || n[3].contains("-") && !str.contains(n[3].replace('-', ' ').toLowerCase())) {
                                        System.out.println(str);
                                        i++;
                                    }
                                }
                                n1++;
                            }
                        }
                    } else {
                        if (!uTrue(n[2]) && !uTrue(n[3])) {
                            System.out.println("The properties [" + n[2] + ", " + n[3] + "] are wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        }else if (!uTrue(n[2])) {
                            System.out.println("The property " + n[2] +  " is wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        } else if (!uTrue(n[3])) {
                            System.out.println("The property " + n[3] +  " is wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]]");
                        }
                    }
                } else if (n.length == 5) {
                    if (uTrue(n[2]) && uTrue(n[3]) && uTrue(n[4])) {
                        long i = 0;
                        if (thisTrue(n)) {
                        } else {
                            while (i != n2) {
                                String str = n1 + " is " + EvenS(n1) + OddS(n1) + findDuckS(n1) + findBuzzS(n1) + findGapfulS(n1) +
                                        findPalindromicS(n1) + findSpyS(n1) + findSunnyS(n1) + findSquareS(n1) + findJumpingS(n1) +
                                        findSadS(n1) + findHappys(n1);
                                if (str.contains(n[2].toLowerCase()) || n[2].contains("-") && !str.contains(n[2].replace('-', ' ').toLowerCase())) {
                                    if (str.contains(n[3].toLowerCase()) || n[3].contains("-") && !str.contains(n[3].replace('-', ' ').toLowerCase())) {
                                        if (str.contains(n[4].toLowerCase()) || n[4].contains("-") && !str.contains(n[4].replace('-', ' ').toLowerCase())) {
                                            System.out.println(str);
                                            i++;
                                        }
                                    }
                                }
                                n1++;
                            }
                        }
                    } else {
                        if (!uTrue(n[2]) && !uTrue(n[3]) && !uTrue(n[4])) {
                            System.out.println("The properties [" + n[2] + ", " + n[3] + ", " + n[4] + "] are wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        }else if (!uTrue(n[2]) && !uTrue(n[3])) {
                            System.out.println("The properties [" + n[2] + ", " + n[3] + "] are wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        }else if (!uTrue(n[2])) {
                            System.out.println("The property " + n[2] +  " is wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        } else if (!uTrue(n[3])) {
                            System.out.println("The property " + n[3] +  " is wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        } else if (!uTrue(n[4])) {
                            System.out.println("The property " + n[3] +  " is wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        }
                    }
                } else if (n.length == 6) {
                    if (uTrue(n[2]) && uTrue(n[3]) && uTrue(n[4]) && uTrue(n[5])) {
                        long i = 0;
                        if (thisTrue(n)) {
                        } else {
                            while (i != n2) {
                                String str = n1 + " is " + EvenS(n1) + OddS(n1) + findDuckS(n1) + findBuzzS(n1) + findGapfulS(n1) +
                                        findPalindromicS(n1) + findSpyS(n1) + findSunnyS(n1) + findSquareS(n1) + findJumpingS(n1) +
                                        findSadS(n1) + findHappys(n1);
                                if (str.contains(n[2].toLowerCase()) || n[2].contains("-") && !str.contains(n[2].replace('-', ' ').toLowerCase())) {
                                    if (str.contains(n[3].toLowerCase()) || n[3].contains("-") && !str.contains(n[3].replace('-', ' ').toLowerCase())) {
                                        if (str.contains(n[4].toLowerCase()) || n[4].contains("-") && !str.contains(n[4].replace('-', ' ').toLowerCase())) {
                                            if(str.contains(n[5].toLowerCase()) || n[5].contains("-") && !str.contains(n[5].replace('-', ' ').toLowerCase())) {
                                                System.out.println(str);
                                                i++;
                                            }
                                        }
                                    }
                                }
                                n1++;
                            }
                        }
                    } else {
                        if (!uTrue(n[2]) && !uTrue(n[3]) && !uTrue(n[4]) && !uTrue(n[5])) {
                            System.out.println("The properties [" + n[2] + ", " + n[3] + ", " + n[4] + ", " + n[5] + "] are wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        }else if (!uTrue(n[2]) && !uTrue(n[3]) && !uTrue(n[4])) {
                            System.out.println("The properties [" + n[2] + ", " + n[3] + ", " + n[4] + "] are wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        }else if (!uTrue(n[2]) && !uTrue(n[3])) {
                            System.out.println("The properties [" + n[2] + ", " + n[3] + "] are wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        }else if (!uTrue(n[2])) {
                            System.out.println("The property " + n[2] +  " is wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        } else if (!uTrue(n[3])) {
                            System.out.println("The property " + n[3] +  " is wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        } else if (!uTrue(n[4])) {
                            System.out.println("The property " + n[4] +  " is wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        } else if (!uTrue(n[5])) {
                            System.out.println("The property " + n[5] +  " is wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        }
                    }
                } else if (n.length == 7) {
                    if (uTrue(n[2]) && uTrue(n[3]) && uTrue(n[4]) && uTrue(n[5]) && uTrue(n[6])) {
                        long i = 0;
                        if (thisTrue(n)) {
                        } else {
                            while (i != n2) {
                                String str = n1 + " is " + EvenS(n1) + OddS(n1) + findDuckS(n1) + findBuzzS(n1) + findGapfulS(n1) +
                                        findPalindromicS(n1) + findSpyS(n1) + findSunnyS(n1) + findSquareS(n1) + findJumpingS(n1) +
                                        findSadS(n1) + findHappys(n1);
                                if (str.contains(n[2].toLowerCase()) || n[2].contains("-") && !str.contains(n[2].replace('-', ' ').toLowerCase())) {
                                    if (str.contains(n[3].toLowerCase()) || n[3].contains("-") && !str.contains(n[3].replace('-', ' ').toLowerCase())) {
                                        if (str.contains(n[4].toLowerCase()) || n[4].contains("-") && !str.contains(n[4].replace('-', ' ').toLowerCase())) {
                                            if(str.contains(n[5].toLowerCase()) || n[5].contains("-") && !str.contains(n[5].replace('-', ' ').toLowerCase())) {
                                                if(str.contains(n[6].toLowerCase()) || n[6].contains("-") && !str.contains(n[6].replace('-', ' ').toLowerCase())) {
                                                    System.out.println(str);
                                                    i++;
                                                }
                                            }
                                        }
                                    }
                                }
                                n1++;
                            }
                        }
                    } else {
                        if (!uTrue(n[2]) && !uTrue(n[3]) && !uTrue(n[4]) && !uTrue(n[5]) && !uTrue(n[6])) {
                            System.out.println("The properties [" + n[2] + ", " + n[3] + ", " + n[4] + ", " + n[5] + ", " + n[6] +
                                    "] are wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        }else if (!uTrue(n[2]) && !uTrue(n[3]) && !uTrue(n[4]) && !uTrue(n[5])) {
                            System.out.println("The properties [" + n[2] + ", " + n[3] + ", " + n[4] + ", " + n[5] + "] are wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        }else if (!uTrue(n[2]) && !uTrue(n[3]) && !uTrue(n[4])) {
                            System.out.println("The properties [" + n[2] + ", " + n[3] + ", " + n[4] + "] are wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]]");
                        }else if (!uTrue(n[2]) && !uTrue(n[3])) {
                            System.out.println("The properties [" + n[2] + ", " + n[3] + "] are wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        }else if (!uTrue(n[2])) {
                            System.out.println("The property " + n[2] +  " is wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        } else if (!uTrue(n[3])) {
                            System.out.println("The property " + n[3] +  " is wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        } else if (!uTrue(n[4])) {
                            System.out.println("The property " + n[4] +  " is wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        } else if (!uTrue(n[5])) {
                            System.out.println("The property " + n[5] +  " is wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        } else if (!uTrue(n[6])) {
                            System.out.println("The property " + n[6] +  " is wrong.");
                            System.out.println("Available properties:\n" +
                                    "[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                        }
                    }
                } else {
                    for (long i = n1; i < n1 + n2; i ++) {
                        System.out.println(i + " is " + EvenS(i) + OddS(i) + findDuckS(i) + findBuzzS(i) + findGapfulS(i) +
                                findPalindromicS(i) + findSpyS(i) + findSunnyS(i) + findSquareS(i) + findJumpingS(i) +
                                findSadS(i) + findHappys(i));
                    }
                }
            } else if (number.isEmpty()) {
                System.out.println("Supported requests:\n" +
                        "- enter a natural number to know its properties;\n" +
                        "- enter two natural numbers to obtain the properties of the list:\n" +
                        "  * the first parameter represents a starting number;\n" +
                        "  * the second parameter shows how many consecutive numbers are to be processed;\n" +
                        "- separate the parameters with one space;\n" +
                        "- enter 0 to exit.");
            } else {
                long numbers;
                try {
                    Long.parseLong(number);
                } catch (NumberFormatException e) {
                    System.out.println("The first parameter should be a natural number or zero.");
                    continue;
                }
                numbers = Long.parseLong(number);
                if (numbers == 0) {
                    System.out.println("Goodbye!");
                    stop = false;
                    System.exit(0);
                }
                if (numbers < 1) {
                    System.out.println("The first parameter should be a natural number or zero.");
                } else {
                    System.out.println("Properties of " + number);
                    System.out.println("even: " + Even(numbers));
                    System.out.println("odd: " + Odd(numbers));
                    System.out.println("buzz: " + findBuzz(numbers));
                    System.out.println("duck: " + findDuck(numbers));
                    System.out.println("palindromic: " + findPalindromic(numbers));
                    System.out.println("gapful: " + findGapful(numbers));
                    System.out.println("spy: " + findSpy(numbers));
                    System.out.println("square: " + findSquare(numbers));
                    System.out.println("sunny: " + findSunny(numbers));
                    System.out.println("jumping: " + findJumping(numbers));
                    System.out.println("happy: " + findHappy(numbers));
                    System.out.println("sad: " + findSad(numbers));
                }
            }
        }


    }
    public boolean uTrue (String n) {
        List<String> ListStr = List.of("EVEN", "ODD", "BUZZ", "DUCK", "PALINDROMIC", "GAPFUL", "SPY", "SUNNY", "SQUARE", "JUMPING",
                "-EVEN", "-ODD", "-BUZZ", "-DUCK", "-PALINDROMIC", "-GAPFUL", "-SPY", "-SUNNY", "-SQUARE", "-JUMPING", "SAD", "HAPPY", "-SAD", "-HAPPY" );
        for (int i = 0; i < ListStr.size(); i++) {
            if (n.equalsIgnoreCase(ListStr.get(i))) {
                return true;
            }
        }
        return false;
    }
    public boolean thisTrue (String[] n) {
        List<String> ListStr = new ArrayList<>(List.of(n[2]));
        for (int i = 3; i < n.length; i++) {
            ListStr.add(n[i].toLowerCase());
        }
        if (ListStr.contains("even") && ListStr.contains("odd")) {
            System.out.println("The request contains mutually exclusive properties: [even, odd]"  +
                    "\n" +
                    "There are no numbers with these properties.");
            return true;
        } else if (ListStr.contains("duck") && ListStr.contains("spy")) {
            System.out.println("The request contains mutually exclusive properties: [duck, spy]"  +
                    "\n" +
                    "There are no numbers with these properties.");
            return true;
        } else if (ListStr.contains("sunny") && ListStr.contains("square")) {
            System.out.println("The request contains mutually exclusive properties: [sunny, square]"  +
                    "\n" +
                    "There are no numbers with these properties.");
            return true;
        } else if (ListStr.contains("even") && ListStr.contains("-even")) {
            System.out.println("The request contains mutually exclusive properties: [even, -even]" +
                    "\n" +
                    "There are no numbers with these properties.");
            return true;
        } else if (ListStr.contains("odd") && ListStr.contains("-odd")) {
            System.out.println("The request contains mutually exclusive properties: [odd, -odd]" +
                    "\n" +
                    "There are no numbers with these properties.");
            return true;
        } else if (ListStr.contains("buzz") && ListStr.contains("-buzz")) {
            System.out.println("The request contains mutually exclusive properties: [buzz, -buzz]" +
                    "\n" +
                    "There are no numbers with these properties.");
            return true;
        } else if (ListStr.contains("duck") && ListStr.contains("-duck")) {
            System.out.println("The request contains mutually exclusive properties: [duck, -duck]" +
                    "\n" +
                    "There are no numbers with these properties.");
            return true;
        } else if (ListStr.contains("palindromic") && ListStr.contains("-palindromic")) {
            System.out.println("The request contains mutually exclusive properties: [palindromic, -palindromic]" +
                    "\n" +
                    "There are no numbers with these properties.");
            return true;
        } else if (ListStr.contains("gapful") && ListStr.contains("-gapful")) {
            System.out.println("The request contains mutually exclusive properties: [gapful, -gapful]" +
                    "\n" +
                    "There are no numbers with these properties.");
            return true;
        } else if (ListStr.contains("spy") && ListStr.contains("-spy")) {
            System.out.println("The request contains mutually exclusive properties: [spy, -spy]" +
                    "\n" +
                    "There are no numbers with these properties.");
            return true;
        } else if (ListStr.contains("sunny") && ListStr.contains("-sunny")) {
            System.out.println("The request contains mutually exclusive properties: [sunny, -sunny]" +
                    "\n" +
                    "There are no numbers with these properties.");
            return true;
        } else if (ListStr.contains("square") && ListStr.contains("-square")) {
            System.out.println("The request contains mutually exclusive properties: [square, -square]" +
                    "\n" +
                    "There are no numbers with these properties.");
            return true;
        } else if (ListStr.contains("jumping") && ListStr.contains("-jumping")) {
            System.out.println("The request contains mutually exclusive properties: [jumping, -jumping]" +
                    "\n" +
                    "There are no numbers with these properties.");
            return true;
        } else if (ListStr.contains("sad") && ListStr.contains("-sad")) {
            System.out.println("The request contains mutually exclusive properties: [sad, -sad]" +
                    "\n" +
                    "There are no numbers with these properties.");
            return true;
        } else if (ListStr.contains("happy") && ListStr.contains("-happy")) {
            System.out.println("The request contains mutually exclusive properties: [happy, -happy]" +
                    "\n" +
                    "There are no numbers with these properties.");
            return true;
        } else if (ListStr.contains("-odd") && ListStr.contains("-even")) {
            System.out.println("The request contains mutually exclusive properties: [-odd, -even]" +
                    "\n" +
                    "There are no numbers with these properties.");
            return true;
        } else {
            return false;
        }
    }
    public boolean Even (long number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;

        }
    }
    public boolean Odd (long number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean findBuzz (long number) {
        if (number % 7 == 0 && end7(number)) {
            return true;
        } else if (end7(number)) {
            return true;
        } else if (number % 7 == 0) {
            return true;
        } else {
            return false;

        }
    }
    public boolean end7 (long number) {
        String str = Long.toString(number);
        char k = str.charAt(str.length() - 1);
        if (k == '7') {
            return true;
        } else {
            return false;
        }
    }
    public void checkNumber (long number) {
        if (number < 1) {
            System.out.println("The first parameter should be a natural number or zero.");
        }
    }
    public void checkNumber2 (long number) {
        if (number < 1) {
            System.out.println("The second parameter should be a natural number.");
        }
    }
    public boolean findDuck(long number) {
        String str = Long.toString(number);
        boolean stop = false;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == '0') {
                stop = true;
            }
        }
        if (stop) {
            return true;
        } else {
            return  false;
        }
    }
    public boolean findPalindromic (long number) {
        String str = Long.toString(number);
        StringBuilder unStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            unStr.append(str.charAt(i));
        }
        if (str.contentEquals(unStr)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean findGapful (long number) {
        String str = Long.toString(number);
        String sm;
        if (str.length()  >= 3) {
            sm = Character.toString(str.charAt(0)) + Character.toString(str.charAt(str.length() - 1));
            if (number % Integer.parseInt(sm) == 0) {
                return true;
            } else {
                return  false;
            }
        } else {
            return  false;
        }
    }
    public boolean findSpy (long number) {
        String str = Long.toString(number);
        long sum = 0;
        long per = 1;
        for (int i = 0; i < str.length(); i++) {
            long l = Long.parseLong(Character.toString(str.charAt(i)));
            sum += l;
            per *= l;
        }
        if (sum == per) {
            return true;
        } else {
            return false;
        }
    }
    public boolean findSquare (long number) {
        String str = Long.toString(number);
        double numb = Double.parseDouble(str);
        if (Math.sqrt(numb) % 1 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean findSunny (long number) {
        String str = Long.toString(number);
        double numb = Double.parseDouble(str);
        if (Math.sqrt(numb + 1) % 1 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean findJumping (long number) {
        String str = Long.toString(number);
        for (int i = 1; i < str.length(); i++) {
            if (Integer.parseInt(String.valueOf(str.charAt(i - 1))) + 1 == Integer.parseInt(String.valueOf(str.charAt(i)))) {
            } else if (Integer.parseInt(String.valueOf(str.charAt(i - 1))) - 1 == Integer.parseInt(String.valueOf(str.charAt(i)))) {
            } else {
                return false;
        }
        }
        return true;
    }
    public boolean findHappy (long number) {
        String str = Long.toString(number);
        long sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))), 2);
        }
        while (sum != 1 && sum != 4 && sum != number) {
            long k = sum;
            String s = Long.toString(k);
            sum = 0;
            for (int j = 0; j < s.length(); j++) {
                sum += Math.pow(Integer.parseInt(String.valueOf(s.charAt(j))), 2);
            }
        }
        if (sum == 1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean findSad (long number) {
        String str = Long.toString(number);
        long sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))), 2);
        }
        while (sum != 1 && sum != 4 && sum != number) {
            long k = sum;
            String s = Long.toString(k);
            sum = 0;
            for (int j = 0; j < s.length(); j++) {
                sum += Math.pow(Integer.parseInt(String.valueOf(s.charAt(j))), 2);
            }
        }
        if (sum == 4 || sum == number && sum != 1) {
            return true;
        } else {
            return false;
        }
    }
    public String EvenS (long number) {
        if (number % 2 == 0) {
            return "even ";
        } else {
            return "";

        }
    }
    public String OddS (long number) {
        if (number % 2 != 0) {
            return "odd ";
        } else {
            return "";
        }
    }
    public String findBuzzS (long number) {
        if (number % 7 == 0 && end7(number)) {
            return "buzz ";
        } else if (end7(number)) {
            return "buzz ";
        } else if (number % 7 == 0) {
            return "buzz ";
        } else {
            return "";

        }
    }
    public String findDuckS(long number) {
        String str = Long.toString(number);
        boolean stop = false;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == '0') {
                stop = true;
            }
        }
        if (stop) {
            return "duck ";
        } else {
            return  "";
        }
    }
    public String findPalindromicS (long number) {
        String str = Long.toString(number);
        StringBuilder unStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            unStr.append(str.charAt(i));
        }
        if (str.contentEquals(unStr)) {
            return "palindromic ";
        } else {
            return "";
        }
    }
    public String findGapfulS (long number) {
        String str = Long.toString(number);
        String sm;
        if (str.length()  >= 3) {
            sm = Character.toString(str.charAt(0)) + Character.toString(str.charAt(str.length() - 1));
            if (number % Integer.parseInt(sm) == 0) {
                return "gapful ";
            } else {
                return  "";
            }
        } else {
            return  "";
        }
    }
    public String findSpyS (long number) {
        String str = Long.toString(number);
        long sum = 0;
        long per = 1;
        for (int i = 0; i < str.length(); i++) {
            long l = Long.parseLong(Character.toString(str.charAt(i)));
            sum += l;
            per *= l;
        }
        if (sum == per) {
            return "spy ";
        } else {
            return "";
        }
    }
    public String findSquareS (long number) {
        String str = Long.toString(number);
        double numb = Double.parseDouble(str);
        if (Math.sqrt(numb) % 1 == 0) {
            return "square ";
        } else {
            return "";
        }
    }
    public String findSunnyS (long number) {
        String str = Long.toString(number);
        double numb = Double.parseDouble(str);
        if (Math.sqrt(numb + 1) % 1 == 0) {
            return "sunny ";
        } else {
            return "";
        }
    }
    public String findJumpingS (long number) {
        String str = Long.toString(number);
        for (int i = 1; i < str.length(); i++) {
            if (Integer.parseInt(String.valueOf(str.charAt(i - 1))) + 1 == Integer.parseInt(String.valueOf(str.charAt(i)))) {
            } else if (Integer.parseInt(String.valueOf(str.charAt(i - 1))) - 1 == Integer.parseInt(String.valueOf(str.charAt(i)))) {
            } else {
                return "";
            }
        }
        return "jumping ";
    }
    public String findHappys (long number) {
        String str = Long.toString(number);
        long sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))), 2);
        }
        while (sum != 1 && sum != 4 && sum != number) {
            long k = sum;
            String s = Long.toString(k);
            sum = 0;
            for (int j = 0; j < s.length(); j++) {
                sum += Math.pow(Integer.parseInt(String.valueOf(s.charAt(j))), 2);
            }
        }
        if (sum == 1) {
            return "happy ";
        } else {
            return "";
        }
    }
    public String findSadS (long number) {
        String str = Long.toString(number);
        long sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))), 2);
        }
        while (sum != 1 && sum != 4 && sum != number) {
            long k = sum;
            String s = Long.toString(k);
            sum = 0;
            for (int j = 0; j < s.length(); j++) {
                sum += Math.pow(Integer.parseInt(String.valueOf(s.charAt(j))), 2);
            }
        }
        if (sum == 4 || sum == number && sum != 1) {
            return "sad ";
        } else {
            return "";
        }
    }
}
