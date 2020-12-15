package cn.zhaosunny.sqlite3;


import org.sqlite.jdbc4.JDBC4ResultSet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, SQLException {
        readDb();
    }

    public static void readDb() throws SQLException {
        Connection connection = null;
        try {
            String dbPath = "jdbc:sqlite:D:/AWebProjects/SQLStudy/databases/user.db";
            connection = DriverManager.getConnection(dbPath);
            System.out.println("连接成功");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from user;");
            List<Map<String, Object>> list = new ArrayList<>();
            System.out.println(Arrays.toString(((JDBC4ResultSet) resultSet).cols));
            while (resultSet.next()) {
                Map<String, Object> map = new HashMap<>();
                String[] colsMeta = ((JDBC4ResultSet) resultSet).colsMeta;
                for (int i = 0; i < colsMeta.length; i++) {
                    map.put(colsMeta[i], resultSet.getObject(colsMeta[i]));
                }
                list.add(map);
                System.out.println(map);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static void readFileTest() throws IOException {
        File file = new File("databases", "user.text");
        if (!file.exists()) {
            file.createNewFile();
        }
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getTotalSpace() / (1024.0 * 1024.0));
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            int available = fileInputStream.available();
            byte[] bytes = new byte[available];
            fileInputStream.read(bytes);
            System.out.println(new String(bytes));
            if (available <= 0) break;
        }
        fileInputStream.close();
    }
}
