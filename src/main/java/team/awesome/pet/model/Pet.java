package team.awesome.pet.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pet")
public class Pet {

  // TODO: Have to add in the correct field for Pet
  // private BigInteger petId instead of int petId
	@Id
	@Column(name = "pet_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int petId;
	@Column(name = "pet_name")
	private String name;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User owner;
	@ManyToOne
	@JoinColumn(name = "tc_id")
	private PetType petType;
	@ManyToOne
	@JoinColumn(name = "shelter_id")
	private Shelter shelter;
	@Column(name = "pet_length")
	private double petLength;
	@Column(name = "pet_weight")
	private double petWeight;
	@Column(name = "pet_color")
	private String petColor;
	@Column(name = "health_status")
	private int healthStatus;
	@Column(name = "pet_location")
	private String currentLocation;

	public Pet() {}

	public Pet(int petId, String name, User owner, PetType petType, Shelter shelter, double petLength, double petWeight,
			String petColor, int healthStatus, String currentLocation) {
		super();
		this.petId = petId;
		this.name = name;
		this.owner = owner;
		this.petType = petType;
		this.shelter = shelter;
		this.petLength = petLength;
		this.petWeight = petWeight;
		this.petColor = petColor;
		this.healthStatus = healthStatus;
		this.currentLocation = currentLocation;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public Shelter getShelter() {
		return shelter;
	}

	public void setShelter(Shelter shelter) {
		this.shelter = shelter;
	}

	public double getPetLength() {
		return petLength;
	}

	public void setPetLength(double petLength) {
		this.petLength = petLength;
	}

	public double getPetWeight() {
		return petWeight;
	}

	public void setPetWeight(double petWeight) {
		this.petWeight = petWeight;
	}

	public String getPetColor() {
		return petColor;
	}

	public void setPetColor(String petColor) {
		this.petColor = petColor;
	}

	public int getHealthStatus() {
		return healthStatus;
	}

	public void setHealthStatus(int healthStatus) {
		this.healthStatus = healthStatus;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

}
