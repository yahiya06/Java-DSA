package com.oop.interfaces;

public class NewCar {
    private Engine engine;
    private Media player = new CDPlayer();

    public NewCar() {
        engine = new ElectricEngine();
    }

    public NewCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void acc(){
        engine.acc();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

}
