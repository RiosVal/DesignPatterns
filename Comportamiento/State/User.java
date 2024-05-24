public class User {
    private State currentState;
    private boolean isBuying;
    private boolean isEnabled;

    public User() {
        // Inicializa el estado por defecto, puede ser ActiveState u otro
        this.currentState = new ActiveState(this);
        this.isBuying = false;
        this.isEnabled = true;
    }

    public String getCurrentStateName() {
        return currentState.getClass().getSimpleName();
    }

    public void changeState(State newState) {
        this.currentState = newState;
    }

    public String activate() {
        return currentState.onActive();
    }

    public String disable() {
        return currentState.onDisable();
    }

    public String lock() {
        return currentState.onLock();
    }

    public String buy() {
        return currentState.onBuy();
    }

    public boolean isBuying() {
        return isBuying;
    }

    public void setBuying(boolean isBuying) {
        this.isBuying = isBuying;
    }

    public boolean getEnable() {
        return isEnabled;
    }

    public void setEnable(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String startBuy() {
        // Método que inicia el proceso de compra, se puede personalizar según las necesidades
        return "Starting to buy...";
    }
}
