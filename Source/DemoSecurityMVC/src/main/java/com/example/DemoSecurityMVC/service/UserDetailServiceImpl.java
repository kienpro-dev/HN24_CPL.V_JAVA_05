package com.example.DemoSecurityMVC.service;

import com.example.DemoSecurityMVC.entity.Account;
import com.example.DemoSecurityMVC.repository.AccountRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class UserDetailServiceImpl implements UserDetailsService {
    private AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.findByUsername(username);
        if (account == null) {
            throw new UsernameNotFoundException("Could not find user with that email");
        }

        return account;
    }
//
//    private User createSpringSecurityUser(String username, Account account) throws Exception {
//        if (!account.isActivated()) {
//            throw new Exception("Account: " + username + " was not activated");
//        }
//        List<GrantedAuthority> grantedAuthorities = account
//                .getAuthorities()
//                .stream()
//                .map(authority -> "ROLE_" + authority.getAuthority()) // ROLE_ADMIN or ROLE_USER
//                .map(SimpleGrantedAuthority::new)
//                .collect(Collectors.toList());
//        return new User(account.getUsername(), account.getPassword(), grantedAuthorities);
//    }

}
