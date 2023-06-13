package lesson08.problem03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MarketingList {
    private ArrayList<Marketing> list;

    MarketingList() {
        list = new ArrayList<>();
    }

    public ArrayList<Marketing> getList() {
        return list;
    }

    public void setList(ArrayList<Marketing> list) {
        this.list = list;
    }

    public boolean add(Marketing item) {
        return list.add(item);
    }

    public boolean remove(Marketing item) {
        return list.remove(item);
    }

    public int size() {
        return this.list.size();
    }

    public void sort() {
        list.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing m1, Marketing m2) {
                return Double.compare(m1.getSalesAmount(), m2.getSalesAmount());
            }
        });
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < size() - 1; i++) {
            str += "\n\t" + list.get(i) + ",";
        }
        return "[" + str + "\n\t" + list.get(size() - 1) + "\n]";
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> filteredList = new ArrayList<>();
        for (Marketing m : list) {
            if (m.getSalesAmount() > 1000) filteredList.add(m);
        }
        return filteredList;
    }

    public static void printMarketing(List<Marketing> list){
        for (Marketing m : list) {
            System.out.println(m);
        }
    }

    public static void main(String[] args) {

        MarketingList marketingList = new MarketingList();
        Marketing m1 = new Marketing("Alex", "Napa", 500.0);
        Marketing m2 = new Marketing("Tailor", "Ace", 1450.0);
        Marketing m3 = new Marketing("Mark", "Paracetamol", 1650.0);
        Marketing m4 = new Marketing("Steve", "Tylenol", 2000.0);
        Marketing m5 = new Marketing("Ricky", "Reset", 200.0);

        marketingList.add(m1);
        marketingList.add(m2);
        marketingList.add(m3);
        marketingList.add(m4);
        marketingList.add(m5);

        System.out.println("Marketing list (initial): ");
        printMarketing(marketingList.getList());
        System.out.println("The size of the list (initial): " + marketingList.size());

        marketingList.remove(m3);
        System.out.println("\nMarketing list (after removing): ");
        printMarketing(marketingList.getList());
        System.out.println("The size of the list (after removing): " + marketingList.size());

        System.out.println("\nMarketing list (after applying overridden method for toString()): ");
        System.out.println(marketingList);


        marketingList.sort();
        System.out.println("\nMarketing list (after sorting by sales amount): ");
        printMarketing(marketingList.getList());


        List<Marketing> filteredMarketing = listMoreThan1000(marketingList.getList());
        filteredMarketing.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing m1, Marketing m2) {
                return m1.getEmployeeName().compareTo(m2.getEmployeeName());
            }
        });

        System.out.println("\nMarketing list (after filtering by more than 1000 & sorting by employee name): ");
        printMarketing(filteredMarketing);
    }
}
