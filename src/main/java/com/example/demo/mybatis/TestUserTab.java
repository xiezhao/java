package com.example.demo.mybatis;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * test_user_tab
 * @author 
 */
@Data
public class TestUserTab implements Serializable {
    private Integer userid;

    private String useraccount;

    private String password;

    private Boolean userstatus;

    private Date addtime;

    private static final long serialVersionUID = 1L;
}