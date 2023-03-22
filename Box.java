public class Box {
    int height; //высота
    int length; //длина
    int width; //ширина
    int getVolume() { return height * length * width; }

    public Box(int h, int l, int w){
        this.height = h;
        this.length = l;
        this.width = w;
//        System.out.println("volume = " + h * l * w);
        System.out.println("Volume = " + getVolume());
    }

    public Box(int h, int l){
        this.height = h;
        this.length = l;
        width = 11;
//        System.out.println("volume = " + h * l * 11);
        System.out.println("Volume = " + getVolume());
    }

    public Box(int h){
        this.height = h;
        length = 10;
        width = 6;
//        System.out.println("volume = " + h * 10 * 6);
        System.out.println("Volume = " + getVolume());
    }

    public Box(){
        height = 10;
        length = 13;
        width = 9;
//        System.out.println("volume = " + 10 * 13 * 9);
        System.out.println("Volume = " + getVolume());
    }

    public static void main(String[] args) {
        Box box1 = new Box( 7,9,14);
        Box box2 = new Box(8,15);
        Box box3 = new Box(13);
        Box box4 = new Box();

    }
}
