package application;

import entities.Comment;
import entities.Post;

import java.time.Instant;

public class Program {
    public static void main(String[] args) {
        Post post_one = new Post(Instant.now(), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
        post_one.addComment(new Comment("Have a nice trip!"));
        post_one.addComment(new Comment("Wow that's awesome!"));

        Post post_two = new Post(Instant.now(), "Good night guys", "See you tomorrow", 5);
        post_two.addComment(new Comment("Good night"));
        post_two.addComment(new Comment("May the Force be with you"));

        System.out.println(post_one);
        System.out.println(post_two);
    }
}
