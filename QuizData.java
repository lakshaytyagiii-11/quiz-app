import java.util.ArrayList;
import java.util.List;


public class QuizData {

    public static List<Question> getCricketQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Who is known as the 'God of Cricket'?", new String[]{"Virat Kohli", "Sachin Tendulkar", "Don Bradman", "Ricky Ponting"}, 1));
        questions.add(new Question("How many players are there in a cricket team?", new String[]{"10", "11", "12", "9"}, 1));
        questions.add(new Question("Which country won the first ever Cricket World Cup in 1975?", new String[]{"Australia", "England", "India", "West Indies"}, 3));
        questions.add(new Question("What is the term for a score of 100 runs by a batsman?", new String[]{"Century", "Fifty", "Duck", "Ton"}, 0));
        questions.add(new Question("Which bowler has taken the most wickets in Test cricket?", new String[]{"Shane Warne", "Anil Kumble", "Muttiah Muralitharan", "James Anderson"}, 2));
        questions.add(new Question("What does LBW stand for?", new String[]{"Leg Before Wicket", "Long Boundary Wide", "Leg Bye Wicket", "Lost Ball Wicket"}, 0));
        questions.add(new Question("In which year did India win its first Cricket World Cup?", new String[]{"1983", "2011", "1992", "2007"}, 0));
        questions.add(new Question("What is the length of a cricket pitch?", new String[]{"20 yards", "22 yards", "24 yards", "26 yards"}, 1));
        questions.add(new Question("Who was the first cricketer to score a double century in a One Day International (ODI)?", new String[]{"Virender Sehwag", "Chris Gayle", "Rohit Sharma", "Sachin Tendulkar"}, 3));
        questions.add(new Question("The Ashes is a Test cricket series played between which two countries?", new String[]{"India and Pakistan", "Australia and England", "South Africa and New Zealand", "West Indies and Sri Lanka"}, 1));
        return questions;
    }

    public static List<Question> getFootballQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Which country has won the most FIFA World Cups?", new String[]{"Germany", "Argentina", "Brazil", "Italy"}, 2));
        questions.add(new Question("Who is the all-time top scorer in the UEFA Champions League?", new String[]{"Lionel Messi", "Cristiano Ronaldo", "Robert Lewandowski", "Karim Benzema"}, 1));
        questions.add(new Question("How long is a standard professional football match?", new String[]{"80 minutes", "90 minutes", "100 minutes", "120 minutes"}, 1));
        questions.add(new Question("Which player is known as 'The King'?", new String[]{"Maradona", "Zidane", "Cruyff", "Pelé"}, 3));
        questions.add(new Question("The term 'offside' is used in which sport?", new String[]{"Basketball", "Baseball", "Football", "Hockey"}, 2));
        questions.add(new Question("Which club has won the most Premier League titles?", new String[]{"Chelsea", "Arsenal", "Liverpool", "Manchester United"}, 3));
        questions.add(new Question("What is the maximum number of substitutions a team can make in a standard match?", new String[]{"3", "4", "5", "6"}, 2));
        questions.add(new Question("Who won the first ever FIFA World Cup?", new String[]{"Brazil", "Argentina", "Uruguay", "Italy"}, 2));
        questions.add(new Question("The Ballon d'Or is an award for which sport?", new String[]{"Rugby", "Football", "Cricket", "Tennis"}, 1));
        questions.add(new Question("In which country were the first modern rules of football established?", new String[]{"Brazil", "Germany", "France", "England"}, 3));
        return questions;
    }

    public static List<Question> getTennisQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("How many points make up a 'game' in tennis (assuming no deuce)?", new String[]{"2", "3", "4", "5"}, 2));
        questions.add(new Question("Which of the four Grand Slams is played on a clay court?", new String[]{"Wimbledon", "US Open", "Australian Open", "French Open"}, 3));
        questions.add(new Question("Who has won the most Grand Slam titles in men's singles?", new String[]{"Roger Federer", "Rafael Nadal", "Novak Djokovic", "Pete Sampras"}, 2));
        questions.add(new Question("What is a score of 40-40 called in tennis?", new String[]{"Advantage", "Deuce", "Love", "Match Point"}, 1));
        questions.add(new Question("Which female player has the most Grand Slam singles titles in the Open Era?", new String[]{"Steffi Graf", "Serena Williams", "Martina Navratilova", "Margaret Court"}, 1));
        questions.add(new Question("A 'let' is called when a serve hits the net and lands in the correct service box. What happens next?", new String[]{"The server loses the point", "The server wins the point", "The point is replayed", "The receiver wins the point"}, 2));
        questions.add(new Question("Which Grand Slam tournament is famous for its all-white dress code?", new String[]{"US Open", "French Open", "Wimbledon", "Australian Open"}, 2));
        questions.add(new Question("What does a score of zero in tennis called?", new String[]{"Nil", "Zero", "Love", "Duck"}, 2));
        questions.add(new Question("How many attempts does a server get to make a valid serve?", new String[]{"1", "2", "3", "Unlimited"}, 1));
        questions.add(new Question("The Davis Cup is the premier international team event in men's tennis. True or False?", new String[]{"True", "False"}, 0));
        return questions;
    }

    public static List<Question> getBadmintonQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the object hit back and forth in badminton?", new String[]{"Ball", "Puck", "Shuttlecock", "Birdie"}, 2));
        questions.add(new Question("A standard badminton game is played up to how many points?", new String[]{"15", "21", "25", "30"}, 1));
        questions.add(new Question("What is it called when the shuttlecock illegally touches the net during a rally?", new String[]{"Let", "Fault", "Drop", "Smash"}, 1));
        questions.add(new Question("The Thomas Cup is the world men's team championship for which sport?", new String[]{"Table Tennis", "Squash", "Badminton", "Volleyball"}, 2));
        questions.add(new Question("Which country has been the most dominant in Olympic badminton?", new String[]{"Indonesia", "South Korea", "Denmark", "China"}, 3));
        questions.add(new Question("In a singles game, if the server's score is even, they serve from which side of the court?", new String[]{"Left", "Right", "Center", "Anywhere"}, 1));
        questions.add(new Question("What is the height of the badminton net at the center?", new String[]{"1.524 meters (5 ft)", "1.55 meters (5 ft 1 in)", "1.6 meters (5 ft 3 in)", "1.7 meters (5 ft 7 in)"}, 0));
        questions.add(new Question("An official badminton match consists of the best of how many games?", new String[]{"1", "3", "5", "7"}, 1));
        questions.add(new Question("A powerful overhead shot hit downwards into the opponent's court is called a?", new String[]{"Drive", "Clear", "Drop Shot", "Smash"}, 3));
        questions.add(new Question("Can a player touch the net with their racket or body during play?", new String[]{"Yes", "No"}, 1));
        return questions;
    }
}
