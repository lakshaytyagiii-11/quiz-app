import java.util.List;
import java.util.Scanner;
import java.util.Collections;


public class Quiz {
    private final List<Question> questions;
    private int score;
    private final Scanner scanner;

    
    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.score = 0;
        this.scanner = new Scanner(System.in);
    }

    
    public void startQuiz() {
        
        Collections.shuffle(questions); 

        for (int i = 0; i < questions.size(); i++) {
            Question currentQuestion = questions.get(i);
            System.out.println("\n------------------------------------------");
            System.out.println("Question " + (i + 1) + ": " + currentQuestion.getQuestionText());
            
            String[] options = currentQuestion.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }

            System.out.print("Your answer (1-" + options.length + "): ");
            int userAnswer = -1;

            
            while (true) {
                try {
                    userAnswer = Integer.parseInt(scanner.nextLine());
                    if (userAnswer >= 1 && userAnswer <= options.length) {
                        break; 
                    } else {
                        System.out.print("Invalid choice. Please enter a number between 1 and " + options.length + ": ");
                    }
                } catch (NumberFormatException e) {
                    System.out.print("That's not a valid number. Please try again: ");
                }
            }

           
            if (userAnswer - 1 == currentQuestion.getCorrectAnswerIndex()) {
                System.out.println("Correct! ✅");
                score++;
            } else {
                System.out.println("Wrong! ❌ The correct answer was: " + (currentQuestion.getCorrectAnswerIndex() + 1) + ". " + options[currentQuestion.getCorrectAnswerIndex()]);
            }
        }
    }

   
    public int getScore() {
        return score;
    }
}
