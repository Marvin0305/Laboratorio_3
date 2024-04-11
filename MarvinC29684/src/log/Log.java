package log;

import java.util.Date;

public class Log {

    private int eventId;
    private String event;
    private Date date;
    private Account account;
    private double moviment;

    private static int consecutive = 0;

    public Log() {
        this.eventId = ++consecutive;
    }

//    public Log(int eventId, String event, Account account, double moviment) {
//        this.eventId = eventId;
//        this.event = event;
//        this.account = account;
//        this.moviment = moviment;
//    }
//    

    public Log(int eventId, String event, Date date, Account account, double moviment) {
        this();
        this.eventId = eventId;
        this.event = event;
        this.date = new java.util.Date();
        this.account = account;
        this.moviment = moviment;
    }
    
//    
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getMoviment() {
        return moviment;
    }

    public void setMoviment(double moviment) {
        this.moviment = moviment;
    }

    public static int getConsecutive() {
        return consecutive;
    }

    public static void setConsecutive(int consecutive) {
        Log.consecutive = consecutive;
    }

    @Override
    public String toString() {

        String result = "\n BANK LOG INFORMATION"
                + "\n_________________________________________________"
                + "\n Event ID:" + this.getEventId()
                + "\n Event Type:" + this.getEvent()
                + "\n Transaction Date:" + this.getDate()
                + "\n Movement Amount:" + this.getMoviment()
                + "\n Affected Account:" + this.getAccount().toString();

        return result;
    }

}
