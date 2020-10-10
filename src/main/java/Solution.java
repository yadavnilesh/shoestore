import java.util.*;

public class Solution {
    public static class PlayerStatisticsCollectorImpl implements PlayerStatisticsCollector {
        HashMap<String,Integer> totalRuns=new HashMap<String,Integer>();
        HashMap<String,Integer> totalInnings= new HashMap<String,Integer>();
        @Override
        public void putNewInnings(String player, int runs){
        	if(totalRuns.containsKey(player))
        	{
        		int previousRuns=totalRuns.get(player);
        		totalRuns.put(player,previousRuns+runs);
        		int previousInnings=totalInnings.get(player);
            	totalInnings.put(player, 1+previousInnings);
        	}
        	else
        	{
        		totalRuns.put(player,runs);
            	totalInnings.put(player, 1);
        	}
   		
        }

        @Override
        public double getAverageRuns(String player){
			return (double)totalRuns.get(player)/totalInnings.get(player);
        }

        @Override
        public int getInningsCount(String player){
			return totalInnings.get(player);
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface PlayerStatisticsCollector {
        // This is an input. Make note of this player inning.  Runs is a non negative integer.
        void putNewInnings(String player, int runs);

        // Get the runs average(mathematical average) for a player
        double getAverageRuns(String player);

        // Get the total number of innings for the player
        int getInningsCount(String player);
    }

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final PlayerStatisticsCollector stats = new PlayerStatisticsCollectorImpl();
            final Set<String> players = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String player = tokens[0];
                players.add(player);
                final int runs = Integer.parseInt(tokens[1]);

                stats.putNewInnings(player, runs);

            }

            for (String player : players) {
                System.out.println(
                        String.format("%s %.4f %d", player, stats.getAverageRuns(player), stats.getInningsCount(player)));
            }

        }
        scanner.close();

    }
}
