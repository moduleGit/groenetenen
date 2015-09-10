package be.vdab.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class WerknemerController {
	private static final String WERKNEMERS_VIEW = "werknemers/werknemers";

	@RequestMapping(method = RequestMethod.GET)
	String findAll() {
		return WERKNEMERS_VIEW;
	}
}
