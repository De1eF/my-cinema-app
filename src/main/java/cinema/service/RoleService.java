package cinema.service;

import cinema.model.Role;

public interface RoleService {
    Role add(Role role);

    Role get(Long id);

    Role getByName(String name);
}
