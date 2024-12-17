package com.example.board.Repository;

import com.example.board.Entity.BoardEntity;
import org.antlr.v4.runtime.atn.SemanticContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //쿼리영역
//JPARepository<테이블명, id필드의 데이터형>
public interface BoardRepository extends JpaRepository<BoardEntity, Integer> {
    //기본 CRUD 제공
    //find필드명 AND(OR)필드명
    //SQL문을 필드명으로 조합해서 사용

}
