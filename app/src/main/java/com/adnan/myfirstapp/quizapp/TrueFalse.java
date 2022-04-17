package com.adnan.myfirstapp.quizapp;

public class TrueFalse {
    private int mQuestionId;
    private Boolean mAnswer;

    public TrueFalse(int mQuestionId, Boolean mAnswer) {
        this.mQuestionId = mQuestionId;
        this.mAnswer = mAnswer;
    }

    public int getmQuestionId() {
        return mQuestionId;
    }

    public Boolean getmAnswer() {
        return mAnswer;
    }
}
