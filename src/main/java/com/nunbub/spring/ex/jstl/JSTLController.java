package com.nunbub.spring.ex.jstl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nunbub.spring.ex.jstl.model.Book;

@Controller
@RequestMapping("/jstl")
public class JSTLController {

	@GetMapping("/ex01")
	public String jstlEx01() {
		
		return "jstl/ex01";
	}
	
	@GetMapping("/ex02")
	public String jstlEx02(Model model) {
		
		model.addAttribute("weight", 75);
		
		List<String> fruitList = new ArrayList<>();
		fruitList.add("사과");
		fruitList.add("딸기");
		fruitList.add("바나나");
		fruitList.add("수박");
		
		model.addAttribute("fruitList", fruitList);
		
		// List<Map>
		// 사용자 정보 Map
		List<Map<String, Object>> userList = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("name", "김인규");
		map.put("age", 28);
		map.put("hobby", "댄스");
		userList.add(map);
		
		map = new HashMap<>();
		map.put("name", "김바다");
		map.put("age", 3);
		map.put("hobby", "사냥하기");
		userList.add(map);
		
		model.addAttribute("userList", userList);
		
		// 책정보 리스트
		List<Book> bookList = new ArrayList<>();
		
		Book book = new Book();
		book.setTitle("아몬드");
		book.setAuthor("손원평");
		book.setPublisher("창비");
		bookList.add(book);
		
		book = new Book();
		book.setTitle("코스모스");
		book.setAuthor("칼 세이건");
		book.setPublisher("사이언스북스");
		bookList.add(book);
		
		model.addAttribute("books", bookList);
		
		return "jstl/ex02";
	}
	
	@GetMapping("/ex03")
	public String jstlEx03(Model model) {
		
		Date now = new Date();
		
		model.addAttribute("now", now);
		
		String dateString = "2022/08/12 18:18:20";
		model.addAttribute("dateString", dateString);
		
		return "jstl/ex03";
	}
	
}
