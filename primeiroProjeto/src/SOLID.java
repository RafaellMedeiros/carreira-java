public class SOLID {
    static boolean f = true;
    static void payment(Value value) {
        value.call();
    }
    public static void main(String[] args) {
        Value value = new Value();
        payment(value);
    }

}

class Value {
    void call() {
        System.out.println("Opa Padrão");
    }
}

class Value1 extends Value {
    @Override
    void call() {
        System.out.println("Opa 1");
    }
}

class Value2 extends Value {
    @Override
    void call() {
        System.out.println("Opa 2");
    }
}

class Value3 extends Value {
    @Override
    void call() {
        System.out.println("Opa 3");
    }
}

