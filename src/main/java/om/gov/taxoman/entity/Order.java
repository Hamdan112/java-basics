package om.gov.taxoman.entity;

import java.time.LocalDateTime;

public class Order {
    private int id;
    private double totalDue;
    private LocalDateTime timeStamp;
    private String statues;
    private User user;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", totalDue=" + totalDue +
                ", timeStamp=" + timeStamp +
                ", statues='" + statues + '\'' +
                ", user=" + user +
                '}';
    }

    public Order(int id, double totalDue, LocalDateTime timeStamp, String statues, User user) {
        this.id = id;
        this.totalDue = totalDue;
        this.timeStamp = timeStamp;
        this.statues = statues;
        this.user = user;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(double totalDue) {
        this.totalDue = totalDue;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getStatues() {
        return statues;
    }

    public void setStatues(String statues) {
        this.statues = statues;
    }


}
