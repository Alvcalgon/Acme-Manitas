
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.SafeHtml;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Customisation extends DomainEntity {

	// Constructors

	public Customisation() {
		super();
	}


	// Atributes

	private String	systemName;
	private String	banner;
	private String	welcomeMessageEn;
	private String	welcomeMessageSp;
	private double	VAT;
	private String	countryCode;
	private String	creditCardMakes;
	private int		timeCachedFinderResults;
	private int		maxFinderResults;
	private String	spamWords;
	private String	positiveWords;
	private String	negativeWords;


	@NotBlank
	@SafeHtml
	public String getSystemName() {
		return this.systemName;
	}

	public void setSystemName(final String systemName) {
		this.systemName = systemName;
	}

	@URL
	@NotBlank
	public String getBanner() {
		return this.banner;
	}

	public void setBanner(final String banner) {
		this.banner = banner;
	}

	@NotBlank
	@SafeHtml
	public String getWelcomeMessageEn() {
		return this.welcomeMessageEn;
	}

	public void setWelcomeMessageEn(final String welcomeMessageEn) {
		this.welcomeMessageEn = welcomeMessageEn;
	}

	@NotBlank
	@SafeHtml
	public String getWelcomeMessageSp() {
		return this.welcomeMessageSp;
	}

	public void setWelcomeMessageSp(final String welcomeMessageSp) {
		this.welcomeMessageSp = welcomeMessageSp;
	}

	@Digits(integer = 3, fraction = 2)
	@Range(min = 0, max = 1)
	public double getVAT() {
		return this.VAT;
	}

	public void setVAT(final double vAT) {
		this.VAT = vAT;
	}

	@Pattern(regexp = "\\+\\d+")
	@NotBlank
	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(final String countryCode) {
		this.countryCode = countryCode;
	}

	@NotEmpty
	@NotNull
	@SafeHtml
	public String getCreditCardMakes() {
		return this.creditCardMakes;
	}

	public void setCreditCardMakes(final String creditCardMakes) {
		this.creditCardMakes = creditCardMakes;
	}

	@Range(min = 1, max = 24)
	public int getTimeCachedFinderResults() {
		return this.timeCachedFinderResults;
	}

	public void setTimeCachedFinderResults(final int timeCachedFinderResults) {
		this.timeCachedFinderResults = timeCachedFinderResults;
	}

	@Range(min = 0, max = 100)
	public int getMaxFinderResults() {
		return this.maxFinderResults;
	}

	public void setMaxFinderResults(final int maxFinderResults) {
		this.maxFinderResults = maxFinderResults;
	}

	@NotNull
	@SafeHtml
	public String getSpamWords() {
		return this.spamWords;
	}

	public void setSpamWords(final String spamWords) {
		this.spamWords = spamWords;
	}

	@NotNull
	@SafeHtml
	public String getPositiveWords() {
		return this.positiveWords;
	}

	public void setPositiveWords(final String positiveWords) {
		this.positiveWords = positiveWords;
	}

	@NotNull
	@SafeHtml
	public String getNegativeWords() {
		return this.negativeWords;
	}

	public void setNegativeWords(final String negativeWords) {
		this.negativeWords = negativeWords;
	}
}
