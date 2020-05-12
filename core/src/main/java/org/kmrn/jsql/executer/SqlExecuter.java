package org.kmrn.jsql.executer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.kmrn.jsql.db.MysqlConnect;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SqlExecuter {
    public void execute(String sql) {
        log.info("Executing Query={}", sql);
        MysqlConnect mysqlConnect = new MysqlConnect();
        try {
            PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            ResultSetMetaData metadata = rs.getMetaData();
            int numberOfColumns = metadata.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i < numberOfColumns + 1; ++i) {
                    System.out.println(rs.getString(i));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            mysqlConnect.disconnect();
        }
    }
}
