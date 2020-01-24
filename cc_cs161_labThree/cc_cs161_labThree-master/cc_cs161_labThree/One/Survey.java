class Survey{
    //Survey questions array
    private SurveyQuestions[] questionSet;
    //Answer array
    private SurveyQuestions[] answerSet;

    //Member(s)
    private int surveyNumber;

    //Operations

    //Method to display a survey question
    public SurveyQuestions[] displayQuestion(){
        return questionSet;
    }

    //Method to record an answer
    public void recordAnswer(SurveyQuestions[] ans){
        answerSet = ans;
    }

}