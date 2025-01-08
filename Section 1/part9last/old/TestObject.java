public class TestObject<T> {
    public T testVariable;

    public TestObject(T newTestVariable) {
        this.testVariable = newTestVariable;
    }

    public T getTestVariable() {
        return this.testVariable;
    }

}
