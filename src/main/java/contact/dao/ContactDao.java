package contact.dao;

import contact.model.Contact;

import java.util.List;

public interface ContactDao {

    List<Contact> list();

    void save(Contact contact);

    void edit (Contact contact);

    void delete(int id);

    Contact get (int id);
}
