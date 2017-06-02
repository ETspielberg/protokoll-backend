package unidue.ub.services.protokollbackend;

import java.util.ArrayList;
import java.util.List;

import unidue.ub.media.monographs.Manifestation;

public class Protokoll {
	
	private String identifier;
	
	private String collection;
	
	private String materials;
	
	private boolean exact;
	
	private String mode;
	
	private List<Manifestation> manifestations =  new ArrayList<>();

	/**
	 * @return the identifier
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * @return the collection
	 */
	public String getCollection() {
		return collection;
	}

	/**
	 * @return the materials
	 */
	public String getMaterials() {
		return materials;
	}

	/**
	 * @return the exact
	 */
	public boolean isExact() {
		return exact;
	}

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @return the manifestations
	 */
	public List<Manifestation> getManifestations() {
		return manifestations;
	}

	/**
	 * @param identifier the identifier to set
	 */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	/**
	 * @param collection the collection to set
	 */
	public void setCollection(String collection) {
		this.collection = collection;
	}

	/**
	 * @param materials the materials to set
	 */
	public void setMaterials(String materials) {
		this.materials = materials;
	}

	/**
	 * @param exact the exact to set
	 */
	public void setExact(boolean exact) {
		this.exact = exact;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param manifestations the manifestations to set
	 */
	public void setManifestations(List<Manifestation> manifestations) {
		this.manifestations = manifestations;
	}
	
	
	public void addManifestation(Manifestation manifestation) {
		this.manifestations.add(manifestation);
	}
	
	public void addManifestation(List<Manifestation> manifestations) {
		this.manifestations.addAll(manifestations);
	}
}
