import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class CountriesAddWithCVSFile {

	public static void main(String[] args) {
		ListAccessor listsGetter = new ListAccessor();
		// Adds all the country names to the ArrayList countries
		String countriesPath = "/Users/advaithtontalapur/Desktop/countries_names.csv";
		String str = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(countriesPath));
			int countryIndex = 0;
			while (((str = br.readLine()) != null) && countryIndex <= 193) {

				String[] nameOfCountries = str.split(",");
				for (int x = 0; x < 193; x++) {
					listsGetter.getCountries().add(nameOfCountries[x]);

				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Adds all the image address to the ArrayList flagAddress
		String flagspath = "/Users/advaithtontalapur/Desktop/CountryFlagAddress.csv";
		String flags = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(flagspath));
			int flagIndex = 0;
			while (((flags = br.readLine()) != null) && flagIndex <= 193) {

				String[] flagAddresses = flags.split(",");
				for (int x = 0; x < 193; x++) {
					listsGetter.getFlagAddress().add(flagAddresses[x]);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
