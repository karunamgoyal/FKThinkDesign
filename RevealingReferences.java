import java.util.ArrayList;

class Wheel {
    int rim,tire;
    Wheel(int rim,int tire){
        this.rim = rim;
        this.tire = tire;
    }
    int diameter(){
        return rim + (tire*2);
    }
    double circumference(){
        return diameter()* Math.PI;
    }

}

class RevealingReferences{
    ArrayList<Integer> wheels = new ArrayList<>();
    Wheel wheel;
    void diameters(){
        wheels.add(wheel.diameter());
    }

}