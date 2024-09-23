package com.cpg.shadow.bean;

import java.time.LocalDateTime;

public class OTTBean {

    // Private fields to represent the subscription data
    private int subscriptionId;
    private String customerName;
    private long mobileNumber;
    private int planId;
    private String subscriptionStatus;
    private LocalDateTime subscriptionStart;
    private LocalDateTime subscriptionEnd;

    // Constructor
    public OTTBean() {
    }

    // Getter and setter methods for subscriptionId
    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    // Getter and setter methods for customerName
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getter and setter methods for mobileNumber
    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    // Getter and setter methods for planId
    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    // Getter and setter methods for subscriptionStatus
    public String getSubscriptionStatus() {
        return subscriptionStatus;
    }

    public void setSubscriptionStatus(String subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    // Getter and setter methods for subscriptionStart
    public LocalDateTime getSubscriptionStart() {
        return subscriptionStart;
    }

    public void setSubscriptionStart(LocalDateTime subscriptionStart) {
        this.subscriptionStart = subscriptionStart;
    }

    // Getter and setter methods for subscriptionEnd
    public LocalDateTime getSubscriptionEnd() {
        return subscriptionEnd;
    }

    public void setSubscriptionEnd(LocalDateTime subscriptionEnd) {
        this.subscriptionEnd = subscriptionEnd;
    }

    // toString method to display subscription details (optional)
    @Override
    public String toString() {
        return "OTTBean [subscriptionId=" + subscriptionId + ", customerName=" + customerName 
                + ", mobileNumber=" + mobileNumber + ", planId=" + planId
                + ", subscriptionStatus=" + subscriptionStatus + ", subscriptionStart=" + subscriptionStart 
                + ", subscriptionEnd=" + subscriptionEnd + "]";
    }
}