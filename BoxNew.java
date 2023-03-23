
public class BoxNew {
    int height; //высота
    int length; //длина
    int width; //ширина
    int getVolume() { return height * length * width; }

    public BoxNew(int h, int l, int w){
        this(h, l);

        this.height = h;
        this.length = l;
        this.width = w;
//        System.out.println("volume = " + h * l * w);

        System.out.println("Volume = " + getVolume());
    }

    public BoxNew(int h, int l){
        this(h);

        this.height = h;
        this.length = l;
        width = 11;
//        System.out.println("volume = " + h * l * 11);
        System.out.println("Volume = " + getVolume());
    }

    public BoxNew(int h){
        this();

        this.height = h;
        length = 10;
        width = 6;
//        System.out.println("volume = " + h * 10 * 6);
        System.out.println("Volume = " + getVolume());
    }

    public BoxNew(){
        height = 10;
        length = 13;
        width = 9;
//        System.out.println("volume = " + 10 * 13 * 9);
        System.out.println("Volume = " + getVolume());
    }

    public static void main(String[] args) {
        BoxNew box1 = new BoxNew( 7,9,14);
        BoxNew box2 = new BoxNew(8,15);
        BoxNew box3 = new BoxNew(13);
        BoxNew box4 = new BoxNew();

    }

}
