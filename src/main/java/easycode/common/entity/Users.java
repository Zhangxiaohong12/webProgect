package easycode.common.entity;

import java.util.Date;

/**
 * (Users)表实体类
 *
 * @author makejava
 * @since 2018-09-07 10:57:14
 */
public class Users {
    
    private String usersId;
    
    private String usersName;
    
    private Object usersPassword;
    
    private String usersRealName;
    
    private String usersSex;
    
    private String usersEmail;
    
    private String usersLocation;
    
    private Date usersTime;


    public String getUsersId() {
        return usersId;
    }

    public void setUsersId(String usersId) {
        this.usersId = usersId;
    }

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public Object getUsersPassword() {
        return usersPassword;
    }

    public void setUsersPassword(Object usersPassword) {
        this.usersPassword = usersPassword;
    }

    public String getUsersRealName() {
        return usersRealName;
    }

    public void setUsersRealName(String usersRealName) {
        this.usersRealName = usersRealName;
    }

    public String getUsersSex() {
        return usersSex;
    }

    public void setUsersSex(String usersSex) {
        this.usersSex = usersSex;
    }

    public String getUsersEmail() {
        return usersEmail;
    }

    public void setUsersEmail(String usersEmail) {
        this.usersEmail = usersEmail;
    }

    public String getUsersLocation() {
        return usersLocation;
    }

    public void setUsersLocation(String usersLocation) {
        this.usersLocation = usersLocation;
    }

    public Date getUsersTime() {
        return usersTime;
    }

    public void setUsersTime(Date usersTime) {
        this.usersTime = usersTime;
    }

}