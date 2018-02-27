
package com.tbj.edu.web.controller.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bjtang
 * @date   2017??5??17??  
 * @desc   user controller
 */

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/index")
	public void index(){
		System.out.println("index");
		System.out.print("1");
		System.out.println("home test");
	}
	
}
