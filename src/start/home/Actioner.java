package start.home;

public class Actioner implements Perform{
    private Action action;
    private String perfAction;

    public Actioner(){

    }

    public void setAction(Action action){
        this.action = action;
    }

    public void setPerfAction(String perfAction) {
        this.perfAction = perfAction;
    }

    public String getPerfAction() {
        return perfAction;
    }

    @Override
    public void perform() {
        System.out.print("some perfotm  via interface: " + perfAction);
        action.play();
    }
}
