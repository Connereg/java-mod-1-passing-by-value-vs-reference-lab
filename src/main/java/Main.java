 //MUCH clearer understanding of the material after having worked on the Friday project

 //Still having issues of thinking how to differentiate this process from the solution examples however
 //Altered the math behind the multiplyNumbers function and changed the output messages to reflect the desired outcomes

    
class NumberContainer {
    public int number;
}
class StringContainer {
    public String text;
}

public class Main {
        public static void main(String[] args) {
            // your code here
            NumberContainer myNumber = new NumberContainer();
            multiplyNumbers(myNumber, 43, 2);
            System.out.println("Result (will be a number!) = " + myNumber.number);

            NumberContainer myNumber2 = new NumberContainer();
            multiplyNumbers2(myNumber2, 19, 2);
            System.out.println("Result (Result will be 0) = " + myNumber2.number);

            StringContainer myString = new StringContainer();
            myString.text = "Initial value";
            addText(myString, " - adding new text");
            System.out.println("The String after this will be visible " + myString.text);

            String myString2 = "Initial Value";
            addText2(myString2, " - Lost this text?");
            System.out.println("The String after this will disappear! " + myString2);

        }
        public static void multiplyNumbers(NumberContainer result, int firstNumber, int secondNumber) {
            result.number = firstNumber * secondNumber * firstNumber * secondNumber;
        }
        public static void multiplyNumbers2(NumberContainer result, int firstNumber, int secondNumber) {
            result = new NumberContainer();
            result.number = firstNumber * secondNumber * firstNumber * secondNumber;
        }
        public static void addText(StringContainer result, String newText) {
            result.text = result.text + newText;
        }
        public static void addText2(String result, String newText) {
            result = result + newText;
        }
}

