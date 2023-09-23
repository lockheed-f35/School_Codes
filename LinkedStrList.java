
public class LinkedStrList{
        node activeNode;

        public class node{int value; node hook;}

        // a constructor that takes none input

        public LinkedStrList(){activeNode = null;}
     // push method
     public void push(int z){
        node NewNode = activeNode;
        activeNode = new node();
        activeNode.value = z;
        activeNode.hook = NewNode; }
     
     //pop method
    public int pop(){
        if (activeNode == null){return 0;}


       int value = activeNode.value;
            activeNode = activeNode.hook ;
            return value;
    }
    public static void main(String[] args) {
        LinkedStrList Andy = new LinkedStrList();
     //   Andy.push(1);
    //    Andy.push(2);
    //    Andy.push(3);

    //    should have   ....3,2,1}

    
        System.out.println(Andy.pop());



    
    
    
    }
}