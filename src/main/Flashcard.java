package main;

public class Flashcard {

    private String id;
    private String questionText;
    private String answerText;
    private BankUser banker;

    public  Flashcard(String questionText, String answerText){
        this.questionText=questionText;
        this.answerText=answerText;
    }
    public Flashcard(String questionText, String answerText, BankUser banker){
        this(questionText, answerText);
        this.banker=banker;
    }

    public Flashcard(String id, String questionText, String answerText, BankUser banker){
        this(questionText,  answerText, banker);
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public void setBanker(BankUser banker) {
        this.banker = banker;
    }


    public BankUser getBanker() {
        return banker;
    }
}
