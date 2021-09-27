package com.company;

public class Main {

    public static void main(String[] args) {
        Account account1 = new Account("disilence_");

        Follower follower1 = new Follower("mahoyynna", account1);
        Follower follower2 = new Follower("ohmynoooo", account1);

        account1.addObserver(follower1);
        account1.addObserver(follower2);

        System.out.println("\n****************************************\n");

        Post p1 = new Post("smth", "simp", "Pictures/picture.png");

        account1.publishPost(p1);

        System.out.println("\n****************************************\n");

        Account account2 = new Account("dinalando");

        Follower follower3 = new Follower(account1.toString(), account2);
        Follower follower4 = new Follower(follower2.toString(), account2);

        account2.addObserver(follower3);
        account2.addObserver(follower4);

        System.out.println("\n****************************************\n");

        Post p2 = new Post("smth", "random collection", "Pictures/randomPhoto.png");


        account2.publishPost(p2);
    }
}
