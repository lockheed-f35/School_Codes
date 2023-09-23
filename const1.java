abstract class charlie{
    int id;
    String lastName;

    // SIMPLE METHOD: cannot be modified in object instance.
    public static void sayHello(){
        System.out.println("Hello, Welcome to this page.");
    }
    //ABSTRACT METHOD: can be modified in accordance to our requirement in object.
     abstract public void customHello();
     // ABOVE LINE CAUSED TO DECLARE CHARLIE AS "ABSTRACT CLASS"

}

class charlie_fr extends charlie{


    public charlie_fr(int idFr,String lastNameFr){  // BETA 1: >>> public charlie(int id, String lastName){
                                                        //  this.id = 0000; sets id;
        idFr = 0000 ; lastNameFr = "lastName";
        System.out.println("Please enter the id in format: " + idFr + "\nFor Candidate: "+ lastNameFr);
}

    public void customHello(){
        System.out.println("Bonjour!");
    }

}



public class const1{
    public static void main (String [] args){
            // THE ERROR BELOW IS CAUSED BECAUSE WE CANNOT USE AN ABSTRACT CLASS STRAIGHT UP!
        charlie asset1 = new charlie_fr(00,"Juliet");  // if you uncomment the constructor beta1; you have to give id and lastName in brackets

        //You cannot use class.method()   MUST USE: OBJECT.METHOD!

        //You must refer to object to make a static reference.
        asset1.customHello();


    }

}