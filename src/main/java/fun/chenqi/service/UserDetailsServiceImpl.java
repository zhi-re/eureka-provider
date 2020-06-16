//package fun.chenqi.service;
//
//import fun.chenqi.entity.MyUser;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
///**
// * @author chenqi
// * @date 2019/7/10 14:51
// */
//@Configuration
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        // 模拟一个用户，替代数据库获取逻辑
//        MyUser user = new MyUser();
//        user.setUserName(username);
//        user.setPassword(this.passwordEncoder.encode("123456"));
//        // 输出加密后的密码
//        System.out.println(user.getPassword());
//
//        return new User(username, user.getPassword(), user.isEnabled(),
//                user.isAccountNonExpired(), user.isCredentialsNonExpired(),
//                user.isAccountNonLocked(), AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
//    }
//}
//
//
//