class Gear{
    int chainring,cog;
    Wheel wheel;
    Gear(int chainring,int cog,Wheel wheel){
        this.chainring = chainring;
        this.cog = cog;
        this.wheel = wheel;
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
}