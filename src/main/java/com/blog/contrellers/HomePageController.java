package com.blog.contrellers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dan on 2017/3/20.
 */

@Controller
public class HomePageController extends AbstractPageController
{
    @RequestMapping("/")
    public String home(final Model model)
    {
        model.addAttribute("name", "Daniels");
        return ControllerConstant.Page.HOMEPAGE;
    }
}
