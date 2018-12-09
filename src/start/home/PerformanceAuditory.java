package start.home;

public class PerformanceAuditory {

    private String hellomessage;

    public void setHellomessage(String hellomessage){
        this.hellomessage=hellomessage;
    }

    public void getHelloMessage() { System.out.println("Hello message: " +hellomessage); }

    public void init(){
        System.out.println("before start");
    }

    public void finish(){
        System.out.println("after finish");
    }
}
