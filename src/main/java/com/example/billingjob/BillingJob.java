package com.example.billingjob;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;

public class BillingJob implements Job {

    @Override
    public void execute(JobExecution execution) {
        System.out.println("processing billling information");
    }

    @Override
    public String getName() {
        return "BillingJob";
    }

}
