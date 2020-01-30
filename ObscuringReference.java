import java.util.ArrayList;
class ObscuringReferenc{
    int[][] data;
    public ObscuringReferenc(int [][] data){
        this.data = data;
    }
    ArrayList<Integer> diameters(){
        ArrayList<Integer> diameters = new ArrayList<>();
        for(int [] cell : data){
            diameters.add(cell[0]+(cell[1]*2));
        }
        return diameters;
    }
}