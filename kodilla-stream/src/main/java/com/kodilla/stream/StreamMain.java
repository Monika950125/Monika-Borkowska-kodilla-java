package com.kodilla.stream;

import com.kodilla.stream.array.ArrayOperations;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.World;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
//        World world = new World();
//        System.out.println(world.getPeopleQuantity());

//        Forum forum = new Forum();
//        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
//                .filter(forumUser -> forumUser.getSex() == 'M')
//                .filter(forumUser -> LocalDate.now().getYear() - forumUser.getBirthDate().getYear() >= 20)
//                .filter(forumUser -> forumUser.getQuantityOfPublishedPosts() >= 1)
//                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));
//
//        theResultMapOfUsers.entrySet().stream()
//                .map(entry -> entry.getKey() + ":" + entry.getValue())
//                .forEach(System.out::println);
//
//        int[] exampleNumbers = {2, 15, 12, 5, 8, 7, 17, 63, 48, 19, 64, 3, 35, 48, 75, 29, 4, 55, 11, 41};
//        ArrayOperations.getAverage(exampleNumbers);
    }
}
