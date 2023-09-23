public class herClassInteger {
     int data;

// the constructor
public herClassInteger(int assign){
    this.data = assign;
    }


// get method
public int get(){
    return data;
}

// isEven and isOdd methods, takes no argument:
public Boolean isEven(){
    return 0==data%2;
}
public Boolean isOdd(){
    return 0!=data%2;
}

// isEven and isOdd methods, takes data as argument:

public static Boolean isEven(int data){
    return data%2 == 0;
}
public static Boolean isOdd(int data){
    return data%2 != 0;
}



// isEven and isOdd methods, takes an Object as argument:
public static Boolean isEven(herClassInteger sample){
    return sample.data%2 == 0;
}
public static Boolean isOdd(herClassInteger sample){
    return sample.data%2 != 0;
}

// equals methods that compare data value to given value.
public Boolean equals(int lake){
    return data==lake;
}
public  Boolean equals(herClassInteger example){
    return this.data == example.data;
}


public static void main(String[] args) {
    herClassInteger dummy = new herClassInteger(5);    
    herClassInteger sample1 = new herClassInteger(7);

    System.out.println("The constructor has assigned data to be: " + dummy.data);

    System.out.println("Using get method we can fetch value of data, which is: " + dummy.get());

    System.out.println("Is the stored data, even?: " + dummy.isEven());
    System.out.println("Is the stored data, odd?: " + dummy.isOdd());

    System.out.println("Is 7 even?: " + herClassInteger.isEven(7));
    System.out.println("Is 7 Odd?: " + herClassInteger.isOdd(7));

    System.out.println("Is data stored in DUMMY even?: " + isEven(dummy));
    System.out.println("Is data stored in DUMMY odd?: " + isOdd(dummy));

    System.out.println("Is 52 equal to data of dummy?: " + dummy.equals(52));
    System.out.println("Is data equal to data of dummy?: " + dummy.equals(sample1) );





}

}
