package com.lemon;

/**
 * Created by MLinWQ on 2018/3/3 0003.
 */

enum Answer{A, B, C , D}

public abstract class Question {
    private Answer answer = Answer.A;
    private Question question;
    private boolean isChecked;

    public Question(Question question) {
        this.question = question;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public Answer getAnswer() {
        return answer;
    }


    /**
     * check for condition based on every single question
     */
    public abstract void check();

    /**
     *method for going through the list of question
     */
    public void changeAnswer(){
        int index = this.answer.ordinal();
        if(index < 3){
            this.answer = Answer.values()[answer.ordinal() + 1];
            return;
        }
        if(this.question != null){
            this.question.changeAnswer();
            this.answer = Answer.A;
        }
    }

    @Override
    public String toString() {
        return answer.name();
    }
}
