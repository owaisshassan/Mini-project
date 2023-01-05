package com.owaiss.service;

import java.util.List;

import com.owaiss.dto.AuthenticatedResponseDto;
import com.owaiss.dto.ChangeUserPasswordDto;
import com.owaiss.dto.RegisterDto;
import com.owaiss.dto.UserLoginDto;
import com.owaiss.model.*;

public interface ManageUserService {

    String registerCustomer(RegisterDto registerDto, String userType);
    
    AuthenticatedResponseDto loginUser(UserLoginDto loginDto);

    String addAddress(Address address);
    
    String changePassword(ChangeUserPasswordDto password);

    UserModel getUser();

    Address editAddress(Address address);
    
    String deleteAddress(Integer addressId);

    Address getAddress(Integer addressId);
    
    List<Address> getAllOfUser();
    
}
