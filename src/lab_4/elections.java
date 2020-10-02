package lab_4;

import java.util.*;

public class elections{

    private static final String VOTES =
            "Hilary,Sydnie Jernigan,Floryda\n" +
                    "Hilary,Meagan Fleming,Ohio\n" +
                    "Hilary,Denzil Samuelson,Nowy Jork\n" +
                    "Hilary,Noel Dyer,Arizona\n" +
                    "Donald,Ralf Darrell,Nowy Jork\n" +
                    "Donald,Kerr Norwood,Arizona\n" +
                    "Hilary,Desiree Morin,Nowy Jork\n" +
                    "Donald,Christa Jefferson,Ohio\n" +
                    "Donald,Avaline Romilly,Arizona\n" +
                    "Donald,Caelan Aylmer,Floryda\n" +
                    "Hilary,Kaydence Hepburn,Nowy Jork\n" +
                    "Hilary,Tobias Thorburn,Arizona\n" +
                    "Donald,Lester Royceston,Floryda\n" +
                    "Hilary,Hazel Mann,Nowy Jork\n" +
                    "Donald,Christa Jefferson,Ohio\n" +
                    "Hilary,Hilda Herman,Nowy Jork\n" +
                    "Hilary,Berenice Derrickson,Nowy Jork\n" +
                    "Hilary,Patsy Waters,Nowy Jork\n" +
                    "Hilary,Fran Elliott,Ohio\n" +
                    "Hilary,Denzil Samuelson,Nowy Jork\n" +
                    "Donald,Augusta Tasker,Nowy Jork\n" +
                    "Donald,Fox Sherburne,Arizona\n" +
                    "Donald,Christa Jefferson,Ohio\n" +
                    "Hilary,Desiree Morin,Nowy Jork\n" +
                    "Donald,Christa Jefferson,Ohio";

    public static void main(String[] args) {
        String[] VOTESsplit = VOTES.split("\n");
        HashSet<String> voters = new HashSet<>();
        voters.addAll(Arrays.asList(VOTESsplit));


        HashMap<String,HashMap<String , Integer>> states = new HashMap<>();
        for (String vote :
                voters) {

            String[] voteSplit = vote.split(",");
            String state = voteSplit[2];
            String candidate = voteSplit[0];

            if(states.containsKey(state)){
                HashMap<String , Integer> stateMap = states.get(state);
                if(stateMap.containsKey(candidate)) {
                    stateMap.put(candidate, stateMap.get(candidate) + 1);
                }
                else stateMap.put(candidate , 1);
            }
            else {
                HashMap<String , Integer> candidates = new HashMap<>();
                candidates.put(candidate , 1);
                states.put(state , candidates);
            }
        }

        HashMap<String , Integer> candidates = new HashMap<>();

        for (Map.Entry< String , HashMap<String , Integer>> entry : states.entrySet()) {
            String winner = null;
            int winnerVotes = Integer.MIN_VALUE;
            String State = entry.getKey();
            HashMap<String , Integer> Candidate = entry.getValue();

            for( Map.Entry<String , Integer> candidate : Candidate.entrySet()){
                String name = candidate.getKey();
                int amount = candidate.getValue();
                if( amount  > winnerVotes){
                    winnerVotes = amount;
                    winner = name;
                }
            }

            if(candidates.containsKey(winner))
                candidates.put(winner , candidates.get(winner) + 1);
            else candidates.put(winner , 1);
        }

        states.forEach((state , guys) ->{
            System.out.println(state);
            guys.forEach((candidate , amount) -> {
                System.out.println(candidate);
                System.out.println(amount);
            });
        });

        String winner = null;
        int votesForWinner = Integer.MIN_VALUE;


        for( Map.Entry<String , Integer> entry : candidates.entrySet()) {
            System.out.println("States for " + entry.getKey() + " " + entry.getValue());
            if (entry.getValue() > votesForWinner) {
                votesForWinner = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println("The winner is " + winner);

    }
}
