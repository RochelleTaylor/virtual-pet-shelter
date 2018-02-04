package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	VirtualPet pet;

	Map<String, VirtualPet> petList = new HashMap<String, VirtualPet>();

	public void addVirtualPet(VirtualPet newPet) {
		petList.put(newPet.getName(), newPet);
	}

	public VirtualPetShelter() {
		addVirtualPetByName("Bob", " is blue ");

	}

	public void addVirtualPetByName(String name, String description) {
		pet = new VirtualPet(name, description);

		addVirtualPet(pet);
	}

	public VirtualPet getPetByName(String name) {
		return petList.get(name);
	}

	public Collection<VirtualPet> getAllPets() {
		return petList.values();
	}

	public void adoptPetByName(String name) {
		petList.remove(name);

	}

	public void feedAllPets() {
		for (VirtualPet pet : petList.values()) {
			pet.feed();
		}
	}

	public void waterAllPets() {
		for (VirtualPet pet : petList.values()) {
			pet.water();
		}
	}

	public void playWithAllPets() {
		for (VirtualPet pet : petList.values()) {
			pet.play();
		}

	}

	public void tickAllPets() {
		for (VirtualPet pet : petList.values()) {
			pet.tick();
		}

	}

	public void playWithAPet(String name) {
		petList.get(name).play();

	}
}
