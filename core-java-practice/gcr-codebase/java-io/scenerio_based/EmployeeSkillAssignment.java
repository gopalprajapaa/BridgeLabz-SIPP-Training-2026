import java.util.*;

public class EmployeeSkillAssignment {

    static void findTeams(int[] skills,
                          int target,
                          int index,
                          List<Integer> team,
                          int sum) {

        if (sum == target) {
            System.out.println(team);
            return;
        }

        if (index == skills.length || sum > target)
            return;

        team.add(skills[index]);

        findTeams(skills,
                target,
                index + 1,
                team,
                sum + skills[index]);

        team.remove(team.size() - 1);

        findTeams(skills,
                target,
                index + 1,
                team,
                sum);
    }

    public static void main(String[] args) {

        int[] skills = {2,3,5,7};

        int target = 10;

        findTeams(skills,
                target,
                0,
                new ArrayList<>(),
                0);
    }
}
