/* Name: jakob krabbe
 * course: cse174
 * instructor - Bishop-Clark
 * section - hc 
 * lab 3 
 * description - making a algorithm for miles to work time 
 */
public class Lab3 {
  public static void main(String args[]) {
    int initialMiles = 1160;
    int finMiles = 1260;
    int workMiles = 10;
    int workDays = 2;
    double totalMiles = finMiles - initialMiles;
    double totalWork = (workMiles * workDays) * 2;
    double totalPersonal = totalMiles - totalWork;
    double personPercent = (totalPersonal / totalMiles) * 100;
    double workPercent = (totalWork / totalMiles) * 100;
    
    System.out.print("The total time spent on personal driving time is ");
    System.out.print(totalPersonal);
    System.out.println("");
    System.out.println("The total percent of driving spent on both work and personal are: ");
    System.out.print("Personal: ");
    System.out.print(personPercent);
    System.out.println("");
    System.out.print("Work: ");
    System.out.print(workPercent);
  }
}
      