package factory;

abstract class AbsFactory {
    final InnerProduct createOperation() {
        InnerProduct iprod = createOperation();
        iprod.setting();
        return iprod;
    }

    abstract protected InnerProduct createProduct();
}

class cFac1 extends AbsFactory {
    @Override
    public InnerProduct createProduct() {
        return new ConcreateProduct1();
    }
}

class cFac2 extends AbsFactory {
    @Override
    public InnerProduct createProduct() {
        return new ConcreateProduct2();
    }
}

public class Factory {

    public void createProduct() {

    }

    public static void main(String[] args) {
        AbsFactory[] factoria = {
            new cFac1(),
            new cFac2()
        };
    }

}