package com.qpider.smswithspringmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.qpider.smswithspringmvc.pojo.StudentPOJO;
import com.qpider.smswithspringmvc.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(path = "/add_student", method = RequestMethod.GET)
	public String getPageToAddStudent() {
		return "add_student";
	}

	@RequestMapping(path = "/add_student", method = RequestMethod.POST)
	public String addStudent(@RequestParam String name, @RequestParam String email, @RequestParam long mobile,
			@RequestParam byte age, ModelMap modelMap) {
		studentService.addStudent(name, email, mobile, age);
		modelMap.addAttribute("message", "Student added.");
		return "add_student";
	}

	@RequestMapping(path = "/get_students", method = RequestMethod.GET)
	public String getAllStudent(ModelMap modelMap) {
		List<StudentPOJO> students = studentService.getAllStudents();
		modelMap.addAttribute("students", students);
		return "get_students";
	}

	@RequestMapping(path = "/delete_student", method = RequestMethod.GET)
	public String getPageToDeleteStudent(ModelMap modelMap) {
		List<StudentPOJO> students = studentService.getAllStudents();
		modelMap.addAttribute("students", students);
		return "delete_student";
	}

	@RequestMapping(path = "/delete_student", method = RequestMethod.POST)
	public String deleteStudent(@RequestParam long id, ModelMap modelMap) {
		String message = studentService.deleteStudent(id);
		modelMap.addAttribute("message", message);
		List<StudentPOJO> students = studentService.getAllStudents();
		modelMap.addAttribute("students", students);
		return "delete_student";
	}

	@RequestMapping(path = "edit_student", method = RequestMethod.GET)
	public String getPageToEditStudent(ModelMap modelMap) {
		List<StudentPOJO> students = studentService.getAllStudents();
		modelMap.addAttribute("students", students);
		return "edit_student";
	}

	@RequestMapping(path = "edit_student", method = RequestMethod.POST)
	public String editStudent(@RequestParam long id, ModelMap modelMap) {
		StudentPOJO student = studentService.editStudent(id);
		modelMap.addAttribute("student", student);
		return "update_student";
	}

	@RequestMapping(path = "update_student", method = RequestMethod.POST)
	public String updateStudent(@RequestParam long id, @RequestParam String name, @RequestParam String email,
			@RequestParam long mobile, @RequestParam byte age, ModelMap modelMap) {
		studentService.updateStudent(id, name, email, mobile, age);
		List<StudentPOJO> students = studentService.getAllStudents();
		modelMap.addAttribute("students", students);
		modelMap.addAttribute("message", "Student updated.");
		return "edit_student";
	}

}