package com.example.myUIDemo.Controller;

import com.example.myUIDemo.DaoService.QuestionRepository;
import com.example.myUIDemo.ModelClass.Question;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author Anuj Kumar Vishwakarma(Zeref)
 * @Time 18/03/18 : 8:28 AM
 */

@RestController
public class QuestionController {

    private Logger logger = LoggerFactory.getLogger(QuestionController.class);

    @Autowired
    private QuestionRepository questionRepository;

    @RequestMapping("/")
    public String checkData(){
        return "Application is running";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ModelAndView getQuestion(){
        List<Question> allQuestions= (List<Question>) questionRepository.findAll();
        ModelAndView modelAndView=new ModelAndView("questions","questions",allQuestions);
        return modelAndView;
    }
}
