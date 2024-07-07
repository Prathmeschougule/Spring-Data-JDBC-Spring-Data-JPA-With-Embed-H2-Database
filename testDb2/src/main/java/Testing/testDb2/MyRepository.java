package Testing.testDb2;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
//dependacy Injection 
    JdbcTemplate jdbcTemplate;

    MyRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    public void CreateTable(){
        jdbcTemplate.execute("CREATE TABLE my_table (ID INT AUTO_INCREMENT PRIMARY KEY, NAME VARCHAR(255));"); 

    }
    public void insertData(){
        jdbcTemplate.update("INSERT INTO my_table(name) VALUES('Prathmesh');");
    }
    public void deletetable(int id){
        jdbcTemplate.update("DELETE FROM my_table WHERE ID=?;",id);
    }
    public void upadatedata(int id,String newname) {
        jdbcTemplate.update("UPDATE my_table SET Name = ? WHERE ID = ?;",newname,id);
    }
    public List<String> getAllName(){
        return jdbcTemplate.queryForList("SELECT name FROM my_table",String.class);
    }
    
    
}
