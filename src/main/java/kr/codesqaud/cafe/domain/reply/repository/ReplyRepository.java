package kr.codesqaud.cafe.domain.reply.repository;

import kr.codesqaud.cafe.domain.article.Article;
import kr.codesqaud.cafe.domain.reply.Reply;

import java.util.List;
import java.util.Optional;

public interface ReplyRepository {

    void save(Reply reply);

    List<Reply> findAll(int index);

    void delete(int index);

//    Optional<Reply> findByIdx(int idx);

    boolean exist(int idx);
}
