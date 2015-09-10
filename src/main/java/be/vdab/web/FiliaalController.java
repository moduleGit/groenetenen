package be.vdab.web;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import be.vdab.services.FiliaalService;

@Controller
@RequestMapping("/filialen")
class FiliaalController {
	private static final String FILIALEN_VIEW = "filialen/filialen";
	private static final String TOEVOEGEN_VIEW = "filialen/toevoegen";
	private static final String REDIRECT_URL_NA_TOEVOEGEN = "redirect:/filialen";
	private static final Logger logger = Logger
			.getLogger(FiliaalController.class.getName());

	@RequestMapping(method = RequestMethod.POST)
	String create() {
		// later voeg je een record toe aan de database
		logger.info("filiaal record toevoegen aan database");
		return REDIRECT_URL_NA_TOEVOEGEN;
	}

	@RequestMapping(method = RequestMethod.GET)
	String findAll() {
		return FILIALEN_VIEW;
	}

	@RequestMapping(value = "toevoegen", method = RequestMethod.GET)
	String createForm() {
		return TOEVOEGEN_VIEW;
	}

	private final FiliaalService filiaalService;
	@Autowired
	FiliaalController(FiliaalService filiaalService) {
		// Spring injecteert de parameter filiaalService met de bean die de
		// interface
		// FiliaalService implementeert: FiliaalServiceImpl
		this.filiaalService = filiaalService;
	}
}
