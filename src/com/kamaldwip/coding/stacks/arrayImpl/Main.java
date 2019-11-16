package com.kamaldwip.coding.stacks.arrayImpl;

public class Main {

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();

        Employee emp1 = new Employee("Kamaldwip","Choudhury");
        Employee emp2 = new Employee("Abhinav","Borgohain");
        Employee emp3 = new Employee("Prateek","Sahu");
        Employee emp4 = new Employee("Parag","Roy");

        stack.push(emp1);
        stack.push(emp2);
        stack.push(emp3);
        stack.push(emp4);

        stack.printStack();

        System.out.println("Peek : "+stack.peek());

        System.out.println("Pop : "+ stack.pop());

        stack.printStack();

        System.out.println("Peek : "+stack.peek());

    }
}
