import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileReader {
	/**
	 * This method accesses the CSV file countries_name.csv to access all the names
	 * of the countries and adds it to the ArrayList countries. Parameter is a type
	 * of ListAccessor
	 * 
	 * @param countryList
	 */
	public void addCountries(ListAccessor countryList) {
		String countriesPath = /*"Path Goes here"*/;
		String str = "";
		{

			try {
				BufferedReader br = new BufferedReader(new FileReader(countriesPath));
				int countryIndex = 0;
				while (((str = br.readLine()) != null) && countryIndex <= 193) {

					String[] nameOfCountries = str.split(",");
					for (int x = 0; x < 193; x++) {
						countryList.getCountries().add(nameOfCountries[x]);

					}
				}
			} catch (FileNotFoundException fe) {
				System.out.println("error"+ fe.toString());;
			} catch (IOException ioe) {
				System.out.println("error"+ioe.toString());
			}
		}
	}

	/**
	 * This method accesses the CSV file CountryFlagAddress.csv to access all the
	 * names of the addresses of the flag images and adds it to the ArrayList
	 * flagAddresses. Parameter is a type of ListAccessor
	 * 
	 * @param
	 */
	public void addFlagAddress(ListAccessor flagslist) {
		String flagspath = /*"Path Goes here"*/;
		String flags = "";

		try {
			BufferedReader br = new BufferedReader(new FileReader(flagspath));
			int flagIndex = 0;
			while (((flags = br.readLine()) != null) && flagIndex <= 193) {

				String[] flagAddresses = flags.split(",");
				for (int x = 0; x < 193; x++) {
					flagslist.getFlagAddress().add(flagAddresses[x]);
				}
			}

		} catch (FileNotFoundException feFlag) {
			feFlag.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
