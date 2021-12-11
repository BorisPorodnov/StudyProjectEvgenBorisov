package net.porodnov.demo;

public class Main {
    public static void main(String[] args) {
        CoronaDisinfection disinfection = new CoronaDisinfection();
        disinfection.start(new Room());
    }
}
