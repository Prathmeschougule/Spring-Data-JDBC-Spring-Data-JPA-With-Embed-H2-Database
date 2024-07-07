package Testing.testDb2;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.jdbc.core.JdbcTemplate;


@RestController
public class MyControler {
    @Autowired
    MyRepository myRepository;

    @RequestMapping("ct")
    public String CreateTable() {
        myRepository.CreateTable();
        return "Create DataTable Succsefully!!";
    }

    @RequestMapping("at")
    public String PrintTable() {
        myRepository.insertData();
        return "Add data Succefully";
    }
    @RequestMapping("de")
    public String DeleteTable() {
        myRepository.deletetable(2);
        return "Delete Succefully";
    }

    //homeWork
    @RequestMapping("u")
    public String Upadetable() {                       
        myRepository.upadatedata(2,"raju");
        return "Update Succefully";
    }
    
    @RequestMapping("GAN")
    public List<String>PrintAllData() {
        return myRepository.getAllName();
    }
    
    
}
