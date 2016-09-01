package nyc.c4q.abassawo;

/**
 * Created by c4q-ac29 on 8/31/16.
 */
public class Bicycle implements Vehicle, WheeliaAble {
    double speed;
    double maxSpeed;

    public Bicycle(){
        this.speed = 0;
    }


    public void applyBrakes() {
        speed = 0;
    }

    public void speedUp(int speed) {
        if (speed <= maxSpeed) {
            speed++;
        }
    }

    public void slowDown(int speed) {
        if (speed > 0) {
            speed--;
        }
    }

    public boolean popAWheelie(int duration) {
        while(duration != 0){
            System.out.println("I'm poppping a wheeeelieeee");
            duration--;
        }
        return true;
    }
}
