public class Director extends JobHuman {
    private String name;
    private int age;
    private int experience;
    private String domainStudy;

    public Director(String name, int age, int experience, String domainStudy) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.domainStudy = domainStudy;
    }

    public void issueAPrize(){
        System.out.println("Директор " + this.name + " выписал всем работникам премию!");
    }

    public void createMeeting(){
        System.out.println("Директор " + this.name + " создал собрание!");
    }

    @Override
    public void startJobLife() {
        System.out.println(this.name + " становится директором!");
    }

    @Override
    public void comeToWork() {
        System.out.println("Директор " + this.name + " пришел на работу!");
    }

    @Override
    public void getAwayFromWork() {
        System.out.println("Директор " + this.name + " ушел с работы!");
    }

    @Override
    public void comeToMeeting() {
        System.out.println("Директор " + this.name + " пришел на собрание!");
    }

    @Override
    public void goForBreak() {
        System.out.println("Директор " + this.name + " ушел на перерыв!");
    }
}
