public class Main {
    public static void main(String[] args){
        JobHuman worker = new Worker("Ион Суручяну", 63, 42, "Певец");
        worker.startJobLife();
        worker.comeToWork();
        worker.comeToMeeting();
        worker.goForBreak();
        ((Worker) worker).askForARaise();
        ((Worker) worker).leaveJob();
        worker.getAwayFromWork();

        JobHuman director = new Director("Дан Балан", 40, 7, "Певец");
        director.startJobLife();
        director.comeToWork();
        ((Director) director).createMeeting();
        director.comeToMeeting();
        ((Director) director).issueAPrize();
        director.goForBreak();
        director.getAwayFromWork();
    }
}
