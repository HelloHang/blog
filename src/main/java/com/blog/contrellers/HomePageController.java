package com.blog.contrellers;

import com.blog.models.ArticleModel;
import com.blog.models.AuthorModel;
import com.blog.models.CommitModel;
import com.blog.services.ArticleService;
import com.blog.services.CommitService;
import com.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by dan on 2017/3/20.
 */

@Controller
public class HomePageController extends AbstractPageController
{
    @Autowired
    ArticleService articleService;

    @Autowired
    UserService userService;

    @Autowired
    CommitService commitService;

    @RequestMapping("/")
    public String home(final Model model)
    {
        model.addAttribute("name", "Daniels");
        return ControllerConstant.Page.HOMEPAGE;
    }

    @RequestMapping("/save")
    @ResponseBody
    public String saveArticle(final Model model)
    {
        AuthorModel authorModel = new AuthorModel();
        authorModel.setName("Daniels");
        authorModel.setEmail("5123112321@qq.com");
        authorModel.setPhoneNumber("1231231411241");
        userService.save(authorModel);

        ArticleModel articleModel = new ArticleModel();
        articleModel.setTitle("Beautiful Home");
        articleModel.setContent("There are many flower!!");
        articleModel.setCategory("story");
        articleModel.setCreateTime(new Date());
        articleModel.setAuthor(authorModel);
        articleService.save(articleModel);

        CommitModel commit = new CommitModel();
        commit.setCreateTime(new Date());
        commit.setAuthor(authorModel);
        commit.setContent("Very Good");
        commit.setArticle(articleModel);
        commitService.save(commit);

        return "Save Success";
    }
}
