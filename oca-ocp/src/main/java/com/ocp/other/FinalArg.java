package com.ocp.other;

public class FinalArg {
    public static void main(String[] args) {
        getJob(new Job("IT"));
    }

    private static void getJob(final Job job) {
        job.name = "HR";
        System.out.println(job.name);
    }
}

class Job {
    public Job(String name) {
        this.name = name;
    }

    String name;
}
