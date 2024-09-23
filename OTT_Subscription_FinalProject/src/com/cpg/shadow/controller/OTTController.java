package com.cpg.shadow.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Scanner;
import com.cpg.shadow.service.OTTService;
import com.cpg.shadow.bean.*;

public class OTTController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OTTService ottService = new OTTService();
        int choice;

        System.out.println("--------------------Welcome to OTT Subscription Service--------------------");

        do {
            System.out.println("1. Purchase Subscription");
            System.out.println("2. View Subscription Status");
            System.out.println("3. Upgrade Subscription");
            System.out.println("4. Cancel Subscription");
            System.out.println("5. View Subscription Duration");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Subscription ID: ");
                    int subscriptionId = sc.nextInt();
                    System.out.println("Enter Customer Name: ");
                    String customerName = sc.next();
                    System.out.println("Enter Mobile Number: ");
                    long mobileNumber = sc.nextLong();
                    System.out.println("Select Plan (1. Basic - 299/month, 2. Premium - 499/month, 3. Premium Plus - 699/month): ");
                    int planId = sc.nextInt();
                    LocalDateTime now = LocalDateTime.now();
                    LocalDateTime endDate = now.plusMonths(1); // Example end date
                    OTTBean ottBean = new OTTBean();
                    ottBean.setSubscriptionId(subscriptionId);
                    ottBean.setCustomerName(customerName);
                    ottBean.setMobileNumber(mobileNumber);
                    ottBean.setPlanId(planId);
                    ottBean.setSubscriptionStatus("Active");
                    ottBean.setSubscriptionStart(now);
                    ottBean.setSubscriptionEnd(endDate);
                    
                    int result = ottService.purchaseSub(ottBean);
                    if (result != 0) {
                        System.out.println("Subscription purchased successfully.");
                    } else {
                        System.out.println("Subscription purchase failed.");
                    }
                    break;

                case 2:
                    System.out.println("Enter Subscription ID: ");
                    subscriptionId = sc.nextInt();
                    String status = ottService.viewSubscriptionStatus(subscriptionId);
                    System.out.println("Subscription Status: " + status);
                    break;

                case 3:
                    System.out.println("Enter Subscription ID: ");
                    subscriptionId = sc.nextInt();
                    System.out.println("Enter New Plan (1. Basic - 299/month, 2. Premium - 499/month, 3. Premium Plus - 699/month): ");
                    int newPlanId = sc.nextInt();
                    int upgradeResult = ottService.upgradeSubscription(subscriptionId, newPlanId);
                    if (upgradeResult != 0) {
                        System.out.println("Subscription upgraded successfully.");
                    } else {
                        System.out.println("Subscription upgrade failed.");
                    }
                    break;

                case 4:
                    System.out.println("Enter Subscription ID: ");
                    subscriptionId = sc.nextInt();
                    ottService.cancelSubscription(subscriptionId);
                    System.out.println("Subscription cancelled successfully.");
                    break;

                case 5:
                    System.out.println("Enter Subscription ID: ");
                    subscriptionId = sc.nextInt();
                    LocalDateTime subscriptionEnd = ottService.getSubscriptionDuration(subscriptionId);
                    if (subscriptionEnd != null) {
                        System.out.println("Subscription ends on: " + subscriptionEnd);
                    } else {
                        System.out.println("Subscription not found.");
                    }
                    break;

                case 0:
                    System.out.println("Thank you for using OTT Subscription Service!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}