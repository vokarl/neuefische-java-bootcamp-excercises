public class MakeNumberPositive {


        public class Addition {

            public static int add(int a, int b) {
                return a + b;
            }

            public static double add(double a, double b) {
                return a + b;
            }

            public static int subtract(int a, int b) {
                return a - b;
            }

            public static int makePositive(int a) {
                return a < 0 ? -a : a;
            }

            public static void main(String[] args) {
                int number1 = 10;
                int number2 = 20;
                int intAddResult = add(number1, number2);
                int intSubResult = subtract(number1, number2);

                double doubleNumber1 = 10.0;
                double doubleNumber2 = 20.0;
                double doubleResult = add(doubleNumber1, doubleNumber2);

                int negativeNumber = -28;
                int positiveResult = makePositive(negativeNumber);

                System.out.println("The sum of " + number1 + " and " + number2 + " is: " + intAddResult);
                System.out.println("The difference of " + number1 + " and " + number2 + " is: " + intSubResult);
                System.out.println("The sum of " + doubleNumber1 + " and " + doubleNumber2 + " is: " + doubleResult);
                System.out.println("The positive of " + negativeNumber + " is: " + positiveResult);
            }
        }



    }

