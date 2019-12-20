import com.xyc.service.IloginService;
import com.xyc.service.IloginServiceImpl;
import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class test {
    @Test
    public void demo(){
//        IloginService ld = new IloginServiceImpl();
//        ld.test();
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/jwxt");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("123456");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(basicDataSource);


        jdbcTemplate.execute("select * from student");
        int i = jdbcTemplate.update("insert into yz_code(da_an,address) values('1243','21.png');");
        System.out.println(i);
    }
}
