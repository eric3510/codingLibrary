package pattern.factory.calculator;

import global.Utils;

/***
 *  枚举工厂
 */
public enum OperationEnumFactory {
    ADD("+", new OperationAdd()),
    DIV("/", new OperationDiv()),
    MUL("*", new OperationMul()),
    SUB("-", new OperationSub());
    private Operation operation;
    private String key;

    OperationEnumFactory(String key, Operation operation) {
        this.key = key;
        this.operation = operation;
    }

    public Operation getOperation() {
        return this.operation;
    }

    public String getKey() {
        return this.key;
    }

    public static Operation getOperation(String key) {
        String keyName = "key";
        String valueName = "operation";
        return Utils.EnmuUtils.getValue(OperationEnumFactory.values(), keyName, valueName, key, Operation.class);
    }
}
