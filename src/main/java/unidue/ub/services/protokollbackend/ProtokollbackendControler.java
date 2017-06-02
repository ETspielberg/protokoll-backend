package unidue.ub.services.protokollbackend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import unidue.ub.media.monographs.Manifestation;

@Controller
@RefreshScope
@RequestMapping("/protokoll")
@CrossOrigin(origins="http://localhost")
public class ProtokollbackendControler {
	
	@RequestMapping(value="/search",
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE,
			headers = "Accept=application/json")
	public ResponseEntity<?> get(
			@RequestParam("identifier") String identifier, 
			@RequestParam("collection") String collection, 
			@RequestParam("materials") String materials,
			@RequestParam("exact") String exact,
			@RequestParam("mode") String mode) {
		Protokoll protokoll = new Protokoll();
		protokoll.setCollection(collection);
		protokoll.setExact("true".equals(exact.trim()));
		protokoll.setIdentifier(identifier.trim());
		protokoll.setMaterials(materials.trim());
		protokoll.setMode(mode.trim());
		
		List<Manifestation> manifestations = new ArrayList<Manifestation>();
		
		protokoll.addManifestation(manifestations);
		return ResponseEntity.ok(protokoll);
	}

}
