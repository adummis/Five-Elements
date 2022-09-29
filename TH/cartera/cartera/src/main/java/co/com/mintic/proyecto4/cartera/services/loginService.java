package co.com.mintic.proyecto4.cartera.services;

import co.com.mintic.proyecto4.cartera.entities.UserEntity;
import co.com.mintic.proyecto4.cartera.repositories.IUserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service("userDetailsService")
public class loginService implements UserDetailsService {

    @Autowired
    private IUserRepository userEntityDao;

    @Override
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userEntityDao.findByUsername(username);

        if(userEntity == null){
            throw new UsernameNotFoundException(username);
        }

        var roles = new ArrayList<GrantedAuthority>();

        roles.add(new SimpleGrantedAuthority( userEntity.getRoleEntity().getDescripcion()));

        return new User(userEntity.getUsername(), username.getkey(), roles);
    }
}
