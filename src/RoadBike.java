class RoadBike extends Bicycle{
    int tapeColor;
    public RoadBike(int tapeColor){
        this.tapeColor = tapeColor;
    }
    int defaultTire(){
        return 23;
    }
}