package com.time.studentmanage.domain.dto.student;

import com.time.studentmanage.domain.Address;
import com.time.studentmanage.domain.enums.AttendanceStatus;
import com.time.studentmanage.domain.enums.ClassType;
import com.time.studentmanage.domain.enums.GenderType;
import com.time.studentmanage.domain.enums.MemberType;
import com.time.studentmanage.domain.member.Student;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class StudentRespDto {
    private Long id;
    private String name;
    private String userId;
    private String password;
    private String phoneNumber;
    private String schoolName;
    private int grade;
    private AttendanceStatus attendanceStatus;
    private LocalDateTime quitDate;
    private MemberType memberType;
    private GenderType gender;
    private ClassType classType;
    private Address address;


    @Builder
    public StudentRespDto(Student student) {
        this.id = student.getId();
        this.name = student.getName();
        this.userId = student.getUserId();
        this.password = student.getPassword();
        this.phoneNumber = student.getPhoneNumber();
        this.schoolName = student.getSchoolName();
        this.grade = student.getGrade();
        this.attendanceStatus = student.getAttendanceStatus();
        this.quitDate = student.getQuitDate();
        this.memberType = student.getMemberType();
        this.gender = student.getGender();
        this.classType = student.getClassType();
        this.address = student.getAddress();
    }


}
