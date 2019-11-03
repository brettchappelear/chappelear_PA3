import java.security.SecureRandom;
import java.util.Scanner;

public class problem1 {
    public static int questionAndAnswer(int diffLevel) {
        SecureRandom rand = new SecureRandom();
        int firstNumber = 0;
        int secondNumber = 0;

        switch (diffLevel) {
            case 1:
                firstNumber = rand.nextInt(9) + 1;
                secondNumber = rand.nextInt(9) + 1;
                break;
            case 2:
                firstNumber = rand.nextInt(89) + 10;
                secondNumber = rand.nextInt(89) + 10;
                break;
            case 3:
                firstNumber = rand.nextInt(899) + 100;
                secondNumber = rand.nextInt(899) + 100;
                break;
            case 4:
                firstNumber = rand.nextInt(8999) + 1000;
                secondNumber = rand.nextInt(8999) + 1000;
                break;
        }
        System.out.println("What is " + firstNumber + " times " + secondNumber + "?");
        return firstNumber * secondNumber;
    }


    public static String correctResponses() {
        String[] correctResponses = new String[4];
        correctResponses[0] = "Very good!";
        correctResponses[1] = "Excellent!";
        correctResponses[2] = "Nice work!";
        correctResponses[3] = "Keep up the good work!";
        SecureRandom rand = new SecureRandom();
        int b;
        String realResponse = "";

        b = rand.nextInt(4);
        switch (b) {
            case 0:
                realResponse = correctResponses[0];
                break;
            case 1:
                realResponse = correctResponses[1];
                break;
            case 2:
                realResponse = correctResponses[2];
                break;
            case 3:
                realResponse = correctResponses[3];
                break;
        }
    return realResponse;

    }

    public static String wrongResponses() {
        String[] wrongResponses = new String[4];
        wrongResponses[0] = "No. Please try again.";
        wrongResponses[1] = "Wrong. Try once more.";
        wrongResponses[2] = "Don't give up!";
        wrongResponses[3] = "No. Keep trying.";
        int a;
        String realResponse = "";
        SecureRandom rand = new SecureRandom();
        a = rand.nextInt(4);
        switch (a) {
            case 0:
                realResponse = wrongResponses[0];
                break;
            case 1:
                realResponse = wrongResponses[1];
                break;
            case 2:
                realResponse = wrongResponses[2];
                break;
            case 3:
                realResponse = wrongResponses[3];
                break;
        }
        return realResponse;
    }

    /*public static int typeOfProblem(int a) {
        switch (a) {
            case 1:
                difficultyLevel();

        }
    }
*/

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        float numberOfQuestions = 0;
        float correctAnswer;
        float userAnswer;
        int userChoice;
        float correctCounter = 0;
        float wrongCounter = 0;
        float successRate = 0;
        int userDifficulty;
        int userProblemType;
        boolean resetOption;

        do {
            System.out.print("Which difficulty level would you like?");
            System.out.println(" 1 for 1 digit, 2 for 2 digits, 3 for 3 digits, and 4 for 4 digits:");
            userDifficulty = scnr.nextInt();
            System.out.println("What type of problem do you want? 1 = addition, 2 = multiplication, 3 = subtraction, 4 = division, 5 = mixture");
            userProblemType = scnr.nextInt();
            while (numberOfQuestions != 10) {
                correctAnswer = questionAndAnswer(userDifficulty);
                userAnswer = scnr.nextInt();

                if (userAnswer == correctAnswer) {
                    System.out.println(correctResponses());
                    correctCounter++;
                }

                if (userAnswer != correctAnswer) {
                    System.out.println(wrongResponses());
                    wrongCounter++;
                }
                numberOfQuestions++;
            }
            successRate = correctCounter / 10;
            if (successRate >= .75) {
                System.out.println("Congratulations, you are ready to go to the next level!");
            } else {
                System.out.println("Please ask your teacher for extra help.");
            }
            System.out.println("Number of correct responses: " + correctCounter);
            System.out.println("Number of wrong responses: " + wrongCounter);
            numberOfQuestions = 0;
            correctCounter = 0;
            wrongCounter = 0;

            System.out.println("Do you want to reset? 1 = yes and 0 = no");
            userChoice = scnr.nextInt();
            if(userChoice == 1) {
                resetOption = true;
            }
            else if (userChoice == 0){
                break;
            }
        } while (resetOption = true);
    }
}


