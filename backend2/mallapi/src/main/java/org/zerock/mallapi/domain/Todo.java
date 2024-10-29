package org.zerock.mallapi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.time.LocalDate;

@Entity
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Table(name="tbl-todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tno;

    @Column(length=500,nullable = false)
    private String title;

    private String content;

    private boolean complete;

    private LocalDate dueDate;

    private String writer;  // writer 필드 추가

    public void changeTitle(String title) {
        this.title=title;
    }

    public void changeContent(String content) {
        this.content=content;
    }
    
    public void changeComplete(boolean complete) {
        this.complete=complete;
    }

    public void changeDueDate(LocalDate dueDate) {
        this.dueDate=dueDate;
    }

}