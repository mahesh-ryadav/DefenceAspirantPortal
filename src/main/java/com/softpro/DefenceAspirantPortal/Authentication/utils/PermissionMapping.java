package com.softpro.DefenceAspirantPortal.Authentication.utils;

import com.softpro.DefenceAspirantPortal.Authentication.dto.enums.Permission;
import com.softpro.DefenceAspirantPortal.Authentication.dto.enums.Role;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static com.softpro.DefenceAspirantPortal.Authentication.dto.enums.Permission.*;
import static com.softpro.DefenceAspirantPortal.Authentication.dto.enums.Role.*;


public class PermissionMapping {
    private static final Map<Role, Set<Permission>> map = Map.of(
            USER, Set.of(USER_VIEW,POST_VIEW,POST_DELETE,POST_UPDATE),
            ADMIN, Set.of(POST_CREATE, USER_UPDATE, POST_UPDATE,USER_CREATE, POST_DELETE)
    );

    public static Set<SimpleGrantedAuthority> getAuthoritiesForRole(Role role){
        return map.get(role).stream()
                .map(permission -> new SimpleGrantedAuthority(permission.name()))
                .collect(Collectors.toSet());
    }
}
