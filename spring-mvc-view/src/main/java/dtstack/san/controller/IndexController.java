package dtstack.san.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @description: 是舞台把你放大了，还是你自己有本事，再好的公司也有最烂的人，再小的公司也有最牛的人
 * @author: 33
 * @time: 2019/10/30 20:44
 */

@Controller
public class IndexController {

    @GetMapping({"/", ""})
    public String index(Model model) {
        //内置对象
        model.addAttribute("string", new StringUtil());
        return "index";
    }

    public static class StringUtil{
        StringUtil(){}

        public boolean isNotBlank(String value) {
            return StringUtils.hasText(value);
        }

    }

    @ModelAttribute(name = "message")
    public String message() {
        return "hello world";
    }
}
