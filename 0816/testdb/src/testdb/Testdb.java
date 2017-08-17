/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdb;
import java.sql.*;
import java.io.*;
import javax.sql.rowset.*;
/**
 *
 * @author student
 */
public class Testdb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String url = "jdbc:derby://localhost:1527/test";
        String user = "root";
        String pass = "root";
        /*
        try(Connection con = DriverManager.getConnection(url,user,pass)){
            System.out.println("success");
        }catch(SQLException ex){
            
        }
        */
        /*
        try(Connection con = DriverManager.getConnection(url,user,pass);
            Statement stm = con.createStatement())                  {
            String sqll = "create table emp2 (id integer not null primary key ,name varchar(11),sex varchar(1))";
            stm.executeUpdate(sqll);
            System.out.println("success");
        }catch(SQLException ex){
            System.out.println(ex);
        }
        */
        /*
        try(Connection con = DriverManager.getConnection(url,user,pass);
            Statement stm = con.createStatement())                  {
            String[] sqll = {   "insert into emp2 (id,name,sex) values(1,\'Tom\',\'男\')",
                                "insert into emp2 (id,name,sex) values(2,\'Mary\',\'女\')",
                                "insert into emp2 (id,name,sex) values(3,\'Helent\',\'女\')"};
            //stm.executeUpdate(sqll);
            int cont = 0;
            for(String temp : sqll){
                stm.executeUpdate(temp);
                cont++;
                System.out.println("新增" + cont);
            }
            System.out.println(" success");
        }catch(SQLException ex){
            System.out.println(ex);
        }
        */
        //String sqll = "select * from emp2 where sex = \'女\'";
        /*
        String sqll = "select * from emp2 where name like \'%M%\' or name like \'%n%\'";
         try(Connection con = DriverManager.getConnection(url,user,pass);
             Statement stm = con.createStatement();
             ResultSet rs = stm.executeQuery(sqll))                  {
             System.out.println("ID\tName\tSEX");
             
             while(rs.next()){
                 
                 //System.out.print(rs.getInt("id") + "\t");
                // System.out.print(rs.getString("name") + "\t");
                 //System.out.println(rs.getString("sex"));
                
                 for(int i=1;i<=3;i++){
                     System.out.print(rs.getString(i) + "\t");
                 }
                 System.out.println();
             }
            
            System.out.println(" success");
        }catch(SQLException ex){
            System.out.println(ex);
        }
        */
         /*String sqll = "select * from emp2";
         try(Connection con = DriverManager.getConnection(url,user,pass);
             Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stm.executeQuery(sqll))                  {
             System.out.println("ID\tName\tSEX");
             if(rs.isFirst()){
                 System.out.println("is first");
             }else{
                 System.out.println("not first");
             }
             rs.next();
             if(rs.isFirst()){
                 System.out.println("is first");
             }else{
                 System.out.println("not first");
             }
             rs.next();
             System.out.println("第" + rs.getRow()+ "比");
             rs.next();
             System.out.println("第" + rs.getRow()+ "比");
             if(rs.isLast()){
                 System.out.println("is Last");
             }else{
                 System.out.println("not Last");
             }
             //---------------------------------------------
             rs.previous();//往前一筆
             System.out.println("第" + rs.getRow()+ "比");
             rs.previous();
             System.out.println("第" + rs.getRow()+ "比");
             rs.previous();
             System.out.println("第" + rs.getRow()+ "比");
             rs.last();
             System.out.println("第" + rs.getRow()+ "比");
             rs.first();
             System.out.println("第" + rs.getRow()+ "比");
             do{
                 for(int i=1;i<=3;i++){
                     System.out.print(rs.getString(i) + "\t");
                 }
                 System.out.println();
             }while(rs.next());
             
             while(rs.next()){
                 
                 //System.out.print(rs.getInt("id") + "\t");
                 //System.out.print(rs.getString("name") + "\t");
                // System.out.println(rs.getString("sex"));
                
                 for(int i=1;i<=3;i++){
                     System.out.print(rs.getString(i) + "\t");
                 }
                 System.out.println();
             }
            
            System.out.println(" success");
        }catch(SQLException ex){
            System.out.println(ex);
        }
         */
       // String sqll = "select * from emp2";
       /*
          try(Connection con = DriverManager.getConnection(url,user,pass);
             Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stm.executeQuery(sqll))                  {
              
              int colnum = rs.getMetaData().getColumnCount();
              System.out.println("欄位數" + colnum + "欄");
              String[] colName = new String[colnum];
              String[] colType = new String[colnum];
              
              for(int i=0;i<colnum;i++){
                  colName[i] = rs.getMetaData().getColumnName(i+1);
                  colType[i] = rs.getMetaData().getColumnTypeName(i+1);
              }
              
              for(int i=0;i<colnum;i++){
                  System.out.println(colName[i] + " " + colType[i]);
              }
          }catch(SQLException ex){
            System.out.println(ex);
        }
          */
       /*
       String sqll = "delete from emp2 where name = \'Tom\'";
       try(Connection con = DriverManager.getConnection(url,user,pass);
             Statement stm = con.createStatement()) {
              int count = stm.executeUpdate(sqll);
              System.out.println("刪除" + count + "筆");
          }catch(SQLException ex){
            System.out.println(ex);
        }
*/
       /*
       String sqll = "update emp2 set name = \'Helem\' where name = \'Helen\'";
       try(Connection con = DriverManager.getConnection(url,user,pass);
             Statement stm = con.createStatement()) {
              int count = stm.executeUpdate(sqll);
              System.out.println("刪除" + count + "筆");
          }catch(SQLException ex){
            System.out.println(ex);
        }
       */
       /*
       String sqll = "insert into emp2 (id ,name ,sex)values(?,?,?)";
       try(Connection con = DriverManager.getConnection(url,user,pass);
             PreparedStatement ps = con.prepareStatement(sqll)) {
              ps.setInt(1,4);
              ps.setString(2, "Ban");
              ps.setString(3, "男");
              int count = ps.executeUpdate();
              System.out.println("新增" + count + "筆");
          }catch(SQLException ex){
            System.out.println(ex);
        }
       */
       try(JdbcRowSet rowset = RowSetProvider.newFactory().createJdbcRowSet()){
           rowset.setUrl(url);
           rowset.setUsername(user);
           rowset.setPassword(pass);
           rowset.setCommand("select * from emp2");
           rowset.execute();
           while(rowset.next()){
               for(int i=1;i<=3;i++){
                     System.out.print(rowset.getString(i) + "\t");
                 }
                 System.out.println();
           }
       }catch(SQLException ex){
            System.out.println(ex);
        }

    }
    
}
