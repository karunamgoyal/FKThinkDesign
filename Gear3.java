class Gear{
    int chainring,cog,rim,tire;
    Wheel wheel;
    Gear(int chainring,int cog,int rim,int tire,Wheel wheel){
        this.chainring = chainring;
        this.cog = cog;
        this.wheel = wheel;
        this.rim = rim;
        this.tire = tire;
    }
    double ratio(){
        return ((double)chainring)/cog;
    }
    double gearInches(){
        return ratio()*(wheel.diameter());
    }
    int getChainring(){
        return chainring;
    }
    int getCog(){
        return cog;
    }
    void wheel(){
        wheel = new Wheel(rim,tire); 
    }
}