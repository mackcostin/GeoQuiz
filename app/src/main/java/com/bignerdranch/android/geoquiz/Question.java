package com.bignerdranch.android.geoquiz;

/**
 * Created by Mack on 04-Aug-17.
 */

public class Question {
    private int mTextResID;
    private boolean mAnswerTrue;
    private boolean mHasCheated;


    public Question(int textResID, boolean answerTrue, boolean hasCheated){
        mTextResID = textResID;
        mAnswerTrue = answerTrue;
        mHasCheated = hasCheated;
    }

    public int getTextResID() {
        return mTextResID;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public boolean getAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean getHasCheated() {
        return mHasCheated;
    }

    public void setHasCheated(boolean hasCheated) {
        mHasCheated = hasCheated;
    }

}
