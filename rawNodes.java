public class rawNodes{
    Node head;
    class Node{
        // if used int on place of node, it will start indexing the values by using int.
        Node next;
        int Svalue;}
        
        
        // initialized the head
        public rawNodes() { head = null; }

        // methods will be created in raw nodes
    public void push(int Gvalue){
        Node extrahead = head;
        head = new Node();
        head.Svalue = Gvalue;
        head.next = extrahead;
    }
     /*


9:30 / 27:54
continute from there


#26 - Implement stack using Linked List in java - DataStructure Series Part 2 */


    public static void main(String[] args) {
        
    }
}

// WAHEGURU MEHR KREO!
//____________________
// WarPlan 
// CPSC 225: 
// 3 to 5 PM Nodes and Stacks and Queues
// Tomorrow: 7 am to 12 pm : Pomodoro: Slides + Recurssion Practice.;

