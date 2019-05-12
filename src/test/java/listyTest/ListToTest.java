package listyTest;

import listy.VistulaList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListToTest {
    @Test
    public void listTest(){
        List<String>imiona=new ArrayList<>();
        imiona.add("Jerzy");
        //assert names.size()==1;

       // assert names.get(0).equals("Jerzy");

        imiona.remove(0);
      //  assert names.size()==0;

       // assert names.contains("Jerzy")==false;

        assert imiona.isEmpty()==true;
    }
    @Test

        public void setterTest ()   {
        List<String> nextList = new ArrayList<>();
        nextList.add("John");
        nextList.add("Anna");

        VistulaList obiekt = new VistulaList();
        obiekt.setNames(nextList);
        assert obiekt.getNames().size()==2;
        //
    }
}
