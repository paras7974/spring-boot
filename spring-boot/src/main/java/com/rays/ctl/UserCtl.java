package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.UserDto;
import com.rays.form.UserForm;
import com.rays.service.UserServiceInt;

@RestController
@RequestMapping(value = "User")
public class UserCtl extends BaseCtl<UserForm, UserDto, UserServiceInt> {

	@PostMapping("signUp")
	public String signUp(@RequestBody UserForm form) {

		UserDto dto = new UserDto();

		dto.setFirstName(form.getFirstName());
		dto.setLastName(form.getLastName());
		dto.setLoginId(form.getLoginId());
		dto.setPassword(form.getPassword());
		dto.setDob(form.getDob());

		baseService.add(dto);
		return "data added";

	}

	@PostMapping("update")
	public String update(@RequestBody UserForm form) {

		UserDto dto = new UserDto();

		dto.setFirstName(form.getFirstName());
		dto.setLastName(form.getLastName());
		dto.setLoginId(form.getLoginId());
		dto.setPassword(form.getPassword());
		dto.setDob(form.getDob());
		dto.setId(form.getId());

		baseService.update(dto);
		return "data updated";

	}
	
	@GetMapping("delete/{id}")
	public String delete(@PathVariable long id) {
		
		baseService.delete(id);
		return "data deleted";
		
	}
	
	@GetMapping("get/{id}")
	public Object get(@PathVariable long id) {
		return baseService.findById(id);
		
	}

}
