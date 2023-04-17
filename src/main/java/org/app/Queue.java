package org.app;

import java.sql.Array;

public class Queue {
    private int maxSize;
    private Persona[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) {
        maxSize = s;
        queArray = new Persona[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(Persona p) {
        if(rear == maxSize-1)         // deal with wraparound
            rear = -1;
        queArray[++rear] = p;         // increment rear and insert
        nItems++;                     // one more item
    }

    public Persona[] remove() {
        if(isEmpty()) {
            return new Persona[]{};
        }
        Persona temp = queArray[front++]; // get value and incr front
        if(front == maxSize)           // deal with wraparound
            front = 0;
        nItems--;                      // one less item
        return new Persona[]{temp};
    }

    public Persona peekFront() {
        return queArray[front];
    }

    public void showQueue() {
        if(isEmpty()){
            return;
        }

        if (rear >= front) {
            for (int i = front; i <= rear; i++) {
                System.out.println(queArray[i].toString());
            }
        } else {
            for (int i = front; i < queArray.length; i++) {
                System.out.println(queArray[i].toString());
            }
            for (int i = 0; i <= rear; i++) {
                System.out.println(queArray[i].toString());
            }
        }
    }

    public boolean isEmpty() {
        return (nItems==0);
    }

    public boolean isFull() {
        return (nItems==maxSize);
    }

    public int size() {
        return nItems;
    }

}