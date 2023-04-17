package unit11;

import java.lang.reflect.Member;
// 2021 FRQ #3
// https://apcentral.collegeboard.org/media/pdf/ap21-frq-computer-science-a.pdf#page=10
import java.util.ArrayList;
import java.util.Arrays;

class MemberInfo {
    private String name;
    private int gradYear;
    private boolean hasGoodStanding;

    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    public String getName() {
        return this.name;
    }

    public int getGradYear() {
        return this.gradYear;
    }

    public boolean inGoodStanding() {
        return hasGoodStanding;
    }

}

public class ClubMembers {

    private ArrayList<MemberInfo> members;

    public ClubMembers(ArrayList<MemberInfo> members) {
        this.members = members;
    }

    public ClubMembers() {
        this(new ArrayList<MemberInfo>());
    }

    public void addMembers(String[] names, int gradYear) {
      memberList = new memberList;
      
       for ( int i=0; i< memberList.size();i++){
            
        MemberInfo newMember = new MemberInfo(names, gradYear, true) {
            
        };
        memberList.add(newMember) 


                
            }
       }
      

    

    public ArrayList<MemberInfo> removeMembers(int year) {
        // TODO b;
        ArrayList<MemberInfo> removing = new ArrayList<MemberInfo>();{
            for (int i=memberList.length(); i >= 0; i--){
                if (memberList.get(i).getGradYear(); gradYear <= 2018){
                   if (memberList.get(i).inGoodStanding()== true) 
                        removing.add(memberList.get(i);
                }
              //  return removing;

            } 
                
                    
        }
        return null; // replace me
    }

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {
        MemberInfo[] folks = {
                new MemberInfo(
                        "SMITH, JANE",
                        2019,
                        false),
                new MemberInfo(
                        "FOX, STEVE",
                        2018,
                        true),
                new MemberInfo(
                        "XIN, MICHAEL",
                        2017,
                        false),
                new MemberInfo(
                        "GARCIA, MARIA",
                        2020,
                        true)
        };

        ClubMembers cm = new ClubMembers(new ArrayList<MemberInfo>(Arrays.asList(folks)));
        ArrayList<MemberInfo> returned = cm.removeMembers(2018);
        check(returned.size() == 1);
        check(returned.get(0) == folks[1]);
        check(cm.members.size() == 2);
        check(cm.members.contains(folks[0]));
        check(cm.members.contains(folks[3]));
        System.out.println("Happy Panda! \uD83D\uDC3C");

    }
}