package com.example.springsequrity.service;

import com.example.springsequrity.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class CustomUserDetailService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)

    public UserDetails loadUserByUsername(String id) {
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

        com.example.springsequrity.persistence.model.User user = userRepository.findOneByid(id);

        if (user != null) {
            grantedAuthorities.add(new SimpleGrantedAuthority("User"));
            return new User(user.getId(),user.getPassword(),grantedAuthorities);
        } else {
            throw new UsernameNotFoundException("can not find User:" + id);
        }
    }

}
