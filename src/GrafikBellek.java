public class GrafikBellek {
    int x1;
    int x2;
    int y1;
    int y2;
    int[] list;
    public GrafikBellek(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        list = new int[]{x1, x2, y1, y2};
    }

}
