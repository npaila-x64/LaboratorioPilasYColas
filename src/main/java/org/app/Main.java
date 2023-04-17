package org.app;


public class Main {
    public static void main(String[] args) {
        Queue cola = new Queue(9);

        Persona miguel = new Persona("miguel", 23);
        Persona jose = new Persona("jose", 12);
        Persona manuel = new Persona("manuel", 52);
        Persona pedro = new Persona("pedro", 23);
        Persona andrea = new Persona("andrea", 64);
        Persona matias = new Persona("matias", 3);
        Persona jorge = new Persona("jorge", 20);
        Persona cristian = new Persona("cristian", 100);
        Persona manuela = new Persona("manuela", 25);

        cola.insert(miguel);
        cola.insert(jose);
        cola.insert(manuel);
        cola.insert(pedro);
        cola.insert(andrea);
        cola.insert(matias);
        cola.insert(jorge);
        cola.insert(cristian);

        cola.remove();
        cola.remove();
        cola.remove();

        cola.insert(manuela);

        cola.showQueue();
    }
}