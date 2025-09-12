import java.util.Arrays;
import java.util.stream.Stream;
import java.util.*;
import javax.swing.plaf.synth.SynthSplitPaneUI;



public class StreamAPI {
    public static void main(String[] args) {
        

        List<Integer> list=Arrays.asList(2,4,5,6,3,8,9,7);

        Stream<Integer> streamData=list.stream();

        Stream<Integer> filData=streamData.filter(n->n%2==0);
        Stream<Integer> sortedStream=filData.sorted();
        Stream<Integer> mapStream=sortedStream.map(n->n*2);
        mapStream.forEach(n->System.out.println(n));

        // streamData.forEach(n->System.out.println(n));
    }
}
