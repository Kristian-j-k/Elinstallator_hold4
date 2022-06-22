package com.elinstallator_hold4;

public class VerificationChartModel {
    String questionText;
    String answer;

    public VerificationChartModel(String questionText) {
        this.questionText = questionText;

    }
  /*  public VerificationChartModel(String questionText, String answer) {
        this.questionText = questionText;
         this.answer = answer;
    }*/

    public String getQuestionText() {
        return questionText;
    }
/*
   // public String getAnswer() {
        return answer;
    }*/
}
