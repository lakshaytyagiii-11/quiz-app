import java.util.Scanner;
import java.util.List;  


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepPlaying = true;

        while (keepPlaying) {
            System.out.println("\n🎉 Welcome to the Ultimate Sports Quiz! 🎉");
            System.out.println("==========================================");
            System.out.println("Select a quiz topic:");
            System.out.println("1. Cricket 🏏");
            System.out.println("2. Football ⚽");
            System.out.println("3. Tennis 🎾");
            System.out.println("4. Badminton 🏸");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = -1;
           
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            if (choice == 5) {
                keepPlaying = false;
                System.out.println("Thanks for playing! Goodbye! 👋");
                continue;
            }

            List<Question> questions = null;

           
            switch (choice) {
                case 1:
                    questions = QuizData.getCricketQuestions();
                    break;
                case 2:
                    questions = QuizData.getFootballQuestions();
                    break;
                case 3:
                    questions = QuizData.getTennisQuestions();
                    break;
                case 4:
                    questions = QuizData.getBadmintonQuestions();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 5.");
                    continue; 
            }

            
            if (questions != null) {
                Quiz quiz = new Quiz(questions);
                quiz.startQuiz();
                int score = quiz.getScore();
                System.out.println("\nQuiz Over! Your final score is: " + score + " out of " + questions.size());

                
                if (score > 7) {
                    Congratulations.display();
                }
            }
        }
        scanner.close();
    }
}
