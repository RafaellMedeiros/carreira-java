package br.com.rafa.bank.manage.models;

public enum Options {
    CREATE_ACCOUNT(1),
    DELETE_ACCOUNT(3),
    LOGIN(0),
    DEPOSIT(4),
    WITHDRAW(5);

    private final int code;

    Options(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Options getByCode(int code) {
        for (Options op : Options.values()) {
            if (op.getCode() == code) return op;
        }
        throw new IllegalArgumentException("Invalid option code");
    }
}
