package com.cpg.shadow.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import com.cpg.shadow.bean.OTTBean;
import com.cpg.shadow.DAO.OTTDAO;
import com.cpg.shadow.DAO.OTTDB;

public class OTTService {
    OTTDAO ottDAO = new OTTDAO();

    public int purchaseSub(OTTBean ottBean) {
        try (Connection con = OTTDB.getConnection()) {
            String ins_str = "INSERT INTO ott_database (subscriptionId, customerName, mobileNumber, planId, subscriptionStatus, subscriptionStart, subscriptionEnd) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(ins_str);
            pstmt.setInt(1, ottBean.getSubscriptionId());
            pstmt.setString(2, ottBean.getCustomerName());
            pstmt.setLong(3, ottBean.getMobileNumber());
            pstmt.setInt(4, ottBean.getPlanId());
            pstmt.setString(5, ottBean.getSubscriptionStatus());
            pstmt.setTimestamp(6, Timestamp.valueOf(ottBean.getSubscriptionStart()));
            pstmt.setTimestamp(7, Timestamp.valueOf(ottBean.getSubscriptionEnd()));
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public String viewSubscriptionStatus(int subscriptionId) {
        return ottDAO.viewSubStatus(subscriptionId);
    }

    public int upgradeSubscription(int subscriptionId, int newPlanId) {
        return ottDAO.upgradeSub(subscriptionId, newPlanId);
    }

    public void cancelSubscription(int subscriptionId) {
        ottDAO.cancelSub(subscriptionId);
    }

    public LocalDateTime getSubscriptionDuration(int subscriptionId) {
        return ottDAO.getSubDuration(subscriptionId);
    }
}