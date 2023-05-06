package cinema.dao.impl;

import cinema.dao.AbstractDao;
import cinema.dao.RoleDao;
import cinema.exception.DataProcessingException;
import cinema.model.Role;
import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getByName(Role.RoleName name) {
        try (Session session = factory.openSession()) {
            Query<Role> getByUser = session.createQuery(
                    "SELECT DISTINCT r FROM Role r "
                            + "WHERE r.name = :name", Role.class);
            getByUser.setParameter("name", name.name());
            return Optional.of(getByUser.getSingleResult());
        } catch (Exception e) {
            throw new DataProcessingException("Not found role for name " + name, e);
        }
    }
}
