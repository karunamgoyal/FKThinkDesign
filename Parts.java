class Parts{
    int chain;
    int tiresize;
    public Parts(){
    }
    public Parts(int chain,int tiresize){
        this.chain = chain;
        this.tiresize = tiresize;
    }
    void spares(){
        int tiresize = this.tiresize;
        int chain = this.chain;
    }
    String defaultChain(){
        return "10-speed";
    }
    int defaultTireSize(){
        return -1;
    }
}