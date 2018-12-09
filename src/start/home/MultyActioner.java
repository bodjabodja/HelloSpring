package start.home;

import java.util.Collection;

public class MultyActioner implements Perform {
    private Collection<Action> actions;

    public void setActions(Collection<Action> actions){
        this.actions=actions;
    }

    @Override
    public void perform() {
        for (Action action:actions ) {
            action.play();
        }
        System.out.println();
    }
}
