
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Finder extends DomainEntity {

	// Constructor

	public Finder() {
		super();
	}


	// Attributes

	private String	keyword;
	private Double	startPrice;
	private Double	endPrice;
	private Date	startDate;
	private Date	endDate;
	private String	category;
	private String	warranty;
	private Date	lastUpdate;


	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(final String keyword) {
		this.keyword = keyword;
	}

	@Min(0)
	@Digits(integer = 9, fraction = 2)
	public Double getStartPrice() {
		return this.startPrice;
	}

	public void setStartPrice(final Double startPrice) {
		this.startPrice = startPrice;
	}

	@Min(0)
	@Digits(integer = 9, fraction = 2)
	public Double getEndPrice() {
		return this.endPrice;
	}

	public void setEndPrice(final Double endPrice) {
		this.endPrice = endPrice;
	}

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(final String category) {
		this.category = category;
	}

	public String getWarranty() {
		return this.warranty;
	}

	public void setWarranty(final String warranty) {
		this.warranty = warranty;
	}
	@Past
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(final Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}


	// Relationships ----------------------------------------------------------
	private Collection<FixUpTask>	fixUpTasks;


	@NotNull
	@ManyToMany
	public Collection<FixUpTask> getFixUpTasks() {
		return this.fixUpTasks;
	}

	public void setFixUpTasks(final Collection<FixUpTask> fixUpTasks) {
		this.fixUpTasks = fixUpTasks;
	}
}
