package composition.challenge;

public class Appliance {
    protected boolean hasWorkToDo;

    public Appliance() {
        this.hasWorkToDo = false;
    }

    public boolean hasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
