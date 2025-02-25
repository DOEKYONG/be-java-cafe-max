package kr.codesqaud.cafe.domain.article.repository;

import kr.codesqaud.cafe.domain.article.Article;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class ArticleMemoryRepository implements ArticleRepository {
    private final List<Article> articles = new ArrayList<>();

    @Override
    public void save(Article article) {
        articles.add(article);
    }

    @Override
    public List<Article> findAll() {
        return articles;
    }

    @Override
    public Optional<Article> findByIdx(int idx) {
        return null;
    }

    @Override
    public void update(Article article) {
    }

    @Override
    public void delete(int index) {
    }
}
