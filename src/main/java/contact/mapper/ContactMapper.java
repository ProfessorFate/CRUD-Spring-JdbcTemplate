package contact.mapper;

import contact.model.Contact;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactMapper implements RowMapper<Contact> {
    @Override
    public Contact mapRow(ResultSet resultSet, int i) throws SQLException {
        Contact contact=new Contact();
        contact.setId(resultSet.getInt("id"));
        contact.setName(resultSet.getString("name"));
        contact.setEmail(resultSet.getString("email"));
        contact.setAddress(resultSet.getString("address"));
        contact.setPhone(resultSet.getString("phone"));
        return contact;
    }
}
