package com.myProject.content_calendar.repository;

import com.myProject.content_calendar.model.Content;
import com.myProject.content_calendar.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

// is an interface but spring knows to use it as a class
public interface ContentRepository extends ListCrudRepository<Content, Integer> {
    List<Content> findAllByTitleContains(String keyword);
    @Query("""
            SELECT * FROM Content
            where status = :status
            """)
    List<Content> listByStatus(@Param("status") Status status);
}
