package com.cpg.shadow.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import com.cpg.shadow.bean.OTTBean;

public class OTTDAO {

    public String viewSubStatus(int subscriptionId) {
        try (Connection con = OTTDB.getConnection()) {
            String sel_str = "SELECT subscriptionStatus FROM ott_database WHERE subscriptionId = ?";
            PreparedStatement pstmt = con.prepareStatement(sel_str);
            pstmt.setInt(1, subscriptionId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getString("subscriptionStatus");
            } else {
                return "Subscription not found";
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            return "Error";
        }
    }

    public int upgradeSub(int subscriptionId, int newPlanId) {
        try (Connection con = OTTDB.getConnection()) {
            String upd_str = "UPDATE ott_database SET planId = ? WHERE subscriptionId = ?";
            PreparedStatement pstmt = con.prepareStatement(upd_str);
            pstmt.setInt(1, newPlanId);
            pstmt.setInt(2, subscriptionId);
            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public void cancelSub(int subscriptionId) {
        try (Connection con = OTTDB.getConnection()) {
            String upd_str = "UPDATE ott_database SET subscriptionStatus = 'Cancelled' WHERE subscriptionId = ?";
            PreparedStatement pstmt = con.prepareStatement(upd_str);
            pstmt.setInt(1, subscriptionId);
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public LocalDateTime getSubDuration(int subscriptionId) {
        try (Connection con = OTTDB.getConnection()) {
            String sel_str = "SELECT subscriptionEnd FROM ott_database WHERE subscriptionId = ?";
            PreparedStatement pstmt = con.prepareStatement(sel_str);
            pstmt.setInt(1, subscriptionId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Timestamp timestamp = rs.getTimestamp("subscriptionEnd");
                return timestamp.toLocalDateTime();
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}