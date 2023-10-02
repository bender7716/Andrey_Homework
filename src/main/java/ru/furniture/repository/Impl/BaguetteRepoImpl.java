package ru.furniture.repository.Impl;

import ru.furniture.entity.Baguette;
import ru.furniture.repository.BaguetteRepo;

import java.sql.*;
import java.util.List;

public class BaguetteRepoImpl implements BaguetteRepo {
    private final String url = "jdbc:postgresql://localhost:1111/furniture";
    private final String user = "postgres";
    private final String password = "postgres";

    @Override
    public void create(Baguette baguette, Long id) {
        String SQL_QUERY = "INSERT INTO baguette (nameBaguette, idorder) VALUES (?,?)";
        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            PreparedStatement statement = conn.prepareStatement(SQL_QUERY);
            statement.setString(1, baguette.getNameBaguette());
            statement.setLong(2, id);



            statement.executeUpdate();

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Baguette update(Baguette baget) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Baguette> getAll() {
        return null;
    }
}
