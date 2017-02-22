//package sample.data.jpa.web;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import sample.data.jpa.service.CityService;
//
//@Controller
//public class SampleDataJpaController {
//	@Autowired
//	CityService cityService;
//
//	@GetMapping("/City")
//	@ResponseBody
//	public String getCity() {
//		return cityService.getCity("Bath", "UK").getName();
//	}
//}
