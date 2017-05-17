
package com.tbj.edu.web.controller.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bjtang
 * @date   2017Äê5ÔÂ17ÈÕ  
 * @desc   user controller
 */

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/index")
	public void index(){
		System.out.println("index");
	}
	
}
