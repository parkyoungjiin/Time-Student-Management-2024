package com.time.studentmanage.domain.dto.student;

import com.time.studentmanage.domain.enums.SearchType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentSearchReqDto {

    private SearchType searchType;
    private String content;
    private int page;
}
