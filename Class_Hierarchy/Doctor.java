package Class_Hierarchy;

class Doctor 
{//Attributes
    protected String diagnosis; //only Doctor and Nurse have initial patient diagnosis.
    private boolean specialist; // only acceessable by doctor or known to doctor class
    private int salary; // only accessed by doctor

    //constructors are public because they need to be accessed from another
    //class in order to create an instance
    public Doctor(String diagnosis, boolean specialist, int salary)
    {
        this.diagnosis= diagnosis;
        this.specialist= specialist;
        this.salary=salary;
    }
    
    // takes in an instance of the patient object if true
    public boolean help_patient(Patient whichPatient)
    {
        //will contain logic to determine whether doctor can help patient
     return true; //return true as a place holder, because doctors should be able to help patients
    }
    //if we want to find if  our doctor is a specialist we can set up a getspecialist() method if we want to access that attribute

    //private attribute but can be accessed public now
   public int getSalary()
   {
    return this.salary;
   }

}
