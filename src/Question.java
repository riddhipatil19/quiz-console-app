public class Question{
    private int id;
    private String question;
    private String opt1;
    private String op2;
    private String op3;
    private String opt4;
    private String answer;

    public Question(int id, String question, String opt1, String op2, String op3, String opt4, String answer) {
        this.id = id;
        this.question = question;
        this.opt1 = opt1;
        this.op2 = op2;
        this.op3 = op3;
        this.opt4 = opt4;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}