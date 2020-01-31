class Bicycle{
    int size;
    int tapecolor;

    Parts parts;
    public Bicycle(){}
    public Bicycle(int size, int tapecolor,Parts parts){
        this.size = size;
        this.tapecolor = tapecolor;
        this.parts = parts;
    }
    void spares(){
        parts.spares();
    }
    String defaultChain(){
        return "10-speed";
    }
}