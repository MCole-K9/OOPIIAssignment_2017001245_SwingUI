package OOPIIAssignment_2017001245;
//Matthew Cole - 2017001245
import java.awt.*;
import java.util.ArrayList;
import  java.util.List;


public  class  CPane {

    static class ContentP{

        private static List<Container> panes = new ArrayList<Container>();

        public static Container getLastPane(){

            return panes.get(panes.size() - 1);
        }

        public static void addPane(Container pane){

            panes.add(pane);
        }
    }
}
