abstract class Geeks {
    abstract void turnOn();
    abstract void turnOff();
}

class TVRemote extends Geeks {
    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        TVRemote t = new TVRemote();
        t.turnOn();
        t.turnOff();
    }
}

