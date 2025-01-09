public class Hideout<T> {
    private T variable;

    public void putIntoHideout(T toHide) {
        this.variable = toHide;
    }

    public T takeFromHideout() {
        T tempVariable = this.variable;
        this.variable = null;
        return tempVariable;

    }

    public boolean isInHideout() {
        if (this.variable == null) {
            return false;
        }
        return true;
    }
};