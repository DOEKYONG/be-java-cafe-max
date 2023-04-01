package kr.codesqaud.cafe.controller;

import kr.codesqaud.cafe.domain.question.Article;
import kr.codesqaud.cafe.dto.ArticleFormDto;
import kr.codesqaud.cafe.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ArticleController {

    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping("/article/write")
    public String postQuestion(ArticleFormDto articleFormDto) {
        articleService.questionWrite(articleFormDto);
        return "redirect:/";
    }

    @GetMapping("/article/show/{index}")
    public String getShow(@PathVariable int index, Model model) {
        List<Article> list = articleService.getArticleList();
        model.addAttribute("article", list.get(index));
        return "qna/show";
    }


    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("articleList", articleService.getArticleList());
        return "index";
    }

}
