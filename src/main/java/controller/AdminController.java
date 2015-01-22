package controller;

import entity.Person;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: daniel.baker
 * Date: 1/19/15
 * Time: 2:02 PM
 */
@RestController
public class AdminController {

    @RequestMapping("/main")
    public List<Person> index() {
        List<Person> people = new ArrayList<Person>();

        Person person1 = new Person();
        person1.setFirstName("Dan");
        person1.setLastName("Baker");
        person1.setAge(27);
        people.add(person1);

        Person person2 = new Person();
        person2.setFirstName("Kaylee");
        person2.setLastName("Baker");
        person2.setAge(0);
        people.add(person2);

        return people;
    }
}
