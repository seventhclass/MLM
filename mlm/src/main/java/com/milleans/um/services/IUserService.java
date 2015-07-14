package com.milleans.um.services;

import com.milleans.model.User;
import com.milleans.um.dto.AddressDTO;

/**
 * Created by macbookpro on 2015-03-07.
 */
public interface IUserService {

    public User signUp(User userInfo);

    public User getUser(String userId);


    public String checkEmail(String email);

    public String getSponorId(String userId);

    AddressDTO getAddress(String userId);


}
