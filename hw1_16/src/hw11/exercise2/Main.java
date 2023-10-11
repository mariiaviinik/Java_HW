package hw11.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Participant human = new Human(10, 2);
        Participant cat = new Cat(6, 7);
        Participant robot = new Robot(2, 10);

        List<Participant> participants = new ArrayList<>(Arrays.asList(human, cat, robot));
        Iterator<Participant> participantIterator = participants.iterator();

        Barrier treadmill = new Treadmill(5);
        Barrier wall = new Wall(3);

        List<Barrier> barriers = new ArrayList<>(Arrays.asList(treadmill, wall));

        while (participantIterator.hasNext()) {
            Participant participant = participantIterator.next();
            for (int i = 0; i < barriers.size(); i++) {
                Barrier currentBarrier = barriers.get(i);
                int participantPower = 0;

                switch (currentBarrier.getClass().getSimpleName()) {
                    case "Wall":
                        participantPower = participant.getJumpLimit();
                        break;
                    case "Treadmill":
                        participantPower = participant.getRunLimit();
                        break;
                }
                if (participantPower >= currentBarrier.getPower()) {
                    barriers.get(i).overcome(participant);
                } else {
                    currentBarrier.lose(participant, participantPower);
                    break;
                }
            }
        }
    }
}
