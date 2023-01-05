package com.owaiss.service;

import com.owaiss.dto.UserModelDTO;
import com.owaiss.dto.UserResponseDTO;
import com.owaiss.model.UserModel;

public interface UserService {

    UserResponseDTO updateUserDetails(UserModel userModel) throws Exception;



}
