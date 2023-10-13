import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixtureGenerator {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        Collections.addAll(teams, "Galatasaray", "Bursaspor", "Fenerbahçe", "Beşiktaş", "Başakşehir", "Trabzonspor");

        // Eğer takım sayısı tekse, "Bay" takımını eklenir.
        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

        int numTeams = teams.size();
        int numRounds = numTeams - 1;

        for (int round = 1; round <= numRounds; round++) {
            System.out.println("Round " + round);
            for (int i = 0; i < numTeams / 2; i++) {
                String team1 = teams.get(i);
                String team2 = teams.get(numTeams - 1 - i);

                // Bay takımıyla eşleşen takımların maç durumu
                if (!team1.equals("Bay") && !team2.equals("Bay")) {
                    System.out.println(team1 + " vs " + team2);
                }
            }

            // Takımlar eşleştirilir.
            teams.add(1, teams.remove(teams.size() - 1));
        }
    }
}


