package com.cryspace.mapper;

import com.cryspace.model.Student;
import org.springframework.stereotype.Repository;

/**
 * Created by bill on 2017/2/18.
 */

@Repository
public interface StudentMapper {

    public int addStudent(Student student);

    public int updateStudent(Student student);


}
