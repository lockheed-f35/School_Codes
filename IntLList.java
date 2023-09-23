public class IntLList{
    node head;

    class node{
        int data;
        node next;}

    //Constructor for stck1:

    IntLList(){
        head = null;
    }
// push method
public void push(int data){
    node tempHead = head;
    head = new node();
    head.data = data;
    head.next = tempHead;
}
//pop method 
public int pop(){
    // throw exception
    if (head == null){System.out.println("The array is empty");}
    int fetchedValue = head.data;
    head = head.next;
    return fetchedValue;}

public static void main(String[] args) {
    IntLList PeopleIds = new IntLList();
//System.out.println(PeopleIds.pop());
    PeopleIds.push(2);
    PeopleIds.push(21);
    PeopleIds.push(211);
    PeopleIds.push(2111);

System.out.println(PeopleIds.pop());
System.out.println(PeopleIds);



}

}