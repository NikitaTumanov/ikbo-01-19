package ru.mirea.pract07;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	System.out.println("Вариант задания: 2");
        LinkedList<String> teams = new LinkedList<String>();
        teams.add("Спартак");
        teams.add("Зенит");
        teams.addLast("Локомотив");
        teams.addFirst("ЦСКА");
        teams.add(1, "Динамо");
        System.out.printf("В списке присутствует %d команд \n", teams.size());
        System.out.println("\n"+teams.get(1)+"\n");
        teams.set(1, "Барселона");
        System.out.println("Список команд:");
        for(String team : teams){
            System.out.println(team);
        }
        if(teams.contains("Барселона")){
            System.out.println("\n"+"В списке команд присутствует Барселона"+"\n");
        }
        teams.remove("Барселона");
        if(teams.contains("Барселона")){
            System.out.println("\n"+"В списке команд присутствует Барселона"+"\n");
        }
        teams.removeFirst();
        teams.removeLast();
        System.out.println("Обновденный писок команд:");
        for(String team : teams){
            System.out.println(team);
        }

        LinkedList<Player> players = new LinkedList<Player>();
        players.add(new Player("Артем Дзюба"));
        players.addFirst(new Player("Роман Павлюченко"));
        players.addLast(new Player("Игорь Акинфеев"));
        System.out.println("\n"+"Список игроков:");
        for(Player player : players) {
            System.out.println(player.getName());
        }
        players.remove(1);
        System.out.println("\n"+"Обновленный список игроков:");
        for(Player player : players) {
            System.out.println(player.getName());
        }
        Player first = players.getFirst();
        System.out.println("\n"+"Имя первого игрока:"+first.getName());
    }
}
