package com.wapp.webproject.hcontrol;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wapp.webproject.UserModel.Emotionregister;
import com.wapp.webproject.UserModel.Loginregister;
import com.wapp.webproject.UserModel.Userregister;
import com.wapp.webproject.webrepo.Emotionrepo;
import com.wapp.webproject.webrepo.Webrepo;

@Controller
public class Homecontrol {
	@Autowired
    Webrepo wrepo;	
	@Autowired
	Emotionrepo erepo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping(path= "/register" , method= RequestMethod.POST)
	public String addUser(@RequestParam(value="id") int id,@RequestParam(value="username") String username, @RequestParam(value="email") String email, @RequestParam(value="password") String password)
	{
		Userregister ureg= new Userregister();
		ureg.setId(id);
		ureg.setEmail(email);
		ureg.setUsername(username);
		ureg.setPassword(password);
		System.out.println("register sucess");
		wrepo.save(ureg);
		return "home.jsp";		
	}
	@RequestMapping(path= "/login" , method= RequestMethod.GET)
	public String loginuser(@RequestParam("email") String email,@RequestParam("password") String password)
	{
		System.out.println("login page");
		//Loginregister lreg= new Loginregister();		
		//lreg.setEmail(email);		
		//lreg.setPassword(password);
		List<Userregister> reg= wrepo.checkEmailPwd(email,password);
		
		if(reg.isEmpty()!=true) {
				System.out.println("login succesful");
				return "emotion.jsp";
						}
				System.out.println("login failure");
				return "home.jsp";
				
		
	}
	@RequestMapping(path= "/emotion" , method= RequestMethod.POST)
	public String addEmotion( @RequestParam(value="emotions") String emotions, @RequestParam(value="id") int id)
	{System.out.println("1111111111111111111111111111111111111111111111111111111111111");
		Emotionregister emo= new Emotionregister();
		emo.setEmotions(emotions);
		Userregister useregister= wrepo.findById(id).orElse(null);
		if(useregister==null)
		{
			return "error";
		}
		useregister.setEmos(emo);
		wrepo.save(useregister);
		
		return "emotion.jsp";		
	}

	
		
		
}

