package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String handle(Model model){
        model.addAttribute("msg","Hello world");
        return "index";
    }
}
/**
 * @RestController = @Controller + @ResponseBody Restful json字符串
 * 请求映射
 * @RequestMapping
 * @GetMapping
 * @PostMapping
 * @PutMapping
 * @DeleteMapping
 * @PatchMapping
 * URI匹配
 * ? 1个字符
 * * >=0字符
 * ** >=0个路径段
 *其他注解
 * @RequestParam -- 将表单或者查询参数绑定到方法参数上
 * @RequestHeader -- 将请求头绑定在方法参数上
 * @CookieValue -- cookie值绑定在方法参数上
 * @ModelAttribute -- 访问模型数据,不存在则实例化
 * @SessionAttributes -- 会话属性访问
 * @SessionAttribute --管理预存会话属性
 * @ResquestAttribute
 * @RequestBody --- 反序列化为Object对象
 * @ResponseBody --- 序列化为响应主体*
 */
