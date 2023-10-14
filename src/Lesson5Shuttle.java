public class Lesson5Shuttle {
    final static int SHUTTLE_NUMBER = 100;
    final static int[] digits = {4, 9};

    private static boolean hasDigits(int number, int ...digitsToSearch){
        int r = number % 10;
        if (r == 0)
            r = number;
        for (int d: digitsToSearch)
            if (r == d)
                return true;
        if (r % 10 == 0 && r < 10)
            return false;
        return hasDigits(number / 10, digitsToSearch);
    }

    public static void main(String[] args) {
        System.out.println("Номери " + SHUTTLE_NUMBER + " космічних шатлів:");
        int numToCheck = 0;
        int shuttleCount = 0;
        do {
            numToCheck++;

            // В умові вказано "У Японії числа 4 та 9 вважаються нещасливими. ...щоб не траплялося нещасливих чисел."
            // Символи, які використовуються для позначення чисел називаються цифрами.
            // Якщо тільки "ЧИСЛА 4 та 9 вважаються нещасливими", то
            //if (numToCheck == 4 || numToCheck == 9)
            //    continue;

            // Якщо нещасливими є всі ЧИСЛА де зустрічаються ЦИФРИ 4 та 9, то
            if (hasDigits(numToCheck, digits))
                continue;

            shuttleCount++;
            System.out.println("№ " + numToCheck);
        } while (shuttleCount < SHUTTLE_NUMBER);

    }
}
