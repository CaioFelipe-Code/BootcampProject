import java.util.Comparator;
import java.util.List;

public class Ranking {
    public static void exibirRanking(List<Dev> devs) {
        devs.stream()
                .sorted(Comparator.comparingInt(Dev::getXpTotal).reversed())
                .forEach(dev -> System.out.println(dev.getNome() + ": " + dev.getXpTotal() + " XP"));
    }
}
