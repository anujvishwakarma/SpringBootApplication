package com.example.myUIDemo.DaoService;

import com.example.myUIDemo.ModelClass.Question;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Anuj Kumar Vishwakarma(Zeref)
 * @Time 18/03/18 : 11:35 AM
 */

public interface QuestionRepository extends CrudRepository<Question,Long> {

}
