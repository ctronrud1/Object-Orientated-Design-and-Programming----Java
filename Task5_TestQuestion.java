// ************************************************************ 
// File Name: Task5 TestQuestions
// Author: Charlie Tronrud
// Purpose: A protected String variable that holds the test question. An abstract method protected abstract void readQuestion() to read the question
// ************************************************************
public abstract class Task5_TestQuestion {
    protected String question;

    protected Task5_TestQuestion() {
        this.readQuestion();
    }

    protected abstract void readQuestion();

    public String toString() {
        return this.question;
    }
}
