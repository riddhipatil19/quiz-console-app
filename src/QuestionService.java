import java.util.Objects;
import java.util.Scanner;
public class QuestionService{
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1,"what language we are using?","java","python","cpp","rust","java");
        questions[1] = new Question(2,"what is India?","state","country","village","continent","country");
        questions[2] = new Question(3, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Saturn", "Mars");
        questions[3] = new Question(4, "Who is the founder of Microsoft?", "Steve Jobs", "Bill Gates", "Elon Musk", "Mark Zuckerberg", "Bill Gates");
        questions[4] = new Question(5, "Which data structure uses FIFO?", "Stack", "Queue", "Tree", "Graph", "Queue");
    }

    public void takeQuiz(){
        int score = 0;
        for(int i = 0; i<questions.length;i++){
            System.out.print("Question:"+questions[i].getId()+" ");
            System.out.println(questions[i].getQuestion());
            System.out.println("1: " + questions[i].getOpt1());
            System.out.println("2: " + questions[i].getOp2());
            System.out.println("3: " + questions[i].getOp3());
            System.out.println("4: " + questions[i].getOpt4());
            Scanner sc = new Scanner(System.in);
            String ans = sc.nextLine();
            if(Objects.equals(ans, questions[i].getAnswer())){
                System.out.println("Congratulations! Correct Answer.");
                score++;
            }else{
                System.out.println("Wrong,the answer is "+questions[i].getAnswer());
            }
        }
        System.out.println("Your Score is " + score + "/" + questions.length);
    }
}