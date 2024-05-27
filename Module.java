public class Module {

    int x, y; float electricity, water, filth;
    User[] register; int userNum=1;

    public Module(int x, int y) {
        this.x= x; this.y = y;
        register = new User[userNum];
    }

    public void setValue(float e, float w, float f){
        electricity = e; water = w; filth = f;
    } 

    public void addUser(User user) {
        userNum++; User[] tmp = new User[userNum];
        int i=0;
        for (User u : register) {tmp[i] = u; i++;}
        tmp[-1] = user;
    }
}

class House extends Module {
    public House(int x, int y) {super(x, y);}
    // Add functions that only House should perform
}

class Factory extends Module {
    public Factory(int x, int y) {super(x, y);}
    // Add functions that only Factory should perform
}