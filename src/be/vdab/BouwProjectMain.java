package be.vdab;
public class BouwProjectMain {
    public static void main(String[] args) {
        BouwProject project = new BouwProject();
        project.add(new Arbeidskost(25,1000));
        project.add(new Grondstofkost(0.20,20000));
        BouwProject subproject = new BouwProject();
        subproject.add(new Arbeidskost(30,350));
        subproject.add(new Grondstofkost(0.50, 30000));
        BouwProject subsubproject = new BouwProject();
        subsubproject.add(new Arbeidskost(40,150));
        subsubproject.add(new Grondstofkost(1.26, 5000));
        subproject.add(subsubproject);
        project.add(subproject);
        System.out.println(project.getKost());
    }
    
}
