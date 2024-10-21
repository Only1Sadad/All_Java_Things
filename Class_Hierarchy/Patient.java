package Class_Hierarchy;

class Patient 
{
    //attributes
   private String[] symptoms; 
   private boolean insured;
   //represents which doctor present and on duty and all other patients have access to..
   private static Doctor doc_on_duty; 

    public Patient(String[] symptoms, boolean insured)
    {
        this.symptoms=symptoms;
        this.insured=insured;

    }
    //create method to return a string of new symptoms
    public static String talk_to_nurse(Nurse nurse)
    {
        return "new diagnosis";
    }
    //method to set the doctor on duty, public static available everywhere.
    //takes in an instance of a Doctor
    public static void setDocOnDuty(Doctor which_doc)
    {
      //can assign that instance object variable to doc_on_duty attribute
    }
    //method to get the doctor available now
    public static Doctor getDocOnDuty()
    {
        return doc_on_duty;
    }




}
