public class TestObject<T> {
    private T testVariable;

    public TestObject(T testVariable) {
        this.testVariable = testVariable;
    }

    public T getTestVariable() {
        return this.testVariable;
    }
    public void setTestVariable(T newTestVariable) {
        this.testVariable = newTestVariable;
        }

}
