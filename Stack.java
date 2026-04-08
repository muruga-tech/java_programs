import java.util.*;
class Stack{
 
        final int max=5;
        int top=-1;
        int [] stack=new int[max];
        void push(int val){
            if(top>=max){
                System.out.println("Stack is overflow");
                return;
            }
            stack[++top]=val;
        }
     int pop(){
        if(top==-1){
            System.out.println("Stack is Underflow");
            
        }
        int k=stack[top--];
        return k;
        
        }
        void display(){
            if(top==-1){
                System.out.println("Stack is underflow");
            }else{
                for(int i=0;i<=top;i++){
                    System.out.print(stack[i]+" ");
                }
            }
            
        }
        public static void main(String[] args){
            Stack s=new Stack();
             Scanner sc=new Scanner(System.in);
             for(int i=0;i<s.max;i++){
                 s.push(sc.nextInt());
             }
             s.display();
             System.out.println();
             System.out.println(s.pop()+": Popped element");
             s.display();
             
             
            
        }
        
    
}