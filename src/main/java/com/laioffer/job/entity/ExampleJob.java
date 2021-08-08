package com.laioffer.job.entity;

public class ExampleJob {
    public String title;
    public int money;
    public String beginDate;
    public boolean remote;
    public ExampleCoordinates coordinates;

    public ExampleJob(String title, int money, String beginDate, boolean remote, ExampleCoordinates coordinates) {
        this.title = title;
        this.money = money;
        this.beginDate = beginDate;
        this.remote = remote;
        this.coordinates = coordinates;
    }
}
