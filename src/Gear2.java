class Gear{
    private int chainring,cog ;
    Gear(int chainring,int cog){
        this.chainring = chainring;
        this.cog = cog;
    }
    double ratio(){
        return ((double)chainring)/cog;
    }
    int getChainring(){
        return chainring;
    }
    int getCog(){
        return cog;
    }
}