/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aqsw_managment;

/**
 *
 * @author p075446
 */
public class CUserInfo {
    
    private String userLogin;
    private String userPassword;
    private String userProfile;
    
    
    CUserInfo(String usrlogin, String usrpwd, String usrprof)
    {
        this.userLogin = usrlogin;
        this.userPassword = usrpwd;
        this.userProfile = usrprof;
    }
    
    public String getuserLogin()
    {
        return userLogin;
    }
    
    public String getuserPassword()
    {
        return userPassword;
    }
    
    public String getuserProfile()
    {
        return userProfile;
    }
    
    public void  setuserLogin(String ulog)
    {
        userLogin = ulog;
    }
    
    public void setuserPassword(String upwd)
    {
        userPassword = upwd;
    }
    
    public void setuserProfile(String upf)
    {
        userProfile = upf;
    }
}
