
package services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import utilities.AbstractTest;
import domain.Customisation;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"classpath:spring/datasource.xml", "classpath:spring/config/packages.xml"
})
@Transactional
public class CustomisationServiceTest extends AbstractTest {

	// Services under testing --------------------------------
	@Autowired
	private CustomisationService	customisationService;


	// Test --------------------------------------------------

	@Test()
	public void testSave() {
		super.authenticate("admin1");

		String positiveWords;
		Customisation customisation, saved;

		customisation = this.customisationService.find();

		customisation.setTimeCachedFinderResults(2);
		customisation.setMaxFinderResults(20);
		customisation.setCountryCode("+40");

		positiveWords = customisation.getPositiveWords() + ",Obra maestra,Masterpiece";
		customisation.setPositiveWords(positiveWords);

		saved = this.customisationService.save(customisation);

		Assert.notNull(saved);

		super.unauthenticate();
	}

	@Test
	public void testFind() {
		Customisation customisation;

		customisation = this.customisationService.find();

		Assert.notNull(customisation);
	}

}
