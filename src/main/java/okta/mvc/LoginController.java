package okta.mvc;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.saml.metadata.MetadataManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@Autowired
	MetadataManager mm;

	@RequestMapping("/login")
	public String login(Map<String,Object> model) {
		Set<String> idps = mm.getIDPEntityNames();
		model.put("idps", idps);
		return "login";
	}
}
