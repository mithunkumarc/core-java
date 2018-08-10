package csv;

import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Test {
	public static void main(String[] args) {
		try {
			
			CSVFormat format = CSVFormat.RFC4180.withHeader().withDelimiter(',');
			
			//initialize the CSVParser object
			CSVParser parser = new CSVParser(new FileReader("matches.csv"), format);
			
			
			List<Matches> matchesList = new ArrayList<>();
			for(CSVRecord record : parser){
				//System.out.println("hello");
				Matches matches =
						new Matches(record.get("MATCH_ID"), record.get("SEASON"), record.get("CITY"), LocalDate.parse(record.get("DATE")), record.get("TEAM1"), record.get("TEAM2"), record.get("TOSS_WINNER"), record.get("TOSS_DECISION"), record.get("RESULT"), record.get("WINNER"));
				matchesList.add(matches);				
			}
						
			List<Matches> winnersList = matchesList.stream()
					.filter(match -> match.getSEASON().equals("2016") || match.getSEASON().equals("2017"))
					.filter(match -> match.getTOSS_DECISION().equals("field"))
					.filter(match -> match.getTOSS_WINNER().equals(match.getWINNER()))
					.collect(Collectors.toList());
			System.out.println(winnersList.size());
			
			
			//listing winning teams in 2016 and 2017 selecting field first after winning toss
			
		}catch(Exception ne) {
			System.out.println("error...");
		}
		
	}
}
