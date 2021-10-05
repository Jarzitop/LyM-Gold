// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/CopySubSet.gold"
import gold.structures.automaton.*;
import gold.util.*;
import gold.visualization.automaton.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class CopySubSet {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=15;
      GAutomataFrame.show($cast(gold.structures.automaton.IAutomaton.class,CopySubSet.createAutomaton()));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CopySubSet.class,"main",$line);
    }
  }
  public static IPushdownAutomaton createAutomaton() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=18;
      Object \u03A3=$fix($opIntvlY('a','b'));
      $line=20;
      Object Q=$fix(GCollections.asSet('I','F','M'));
      $line=22;
      Object \u0393=$fix(GCollections.asSet('0','1'));
      $line=23;
      Object q_0=$fix('I');
      $line=24;
      Object F=$fix(GCollections.asSet('F'));
      $line=25;
      Object M=$fix($invokeConstructor(GPushdownAutomaton.class,new Object[]{Q,\u03A3,\u0393,q_0,F}));
      $line=28;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta('I','I',$cast(java.lang.String.class,'a')),new Object[]{"0"});
      $line=29;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta('I','M',$cast(java.lang.String.class,'b')),new Object[]{});
      $line=30;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta('M','M',$cast(java.lang.String.class,'a')),new Object[]{"0"});
      $line=31;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta('M','M',$cast(java.lang.String.class,'a')),new Object[]{"1"});
      $line=32;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta('M','F',$cast(java.lang.String.class,'b')),new Object[]{});
      $line=34;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta('F','F',$cast(java.lang.String.class,'a')),new Object[]{"1"});
      $line=35;
      $result=M;
      if (true) break $try;
      $line=36;
      $rethrow(new RuntimeException("The function \"createAutomaton()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CopySubSet.class,"createAutomaton",$line);
    }
    return $cast(IPushdownAutomaton.class,$result);
  }
}