package ru.furniture.repository.Impl;

import ru.furniture.entity.Order;
import ru.furniture.repository.OrderRepo;

import java.sql.*;
import java.util.List;

public class OrderRepoImpl implements OrderRepo {
    private final String url = "jdbc:postgresql://localhost:1111/furniture";
    private final String user = "postgres";
    private final String password = "postgres";

    @Override
    public void create(Order order) {
        String SQL_GET_ID = "SELECT nextval('order_number_id_seq')";
        String SQL_QUERY = "INSERT INTO order_number (id, nameOrder, startDateOrder, ednDateOrder) VALUES (?, ?, ?, ?)";
        DatabaseMetaData DriverManager;
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement getIdStatement = conn.createStatement();
            ResultSet resultSet = getIdStatement.executeQuery(SQL_GET_ID);
            while (resultSet.next()) {
                order.setId(resultSet.getLong("nextval"));
            }
            PreparedStatement statement = conn.prepareStatement(SQL_QUERY);
            statement.setLong(1, order.getId());
            statement.setString(2, order.getNameOrder());
            statement.setDate(3, Date.valueOf(order.getStartDateOrder()));
            statement.setDate(4, Date.valueOf(order.getEndDateOrder()));

            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Order update(Order order) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Order> getAll() {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM order_number");
            while (rs.next()) {
                System.out.print("Column 1 returned ");
                System.out.println(rs.getString(1));
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
