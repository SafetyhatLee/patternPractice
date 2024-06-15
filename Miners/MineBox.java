package Miners;

public class MineBox {
    
    class NormalBox extends Item {
        Item[] items = new Item[64]; int currCap = 0;
        int[] coordinate = new int[3];

        public void extend(boolean ext) {
            if (ext) {
                Item[] tmp = new Item[128];
                for (int i=0; i<currCap; i++) {tmp[i] = items[i];}
            }
        }
        public void putIn(Item it) {
            if (!(it instanceof NormalBox || it instanceof Enderbox)) {items[currCap++] = it;}
        }
    }

    class Enderbox extends NormalBox {
        int userAddress;
        public void open() {}
    }

    class Shulker extends NormalBox {
        public Shulker() {}
        String itemNames;
    }

    public static void main(String[] args) {
        Shulker shulk = new Shulker();
        NormalBox box1 = new NormalBox();

        box1.putIn(shulk);
    }
}