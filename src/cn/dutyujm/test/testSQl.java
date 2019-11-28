package cn.dutyujm.test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

/**
 * Mysql千万级别数据批量插入
 *
 * 1）配置my.ini文件
 *      文件中配置
 *          bulk_insert_buffer_size=120M 或者更大
 *      将insert语句的长度设为最大。
 *          max_allowed_packet=1M
 *          net_buffer_length=8k
 *      保存
 * 2）查看设置的参选有没有生效.
 *      SHOW VARIABLES;  --bulk_insert_buffer_size默认是8M，我们要把它调成100M或百兆以上，也不要太大。
 * 3）INSERT INTO table (field1,field2,field3) VALUES ('a',"b","c"), ('a',"b","c"),('a',"b","c");
 *      将以上Mysql插入模式用java语言字符串拼接SQL方法如下
 */
public class testSQl {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn;
        PreparedStatement stmt;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://114.115.184.18:3306/ces_dev";
        String user = "root";
        String password = "root";
        //String sql = "insert into test values (?,?,?)";
        String sql = "insert into classroom (begin_date,course_id,end_date,term_type,name,status,daily_performance_weight,test_performance_weight) values (?,?,?,?,?,?,?,?),(?,?,?,?,?,?,?,?),(?,?,?,?,?,?,?,?),(?,?,?,?,?,?,?,?),(?,?,?,?,?,?,?,?),(?,?,?,?,?,?,?,?),(?,?,?,?,?,?,?,?),(?,?,?,?,?,?,?,?),(?,?,?,?,?,?,?,?),(?,?,?,?,?,?,?,?)";
        Class.forName(driver);
        conn = DriverManager.getConnection(url, user, password);
        stmt = (PreparedStatement) conn.prepareStatement(sql);
        System.out.println(new Date());

        Date now = new Date();
        String nowString = now.toString();
        Integer CourseId = 11;
        Integer termType = 1;
        Integer status = 1;
        Double daily_performance_weight = 0.7;
        Double test_performance_weight = 0.3;

        for (int i = 50058; i < 10000000; i = i +10) {
            stmt.setString(1, null);
            stmt.setString(2, CourseId.toString());
            stmt.setString(3, null);
            stmt.setString(4, termType.toString());
            stmt.setString(5, "diergenameva" + ((i + 1)));
            stmt.setString(6, status.toString());
            stmt.setString(7, daily_performance_weight.toString());
            stmt.setString(8, test_performance_weight.toString());

            stmt.setString(9, null);
            stmt.setString(10, CourseId.toString());
            stmt.setString(11, null);
            stmt.setString(12, termType.toString());
            stmt.setString(13, "namedbfasd" + ((i + 2)));
            stmt.setString(14, status.toString());
            stmt.setString(15, daily_performance_weight.toString());
            stmt.setString(16, test_performance_weight.toString());

            stmt.setString(17, null);
            stmt.setString(18, CourseId.toString());
            stmt.setString(19, null);
            stmt.setString(20, termType.toString());
            stmt.setString(21, "namegdfd" + ((i + 3)));
            stmt.setString(22, status.toString());
            stmt.setString(23, daily_performance_weight.toString());
            stmt.setString(24, test_performance_weight.toString());

            stmt.setString(25, null);
            stmt.setString(26, CourseId.toString());
            stmt.setString(27, null);
            stmt.setString(28, termType.toString());
            stmt.setString(29, "nameasdfasdf" + ((i + 4)));
            stmt.setString(30, status.toString());
            stmt.setString(31, daily_performance_weight.toString());
            stmt.setString(32, test_performance_weight.toString());

            stmt.setString(33, null);
            stmt.setString(34, CourseId.toString());
            stmt.setString(35, null);
            stmt.setString(36, termType.toString());
            stmt.setString(37, "namfdasdf" + ((i + 5)));
            stmt.setString(38, status.toString());
            stmt.setString(39, daily_performance_weight.toString());
            stmt.setString(40, test_performance_weight.toString());

            stmt.setString(41, null);
            stmt.setString(42, CourseId.toString());
            stmt.setString(43, null);
            stmt.setString(44, termType.toString());
            stmt.setString(45, "namefdsa" + ((i + 6)));
            stmt.setString(46, status.toString());
            stmt.setString(47, daily_performance_weight.toString());
            stmt.setString(48, test_performance_weight.toString());

            stmt.setString(49, null);
            stmt.setString(50, CourseId.toString());
            stmt.setString(51, null);
            stmt.setString(52, termType.toString());
            stmt.setString(53, "namedfsaf" + ((i + 7)));
            stmt.setString(54, status.toString());
            stmt.setString(55, daily_performance_weight.toString());
            stmt.setString(56, test_performance_weight.toString());

            stmt.setString(57, null);
            stmt.setString(58, CourseId.toString());
            stmt.setString(59, null);
            stmt.setString(60, termType.toString());
            stmt.setString(61, "namesdfa" + ((i + 8)));
            stmt.setString(62, status.toString());
            stmt.setString(63, daily_performance_weight.toString());
            stmt.setString(64, test_performance_weight.toString());

            stmt.setString(65, null);
            stmt.setString(66, CourseId.toString());
            stmt.setString(67, null);
            stmt.setString(68, termType.toString());
            stmt.setString(69, "namefdsa" + ((i + 9)));
            stmt.setString(70, status.toString());
            stmt.setString(71, daily_performance_weight.toString());
            stmt.setString(72, test_performance_weight.toString());


            stmt.setString(73, null);
            stmt.setString(74, CourseId.toString());
            stmt.setString(75, null);
            stmt.setString(76, termType.toString());
            stmt.setString(77, "name" + ((i + 10)));
            stmt.setString(78, status.toString());
            stmt.setString(79, daily_performance_weight.toString());
            stmt.setString(80, test_performance_weight.toString());

            stmt.executeUpdate();
        }
        System.out.println(new Date());

        try {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
