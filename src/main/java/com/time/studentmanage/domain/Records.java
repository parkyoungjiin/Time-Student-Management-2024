package com.time.studentmanage.domain;

import com.time.studentmanage.domain.member.Student;
import com.time.studentmanage.domain.member.Teacher;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter @Setter
public class Records {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "record_id")
    private Long id;

    private String content;
    private LocalDateTime createDate;
    private LocalDateTime modifiedDate;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ManyToOne(fetch = LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;

    @OneToMany(mappedBy = "records")
    private List<Answer> answerList = new ArrayList<>();

    //===연관관계 편의 메서드===//
    public void addTeacher(Teacher teacher) {
        this.teacher = teacher;
        teacher.getRecordsList().add(this);
    }
}