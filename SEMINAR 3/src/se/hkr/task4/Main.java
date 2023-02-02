package se.hkr.task4;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Queue<String> q = main.createQueue();
        Stack<String> s = main.createStack(q);
        main.popStack(s);
    }

    public Queue<String> createQueue () {
        Queue<String> seats = new LinkedList<>();
        for (int i = 40; i > 0; i--){
            seats.add(i + "A");
            seats.add(i + "B");
            seats.add(i + "C");
            seats.add(i + "D");
            seats.add(i + "E");
            seats.add(i + "F");
        }
        return seats;
    }

    public Stack<String> createStack (Queue<String> seatsQueue) {
        Stack<String> seats = new Stack<>();
        for (String s : seatsQueue){
            seats.add(s);
        }
        return seats;
    }

    public Stack<String> popStack (Stack<String> seatsStack){
        Stack<String> popStack;
        popStack = seatsStack;
        try {
            while (!seatsStack.isEmpty()) {
                popStack.pop();
            }
        }catch (EmptyStackException e){
            System.out.println("The stack is empty");
        }

        return popStack;
    }

    public void viewQueue(Queue<String> seats){
        if (seats.isEmpty()){
            System.out.println("The queue is empty");
        }else {
            for(String s : seats){
                System.out.println(s);
            }
        }

    }

    public void viewStack(Stack<String> seats) {
        if (seats.isEmpty()){
            System.out.println("The stack is empty");
        }else {
            for(String s : seats){
                System.out.println(s);
            }
        }
    }
}
