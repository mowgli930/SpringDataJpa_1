package se.lemv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
ParkingSpace
	- id 		: Long   : not null
	- label 	: String : not null
 * @author leo
 */
@Entity
public final class ParkingSpot {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String label;
	
	protected ParkingSpot() {}
	
	public ParkingSpot(String label) {
//		this.parkingSpaceId = parkingSpaceId;
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
	}
}
