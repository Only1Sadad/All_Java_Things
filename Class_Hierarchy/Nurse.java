package Class_Hierarchy;

class Nurse extends Doctor
{ // Attributes
    public Nurse(String diagnosis, boolean specialist, int salary )
    { //referring to the parent class
        super(diagnosis, specialist,0);
    }

    //method is public static it connects doctor with patient and stablish a
    //connection
    public static void communicate(Doctor name1, Patient name2)
    {
        //logic to determine what the communication is
    }


}
