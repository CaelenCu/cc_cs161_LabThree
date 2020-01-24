class ServiceNeed{
    //Members
    private String serviceNeedDescription;
    private String date;
    private String time;
    private String providerName;

    //Operation to identify the client's need
    public void identifyNeed(String need){
        serviceNeedDescription = need;
    }

    //Operation to Make an appointment
    public void makeAppointment(String d, String t){
        date = d;
        time = t;
    }

    //Operation to make a referral
    public void makeReferral(String d, String t, String pn){
        date = d;
        time = t;
        providerName = pn;
    }
}