    
// TURNING THIS ASSIGNMENT IN INITIALLY USING THE SOLUTION METHODS TO ATTEMPT TO BETTER GRASP CONCEPTS 
// AND AVOID MISINTERPRETATION OF DELIVERABLES
// I PLAN ON RETURNING TO THIS ASSIGNMENT WITH A BETTER AND MORE FLEXIBLE WAY TO ACHIEVE THE DELIVERABLES BEFORE 
// THE FINAL TURN IN DEADLINE

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
            multiplyNumbers(myNumber, 12, 3);
            System.out.println("Result = " + myNumber.number);

            NumberContainer myNumber2 = new NumberContainer();
            multiplyNumbers(myNumber2, 12, 3);
            System.out.println("Result = " + myNumber2.number);

            StringContainer myString = new StringContainer();
            myString.text = "Initial value";
            addText(myString, " - adding new text");
            System.out.println("Modified Text: " + myString.text);

            String myString2 = "Initial Value";
            addText2(myString2, " - Lost this text?");
            System.out.println("Modified Text: " + myString2);

        }
        public static void multiplyNumbers(NumberContainer result, int firstNumber, int secondNumber) {
            result.number = firstNumber * secondNumber;
        }
        public static void multiplyNumbers2(NumberContainer result, int firstNumber, int secondNumber) {
            result = new NumberContainer();
            result.number = firstNumber * secondNumber;
            //Unsure as to how updated result is visible to the calling method, as the new container should make it local to the method?
        }
        public static void addText(StringContainer result, String newText) {
            result.text = result.text + newText;
        }
        public static void addText2(String result, String newText) {
            result = result + newText;
        }
}

