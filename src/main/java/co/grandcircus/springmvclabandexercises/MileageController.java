package co.grandcircus.springmvclabandexercises;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MileageController {
	
	@RequestMapping("/")
	public ModelAndView showIndex() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/mileage-form")
	public ModelAndView showMileageForm() {
		return new ModelAndView("mileage-form");
	}
	
	@RequestMapping("/mileage-result")
	public ModelAndView showMileageResult(
			@RequestParam("mpg") int mpg,
			@RequestParam("gallons") int gallons
			) {
		
		int result = mpg + gallons;
		
		ModelAndView mav = new ModelAndView("mileage-result");
		mav.addObject("mpg", mpg);
		mav.addObject("gallons", gallons);
		mav.addObject("result", result);
		
		return mav;
	}
	
	@RequestMapping("/adding-form")
	public ModelAndView showAddingForm() {
		return new ModelAndView("adding-form");
	}
	
	@RequestMapping("/adding-result")
	public ModelAndView showAddingResult(
			@RequestParam("num1") int num1,
			@RequestParam("num2") int num2
			) {
		int result = num1 + num2;
		
		ModelAndView mav = new ModelAndView("adding-result");
		mav.addObject("num1", num1);
		mav.addObject("num2", num2);
		mav.addObject("result", result);
		
		return mav;
		}
	
	
	
	
}//class
