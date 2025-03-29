package com.gluckscare.services;


import com.gluckscare.entitiy.UserEntity;
import com.gluckscare.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByUserName(userName);
        if(userEntity!=null){
            UserDetails user = User.builder()
                    .username(userEntity.getUserName())
                    .password(userEntity.getPassword())
                    .roles(userEntity.getRole().toArray(new String[0]))
                    .build();
            return  user;
        }else{
            throw new UsernameNotFoundException("User not found with user email: " +userName);
        }
    }
}
