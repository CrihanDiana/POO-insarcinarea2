public class Worker extends JobHuman {
    private String name;
    private int age;
    private int  experience;
    private String position;

    public Worker(String name, int age, int experience, String position) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.position = position;
    }

    public void askForARaise(){
        System.out.println("Работник " + this.name + " попросил повышение!");
    }

    public void leaveJob(){
        System.out.println("Работник " + this.name + " уволился!");
    }

    @Override
    public void startJobLife() {
        System.out.println("Становится рабочим!");
    }

    @Override
    public void comeToWork() {
        System.out.println("Работник " + this.name + " пришел на работу!");
    }

    @Override
    public void getAwayFromWork() {
        System.out.println("Работник " + this.name + " ушел с работы!");
    }

    @Override
    public void comeToMeeting() {
        System.out.println("Работник " + this.name + " пришел на собрание!");
    }

    @Override
    public void goForBreak() {
        System.out.println("Работник " + this.name + " ушел на перерыв!");
    }
}
