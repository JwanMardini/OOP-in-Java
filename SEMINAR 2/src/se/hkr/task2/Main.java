package se.hkr.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Member mem1 = new Member("Carl", Member.Role.MEMBER);
        Member mem2 = new Member("Anna", Member.Role.ADMINISTRATOR);
        Member mem3 = new Member("Paul", Member.Role.OWNER);
        Member mem4 = new Member("Rickard", Member.Role.COACH);

        ArrayList<Member> memberList = new ArrayList<Member>();
        memberList.add(mem1);
        memberList.add(mem2);
        memberList.add(mem3);
        memberList.add(mem4);

        for (Member member: memberList){
            System.out.println(member.getName() + ", " + member.getRole());
        }

    }
}
