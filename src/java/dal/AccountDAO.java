/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import entity.Account;
import entity.Functionality;
import entity.Group;
import entity.LoadAccount;
import entity.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cauch
 */
public class AccountDAO extends BaseDAO<Account> {

    @Override
    public void add(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Account> list() {
        ArrayList<Account> accounts = new ArrayList<>();
        try {
            String sql = "SELECT accountid FROM Account";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Account account = new Account();
                account.setAccountid(rs.getString("accountid"));
                accounts.add(account);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }
        return accounts;
    }

    @Override
    public Account get(int ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Account get(String accountid, String password) {
        Account account = null;
        try {
            String sql = "SELECT a.accountid,g.groupid,g.groupname,f.functionid,"
                    + "f.url FROM \n"
                    + "Account a INNER JOIN Group_Account ga\n"
                    + "ON a.accountid = ga.accountid\n"
                    + "INNER JOIN [Group] g ON g.groupid = ga.groupid\n"
                    + "INNER JOIN [Group_Functionality] gf ON gf.groupid = g.groupid\n"
                    + "INNER JOIN Functionality f ON gf.functionid = f.functionid\n"
                    + "WHERE a.accountid = ? AND a.[password] = ? "
                    + "ORDER BY g.groupid";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, accountid);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
            Group currentGroup = new Group();

            currentGroup.setID(-1);
            while (rs.next()) {
                if (account == null) {
                    account = new Account();
                    account.setAccountid(rs.getString("accountid"));
                }
                if (currentGroup.getID() != rs.getInt("groupid")) {
                    currentGroup = new Group();
                    currentGroup.setID(rs.getInt("groupid"));
                    currentGroup.setName(rs.getString("groupname"));
                    account.getGroups().add(currentGroup);
                }
                Functionality function = new Functionality();
                function.setID(rs.getInt("functionid"));
                function.setUrl(rs.getString("url"));
                currentGroup.getFuntions().add(function);
            }
            return account;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }
        return null;
    }

    public int addAccount(String accountid, String password) {
        try {
            String sql = "INSERT INTO [dbo].[Account]\n"
                    + "           ([accountid]\n"
                    + "           ,[password])\n"
                    + "     VALUES\n"
                    + "           (?,?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, accountid);
            statement.setString(2, password);
            return statement.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return 0;
    }

    public int addGroupAccount(String accountid, int i) {
        try {
            String sql = "INSERT INTO [dbo].[Group_Account]\n"
                    + "           ([accountid]\n"
                    + "           ,[groupid])\n"
                    + "     VALUES\n"
                    + "           (?,?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, accountid);
            statement.setInt(2, i);
            return statement.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return 0;
    }

    public ArrayList<LoadAccount> listAccount() {
        ArrayList<LoadAccount> accounts = new ArrayList<>();
        try {
            String sql = "Select a.*, g.groupname, g.groupid from Account as a inner join Group_Account as ga "
                    + "on a.accountid = ga.accountid inner join [group] as g on ga.groupid = g.groupid order by groupid asc";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                LoadAccount a = new LoadAccount();
                a.setAccountid(rs.getString("accountid"));
                a.setPassword(rs.getString("password"));
                a.setGroupname(rs.getString("groupname"));
                accounts.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }
        return accounts;
    }

    public void deleteacc(String accountid) {
        try {
            String sql = "DELETE FROM [dbo].[Account]\n"
                    + " WHERE accountid = ? ";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, accountid);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }
    }

    public void deleteacc1(String accountid) {
        try {
            String sql = "DELETE FROM [dbo].[Group_Account]\n"
                    + " WHERE accountid = ? ";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, accountid);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }
    }

    public void uprole(String accountid) {
        try {
            String sql = "UPDATE [dbo].[Group_Account]\n"
                    + "   SET \n"
                    + "      [groupid] = 2\n"
                    + " WHERE [accountid] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, accountid);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }
    }

}
