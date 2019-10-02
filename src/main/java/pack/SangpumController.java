package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SangpumController {
	@RequestMapping(value = "sangpum/{name}")
	public ModelAndView sangpum_glove(
			@RequestParam("su") String su,
			@RequestParam("dan") String dan,
			@PathVariable String name) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		
		int sum = Integer.parseInt(su)* Integer.parseInt(dan);
		String info = "<br>제품명 : " + name + "<br>수량 : " + su + "<br>단가 : " + dan + "<br>금액  : " + sum;
		
		modelAndView.addObject("msg", info);
		
		return modelAndView;
	}
}