package com.atguigu.web.contoller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//由于服务器渲染需要后端进行页面跳转，所以不能用@RequestBody@RestController @ResponseBody
//因为使用后会将返回值作为类型返回给原先页面
@Controller
public class WelcomeController {

//    @RequestMapping("/welcome")
//    public String hello(){
//
//
//        //模板的逻辑视图名
//        //物理视图=前缀+逻辑视图名+后缀
//        return "welcome";
//    }

    @RequestMapping("/welcome")
    public ModelAndView hello(){
        ModelAndView modelAndView = new ModelAndView();

        //模板的逻辑视图名
        //物理视图=前缀+逻辑视图名+后缀
        modelAndView.addObject("msg","lisi");
        modelAndView.setViewName("welcome");
        return modelAndView;
    }

//    @RequestMapping("/welcome")
//    public String hello(@RequestParam("name")String name, Model model){
//        model.addAttribute("msg",name);
//        return "welcome";
//    }
}
