class SurveyQuestions{
    //Members
    private int questionNumber;
    private String question;

    //Method to set the question number
    public void setQuestionNumber(int qn){
        questionNumber = qn;
    }
    //Method to get the question number
    public int getQuestionNumber(){
        return questionNumber;
    }
    //Method to set the question
    public void setQuestion(String q){
        question = q;
    }
    //Method to get the question back
    public String getQuestion(){
        return question;
    }
}