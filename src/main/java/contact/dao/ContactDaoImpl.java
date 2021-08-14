package contact.dao;
import contact.model.Contact;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import java.util.List;
import contact.mapper.ContactMapper;

public class ContactDaoImpl implements ContactDao{

    private JdbcTemplate jdbcTemplate;

    public ContactDaoImpl(DataSource dataSource){
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }

    @Override
    public List<Contact> list() {
        String sql="SELECT*FROM contact";
        return jdbcTemplate.query(sql, new ContactMapper());
    }

    @Override
    public void save(Contact contact) {
        String sql="INSERT INTO  contact (name, email, address, phone) Values (?,?,?,?)";
        jdbcTemplate.update(sql,contact.getName(),contact.getEmail(),contact.getAddress(),contact.getPhone());

    }

    @Override
    public void edit(Contact contact) {
        String sql="UPDATE Contact SET name=?,email=?, address=?, phone=? Where id=?";
        jdbcTemplate.update(sql,contact.getName(),contact.getEmail(),contact.getAddress(),contact.getPhone(),contact.getId());
    }

    @Override
    public void delete(int id) {
        String sql="DELETE FROM Contact WHERE id=?";
        jdbcTemplate.update(sql,id);

    }

    @Override
    public Contact get(int id) {
        String sql="SELECT * FROM Contact WHERE id=?";
        return jdbcTemplate.queryForObject(sql,new ContactMapper(), id);
    }
}
