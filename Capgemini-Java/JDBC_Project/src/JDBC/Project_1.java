package JDBC;

import java.sql.*;

public class Project_1 {
    private String name;
    private int age;
    private int id;

    String URL = "jdbc:mysql://localhost:3306/student_db";
    String USER = "root";
    String PASSWORD = "Sabthika@28";

    public Project_1() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }

    public void insertStudent() {
        insertToDB();
    }

    public void updateStudent() {
        updateInDB();
    }

    public void deleteStudent() {
        deleteFromDB();
    }

    public void retrieveStudents() {
        getStudentsFromDB();
    }

    private void insertToDB() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "INSERT INTO students (name, age) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.executeUpdate();
            System.out.println("Inserted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateInDB() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "UPDATE students SET name = ?, age = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setInt(3, id);
            ps.executeUpdate();
            System.out.println("Updated successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void deleteFromDB() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "DELETE FROM students WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Deleted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getStudentsFromDB() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "SELECT * FROM students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("\n--- Student Records ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Age: " + rs.getInt("age"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
